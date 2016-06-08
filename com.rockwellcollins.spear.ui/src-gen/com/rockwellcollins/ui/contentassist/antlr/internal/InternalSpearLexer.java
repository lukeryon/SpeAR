package com.rockwellcollins.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpearLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalSpearLexer() {;} 
    public InternalSpearLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpearLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSpear.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:11:7: ( 'Assumptions' )
            // InternalSpear.g:11:9: 'Assumptions'
            {
            match("Assumptions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:12:7: ( 'Environment' )
            // InternalSpear.g:12:9: 'Environment'
            {
            match("Environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:13:7: ( 'DerivedRequirements' )
            // InternalSpear.g:13:9: 'DerivedRequirements'
            {
            match("DerivedRequirements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:14:7: ( 'Requirements' )
            // InternalSpear.g:14:9: 'Requirements'
            {
            match("Requirements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:15:7: ( 'Low-Level Requirements' )
            // InternalSpear.g:15:9: 'Low-Level Requirements'
            {
            match("Low-Level Requirements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:16:7: ( 'LLRs' )
            // InternalSpear.g:16:9: 'LLRs'
            {
            match("LLRs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:17:7: ( 'Implementation' )
            // InternalSpear.g:17:9: 'Implementation'
            {
            match("Implementation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:18:7: ( 'Design' )
            // InternalSpear.g:18:9: 'Design'
            {
            match("Design"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:19:7: ( 'Properties' )
            // InternalSpear.g:19:9: 'Properties'
            {
            match("Properties"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:20:7: ( 'Guarantees' )
            // InternalSpear.g:20:9: 'Guarantees'
            {
            match("Guarantees"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:21:7: ( 'High-level Requirements' )
            // InternalSpear.g:21:9: 'High-level Requirements'
            {
            match("High-level Requirements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:22:7: ( 'HLRs' )
            // InternalSpear.g:22:9: 'HLRs'
            {
            match("HLRs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:23:7: ( ':' )
            // InternalSpear.g:23:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:24:7: ( 'is a' )
            // InternalSpear.g:24:9: 'is a'
            {
            match("is a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:25:7: ( 'is an' )
            // InternalSpear.g:25:9: 'is an'
            {
            match("is an"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:26:7: ( '=>' )
            // InternalSpear.g:26:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:27:7: ( 'implies' )
            // InternalSpear.g:27:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:28:7: ( 'or' )
            // InternalSpear.g:28:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:29:7: ( 'xor' )
            // InternalSpear.g:29:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:30:7: ( 'T' )
            // InternalSpear.g:30:9: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:31:7: ( 'triggers' )
            // InternalSpear.g:31:9: 'triggers'
            {
            match("triggers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:32:7: ( 'S' )
            // InternalSpear.g:32:9: 'S'
            {
            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:33:7: ( 'since' )
            // InternalSpear.g:33:9: 'since'
            {
            match("since"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:34:7: ( 'O' )
            // InternalSpear.g:34:9: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:35:7: ( 'once' )
            // InternalSpear.g:35:9: 'once'
            {
            match("once"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:36:7: ( 'H' )
            // InternalSpear.g:36:9: 'H'
            {
            match('H'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:37:7: ( 'historically' )
            // InternalSpear.g:37:9: 'historically'
            {
            match("historically"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:38:7: ( 'never' )
            // InternalSpear.g:38:9: 'never'
            {
            match("never"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:39:7: ( 'before' )
            // InternalSpear.g:39:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:40:7: ( 'initially' )
            // InternalSpear.g:40:9: 'initially'
            {
            match("initially"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:41:7: ( '<' )
            // InternalSpear.g:41:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:42:7: ( '<=' )
            // InternalSpear.g:42:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:43:7: ( '>' )
            // InternalSpear.g:43:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:44:7: ( '>=' )
            // InternalSpear.g:44:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:45:7: ( '==' )
            // InternalSpear.g:45:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:46:7: ( '<>' )
            // InternalSpear.g:46:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:47:7: ( '+' )
            // InternalSpear.g:47:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:48:7: ( '-' )
            // InternalSpear.g:48:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:49:7: ( '*' )
            // InternalSpear.g:49:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:50:7: ( '/' )
            // InternalSpear.g:50:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:51:7: ( 'mod' )
            // InternalSpear.g:51:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:52:7: ( '->' )
            // InternalSpear.g:52:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:53:7: ( 'arrow' )
            // InternalSpear.g:53:9: 'arrow'
            {
            match("arrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:54:7: ( 'not' )
            // InternalSpear.g:54:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:55:7: ( 'TRUE' )
            // InternalSpear.g:55:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:56:7: ( 'true' )
            // InternalSpear.g:56:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:57:7: ( 'FALSE' )
            // InternalSpear.g:57:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:58:7: ( 'false' )
            // InternalSpear.g:58:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:59:7: ( 'Specification' )
            // InternalSpear.g:59:9: 'Specification'
            {
            match("Specification"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:60:7: ( 'Inputs:' )
            // InternalSpear.g:60:9: 'Inputs:'
            {
            match("Inputs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:61:7: ( 'Outputs:' )
            // InternalSpear.g:61:9: 'Outputs:'
            {
            match("Outputs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:62:7: ( 'Imports:' )
            // InternalSpear.g:62:9: 'Imports:'
            {
            match("Imports:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:63:7: ( 'Units:' )
            // InternalSpear.g:63:9: 'Units:'
            {
            match("Units:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:64:7: ( 'Types:' )
            // InternalSpear.g:64:9: 'Types:'
            {
            match("Types:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:65:7: ( 'Constants:' )
            // InternalSpear.g:65:9: 'Constants:'
            {
            match("Constants:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:66:7: ( 'Patterns:' )
            // InternalSpear.g:66:9: 'Patterns:'
            {
            match("Patterns:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:67:7: ( 'State:' )
            // InternalSpear.g:67:9: 'State:'
            {
            match("State:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:68:7: ( 'Macros:' )
            // InternalSpear.g:68:9: 'Macros:'
            {
            match("Macros:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:69:7: ( 'import' )
            // InternalSpear.g:69:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:70:7: ( 'Definitions' )
            // InternalSpear.g:70:9: 'Definitions'
            {
            match("Definitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:71:7: ( 'pattern' )
            // InternalSpear.g:71:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:72:7: ( '(' )
            // InternalSpear.g:72:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:73:7: ( ')' )
            // InternalSpear.g:73:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:74:7: ( 'returns' )
            // InternalSpear.g:74:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:75:7: ( 'let' )
            // InternalSpear.g:75:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:76:7: ( 'tel' )
            // InternalSpear.g:76:9: 'tel'
            {
            match("tel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:77:7: ( ',' )
            // InternalSpear.g:77:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:78:7: ( 'var' )
            // InternalSpear.g:78:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:79:7: ( '|' )
            // InternalSpear.g:79:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:80:7: ( '=' )
            // InternalSpear.g:80:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:81:7: ( '--%PROPERTY' )
            // InternalSpear.g:81:9: '--%PROPERTY'
            {
            match("--%PROPERTY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:82:7: ( 'assert' )
            // InternalSpear.g:82:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:83:7: ( 'record' )
            // InternalSpear.g:83:9: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:84:7: ( '{' )
            // InternalSpear.g:84:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:85:7: ( '}' )
            // InternalSpear.g:85:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:86:7: ( '[' )
            // InternalSpear.g:86:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:87:7: ( ']' )
            // InternalSpear.g:87:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:88:7: ( 'enum' )
            // InternalSpear.g:88:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:89:7: ( 'int' )
            // InternalSpear.g:89:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:90:7: ( 'bool' )
            // InternalSpear.g:90:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:91:7: ( 'real' )
            // InternalSpear.g:91:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:92:7: ( 'text' )
            // InternalSpear.g:92:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:93:7: ( 'while' )
            // InternalSpear.g:93:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:94:7: ( 'then' )
            // InternalSpear.g:94:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:95:7: ( 'after' )
            // InternalSpear.g:95:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:96:7: ( 'until' )
            // InternalSpear.g:96:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:97:7: ( 'less' )
            // InternalSpear.g:97:9: 'less'
            {
            match("less"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:98:7: ( 'than' )
            // InternalSpear.g:98:9: 'than'
            {
            match("than"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:99:7: ( 'equal' )
            // InternalSpear.g:99:9: 'equal'
            {
            match("equal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:100:8: ( 'to' )
            // InternalSpear.g:100:10: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:101:8: ( 'greater' )
            // InternalSpear.g:101:10: 'greater'
            {
            match("greater"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:102:8: ( 'previous' )
            // InternalSpear.g:102:10: 'previous'
            {
            match("previous"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:103:8: ( 'with' )
            // InternalSpear.g:103:10: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:104:8: ( 'initial' )
            // InternalSpear.g:104:10: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:105:8: ( 'value' )
            // InternalSpear.g:105:10: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:106:8: ( '.' )
            // InternalSpear.g:106:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:107:8: ( ':=' )
            // InternalSpear.g:107:10: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:108:8: ( 'if' )
            // InternalSpear.g:108:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:109:8: ( 'else' )
            // InternalSpear.g:109:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:110:8: ( 'new' )
            // InternalSpear.g:110:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:111:8: ( 'spec' )
            // InternalSpear.g:111:10: 'spec'
            {
            match("spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:112:8: ( '#' )
            // InternalSpear.g:112:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:113:8: ( 'and' )
            // InternalSpear.g:113:10: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:18141:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSpear.g:18141:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSpear.g:18141:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpear.g:18141:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSpear.g:18141:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpear.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:18143:10: ( ( '0' .. '9' )+ )
            // InternalSpear.g:18143:12: ( '0' .. '9' )+
            {
            // InternalSpear.g:18143:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSpear.g:18143:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:18145:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSpear.g:18145:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSpear.g:18145:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpear.g:18145:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSpear.g:18145:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSpear.g:18145:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpear.g:18145:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSpear.g:18145:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSpear.g:18145:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSpear.g:18145:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpear.g:18145:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:18147:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSpear.g:18147:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSpear.g:18147:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSpear.g:18147:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:18149:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSpear.g:18149:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSpear.g:18149:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSpear.g:18149:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSpear.g:18149:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpear.g:18149:41: ( '\\r' )? '\\n'
                    {
                    // InternalSpear.g:18149:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSpear.g:18149:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:18151:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSpear.g:18151:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSpear.g:18151:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSpear.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpear.g:18153:16: ( . )
            // InternalSpear.g:18153:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSpear.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=110;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSpear.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalSpear.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalSpear.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalSpear.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalSpear.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalSpear.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalSpear.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalSpear.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalSpear.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalSpear.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalSpear.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalSpear.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalSpear.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalSpear.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalSpear.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalSpear.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalSpear.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalSpear.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalSpear.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalSpear.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalSpear.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalSpear.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalSpear.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalSpear.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalSpear.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalSpear.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalSpear.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalSpear.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalSpear.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalSpear.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalSpear.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalSpear.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalSpear.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalSpear.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalSpear.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalSpear.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalSpear.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalSpear.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalSpear.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalSpear.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalSpear.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalSpear.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalSpear.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalSpear.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalSpear.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalSpear.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalSpear.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalSpear.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalSpear.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalSpear.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalSpear.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalSpear.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalSpear.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalSpear.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalSpear.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalSpear.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalSpear.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalSpear.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalSpear.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalSpear.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalSpear.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalSpear.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalSpear.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalSpear.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalSpear.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalSpear.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalSpear.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalSpear.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalSpear.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalSpear.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalSpear.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalSpear.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalSpear.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalSpear.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalSpear.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalSpear.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalSpear.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalSpear.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalSpear.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // InternalSpear.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // InternalSpear.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // InternalSpear.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // InternalSpear.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // InternalSpear.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // InternalSpear.g:1:514: T__95
                {
                mT__95(); 

                }
                break;
            case 86 :
                // InternalSpear.g:1:520: T__96
                {
                mT__96(); 

                }
                break;
            case 87 :
                // InternalSpear.g:1:526: T__97
                {
                mT__97(); 

                }
                break;
            case 88 :
                // InternalSpear.g:1:532: T__98
                {
                mT__98(); 

                }
                break;
            case 89 :
                // InternalSpear.g:1:538: T__99
                {
                mT__99(); 

                }
                break;
            case 90 :
                // InternalSpear.g:1:544: T__100
                {
                mT__100(); 

                }
                break;
            case 91 :
                // InternalSpear.g:1:551: T__101
                {
                mT__101(); 

                }
                break;
            case 92 :
                // InternalSpear.g:1:558: T__102
                {
                mT__102(); 

                }
                break;
            case 93 :
                // InternalSpear.g:1:565: T__103
                {
                mT__103(); 

                }
                break;
            case 94 :
                // InternalSpear.g:1:572: T__104
                {
                mT__104(); 

                }
                break;
            case 95 :
                // InternalSpear.g:1:579: T__105
                {
                mT__105(); 

                }
                break;
            case 96 :
                // InternalSpear.g:1:586: T__106
                {
                mT__106(); 

                }
                break;
            case 97 :
                // InternalSpear.g:1:593: T__107
                {
                mT__107(); 

                }
                break;
            case 98 :
                // InternalSpear.g:1:600: T__108
                {
                mT__108(); 

                }
                break;
            case 99 :
                // InternalSpear.g:1:607: T__109
                {
                mT__109(); 

                }
                break;
            case 100 :
                // InternalSpear.g:1:614: T__110
                {
                mT__110(); 

                }
                break;
            case 101 :
                // InternalSpear.g:1:621: T__111
                {
                mT__111(); 

                }
                break;
            case 102 :
                // InternalSpear.g:1:628: T__112
                {
                mT__112(); 

                }
                break;
            case 103 :
                // InternalSpear.g:1:635: T__113
                {
                mT__113(); 

                }
                break;
            case 104 :
                // InternalSpear.g:1:642: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 105 :
                // InternalSpear.g:1:650: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 106 :
                // InternalSpear.g:1:659: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 107 :
                // InternalSpear.g:1:671: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 108 :
                // InternalSpear.g:1:687: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 109 :
                // InternalSpear.g:1:703: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 110 :
                // InternalSpear.g:1:711: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\10\76\1\113\1\115\1\76\1\124\2\76\1\132\1\76\1\141\1\76\1\145\3\76\1\155\1\157\1\uffff\1\163\1\uffff\1\167\10\76\2\uffff\2\76\1\uffff\1\76\5\uffff\4\76\2\uffff\1\74\2\uffff\2\74\2\uffff\1\76\1\uffff\14\76\3\uffff\3\76\1\u00ae\3\uffff\1\u00af\4\76\1\uffff\3\76\1\u00ba\2\76\1\uffff\3\76\1\uffff\5\76\15\uffff\14\76\2\uffff\2\76\1\uffff\1\76\5\uffff\7\76\5\uffff\17\76\1\uffff\2\76\1\u00f4\2\uffff\1\76\1\u00f6\4\76\1\u00fb\3\76\1\uffff\7\76\1\u0106\1\u0107\2\76\1\u010a\3\76\1\u010e\12\76\1\u0119\1\76\1\u011b\16\76\1\uffff\1\u012a\7\76\1\u0132\1\u0134\3\76\1\uffff\1\u0138\1\uffff\1\u0139\2\76\1\u013c\1\uffff\1\u013d\1\u013e\1\u013f\3\76\1\u0143\3\76\2\uffff\1\76\1\u0148\1\uffff\3\76\1\uffff\11\76\1\u0155\1\uffff\1\u0156\1\uffff\1\76\1\u0158\1\76\1\u015a\1\76\1\u015c\10\76\1\uffff\6\76\4\uffff\3\76\2\uffff\2\76\4\uffff\2\76\1\u0172\1\uffff\2\76\1\u0175\1\76\1\uffff\1\u0177\1\76\1\u0179\1\u017a\1\u017b\7\76\2\uffff\1\u0183\1\uffff\1\u0184\1\uffff\1\u0185\1\uffff\1\u0186\4\76\1\u018b\11\76\1\u0195\1\76\1\uffff\2\76\2\uffff\2\76\1\uffff\1\u019b\1\uffff\1\u019c\4\uffff\5\76\1\u01a2\4\uffff\4\76\1\uffff\4\76\1\uffff\3\76\1\u01ae\1\uffff\1\u01b0\4\76\2\uffff\1\76\1\uffff\1\u01b6\1\76\1\u01b8\1\uffff\1\u01b9\6\76\1\uffff\3\76\1\uffff\1\76\1\uffff\1\u01c4\1\76\1\uffff\2\76\1\uffff\1\u01c8\2\uffff\7\76\1\uffff\1\76\1\u01d1\1\uffff\3\76\1\uffff\6\76\1\u01db\1\u01dc\1\uffff\2\76\1\uffff\1\u01df\1\u01e0\1\76\1\u01e2\2\76\2\uffff\2\76\2\uffff\1\76\1\uffff\1\u01e8\2\76\1\u01eb\1\76\1\uffff\1\76\1\u01ee\1\uffff\1\76\1\u01f0\1\uffff\1\76\1\uffff\3\76\1\u01f5\1\uffff";
    static final String DFA12_eofS =
        "\u01f6\uffff";
    static final String DFA12_minS =
        "\1\0\1\163\1\156\2\145\1\114\1\155\1\141\1\165\1\60\1\75\1\146\1\75\1\156\1\157\1\60\1\145\1\60\1\151\1\60\1\151\2\145\2\75\1\uffff\1\55\1\uffff\1\52\1\157\1\146\1\101\1\141\1\156\1\157\2\141\2\uffff\2\145\1\uffff\1\141\5\uffff\1\154\1\150\1\156\1\162\2\uffff\1\101\2\uffff\2\0\2\uffff\1\163\1\uffff\1\166\1\146\1\161\1\167\1\122\2\160\1\157\1\164\1\141\1\147\1\122\3\uffff\1\40\1\160\1\151\1\60\3\uffff\1\60\1\143\1\162\1\125\1\160\1\uffff\1\151\1\154\1\141\1\60\1\145\1\141\1\uffff\1\156\1\145\1\164\1\uffff\1\163\1\166\1\164\1\146\1\157\15\uffff\1\144\1\162\1\163\1\164\1\144\1\114\1\154\1\151\1\156\1\143\1\164\1\145\2\uffff\1\141\1\163\1\uffff\1\154\5\uffff\2\165\1\163\1\151\2\164\1\145\5\uffff\1\165\4\151\1\165\1\55\1\163\1\154\1\165\1\160\1\164\1\162\1\150\1\163\1\141\1\154\1\164\1\60\2\uffff\1\145\1\60\1\105\1\145\1\147\1\145\1\60\1\164\2\156\1\uffff\1\143\1\164\2\143\1\160\1\164\1\145\2\60\1\157\1\154\1\60\1\157\2\145\1\60\1\123\1\163\1\164\1\163\1\162\1\164\1\166\1\165\1\157\1\154\1\60\1\163\1\60\1\165\1\155\1\141\1\145\1\154\1\150\1\151\1\141\1\155\1\162\1\166\1\147\1\156\1\151\1\uffff\1\60\1\145\1\162\1\164\2\145\1\141\1\55\1\60\1\156\1\151\1\162\1\151\1\uffff\1\60\1\uffff\1\60\1\163\1\147\1\60\1\uffff\3\60\1\151\2\145\1\60\1\165\1\157\1\162\2\uffff\1\162\1\60\1\uffff\1\167\2\162\1\uffff\1\105\1\145\1\163\1\164\1\157\1\145\1\151\2\162\1\60\1\uffff\1\60\1\uffff\1\145\1\60\1\154\1\60\1\145\1\60\1\154\1\164\1\160\1\157\1\145\1\156\1\151\1\162\1\uffff\1\155\1\164\1\163\2\162\1\156\4\uffff\1\145\1\164\1\141\2\uffff\1\72\1\145\4\uffff\1\146\1\72\1\60\1\uffff\1\164\1\162\1\60\1\145\1\uffff\1\60\1\164\3\60\1\72\1\141\1\163\1\162\1\157\1\156\1\144\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\145\1\164\1\156\1\144\1\60\1\164\2\145\1\163\1\72\1\164\1\156\1\164\1\163\1\60\1\154\1\uffff\1\162\1\151\2\uffff\1\163\1\151\1\uffff\1\60\1\uffff\1\60\4\uffff\1\156\1\72\1\156\1\165\1\163\1\60\4\uffff\1\162\1\151\1\155\1\122\1\uffff\1\151\1\155\1\156\1\72\1\uffff\1\151\1\163\1\145\1\60\1\uffff\1\60\1\163\1\143\1\72\1\143\2\uffff\1\164\1\uffff\1\60\1\163\1\60\1\uffff\1\60\1\157\2\145\1\157\1\145\1\164\1\uffff\1\145\1\72\1\145\1\uffff\1\171\1\uffff\1\60\1\141\1\uffff\1\141\1\163\1\uffff\1\60\2\uffff\2\156\1\161\2\156\1\141\1\163\1\uffff\1\163\1\60\1\uffff\1\164\1\154\1\72\1\uffff\1\163\1\164\1\165\1\163\2\164\2\60\1\uffff\1\151\1\154\1\uffff\2\60\1\151\1\60\1\163\1\151\2\uffff\1\157\1\171\2\uffff\1\162\1\uffff\1\60\1\157\1\156\1\60\1\145\1\uffff\1\156\1\60\1\uffff\1\155\1\60\1\uffff\1\145\1\uffff\1\156\1\164\1\163\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\1\156\2\145\1\157\1\156\1\162\1\165\1\172\1\75\1\163\1\76\1\162\1\157\1\172\1\162\1\172\1\160\1\172\1\151\2\157\1\76\1\75\1\uffff\1\76\1\uffff\1\57\1\157\1\163\1\101\1\141\1\156\1\157\1\141\1\162\2\uffff\2\145\1\uffff\1\141\5\uffff\1\161\1\151\1\156\1\162\2\uffff\1\172\2\uffff\2\uffff\2\uffff\1\163\1\uffff\1\166\1\163\1\161\1\167\1\122\2\160\1\157\1\164\1\141\1\147\1\122\3\uffff\1\40\1\160\1\164\1\172\3\uffff\1\172\1\143\1\162\1\125\1\160\1\uffff\1\165\1\170\1\145\1\172\1\145\1\141\1\uffff\1\156\1\145\1\164\1\uffff\1\163\1\167\1\164\1\146\1\157\15\uffff\1\144\1\162\1\163\1\164\1\144\1\114\1\154\1\151\1\156\1\143\1\164\1\145\2\uffff\2\164\1\uffff\1\162\5\uffff\2\165\1\163\1\151\2\164\1\145\5\uffff\1\165\4\151\1\165\1\55\1\163\1\157\1\165\1\160\1\164\1\162\1\150\1\163\1\141\1\157\1\164\1\172\2\uffff\1\145\1\172\1\105\1\145\1\147\1\145\1\172\1\164\2\156\1\uffff\1\143\1\164\2\143\1\160\1\164\1\145\2\172\1\157\1\154\1\172\1\157\2\145\1\172\1\123\1\163\1\164\1\163\1\162\1\164\1\166\1\165\1\157\1\154\1\172\1\163\1\172\1\165\1\155\1\141\1\145\1\154\1\150\1\151\1\141\1\155\1\162\1\166\1\147\1\156\1\151\1\uffff\1\172\1\145\1\162\1\164\2\145\1\141\1\55\1\172\1\156\1\151\1\162\1\151\1\uffff\1\172\1\uffff\1\172\1\163\1\147\1\172\1\uffff\3\172\1\151\2\145\1\172\1\165\1\157\1\162\2\uffff\1\162\1\172\1\uffff\1\167\2\162\1\uffff\1\105\1\145\1\163\1\164\1\157\1\145\1\151\2\162\1\172\1\uffff\1\172\1\uffff\1\145\1\172\1\154\1\172\1\145\1\172\1\154\1\164\1\160\1\157\1\145\1\156\1\151\1\162\1\uffff\1\155\1\164\1\163\2\162\1\156\4\uffff\1\145\1\164\1\141\2\uffff\1\72\1\145\4\uffff\1\146\1\72\1\172\1\uffff\1\164\1\162\1\172\1\145\1\uffff\1\172\1\164\3\172\1\72\1\141\1\163\1\162\1\157\1\156\1\144\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\145\1\164\1\156\1\144\1\172\1\164\2\145\1\163\1\72\1\164\1\156\1\164\1\163\1\172\1\154\1\uffff\1\162\1\151\2\uffff\1\163\1\151\1\uffff\1\172\1\uffff\1\172\4\uffff\1\156\1\72\1\156\1\165\1\163\1\172\4\uffff\1\162\1\151\1\155\1\122\1\uffff\1\151\1\155\1\156\1\72\1\uffff\1\151\1\163\1\145\1\172\1\uffff\1\172\1\163\1\143\1\72\1\143\2\uffff\1\164\1\uffff\1\172\1\163\1\172\1\uffff\1\172\1\157\2\145\1\157\1\145\1\164\1\uffff\1\145\1\72\1\145\1\uffff\1\171\1\uffff\1\172\1\141\1\uffff\1\141\1\163\1\uffff\1\172\2\uffff\2\156\1\161\2\156\1\141\1\163\1\uffff\1\163\1\172\1\uffff\1\164\1\154\1\72\1\uffff\1\163\1\164\1\165\1\163\2\164\2\172\1\uffff\1\151\1\154\1\uffff\2\172\1\151\1\172\1\163\1\151\2\uffff\1\157\1\171\2\uffff\1\162\1\uffff\1\172\1\157\1\156\1\172\1\145\1\uffff\1\156\1\172\1\uffff\1\155\1\172\1\uffff\1\145\1\uffff\1\156\1\164\1\163\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\31\uffff\1\45\1\uffff\1\47\11\uffff\1\76\1\77\2\uffff\1\103\1\uffff\1\105\1\112\1\113\1\114\1\115\4\uffff\1\140\1\146\1\uffff\1\150\1\151\2\uffff\1\155\1\156\1\uffff\1\150\14\uffff\1\32\1\141\1\15\4\uffff\1\20\1\43\1\106\5\uffff\1\24\6\uffff\1\26\3\uffff\1\30\5\uffff\1\40\1\44\1\37\1\42\1\41\1\45\1\52\1\107\1\46\1\47\1\153\1\154\1\50\14\uffff\1\76\1\77\2\uffff\1\103\1\uffff\1\105\1\112\1\113\1\114\1\115\7\uffff\1\140\1\146\1\151\1\152\1\155\23\uffff\1\142\1\22\12\uffff\1\132\53\uffff\1\5\15\uffff\1\117\1\uffff\1\23\4\uffff\1\102\12\uffff\1\144\1\54\2\uffff\1\51\3\uffff\1\147\12\uffff\1\101\1\uffff\1\104\16\uffff\1\6\6\uffff\1\13\1\14\1\17\1\16\3\uffff\1\31\1\55\2\uffff\1\56\1\122\1\124\1\130\3\uffff\1\145\4\uffff\1\120\14\uffff\1\121\1\127\1\uffff\1\116\1\uffff\1\143\1\uffff\1\135\21\uffff\1\66\2\uffff\1\71\1\27\2\uffff\1\34\1\uffff\1\53\1\uffff\1\125\1\57\1\60\1\65\6\uffff\1\137\1\131\1\123\1\126\4\uffff\1\10\4\uffff\1\62\4\uffff\1\73\5\uffff\1\35\1\110\1\uffff\1\72\3\uffff\1\111\7\uffff\1\64\3\uffff\1\21\1\uffff\1\136\2\uffff\1\63\2\uffff\1\75\1\uffff\1\100\1\133\7\uffff\1\70\2\uffff\1\25\3\uffff\1\134\10\uffff\1\36\2\uffff\1\67\6\uffff\1\11\1\12\2\uffff\1\1\1\2\1\uffff\1\74\5\uffff\1\4\2\uffff\1\33\2\uffff\1\61\1\uffff\1\7\4\uffff\1\3";
    static final String DFA12_specialS =
        "\1\2\70\uffff\1\0\1\1\u01bb\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\74\2\73\2\74\1\73\22\74\1\73\1\74\1\71\1\65\3\74\1\72\1\45\1\46\1\33\1\31\1\51\1\32\1\64\1\34\12\70\1\12\1\74\1\27\1\14\1\30\2\74\1\1\1\67\1\42\1\3\1\2\1\37\1\10\1\11\1\6\2\67\1\5\1\43\1\67\1\23\1\7\1\67\1\4\1\21\1\17\1\41\5\67\1\56\1\74\1\57\1\66\1\67\1\74\1\36\1\26\2\67\1\60\1\40\1\63\1\24\1\13\2\67\1\50\1\35\1\25\1\15\1\44\1\67\1\47\1\22\1\20\1\62\1\52\1\61\1\16\2\67\1\54\1\53\1\55\uff82\74",
            "\1\75",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\103\42\uffff\1\102",
            "\1\104\1\105",
            "\1\107\20\uffff\1\106",
            "\1\110",
            "\12\76\7\uffff\13\76\1\112\16\76\4\uffff\1\76\1\uffff\10\76\1\111\21\76",
            "\1\114",
            "\1\121\6\uffff\1\117\1\120\4\uffff\1\116",
            "\1\123\1\122",
            "\1\126\3\uffff\1\125",
            "\1\127",
            "\12\76\7\uffff\21\76\1\130\10\76\4\uffff\1\76\1\uffff\30\76\1\131\1\76",
            "\1\134\2\uffff\1\135\6\uffff\1\136\2\uffff\1\133",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\17\76\1\137\3\76\1\140\6\76",
            "\1\142\6\uffff\1\143",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\24\76\1\144\5\76",
            "\1\146",
            "\1\147\11\uffff\1\150",
            "\1\151\11\uffff\1\152",
            "\1\153\1\154",
            "\1\156",
            "",
            "\1\162\20\uffff\1\161",
            "",
            "\1\165\4\uffff\1\166",
            "\1\170",
            "\1\173\7\uffff\1\174\3\uffff\1\171\1\172",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\20\uffff\1\u0083",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0089",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091\1\uffff\1\u008f\2\uffff\1\u0090",
            "\1\u0092\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "\0\u0099",
            "\0\u0099",
            "",
            "",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009f\13\uffff\1\u009d\1\u009e",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\12\uffff\1\u00ad",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4\13\uffff\1\u00b5",
            "\1\u00b6\13\uffff\1\u00b7",
            "\1\u00b9\3\uffff\1\u00b8",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "\1\u00d4\1\uffff\1\u00d3\20\uffff\1\u00d2",
            "\1\u00d6\1\u00d5",
            "",
            "\1\u00d8\5\uffff\1\u00d7",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8\2\uffff\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1\2\uffff\1\u00f2",
            "\1\u00f3",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "\1\u00f5",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0108",
            "\1\u0109",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u011a",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0133",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u013a",
            "\1\u013b",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "",
            "\1\u0147",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u0157",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0159",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u015b",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "",
            "",
            "",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "",
            "",
            "\1\u016e",
            "\1\u016f",
            "",
            "",
            "",
            "",
            "\1\u0170",
            "\1\u0171",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u0173",
            "\1\u0174",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0176",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0178",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0196",
            "",
            "\1\u0197",
            "\1\u0198",
            "",
            "",
            "\1\u0199",
            "\1\u019a",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "",
            "",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\13\76\1\u01af\16\76",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "",
            "\1\u01b5",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u01b7",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u01c5",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "",
            "\1\u01d0",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u01dd",
            "\1\u01de",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u01e1",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u01e3",
            "\1\u01e4",
            "",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "",
            "",
            "\1\u01e7",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u01e9",
            "\1\u01ea",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u01ec",
            "",
            "\1\u01ed",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u01ef",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( ((LA12_57>='\u0000' && LA12_57<='\uFFFF')) ) {s = 153;}

                        else s = 60;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_58 = input.LA(1);

                        s = -1;
                        if ( ((LA12_58>='\u0000' && LA12_58<='\uFFFF')) ) {s = 153;}

                        else s = 60;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='E') ) {s = 2;}

                        else if ( (LA12_0=='D') ) {s = 3;}

                        else if ( (LA12_0=='R') ) {s = 4;}

                        else if ( (LA12_0=='L') ) {s = 5;}

                        else if ( (LA12_0=='I') ) {s = 6;}

                        else if ( (LA12_0=='P') ) {s = 7;}

                        else if ( (LA12_0=='G') ) {s = 8;}

                        else if ( (LA12_0=='H') ) {s = 9;}

                        else if ( (LA12_0==':') ) {s = 10;}

                        else if ( (LA12_0=='i') ) {s = 11;}

                        else if ( (LA12_0=='=') ) {s = 12;}

                        else if ( (LA12_0=='o') ) {s = 13;}

                        else if ( (LA12_0=='x') ) {s = 14;}

                        else if ( (LA12_0=='T') ) {s = 15;}

                        else if ( (LA12_0=='t') ) {s = 16;}

                        else if ( (LA12_0=='S') ) {s = 17;}

                        else if ( (LA12_0=='s') ) {s = 18;}

                        else if ( (LA12_0=='O') ) {s = 19;}

                        else if ( (LA12_0=='h') ) {s = 20;}

                        else if ( (LA12_0=='n') ) {s = 21;}

                        else if ( (LA12_0=='b') ) {s = 22;}

                        else if ( (LA12_0=='<') ) {s = 23;}

                        else if ( (LA12_0=='>') ) {s = 24;}

                        else if ( (LA12_0=='+') ) {s = 25;}

                        else if ( (LA12_0=='-') ) {s = 26;}

                        else if ( (LA12_0=='*') ) {s = 27;}

                        else if ( (LA12_0=='/') ) {s = 28;}

                        else if ( (LA12_0=='m') ) {s = 29;}

                        else if ( (LA12_0=='a') ) {s = 30;}

                        else if ( (LA12_0=='F') ) {s = 31;}

                        else if ( (LA12_0=='f') ) {s = 32;}

                        else if ( (LA12_0=='U') ) {s = 33;}

                        else if ( (LA12_0=='C') ) {s = 34;}

                        else if ( (LA12_0=='M') ) {s = 35;}

                        else if ( (LA12_0=='p') ) {s = 36;}

                        else if ( (LA12_0=='(') ) {s = 37;}

                        else if ( (LA12_0==')') ) {s = 38;}

                        else if ( (LA12_0=='r') ) {s = 39;}

                        else if ( (LA12_0=='l') ) {s = 40;}

                        else if ( (LA12_0==',') ) {s = 41;}

                        else if ( (LA12_0=='v') ) {s = 42;}

                        else if ( (LA12_0=='|') ) {s = 43;}

                        else if ( (LA12_0=='{') ) {s = 44;}

                        else if ( (LA12_0=='}') ) {s = 45;}

                        else if ( (LA12_0=='[') ) {s = 46;}

                        else if ( (LA12_0==']') ) {s = 47;}

                        else if ( (LA12_0=='e') ) {s = 48;}

                        else if ( (LA12_0=='w') ) {s = 49;}

                        else if ( (LA12_0=='u') ) {s = 50;}

                        else if ( (LA12_0=='g') ) {s = 51;}

                        else if ( (LA12_0=='.') ) {s = 52;}

                        else if ( (LA12_0=='#') ) {s = 53;}

                        else if ( (LA12_0=='^') ) {s = 54;}

                        else if ( (LA12_0=='B'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='N'||LA12_0=='Q'||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='c' && LA12_0<='d')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='q'||(LA12_0>='y' && LA12_0<='z')) ) {s = 55;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 56;}

                        else if ( (LA12_0=='\"') ) {s = 57;}

                        else if ( (LA12_0=='\'') ) {s = 58;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 59;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}