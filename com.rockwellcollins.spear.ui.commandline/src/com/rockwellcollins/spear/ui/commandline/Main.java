/* generated by Xtext
 */
package com.rockwellcollins.spear.ui.commandline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.rockwellcollins.spear.File;
import com.rockwellcollins.spear.Import;
import com.rockwellcollins.spear.Specification;
import com.rockwellcollins.spear.preferences.PreferenceConstants;
import com.rockwellcollins.spear.preferences.Preferences;
import com.rockwellcollins.spear.translate.analysis.Analysis;
import com.rockwellcollins.spear.translate.analysis.Consistency;
import com.rockwellcollins.spear.translate.analysis.Entailment;
import com.rockwellcollins.spear.translate.analysis.Realizability;

import jkind.api.results.PropertyResult;

public class Main {

	public static void main(String[] args) throws Exception {
		Injector injector = new com.rockwellcollins.SpearStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		main.runGenerator(args);
	}

	@Inject
	private IResourceValidator validator;

	protected void runGenerator(String[] args) throws Exception {

		PreferenceStore s = Preferences.store;
		SpeARMainCommand main = new SpeARMainCommand();
		JCommander jcom = new JCommander(main);
		SpeARjKindCommandEntailment entailment = new SpeARjKindCommandEntailment();
		jcom.addCommand("entailment", entailment);
		SpeARjKindCommandConsistency consistency = new SpeARjKindCommandConsistency();
		jcom.addCommand("consistency", consistency);
		SpeARjRealizabilityCommand realizability = new SpeARjRealizabilityCommand();
		jcom.addCommand("realizability", realizability);
		jcom.setProgramName("java -jar spear.jar");

		try {
			jcom.parse(args);
			if (jcom.getParsedCommand() == null) {
				throw new ParameterException("A command must be given.");
			}
		} catch (ParameterException pe) {
			System.err.println(pe.getMessage());
			jcom.usage();
			return;
		}

		String command = jcom.getParsedCommand();
		List<java.io.File> specs = null;
		if (command == "entailment") {
			specs = entailment.spec;
		} else if (command == "consistency") {
			specs = consistency.spec;
		} else if (command == "realizability") {
			specs = realizability.spec;
		}

		if (specs.size() != 1) {
			System.err.println("Exactly one specification file required for all commands.");
			jcom.usage();
			return;
		}

		if (command == "entailment" || command == "consistency") {
			SpeARjKindCommand opts = null;
			if (command == "entailment") {
				opts = entailment;
				s.setValue(PreferenceConstants.PREF_SPEAR_ENABLE_IVC_ON_ENTAILMENT.toString(), entailment.ivc);
			} else if (command == "consistency") {
				opts = consistency;
				s.setValue(PreferenceConstants.PREF_SPEAR_CONSISTENCY_DEPTH.toString(),
						consistency.con_depth.intValue());
			} else {
				throw new RuntimeException("This should not happen: unknown command.");
			}
			s.setValue(PreferenceConstants.PREF_MODEL_CHECKER.toString(), opts.solver.toString());
			s.setValue(PreferenceConstants.PREF_BOUNDED_MODEL_CHECKING.toString(), opts.no_bmc);
			s.setValue(PreferenceConstants.PREF_K_INDUCTION.toString(), opts.no_k_induction);
			s.setValue(PreferenceConstants.PREF_INVARIANT_GENERATION.toString(), opts.no_inv_gen);
			/* s.setValue(PreferenceConstants.PREF_PDR_MAX, opts.pdr_max); */
			s.setValue(PreferenceConstants.PREF_INDUCTIVE_COUNTEREXAMPLES.toString(), opts.induct_cex);
			s.setValue(PreferenceConstants.PREF_SMOOTH_COUNTEREXAMPLES.toString(), opts.smooth);
			s.setValue(PreferenceConstants.PREF_DEPTH.toString(), opts.n.intValue());
			s.setValue(PreferenceConstants.PREF_TIMEOUT.toString(), opts.timeout.intValue());
			s.setValue(PreferenceConstants.PREF_SPEAR_PRINT_FINAL_LUSTRE.toString(), opts.lustre);
		} else if (command == "realizability") {
			SpeARjRealizabilityCommand opts = null;

			opts = realizability;
			s.setValue(PreferenceConstants.PREF_DEPTH.toString(), opts.n.intValue());
			s.setValue(PreferenceConstants.PREF_TIMEOUT.toString(), opts.timeout.intValue());
			s.setValue(PreferenceConstants.PREF_SPEAR_PRINT_FINAL_LUSTRE.toString(), opts.lustre);
		}

		java.io.File spec = specs.get(0);

		// ChaosApe: If an absolute path is not used calls to Utilities.getImportedFile may fail.
		Injector injector = new com.rockwellcollins.SpearStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createFileURI(spec.getAbsolutePath()), true);

		List<Issue> list = new LinkedList<Issue>();
		List<String> visited = new LinkedList<String>();

		validateRecursively(resourceSet, resource, list, visited);
		// ChaosApe: It seems to me we should not be receiving duplicate error messages
		// but I do not have time to investigate why this is happening.
		List<String> alreadyseen = new LinkedList<String>();
		boolean analysis = true;
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				if (alreadyseen.contains(issue.toString())) {
					continue;
				}
				if (issue.getSeverity() == Severity.ERROR) {
					analysis = false;
				}
				alreadyseen.add(issue.toString());
				System.err.println(issue);
			}
		}
		if (!analysis) {
			System.err.println("Errors during validation, " + command + " analysis not possible.");
			return;
		}

		String jkindjarstr = "jkind.jar";
		Path jkindjarpth = null;
		try {
			jkindjarpth = Files.createTempDirectory(null).resolve(jkindjarstr);
			Files.copy(getClass().getClassLoader().getResourceAsStream(jkindjarstr), jkindjarpth);
		} catch (IOException e1) {
			throw new RuntimeException("This should not happen: Problem exporting 'jkind.jar'.");
		}
		
		Specification specification = (Specification) resource.getContents().get(0);
		Analysis analyzer = null;
		if (command == "entailment") {
			try {
				analyzer = new Entailment(specification, jkindjarpth.toString());
			} catch (Exception e) {
				throw e;
			}

		} else if (command == "consistency") {
			try {
				analyzer = new Consistency(specification, jkindjarpth.toString());
			} catch (Exception e) {
				throw e;
			}
		} else if (command == "realizability") {
			try {
				analyzer = new Realizability(specification, jkindjarpth.toString());
			} catch (Exception e) {
				throw e;
			}
		} else {
			throw new RuntimeException("This should not happen: unknown command.");
		}
		analyzer.analyze(new NullProgressMonitor());
		for (PropertyResult pr : analyzer.getResult().getPropertyResults()) {
			System.out.println(pr.getProperty().getName() + ", " + pr.getStatus() + ", " + pr.getProperty().getRuntime());
		}
	}

	private void validateRecursively(XtextResourceSet resourceSet, Resource resource, List<Issue> list,
			List<String> visited) {
		if (visited.contains(resource.getURI().toString())) {
			return;
		}
		visited.add(resource.getURI().toString());
		if (resource.getContents().size() != 1) {

			for (org.eclipse.emf.ecore.resource.Resource.Diagnostic d : resource.getErrors()) {
				System.err.println("ERROR:" + d.getMessage() + ". (" + resource.getURI().toString() + " Line : "
						+ d.getLine() + " column : " + d.getColumn() + ")");
			}
			return;
		}
		for (Import relfilepath : ((File) resource.getContents().get(0)).getImports()) {
			Path path = Paths.get(resource.getURI().devicePath()).getParent().resolve(relfilepath.getImportURI());
			Resource r = null;
			try {
				r = resourceSet.getResource(URI.createFileURI(path.toString()), true);
			} catch (Exception e) {
				continue;
			}
			validateRecursively(resourceSet, r, list, visited);
		}
		List<Issue> extension = null;
		extension = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		list.addAll(extension);
	}
}
