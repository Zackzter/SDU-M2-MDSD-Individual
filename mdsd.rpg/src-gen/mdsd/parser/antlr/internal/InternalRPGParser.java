package mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mdsd.services.RPGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRPGParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'speed_value'", "'effects'", "'effect'", "'buff'", "'move'", "'if'", "'then'", "'self'", "'is'", "'target'", "'local'", "'attributes'", "'attribute'", "'location'", "'opponents'", "'terrain'", "'relations'", "'type'", "','", "'<'", "'moves'", "'entities'", "'death'", "'entity'", "'teams'", "'size'", "'team'", "'members'", "'require'", "'OR'", "'AND'", "'('", "')'", "'<='", "'=='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'.'", "'Float'", "'Integer'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalRPGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRPGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRPGParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRPG.g"; }



     	private RPGGrammarAccess grammarAccess;

        public InternalRPGParser(TokenStream input, RPGGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemRPG";
       	}

       	@Override
       	protected RPGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemRPG"
    // InternalRPG.g:64:1: entryRuleSystemRPG returns [EObject current=null] : iv_ruleSystemRPG= ruleSystemRPG EOF ;
    public final EObject entryRuleSystemRPG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRPG = null;


        try {
            // InternalRPG.g:64:50: (iv_ruleSystemRPG= ruleSystemRPG EOF )
            // InternalRPG.g:65:2: iv_ruleSystemRPG= ruleSystemRPG EOF
            {
             newCompositeNode(grammarAccess.getSystemRPGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemRPG=ruleSystemRPG();

            state._fsp--;

             current =iv_ruleSystemRPG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemRPG"


    // $ANTLR start "ruleSystemRPG"
    // InternalRPG.g:71:1: ruleSystemRPG returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleSystemRPG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalRPG.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalRPG.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalRPG.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemRPGAccess().getGameKeyword_0());
            		
            // InternalRPG.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRPGRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==23||LA1_0==25||LA1_0==28||(LA1_0>=32 && LA1_0<=34)||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRPG.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalRPG.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalRPG.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRPGRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"mdsd.RPG.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemRPG"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRPG.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRPG.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRPG.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRPG.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects | this_Speed_8= ruleSpeed ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Locations_0 = null;

        EObject this_Relations_1 = null;

        EObject this_Moves_2 = null;

        EObject this_Entities_3 = null;

        EObject this_Teams_4 = null;

        EObject this_Death_5 = null;

        EObject this_Attributes_6 = null;

        EObject this_Effects_7 = null;

        EObject this_Speed_8 = null;



        	enterRule();

        try {
            // InternalRPG.g:137:2: ( (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects | this_Speed_8= ruleSpeed ) )
            // InternalRPG.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects | this_Speed_8= ruleSpeed )
            {
            // InternalRPG.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects | this_Speed_8= ruleSpeed )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case 34:
                {
                alt2=6;
                }
                break;
            case 23:
                {
                alt2=7;
                }
                break;
            case 13:
                {
                alt2=8;
                }
                break;
            case 12:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRPG.g:139:3: this_Locations_0= ruleLocations
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Locations_0=ruleLocations();

                    state._fsp--;


                    			current = this_Locations_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:148:3: this_Relations_1= ruleRelations
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relations_1=ruleRelations();

                    state._fsp--;


                    			current = this_Relations_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRPG.g:157:3: this_Moves_2= ruleMoves
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Moves_2=ruleMoves();

                    state._fsp--;


                    			current = this_Moves_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRPG.g:166:3: this_Entities_3= ruleEntities
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entities_3=ruleEntities();

                    state._fsp--;


                    			current = this_Entities_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRPG.g:175:3: this_Teams_4= ruleTeams
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teams_4=ruleTeams();

                    state._fsp--;


                    			current = this_Teams_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRPG.g:184:3: this_Death_5= ruleDeath
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Death_5=ruleDeath();

                    state._fsp--;


                    			current = this_Death_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRPG.g:193:3: this_Attributes_6= ruleAttributes
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attributes_6=ruleAttributes();

                    state._fsp--;


                    			current = this_Attributes_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRPG.g:202:3: this_Effects_7= ruleEffects
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Effects_7=ruleEffects();

                    state._fsp--;


                    			current = this_Effects_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRPG.g:211:3: this_Speed_8= ruleSpeed
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getSpeedParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Speed_8=ruleSpeed();

                    state._fsp--;


                    			current = this_Speed_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleSpeed"
    // InternalRPG.g:223:1: entryRuleSpeed returns [EObject current=null] : iv_ruleSpeed= ruleSpeed EOF ;
    public final EObject entryRuleSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeed = null;


        try {
            // InternalRPG.g:223:46: (iv_ruleSpeed= ruleSpeed EOF )
            // InternalRPG.g:224:2: iv_ruleSpeed= ruleSpeed EOF
            {
             newCompositeNode(grammarAccess.getSpeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeed=ruleSpeed();

            state._fsp--;

             current =iv_ruleSpeed; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpeed"


    // $ANTLR start "ruleSpeed"
    // InternalRPG.g:230:1: ruleSpeed returns [EObject current=null] : (otherlv_0= 'speed_value' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:236:2: ( (otherlv_0= 'speed_value' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRPG.g:237:2: (otherlv_0= 'speed_value' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRPG.g:237:2: (otherlv_0= 'speed_value' ( (otherlv_1= RULE_ID ) ) )
            // InternalRPG.g:238:3: otherlv_0= 'speed_value' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpeedAccess().getSpeed_valueKeyword_0());
            		
            // InternalRPG.g:242:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:243:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:243:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:244:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpeedRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSpeedAccess().getSpeedValueAttributeCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "entryRuleEffects"
    // InternalRPG.g:259:1: entryRuleEffects returns [EObject current=null] : iv_ruleEffects= ruleEffects EOF ;
    public final EObject entryRuleEffects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffects = null;


        try {
            // InternalRPG.g:259:48: (iv_ruleEffects= ruleEffects EOF )
            // InternalRPG.g:260:2: iv_ruleEffects= ruleEffects EOF
            {
             newCompositeNode(grammarAccess.getEffectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffects=ruleEffects();

            state._fsp--;

             current =iv_ruleEffects; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffects"


    // $ANTLR start "ruleEffects"
    // InternalRPG.g:266:1: ruleEffects returns [EObject current=null] : (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ ) ;
    public final EObject ruleEffects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_effect_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:272:2: ( (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ ) )
            // InternalRPG.g:273:2: (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ )
            {
            // InternalRPG.g:273:2: (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ )
            // InternalRPG.g:274:3: otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectsAccess().getEffectsKeyword_0());
            		
            // InternalRPG.g:278:3: ( (lv_effect_1_0= ruleEffect ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRPG.g:279:4: (lv_effect_1_0= ruleEffect )
            	    {
            	    // InternalRPG.g:279:4: (lv_effect_1_0= ruleEffect )
            	    // InternalRPG.g:280:5: lv_effect_1_0= ruleEffect
            	    {

            	    					newCompositeNode(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_effect_1_0=ruleEffect();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEffectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"effect",
            	    						lv_effect_1_0,
            	    						"mdsd.RPG.Effect");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffects"


    // $ANTLR start "entryRuleEffect"
    // InternalRPG.g:301:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalRPG.g:301:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalRPG.g:302:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalRPG.g:308:1: ruleEffect returns [EObject current=null] : (otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE ) ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Buff_1 = null;

        EObject this_MoveE_2 = null;



        	enterRule();

        try {
            // InternalRPG.g:314:2: ( (otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE ) ) )
            // InternalRPG.g:315:2: (otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE ) )
            {
            // InternalRPG.g:315:2: (otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE ) )
            // InternalRPG.g:316:3: otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectAccess().getEffectKeyword_0());
            		
            // InternalRPG.g:320:3: (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRPG.g:321:4: this_Buff_1= ruleBuff
                    {

                    				newCompositeNode(grammarAccess.getEffectAccess().getBuffParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Buff_1=ruleBuff();

                    state._fsp--;


                    				current = this_Buff_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRPG.g:330:4: this_MoveE_2= ruleMoveE
                    {

                    				newCompositeNode(grammarAccess.getEffectAccess().getMoveEParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_MoveE_2=ruleMoveE();

                    state._fsp--;


                    				current = this_MoveE_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleBuff"
    // InternalRPG.g:343:1: entryRuleBuff returns [EObject current=null] : iv_ruleBuff= ruleBuff EOF ;
    public final EObject entryRuleBuff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuff = null;


        try {
            // InternalRPG.g:343:45: (iv_ruleBuff= ruleBuff EOF )
            // InternalRPG.g:344:2: iv_ruleBuff= ruleBuff EOF
            {
             newCompositeNode(grammarAccess.getBuffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuff=ruleBuff();

            state._fsp--;

             current =iv_ruleBuff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuff"


    // $ANTLR start "ruleBuff"
    // InternalRPG.g:350:1: ruleBuff returns [EObject current=null] : (otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeBuff ) ) ) ;
    public final EObject ruleBuff() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rule_2_0 = null;

        EObject lv_reference_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:356:2: ( (otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeBuff ) ) ) )
            // InternalRPG.g:357:2: (otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeBuff ) ) )
            {
            // InternalRPG.g:357:2: (otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeBuff ) ) )
            // InternalRPG.g:358:3: otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeBuff ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBuffAccess().getBuffKeyword_0());
            		
            // InternalRPG.g:362:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:363:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:363:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:364:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBuffAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuffRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:380:3: ( (lv_rule_2_0= ruleRule ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRPG.g:381:4: (lv_rule_2_0= ruleRule )
                    {
                    // InternalRPG.g:381:4: (lv_rule_2_0= ruleRule )
                    // InternalRPG.g:382:5: lv_rule_2_0= ruleRule
                    {

                    					newCompositeNode(grammarAccess.getBuffAccess().getRuleRuleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_rule_2_0=ruleRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBuffRule());
                    					}
                    					set(
                    						current,
                    						"rule",
                    						lv_rule_2_0,
                    						"mdsd.RPG.Rule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRPG.g:399:3: ( (lv_reference_3_0= ruleAttributeBuff ) )
            // InternalRPG.g:400:4: (lv_reference_3_0= ruleAttributeBuff )
            {
            // InternalRPG.g:400:4: (lv_reference_3_0= ruleAttributeBuff )
            // InternalRPG.g:401:5: lv_reference_3_0= ruleAttributeBuff
            {

            					newCompositeNode(grammarAccess.getBuffAccess().getReferenceAttributeBuffParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_reference_3_0=ruleAttributeBuff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuffRule());
            					}
            					set(
            						current,
            						"reference",
            						lv_reference_3_0,
            						"mdsd.RPG.AttributeBuff");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuff"


    // $ANTLR start "entryRuleMoveE"
    // InternalRPG.g:422:1: entryRuleMoveE returns [EObject current=null] : iv_ruleMoveE= ruleMoveE EOF ;
    public final EObject entryRuleMoveE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveE = null;


        try {
            // InternalRPG.g:422:46: (iv_ruleMoveE= ruleMoveE EOF )
            // InternalRPG.g:423:2: iv_ruleMoveE= ruleMoveE EOF
            {
             newCompositeNode(grammarAccess.getMoveERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveE=ruleMoveE();

            state._fsp--;

             current =iv_ruleMoveE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoveE"


    // $ANTLR start "ruleMoveE"
    // InternalRPG.g:429:1: ruleMoveE returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeReference ) ) ) ;
    public final EObject ruleMoveE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rule_2_0 = null;

        EObject lv_reference_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:435:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeReference ) ) ) )
            // InternalRPG.g:436:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeReference ) ) )
            {
            // InternalRPG.g:436:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeReference ) ) )
            // InternalRPG.g:437:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )? ( (lv_reference_3_0= ruleAttributeReference ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveEAccess().getMoveKeyword_0());
            		
            // InternalRPG.g:441:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:442:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:442:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:443:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMoveEAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:459:3: ( (lv_rule_2_0= ruleRule ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRPG.g:460:4: (lv_rule_2_0= ruleRule )
                    {
                    // InternalRPG.g:460:4: (lv_rule_2_0= ruleRule )
                    // InternalRPG.g:461:5: lv_rule_2_0= ruleRule
                    {

                    					newCompositeNode(grammarAccess.getMoveEAccess().getRuleRuleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_rule_2_0=ruleRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMoveERule());
                    					}
                    					set(
                    						current,
                    						"rule",
                    						lv_rule_2_0,
                    						"mdsd.RPG.Rule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRPG.g:478:3: ( (lv_reference_3_0= ruleAttributeReference ) )
            // InternalRPG.g:479:4: (lv_reference_3_0= ruleAttributeReference )
            {
            // InternalRPG.g:479:4: (lv_reference_3_0= ruleAttributeReference )
            // InternalRPG.g:480:5: lv_reference_3_0= ruleAttributeReference
            {

            					newCompositeNode(grammarAccess.getMoveEAccess().getReferenceAttributeReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_reference_3_0=ruleAttributeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveERule());
            					}
            					set(
            						current,
            						"reference",
            						lv_reference_3_0,
            						"mdsd.RPG.AttributeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveE"


    // $ANTLR start "entryRuleRule"
    // InternalRPG.g:501:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRPG.g:501:45: (iv_ruleRule= ruleRule EOF )
            // InternalRPG.g:502:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRPG.g:508:1: ruleRule returns [EObject current=null] : (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_or_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:514:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' ) )
            // InternalRPG.g:515:2: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )
            {
            // InternalRPG.g:515:2: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )
            // InternalRPG.g:516:3: otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
            		
            // InternalRPG.g:520:3: ( (lv_or_1_0= ruleORcondition ) )
            // InternalRPG.g:521:4: (lv_or_1_0= ruleORcondition )
            {
            // InternalRPG.g:521:4: (lv_or_1_0= ruleORcondition )
            // InternalRPG.g:522:5: lv_or_1_0= ruleORcondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_or_1_0=ruleORcondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"or",
            						lv_or_1_0,
            						"mdsd.RPG.ORcondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThenKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAttributeBuff"
    // InternalRPG.g:547:1: entryRuleAttributeBuff returns [EObject current=null] : iv_ruleAttributeBuff= ruleAttributeBuff EOF ;
    public final EObject entryRuleAttributeBuff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeBuff = null;


        try {
            // InternalRPG.g:547:54: (iv_ruleAttributeBuff= ruleAttributeBuff EOF )
            // InternalRPG.g:548:2: iv_ruleAttributeBuff= ruleAttributeBuff EOF
            {
             newCompositeNode(grammarAccess.getAttributeBuffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeBuff=ruleAttributeBuff();

            state._fsp--;

             current =iv_ruleAttributeBuff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeBuff"


    // $ANTLR start "ruleAttributeBuff"
    // InternalRPG.g:554:1: ruleAttributeBuff returns [EObject current=null] : ( ( (lv_target_0_0= ruleTarget ) ) | ( (lv_local_1_0= ruleLocalTarget ) ) )+ ;
    public final EObject ruleAttributeBuff() throws RecognitionException {
        EObject current = null;

        EObject lv_target_0_0 = null;

        EObject lv_local_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:560:2: ( ( ( (lv_target_0_0= ruleTarget ) ) | ( (lv_local_1_0= ruleLocalTarget ) ) )+ )
            // InternalRPG.g:561:2: ( ( (lv_target_0_0= ruleTarget ) ) | ( (lv_local_1_0= ruleLocalTarget ) ) )+
            {
            // InternalRPG.g:561:2: ( ( (lv_target_0_0= ruleTarget ) ) | ( (lv_local_1_0= ruleLocalTarget ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }
                else if ( (LA7_0==22) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRPG.g:562:3: ( (lv_target_0_0= ruleTarget ) )
            	    {
            	    // InternalRPG.g:562:3: ( (lv_target_0_0= ruleTarget ) )
            	    // InternalRPG.g:563:4: (lv_target_0_0= ruleTarget )
            	    {
            	    // InternalRPG.g:563:4: (lv_target_0_0= ruleTarget )
            	    // InternalRPG.g:564:5: lv_target_0_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeBuffAccess().getTargetTargetParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_target_0_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeBuffRule());
            	    					}
            	    					add(
            	    						current,
            	    						"target",
            	    						lv_target_0_0,
            	    						"mdsd.RPG.Target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRPG.g:582:3: ( (lv_local_1_0= ruleLocalTarget ) )
            	    {
            	    // InternalRPG.g:582:3: ( (lv_local_1_0= ruleLocalTarget ) )
            	    // InternalRPG.g:583:4: (lv_local_1_0= ruleLocalTarget )
            	    {
            	    // InternalRPG.g:583:4: (lv_local_1_0= ruleLocalTarget )
            	    // InternalRPG.g:584:5: lv_local_1_0= ruleLocalTarget
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeBuffAccess().getLocalLocalTargetParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_local_1_0=ruleLocalTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeBuffRule());
            	    					}
            	    					add(
            	    						current,
            	    						"local",
            	    						lv_local_1_0,
            	    						"mdsd.RPG.LocalTarget");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeBuff"


    // $ANTLR start "entryRuleAttributeReference"
    // InternalRPG.g:605:1: entryRuleAttributeReference returns [EObject current=null] : iv_ruleAttributeReference= ruleAttributeReference EOF ;
    public final EObject entryRuleAttributeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeReference = null;


        try {
            // InternalRPG.g:605:59: (iv_ruleAttributeReference= ruleAttributeReference EOF )
            // InternalRPG.g:606:2: iv_ruleAttributeReference= ruleAttributeReference EOF
            {
             newCompositeNode(grammarAccess.getAttributeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeReference=ruleAttributeReference();

            state._fsp--;

             current =iv_ruleAttributeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeReference"


    // $ANTLR start "ruleAttributeReference"
    // InternalRPG.g:612:1: ruleAttributeReference returns [EObject current=null] : ( ( (lv_selfT_0_0= ruleSelf ) ) | ( (lv_target_1_0= ruleTarget ) ) )+ ;
    public final EObject ruleAttributeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_selfT_0_0 = null;

        EObject lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:618:2: ( ( ( (lv_selfT_0_0= ruleSelf ) ) | ( (lv_target_1_0= ruleTarget ) ) )+ )
            // InternalRPG.g:619:2: ( ( (lv_selfT_0_0= ruleSelf ) ) | ( (lv_target_1_0= ruleTarget ) ) )+
            {
            // InternalRPG.g:619:2: ( ( (lv_selfT_0_0= ruleSelf ) ) | ( (lv_target_1_0= ruleTarget ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }
                else if ( (LA8_0==21) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRPG.g:620:3: ( (lv_selfT_0_0= ruleSelf ) )
            	    {
            	    // InternalRPG.g:620:3: ( (lv_selfT_0_0= ruleSelf ) )
            	    // InternalRPG.g:621:4: (lv_selfT_0_0= ruleSelf )
            	    {
            	    // InternalRPG.g:621:4: (lv_selfT_0_0= ruleSelf )
            	    // InternalRPG.g:622:5: lv_selfT_0_0= ruleSelf
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeReferenceAccess().getSelfTSelfParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_selfT_0_0=ruleSelf();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeReferenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"selfT",
            	    						lv_selfT_0_0,
            	    						"mdsd.RPG.Self");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRPG.g:640:3: ( (lv_target_1_0= ruleTarget ) )
            	    {
            	    // InternalRPG.g:640:3: ( (lv_target_1_0= ruleTarget ) )
            	    // InternalRPG.g:641:4: (lv_target_1_0= ruleTarget )
            	    {
            	    // InternalRPG.g:641:4: (lv_target_1_0= ruleTarget )
            	    // InternalRPG.g:642:5: lv_target_1_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeReferenceAccess().getTargetTargetParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_target_1_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeReferenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"target",
            	    						lv_target_1_0,
            	    						"mdsd.RPG.Target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeReference"


    // $ANTLR start "entryRuleSelf"
    // InternalRPG.g:663:1: entryRuleSelf returns [EObject current=null] : iv_ruleSelf= ruleSelf EOF ;
    public final EObject entryRuleSelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelf = null;


        try {
            // InternalRPG.g:663:45: (iv_ruleSelf= ruleSelf EOF )
            // InternalRPG.g:664:2: iv_ruleSelf= ruleSelf EOF
            {
             newCompositeNode(grammarAccess.getSelfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelf=ruleSelf();

            state._fsp--;

             current =iv_ruleSelf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelf"


    // $ANTLR start "ruleSelf"
    // InternalRPG.g:670:1: ruleSelf returns [EObject current=null] : (otherlv_0= 'self' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) ) ;
    public final EObject ruleSelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_sum_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:676:2: ( (otherlv_0= 'self' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) ) )
            // InternalRPG.g:677:2: (otherlv_0= 'self' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) )
            {
            // InternalRPG.g:677:2: (otherlv_0= 'self' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) )
            // InternalRPG.g:678:3: otherlv_0= 'self' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelfAccess().getSelfKeyword_0());
            		
            // InternalRPG.g:682:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:683:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:683:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:684:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelfRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getSelfAccess().getTargetAttributeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSelfAccess().getIsKeyword_2());
            		
            // InternalRPG.g:699:3: ( (lv_sum_3_0= ruleSum ) )
            // InternalRPG.g:700:4: (lv_sum_3_0= ruleSum )
            {
            // InternalRPG.g:700:4: (lv_sum_3_0= ruleSum )
            // InternalRPG.g:701:5: lv_sum_3_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getSelfAccess().getSumSumParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_sum_3_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelfRule());
            					}
            					set(
            						current,
            						"sum",
            						lv_sum_3_0,
            						"mdsd.RPG.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelf"


    // $ANTLR start "entryRuleTarget"
    // InternalRPG.g:722:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalRPG.g:722:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalRPG.g:723:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalRPG.g:729:1: ruleTarget returns [EObject current=null] : (otherlv_0= 'target' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_sum_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:735:2: ( (otherlv_0= 'target' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) ) )
            // InternalRPG.g:736:2: (otherlv_0= 'target' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) )
            {
            // InternalRPG.g:736:2: (otherlv_0= 'target' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) )
            // InternalRPG.g:737:3: otherlv_0= 'target' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getTargetKeyword_0());
            		
            // InternalRPG.g:741:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:742:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:742:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:743:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getTargetAccess().getTargetAttributeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getIsKeyword_2());
            		
            // InternalRPG.g:758:3: ( (lv_sum_3_0= ruleSum ) )
            // InternalRPG.g:759:4: (lv_sum_3_0= ruleSum )
            {
            // InternalRPG.g:759:4: (lv_sum_3_0= ruleSum )
            // InternalRPG.g:760:5: lv_sum_3_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getTargetAccess().getSumSumParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_sum_3_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetRule());
            					}
            					set(
            						current,
            						"sum",
            						lv_sum_3_0,
            						"mdsd.RPG.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleLocalTarget"
    // InternalRPG.g:781:1: entryRuleLocalTarget returns [EObject current=null] : iv_ruleLocalTarget= ruleLocalTarget EOF ;
    public final EObject entryRuleLocalTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalTarget = null;


        try {
            // InternalRPG.g:781:52: (iv_ruleLocalTarget= ruleLocalTarget EOF )
            // InternalRPG.g:782:2: iv_ruleLocalTarget= ruleLocalTarget EOF
            {
             newCompositeNode(grammarAccess.getLocalTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalTarget=ruleLocalTarget();

            state._fsp--;

             current =iv_ruleLocalTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalTarget"


    // $ANTLR start "ruleLocalTarget"
    // InternalRPG.g:788:1: ruleLocalTarget returns [EObject current=null] : (otherlv_0= 'local' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) ) ;
    public final EObject ruleLocalTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_sum_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:794:2: ( (otherlv_0= 'local' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) ) )
            // InternalRPG.g:795:2: (otherlv_0= 'local' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) )
            {
            // InternalRPG.g:795:2: (otherlv_0= 'local' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) ) )
            // InternalRPG.g:796:3: otherlv_0= 'local' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_sum_3_0= ruleSum ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalTargetAccess().getLocalKeyword_0());
            		
            // InternalRPG.g:800:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:801:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:801:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:802:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getLocalTargetAccess().getAttributeLocalAttributeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getLocalTargetAccess().getIsKeyword_2());
            		
            // InternalRPG.g:817:3: ( (lv_sum_3_0= ruleSum ) )
            // InternalRPG.g:818:4: (lv_sum_3_0= ruleSum )
            {
            // InternalRPG.g:818:4: (lv_sum_3_0= ruleSum )
            // InternalRPG.g:819:5: lv_sum_3_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getLocalTargetAccess().getSumSumParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_sum_3_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalTargetRule());
            					}
            					set(
            						current,
            						"sum",
            						lv_sum_3_0,
            						"mdsd.RPG.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalTarget"


    // $ANTLR start "entryRuleAttributes"
    // InternalRPG.g:840:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalRPG.g:840:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalRPG.g:841:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalRPG.g:847:1: ruleAttributes returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:853:2: ( (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) )
            // InternalRPG.g:854:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            {
            // InternalRPG.g:854:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            // InternalRPG.g:855:3: otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
            		
            // InternalRPG.g:859:3: ( (lv_attribute_1_0= ruleAttribute ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRPG.g:860:4: (lv_attribute_1_0= ruleAttribute )
            	    {
            	    // InternalRPG.g:860:4: (lv_attribute_1_0= ruleAttribute )
            	    // InternalRPG.g:861:5: lv_attribute_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_attribute_1_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_1_0,
            	    						"mdsd.RPG.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // InternalRPG.g:882:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRPG.g:882:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRPG.g:883:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRPG.g:889:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_aVal_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:895:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) )
            // InternalRPG.g:896:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            {
            // InternalRPG.g:896:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            // InternalRPG.g:897:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRPG.g:901:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:902:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:902:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:903:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:919:3: ( (lv_aVal_2_0= ruleAttributeValues ) )
            // InternalRPG.g:920:4: (lv_aVal_2_0= ruleAttributeValues )
            {
            // InternalRPG.g:920:4: (lv_aVal_2_0= ruleAttributeValues )
            // InternalRPG.g:921:5: lv_aVal_2_0= ruleAttributeValues
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_aVal_2_0=ruleAttributeValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"aVal",
            						lv_aVal_2_0,
            						"mdsd.RPG.AttributeValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLocations"
    // InternalRPG.g:942:1: entryRuleLocations returns [EObject current=null] : iv_ruleLocations= ruleLocations EOF ;
    public final EObject entryRuleLocations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocations = null;


        try {
            // InternalRPG.g:942:50: (iv_ruleLocations= ruleLocations EOF )
            // InternalRPG.g:943:2: iv_ruleLocations= ruleLocations EOF
            {
             newCompositeNode(grammarAccess.getLocationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocations=ruleLocations();

            state._fsp--;

             current =iv_ruleLocations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocations"


    // $ANTLR start "ruleLocations"
    // InternalRPG.g:949:1: ruleLocations returns [EObject current=null] : (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) ;
    public final EObject ruleLocations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loc_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:955:2: ( (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) )
            // InternalRPG.g:956:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            {
            // InternalRPG.g:956:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            // InternalRPG.g:957:3: otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationsAccess().getLocationKeyword_0());
            		
            // InternalRPG.g:961:3: ( (lv_loc_1_0= ruleLoc ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRPG.g:962:4: (lv_loc_1_0= ruleLoc )
            	    {
            	    // InternalRPG.g:962:4: (lv_loc_1_0= ruleLoc )
            	    // InternalRPG.g:963:5: lv_loc_1_0= ruleLoc
            	    {

            	    					newCompositeNode(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_loc_1_0=ruleLoc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLocationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loc",
            	    						lv_loc_1_0,
            	    						"mdsd.RPG.Loc");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocations"


    // $ANTLR start "entryRuleLoc"
    // InternalRPG.g:984:1: entryRuleLoc returns [EObject current=null] : iv_ruleLoc= ruleLoc EOF ;
    public final EObject entryRuleLoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoc = null;


        try {
            // InternalRPG.g:984:44: (iv_ruleLoc= ruleLoc EOF )
            // InternalRPG.g:985:2: iv_ruleLoc= ruleLoc EOF
            {
             newCompositeNode(grammarAccess.getLocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoc=ruleLoc();

            state._fsp--;

             current =iv_ruleLoc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoc"


    // $ANTLR start "ruleLoc"
    // InternalRPG.g:991:1: ruleLoc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ( (lv_terrain_3_0= ruleTerrain ) ) ) ;
    public final EObject ruleLoc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_terrain_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:997:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ( (lv_terrain_3_0= ruleTerrain ) ) ) )
            // InternalRPG.g:998:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ( (lv_terrain_3_0= ruleTerrain ) ) )
            {
            // InternalRPG.g:998:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ( (lv_terrain_3_0= ruleTerrain ) ) )
            // InternalRPG.g:999:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ( (lv_terrain_3_0= ruleTerrain ) )
            {
            // InternalRPG.g:999:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPG.g:1000:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRPG.g:1000:4: (lv_name_0_0= RULE_ID )
            // InternalRPG.g:1001:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLocAccess().getOpponentsKeyword_1());
            		
            // InternalRPG.g:1021:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPG.g:1022:4: (otherlv_2= RULE_ID )
            {
            // InternalRPG.g:1022:4: (otherlv_2= RULE_ID )
            // InternalRPG.g:1023:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getLocAccess().getTeamTeamCrossReference_2_0());
            				

            }


            }

            // InternalRPG.g:1034:3: ( (lv_terrain_3_0= ruleTerrain ) )
            // InternalRPG.g:1035:4: (lv_terrain_3_0= ruleTerrain )
            {
            // InternalRPG.g:1035:4: (lv_terrain_3_0= ruleTerrain )
            // InternalRPG.g:1036:5: lv_terrain_3_0= ruleTerrain
            {

            					newCompositeNode(grammarAccess.getLocAccess().getTerrainTerrainParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_terrain_3_0=ruleTerrain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocRule());
            					}
            					set(
            						current,
            						"terrain",
            						lv_terrain_3_0,
            						"mdsd.RPG.Terrain");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoc"


    // $ANTLR start "entryRuleTerrain"
    // InternalRPG.g:1057:1: entryRuleTerrain returns [EObject current=null] : iv_ruleTerrain= ruleTerrain EOF ;
    public final EObject entryRuleTerrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerrain = null;


        try {
            // InternalRPG.g:1057:48: (iv_ruleTerrain= ruleTerrain EOF )
            // InternalRPG.g:1058:2: iv_ruleTerrain= ruleTerrain EOF
            {
             newCompositeNode(grammarAccess.getTerrainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerrain=ruleTerrain();

            state._fsp--;

             current =iv_ruleTerrain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerrain"


    // $ANTLR start "ruleTerrain"
    // InternalRPG.g:1064:1: ruleTerrain returns [EObject current=null] : (otherlv_0= 'terrain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ) ;
    public final EObject ruleTerrain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1070:2: ( (otherlv_0= 'terrain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ) )
            // InternalRPG.g:1071:2: (otherlv_0= 'terrain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) )
            {
            // InternalRPG.g:1071:2: (otherlv_0= 'terrain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) )
            // InternalRPG.g:1072:3: otherlv_0= 'terrain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTerrainAccess().getTerrainKeyword_0());
            		
            // InternalRPG.g:1076:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1077:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1077:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1078:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTerrainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerrainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:1094:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRPG.g:1095:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRPG.g:1095:4: (lv_eType_2_0= ruleEType )
            // InternalRPG.g:1096:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getTerrainAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerrainRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"mdsd.RPG.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerrain"


    // $ANTLR start "entryRuleRelations"
    // InternalRPG.g:1117:1: entryRuleRelations returns [EObject current=null] : iv_ruleRelations= ruleRelations EOF ;
    public final EObject entryRuleRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelations = null;


        try {
            // InternalRPG.g:1117:50: (iv_ruleRelations= ruleRelations EOF )
            // InternalRPG.g:1118:2: iv_ruleRelations= ruleRelations EOF
            {
             newCompositeNode(grammarAccess.getRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelations=ruleRelations();

            state._fsp--;

             current =iv_ruleRelations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelations"


    // $ANTLR start "ruleRelations"
    // InternalRPG.g:1124:1: ruleRelations returns [EObject current=null] : (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) ;
    public final EObject ruleRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1130:2: ( (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) )
            // InternalRPG.g:1131:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            {
            // InternalRPG.g:1131:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            // InternalRPG.g:1132:3: otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationsAccess().getRelationsKeyword_0());
            		
            // InternalRPG.g:1136:3: ( (lv_type_1_0= ruleType ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRPG.g:1137:4: (lv_type_1_0= ruleType )
            	    {
            	    // InternalRPG.g:1137:4: (lv_type_1_0= ruleType )
            	    // InternalRPG.g:1138:5: lv_type_1_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_type_1_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"type",
            	    						lv_type_1_0,
            	    						"mdsd.RPG.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelations"


    // $ANTLR start "entryRuleType"
    // InternalRPG.g:1159:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRPG.g:1159:45: (iv_ruleType= ruleType EOF )
            // InternalRPG.g:1160:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRPG.g:1166:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_tExpression_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1172:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) )
            // InternalRPG.g:1173:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            {
            // InternalRPG.g:1173:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            // InternalRPG.g:1174:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalRPG.g:1178:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1179:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1179:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1180:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:1196:3: ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRPG.g:1197:4: (lv_tExpression_2_0= ruleTypeExpression )
                    {
                    // InternalRPG.g:1197:4: (lv_tExpression_2_0= ruleTypeExpression )
                    // InternalRPG.g:1198:5: lv_tExpression_2_0= ruleTypeExpression
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tExpression_2_0=ruleTypeExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"tExpression",
                    						lv_tExpression_2_0,
                    						"mdsd.RPG.TypeExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeExpression"
    // InternalRPG.g:1219:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // InternalRPG.g:1219:55: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // InternalRPG.g:1220:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
             newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;

             current =iv_ruleTypeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // InternalRPG.g:1226:1: ruleTypeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRPG.g:1232:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) )
            // InternalRPG.g:1233:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            {
            // InternalRPG.g:1233:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            // InternalRPG.g:1234:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            {
            // InternalRPG.g:1234:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPG.g:1235:4: (otherlv_0= RULE_ID )
            {
            // InternalRPG.g:1235:4: (otherlv_0= RULE_ID )
            // InternalRPG.g:1236:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0());
            				

            }


            }

            // InternalRPG.g:1247:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRPG.g:1248:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRPG.g:1252:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalRPG.g:1253:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalRPG.g:1253:5: (otherlv_2= RULE_ID )
            	    // InternalRPG.g:1254:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_2, grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2());
            		
            // InternalRPG.g:1270:3: ( (otherlv_4= RULE_ID ) )
            // InternalRPG.g:1271:4: (otherlv_4= RULE_ID )
            {
            // InternalRPG.g:1271:4: (otherlv_4= RULE_ID )
            // InternalRPG.g:1272:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_4, grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0());
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4());
            		
            // InternalRPG.g:1287:3: ( (otherlv_6= RULE_ID ) )
            // InternalRPG.g:1288:4: (otherlv_6= RULE_ID )
            {
            // InternalRPG.g:1288:4: (otherlv_6= RULE_ID )
            // InternalRPG.g:1289:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_6, grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0());
            				

            }


            }

            // InternalRPG.g:1300:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRPG.g:1301:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,30,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRPG.g:1305:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalRPG.g:1306:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalRPG.g:1306:5: (otherlv_8= RULE_ID )
            	    // InternalRPG.g:1307:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_8, grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleMoves"
    // InternalRPG.g:1323:1: entryRuleMoves returns [EObject current=null] : iv_ruleMoves= ruleMoves EOF ;
    public final EObject entryRuleMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoves = null;


        try {
            // InternalRPG.g:1323:46: (iv_ruleMoves= ruleMoves EOF )
            // InternalRPG.g:1324:2: iv_ruleMoves= ruleMoves EOF
            {
             newCompositeNode(grammarAccess.getMovesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoves=ruleMoves();

            state._fsp--;

             current =iv_ruleMoves; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoves"


    // $ANTLR start "ruleMoves"
    // InternalRPG.g:1330:1: ruleMoves returns [EObject current=null] : (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) ;
    public final EObject ruleMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_move_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1336:2: ( (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) )
            // InternalRPG.g:1337:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            {
            // InternalRPG.g:1337:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            // InternalRPG.g:1338:3: otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMovesAccess().getMovesKeyword_0());
            		
            // InternalRPG.g:1342:3: ( (lv_move_1_0= ruleMove ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRPG.g:1343:4: (lv_move_1_0= ruleMove )
            	    {
            	    // InternalRPG.g:1343:4: (lv_move_1_0= ruleMove )
            	    // InternalRPG.g:1344:5: lv_move_1_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_move_1_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"move",
            	    						lv_move_1_0,
            	    						"mdsd.RPG.Move");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoves"


    // $ANTLR start "entryRuleMove"
    // InternalRPG.g:1365:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRPG.g:1365:45: (iv_ruleMove= ruleMove EOF )
            // InternalRPG.g:1366:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRPG.g:1372:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) )* ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_mEffect_4_0 = null;

        EObject lv_bEffect_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1378:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) )* ) )
            // InternalRPG.g:1379:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) )* )
            {
            // InternalRPG.g:1379:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) )* )
            // InternalRPG.g:1380:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalRPG.g:1384:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1385:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1385:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1386:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:1402:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRPG.g:1403:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRPG.g:1403:4: (lv_eType_2_0= ruleEType )
            // InternalRPG.g:1404:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"mdsd.RPG.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:1421:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRPG.g:1422:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRPG.g:1422:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRPG.g:1423:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_att_3_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_3_0,
            	    						"mdsd.RPG.AltAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalRPG.g:1440:3: ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==16) ) {
                        alt17=1;
                    }
                    else if ( (LA17_2==15) ) {
                        alt17=2;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalRPG.g:1441:4: ( (lv_mEffect_4_0= ruleMEffect ) )
            	    {
            	    // InternalRPG.g:1441:4: ( (lv_mEffect_4_0= ruleMEffect ) )
            	    // InternalRPG.g:1442:5: (lv_mEffect_4_0= ruleMEffect )
            	    {
            	    // InternalRPG.g:1442:5: (lv_mEffect_4_0= ruleMEffect )
            	    // InternalRPG.g:1443:6: lv_mEffect_4_0= ruleMEffect
            	    {

            	    						newCompositeNode(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_mEffect_4_0=ruleMEffect();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoveRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mEffect",
            	    							lv_mEffect_4_0,
            	    							"mdsd.RPG.MEffect");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRPG.g:1461:4: ( (lv_bEffect_5_0= ruleBEffect ) )
            	    {
            	    // InternalRPG.g:1461:4: ( (lv_bEffect_5_0= ruleBEffect ) )
            	    // InternalRPG.g:1462:5: (lv_bEffect_5_0= ruleBEffect )
            	    {
            	    // InternalRPG.g:1462:5: (lv_bEffect_5_0= ruleBEffect )
            	    // InternalRPG.g:1463:6: lv_bEffect_5_0= ruleBEffect
            	    {

            	    						newCompositeNode(grammarAccess.getMoveAccess().getBEffectBEffectParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_bEffect_5_0=ruleBEffect();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoveRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bEffect",
            	    							lv_bEffect_5_0,
            	    							"mdsd.RPG.BEffect");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleMEffect"
    // InternalRPG.g:1485:1: entryRuleMEffect returns [EObject current=null] : iv_ruleMEffect= ruleMEffect EOF ;
    public final EObject entryRuleMEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEffect = null;


        try {
            // InternalRPG.g:1485:48: (iv_ruleMEffect= ruleMEffect EOF )
            // InternalRPG.g:1486:2: iv_ruleMEffect= ruleMEffect EOF
            {
             newCompositeNode(grammarAccess.getMEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMEffect=ruleMEffect();

            state._fsp--;

             current =iv_ruleMEffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMEffect"


    // $ANTLR start "ruleMEffect"
    // InternalRPG.g:1492:1: ruleMEffect returns [EObject current=null] : (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRPG.g:1498:2: ( (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRPG.g:1499:2: (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRPG.g:1499:2: (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) )
            // InternalRPG.g:1500:3: otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMEffectAccess().getEffectKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMEffectAccess().getMoveKeyword_1());
            		
            // InternalRPG.g:1508:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPG.g:1509:4: (otherlv_2= RULE_ID )
            {
            // InternalRPG.g:1509:4: (otherlv_2= RULE_ID )
            // InternalRPG.g:1510:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMEffectRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getMEffectAccess().getMoveENameMoveECrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMEffect"


    // $ANTLR start "entryRuleBEffect"
    // InternalRPG.g:1525:1: entryRuleBEffect returns [EObject current=null] : iv_ruleBEffect= ruleBEffect EOF ;
    public final EObject entryRuleBEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBEffect = null;


        try {
            // InternalRPG.g:1525:48: (iv_ruleBEffect= ruleBEffect EOF )
            // InternalRPG.g:1526:2: iv_ruleBEffect= ruleBEffect EOF
            {
             newCompositeNode(grammarAccess.getBEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBEffect=ruleBEffect();

            state._fsp--;

             current =iv_ruleBEffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBEffect"


    // $ANTLR start "ruleBEffect"
    // InternalRPG.g:1532:1: ruleBEffect returns [EObject current=null] : (otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleBEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRPG.g:1538:2: ( (otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRPG.g:1539:2: (otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRPG.g:1539:2: (otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) ) )
            // InternalRPG.g:1540:3: otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getBEffectAccess().getEffectKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBEffectAccess().getBuffKeyword_1());
            		
            // InternalRPG.g:1548:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPG.g:1549:4: (otherlv_2= RULE_ID )
            {
            // InternalRPG.g:1549:4: (otherlv_2= RULE_ID )
            // InternalRPG.g:1550:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBEffectRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getBEffectAccess().getBuffENameBuffCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBEffect"


    // $ANTLR start "entryRuleEType"
    // InternalRPG.g:1565:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // InternalRPG.g:1565:46: (iv_ruleEType= ruleEType EOF )
            // InternalRPG.g:1566:2: iv_ruleEType= ruleEType EOF
            {
             newCompositeNode(grammarAccess.getETypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEType=ruleEType();

            state._fsp--;

             current =iv_ruleEType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEType"


    // $ANTLR start "ruleEType"
    // InternalRPG.g:1572:1: ruleEType returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:1578:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRPG.g:1579:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRPG.g:1579:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            // InternalRPG.g:1580:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getTypeKeyword_0());
            		
            // InternalRPG.g:1584:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:1585:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:1585:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:1586:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getETypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEType"


    // $ANTLR start "entryRuleAttributeValues"
    // InternalRPG.g:1601:1: entryRuleAttributeValues returns [EObject current=null] : iv_ruleAttributeValues= ruleAttributeValues EOF ;
    public final EObject entryRuleAttributeValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValues = null;


        try {
            // InternalRPG.g:1601:56: (iv_ruleAttributeValues= ruleAttributeValues EOF )
            // InternalRPG.g:1602:2: iv_ruleAttributeValues= ruleAttributeValues EOF
            {
             newCompositeNode(grammarAccess.getAttributeValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValues=ruleAttributeValues();

            state._fsp--;

             current =iv_ruleAttributeValues; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValues"


    // $ANTLR start "ruleAttributeValues"
    // InternalRPG.g:1608:1: ruleAttributeValues returns [EObject current=null] : (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) ;
    public final EObject ruleAttributeValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_lTypes_1_0 = null;

        EObject lv_an_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1614:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) )
            // InternalRPG.g:1615:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            {
            // InternalRPG.g:1615:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            // InternalRPG.g:1616:3: otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeValuesAccess().getIsKeyword_0());
            		
            // InternalRPG.g:1620:3: ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=55 && LA18_0<=56)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRPG.g:1621:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    {
                    // InternalRPG.g:1621:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    // InternalRPG.g:1622:5: (lv_lTypes_1_0= ruleLegalType )
                    {
                    // InternalRPG.g:1622:5: (lv_lTypes_1_0= ruleLegalType )
                    // InternalRPG.g:1623:6: lv_lTypes_1_0= ruleLegalType
                    {

                    						newCompositeNode(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lTypes_1_0=ruleLegalType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                    						}
                    						set(
                    							current,
                    							"lTypes",
                    							lv_lTypes_1_0,
                    							"mdsd.RPG.LegalType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1641:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    {
                    // InternalRPG.g:1641:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    // InternalRPG.g:1642:5: (lv_an_2_0= ruleActualNumbers )
                    {
                    // InternalRPG.g:1642:5: (lv_an_2_0= ruleActualNumbers )
                    // InternalRPG.g:1643:6: lv_an_2_0= ruleActualNumbers
                    {

                    						newCompositeNode(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_an_2_0=ruleActualNumbers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                    						}
                    						set(
                    							current,
                    							"an",
                    							lv_an_2_0,
                    							"mdsd.RPG.ActualNumbers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValues"


    // $ANTLR start "entryRuleAltAttribute"
    // InternalRPG.g:1665:1: entryRuleAltAttribute returns [EObject current=null] : iv_ruleAltAttribute= ruleAltAttribute EOF ;
    public final EObject entryRuleAltAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltAttribute = null;


        try {
            // InternalRPG.g:1665:53: (iv_ruleAltAttribute= ruleAltAttribute EOF )
            // InternalRPG.g:1666:2: iv_ruleAltAttribute= ruleAltAttribute EOF
            {
             newCompositeNode(grammarAccess.getAltAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAltAttribute=ruleAltAttribute();

            state._fsp--;

             current =iv_ruleAltAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAltAttribute"


    // $ANTLR start "ruleAltAttribute"
    // InternalRPG.g:1672:1: ruleAltAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) ;
    public final EObject ruleAltAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_av_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1678:2: ( (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) )
            // InternalRPG.g:1679:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            {
            // InternalRPG.g:1679:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            // InternalRPG.g:1680:3: otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRPG.g:1684:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:1685:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:1685:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:1686:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAltAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRPG.g:1697:3: ( (lv_av_2_0= ruleAttributeValues ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRPG.g:1698:4: (lv_av_2_0= ruleAttributeValues )
                    {
                    // InternalRPG.g:1698:4: (lv_av_2_0= ruleAttributeValues )
                    // InternalRPG.g:1699:5: lv_av_2_0= ruleAttributeValues
                    {

                    					newCompositeNode(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_av_2_0=ruleAttributeValues();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAltAttributeRule());
                    					}
                    					set(
                    						current,
                    						"av",
                    						lv_av_2_0,
                    						"mdsd.RPG.AttributeValues");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAltAttribute"


    // $ANTLR start "entryRuleEntities"
    // InternalRPG.g:1720:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalRPG.g:1720:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalRPG.g:1721:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalRPG.g:1727:1: ruleEntities returns [EObject current=null] : (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1733:2: ( (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) )
            // InternalRPG.g:1734:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            {
            // InternalRPG.g:1734:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            // InternalRPG.g:1735:3: otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+
            {
            otherlv_0=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitiesAccess().getEntitiesKeyword_0());
            		
            // InternalRPG.g:1739:3: ( (lv_entity_1_0= ruleEntity ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRPG.g:1740:4: (lv_entity_1_0= ruleEntity )
            	    {
            	    // InternalRPG.g:1740:4: (lv_entity_1_0= ruleEntity )
            	    // InternalRPG.g:1741:5: lv_entity_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_entity_1_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity",
            	    						lv_entity_1_0,
            	    						"mdsd.RPG.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleDeath"
    // InternalRPG.g:1762:1: entryRuleDeath returns [EObject current=null] : iv_ruleDeath= ruleDeath EOF ;
    public final EObject entryRuleDeath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeath = null;


        try {
            // InternalRPG.g:1762:46: (iv_ruleDeath= ruleDeath EOF )
            // InternalRPG.g:1763:2: iv_ruleDeath= ruleDeath EOF
            {
             newCompositeNode(grammarAccess.getDeathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeath=ruleDeath();

            state._fsp--;

             current =iv_ruleDeath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeath"


    // $ANTLR start "ruleDeath"
    // InternalRPG.g:1769:1: ruleDeath returns [EObject current=null] : (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) ) ;
    public final EObject ruleDeath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_req_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1775:2: ( (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) ) )
            // InternalRPG.g:1776:2: (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) )
            {
            // InternalRPG.g:1776:2: (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) )
            // InternalRPG.g:1777:3: otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getDeathAccess().getDeathKeyword_0());
            		
            // InternalRPG.g:1781:3: ( (lv_req_1_0= ruleRequire ) )
            // InternalRPG.g:1782:4: (lv_req_1_0= ruleRequire )
            {
            // InternalRPG.g:1782:4: (lv_req_1_0= ruleRequire )
            // InternalRPG.g:1783:5: lv_req_1_0= ruleRequire
            {

            					newCompositeNode(grammarAccess.getDeathAccess().getReqRequireParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_req_1_0=ruleRequire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeathRule());
            					}
            					set(
            						current,
            						"req",
            						lv_req_1_0,
            						"mdsd.RPG.Require");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeath"


    // $ANTLR start "entryRuleEntity"
    // InternalRPG.g:1804:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRPG.g:1804:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRPG.g:1805:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRPG.g:1811:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_attributes_3_0= ruleEntityAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ( (lv_localEffects_5_0= ruleBuff ) )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_eMoves_4_0 = null;

        EObject lv_localEffects_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1817:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_attributes_3_0= ruleEntityAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ( (lv_localEffects_5_0= ruleBuff ) )? ) )
            // InternalRPG.g:1818:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_attributes_3_0= ruleEntityAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ( (lv_localEffects_5_0= ruleBuff ) )? )
            {
            // InternalRPG.g:1818:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_attributes_3_0= ruleEntityAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ( (lv_localEffects_5_0= ruleBuff ) )? )
            // InternalRPG.g:1819:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_attributes_3_0= ruleEntityAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ( (lv_localEffects_5_0= ruleBuff ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRPG.g:1823:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1824:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1824:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1825:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:1841:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRPG.g:1842:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRPG.g:1842:4: (lv_eType_2_0= ruleEType )
            // InternalRPG.g:1843:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"mdsd.RPG.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:1860:3: ( (lv_attributes_3_0= ruleEntityAttribute ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22||LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRPG.g:1861:4: (lv_attributes_3_0= ruleEntityAttribute )
            	    {
            	    // InternalRPG.g:1861:4: (lv_attributes_3_0= ruleEntityAttribute )
            	    // InternalRPG.g:1862:5: lv_attributes_3_0= ruleEntityAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesEntityAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_attributes_3_0=ruleEntityAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"mdsd.RPG.EntityAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalRPG.g:1879:3: ( (lv_eMoves_4_0= ruleEntityMoves ) )
            // InternalRPG.g:1880:4: (lv_eMoves_4_0= ruleEntityMoves )
            {
            // InternalRPG.g:1880:4: (lv_eMoves_4_0= ruleEntityMoves )
            // InternalRPG.g:1881:5: lv_eMoves_4_0= ruleEntityMoves
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
            lv_eMoves_4_0=ruleEntityMoves();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"eMoves",
            						lv_eMoves_4_0,
            						"mdsd.RPG.EntityMoves");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:1898:3: ( (lv_localEffects_5_0= ruleBuff ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRPG.g:1899:4: (lv_localEffects_5_0= ruleBuff )
                    {
                    // InternalRPG.g:1899:4: (lv_localEffects_5_0= ruleBuff )
                    // InternalRPG.g:1900:5: lv_localEffects_5_0= ruleBuff
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getLocalEffectsBuffParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_localEffects_5_0=ruleBuff();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					add(
                    						current,
                    						"localEffects",
                    						lv_localEffects_5_0,
                    						"mdsd.RPG.Buff");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityAttribute"
    // InternalRPG.g:1921:1: entryRuleEntityAttribute returns [EObject current=null] : iv_ruleEntityAttribute= ruleEntityAttribute EOF ;
    public final EObject entryRuleEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityAttribute = null;


        try {
            // InternalRPG.g:1921:56: (iv_ruleEntityAttribute= ruleEntityAttribute EOF )
            // InternalRPG.g:1922:2: iv_ruleEntityAttribute= ruleEntityAttribute EOF
            {
             newCompositeNode(grammarAccess.getEntityAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityAttribute=ruleEntityAttribute();

            state._fsp--;

             current =iv_ruleEntityAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityAttribute"


    // $ANTLR start "ruleEntityAttribute"
    // InternalRPG.g:1928:1: ruleEntityAttribute returns [EObject current=null] : (this_AltAttribute_0= ruleAltAttribute | this_LocalAttribute_1= ruleLocalAttribute ) ;
    public final EObject ruleEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_AltAttribute_0 = null;

        EObject this_LocalAttribute_1 = null;



        	enterRule();

        try {
            // InternalRPG.g:1934:2: ( (this_AltAttribute_0= ruleAltAttribute | this_LocalAttribute_1= ruleLocalAttribute ) )
            // InternalRPG.g:1935:2: (this_AltAttribute_0= ruleAltAttribute | this_LocalAttribute_1= ruleLocalAttribute )
            {
            // InternalRPG.g:1935:2: (this_AltAttribute_0= ruleAltAttribute | this_LocalAttribute_1= ruleLocalAttribute )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            else if ( (LA23_0==22) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRPG.g:1936:3: this_AltAttribute_0= ruleAltAttribute
                    {

                    			newCompositeNode(grammarAccess.getEntityAttributeAccess().getAltAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AltAttribute_0=ruleAltAttribute();

                    state._fsp--;


                    			current = this_AltAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:1945:3: this_LocalAttribute_1= ruleLocalAttribute
                    {

                    			newCompositeNode(grammarAccess.getEntityAttributeAccess().getLocalAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalAttribute_1=ruleLocalAttribute();

                    state._fsp--;


                    			current = this_LocalAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityAttribute"


    // $ANTLR start "entryRuleLocalAttribute"
    // InternalRPG.g:1957:1: entryRuleLocalAttribute returns [EObject current=null] : iv_ruleLocalAttribute= ruleLocalAttribute EOF ;
    public final EObject entryRuleLocalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAttribute = null;


        try {
            // InternalRPG.g:1957:55: (iv_ruleLocalAttribute= ruleLocalAttribute EOF )
            // InternalRPG.g:1958:2: iv_ruleLocalAttribute= ruleLocalAttribute EOF
            {
             newCompositeNode(grammarAccess.getLocalAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalAttribute=ruleLocalAttribute();

            state._fsp--;

             current =iv_ruleLocalAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalAttribute"


    // $ANTLR start "ruleLocalAttribute"
    // InternalRPG.g:1964:1: ruleLocalAttribute returns [EObject current=null] : (otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aval_2_0= ruleAttributeValues ) ) ) ;
    public final EObject ruleLocalAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_aval_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1970:2: ( (otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aval_2_0= ruleAttributeValues ) ) ) )
            // InternalRPG.g:1971:2: (otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aval_2_0= ruleAttributeValues ) ) )
            {
            // InternalRPG.g:1971:2: (otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aval_2_0= ruleAttributeValues ) ) )
            // InternalRPG.g:1972:3: otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aval_2_0= ruleAttributeValues ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalAttributeAccess().getLocalKeyword_0());
            		
            // InternalRPG.g:1976:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1977:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1977:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1978:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLocalAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:1994:3: ( (lv_aval_2_0= ruleAttributeValues ) )
            // InternalRPG.g:1995:4: (lv_aval_2_0= ruleAttributeValues )
            {
            // InternalRPG.g:1995:4: (lv_aval_2_0= ruleAttributeValues )
            // InternalRPG.g:1996:5: lv_aval_2_0= ruleAttributeValues
            {

            					newCompositeNode(grammarAccess.getLocalAttributeAccess().getAvalAttributeValuesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_aval_2_0=ruleAttributeValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalAttributeRule());
            					}
            					set(
            						current,
            						"aval",
            						lv_aval_2_0,
            						"mdsd.RPG.AttributeValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalAttribute"


    // $ANTLR start "entryRuleEntityMoves"
    // InternalRPG.g:2017:1: entryRuleEntityMoves returns [EObject current=null] : iv_ruleEntityMoves= ruleEntityMoves EOF ;
    public final EObject entryRuleEntityMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoves = null;


        try {
            // InternalRPG.g:2017:52: (iv_ruleEntityMoves= ruleEntityMoves EOF )
            // InternalRPG.g:2018:2: iv_ruleEntityMoves= ruleEntityMoves EOF
            {
             newCompositeNode(grammarAccess.getEntityMovesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityMoves=ruleEntityMoves();

            state._fsp--;

             current =iv_ruleEntityMoves; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityMoves"


    // $ANTLR start "ruleEntityMoves"
    // InternalRPG.g:2024:1: ruleEntityMoves returns [EObject current=null] : (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleEntityMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:2030:2: ( (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRPG.g:2031:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRPG.g:2031:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRPG.g:2032:3: otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityMovesAccess().getMoveKeyword_0());
            		
            // InternalRPG.g:2036:3: ( (otherlv_1= RULE_ID ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRPG.g:2037:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRPG.g:2037:4: (otherlv_1= RULE_ID )
            	    // InternalRPG.g:2038:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEntityMovesRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    					newLeafNode(otherlv_1, grammarAccess.getEntityMovesAccess().getMoveMoveCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityMoves"


    // $ANTLR start "entryRuleTeams"
    // InternalRPG.g:2053:1: entryRuleTeams returns [EObject current=null] : iv_ruleTeams= ruleTeams EOF ;
    public final EObject entryRuleTeams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeams = null;


        try {
            // InternalRPG.g:2053:46: (iv_ruleTeams= ruleTeams EOF )
            // InternalRPG.g:2054:2: iv_ruleTeams= ruleTeams EOF
            {
             newCompositeNode(grammarAccess.getTeamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeams=ruleTeams();

            state._fsp--;

             current =iv_ruleTeams; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeams"


    // $ANTLR start "ruleTeams"
    // InternalRPG.g:2060:1: ruleTeams returns [EObject current=null] : (otherlv_0= 'teams' ( (lv_size_1_0= ruleTeamSize ) ) ( (lv_team_2_0= ruleTeam ) )+ ) ;
    public final EObject ruleTeams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_size_1_0 = null;

        EObject lv_team_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2066:2: ( (otherlv_0= 'teams' ( (lv_size_1_0= ruleTeamSize ) ) ( (lv_team_2_0= ruleTeam ) )+ ) )
            // InternalRPG.g:2067:2: (otherlv_0= 'teams' ( (lv_size_1_0= ruleTeamSize ) ) ( (lv_team_2_0= ruleTeam ) )+ )
            {
            // InternalRPG.g:2067:2: (otherlv_0= 'teams' ( (lv_size_1_0= ruleTeamSize ) ) ( (lv_team_2_0= ruleTeam ) )+ )
            // InternalRPG.g:2068:3: otherlv_0= 'teams' ( (lv_size_1_0= ruleTeamSize ) ) ( (lv_team_2_0= ruleTeam ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamsAccess().getTeamsKeyword_0());
            		
            // InternalRPG.g:2072:3: ( (lv_size_1_0= ruleTeamSize ) )
            // InternalRPG.g:2073:4: (lv_size_1_0= ruleTeamSize )
            {
            // InternalRPG.g:2073:4: (lv_size_1_0= ruleTeamSize )
            // InternalRPG.g:2074:5: lv_size_1_0= ruleTeamSize
            {

            					newCompositeNode(grammarAccess.getTeamsAccess().getSizeTeamSizeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_size_1_0=ruleTeamSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamsRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_1_0,
            						"mdsd.RPG.TeamSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:2091:3: ( (lv_team_2_0= ruleTeam ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRPG.g:2092:4: (lv_team_2_0= ruleTeam )
            	    {
            	    // InternalRPG.g:2092:4: (lv_team_2_0= ruleTeam )
            	    // InternalRPG.g:2093:5: lv_team_2_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_team_2_0=ruleTeam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTeamsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"team",
            	    						lv_team_2_0,
            	    						"mdsd.RPG.Team");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeams"


    // $ANTLR start "entryRuleTeamSize"
    // InternalRPG.g:2114:1: entryRuleTeamSize returns [EObject current=null] : iv_ruleTeamSize= ruleTeamSize EOF ;
    public final EObject entryRuleTeamSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeamSize = null;


        try {
            // InternalRPG.g:2114:49: (iv_ruleTeamSize= ruleTeamSize EOF )
            // InternalRPG.g:2115:2: iv_ruleTeamSize= ruleTeamSize EOF
            {
             newCompositeNode(grammarAccess.getTeamSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeamSize=ruleTeamSize();

            state._fsp--;

             current =iv_ruleTeamSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeamSize"


    // $ANTLR start "ruleTeamSize"
    // InternalRPG.g:2121:1: ruleTeamSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTeamSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2127:2: ( (otherlv_0= 'size' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalRPG.g:2128:2: (otherlv_0= 'size' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalRPG.g:2128:2: (otherlv_0= 'size' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalRPG.g:2129:3: otherlv_0= 'size' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamSizeAccess().getSizeKeyword_0());
            		
            // InternalRPG.g:2133:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalRPG.g:2134:4: (lv_value_1_0= RULE_INT )
            {
            // InternalRPG.g:2134:4: (lv_value_1_0= RULE_INT )
            // InternalRPG.g:2135:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getTeamSizeAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeamSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeamSize"


    // $ANTLR start "entryRuleTeam"
    // InternalRPG.g:2155:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalRPG.g:2155:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalRPG.g:2156:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalRPG.g:2162:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2168:2: ( (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) )
            // InternalRPG.g:2169:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            {
            // InternalRPG.g:2169:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            // InternalRPG.g:2170:3: otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalRPG.g:2174:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:2175:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:2175:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:2176:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:2192:3: ( (lv_members_2_0= ruleMembers ) )
            // InternalRPG.g:2193:4: (lv_members_2_0= ruleMembers )
            {
            // InternalRPG.g:2193:4: (lv_members_2_0= ruleMembers )
            // InternalRPG.g:2194:5: lv_members_2_0= ruleMembers
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_members_2_0=ruleMembers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"members",
            						lv_members_2_0,
            						"mdsd.RPG.Members");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleMembers"
    // InternalRPG.g:2215:1: entryRuleMembers returns [EObject current=null] : iv_ruleMembers= ruleMembers EOF ;
    public final EObject entryRuleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembers = null;


        try {
            // InternalRPG.g:2215:48: (iv_ruleMembers= ruleMembers EOF )
            // InternalRPG.g:2216:2: iv_ruleMembers= ruleMembers EOF
            {
             newCompositeNode(grammarAccess.getMembersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMembers=ruleMembers();

            state._fsp--;

             current =iv_ruleMembers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMembers"


    // $ANTLR start "ruleMembers"
    // InternalRPG.g:2222:1: ruleMembers returns [EObject current=null] : (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleMembers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:2228:2: ( (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRPG.g:2229:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRPG.g:2229:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRPG.g:2230:3: otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMembersAccess().getMembersKeyword_0());
            		
            // InternalRPG.g:2234:3: ( (otherlv_1= RULE_ID ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRPG.g:2235:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRPG.g:2235:4: (otherlv_1= RULE_ID )
            	    // InternalRPG.g:2236:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMembersRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMembers"


    // $ANTLR start "entryRuleRequire"
    // InternalRPG.g:2251:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalRPG.g:2251:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalRPG.g:2252:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalRPG.g:2258:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_log_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2264:2: ( (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) ) )
            // InternalRPG.g:2265:2: (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) )
            {
            // InternalRPG.g:2265:2: (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) )
            // InternalRPG.g:2266:3: otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalRPG.g:2270:3: ( (lv_log_1_0= ruleORcondition ) )
            // InternalRPG.g:2271:4: (lv_log_1_0= ruleORcondition )
            {
            // InternalRPG.g:2271:4: (lv_log_1_0= ruleORcondition )
            // InternalRPG.g:2272:5: lv_log_1_0= ruleORcondition
            {

            					newCompositeNode(grammarAccess.getRequireAccess().getLogORconditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_log_1_0=ruleORcondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequireRule());
            					}
            					set(
            						current,
            						"log",
            						lv_log_1_0,
            						"mdsd.RPG.ORcondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleORcondition"
    // InternalRPG.g:2293:1: entryRuleORcondition returns [EObject current=null] : iv_ruleORcondition= ruleORcondition EOF ;
    public final EObject entryRuleORcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORcondition = null;


        try {
            // InternalRPG.g:2293:52: (iv_ruleORcondition= ruleORcondition EOF )
            // InternalRPG.g:2294:2: iv_ruleORcondition= ruleORcondition EOF
            {
             newCompositeNode(grammarAccess.getORconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORcondition=ruleORcondition();

            state._fsp--;

             current =iv_ruleORcondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleORcondition"


    // $ANTLR start "ruleORcondition"
    // InternalRPG.g:2300:1: ruleORcondition returns [EObject current=null] : (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) ;
    public final EObject ruleORcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ANDcondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2306:2: ( (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) )
            // InternalRPG.g:2307:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            {
            // InternalRPG.g:2307:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            // InternalRPG.g:2308:3: this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_ANDcondition_0=ruleANDcondition();

            state._fsp--;


            			current = this_ANDcondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:2316:3: (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==41) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRPG.g:2317:4: otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getORconditionAccess().getORKeyword_1_0());
            	    			
            	    // InternalRPG.g:2321:4: ()
            	    // InternalRPG.g:2322:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getORconditionAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRPG.g:2328:4: ( (lv_right_3_0= ruleANDcondition ) )
            	    // InternalRPG.g:2329:5: (lv_right_3_0= ruleANDcondition )
            	    {
            	    // InternalRPG.g:2329:5: (lv_right_3_0= ruleANDcondition )
            	    // InternalRPG.g:2330:6: lv_right_3_0= ruleANDcondition
            	    {

            	    						newCompositeNode(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleANDcondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getORconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"mdsd.RPG.ANDcondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleORcondition"


    // $ANTLR start "entryRuleANDcondition"
    // InternalRPG.g:2352:1: entryRuleANDcondition returns [EObject current=null] : iv_ruleANDcondition= ruleANDcondition EOF ;
    public final EObject entryRuleANDcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDcondition = null;


        try {
            // InternalRPG.g:2352:53: (iv_ruleANDcondition= ruleANDcondition EOF )
            // InternalRPG.g:2353:2: iv_ruleANDcondition= ruleANDcondition EOF
            {
             newCompositeNode(grammarAccess.getANDconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANDcondition=ruleANDcondition();

            state._fsp--;

             current =iv_ruleANDcondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANDcondition"


    // $ANTLR start "ruleANDcondition"
    // InternalRPG.g:2359:1: ruleANDcondition returns [EObject current=null] : (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) ;
    public final EObject ruleANDcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Statement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2365:2: ( (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) )
            // InternalRPG.g:2366:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            {
            // InternalRPG.g:2366:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            // InternalRPG.g:2367:3: this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            {

            			newCompositeNode(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_Statement_0=ruleStatement();

            state._fsp--;


            			current = this_Statement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:2375:3: (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRPG.g:2376:4: otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getANDconditionAccess().getANDKeyword_1_0());
            	    			
            	    // InternalRPG.g:2380:4: ()
            	    // InternalRPG.g:2381:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRPG.g:2387:4: ( (lv_right_3_0= ruleStatement ) )
            	    // InternalRPG.g:2388:5: (lv_right_3_0= ruleStatement )
            	    {
            	    // InternalRPG.g:2388:5: (lv_right_3_0= ruleStatement )
            	    // InternalRPG.g:2389:6: lv_right_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getANDconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"mdsd.RPG.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRPG.g:2411:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRPG.g:2411:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRPG.g:2412:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRPG.g:2418:1: ruleStatement returns [EObject current=null] : (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumberComparing_0 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalRPG.g:2424:2: ( (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) )
            // InternalRPG.g:2425:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            {
            // InternalRPG.g:2425:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)) ) {
                alt29=1;
            }
            else if ( (LA29_0==43) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalRPG.g:2426:3: this_NumberComparing_0= ruleNumberComparing
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberComparing_0=ruleNumberComparing();

                    state._fsp--;


                    			current = this_NumberComparing_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2435:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    {
                    // InternalRPG.g:2435:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    // InternalRPG.g:2436:4: otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_44);
                    this_ORcondition_2=ruleORcondition();

                    state._fsp--;


                    				current = this_ORcondition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNumberComparing"
    // InternalRPG.g:2457:1: entryRuleNumberComparing returns [EObject current=null] : iv_ruleNumberComparing= ruleNumberComparing EOF ;
    public final EObject entryRuleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberComparing = null;


        try {
            // InternalRPG.g:2457:56: (iv_ruleNumberComparing= ruleNumberComparing EOF )
            // InternalRPG.g:2458:2: iv_ruleNumberComparing= ruleNumberComparing EOF
            {
             newCompositeNode(grammarAccess.getNumberComparingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberComparing=ruleNumberComparing();

            state._fsp--;

             current =iv_ruleNumberComparing; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberComparing"


    // $ANTLR start "ruleNumberComparing"
    // InternalRPG.g:2464:1: ruleNumberComparing returns [EObject current=null] : ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) ;
    public final EObject ruleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_comp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2470:2: ( ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) )
            // InternalRPG.g:2471:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            {
            // InternalRPG.g:2471:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            // InternalRPG.g:2472:3: ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) )
            {
            // InternalRPG.g:2472:3: ( (lv_left_0_0= ruleSum ) )
            // InternalRPG.g:2473:4: (lv_left_0_0= ruleSum )
            {
            // InternalRPG.g:2473:4: (lv_left_0_0= ruleSum )
            // InternalRPG.g:2474:5: lv_left_0_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
            lv_left_0_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"mdsd.RPG.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:2491:3: ( (lv_comp_1_0= ruleComparator ) )
            // InternalRPG.g:2492:4: (lv_comp_1_0= ruleComparator )
            {
            // InternalRPG.g:2492:4: (lv_comp_1_0= ruleComparator )
            // InternalRPG.g:2493:5: lv_comp_1_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_comp_1_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_1_0,
            						"mdsd.RPG.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:2510:3: ( (lv_right_2_0= ruleSum ) )
            // InternalRPG.g:2511:4: (lv_right_2_0= ruleSum )
            {
            // InternalRPG.g:2511:4: (lv_right_2_0= ruleSum )
            // InternalRPG.g:2512:5: lv_right_2_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"mdsd.RPG.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberComparing"


    // $ANTLR start "entryRuleComparator"
    // InternalRPG.g:2533:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalRPG.g:2533:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalRPG.g:2534:2: iv_ruleComparator= ruleComparator EOF
            {
             newCompositeNode(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparator=ruleComparator();

            state._fsp--;

             current =iv_ruleComparator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalRPG.g:2540:1: ruleComparator returns [EObject current=null] : ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalRPG.g:2546:2: ( ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) )
            // InternalRPG.g:2547:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            {
            // InternalRPG.g:2547:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt30=1;
                }
                break;
            case 45:
                {
                alt30=2;
                }
                break;
            case 46:
                {
                alt30=3;
                }
                break;
            case 47:
                {
                alt30=4;
                }
                break;
            case 48:
                {
                alt30=5;
                }
                break;
            case 49:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalRPG.g:2548:3: ( () otherlv_1= '<' )
                    {
                    // InternalRPG.g:2548:3: ( () otherlv_1= '<' )
                    // InternalRPG.g:2549:4: () otherlv_1= '<'
                    {
                    // InternalRPG.g:2549:4: ()
                    // InternalRPG.g:2550:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:2562:3: ( () otherlv_3= '<=' )
                    {
                    // InternalRPG.g:2562:3: ( () otherlv_3= '<=' )
                    // InternalRPG.g:2563:4: () otherlv_3= '<='
                    {
                    // InternalRPG.g:2563:4: ()
                    // InternalRPG.g:2564:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerEqAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPG.g:2576:3: ( () otherlv_5= '==' )
                    {
                    // InternalRPG.g:2576:3: ( () otherlv_5= '==' )
                    // InternalRPG.g:2577:4: () otherlv_5= '=='
                    {
                    // InternalRPG.g:2577:4: ()
                    // InternalRPG.g:2578:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getEqAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPG.g:2590:3: ( () otherlv_7= '>=' )
                    {
                    // InternalRPG.g:2590:3: ( () otherlv_7= '>=' )
                    // InternalRPG.g:2591:4: () otherlv_7= '>='
                    {
                    // InternalRPG.g:2591:4: ()
                    // InternalRPG.g:2592:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerEqAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRPG.g:2604:3: ( () otherlv_9= '>' )
                    {
                    // InternalRPG.g:2604:3: ( () otherlv_9= '>' )
                    // InternalRPG.g:2605:4: () otherlv_9= '>'
                    {
                    // InternalRPG.g:2605:4: ()
                    // InternalRPG.g:2606:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRPG.g:2618:3: ( () otherlv_11= '!=' )
                    {
                    // InternalRPG.g:2618:3: ( () otherlv_11= '!=' )
                    // InternalRPG.g:2619:4: () otherlv_11= '!='
                    {
                    // InternalRPG.g:2619:4: ()
                    // InternalRPG.g:2620:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getNEqAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSum"
    // InternalRPG.g:2635:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalRPG.g:2635:44: (iv_ruleSum= ruleSum EOF )
            // InternalRPG.g:2636:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalRPG.g:2642:1: ruleSum returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2648:2: ( (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) )
            // InternalRPG.g:2649:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            {
            // InternalRPG.g:2649:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            // InternalRPG.g:2650:3: this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:2658:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=50 && LA32_0<=51)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRPG.g:2659:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) )
            	    {
            	    // InternalRPG.g:2659:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==50) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==51) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalRPG.g:2660:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRPG.g:2660:5: (otherlv_1= '+' () )
            	            // InternalRPG.g:2661:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,50,FOLLOW_15); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRPG.g:2665:6: ()
            	            // InternalRPG.g:2666:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRPG.g:2674:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRPG.g:2674:5: (otherlv_3= '-' () )
            	            // InternalRPG.g:2675:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,51,FOLLOW_15); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRPG.g:2679:6: ()
            	            // InternalRPG.g:2680:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRPG.g:2688:4: ( (lv_right_5_0= ruleMultiply ) )
            	    // InternalRPG.g:2689:5: (lv_right_5_0= ruleMultiply )
            	    {
            	    // InternalRPG.g:2689:5: (lv_right_5_0= ruleMultiply )
            	    // InternalRPG.g:2690:6: lv_right_5_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_right_5_0=ruleMultiply();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"mdsd.RPG.Multiply");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMultiply"
    // InternalRPG.g:2712:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalRPG.g:2712:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalRPG.g:2713:2: iv_ruleMultiply= ruleMultiply EOF
            {
             newCompositeNode(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiply=ruleMultiply();

            state._fsp--;

             current =iv_ruleMultiply; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalRPG.g:2719:1: ruleMultiply returns [EObject current=null] : (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AtomicNumber_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2725:2: ( (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) )
            // InternalRPG.g:2726:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            {
            // InternalRPG.g:2726:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            // InternalRPG.g:2727:3: this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_AtomicNumber_0=ruleAtomicNumber();

            state._fsp--;


            			current = this_AtomicNumber_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:2735:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=52 && LA34_0<=53)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRPG.g:2736:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) )
            	    {
            	    // InternalRPG.g:2736:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==52) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==53) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalRPG.g:2737:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRPG.g:2737:5: (otherlv_1= '*' () )
            	            // InternalRPG.g:2738:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,52,FOLLOW_15); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRPG.g:2742:6: ()
            	            // InternalRPG.g:2743:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRPG.g:2751:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRPG.g:2751:5: (otherlv_3= '/' () )
            	            // InternalRPG.g:2752:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_15); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRPG.g:2756:6: ()
            	            // InternalRPG.g:2757:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRPG.g:2765:4: ( (lv_right_5_0= ruleAtomicNumber ) )
            	    // InternalRPG.g:2766:5: (lv_right_5_0= ruleAtomicNumber )
            	    {
            	    // InternalRPG.g:2766:5: (lv_right_5_0= ruleAtomicNumber )
            	    // InternalRPG.g:2767:6: lv_right_5_0= ruleAtomicNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_right_5_0=ruleAtomicNumber();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"mdsd.RPG.AtomicNumber");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleAtomicNumber"
    // InternalRPG.g:2789:1: entryRuleAtomicNumber returns [EObject current=null] : iv_ruleAtomicNumber= ruleAtomicNumber EOF ;
    public final EObject entryRuleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicNumber = null;


        try {
            // InternalRPG.g:2789:53: (iv_ruleAtomicNumber= ruleAtomicNumber EOF )
            // InternalRPG.g:2790:2: iv_ruleAtomicNumber= ruleAtomicNumber EOF
            {
             newCompositeNode(grammarAccess.getAtomicNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicNumber=ruleAtomicNumber();

            state._fsp--;

             current =iv_ruleAtomicNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicNumber"


    // $ANTLR start "ruleAtomicNumber"
    // InternalRPG.g:2796:1: ruleAtomicNumber returns [EObject current=null] : (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) ;
    public final EObject ruleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject this_ActualNumbers_0 = null;

        EObject this_NameAttribute_1 = null;



        	enterRule();

        try {
            // InternalRPG.g:2802:2: ( (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) )
            // InternalRPG.g:2803:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            {
            // InternalRPG.g:2803:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalRPG.g:2804:3: this_ActualNumbers_0= ruleActualNumbers
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActualNumbers_0=ruleActualNumbers();

                    state._fsp--;


                    			current = this_ActualNumbers_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2813:3: this_NameAttribute_1= ruleNameAttribute
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameAttribute_1=ruleNameAttribute();

                    state._fsp--;


                    			current = this_NameAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicNumber"


    // $ANTLR start "entryRuleActualNumbers"
    // InternalRPG.g:2825:1: entryRuleActualNumbers returns [EObject current=null] : iv_ruleActualNumbers= ruleActualNumbers EOF ;
    public final EObject entryRuleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualNumbers = null;


        try {
            // InternalRPG.g:2825:54: (iv_ruleActualNumbers= ruleActualNumbers EOF )
            // InternalRPG.g:2826:2: iv_ruleActualNumbers= ruleActualNumbers EOF
            {
             newCompositeNode(grammarAccess.getActualNumbersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActualNumbers=ruleActualNumbers();

            state._fsp--;

             current =iv_ruleActualNumbers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActualNumbers"


    // $ANTLR start "ruleActualNumbers"
    // InternalRPG.g:2832:1: ruleActualNumbers returns [EObject current=null] : (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) ;
    public final EObject ruleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject this_FloatNum_0 = null;

        EObject this_IntNum_1 = null;



        	enterRule();

        try {
            // InternalRPG.g:2838:2: ( (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) )
            // InternalRPG.g:2839:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            {
            // InternalRPG.g:2839:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==54) ) {
                    alt36=1;
                }
                else if ( (LA36_1==EOF||(LA36_1>=12 && LA36_1<=14)||LA36_1==16||(LA36_1>=18 && LA36_1<=19)||(LA36_1>=21 && LA36_1<=25)||LA36_1==28||(LA36_1>=31 && LA36_1<=36)||(LA36_1>=41 && LA36_1<=42)||(LA36_1>=44 && LA36_1<=53)) ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalRPG.g:2840:3: this_FloatNum_0= ruleFloatNum
                    {

                    			newCompositeNode(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatNum_0=ruleFloatNum();

                    state._fsp--;


                    			current = this_FloatNum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2849:3: this_IntNum_1= ruleIntNum
                    {

                    			newCompositeNode(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntNum_1=ruleIntNum();

                    state._fsp--;


                    			current = this_IntNum_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActualNumbers"


    // $ANTLR start "entryRuleNameAttribute"
    // InternalRPG.g:2861:1: entryRuleNameAttribute returns [EObject current=null] : iv_ruleNameAttribute= ruleNameAttribute EOF ;
    public final EObject entryRuleNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttribute = null;


        try {
            // InternalRPG.g:2861:54: (iv_ruleNameAttribute= ruleNameAttribute EOF )
            // InternalRPG.g:2862:2: iv_ruleNameAttribute= ruleNameAttribute EOF
            {
             newCompositeNode(grammarAccess.getNameAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameAttribute=ruleNameAttribute();

            state._fsp--;

             current =iv_ruleNameAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameAttribute"


    // $ANTLR start "ruleNameAttribute"
    // InternalRPG.g:2868:1: ruleNameAttribute returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2874:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRPG.g:2875:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRPG.g:2875:2: ( (otherlv_0= RULE_ID ) )
            // InternalRPG.g:2876:3: (otherlv_0= RULE_ID )
            {
            // InternalRPG.g:2876:3: (otherlv_0= RULE_ID )
            // InternalRPG.g:2877:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNameAttributeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameAttribute"


    // $ANTLR start "entryRuleIntNum"
    // InternalRPG.g:2891:1: entryRuleIntNum returns [EObject current=null] : iv_ruleIntNum= ruleIntNum EOF ;
    public final EObject entryRuleIntNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntNum = null;


        try {
            // InternalRPG.g:2891:47: (iv_ruleIntNum= ruleIntNum EOF )
            // InternalRPG.g:2892:2: iv_ruleIntNum= ruleIntNum EOF
            {
             newCompositeNode(grammarAccess.getIntNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntNum=ruleIntNum();

            state._fsp--;

             current =iv_ruleIntNum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntNum"


    // $ANTLR start "ruleIntNum"
    // InternalRPG.g:2898:1: ruleIntNum returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntNum() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2904:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRPG.g:2905:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRPG.g:2905:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRPG.g:2906:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRPG.g:2906:3: (lv_value_0_0= RULE_INT )
            // InternalRPG.g:2907:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntNumRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntNum"


    // $ANTLR start "entryRuleFloatNum"
    // InternalRPG.g:2926:1: entryRuleFloatNum returns [EObject current=null] : iv_ruleFloatNum= ruleFloatNum EOF ;
    public final EObject entryRuleFloatNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatNum = null;


        try {
            // InternalRPG.g:2926:49: (iv_ruleFloatNum= ruleFloatNum EOF )
            // InternalRPG.g:2927:2: iv_ruleFloatNum= ruleFloatNum EOF
            {
             newCompositeNode(grammarAccess.getFloatNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatNum=ruleFloatNum();

            state._fsp--;

             current =iv_ruleFloatNum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatNum"


    // $ANTLR start "ruleFloatNum"
    // InternalRPG.g:2933:1: ruleFloatNum returns [EObject current=null] : ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFloatNum() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2939:2: ( ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) )
            // InternalRPG.g:2940:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            {
            // InternalRPG.g:2940:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            // InternalRPG.g:2941:3: ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
            {
            // InternalRPG.g:2941:3: ( (lv_i_0_0= RULE_INT ) )
            // InternalRPG.g:2942:4: (lv_i_0_0= RULE_INT )
            {
            // InternalRPG.g:2942:4: (lv_i_0_0= RULE_INT )
            // InternalRPG.g:2943:5: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_48); 

            					newLeafNode(lv_i_0_0, grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatNumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"i",
            						lv_i_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatNumAccess().getFullStopKeyword_1());
            		
            // InternalRPG.g:2963:3: ( (lv_decimal_2_0= RULE_INT ) )
            // InternalRPG.g:2964:4: (lv_decimal_2_0= RULE_INT )
            {
            // InternalRPG.g:2964:4: (lv_decimal_2_0= RULE_INT )
            // InternalRPG.g:2965:5: lv_decimal_2_0= RULE_INT
            {
            lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_decimal_2_0, grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatNumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"decimal",
            						lv_decimal_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatNum"


    // $ANTLR start "entryRuleLegalType"
    // InternalRPG.g:2985:1: entryRuleLegalType returns [String current=null] : iv_ruleLegalType= ruleLegalType EOF ;
    public final String entryRuleLegalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLegalType = null;


        try {
            // InternalRPG.g:2985:49: (iv_ruleLegalType= ruleLegalType EOF )
            // InternalRPG.g:2986:2: iv_ruleLegalType= ruleLegalType EOF
            {
             newCompositeNode(grammarAccess.getLegalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLegalType=ruleLegalType();

            state._fsp--;

             current =iv_ruleLegalType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLegalType"


    // $ANTLR start "ruleLegalType"
    // InternalRPG.g:2992:1: ruleLegalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Float' | kw= 'Integer' ) ;
    public final AntlrDatatypeRuleToken ruleLegalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRPG.g:2998:2: ( (kw= 'Float' | kw= 'Integer' ) )
            // InternalRPG.g:2999:2: (kw= 'Float' | kw= 'Integer' )
            {
            // InternalRPG.g:2999:2: (kw= 'Float' | kw= 'Integer' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            else if ( (LA37_0==56) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalRPG.g:3000:3: kw= 'Float'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getFloatKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:3006:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLegalType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001712803002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000620000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000002A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000620002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001004002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0180000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001410000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0003E00080000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});

}