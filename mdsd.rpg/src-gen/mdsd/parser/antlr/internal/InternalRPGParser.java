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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'location'", "'opponents'", "'relations'", "'type'", "','", "'<'", "'moves'", "'move'", "'attributes'", "'attribute'", "'effect'", "'is'", "'if'", "'then'", "'='", "'entities'", "'death'", "'entity'", "'teams'", "'team'", "'members'", "'battling_member_count'", "'require'", "'OR'", "'AND'", "'('", "')'", "'<='", "'=='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'self.'", "'.'", "'Float'", "'Integer'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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

                if ( (LA1_0==12||LA1_0==14||LA1_0==18||LA1_0==20||(LA1_0>=27 && LA1_0<=28)||LA1_0==30) ) {
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
    // InternalRPG.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Attributes_5= ruleAttributes | this_Death_6= ruleDeath ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Locations_0 = null;

        EObject this_Relations_1 = null;

        EObject this_Moves_2 = null;

        EObject this_Entities_3 = null;

        EObject this_Teams_4 = null;

        EObject this_Attributes_5 = null;

        EObject this_Death_6 = null;



        	enterRule();

        try {
            // InternalRPG.g:137:2: ( (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Attributes_5= ruleAttributes | this_Death_6= ruleDeath ) )
            // InternalRPG.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Attributes_5= ruleAttributes | this_Death_6= ruleDeath )
            {
            // InternalRPG.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Attributes_5= ruleAttributes | this_Death_6= ruleDeath )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 30:
                {
                alt2=5;
                }
                break;
            case 20:
                {
                alt2=6;
                }
                break;
            case 28:
                {
                alt2=7;
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
                    // InternalRPG.g:184:3: this_Attributes_5= ruleAttributes
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attributes_5=ruleAttributes();

                    state._fsp--;


                    			current = this_Attributes_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRPG.g:193:3: this_Death_6= ruleDeath
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Death_6=ruleDeath();

                    state._fsp--;


                    			current = this_Death_6;
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


    // $ANTLR start "entryRuleLocations"
    // InternalRPG.g:205:1: entryRuleLocations returns [EObject current=null] : iv_ruleLocations= ruleLocations EOF ;
    public final EObject entryRuleLocations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocations = null;


        try {
            // InternalRPG.g:205:50: (iv_ruleLocations= ruleLocations EOF )
            // InternalRPG.g:206:2: iv_ruleLocations= ruleLocations EOF
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
    // InternalRPG.g:212:1: ruleLocations returns [EObject current=null] : (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) ;
    public final EObject ruleLocations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loc_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:218:2: ( (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) )
            // InternalRPG.g:219:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            {
            // InternalRPG.g:219:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            // InternalRPG.g:220:3: otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationsAccess().getLocationKeyword_0());
            		
            // InternalRPG.g:224:3: ( (lv_loc_1_0= ruleLoc ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRPG.g:225:4: (lv_loc_1_0= ruleLoc )
            	    {
            	    // InternalRPG.g:225:4: (lv_loc_1_0= ruleLoc )
            	    // InternalRPG.g:226:5: lv_loc_1_0= ruleLoc
            	    {

            	    					newCompositeNode(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
    // $ANTLR end "ruleLocations"


    // $ANTLR start "entryRuleLoc"
    // InternalRPG.g:247:1: entryRuleLoc returns [EObject current=null] : iv_ruleLoc= ruleLoc EOF ;
    public final EObject entryRuleLoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoc = null;


        try {
            // InternalRPG.g:247:44: (iv_ruleLoc= ruleLoc EOF )
            // InternalRPG.g:248:2: iv_ruleLoc= ruleLoc EOF
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
    // InternalRPG.g:254:1: ruleLoc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLoc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRPG.g:260:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRPG.g:261:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRPG.g:261:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) )
            // InternalRPG.g:262:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) )
            {
            // InternalRPG.g:262:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPG.g:263:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRPG.g:263:4: (lv_name_0_0= RULE_ID )
            // InternalRPG.g:264:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLocAccess().getOpponentsKeyword_1());
            		
            // InternalRPG.g:284:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPG.g:285:4: (otherlv_2= RULE_ID )
            {
            // InternalRPG.g:285:4: (otherlv_2= RULE_ID )
            // InternalRPG.g:286:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getLocAccess().getTeamTeamCrossReference_2_0());
            				

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


    // $ANTLR start "entryRuleRelations"
    // InternalRPG.g:301:1: entryRuleRelations returns [EObject current=null] : iv_ruleRelations= ruleRelations EOF ;
    public final EObject entryRuleRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelations = null;


        try {
            // InternalRPG.g:301:50: (iv_ruleRelations= ruleRelations EOF )
            // InternalRPG.g:302:2: iv_ruleRelations= ruleRelations EOF
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
    // InternalRPG.g:308:1: ruleRelations returns [EObject current=null] : (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) ;
    public final EObject ruleRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:314:2: ( (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) )
            // InternalRPG.g:315:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            {
            // InternalRPG.g:315:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            // InternalRPG.g:316:3: otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationsAccess().getRelationsKeyword_0());
            		
            // InternalRPG.g:320:3: ( (lv_type_1_0= ruleType ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRPG.g:321:4: (lv_type_1_0= ruleType )
            	    {
            	    // InternalRPG.g:321:4: (lv_type_1_0= ruleType )
            	    // InternalRPG.g:322:5: lv_type_1_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // InternalRPG.g:343:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRPG.g:343:45: (iv_ruleType= ruleType EOF )
            // InternalRPG.g:344:2: iv_ruleType= ruleType EOF
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
    // InternalRPG.g:350:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_tExpression_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:356:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) )
            // InternalRPG.g:357:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            {
            // InternalRPG.g:357:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            // InternalRPG.g:358:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalRPG.g:362:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:363:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:363:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:364:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalRPG.g:380:3: ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRPG.g:381:4: (lv_tExpression_2_0= ruleTypeExpression )
                    {
                    // InternalRPG.g:381:4: (lv_tExpression_2_0= ruleTypeExpression )
                    // InternalRPG.g:382:5: lv_tExpression_2_0= ruleTypeExpression
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
    // InternalRPG.g:403:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // InternalRPG.g:403:55: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // InternalRPG.g:404:2: iv_ruleTypeExpression= ruleTypeExpression EOF
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
    // InternalRPG.g:410:1: ruleTypeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) ;
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
            // InternalRPG.g:416:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) )
            // InternalRPG.g:417:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            {
            // InternalRPG.g:417:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            // InternalRPG.g:418:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            {
            // InternalRPG.g:418:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPG.g:419:4: (otherlv_0= RULE_ID )
            {
            // InternalRPG.g:419:4: (otherlv_0= RULE_ID )
            // InternalRPG.g:420:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0());
            				

            }


            }

            // InternalRPG.g:431:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRPG.g:432:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRPG.g:436:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalRPG.g:437:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalRPG.g:437:5: (otherlv_2= RULE_ID )
            	    // InternalRPG.g:438:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_2, grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2());
            		
            // InternalRPG.g:454:3: ( (otherlv_4= RULE_ID ) )
            // InternalRPG.g:455:4: (otherlv_4= RULE_ID )
            {
            // InternalRPG.g:455:4: (otherlv_4= RULE_ID )
            // InternalRPG.g:456:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0());
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4());
            		
            // InternalRPG.g:471:3: ( (otherlv_6= RULE_ID ) )
            // InternalRPG.g:472:4: (otherlv_6= RULE_ID )
            {
            // InternalRPG.g:472:4: (otherlv_6= RULE_ID )
            // InternalRPG.g:473:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_6, grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0());
            				

            }


            }

            // InternalRPG.g:484:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRPG.g:485:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRPG.g:489:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalRPG.g:490:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalRPG.g:490:5: (otherlv_8= RULE_ID )
            	    // InternalRPG.g:491:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_8, grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalRPG.g:507:1: entryRuleMoves returns [EObject current=null] : iv_ruleMoves= ruleMoves EOF ;
    public final EObject entryRuleMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoves = null;


        try {
            // InternalRPG.g:507:46: (iv_ruleMoves= ruleMoves EOF )
            // InternalRPG.g:508:2: iv_ruleMoves= ruleMoves EOF
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
    // InternalRPG.g:514:1: ruleMoves returns [EObject current=null] : (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) ;
    public final EObject ruleMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_move_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:520:2: ( (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) )
            // InternalRPG.g:521:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            {
            // InternalRPG.g:521:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            // InternalRPG.g:522:3: otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMovesAccess().getMovesKeyword_0());
            		
            // InternalRPG.g:526:3: ( (lv_move_1_0= ruleMove ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRPG.g:527:4: (lv_move_1_0= ruleMove )
            	    {
            	    // InternalRPG.g:527:4: (lv_move_1_0= ruleMove )
            	    // InternalRPG.g:528:5: lv_move_1_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // InternalRPG.g:549:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRPG.g:549:45: (iv_ruleMove= ruleMove EOF )
            // InternalRPG.g:550:2: iv_ruleMove= ruleMove EOF
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
    // InternalRPG.g:556:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) )? ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_effect_4_0= ruleEffect ) )* ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_effect_4_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:562:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) )? ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_effect_4_0= ruleEffect ) )* ) )
            // InternalRPG.g:563:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) )? ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_effect_4_0= ruleEffect ) )* )
            {
            // InternalRPG.g:563:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) )? ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_effect_4_0= ruleEffect ) )* )
            // InternalRPG.g:564:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) )? ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_effect_4_0= ruleEffect ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalRPG.g:568:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:569:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:569:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:570:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalRPG.g:586:3: ( (lv_eType_2_0= ruleEType ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRPG.g:587:4: (lv_eType_2_0= ruleEType )
                    {
                    // InternalRPG.g:587:4: (lv_eType_2_0= ruleEType )
                    // InternalRPG.g:588:5: lv_eType_2_0= ruleEType
                    {

                    					newCompositeNode(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
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
                    break;

            }

            // InternalRPG.g:605:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRPG.g:606:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRPG.g:606:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRPG.g:607:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop10;
                }
            } while (true);

            // InternalRPG.g:624:3: ( (lv_effect_4_0= ruleEffect ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRPG.g:625:4: (lv_effect_4_0= ruleEffect )
            	    {
            	    // InternalRPG.g:625:4: (lv_effect_4_0= ruleEffect )
            	    // InternalRPG.g:626:5: lv_effect_4_0= ruleEffect
            	    {

            	    					newCompositeNode(grammarAccess.getMoveAccess().getEffectEffectParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_effect_4_0=ruleEffect();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"effect",
            	    						lv_effect_4_0,
            	    						"mdsd.RPG.Effect");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRuleEType"
    // InternalRPG.g:647:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // InternalRPG.g:647:46: (iv_ruleEType= ruleEType EOF )
            // InternalRPG.g:648:2: iv_ruleEType= ruleEType EOF
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
    // InternalRPG.g:654:1: ruleEType returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:660:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRPG.g:661:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRPG.g:661:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            // InternalRPG.g:662:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getTypeKeyword_0());
            		
            // InternalRPG.g:666:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:667:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:667:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:668:5: otherlv_1= RULE_ID
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


    // $ANTLR start "entryRuleAttributes"
    // InternalRPG.g:683:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalRPG.g:683:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalRPG.g:684:2: iv_ruleAttributes= ruleAttributes EOF
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
    // InternalRPG.g:690:1: ruleAttributes returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:696:2: ( (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) )
            // InternalRPG.g:697:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            {
            // InternalRPG.g:697:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            // InternalRPG.g:698:3: otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
            		
            // InternalRPG.g:702:3: ( (lv_attribute_1_0= ruleAttribute ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRPG.g:703:4: (lv_attribute_1_0= ruleAttribute )
            	    {
            	    // InternalRPG.g:703:4: (lv_attribute_1_0= ruleAttribute )
            	    // InternalRPG.g:704:5: lv_attribute_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalRPG.g:725:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRPG.g:725:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRPG.g:726:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRPG.g:732:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_aVal_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:738:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) )
            // InternalRPG.g:739:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            {
            // InternalRPG.g:739:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            // InternalRPG.g:740:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRPG.g:744:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:745:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:745:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:746:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalRPG.g:762:3: ( (lv_aVal_2_0= ruleAttributeValues ) )
            // InternalRPG.g:763:4: (lv_aVal_2_0= ruleAttributeValues )
            {
            // InternalRPG.g:763:4: (lv_aVal_2_0= ruleAttributeValues )
            // InternalRPG.g:764:5: lv_aVal_2_0= ruleAttributeValues
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


    // $ANTLR start "entryRuleEffect"
    // InternalRPG.g:785:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalRPG.g:785:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalRPG.g:786:2: iv_ruleEffect= ruleEffect EOF
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
    // InternalRPG.g:792:1: ruleEffect returns [EObject current=null] : (otherlv_0= 'effect' this_Rule_1= ruleRule ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Rule_1 = null;



        	enterRule();

        try {
            // InternalRPG.g:798:2: ( (otherlv_0= 'effect' this_Rule_1= ruleRule ) )
            // InternalRPG.g:799:2: (otherlv_0= 'effect' this_Rule_1= ruleRule )
            {
            // InternalRPG.g:799:2: (otherlv_0= 'effect' this_Rule_1= ruleRule )
            // InternalRPG.g:800:3: otherlv_0= 'effect' this_Rule_1= ruleRule
            {
            otherlv_0=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectAccess().getEffectKeyword_0());
            		

            			newCompositeNode(grammarAccess.getEffectAccess().getRuleParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Rule_1=ruleRule();

            state._fsp--;


            			current = this_Rule_1;
            			afterParserOrEnumRuleCall();
            		

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


    // $ANTLR start "entryRuleAttributeValues"
    // InternalRPG.g:816:1: entryRuleAttributeValues returns [EObject current=null] : iv_ruleAttributeValues= ruleAttributeValues EOF ;
    public final EObject entryRuleAttributeValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValues = null;


        try {
            // InternalRPG.g:816:56: (iv_ruleAttributeValues= ruleAttributeValues EOF )
            // InternalRPG.g:817:2: iv_ruleAttributeValues= ruleAttributeValues EOF
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
    // InternalRPG.g:823:1: ruleAttributeValues returns [EObject current=null] : ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | this_AtomicNumber_2= ruleAtomicNumber ) ) | (this_Rule_3= ruleRule | this_Require_4= ruleRequire ) ) ;
    public final EObject ruleAttributeValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_lTypes_1_0 = null;

        EObject this_AtomicNumber_2 = null;

        EObject this_Rule_3 = null;

        EObject this_Require_4 = null;



        	enterRule();

        try {
            // InternalRPG.g:829:2: ( ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | this_AtomicNumber_2= ruleAtomicNumber ) ) | (this_Rule_3= ruleRule | this_Require_4= ruleRequire ) ) )
            // InternalRPG.g:830:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | this_AtomicNumber_2= ruleAtomicNumber ) ) | (this_Rule_3= ruleRule | this_Require_4= ruleRequire ) )
            {
            // InternalRPG.g:830:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | this_AtomicNumber_2= ruleAtomicNumber ) ) | (this_Rule_3= ruleRule | this_Require_4= ruleRequire ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||LA15_0==24||LA15_0==34||LA15_0==37||LA15_0==48) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRPG.g:831:3: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | this_AtomicNumber_2= ruleAtomicNumber ) )
                    {
                    // InternalRPG.g:831:3: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | this_AtomicNumber_2= ruleAtomicNumber ) )
                    // InternalRPG.g:832:4: otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | this_AtomicNumber_2= ruleAtomicNumber )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeValuesAccess().getIsKeyword_0_0());
                    			
                    // InternalRPG.g:836:4: ( ( (lv_lTypes_1_0= ruleLegalType ) ) | this_AtomicNumber_2= ruleAtomicNumber )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=50 && LA13_0<=51)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_INT) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalRPG.g:837:5: ( (lv_lTypes_1_0= ruleLegalType ) )
                            {
                            // InternalRPG.g:837:5: ( (lv_lTypes_1_0= ruleLegalType ) )
                            // InternalRPG.g:838:6: (lv_lTypes_1_0= ruleLegalType )
                            {
                            // InternalRPG.g:838:6: (lv_lTypes_1_0= ruleLegalType )
                            // InternalRPG.g:839:7: lv_lTypes_1_0= ruleLegalType
                            {

                            							newCompositeNode(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_0_1_0_0());
                            						
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
                            // InternalRPG.g:857:5: this_AtomicNumber_2= ruleAtomicNumber
                            {

                            					newCompositeNode(grammarAccess.getAttributeValuesAccess().getAtomicNumberParserRuleCall_0_1_1());
                            				
                            pushFollow(FOLLOW_2);
                            this_AtomicNumber_2=ruleAtomicNumber();

                            state._fsp--;


                            					current = this_AtomicNumber_2;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:868:3: (this_Rule_3= ruleRule | this_Require_4= ruleRequire )
                    {
                    // InternalRPG.g:868:3: (this_Rule_3= ruleRule | this_Require_4= ruleRequire )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==24) ) {
                        alt14=1;
                    }
                    else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==34||LA14_0==37||LA14_0==48) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalRPG.g:869:4: this_Rule_3= ruleRule
                            {

                            				newCompositeNode(grammarAccess.getAttributeValuesAccess().getRuleParserRuleCall_1_0());
                            			
                            pushFollow(FOLLOW_2);
                            this_Rule_3=ruleRule();

                            state._fsp--;


                            				current = this_Rule_3;
                            				afterParserOrEnumRuleCall();
                            			

                            }
                            break;
                        case 2 :
                            // InternalRPG.g:878:4: this_Require_4= ruleRequire
                            {

                            				newCompositeNode(grammarAccess.getAttributeValuesAccess().getRequireParserRuleCall_1_1());
                            			
                            pushFollow(FOLLOW_2);
                            this_Require_4=ruleRequire();

                            state._fsp--;


                            				current = this_Require_4;
                            				afterParserOrEnumRuleCall();
                            			

                            }
                            break;

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
    // $ANTLR end "ruleAttributeValues"


    // $ANTLR start "entryRuleAltAttribute"
    // InternalRPG.g:891:1: entryRuleAltAttribute returns [EObject current=null] : iv_ruleAltAttribute= ruleAltAttribute EOF ;
    public final EObject entryRuleAltAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltAttribute = null;


        try {
            // InternalRPG.g:891:53: (iv_ruleAltAttribute= ruleAltAttribute EOF )
            // InternalRPG.g:892:2: iv_ruleAltAttribute= ruleAltAttribute EOF
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
    // InternalRPG.g:898:1: ruleAltAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) ;
    public final EObject ruleAltAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_av_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:904:2: ( (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) )
            // InternalRPG.g:905:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            {
            // InternalRPG.g:905:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            // InternalRPG.g:906:3: otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRPG.g:910:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:911:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:911:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:912:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAltAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRPG.g:923:3: ( (lv_av_2_0= ruleAttributeValues ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||(LA16_0>=23 && LA16_0<=24)||LA16_0==34||LA16_0==37||LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRPG.g:924:4: (lv_av_2_0= ruleAttributeValues )
                    {
                    // InternalRPG.g:924:4: (lv_av_2_0= ruleAttributeValues )
                    // InternalRPG.g:925:5: lv_av_2_0= ruleAttributeValues
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


    // $ANTLR start "entryRuleRule"
    // InternalRPG.g:946:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRPG.g:946:45: (iv_ruleRule= ruleRule EOF )
            // InternalRPG.g:947:2: iv_ruleRule= ruleRule EOF
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
    // InternalRPG.g:953:1: ruleRule returns [EObject current=null] : (otherlv_0= 'if' this_ORcondition_1= ruleORcondition otherlv_2= 'then' ( ( ruleSelfTargeting )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_change_6_0= ruleSum ) )+ )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_ORcondition_1 = null;

        EObject lv_change_6_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:959:2: ( (otherlv_0= 'if' this_ORcondition_1= ruleORcondition otherlv_2= 'then' ( ( ruleSelfTargeting )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_change_6_0= ruleSum ) )+ )* ) )
            // InternalRPG.g:960:2: (otherlv_0= 'if' this_ORcondition_1= ruleORcondition otherlv_2= 'then' ( ( ruleSelfTargeting )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_change_6_0= ruleSum ) )+ )* )
            {
            // InternalRPG.g:960:2: (otherlv_0= 'if' this_ORcondition_1= ruleORcondition otherlv_2= 'then' ( ( ruleSelfTargeting )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_change_6_0= ruleSum ) )+ )* )
            // InternalRPG.g:961:3: otherlv_0= 'if' this_ORcondition_1= ruleORcondition otherlv_2= 'then' ( ( ruleSelfTargeting )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_change_6_0= ruleSum ) )+ )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRuleAccess().getORconditionParserRuleCall_1());
            		
            pushFollow(FOLLOW_23);
            this_ORcondition_1=ruleORcondition();

            state._fsp--;


            			current = this_ORcondition_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThenKeyword_2());
            		
            // InternalRPG.g:977:3: ( ( ruleSelfTargeting )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_change_6_0= ruleSum ) )+ )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRPG.g:978:4: ( ruleSelfTargeting )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_change_6_0= ruleSum ) )+
            	    {
            	    // InternalRPG.g:978:4: ( ruleSelfTargeting )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==48) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalRPG.g:979:5: ruleSelfTargeting
            	            {

            	            					newCompositeNode(grammarAccess.getRuleAccess().getSelfTargetingParserRuleCall_3_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            ruleSelfTargeting();

            	            state._fsp--;


            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }

            	    // InternalRPG.g:987:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalRPG.g:988:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalRPG.g:988:5: (otherlv_4= RULE_ID )
            	    // InternalRPG.g:989:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getAttritbuteToSetAttributeCrossReference_3_1_0());
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,26,FOLLOW_26); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getEqualsSignKeyword_3_2());
            	    			
            	    // InternalRPG.g:1004:4: ( (lv_change_6_0= ruleSum ) )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        switch ( input.LA(1) ) {
            	        case 48:
            	            {
            	            int LA18_2 = input.LA(2);

            	            if ( (LA18_2==RULE_ID) ) {
            	                int LA18_3 = input.LA(3);

            	                if ( (LA18_3==EOF||(LA18_3>=RULE_ID && LA18_3<=RULE_INT)||LA18_3==12||LA18_3==14||(LA18_3>=18 && LA18_3<=22)||(LA18_3>=27 && LA18_3<=30)||(LA18_3>=44 && LA18_3<=48)) ) {
            	                    alt18=1;
            	                }


            	            }


            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA18_3 = input.LA(2);

            	            if ( (LA18_3==EOF||(LA18_3>=RULE_ID && LA18_3<=RULE_INT)||LA18_3==12||LA18_3==14||(LA18_3>=18 && LA18_3<=22)||(LA18_3>=27 && LA18_3<=30)||(LA18_3>=44 && LA18_3<=48)) ) {
            	                alt18=1;
            	            }


            	            }
            	            break;
            	        case RULE_INT:
            	            {
            	            alt18=1;
            	            }
            	            break;

            	        }

            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalRPG.g:1005:5: (lv_change_6_0= ruleSum )
            	    	    {
            	    	    // InternalRPG.g:1005:5: (lv_change_6_0= ruleSum )
            	    	    // InternalRPG.g:1006:6: lv_change_6_0= ruleSum
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getRuleAccess().getChangeSumParserRuleCall_3_3_0());
            	    	    					
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_change_6_0=ruleSum();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"change",
            	    	    							lv_change_6_0,
            	    	    							"mdsd.RPG.Sum");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt18 >= 1 ) break loop18;
            	                EarlyExitException eee =
            	                    new EarlyExitException(18, input);
            	                throw eee;
            	        }
            	        cnt18++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEntities"
    // InternalRPG.g:1028:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalRPG.g:1028:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalRPG.g:1029:2: iv_ruleEntities= ruleEntities EOF
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
    // InternalRPG.g:1035:1: ruleEntities returns [EObject current=null] : (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1041:2: ( (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) )
            // InternalRPG.g:1042:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            {
            // InternalRPG.g:1042:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            // InternalRPG.g:1043:3: otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+
            {
            otherlv_0=(Token)match(input,27,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitiesAccess().getEntitiesKeyword_0());
            		
            // InternalRPG.g:1047:3: ( (lv_entity_1_0= ruleEntity ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRPG.g:1048:4: (lv_entity_1_0= ruleEntity )
            	    {
            	    // InternalRPG.g:1048:4: (lv_entity_1_0= ruleEntity )
            	    // InternalRPG.g:1049:5: lv_entity_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
    // InternalRPG.g:1070:1: entryRuleDeath returns [EObject current=null] : iv_ruleDeath= ruleDeath EOF ;
    public final EObject entryRuleDeath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeath = null;


        try {
            // InternalRPG.g:1070:46: (iv_ruleDeath= ruleDeath EOF )
            // InternalRPG.g:1071:2: iv_ruleDeath= ruleDeath EOF
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
    // InternalRPG.g:1077:1: ruleDeath returns [EObject current=null] : (otherlv_0= 'death' ( (lv_con_1_0= ruleORcondition ) )+ ) ;
    public final EObject ruleDeath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_con_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1083:2: ( (otherlv_0= 'death' ( (lv_con_1_0= ruleORcondition ) )+ ) )
            // InternalRPG.g:1084:2: (otherlv_0= 'death' ( (lv_con_1_0= ruleORcondition ) )+ )
            {
            // InternalRPG.g:1084:2: (otherlv_0= 'death' ( (lv_con_1_0= ruleORcondition ) )+ )
            // InternalRPG.g:1085:3: otherlv_0= 'death' ( (lv_con_1_0= ruleORcondition ) )+
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDeathAccess().getDeathKeyword_0());
            		
            // InternalRPG.g:1089:3: ( (lv_con_1_0= ruleORcondition ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==37||LA21_0==48) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRPG.g:1090:4: (lv_con_1_0= ruleORcondition )
            	    {
            	    // InternalRPG.g:1090:4: (lv_con_1_0= ruleORcondition )
            	    // InternalRPG.g:1091:5: lv_con_1_0= ruleORcondition
            	    {

            	    					newCompositeNode(grammarAccess.getDeathAccess().getConORconditionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_con_1_0=ruleORcondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeathRule());
            	    					}
            	    					add(
            	    						current,
            	    						"con",
            	    						lv_con_1_0,
            	    						"mdsd.RPG.ORcondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // $ANTLR end "ruleDeath"


    // $ANTLR start "entryRuleEntity"
    // InternalRPG.g:1112:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRPG.g:1112:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRPG.g:1113:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalRPG.g:1119:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_eMoves_4_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1125:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )* ) )
            // InternalRPG.g:1126:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )* )
            {
            // InternalRPG.g:1126:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )* )
            // InternalRPG.g:1127:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRPG.g:1131:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1132:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1132:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1133:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalRPG.g:1149:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRPG.g:1150:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRPG.g:1150:4: (lv_eType_2_0= ruleEType )
            // InternalRPG.g:1151:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalRPG.g:1168:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRPG.g:1169:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRPG.g:1169:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRPG.g:1170:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_att_3_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
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
            	    break loop22;
                }
            } while (true);

            // InternalRPG.g:1187:3: ( (lv_eMoves_4_0= ruleEntityMoves ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRPG.g:1188:4: (lv_eMoves_4_0= ruleEntityMoves )
            	    {
            	    // InternalRPG.g:1188:4: (lv_eMoves_4_0= ruleEntityMoves )
            	    // InternalRPG.g:1189:5: lv_eMoves_4_0= ruleEntityMoves
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_eMoves_4_0=ruleEntityMoves();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eMoves",
            	    						lv_eMoves_4_0,
            	    						"mdsd.RPG.EntityMoves");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityMoves"
    // InternalRPG.g:1210:1: entryRuleEntityMoves returns [EObject current=null] : iv_ruleEntityMoves= ruleEntityMoves EOF ;
    public final EObject entryRuleEntityMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoves = null;


        try {
            // InternalRPG.g:1210:52: (iv_ruleEntityMoves= ruleEntityMoves EOF )
            // InternalRPG.g:1211:2: iv_ruleEntityMoves= ruleEntityMoves EOF
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
    // InternalRPG.g:1217:1: ruleEntityMoves returns [EObject current=null] : (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleEntityMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:1223:2: ( (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRPG.g:1224:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRPG.g:1224:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRPG.g:1225:3: otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityMovesAccess().getMoveKeyword_0());
            		
            // InternalRPG.g:1229:3: ( (otherlv_1= RULE_ID ) )+
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
            	    // InternalRPG.g:1230:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRPG.g:1230:4: (otherlv_1= RULE_ID )
            	    // InternalRPG.g:1231:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEntityMovesRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

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
    // InternalRPG.g:1246:1: entryRuleTeams returns [EObject current=null] : iv_ruleTeams= ruleTeams EOF ;
    public final EObject entryRuleTeams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeams = null;


        try {
            // InternalRPG.g:1246:46: (iv_ruleTeams= ruleTeams EOF )
            // InternalRPG.g:1247:2: iv_ruleTeams= ruleTeams EOF
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
    // InternalRPG.g:1253:1: ruleTeams returns [EObject current=null] : (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ ) ;
    public final EObject ruleTeams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Require_1 = null;

        EObject lv_bs_2_0 = null;

        EObject lv_team_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1259:2: ( (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ ) )
            // InternalRPG.g:1260:2: (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ )
            {
            // InternalRPG.g:1260:2: (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ )
            // InternalRPG.g:1261:3: otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamsAccess().getTeamsKeyword_0());
            		
            // InternalRPG.g:1265:3: (this_Require_1= ruleRequire )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_INT)||LA25_0==34||LA25_0==37||LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRPG.g:1266:4: this_Require_1= ruleRequire
                    {

                    				newCompositeNode(grammarAccess.getTeamsAccess().getRequireParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_31);
                    this_Require_1=ruleRequire();

                    state._fsp--;


                    				current = this_Require_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRPG.g:1275:3: ( (lv_bs_2_0= ruleBattleSize ) )
            // InternalRPG.g:1276:4: (lv_bs_2_0= ruleBattleSize )
            {
            // InternalRPG.g:1276:4: (lv_bs_2_0= ruleBattleSize )
            // InternalRPG.g:1277:5: lv_bs_2_0= ruleBattleSize
            {

            					newCompositeNode(grammarAccess.getTeamsAccess().getBsBattleSizeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_bs_2_0=ruleBattleSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamsRule());
            					}
            					set(
            						current,
            						"bs",
            						lv_bs_2_0,
            						"mdsd.RPG.BattleSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:1294:3: ( (lv_team_3_0= ruleTeam ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRPG.g:1295:4: (lv_team_3_0= ruleTeam )
            	    {
            	    // InternalRPG.g:1295:4: (lv_team_3_0= ruleTeam )
            	    // InternalRPG.g:1296:5: lv_team_3_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_team_3_0=ruleTeam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTeamsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"team",
            	    						lv_team_3_0,
            	    						"mdsd.RPG.Team");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleTeams"


    // $ANTLR start "entryRuleTeam"
    // InternalRPG.g:1317:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalRPG.g:1317:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalRPG.g:1318:2: iv_ruleTeam= ruleTeam EOF
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
    // InternalRPG.g:1324:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+ ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1330:2: ( (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+ ) )
            // InternalRPG.g:1331:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+ )
            {
            // InternalRPG.g:1331:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+ )
            // InternalRPG.g:1332:3: otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalRPG.g:1336:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1337:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1337:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1338:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            // InternalRPG.g:1354:3: ( (lv_members_2_0= ruleMembers ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==32) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRPG.g:1355:4: (lv_members_2_0= ruleMembers )
            	    {
            	    // InternalRPG.g:1355:4: (lv_members_2_0= ruleMembers )
            	    // InternalRPG.g:1356:5: lv_members_2_0= ruleMembers
            	    {

            	    					newCompositeNode(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_members_2_0=ruleMembers();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTeamRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_2_0,
            	    						"mdsd.RPG.Members");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleMembers"
    // InternalRPG.g:1377:1: entryRuleMembers returns [EObject current=null] : iv_ruleMembers= ruleMembers EOF ;
    public final EObject entryRuleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembers = null;


        try {
            // InternalRPG.g:1377:48: (iv_ruleMembers= ruleMembers EOF )
            // InternalRPG.g:1378:2: iv_ruleMembers= ruleMembers EOF
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
    // InternalRPG.g:1384:1: ruleMembers returns [EObject current=null] : (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleMembers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:1390:2: ( (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRPG.g:1391:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRPG.g:1391:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRPG.g:1392:3: otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMembersAccess().getMembersKeyword_0());
            		
            // InternalRPG.g:1396:3: ( (otherlv_1= RULE_ID ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRPG.g:1397:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRPG.g:1397:4: (otherlv_1= RULE_ID )
            	    // InternalRPG.g:1398:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMembersRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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


    // $ANTLR start "entryRuleBattleSize"
    // InternalRPG.g:1413:1: entryRuleBattleSize returns [EObject current=null] : iv_ruleBattleSize= ruleBattleSize EOF ;
    public final EObject entryRuleBattleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattleSize = null;


        try {
            // InternalRPG.g:1413:51: (iv_ruleBattleSize= ruleBattleSize EOF )
            // InternalRPG.g:1414:2: iv_ruleBattleSize= ruleBattleSize EOF
            {
             newCompositeNode(grammarAccess.getBattleSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBattleSize=ruleBattleSize();

            state._fsp--;

             current =iv_ruleBattleSize; 
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
    // $ANTLR end "entryRuleBattleSize"


    // $ANTLR start "ruleBattleSize"
    // InternalRPG.g:1420:1: ruleBattleSize returns [EObject current=null] : (otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )? ) ;
    public final EObject ruleBattleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AtomicNumber_1 = null;

        EObject lv_req_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1426:2: ( (otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )? ) )
            // InternalRPG.g:1427:2: (otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )? )
            {
            // InternalRPG.g:1427:2: (otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )? )
            // InternalRPG.g:1428:3: otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getBattleSizeAccess().getBattling_member_countKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBattleSizeAccess().getAtomicNumberParserRuleCall_1());
            		
            pushFollow(FOLLOW_22);
            this_AtomicNumber_1=ruleAtomicNumber();

            state._fsp--;


            			current = this_AtomicNumber_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:1440:3: ( (lv_req_2_0= ruleRequire ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==34||LA29_0==37||LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRPG.g:1441:4: (lv_req_2_0= ruleRequire )
                    {
                    // InternalRPG.g:1441:4: (lv_req_2_0= ruleRequire )
                    // InternalRPG.g:1442:5: lv_req_2_0= ruleRequire
                    {

                    					newCompositeNode(grammarAccess.getBattleSizeAccess().getReqRequireParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_req_2_0=ruleRequire();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBattleSizeRule());
                    					}
                    					set(
                    						current,
                    						"req",
                    						lv_req_2_0,
                    						"mdsd.RPG.Require");
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
    // $ANTLR end "ruleBattleSize"


    // $ANTLR start "entryRuleRequire"
    // InternalRPG.g:1463:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalRPG.g:1463:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalRPG.g:1464:2: iv_ruleRequire= ruleRequire EOF
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
    // InternalRPG.g:1470:1: ruleRequire returns [EObject current=null] : ( (otherlv_0= 'require' this_ORcondition_1= ruleORcondition ) | this_ORcondition_2= ruleORcondition ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ORcondition_1 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalRPG.g:1476:2: ( ( (otherlv_0= 'require' this_ORcondition_1= ruleORcondition ) | this_ORcondition_2= ruleORcondition ) )
            // InternalRPG.g:1477:2: ( (otherlv_0= 'require' this_ORcondition_1= ruleORcondition ) | this_ORcondition_2= ruleORcondition )
            {
            // InternalRPG.g:1477:2: ( (otherlv_0= 'require' this_ORcondition_1= ruleORcondition ) | this_ORcondition_2= ruleORcondition )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||LA30_0==37||LA30_0==48) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalRPG.g:1478:3: (otherlv_0= 'require' this_ORcondition_1= ruleORcondition )
                    {
                    // InternalRPG.g:1478:3: (otherlv_0= 'require' this_ORcondition_1= ruleORcondition )
                    // InternalRPG.g:1479:4: otherlv_0= 'require' this_ORcondition_1= ruleORcondition
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getRequireAccess().getORconditionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ORcondition_1=ruleORcondition();

                    state._fsp--;


                    				current = this_ORcondition_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1493:3: this_ORcondition_2= ruleORcondition
                    {

                    			newCompositeNode(grammarAccess.getRequireAccess().getORconditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ORcondition_2=ruleORcondition();

                    state._fsp--;


                    			current = this_ORcondition_2;
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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleORcondition"
    // InternalRPG.g:1505:1: entryRuleORcondition returns [EObject current=null] : iv_ruleORcondition= ruleORcondition EOF ;
    public final EObject entryRuleORcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORcondition = null;


        try {
            // InternalRPG.g:1505:52: (iv_ruleORcondition= ruleORcondition EOF )
            // InternalRPG.g:1506:2: iv_ruleORcondition= ruleORcondition EOF
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
    // InternalRPG.g:1512:1: ruleORcondition returns [EObject current=null] : (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) ;
    public final EObject ruleORcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ANDcondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1518:2: ( (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) )
            // InternalRPG.g:1519:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            {
            // InternalRPG.g:1519:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            // InternalRPG.g:1520:3: this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_ANDcondition_0=ruleANDcondition();

            state._fsp--;


            			current = this_ANDcondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:1528:3: (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRPG.g:1529:4: otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getORconditionAccess().getORKeyword_1_0());
            	    			
            	    // InternalRPG.g:1533:4: ()
            	    // InternalRPG.g:1534:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getORconditionAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRPG.g:1540:4: ( (lv_right_3_0= ruleANDcondition ) )
            	    // InternalRPG.g:1541:5: (lv_right_3_0= ruleANDcondition )
            	    {
            	    // InternalRPG.g:1541:5: (lv_right_3_0= ruleANDcondition )
            	    // InternalRPG.g:1542:6: lv_right_3_0= ruleANDcondition
            	    {

            	    						newCompositeNode(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop31;
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
    // InternalRPG.g:1564:1: entryRuleANDcondition returns [EObject current=null] : iv_ruleANDcondition= ruleANDcondition EOF ;
    public final EObject entryRuleANDcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDcondition = null;


        try {
            // InternalRPG.g:1564:53: (iv_ruleANDcondition= ruleANDcondition EOF )
            // InternalRPG.g:1565:2: iv_ruleANDcondition= ruleANDcondition EOF
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
    // InternalRPG.g:1571:1: ruleANDcondition returns [EObject current=null] : (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) ;
    public final EObject ruleANDcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Statement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1577:2: ( (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) )
            // InternalRPG.g:1578:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            {
            // InternalRPG.g:1578:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            // InternalRPG.g:1579:3: this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            {

            			newCompositeNode(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_Statement_0=ruleStatement();

            state._fsp--;


            			current = this_Statement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:1587:3: (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRPG.g:1588:4: otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getANDconditionAccess().getANDKeyword_1_0());
            	    			
            	    // InternalRPG.g:1592:4: ()
            	    // InternalRPG.g:1593:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRPG.g:1599:4: ( (lv_right_3_0= ruleStatement ) )
            	    // InternalRPG.g:1600:5: (lv_right_3_0= ruleStatement )
            	    {
            	    // InternalRPG.g:1600:5: (lv_right_3_0= ruleStatement )
            	    // InternalRPG.g:1601:6: lv_right_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRPG.g:1623:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRPG.g:1623:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRPG.g:1624:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRPG.g:1630:1: ruleStatement returns [EObject current=null] : (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_NumberComparing_0 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalRPG.g:1636:2: ( (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalRPG.g:1637:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalRPG.g:1637:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 48:
                {
                alt33=1;
                }
                break;
            case RULE_ID:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==EOF||(LA33_2>=RULE_ID && LA33_2<=RULE_INT)||LA33_2==12||LA33_2==14||(LA33_2>=18 && LA33_2<=22)||LA33_2==25||(LA33_2>=27 && LA33_2<=31)||LA33_2==33||(LA33_2>=35 && LA33_2<=38)||LA33_2==48) ) {
                    alt33=3;
                }
                else if ( (LA33_2==17||(LA33_2>=39 && LA33_2<=47)) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt33=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalRPG.g:1638:3: this_NumberComparing_0= ruleNumberComparing
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
                    // InternalRPG.g:1647:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    {
                    // InternalRPG.g:1647:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    // InternalRPG.g:1648:4: otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_39);
                    this_ORcondition_2=ruleORcondition();

                    state._fsp--;


                    				current = this_ORcondition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPG.g:1666:3: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalRPG.g:1666:3: ( (otherlv_4= RULE_ID ) )
                    // InternalRPG.g:1667:4: (otherlv_4= RULE_ID )
                    {
                    // InternalRPG.g:1667:4: (otherlv_4= RULE_ID )
                    // InternalRPG.g:1668:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStatementRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getTypeTypeCrossReference_2_0());
                    				

                    }


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
    // InternalRPG.g:1683:1: entryRuleNumberComparing returns [EObject current=null] : iv_ruleNumberComparing= ruleNumberComparing EOF ;
    public final EObject entryRuleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberComparing = null;


        try {
            // InternalRPG.g:1683:56: (iv_ruleNumberComparing= ruleNumberComparing EOF )
            // InternalRPG.g:1684:2: iv_ruleNumberComparing= ruleNumberComparing EOF
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
    // InternalRPG.g:1690:1: ruleNumberComparing returns [EObject current=null] : ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) ;
    public final EObject ruleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_comp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1696:2: ( ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) )
            // InternalRPG.g:1697:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            {
            // InternalRPG.g:1697:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            // InternalRPG.g:1698:3: ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) )
            {
            // InternalRPG.g:1698:3: ( (lv_left_0_0= ruleSum ) )
            // InternalRPG.g:1699:4: (lv_left_0_0= ruleSum )
            {
            // InternalRPG.g:1699:4: (lv_left_0_0= ruleSum )
            // InternalRPG.g:1700:5: lv_left_0_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalRPG.g:1717:3: ( (lv_comp_1_0= ruleComparator ) )
            // InternalRPG.g:1718:4: (lv_comp_1_0= ruleComparator )
            {
            // InternalRPG.g:1718:4: (lv_comp_1_0= ruleComparator )
            // InternalRPG.g:1719:5: lv_comp_1_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalRPG.g:1736:3: ( (lv_right_2_0= ruleSum ) )
            // InternalRPG.g:1737:4: (lv_right_2_0= ruleSum )
            {
            // InternalRPG.g:1737:4: (lv_right_2_0= ruleSum )
            // InternalRPG.g:1738:5: lv_right_2_0= ruleSum
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
    // InternalRPG.g:1759:1: entryRuleComparator returns [String current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final String entryRuleComparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparator = null;


        try {
            // InternalRPG.g:1759:50: (iv_ruleComparator= ruleComparator EOF )
            // InternalRPG.g:1760:2: iv_ruleComparator= ruleComparator EOF
            {
             newCompositeNode(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparator=ruleComparator();

            state._fsp--;

             current =iv_ruleComparator.getText(); 
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
    // InternalRPG.g:1766:1: ruleComparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleComparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRPG.g:1772:2: ( (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' | kw= '!=' ) )
            // InternalRPG.g:1773:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' | kw= '!=' )
            {
            // InternalRPG.g:1773:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' | kw= '!=' )
            int alt34=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt34=1;
                }
                break;
            case 39:
                {
                alt34=2;
                }
                break;
            case 40:
                {
                alt34=3;
                }
                break;
            case 41:
                {
                alt34=4;
                }
                break;
            case 42:
                {
                alt34=5;
                }
                break;
            case 43:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalRPG.g:1774:3: kw= '<'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:1780:3: kw= '<='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRPG.g:1786:3: kw= '=='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRPG.g:1792:3: kw= '>='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRPG.g:1798:3: kw= '>'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRPG.g:1804:3: kw= '!='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5());
                    		

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
    // InternalRPG.g:1813:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalRPG.g:1813:44: (iv_ruleSum= ruleSum EOF )
            // InternalRPG.g:1814:2: iv_ruleSum= ruleSum EOF
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
    // InternalRPG.g:1820:1: ruleSum returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1826:2: ( (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) )
            // InternalRPG.g:1827:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            {
            // InternalRPG.g:1827:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            // InternalRPG.g:1828:3: this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:1836:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=44 && LA36_0<=45)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRPG.g:1837:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) )
            	    {
            	    // InternalRPG.g:1837:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==44) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==45) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalRPG.g:1838:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRPG.g:1838:5: (otherlv_1= '+' () )
            	            // InternalRPG.g:1839:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,44,FOLLOW_26); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRPG.g:1843:6: ()
            	            // InternalRPG.g:1844:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRPG.g:1852:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRPG.g:1852:5: (otherlv_3= '-' () )
            	            // InternalRPG.g:1853:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,45,FOLLOW_26); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRPG.g:1857:6: ()
            	            // InternalRPG.g:1858:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRPG.g:1866:4: ( (lv_right_5_0= ruleMultiply ) )
            	    // InternalRPG.g:1867:5: (lv_right_5_0= ruleMultiply )
            	    {
            	    // InternalRPG.g:1867:5: (lv_right_5_0= ruleMultiply )
            	    // InternalRPG.g:1868:6: lv_right_5_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
            	    break loop36;
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
    // InternalRPG.g:1890:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalRPG.g:1890:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalRPG.g:1891:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalRPG.g:1897:1: ruleMultiply returns [EObject current=null] : (this_AtomicAttribute_0= ruleAtomicAttribute ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicAttribute ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AtomicAttribute_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1903:2: ( (this_AtomicAttribute_0= ruleAtomicAttribute ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicAttribute ) ) )* ) )
            // InternalRPG.g:1904:2: (this_AtomicAttribute_0= ruleAtomicAttribute ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicAttribute ) ) )* )
            {
            // InternalRPG.g:1904:2: (this_AtomicAttribute_0= ruleAtomicAttribute ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicAttribute ) ) )* )
            // InternalRPG.g:1905:3: this_AtomicAttribute_0= ruleAtomicAttribute ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicAttribute ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getAtomicAttributeParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_AtomicAttribute_0=ruleAtomicAttribute();

            state._fsp--;


            			current = this_AtomicAttribute_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:1913:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicAttribute ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=46 && LA38_0<=47)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRPG.g:1914:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicAttribute ) )
            	    {
            	    // InternalRPG.g:1914:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==46) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==47) ) {
            	        alt37=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalRPG.g:1915:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRPG.g:1915:5: (otherlv_1= '*' () )
            	            // InternalRPG.g:1916:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,46,FOLLOW_26); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRPG.g:1920:6: ()
            	            // InternalRPG.g:1921:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRPG.g:1929:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRPG.g:1929:5: (otherlv_3= '/' () )
            	            // InternalRPG.g:1930:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,47,FOLLOW_26); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRPG.g:1934:6: ()
            	            // InternalRPG.g:1935:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRPG.g:1943:4: ( (lv_right_5_0= ruleAtomicAttribute ) )
            	    // InternalRPG.g:1944:5: (lv_right_5_0= ruleAtomicAttribute )
            	    {
            	    // InternalRPG.g:1944:5: (lv_right_5_0= ruleAtomicAttribute )
            	    // InternalRPG.g:1945:6: lv_right_5_0= ruleAtomicAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightAtomicAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_5_0=ruleAtomicAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"mdsd.RPG.AtomicAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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


    // $ANTLR start "entryRuleAtomicAttribute"
    // InternalRPG.g:1967:1: entryRuleAtomicAttribute returns [EObject current=null] : iv_ruleAtomicAttribute= ruleAtomicAttribute EOF ;
    public final EObject entryRuleAtomicAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAttribute = null;


        try {
            // InternalRPG.g:1967:56: (iv_ruleAtomicAttribute= ruleAtomicAttribute EOF )
            // InternalRPG.g:1968:2: iv_ruleAtomicAttribute= ruleAtomicAttribute EOF
            {
             newCompositeNode(grammarAccess.getAtomicAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicAttribute=ruleAtomicAttribute();

            state._fsp--;

             current =iv_ruleAtomicAttribute; 
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
    // $ANTLR end "entryRuleAtomicAttribute"


    // $ANTLR start "ruleAtomicAttribute"
    // InternalRPG.g:1974:1: ruleAtomicAttribute returns [EObject current=null] : (this_AtomicNumber_0= ruleAtomicNumber | ( ( ruleSelfTargeting )? ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AtomicNumber_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1980:2: ( (this_AtomicNumber_0= ruleAtomicNumber | ( ( ruleSelfTargeting )? ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalRPG.g:1981:2: (this_AtomicNumber_0= ruleAtomicNumber | ( ( ruleSelfTargeting )? ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalRPG.g:1981:2: (this_AtomicNumber_0= ruleAtomicNumber | ( ( ruleSelfTargeting )? ( (otherlv_2= RULE_ID ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID||LA40_0==48) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalRPG.g:1982:3: this_AtomicNumber_0= ruleAtomicNumber
                    {

                    			newCompositeNode(grammarAccess.getAtomicAttributeAccess().getAtomicNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicNumber_0=ruleAtomicNumber();

                    state._fsp--;


                    			current = this_AtomicNumber_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:1991:3: ( ( ruleSelfTargeting )? ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalRPG.g:1991:3: ( ( ruleSelfTargeting )? ( (otherlv_2= RULE_ID ) ) )
                    // InternalRPG.g:1992:4: ( ruleSelfTargeting )? ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalRPG.g:1992:4: ( ruleSelfTargeting )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==48) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalRPG.g:1993:5: ruleSelfTargeting
                            {

                            					newCompositeNode(grammarAccess.getAtomicAttributeAccess().getSelfTargetingParserRuleCall_1_0());
                            				
                            pushFollow(FOLLOW_3);
                            ruleSelfTargeting();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalRPG.g:2001:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRPG.g:2002:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRPG.g:2002:5: (otherlv_2= RULE_ID )
                    // InternalRPG.g:2003:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicAttributeRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getAtomicAttributeAccess().getAttributeAttributeCrossReference_1_1_0());
                    					

                    }


                    }


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
    // $ANTLR end "ruleAtomicAttribute"


    // $ANTLR start "entryRuleAtomicNumber"
    // InternalRPG.g:2019:1: entryRuleAtomicNumber returns [EObject current=null] : iv_ruleAtomicNumber= ruleAtomicNumber EOF ;
    public final EObject entryRuleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicNumber = null;


        try {
            // InternalRPG.g:2019:53: (iv_ruleAtomicNumber= ruleAtomicNumber EOF )
            // InternalRPG.g:2020:2: iv_ruleAtomicNumber= ruleAtomicNumber EOF
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
    // InternalRPG.g:2026:1: ruleAtomicNumber returns [EObject current=null] : ( ( (lv_float2_0_0= ruleFloat ) ) | ( (lv_int2_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAtomicNumber() throws RecognitionException {
        EObject current = null;

        Token lv_int2_1_0=null;
        AntlrDatatypeRuleToken lv_float2_0_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2032:2: ( ( ( (lv_float2_0_0= ruleFloat ) ) | ( (lv_int2_1_0= RULE_INT ) ) ) )
            // InternalRPG.g:2033:2: ( ( (lv_float2_0_0= ruleFloat ) ) | ( (lv_int2_1_0= RULE_INT ) ) )
            {
            // InternalRPG.g:2033:2: ( ( (lv_float2_0_0= ruleFloat ) ) | ( (lv_int2_1_0= RULE_INT ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||(LA41_1>=RULE_ID && LA41_1<=RULE_INT)||LA41_1==12||LA41_1==14||(LA41_1>=17 && LA41_1<=22)||LA41_1==25||(LA41_1>=27 && LA41_1<=31)||(LA41_1>=33 && LA41_1<=48)) ) {
                    alt41=2;
                }
                else if ( (LA41_1==49) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalRPG.g:2034:3: ( (lv_float2_0_0= ruleFloat ) )
                    {
                    // InternalRPG.g:2034:3: ( (lv_float2_0_0= ruleFloat ) )
                    // InternalRPG.g:2035:4: (lv_float2_0_0= ruleFloat )
                    {
                    // InternalRPG.g:2035:4: (lv_float2_0_0= ruleFloat )
                    // InternalRPG.g:2036:5: lv_float2_0_0= ruleFloat
                    {

                    					newCompositeNode(grammarAccess.getAtomicNumberAccess().getFloat2FloatParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_float2_0_0=ruleFloat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomicNumberRule());
                    					}
                    					set(
                    						current,
                    						"float2",
                    						lv_float2_0_0,
                    						"mdsd.RPG.Float");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:2054:3: ( (lv_int2_1_0= RULE_INT ) )
                    {
                    // InternalRPG.g:2054:3: ( (lv_int2_1_0= RULE_INT ) )
                    // InternalRPG.g:2055:4: (lv_int2_1_0= RULE_INT )
                    {
                    // InternalRPG.g:2055:4: (lv_int2_1_0= RULE_INT )
                    // InternalRPG.g:2056:5: lv_int2_1_0= RULE_INT
                    {
                    lv_int2_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_int2_1_0, grammarAccess.getAtomicNumberAccess().getInt2INTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomicNumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"int2",
                    						lv_int2_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


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
    // $ANTLR end "ruleAtomicNumber"


    // $ANTLR start "entryRuleSelfTargeting"
    // InternalRPG.g:2076:1: entryRuleSelfTargeting returns [String current=null] : iv_ruleSelfTargeting= ruleSelfTargeting EOF ;
    public final String entryRuleSelfTargeting() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelfTargeting = null;


        try {
            // InternalRPG.g:2076:53: (iv_ruleSelfTargeting= ruleSelfTargeting EOF )
            // InternalRPG.g:2077:2: iv_ruleSelfTargeting= ruleSelfTargeting EOF
            {
             newCompositeNode(grammarAccess.getSelfTargetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfTargeting=ruleSelfTargeting();

            state._fsp--;

             current =iv_ruleSelfTargeting.getText(); 
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
    // $ANTLR end "entryRuleSelfTargeting"


    // $ANTLR start "ruleSelfTargeting"
    // InternalRPG.g:2083:1: ruleSelfTargeting returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'self.' ;
    public final AntlrDatatypeRuleToken ruleSelfTargeting() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRPG.g:2089:2: (kw= 'self.' )
            // InternalRPG.g:2090:2: kw= 'self.'
            {
            kw=(Token)match(input,48,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSelfTargetingAccess().getSelfKeyword());
            	

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
    // $ANTLR end "ruleSelfTargeting"


    // $ANTLR start "entryRuleFloat"
    // InternalRPG.g:2098:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalRPG.g:2098:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalRPG.g:2099:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalRPG.g:2105:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRPG.g:2111:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalRPG.g:2112:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalRPG.g:2112:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalRPG.g:2113:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,49,FOLLOW_36); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleLegalType"
    // InternalRPG.g:2136:1: entryRuleLegalType returns [String current=null] : iv_ruleLegalType= ruleLegalType EOF ;
    public final String entryRuleLegalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLegalType = null;


        try {
            // InternalRPG.g:2136:49: (iv_ruleLegalType= ruleLegalType EOF )
            // InternalRPG.g:2137:2: iv_ruleLegalType= ruleLegalType EOF
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
    // InternalRPG.g:2143:1: ruleLegalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Float' | kw= 'Integer' ) ;
    public final AntlrDatatypeRuleToken ruleLegalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRPG.g:2149:2: ( (kw= 'Float' | kw= 'Integer' ) )
            // InternalRPG.g:2150:2: (kw= 'Float' | kw= 'Integer' )
            {
            // InternalRPG.g:2150:2: (kw= 'Float' | kw= 'Integer' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            else if ( (LA42_0==51) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalRPG.g:2151:3: kw= 'Float'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getFloatKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2157:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000058145002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000608002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001002401800030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001002401800032L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000032L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001002601800030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000F8000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});

}