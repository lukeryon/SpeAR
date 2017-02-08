package com.rockwellcollins.spear.translate.transformations;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import com.rockwellcollins.spear.translate.intermediate.PatternDocument;
import com.rockwellcollins.spear.translate.intermediate.SpearDocument;
import com.rockwellcollins.spear.translate.intermediate.TypeDocument;

public class PerformTransforms {

	public static Map<EObject,Map<String,String>> apply(SpearDocument doc) throws Exception {
		Map<EObject,Map<String,String>> renamed = RemoveLustreKeywords.transform(doc);
		ReplaceAbstractTypes.transform(doc);
		ReplaceVariableArrayDefs.transform(doc);
		PropagatePredicates.transform(doc); //must come after replace Variable array defs
		RemoveCompositeReferences.transform(doc);
		ReplaceShortHandRecords.transform(doc);
		NormalizeOperators.transform(doc);
		RemoveSugar.transform(doc);
		TransformObservers.transform(doc);
		ReplaceSpecificationCalls.transform(doc);
		UniquifyNormalizedCalls.transform(doc);
		return renamed;
	}
	
	public static Map<EObject,Map<String,String>> apply(PatternDocument doc) throws Exception {
		Map<EObject,Map<String,String>> renamed = RemoveLustreKeywords.transform(doc);
		ReplaceAbstractTypes.transform(doc);
		ReplaceVariableArrayDefs.transform(doc);
		//PropagatePredicates.transform(doc);
		ReplaceShortHandRecords.transform(doc);
		NormalizeOperators.transform(doc);
		RemoveSugar.transform(doc);
		return renamed;		
	}
	
	public static Map<EObject,Map<String,String>> apply(TypeDocument doc) throws Exception {
		Map<EObject,Map<String,String>> renamed = RemoveLustreKeywords.transform(doc);
		ReplaceAbstractTypes.transform(doc);
		ReplaceVariableArrayDefs.transform(doc);
		NormalizeOperators.transform(doc);
		RemoveSugar.transform(doc);
		return renamed;
	}
}
