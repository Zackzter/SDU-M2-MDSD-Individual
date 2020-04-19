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
    // InternalRPG.g:792:1: ruleEffect returns [EObject current=null] : (otherlv_0= 'effect' ( (lv_rule_1_0= ruleRule ) ) ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rule_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:798:2: ( (otherlv_0= 'effect' ( (lv_rule_1_0= ruleRule ) ) ) )
            // InternalRPG.g:799:2: (otherlv_0= 'effect' ( (lv_rule_1_0= ruleRule ) ) )
            {
            // InternalRPG.g:799:2: (otherlv_0= 'effect' ( (lv_rule_1_0= ruleRule ) ) )
            // InternalRPG.g:800:3: otherlv_0= 'effect' ( (lv_rule_1_0= ruleRule ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectAccess().getEffectKeyword_0());
            		
            // InternalRPG.g:804:3: ( (lv_rule_1_0= ruleRule ) )
            // InternalRPG.g:805:4: (lv_rule_1_0= ruleRule )
            {
            // InternalRPG.g:805:4: (lv_rule_1_0= ruleRule )
            // InternalRPG.g:806:5: lv_rule_1_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getEffectAccess().getRuleRuleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_1_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_1_0,
            						"mdsd.RPG.Rule");
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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleAttributeValues"
    // InternalRPG.g:827:1: entryRuleAttributeValues returns [EObject current=null] : iv_ruleAttributeValues= ruleAttributeValues EOF ;
    public final EObject entryRuleAttributeValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValues = null;


        try {
            // InternalRPG.g:827:56: (iv_ruleAttributeValues= ruleAttributeValues EOF )
            // InternalRPG.g:828:2: iv_ruleAttributeValues= ruleAttributeValues EOF
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
    // InternalRPG.g:834:1: ruleAttributeValues returns [EObject current=null] : ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleAtomicNumber ) ) ) ) | (this_Rule_3= ruleRule | this_Require_4= ruleRequire ) ) ;
    public final EObject ruleAttributeValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_lTypes_1_0 = null;

        EObject lv_an_2_0 = null;

        EObject this_Rule_3 = null;

        EObject this_Require_4 = null;



        	enterRule();

        try {
            // InternalRPG.g:840:2: ( ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleAtomicNumber ) ) ) ) | (this_Rule_3= ruleRule | this_Require_4= ruleRequire ) ) )
            // InternalRPG.g:841:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleAtomicNumber ) ) ) ) | (this_Rule_3= ruleRule | this_Require_4= ruleRequire ) )
            {
            // InternalRPG.g:841:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleAtomicNumber ) ) ) ) | (this_Rule_3= ruleRule | this_Require_4= ruleRequire ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==24||LA15_0==34) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRPG.g:842:3: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleAtomicNumber ) ) ) )
                    {
                    // InternalRPG.g:842:3: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleAtomicNumber ) ) ) )
                    // InternalRPG.g:843:4: otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleAtomicNumber ) ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeValuesAccess().getIsKeyword_0_0());
                    			
                    // InternalRPG.g:847:4: ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleAtomicNumber ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=50 && LA13_0<=51)) ) {
                        alt13=1;
                    }
                    else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==48) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalRPG.g:848:5: ( (lv_lTypes_1_0= ruleLegalType ) )
                            {
                            // InternalRPG.g:848:5: ( (lv_lTypes_1_0= ruleLegalType ) )
                            // InternalRPG.g:849:6: (lv_lTypes_1_0= ruleLegalType )
                            {
                            // InternalRPG.g:849:6: (lv_lTypes_1_0= ruleLegalType )
                            // InternalRPG.g:850:7: lv_lTypes_1_0= ruleLegalType
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
                            // InternalRPG.g:868:5: ( (lv_an_2_0= ruleAtomicNumber ) )
                            {
                            // InternalRPG.g:868:5: ( (lv_an_2_0= ruleAtomicNumber ) )
                            // InternalRPG.g:869:6: (lv_an_2_0= ruleAtomicNumber )
                            {
                            // InternalRPG.g:869:6: (lv_an_2_0= ruleAtomicNumber )
                            // InternalRPG.g:870:7: lv_an_2_0= ruleAtomicNumber
                            {

                            							newCompositeNode(grammarAccess.getAttributeValuesAccess().getAnAtomicNumberParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_an_2_0=ruleAtomicNumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                            							}
                            							set(
                            								current,
                            								"an",
                            								lv_an_2_0,
                            								"mdsd.RPG.AtomicNumber");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:890:3: (this_Rule_3= ruleRule | this_Require_4= ruleRequire )
                    {
                    // InternalRPG.g:890:3: (this_Rule_3= ruleRule | this_Require_4= ruleRequire )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==24) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==34) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalRPG.g:891:4: this_Rule_3= ruleRule
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
                            // InternalRPG.g:900:4: this_Require_4= ruleRequire
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
    // InternalRPG.g:913:1: entryRuleAltAttribute returns [EObject current=null] : iv_ruleAltAttribute= ruleAltAttribute EOF ;
    public final EObject entryRuleAltAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltAttribute = null;


        try {
            // InternalRPG.g:913:53: (iv_ruleAltAttribute= ruleAltAttribute EOF )
            // InternalRPG.g:914:2: iv_ruleAltAttribute= ruleAltAttribute EOF
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
    // InternalRPG.g:920:1: ruleAltAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) ;
    public final EObject ruleAltAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_av_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:926:2: ( (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) )
            // InternalRPG.g:927:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            {
            // InternalRPG.g:927:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            // InternalRPG.g:928:3: otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRPG.g:932:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:933:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:933:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:934:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAltAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRPG.g:945:3: ( (lv_av_2_0= ruleAttributeValues ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=23 && LA16_0<=24)||LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRPG.g:946:4: (lv_av_2_0= ruleAttributeValues )
                    {
                    // InternalRPG.g:946:4: (lv_av_2_0= ruleAttributeValues )
                    // InternalRPG.g:947:5: lv_av_2_0= ruleAttributeValues
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
    // InternalRPG.g:968:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRPG.g:968:45: (iv_ruleRule= ruleRule EOF )
            // InternalRPG.g:969:2: iv_ruleRule= ruleRule EOF
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
    // InternalRPG.g:975:1: ruleRule returns [EObject current=null] : (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' ( (lv_carl_3_0= ruleCarl ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_or_1_0 = null;

        EObject lv_carl_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:981:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' ( (lv_carl_3_0= ruleCarl ) ) ) )
            // InternalRPG.g:982:2: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' ( (lv_carl_3_0= ruleCarl ) ) )
            {
            // InternalRPG.g:982:2: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' ( (lv_carl_3_0= ruleCarl ) ) )
            // InternalRPG.g:983:3: otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' ( (lv_carl_3_0= ruleCarl ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
            		
            // InternalRPG.g:987:3: ( (lv_or_1_0= ruleORcondition ) )
            // InternalRPG.g:988:4: (lv_or_1_0= ruleORcondition )
            {
            // InternalRPG.g:988:4: (lv_or_1_0= ruleORcondition )
            // InternalRPG.g:989:5: lv_or_1_0= ruleORcondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_2=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThenKeyword_2());
            		
            // InternalRPG.g:1010:3: ( (lv_carl_3_0= ruleCarl ) )
            // InternalRPG.g:1011:4: (lv_carl_3_0= ruleCarl )
            {
            // InternalRPG.g:1011:4: (lv_carl_3_0= ruleCarl )
            // InternalRPG.g:1012:5: lv_carl_3_0= ruleCarl
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getCarlCarlParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_carl_3_0=ruleCarl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"carl",
            						lv_carl_3_0,
            						"mdsd.RPG.Carl");
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCarl"
    // InternalRPG.g:1033:1: entryRuleCarl returns [EObject current=null] : iv_ruleCarl= ruleCarl EOF ;
    public final EObject entryRuleCarl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarl = null;


        try {
            // InternalRPG.g:1033:45: (iv_ruleCarl= ruleCarl EOF )
            // InternalRPG.g:1034:2: iv_ruleCarl= ruleCarl EOF
            {
             newCompositeNode(grammarAccess.getCarlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarl=ruleCarl();

            state._fsp--;

             current =iv_ruleCarl; 
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
    // $ANTLR end "entryRuleCarl"


    // $ANTLR start "ruleCarl"
    // InternalRPG.g:1040:1: ruleCarl returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleNameAttribute ) ) ( (lv_equal_1_0= ruleSet ) ) ( (lv_change_2_0= ruleSum ) ) ) ;
    public final EObject ruleCarl() throws RecognitionException {
        EObject current = null;

        EObject lv_attribute_0_0 = null;

        EObject lv_equal_1_0 = null;

        EObject lv_change_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1046:2: ( ( ( (lv_attribute_0_0= ruleNameAttribute ) ) ( (lv_equal_1_0= ruleSet ) ) ( (lv_change_2_0= ruleSum ) ) ) )
            // InternalRPG.g:1047:2: ( ( (lv_attribute_0_0= ruleNameAttribute ) ) ( (lv_equal_1_0= ruleSet ) ) ( (lv_change_2_0= ruleSum ) ) )
            {
            // InternalRPG.g:1047:2: ( ( (lv_attribute_0_0= ruleNameAttribute ) ) ( (lv_equal_1_0= ruleSet ) ) ( (lv_change_2_0= ruleSum ) ) )
            // InternalRPG.g:1048:3: ( (lv_attribute_0_0= ruleNameAttribute ) ) ( (lv_equal_1_0= ruleSet ) ) ( (lv_change_2_0= ruleSum ) )
            {
            // InternalRPG.g:1048:3: ( (lv_attribute_0_0= ruleNameAttribute ) )
            // InternalRPG.g:1049:4: (lv_attribute_0_0= ruleNameAttribute )
            {
            // InternalRPG.g:1049:4: (lv_attribute_0_0= ruleNameAttribute )
            // InternalRPG.g:1050:5: lv_attribute_0_0= ruleNameAttribute
            {

            					newCompositeNode(grammarAccess.getCarlAccess().getAttributeNameAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_attribute_0_0=ruleNameAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarlRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_0_0,
            						"mdsd.RPG.NameAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:1067:3: ( (lv_equal_1_0= ruleSet ) )
            // InternalRPG.g:1068:4: (lv_equal_1_0= ruleSet )
            {
            // InternalRPG.g:1068:4: (lv_equal_1_0= ruleSet )
            // InternalRPG.g:1069:5: lv_equal_1_0= ruleSet
            {

            					newCompositeNode(grammarAccess.getCarlAccess().getEqualSetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_equal_1_0=ruleSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarlRule());
            					}
            					set(
            						current,
            						"equal",
            						lv_equal_1_0,
            						"mdsd.RPG.Set");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:1086:3: ( (lv_change_2_0= ruleSum ) )
            // InternalRPG.g:1087:4: (lv_change_2_0= ruleSum )
            {
            // InternalRPG.g:1087:4: (lv_change_2_0= ruleSum )
            // InternalRPG.g:1088:5: lv_change_2_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getCarlAccess().getChangeSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_change_2_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarlRule());
            					}
            					set(
            						current,
            						"change",
            						lv_change_2_0,
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
    // $ANTLR end "ruleCarl"


    // $ANTLR start "entryRuleSet"
    // InternalRPG.g:1109:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalRPG.g:1109:44: (iv_ruleSet= ruleSet EOF )
            // InternalRPG.g:1110:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalRPG.g:1116:1: ruleSet returns [EObject current=null] : ( () otherlv_1= '=' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:1122:2: ( ( () otherlv_1= '=' ) )
            // InternalRPG.g:1123:2: ( () otherlv_1= '=' )
            {
            // InternalRPG.g:1123:2: ( () otherlv_1= '=' )
            // InternalRPG.g:1124:3: () otherlv_1= '='
            {
            // InternalRPG.g:1124:3: ()
            // InternalRPG.g:1125:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetAccess().getEqualAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAccess().getEqualsSignKeyword_1());
            		

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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleEntities"
    // InternalRPG.g:1139:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalRPG.g:1139:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalRPG.g:1140:2: iv_ruleEntities= ruleEntities EOF
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
    // InternalRPG.g:1146:1: ruleEntities returns [EObject current=null] : (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1152:2: ( (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) )
            // InternalRPG.g:1153:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            {
            // InternalRPG.g:1153:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            // InternalRPG.g:1154:3: otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+
            {
            otherlv_0=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitiesAccess().getEntitiesKeyword_0());
            		
            // InternalRPG.g:1158:3: ( (lv_entity_1_0= ruleEntity ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRPG.g:1159:4: (lv_entity_1_0= ruleEntity )
            	    {
            	    // InternalRPG.g:1159:4: (lv_entity_1_0= ruleEntity )
            	    // InternalRPG.g:1160:5: lv_entity_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalRPG.g:1181:1: entryRuleDeath returns [EObject current=null] : iv_ruleDeath= ruleDeath EOF ;
    public final EObject entryRuleDeath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeath = null;


        try {
            // InternalRPG.g:1181:46: (iv_ruleDeath= ruleDeath EOF )
            // InternalRPG.g:1182:2: iv_ruleDeath= ruleDeath EOF
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
    // InternalRPG.g:1188:1: ruleDeath returns [EObject current=null] : (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) ) ;
    public final EObject ruleDeath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_req_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1194:2: ( (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) ) )
            // InternalRPG.g:1195:2: (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) )
            {
            // InternalRPG.g:1195:2: (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) )
            // InternalRPG.g:1196:3: otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDeathAccess().getDeathKeyword_0());
            		
            // InternalRPG.g:1200:3: ( (lv_req_1_0= ruleRequire ) )
            // InternalRPG.g:1201:4: (lv_req_1_0= ruleRequire )
            {
            // InternalRPG.g:1201:4: (lv_req_1_0= ruleRequire )
            // InternalRPG.g:1202:5: lv_req_1_0= ruleRequire
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
    // InternalRPG.g:1223:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRPG.g:1223:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRPG.g:1224:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalRPG.g:1230:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_eMoves_4_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1236:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ) )
            // InternalRPG.g:1237:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) )
            {
            // InternalRPG.g:1237:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) )
            // InternalRPG.g:1238:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRPG.g:1242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1243:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1244:5: lv_name_1_0= RULE_ID
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

            // InternalRPG.g:1260:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRPG.g:1261:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRPG.g:1261:4: (lv_eType_2_0= ruleEType )
            // InternalRPG.g:1262:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalRPG.g:1279:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRPG.g:1280:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRPG.g:1280:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRPG.g:1281:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop18;
                }
            } while (true);

            // InternalRPG.g:1298:3: ( (lv_eMoves_4_0= ruleEntityMoves ) )
            // InternalRPG.g:1299:4: (lv_eMoves_4_0= ruleEntityMoves )
            {
            // InternalRPG.g:1299:4: (lv_eMoves_4_0= ruleEntityMoves )
            // InternalRPG.g:1300:5: lv_eMoves_4_0= ruleEntityMoves
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalRPG.g:1321:1: entryRuleEntityMoves returns [EObject current=null] : iv_ruleEntityMoves= ruleEntityMoves EOF ;
    public final EObject entryRuleEntityMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoves = null;


        try {
            // InternalRPG.g:1321:52: (iv_ruleEntityMoves= ruleEntityMoves EOF )
            // InternalRPG.g:1322:2: iv_ruleEntityMoves= ruleEntityMoves EOF
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
    // InternalRPG.g:1328:1: ruleEntityMoves returns [EObject current=null] : (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleEntityMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:1334:2: ( (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRPG.g:1335:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRPG.g:1335:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRPG.g:1336:3: otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityMovesAccess().getMoveKeyword_0());
            		
            // InternalRPG.g:1340:3: ( (otherlv_1= RULE_ID ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRPG.g:1341:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRPG.g:1341:4: (otherlv_1= RULE_ID )
            	    // InternalRPG.g:1342:5: otherlv_1= RULE_ID
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalRPG.g:1357:1: entryRuleTeams returns [EObject current=null] : iv_ruleTeams= ruleTeams EOF ;
    public final EObject entryRuleTeams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeams = null;


        try {
            // InternalRPG.g:1357:46: (iv_ruleTeams= ruleTeams EOF )
            // InternalRPG.g:1358:2: iv_ruleTeams= ruleTeams EOF
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
    // InternalRPG.g:1364:1: ruleTeams returns [EObject current=null] : (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ ) ;
    public final EObject ruleTeams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Require_1 = null;

        EObject lv_bs_2_0 = null;

        EObject lv_team_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1370:2: ( (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ ) )
            // InternalRPG.g:1371:2: (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ )
            {
            // InternalRPG.g:1371:2: (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ )
            // InternalRPG.g:1372:3: otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamsAccess().getTeamsKeyword_0());
            		
            // InternalRPG.g:1376:3: (this_Require_1= ruleRequire )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRPG.g:1377:4: this_Require_1= ruleRequire
                    {

                    				newCompositeNode(grammarAccess.getTeamsAccess().getRequireParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_Require_1=ruleRequire();

                    state._fsp--;


                    				current = this_Require_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRPG.g:1386:3: ( (lv_bs_2_0= ruleBattleSize ) )
            // InternalRPG.g:1387:4: (lv_bs_2_0= ruleBattleSize )
            {
            // InternalRPG.g:1387:4: (lv_bs_2_0= ruleBattleSize )
            // InternalRPG.g:1388:5: lv_bs_2_0= ruleBattleSize
            {

            					newCompositeNode(grammarAccess.getTeamsAccess().getBsBattleSizeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalRPG.g:1405:3: ( (lv_team_3_0= ruleTeam ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRPG.g:1406:4: (lv_team_3_0= ruleTeam )
            	    {
            	    // InternalRPG.g:1406:4: (lv_team_3_0= ruleTeam )
            	    // InternalRPG.g:1407:5: lv_team_3_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "ruleTeams"


    // $ANTLR start "entryRuleTeam"
    // InternalRPG.g:1428:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalRPG.g:1428:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalRPG.g:1429:2: iv_ruleTeam= ruleTeam EOF
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
    // InternalRPG.g:1435:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1441:2: ( (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) )
            // InternalRPG.g:1442:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            {
            // InternalRPG.g:1442:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            // InternalRPG.g:1443:3: otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalRPG.g:1447:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1448:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1448:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1449:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalRPG.g:1465:3: ( (lv_members_2_0= ruleMembers ) )
            // InternalRPG.g:1466:4: (lv_members_2_0= ruleMembers )
            {
            // InternalRPG.g:1466:4: (lv_members_2_0= ruleMembers )
            // InternalRPG.g:1467:5: lv_members_2_0= ruleMembers
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
    // InternalRPG.g:1488:1: entryRuleMembers returns [EObject current=null] : iv_ruleMembers= ruleMembers EOF ;
    public final EObject entryRuleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembers = null;


        try {
            // InternalRPG.g:1488:48: (iv_ruleMembers= ruleMembers EOF )
            // InternalRPG.g:1489:2: iv_ruleMembers= ruleMembers EOF
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
    // InternalRPG.g:1495:1: ruleMembers returns [EObject current=null] : (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleMembers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:1501:2: ( (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRPG.g:1502:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRPG.g:1502:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRPG.g:1503:3: otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMembersAccess().getMembersKeyword_0());
            		
            // InternalRPG.g:1507:3: ( (otherlv_1= RULE_ID ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRPG.g:1508:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRPG.g:1508:4: (otherlv_1= RULE_ID )
            	    // InternalRPG.g:1509:5: otherlv_1= RULE_ID
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalRPG.g:1524:1: entryRuleBattleSize returns [EObject current=null] : iv_ruleBattleSize= ruleBattleSize EOF ;
    public final EObject entryRuleBattleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattleSize = null;


        try {
            // InternalRPG.g:1524:51: (iv_ruleBattleSize= ruleBattleSize EOF )
            // InternalRPG.g:1525:2: iv_ruleBattleSize= ruleBattleSize EOF
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
    // InternalRPG.g:1531:1: ruleBattleSize returns [EObject current=null] : (otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )? ) ;
    public final EObject ruleBattleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AtomicNumber_1 = null;

        EObject lv_req_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1537:2: ( (otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )? ) )
            // InternalRPG.g:1538:2: (otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )? )
            {
            // InternalRPG.g:1538:2: (otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )? )
            // InternalRPG.g:1539:3: otherlv_0= 'battling_member_count' this_AtomicNumber_1= ruleAtomicNumber ( (lv_req_2_0= ruleRequire ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getBattleSizeAccess().getBattling_member_countKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBattleSizeAccess().getAtomicNumberParserRuleCall_1());
            		
            pushFollow(FOLLOW_22);
            this_AtomicNumber_1=ruleAtomicNumber();

            state._fsp--;


            			current = this_AtomicNumber_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:1551:3: ( (lv_req_2_0= ruleRequire ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRPG.g:1552:4: (lv_req_2_0= ruleRequire )
                    {
                    // InternalRPG.g:1552:4: (lv_req_2_0= ruleRequire )
                    // InternalRPG.g:1553:5: lv_req_2_0= ruleRequire
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
    // InternalRPG.g:1574:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalRPG.g:1574:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalRPG.g:1575:2: iv_ruleRequire= ruleRequire EOF
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
    // InternalRPG.g:1581:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_log_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1587:2: ( (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) ) )
            // InternalRPG.g:1588:2: (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) )
            {
            // InternalRPG.g:1588:2: (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) )
            // InternalRPG.g:1589:3: otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalRPG.g:1593:3: ( (lv_log_1_0= ruleORcondition ) )
            // InternalRPG.g:1594:4: (lv_log_1_0= ruleORcondition )
            {
            // InternalRPG.g:1594:4: (lv_log_1_0= ruleORcondition )
            // InternalRPG.g:1595:5: lv_log_1_0= ruleORcondition
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
    // InternalRPG.g:1616:1: entryRuleORcondition returns [EObject current=null] : iv_ruleORcondition= ruleORcondition EOF ;
    public final EObject entryRuleORcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORcondition = null;


        try {
            // InternalRPG.g:1616:52: (iv_ruleORcondition= ruleORcondition EOF )
            // InternalRPG.g:1617:2: iv_ruleORcondition= ruleORcondition EOF
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
    // InternalRPG.g:1623:1: ruleORcondition returns [EObject current=null] : (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) ;
    public final EObject ruleORcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ANDcondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1629:2: ( (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) )
            // InternalRPG.g:1630:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            {
            // InternalRPG.g:1630:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            // InternalRPG.g:1631:3: this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_ANDcondition_0=ruleANDcondition();

            state._fsp--;


            			current = this_ANDcondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:1639:3: (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRPG.g:1640:4: otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_23); 

            	    				newLeafNode(otherlv_1, grammarAccess.getORconditionAccess().getORKeyword_1_0());
            	    			
            	    // InternalRPG.g:1644:4: ()
            	    // InternalRPG.g:1645:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getORconditionAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRPG.g:1651:4: ( (lv_right_3_0= ruleANDcondition ) )
            	    // InternalRPG.g:1652:5: (lv_right_3_0= ruleANDcondition )
            	    {
            	    // InternalRPG.g:1652:5: (lv_right_3_0= ruleANDcondition )
            	    // InternalRPG.g:1653:6: lv_right_3_0= ruleANDcondition
            	    {

            	    						newCompositeNode(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop24;
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
    // InternalRPG.g:1675:1: entryRuleANDcondition returns [EObject current=null] : iv_ruleANDcondition= ruleANDcondition EOF ;
    public final EObject entryRuleANDcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDcondition = null;


        try {
            // InternalRPG.g:1675:53: (iv_ruleANDcondition= ruleANDcondition EOF )
            // InternalRPG.g:1676:2: iv_ruleANDcondition= ruleANDcondition EOF
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
    // InternalRPG.g:1682:1: ruleANDcondition returns [EObject current=null] : (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) ;
    public final EObject ruleANDcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Statement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1688:2: ( (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) )
            // InternalRPG.g:1689:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            {
            // InternalRPG.g:1689:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            // InternalRPG.g:1690:3: this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            {

            			newCompositeNode(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Statement_0=ruleStatement();

            state._fsp--;


            			current = this_Statement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:1698:3: (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRPG.g:1699:4: otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_23); 

            	    				newLeafNode(otherlv_1, grammarAccess.getANDconditionAccess().getANDKeyword_1_0());
            	    			
            	    // InternalRPG.g:1703:4: ()
            	    // InternalRPG.g:1704:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRPG.g:1710:4: ( (lv_right_3_0= ruleStatement ) )
            	    // InternalRPG.g:1711:5: (lv_right_3_0= ruleStatement )
            	    {
            	    // InternalRPG.g:1711:5: (lv_right_3_0= ruleStatement )
            	    // InternalRPG.g:1712:6: lv_right_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop25;
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
    // InternalRPG.g:1734:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRPG.g:1734:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRPG.g:1735:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRPG.g:1741:1: ruleStatement returns [EObject current=null] : (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_NumberComparing_0 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalRPG.g:1747:2: ( (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalRPG.g:1748:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalRPG.g:1748:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 48:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==17||(LA26_2>=39 && LA26_2<=47)) ) {
                    alt26=1;
                }
                else if ( (LA26_2==EOF||LA26_2==12||LA26_2==14||(LA26_2>=18 && LA26_2<=22)||LA26_2==25||(LA26_2>=27 && LA26_2<=28)||(LA26_2>=30 && LA26_2<=31)||LA26_2==33||(LA26_2>=35 && LA26_2<=36)||LA26_2==38) ) {
                    alt26=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt26=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalRPG.g:1749:3: this_NumberComparing_0= ruleNumberComparing
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
                    // InternalRPG.g:1758:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    {
                    // InternalRPG.g:1758:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    // InternalRPG.g:1759:4: otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_35);
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
                    // InternalRPG.g:1777:3: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalRPG.g:1777:3: ( (otherlv_4= RULE_ID ) )
                    // InternalRPG.g:1778:4: (otherlv_4= RULE_ID )
                    {
                    // InternalRPG.g:1778:4: (otherlv_4= RULE_ID )
                    // InternalRPG.g:1779:5: otherlv_4= RULE_ID
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
    // InternalRPG.g:1794:1: entryRuleNumberComparing returns [EObject current=null] : iv_ruleNumberComparing= ruleNumberComparing EOF ;
    public final EObject entryRuleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberComparing = null;


        try {
            // InternalRPG.g:1794:56: (iv_ruleNumberComparing= ruleNumberComparing EOF )
            // InternalRPG.g:1795:2: iv_ruleNumberComparing= ruleNumberComparing EOF
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
    // InternalRPG.g:1801:1: ruleNumberComparing returns [EObject current=null] : ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) ;
    public final EObject ruleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_comp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1807:2: ( ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) )
            // InternalRPG.g:1808:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            {
            // InternalRPG.g:1808:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            // InternalRPG.g:1809:3: ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) )
            {
            // InternalRPG.g:1809:3: ( (lv_left_0_0= ruleSum ) )
            // InternalRPG.g:1810:4: (lv_left_0_0= ruleSum )
            {
            // InternalRPG.g:1810:4: (lv_left_0_0= ruleSum )
            // InternalRPG.g:1811:5: lv_left_0_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalRPG.g:1828:3: ( (lv_comp_1_0= ruleComparator ) )
            // InternalRPG.g:1829:4: (lv_comp_1_0= ruleComparator )
            {
            // InternalRPG.g:1829:4: (lv_comp_1_0= ruleComparator )
            // InternalRPG.g:1830:5: lv_comp_1_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalRPG.g:1847:3: ( (lv_right_2_0= ruleSum ) )
            // InternalRPG.g:1848:4: (lv_right_2_0= ruleSum )
            {
            // InternalRPG.g:1848:4: (lv_right_2_0= ruleSum )
            // InternalRPG.g:1849:5: lv_right_2_0= ruleSum
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
    // InternalRPG.g:1870:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalRPG.g:1870:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalRPG.g:1871:2: iv_ruleComparator= ruleComparator EOF
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
    // InternalRPG.g:1877:1: ruleComparator returns [EObject current=null] : ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) ;
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
            // InternalRPG.g:1883:2: ( ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) )
            // InternalRPG.g:1884:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            {
            // InternalRPG.g:1884:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt27=1;
                }
                break;
            case 39:
                {
                alt27=2;
                }
                break;
            case 40:
                {
                alt27=3;
                }
                break;
            case 41:
                {
                alt27=4;
                }
                break;
            case 42:
                {
                alt27=5;
                }
                break;
            case 43:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRPG.g:1885:3: ( () otherlv_1= '<' )
                    {
                    // InternalRPG.g:1885:3: ( () otherlv_1= '<' )
                    // InternalRPG.g:1886:4: () otherlv_1= '<'
                    {
                    // InternalRPG.g:1886:4: ()
                    // InternalRPG.g:1887:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1899:3: ( () otherlv_3= '<=' )
                    {
                    // InternalRPG.g:1899:3: ( () otherlv_3= '<=' )
                    // InternalRPG.g:1900:4: () otherlv_3= '<='
                    {
                    // InternalRPG.g:1900:4: ()
                    // InternalRPG.g:1901:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerEqAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPG.g:1913:3: ( () otherlv_5= '==' )
                    {
                    // InternalRPG.g:1913:3: ( () otherlv_5= '==' )
                    // InternalRPG.g:1914:4: () otherlv_5= '=='
                    {
                    // InternalRPG.g:1914:4: ()
                    // InternalRPG.g:1915:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getEqAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPG.g:1927:3: ( () otherlv_7= '>=' )
                    {
                    // InternalRPG.g:1927:3: ( () otherlv_7= '>=' )
                    // InternalRPG.g:1928:4: () otherlv_7= '>='
                    {
                    // InternalRPG.g:1928:4: ()
                    // InternalRPG.g:1929:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerEqAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRPG.g:1941:3: ( () otherlv_9= '>' )
                    {
                    // InternalRPG.g:1941:3: ( () otherlv_9= '>' )
                    // InternalRPG.g:1942:4: () otherlv_9= '>'
                    {
                    // InternalRPG.g:1942:4: ()
                    // InternalRPG.g:1943:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRPG.g:1955:3: ( () otherlv_11= '!=' )
                    {
                    // InternalRPG.g:1955:3: ( () otherlv_11= '!=' )
                    // InternalRPG.g:1956:4: () otherlv_11= '!='
                    {
                    // InternalRPG.g:1956:4: ()
                    // InternalRPG.g:1957:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getNEqAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,43,FOLLOW_2); 

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
    // InternalRPG.g:1972:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalRPG.g:1972:44: (iv_ruleSum= ruleSum EOF )
            // InternalRPG.g:1973:2: iv_ruleSum= ruleSum EOF
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
    // InternalRPG.g:1979:1: ruleSum returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1985:2: ( (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) )
            // InternalRPG.g:1986:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            {
            // InternalRPG.g:1986:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            // InternalRPG.g:1987:3: this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:1995:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=44 && LA29_0<=45)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRPG.g:1996:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) )
            	    {
            	    // InternalRPG.g:1996:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==44) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==45) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalRPG.g:1997:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRPG.g:1997:5: (otherlv_1= '+' () )
            	            // InternalRPG.g:1998:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,44,FOLLOW_21); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRPG.g:2002:6: ()
            	            // InternalRPG.g:2003:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRPG.g:2011:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRPG.g:2011:5: (otherlv_3= '-' () )
            	            // InternalRPG.g:2012:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,45,FOLLOW_21); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRPG.g:2016:6: ()
            	            // InternalRPG.g:2017:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRPG.g:2025:4: ( (lv_right_5_0= ruleMultiply ) )
            	    // InternalRPG.g:2026:5: (lv_right_5_0= ruleMultiply )
            	    {
            	    // InternalRPG.g:2026:5: (lv_right_5_0= ruleMultiply )
            	    // InternalRPG.g:2027:6: lv_right_5_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop29;
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
    // InternalRPG.g:2049:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalRPG.g:2049:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalRPG.g:2050:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalRPG.g:2056:1: ruleMultiply returns [EObject current=null] : (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AtomicNumber_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2062:2: ( (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) )
            // InternalRPG.g:2063:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            {
            // InternalRPG.g:2063:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            // InternalRPG.g:2064:3: this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_AtomicNumber_0=ruleAtomicNumber();

            state._fsp--;


            			current = this_AtomicNumber_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:2072:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=46 && LA31_0<=47)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRPG.g:2073:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) )
            	    {
            	    // InternalRPG.g:2073:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==46) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==47) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalRPG.g:2074:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRPG.g:2074:5: (otherlv_1= '*' () )
            	            // InternalRPG.g:2075:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,46,FOLLOW_21); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRPG.g:2079:6: ()
            	            // InternalRPG.g:2080:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRPG.g:2088:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRPG.g:2088:5: (otherlv_3= '/' () )
            	            // InternalRPG.g:2089:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,47,FOLLOW_21); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRPG.g:2093:6: ()
            	            // InternalRPG.g:2094:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRPG.g:2102:4: ( (lv_right_5_0= ruleAtomicNumber ) )
            	    // InternalRPG.g:2103:5: (lv_right_5_0= ruleAtomicNumber )
            	    {
            	    // InternalRPG.g:2103:5: (lv_right_5_0= ruleAtomicNumber )
            	    // InternalRPG.g:2104:6: lv_right_5_0= ruleAtomicNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleAtomicNumber"
    // InternalRPG.g:2126:1: entryRuleAtomicNumber returns [EObject current=null] : iv_ruleAtomicNumber= ruleAtomicNumber EOF ;
    public final EObject entryRuleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicNumber = null;


        try {
            // InternalRPG.g:2126:53: (iv_ruleAtomicNumber= ruleAtomicNumber EOF )
            // InternalRPG.g:2127:2: iv_ruleAtomicNumber= ruleAtomicNumber EOF
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
    // InternalRPG.g:2133:1: ruleAtomicNumber returns [EObject current=null] : (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum | ( ( ruleSelf )? this_NameAttribute_3= ruleNameAttribute ) ) ;
    public final EObject ruleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject this_FloatNum_0 = null;

        EObject this_IntNum_1 = null;

        EObject this_NameAttribute_3 = null;



        	enterRule();

        try {
            // InternalRPG.g:2139:2: ( (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum | ( ( ruleSelf )? this_NameAttribute_3= ruleNameAttribute ) ) )
            // InternalRPG.g:2140:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum | ( ( ruleSelf )? this_NameAttribute_3= ruleNameAttribute ) )
            {
            // InternalRPG.g:2140:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum | ( ( ruleSelf )? this_NameAttribute_3= ruleNameAttribute ) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==EOF||LA33_1==12||LA33_1==14||(LA33_1>=17 && LA33_1<=22)||LA33_1==25||(LA33_1>=27 && LA33_1<=28)||(LA33_1>=30 && LA33_1<=31)||(LA33_1>=33 && LA33_1<=36)||(LA33_1>=38 && LA33_1<=47)) ) {
                    alt33=2;
                }
                else if ( (LA33_1==49) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==RULE_ID||LA33_0==48) ) {
                alt33=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalRPG.g:2141:3: this_FloatNum_0= ruleFloatNum
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getFloatNumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatNum_0=ruleFloatNum();

                    state._fsp--;


                    			current = this_FloatNum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2150:3: this_IntNum_1= ruleIntNum
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getIntNumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntNum_1=ruleIntNum();

                    state._fsp--;


                    			current = this_IntNum_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRPG.g:2159:3: ( ( ruleSelf )? this_NameAttribute_3= ruleNameAttribute )
                    {
                    // InternalRPG.g:2159:3: ( ( ruleSelf )? this_NameAttribute_3= ruleNameAttribute )
                    // InternalRPG.g:2160:4: ( ruleSelf )? this_NameAttribute_3= ruleNameAttribute
                    {
                    // InternalRPG.g:2160:4: ( ruleSelf )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==48) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalRPG.g:2161:5: ruleSelf
                            {

                            					newCompositeNode(grammarAccess.getAtomicNumberAccess().getSelfParserRuleCall_2_0());
                            				
                            pushFollow(FOLLOW_21);
                            ruleSelf();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_NameAttribute_3=ruleNameAttribute();

                    state._fsp--;


                    				current = this_NameAttribute_3;
                    				afterParserOrEnumRuleCall();
                    			

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


    // $ANTLR start "entryRuleNameAttribute"
    // InternalRPG.g:2182:1: entryRuleNameAttribute returns [EObject current=null] : iv_ruleNameAttribute= ruleNameAttribute EOF ;
    public final EObject entryRuleNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttribute = null;


        try {
            // InternalRPG.g:2182:54: (iv_ruleNameAttribute= ruleNameAttribute EOF )
            // InternalRPG.g:2183:2: iv_ruleNameAttribute= ruleNameAttribute EOF
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
    // InternalRPG.g:2189:1: ruleNameAttribute returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2195:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRPG.g:2196:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRPG.g:2196:2: ( (otherlv_0= RULE_ID ) )
            // InternalRPG.g:2197:3: (otherlv_0= RULE_ID )
            {
            // InternalRPG.g:2197:3: (otherlv_0= RULE_ID )
            // InternalRPG.g:2198:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleSelf"
    // InternalRPG.g:2212:1: entryRuleSelf returns [String current=null] : iv_ruleSelf= ruleSelf EOF ;
    public final String entryRuleSelf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelf = null;


        try {
            // InternalRPG.g:2212:44: (iv_ruleSelf= ruleSelf EOF )
            // InternalRPG.g:2213:2: iv_ruleSelf= ruleSelf EOF
            {
             newCompositeNode(grammarAccess.getSelfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelf=ruleSelf();

            state._fsp--;

             current =iv_ruleSelf.getText(); 
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
    // InternalRPG.g:2219:1: ruleSelf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'self.' ;
    public final AntlrDatatypeRuleToken ruleSelf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRPG.g:2225:2: (kw= 'self.' )
            // InternalRPG.g:2226:2: kw= 'self.'
            {
            kw=(Token)match(input,48,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSelfAccess().getSelfKeyword());
            	

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


    // $ANTLR start "entryRuleIntNum"
    // InternalRPG.g:2234:1: entryRuleIntNum returns [EObject current=null] : iv_ruleIntNum= ruleIntNum EOF ;
    public final EObject entryRuleIntNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntNum = null;


        try {
            // InternalRPG.g:2234:47: (iv_ruleIntNum= ruleIntNum EOF )
            // InternalRPG.g:2235:2: iv_ruleIntNum= ruleIntNum EOF
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
    // InternalRPG.g:2241:1: ruleIntNum returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntNum() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2247:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRPG.g:2248:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRPG.g:2248:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRPG.g:2249:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRPG.g:2249:3: (lv_value_0_0= RULE_INT )
            // InternalRPG.g:2250:4: lv_value_0_0= RULE_INT
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
    // InternalRPG.g:2269:1: entryRuleFloatNum returns [EObject current=null] : iv_ruleFloatNum= ruleFloatNum EOF ;
    public final EObject entryRuleFloatNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatNum = null;


        try {
            // InternalRPG.g:2269:49: (iv_ruleFloatNum= ruleFloatNum EOF )
            // InternalRPG.g:2270:2: iv_ruleFloatNum= ruleFloatNum EOF
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
    // InternalRPG.g:2276:1: ruleFloatNum returns [EObject current=null] : ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFloatNum() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2282:2: ( ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) )
            // InternalRPG.g:2283:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            {
            // InternalRPG.g:2283:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            // InternalRPG.g:2284:3: ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
            {
            // InternalRPG.g:2284:3: ( (lv_i_0_0= RULE_INT ) )
            // InternalRPG.g:2285:4: (lv_i_0_0= RULE_INT )
            {
            // InternalRPG.g:2285:4: (lv_i_0_0= RULE_INT )
            // InternalRPG.g:2286:5: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_39); 

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

            otherlv_1=(Token)match(input,49,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatNumAccess().getFullStopKeyword_1());
            		
            // InternalRPG.g:2306:3: ( (lv_decimal_2_0= RULE_INT ) )
            // InternalRPG.g:2307:4: (lv_decimal_2_0= RULE_INT )
            {
            // InternalRPG.g:2307:4: (lv_decimal_2_0= RULE_INT )
            // InternalRPG.g:2308:5: lv_decimal_2_0= RULE_INT
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
    // InternalRPG.g:2328:1: entryRuleLegalType returns [String current=null] : iv_ruleLegalType= ruleLegalType EOF ;
    public final String entryRuleLegalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLegalType = null;


        try {
            // InternalRPG.g:2328:49: (iv_ruleLegalType= ruleLegalType EOF )
            // InternalRPG.g:2329:2: iv_ruleLegalType= ruleLegalType EOF
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
    // InternalRPG.g:2335:1: ruleLegalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Float' | kw= 'Integer' ) ;
    public final AntlrDatatypeRuleToken ruleLegalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRPG.g:2341:2: ( (kw= 'Float' | kw= 'Integer' ) )
            // InternalRPG.g:2342:2: (kw= 'Float' | kw= 'Integer' )
            {
            // InternalRPG.g:2342:2: (kw= 'Float' | kw= 'Integer' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            else if ( (LA34_0==51) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalRPG.g:2343:3: kw= 'Float'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getFloatKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2349:3: kw= 'Integer'
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000401800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000D000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000401800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000D002000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000601800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000F8000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000020L});

}