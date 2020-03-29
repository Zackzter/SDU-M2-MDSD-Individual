package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'location'", "'opponents'", "'relations'", "'moves'", "'move'", "'type'", "'attributes'", "'attribute'", "'is'", "'if'", "'then'", "'entities'", "'entity'", "'teams'", "'team'", "'members'", "'battling_member_count'", "'require'", "'OR'", "'AND'", "'('", "')'", "'<'", "'<='", "'=='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'.'", "'Float'", "'Integer'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalMyDsl.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalMyDsl.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMyDsl.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getGameKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=14 && LA1_0<=15)||LA1_0==18||LA1_0==23||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalMyDsl.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Declaration");
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMyDsl.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalMyDsl.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Attributes_5= ruleAttributes ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Locations_0 = null;

        EObject this_Relations_1 = null;

        EObject this_Moves_2 = null;

        EObject this_Entities_3 = null;

        EObject this_Teams_4 = null;

        EObject this_Attributes_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:137:2: ( (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Attributes_5= ruleAttributes ) )
            // InternalMyDsl.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Attributes_5= ruleAttributes )
            {
            // InternalMyDsl.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Attributes_5= ruleAttributes )
            int alt2=6;
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
            case 15:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:139:3: this_Locations_0= ruleLocations
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
                    // InternalMyDsl.g:148:3: this_Relations_1= ruleRelations
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
                    // InternalMyDsl.g:157:3: this_Moves_2= ruleMoves
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
                    // InternalMyDsl.g:166:3: this_Entities_3= ruleEntities
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
                    // InternalMyDsl.g:175:3: this_Teams_4= ruleTeams
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
                    // InternalMyDsl.g:184:3: this_Attributes_5= ruleAttributes
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attributes_5=ruleAttributes();

                    state._fsp--;


                    			current = this_Attributes_5;
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
    // InternalMyDsl.g:196:1: entryRuleLocations returns [EObject current=null] : iv_ruleLocations= ruleLocations EOF ;
    public final EObject entryRuleLocations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocations = null;


        try {
            // InternalMyDsl.g:196:50: (iv_ruleLocations= ruleLocations EOF )
            // InternalMyDsl.g:197:2: iv_ruleLocations= ruleLocations EOF
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
    // InternalMyDsl.g:203:1: ruleLocations returns [EObject current=null] : (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) ;
    public final EObject ruleLocations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loc_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:209:2: ( (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) )
            // InternalMyDsl.g:210:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            {
            // InternalMyDsl.g:210:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            // InternalMyDsl.g:211:3: otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationsAccess().getLocationKeyword_0());
            		
            // InternalMyDsl.g:215:3: ( (lv_loc_1_0= ruleLoc ) )+
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
            	    // InternalMyDsl.g:216:4: (lv_loc_1_0= ruleLoc )
            	    {
            	    // InternalMyDsl.g:216:4: (lv_loc_1_0= ruleLoc )
            	    // InternalMyDsl.g:217:5: lv_loc_1_0= ruleLoc
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
            	    						"org.xtext.example.mydsl.MyDsl.Loc");
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
    // InternalMyDsl.g:238:1: entryRuleLoc returns [EObject current=null] : iv_ruleLoc= ruleLoc EOF ;
    public final EObject entryRuleLoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoc = null;


        try {
            // InternalMyDsl.g:238:44: (iv_ruleLoc= ruleLoc EOF )
            // InternalMyDsl.g:239:2: iv_ruleLoc= ruleLoc EOF
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
    // InternalMyDsl.g:245:1: ruleLoc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (lv_oname_2_0= RULE_ID ) ) ) ;
    public final EObject ruleLoc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_oname_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:251:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (lv_oname_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (lv_oname_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (lv_oname_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:253:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (lv_oname_2_0= RULE_ID ) )
            {
            // InternalMyDsl.g:253:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:254:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:254:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:255:5: lv_name_0_0= RULE_ID
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
            		
            // InternalMyDsl.g:275:3: ( (lv_oname_2_0= RULE_ID ) )
            // InternalMyDsl.g:276:4: (lv_oname_2_0= RULE_ID )
            {
            // InternalMyDsl.g:276:4: (lv_oname_2_0= RULE_ID )
            // InternalMyDsl.g:277:5: lv_oname_2_0= RULE_ID
            {
            lv_oname_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_oname_2_0, grammarAccess.getLocAccess().getOnameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            					setWithLastConsumed(
            						current,
            						"oname",
            						lv_oname_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalMyDsl.g:297:1: entryRuleRelations returns [EObject current=null] : iv_ruleRelations= ruleRelations EOF ;
    public final EObject entryRuleRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelations = null;


        try {
            // InternalMyDsl.g:297:50: (iv_ruleRelations= ruleRelations EOF )
            // InternalMyDsl.g:298:2: iv_ruleRelations= ruleRelations EOF
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
    // InternalMyDsl.g:304:1: ruleRelations returns [EObject current=null] : (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) ;
    public final EObject ruleRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:310:2: ( (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) )
            // InternalMyDsl.g:311:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            {
            // InternalMyDsl.g:311:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            // InternalMyDsl.g:312:3: otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationsAccess().getRelationsKeyword_0());
            		
            // InternalMyDsl.g:316:3: ( (lv_type_1_0= ruleType ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:317:4: (lv_type_1_0= ruleType )
            	    {
            	    // InternalMyDsl.g:317:4: (lv_type_1_0= ruleType )
            	    // InternalMyDsl.g:318:5: lv_type_1_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_type_1_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"type",
            	    						lv_type_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Type");
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
    // InternalMyDsl.g:339:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:339:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:340:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:346:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:352:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:353:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:353:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:354:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:354:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:355:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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


    // $ANTLR start "entryRuleMoves"
    // InternalMyDsl.g:374:1: entryRuleMoves returns [EObject current=null] : iv_ruleMoves= ruleMoves EOF ;
    public final EObject entryRuleMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoves = null;


        try {
            // InternalMyDsl.g:374:46: (iv_ruleMoves= ruleMoves EOF )
            // InternalMyDsl.g:375:2: iv_ruleMoves= ruleMoves EOF
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
    // InternalMyDsl.g:381:1: ruleMoves returns [EObject current=null] : (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) ;
    public final EObject ruleMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_move_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:387:2: ( (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) )
            // InternalMyDsl.g:388:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            {
            // InternalMyDsl.g:388:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            // InternalMyDsl.g:389:3: otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMovesAccess().getMovesKeyword_0());
            		
            // InternalMyDsl.g:393:3: ( (lv_move_1_0= ruleMove ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:394:4: (lv_move_1_0= ruleMove )
            	    {
            	    // InternalMyDsl.g:394:4: (lv_move_1_0= ruleMove )
            	    // InternalMyDsl.g:395:5: lv_move_1_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_move_1_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"move",
            	    						lv_move_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Move");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalMyDsl.g:416:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalMyDsl.g:416:45: (iv_ruleMove= ruleMove EOF )
            // InternalMyDsl.g:417:2: iv_ruleMove= ruleMove EOF
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
    // InternalMyDsl.g:423:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:429:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ) )
            // InternalMyDsl.g:430:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* )
            {
            // InternalMyDsl.g:430:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* )
            // InternalMyDsl.g:431:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalMyDsl.g:435:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:436:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:436:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:437:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalMyDsl.g:453:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalMyDsl.g:454:4: (lv_eType_2_0= ruleEType )
            {
            // InternalMyDsl.g:454:4: (lv_eType_2_0= ruleEType )
            // InternalMyDsl.g:455:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"org.xtext.example.mydsl.MyDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:472:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:473:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalMyDsl.g:473:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalMyDsl.g:474:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_att_3_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.AltAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:495:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // InternalMyDsl.g:495:46: (iv_ruleEType= ruleEType EOF )
            // InternalMyDsl.g:496:2: iv_ruleEType= ruleEType EOF
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
    // InternalMyDsl.g:502:1: ruleEType returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:508:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:509:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:509:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:510:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getTypeKeyword_0());
            		
            // InternalMyDsl.g:514:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:515:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:515:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:516:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:531:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalMyDsl.g:531:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalMyDsl.g:532:2: iv_ruleAttributes= ruleAttributes EOF
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
    // InternalMyDsl.g:538:1: ruleAttributes returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:544:2: ( (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) )
            // InternalMyDsl.g:545:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            {
            // InternalMyDsl.g:545:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            // InternalMyDsl.g:546:3: otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
            		
            // InternalMyDsl.g:550:3: ( (lv_attribute_1_0= ruleAttribute ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:551:4: (lv_attribute_1_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:551:4: (lv_attribute_1_0= ruleAttribute )
            	    // InternalMyDsl.g:552:5: lv_attribute_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_attribute_1_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // InternalMyDsl.g:573:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:573:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:574:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMyDsl.g:580:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_aVal_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:586:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) )
            // InternalMyDsl.g:587:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            {
            // InternalMyDsl.g:587:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            // InternalMyDsl.g:588:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:592:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:593:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:593:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:594:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalMyDsl.g:610:3: ( (lv_aVal_2_0= ruleAttributeValues ) )
            // InternalMyDsl.g:611:4: (lv_aVal_2_0= ruleAttributeValues )
            {
            // InternalMyDsl.g:611:4: (lv_aVal_2_0= ruleAttributeValues )
            // InternalMyDsl.g:612:5: lv_aVal_2_0= ruleAttributeValues
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
            						"org.xtext.example.mydsl.MyDsl.AttributeValues");
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


    // $ANTLR start "entryRuleAttributeValues"
    // InternalMyDsl.g:633:1: entryRuleAttributeValues returns [EObject current=null] : iv_ruleAttributeValues= ruleAttributeValues EOF ;
    public final EObject entryRuleAttributeValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValues = null;


        try {
            // InternalMyDsl.g:633:56: (iv_ruleAttributeValues= ruleAttributeValues EOF )
            // InternalMyDsl.g:634:2: iv_ruleAttributeValues= ruleAttributeValues EOF
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
    // InternalMyDsl.g:640:1: ruleAttributeValues returns [EObject current=null] : ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_value_2_0= ruleAtomicNumber ) ) ) ) | ( ( (lv_rule_3_0= ruleRule ) ) | ( (lv_require_4_0= ruleRequire ) ) ) ) ;
    public final EObject ruleAttributeValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_lTypes_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_rule_3_0 = null;

        EObject lv_require_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:646:2: ( ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_value_2_0= ruleAtomicNumber ) ) ) ) | ( ( (lv_rule_3_0= ruleRule ) ) | ( (lv_require_4_0= ruleRequire ) ) ) ) )
            // InternalMyDsl.g:647:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_value_2_0= ruleAtomicNumber ) ) ) ) | ( ( (lv_rule_3_0= ruleRule ) ) | ( (lv_require_4_0= ruleRequire ) ) ) )
            {
            // InternalMyDsl.g:647:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_value_2_0= ruleAtomicNumber ) ) ) ) | ( ( (lv_rule_3_0= ruleRule ) ) | ( (lv_require_4_0= ruleRequire ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT||LA10_0==21||LA10_0==29||LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:648:3: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_value_2_0= ruleAtomicNumber ) ) ) )
                    {
                    // InternalMyDsl.g:648:3: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_value_2_0= ruleAtomicNumber ) ) ) )
                    // InternalMyDsl.g:649:4: otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_value_2_0= ruleAtomicNumber ) ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeValuesAccess().getIsKeyword_0_0());
                    			
                    // InternalMyDsl.g:653:4: ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_value_2_0= ruleAtomicNumber ) ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=44 && LA8_0<=45)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_INT) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:654:5: ( (lv_lTypes_1_0= ruleLegalType ) )
                            {
                            // InternalMyDsl.g:654:5: ( (lv_lTypes_1_0= ruleLegalType ) )
                            // InternalMyDsl.g:655:6: (lv_lTypes_1_0= ruleLegalType )
                            {
                            // InternalMyDsl.g:655:6: (lv_lTypes_1_0= ruleLegalType )
                            // InternalMyDsl.g:656:7: lv_lTypes_1_0= ruleLegalType
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
                            								"org.xtext.example.mydsl.MyDsl.LegalType");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:674:5: ( (lv_value_2_0= ruleAtomicNumber ) )
                            {
                            // InternalMyDsl.g:674:5: ( (lv_value_2_0= ruleAtomicNumber ) )
                            // InternalMyDsl.g:675:6: (lv_value_2_0= ruleAtomicNumber )
                            {
                            // InternalMyDsl.g:675:6: (lv_value_2_0= ruleAtomicNumber )
                            // InternalMyDsl.g:676:7: lv_value_2_0= ruleAtomicNumber
                            {

                            							newCompositeNode(grammarAccess.getAttributeValuesAccess().getValueAtomicNumberParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_2_0=ruleAtomicNumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_2_0,
                            								"org.xtext.example.mydsl.MyDsl.AtomicNumber");
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
                    // InternalMyDsl.g:696:3: ( ( (lv_rule_3_0= ruleRule ) ) | ( (lv_require_4_0= ruleRequire ) ) )
                    {
                    // InternalMyDsl.g:696:3: ( ( (lv_rule_3_0= ruleRule ) ) | ( (lv_require_4_0= ruleRequire ) ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_INT||LA9_0==29||LA9_0==32) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:697:4: ( (lv_rule_3_0= ruleRule ) )
                            {
                            // InternalMyDsl.g:697:4: ( (lv_rule_3_0= ruleRule ) )
                            // InternalMyDsl.g:698:5: (lv_rule_3_0= ruleRule )
                            {
                            // InternalMyDsl.g:698:5: (lv_rule_3_0= ruleRule )
                            // InternalMyDsl.g:699:6: lv_rule_3_0= ruleRule
                            {

                            						newCompositeNode(grammarAccess.getAttributeValuesAccess().getRuleRuleParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_rule_3_0=ruleRule();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                            						}
                            						set(
                            							current,
                            							"rule",
                            							lv_rule_3_0,
                            							"org.xtext.example.mydsl.MyDsl.Rule");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:717:4: ( (lv_require_4_0= ruleRequire ) )
                            {
                            // InternalMyDsl.g:717:4: ( (lv_require_4_0= ruleRequire ) )
                            // InternalMyDsl.g:718:5: (lv_require_4_0= ruleRequire )
                            {
                            // InternalMyDsl.g:718:5: (lv_require_4_0= ruleRequire )
                            // InternalMyDsl.g:719:6: lv_require_4_0= ruleRequire
                            {

                            						newCompositeNode(grammarAccess.getAttributeValuesAccess().getRequireRequireParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_require_4_0=ruleRequire();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                            						}
                            						set(
                            							current,
                            							"require",
                            							lv_require_4_0,
                            							"org.xtext.example.mydsl.MyDsl.Require");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }


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
    // InternalMyDsl.g:741:1: entryRuleAltAttribute returns [EObject current=null] : iv_ruleAltAttribute= ruleAltAttribute EOF ;
    public final EObject entryRuleAltAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltAttribute = null;


        try {
            // InternalMyDsl.g:741:53: (iv_ruleAltAttribute= ruleAltAttribute EOF )
            // InternalMyDsl.g:742:2: iv_ruleAltAttribute= ruleAltAttribute EOF
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
    // InternalMyDsl.g:748:1: ruleAltAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) )+ ( (lv_av_2_0= ruleAttributeValues ) )? ) ;
    public final EObject ruleAltAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_av_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:754:2: ( (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) )+ ( (lv_av_2_0= ruleAttributeValues ) )? ) )
            // InternalMyDsl.g:755:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) )+ ( (lv_av_2_0= ruleAttributeValues ) )? )
            {
            // InternalMyDsl.g:755:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) )+ ( (lv_av_2_0= ruleAttributeValues ) )? )
            // InternalMyDsl.g:756:3: otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) )+ ( (lv_av_2_0= ruleAttributeValues ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:760:3: ( (otherlv_1= RULE_ID ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:761:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalMyDsl.g:761:4: (otherlv_1= RULE_ID )
            	    // InternalMyDsl.g:762:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAltAttributeRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    					newLeafNode(otherlv_1, grammarAccess.getAltAttributeAccess().getAttriburteAttributeCrossReference_1_0());
            	    				

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

            // InternalMyDsl.g:773:3: ( (lv_av_2_0= ruleAttributeValues ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||(LA12_0>=20 && LA12_0<=21)||LA12_0==29||LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:774:4: (lv_av_2_0= ruleAttributeValues )
                    {
                    // InternalMyDsl.g:774:4: (lv_av_2_0= ruleAttributeValues )
                    // InternalMyDsl.g:775:5: lv_av_2_0= ruleAttributeValues
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
                    						"org.xtext.example.mydsl.MyDsl.AttributeValues");
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
    // InternalMyDsl.g:796:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMyDsl.g:796:45: (iv_ruleRule= ruleRule EOF )
            // InternalMyDsl.g:797:2: iv_ruleRule= ruleRule EOF
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
    // InternalMyDsl.g:803:1: ruleRule returns [EObject current=null] : (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= ruleAtomicNumber ) ) otherlv_4= 'then' ( (otherlv_5= RULE_ID ) ) ( (lv_sum_6_0= ruleSum ) ) ( (lv_val_7_0= ruleAtomicNumber ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_comp_2_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_sum_6_0 = null;

        EObject lv_val_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:809:2: ( (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= ruleAtomicNumber ) ) otherlv_4= 'then' ( (otherlv_5= RULE_ID ) ) ( (lv_sum_6_0= ruleSum ) ) ( (lv_val_7_0= ruleAtomicNumber ) ) ) )
            // InternalMyDsl.g:810:2: (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= ruleAtomicNumber ) ) otherlv_4= 'then' ( (otherlv_5= RULE_ID ) ) ( (lv_sum_6_0= ruleSum ) ) ( (lv_val_7_0= ruleAtomicNumber ) ) )
            {
            // InternalMyDsl.g:810:2: (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= ruleAtomicNumber ) ) otherlv_4= 'then' ( (otherlv_5= RULE_ID ) ) ( (lv_sum_6_0= ruleSum ) ) ( (lv_val_7_0= ruleAtomicNumber ) ) )
            // InternalMyDsl.g:811:3: otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= ruleAtomicNumber ) ) otherlv_4= 'then' ( (otherlv_5= RULE_ID ) ) ( (lv_sum_6_0= ruleSum ) ) ( (lv_val_7_0= ruleAtomicNumber ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
            		
            // InternalMyDsl.g:815:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:816:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:816:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:817:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getAttributeAttributeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:828:3: ( (lv_comp_2_0= ruleComparator ) )
            // InternalMyDsl.g:829:4: (lv_comp_2_0= ruleComparator )
            {
            // InternalMyDsl.g:829:4: (lv_comp_2_0= ruleComparator )
            // InternalMyDsl.g:830:5: lv_comp_2_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getCompComparatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_comp_2_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_2_0,
            						"org.xtext.example.mydsl.MyDsl.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:847:3: ( (lv_value_3_0= ruleAtomicNumber ) )
            // InternalMyDsl.g:848:4: (lv_value_3_0= ruleAtomicNumber )
            {
            // InternalMyDsl.g:848:4: (lv_value_3_0= ruleAtomicNumber )
            // InternalMyDsl.g:849:5: lv_value_3_0= ruleAtomicNumber
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getValueAtomicNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_3_0=ruleAtomicNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mydsl.MyDsl.AtomicNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getThenKeyword_4());
            		
            // InternalMyDsl.g:870:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:871:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:871:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:872:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAttribute2AttributeCrossReference_5_0());
            				

            }


            }

            // InternalMyDsl.g:883:3: ( (lv_sum_6_0= ruleSum ) )
            // InternalMyDsl.g:884:4: (lv_sum_6_0= ruleSum )
            {
            // InternalMyDsl.g:884:4: (lv_sum_6_0= ruleSum )
            // InternalMyDsl.g:885:5: lv_sum_6_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSumSumParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_sum_6_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"sum",
            						lv_sum_6_0,
            						"org.xtext.example.mydsl.MyDsl.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:902:3: ( (lv_val_7_0= ruleAtomicNumber ) )
            // InternalMyDsl.g:903:4: (lv_val_7_0= ruleAtomicNumber )
            {
            // InternalMyDsl.g:903:4: (lv_val_7_0= ruleAtomicNumber )
            // InternalMyDsl.g:904:5: lv_val_7_0= ruleAtomicNumber
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getValAtomicNumberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_7_0=ruleAtomicNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_7_0,
            						"org.xtext.example.mydsl.MyDsl.AtomicNumber");
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


    // $ANTLR start "entryRuleEntities"
    // InternalMyDsl.g:925:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalMyDsl.g:925:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalMyDsl.g:926:2: iv_ruleEntities= ruleEntities EOF
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
    // InternalMyDsl.g:932:1: ruleEntities returns [EObject current=null] : (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:938:2: ( (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) )
            // InternalMyDsl.g:939:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            {
            // InternalMyDsl.g:939:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            // InternalMyDsl.g:940:3: otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitiesAccess().getEntitiesKeyword_0());
            		
            // InternalMyDsl.g:944:3: ( (lv_entity_1_0= ruleEntity ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:945:4: (lv_entity_1_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:945:4: (lv_entity_1_0= ruleEntity )
            	    // InternalMyDsl.g:946:5: lv_entity_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_entity_1_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity",
            	    						lv_entity_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:967:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:967:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:968:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:974:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_eMoves_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:980:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )* ) )
            // InternalMyDsl.g:981:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )* )
            {
            // InternalMyDsl.g:981:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )* )
            // InternalMyDsl.g:982:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:986:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:987:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:987:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:988:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalMyDsl.g:1004:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalMyDsl.g:1005:4: (lv_eType_2_0= ruleEType )
            {
            // InternalMyDsl.g:1005:4: (lv_eType_2_0= ruleEType )
            // InternalMyDsl.g:1006:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"org.xtext.example.mydsl.MyDsl.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1023:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1024:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalMyDsl.g:1024:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalMyDsl.g:1025:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_att_3_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.AltAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalMyDsl.g:1042:3: ( (lv_eMoves_4_0= ruleEntityMoves ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1043:4: (lv_eMoves_4_0= ruleEntityMoves )
            	    {
            	    // InternalMyDsl.g:1043:4: (lv_eMoves_4_0= ruleEntityMoves )
            	    // InternalMyDsl.g:1044:5: lv_eMoves_4_0= ruleEntityMoves
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_eMoves_4_0=ruleEntityMoves();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eMoves",
            	    						lv_eMoves_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.EntityMoves");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:1065:1: entryRuleEntityMoves returns [EObject current=null] : iv_ruleEntityMoves= ruleEntityMoves EOF ;
    public final EObject entryRuleEntityMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoves = null;


        try {
            // InternalMyDsl.g:1065:52: (iv_ruleEntityMoves= ruleEntityMoves EOF )
            // InternalMyDsl.g:1066:2: iv_ruleEntityMoves= ruleEntityMoves EOF
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
    // InternalMyDsl.g:1072:1: ruleEntityMoves returns [EObject current=null] : (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleEntityMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1078:2: ( (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalMyDsl.g:1079:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalMyDsl.g:1079:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            // InternalMyDsl.g:1080:3: otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityMovesAccess().getMoveKeyword_0());
            		
            // InternalMyDsl.g:1084:3: ( (otherlv_1= RULE_ID ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1085:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1085:4: (otherlv_1= RULE_ID )
            	    // InternalMyDsl.g:1086:5: otherlv_1= RULE_ID
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // InternalMyDsl.g:1101:1: entryRuleTeams returns [EObject current=null] : iv_ruleTeams= ruleTeams EOF ;
    public final EObject entryRuleTeams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeams = null;


        try {
            // InternalMyDsl.g:1101:46: (iv_ruleTeams= ruleTeams EOF )
            // InternalMyDsl.g:1102:2: iv_ruleTeams= ruleTeams EOF
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
    // InternalMyDsl.g:1108:1: ruleTeams returns [EObject current=null] : (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ ) ;
    public final EObject ruleTeams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Require_1 = null;

        EObject lv_bs_2_0 = null;

        EObject lv_team_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1114:2: ( (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ ) )
            // InternalMyDsl.g:1115:2: (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ )
            {
            // InternalMyDsl.g:1115:2: (otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+ )
            // InternalMyDsl.g:1116:3: otherlv_0= 'teams' (this_Require_1= ruleRequire )? ( (lv_bs_2_0= ruleBattleSize ) ) ( (lv_team_3_0= ruleTeam ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamsAccess().getTeamsKeyword_0());
            		
            // InternalMyDsl.g:1120:3: (this_Require_1= ruleRequire )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT||LA17_0==29||LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1121:4: this_Require_1= ruleRequire
                    {

                    				newCompositeNode(grammarAccess.getTeamsAccess().getRequireParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_21);
                    this_Require_1=ruleRequire();

                    state._fsp--;


                    				current = this_Require_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1130:3: ( (lv_bs_2_0= ruleBattleSize ) )
            // InternalMyDsl.g:1131:4: (lv_bs_2_0= ruleBattleSize )
            {
            // InternalMyDsl.g:1131:4: (lv_bs_2_0= ruleBattleSize )
            // InternalMyDsl.g:1132:5: lv_bs_2_0= ruleBattleSize
            {

            					newCompositeNode(grammarAccess.getTeamsAccess().getBsBattleSizeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_bs_2_0=ruleBattleSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamsRule());
            					}
            					set(
            						current,
            						"bs",
            						lv_bs_2_0,
            						"org.xtext.example.mydsl.MyDsl.BattleSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1149:3: ( (lv_team_3_0= ruleTeam ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1150:4: (lv_team_3_0= ruleTeam )
            	    {
            	    // InternalMyDsl.g:1150:4: (lv_team_3_0= ruleTeam )
            	    // InternalMyDsl.g:1151:5: lv_team_3_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_team_3_0=ruleTeam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTeamsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"team",
            	    						lv_team_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Team");
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
    // InternalMyDsl.g:1172:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalMyDsl.g:1172:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalMyDsl.g:1173:2: iv_ruleTeam= ruleTeam EOF
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
    // InternalMyDsl.g:1179:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+ ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1185:2: ( (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+ ) )
            // InternalMyDsl.g:1186:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+ )
            {
            // InternalMyDsl.g:1186:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+ )
            // InternalMyDsl.g:1187:3: otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )+
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalMyDsl.g:1191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1192:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1193:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalMyDsl.g:1209:3: ( (lv_members_2_0= ruleMembers ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1210:4: (lv_members_2_0= ruleMembers )
            	    {
            	    // InternalMyDsl.g:1210:4: (lv_members_2_0= ruleMembers )
            	    // InternalMyDsl.g:1211:5: lv_members_2_0= ruleMembers
            	    {

            	    					newCompositeNode(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_members_2_0=ruleMembers();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTeamRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Members");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleMembers"
    // InternalMyDsl.g:1232:1: entryRuleMembers returns [EObject current=null] : iv_ruleMembers= ruleMembers EOF ;
    public final EObject entryRuleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembers = null;


        try {
            // InternalMyDsl.g:1232:48: (iv_ruleMembers= ruleMembers EOF )
            // InternalMyDsl.g:1233:2: iv_ruleMembers= ruleMembers EOF
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
    // InternalMyDsl.g:1239:1: ruleMembers returns [EObject current=null] : (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleMembers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1245:2: ( (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalMyDsl.g:1246:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalMyDsl.g:1246:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            // InternalMyDsl.g:1247:3: otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMembersAccess().getMembersKeyword_0());
            		
            // InternalMyDsl.g:1251:3: ( (otherlv_1= RULE_ID ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1252:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1252:4: (otherlv_1= RULE_ID )
            	    // InternalMyDsl.g:1253:5: otherlv_1= RULE_ID
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
    // $ANTLR end "ruleMembers"


    // $ANTLR start "entryRuleBattleSize"
    // InternalMyDsl.g:1268:1: entryRuleBattleSize returns [EObject current=null] : iv_ruleBattleSize= ruleBattleSize EOF ;
    public final EObject entryRuleBattleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattleSize = null;


        try {
            // InternalMyDsl.g:1268:51: (iv_ruleBattleSize= ruleBattleSize EOF )
            // InternalMyDsl.g:1269:2: iv_ruleBattleSize= ruleBattleSize EOF
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
    // InternalMyDsl.g:1275:1: ruleBattleSize returns [EObject current=null] : (otherlv_0= 'battling_member_count' ( (lv_value_1_0= ruleAtomicNumber ) ) ( (lv_req_2_0= ruleRequire ) )? ) ;
    public final EObject ruleBattleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;

        EObject lv_req_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1281:2: ( (otherlv_0= 'battling_member_count' ( (lv_value_1_0= ruleAtomicNumber ) ) ( (lv_req_2_0= ruleRequire ) )? ) )
            // InternalMyDsl.g:1282:2: (otherlv_0= 'battling_member_count' ( (lv_value_1_0= ruleAtomicNumber ) ) ( (lv_req_2_0= ruleRequire ) )? )
            {
            // InternalMyDsl.g:1282:2: (otherlv_0= 'battling_member_count' ( (lv_value_1_0= ruleAtomicNumber ) ) ( (lv_req_2_0= ruleRequire ) )? )
            // InternalMyDsl.g:1283:3: otherlv_0= 'battling_member_count' ( (lv_value_1_0= ruleAtomicNumber ) ) ( (lv_req_2_0= ruleRequire ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBattleSizeAccess().getBattling_member_countKeyword_0());
            		
            // InternalMyDsl.g:1287:3: ( (lv_value_1_0= ruleAtomicNumber ) )
            // InternalMyDsl.g:1288:4: (lv_value_1_0= ruleAtomicNumber )
            {
            // InternalMyDsl.g:1288:4: (lv_value_1_0= ruleAtomicNumber )
            // InternalMyDsl.g:1289:5: lv_value_1_0= ruleAtomicNumber
            {

            					newCompositeNode(grammarAccess.getBattleSizeAccess().getValueAtomicNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_value_1_0=ruleAtomicNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBattleSizeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyDsl.AtomicNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1306:3: ( (lv_req_2_0= ruleRequire ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||LA21_0==29||LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1307:4: (lv_req_2_0= ruleRequire )
                    {
                    // InternalMyDsl.g:1307:4: (lv_req_2_0= ruleRequire )
                    // InternalMyDsl.g:1308:5: lv_req_2_0= ruleRequire
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
                    						"org.xtext.example.mydsl.MyDsl.Require");
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
    // InternalMyDsl.g:1329:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalMyDsl.g:1329:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalMyDsl.g:1330:2: iv_ruleRequire= ruleRequire EOF
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
    // InternalMyDsl.g:1336:1: ruleRequire returns [EObject current=null] : ( (otherlv_0= 'require' this_ORcondition_1= ruleORcondition ) | this_ORcondition_2= ruleORcondition ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ORcondition_1 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1342:2: ( ( (otherlv_0= 'require' this_ORcondition_1= ruleORcondition ) | this_ORcondition_2= ruleORcondition ) )
            // InternalMyDsl.g:1343:2: ( (otherlv_0= 'require' this_ORcondition_1= ruleORcondition ) | this_ORcondition_2= ruleORcondition )
            {
            // InternalMyDsl.g:1343:2: ( (otherlv_0= 'require' this_ORcondition_1= ruleORcondition ) | this_ORcondition_2= ruleORcondition )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_INT||LA22_0==32) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1344:3: (otherlv_0= 'require' this_ORcondition_1= ruleORcondition )
                    {
                    // InternalMyDsl.g:1344:3: (otherlv_0= 'require' this_ORcondition_1= ruleORcondition )
                    // InternalMyDsl.g:1345:4: otherlv_0= 'require' this_ORcondition_1= ruleORcondition
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_12); 

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
                    // InternalMyDsl.g:1359:3: this_ORcondition_2= ruleORcondition
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
    // InternalMyDsl.g:1371:1: entryRuleORcondition returns [EObject current=null] : iv_ruleORcondition= ruleORcondition EOF ;
    public final EObject entryRuleORcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORcondition = null;


        try {
            // InternalMyDsl.g:1371:52: (iv_ruleORcondition= ruleORcondition EOF )
            // InternalMyDsl.g:1372:2: iv_ruleORcondition= ruleORcondition EOF
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
    // InternalMyDsl.g:1378:1: ruleORcondition returns [EObject current=null] : (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) ;
    public final EObject ruleORcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ANDcondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1384:2: ( (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) )
            // InternalMyDsl.g:1385:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            {
            // InternalMyDsl.g:1385:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            // InternalMyDsl.g:1386:3: this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_ANDcondition_0=ruleANDcondition();

            state._fsp--;


            			current = this_ANDcondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1394:3: (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1395:4: otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getORconditionAccess().getORKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1399:4: ()
            	    // InternalMyDsl.g:1400:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getORconditionAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:1406:4: ( (lv_right_3_0= ruleANDcondition ) )
            	    // InternalMyDsl.g:1407:5: (lv_right_3_0= ruleANDcondition )
            	    {
            	    // InternalMyDsl.g:1407:5: (lv_right_3_0= ruleANDcondition )
            	    // InternalMyDsl.g:1408:6: lv_right_3_0= ruleANDcondition
            	    {

            	    						newCompositeNode(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleANDcondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getORconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.ANDcondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleORcondition"


    // $ANTLR start "entryRuleANDcondition"
    // InternalMyDsl.g:1430:1: entryRuleANDcondition returns [EObject current=null] : iv_ruleANDcondition= ruleANDcondition EOF ;
    public final EObject entryRuleANDcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDcondition = null;


        try {
            // InternalMyDsl.g:1430:53: (iv_ruleANDcondition= ruleANDcondition EOF )
            // InternalMyDsl.g:1431:2: iv_ruleANDcondition= ruleANDcondition EOF
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
    // InternalMyDsl.g:1437:1: ruleANDcondition returns [EObject current=null] : (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) ;
    public final EObject ruleANDcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Statement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1443:2: ( (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) )
            // InternalMyDsl.g:1444:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            {
            // InternalMyDsl.g:1444:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            // InternalMyDsl.g:1445:3: this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            {

            			newCompositeNode(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Statement_0=ruleStatement();

            state._fsp--;


            			current = this_Statement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1453:3: (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1454:4: otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getANDconditionAccess().getANDKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1458:4: ()
            	    // InternalMyDsl.g:1459:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:1465:4: ( (lv_right_3_0= ruleStatement ) )
            	    // InternalMyDsl.g:1466:5: (lv_right_3_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:1466:5: (lv_right_3_0= ruleStatement )
            	    // InternalMyDsl.g:1467:6: lv_right_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getANDconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Statement");
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
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:1489:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:1489:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:1490:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyDsl.g:1496:1: ruleStatement returns [EObject current=null] : (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumberComparing_0 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1502:2: ( (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) )
            // InternalMyDsl.g:1503:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            {
            // InternalMyDsl.g:1503:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==32) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1504:3: this_NumberComparing_0= ruleNumberComparing
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
                    // InternalMyDsl.g:1513:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:1513:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    // InternalMyDsl.g:1514:4: otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_ORcondition_2=ruleORcondition();

                    state._fsp--;


                    				current = this_ORcondition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

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
    // InternalMyDsl.g:1535:1: entryRuleNumberComparing returns [EObject current=null] : iv_ruleNumberComparing= ruleNumberComparing EOF ;
    public final EObject entryRuleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberComparing = null;


        try {
            // InternalMyDsl.g:1535:56: (iv_ruleNumberComparing= ruleNumberComparing EOF )
            // InternalMyDsl.g:1536:2: iv_ruleNumberComparing= ruleNumberComparing EOF
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
    // InternalMyDsl.g:1542:1: ruleNumberComparing returns [EObject current=null] : ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) ;
    public final EObject ruleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_comp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1548:2: ( ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) )
            // InternalMyDsl.g:1549:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            {
            // InternalMyDsl.g:1549:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            // InternalMyDsl.g:1550:3: ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) )
            {
            // InternalMyDsl.g:1550:3: ( (lv_left_0_0= ruleSum ) )
            // InternalMyDsl.g:1551:4: (lv_left_0_0= ruleSum )
            {
            // InternalMyDsl.g:1551:4: (lv_left_0_0= ruleSum )
            // InternalMyDsl.g:1552:5: lv_left_0_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_left_0_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.mydsl.MyDsl.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1569:3: ( (lv_comp_1_0= ruleComparator ) )
            // InternalMyDsl.g:1570:4: (lv_comp_1_0= ruleComparator )
            {
            // InternalMyDsl.g:1570:4: (lv_comp_1_0= ruleComparator )
            // InternalMyDsl.g:1571:5: lv_comp_1_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_comp_1_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_1_0,
            						"org.xtext.example.mydsl.MyDsl.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1588:3: ( (lv_right_2_0= ruleSum ) )
            // InternalMyDsl.g:1589:4: (lv_right_2_0= ruleSum )
            {
            // InternalMyDsl.g:1589:4: (lv_right_2_0= ruleSum )
            // InternalMyDsl.g:1590:5: lv_right_2_0= ruleSum
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
            						"org.xtext.example.mydsl.MyDsl.Sum");
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
    // InternalMyDsl.g:1611:1: entryRuleComparator returns [String current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final String entryRuleComparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparator = null;


        try {
            // InternalMyDsl.g:1611:50: (iv_ruleComparator= ruleComparator EOF )
            // InternalMyDsl.g:1612:2: iv_ruleComparator= ruleComparator EOF
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
    // InternalMyDsl.g:1618:1: ruleComparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleComparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1624:2: ( (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) )
            // InternalMyDsl.g:1625:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            {
            // InternalMyDsl.g:1625:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt26=1;
                }
                break;
            case 35:
                {
                alt26=2;
                }
                break;
            case 36:
                {
                alt26=3;
                }
                break;
            case 37:
                {
                alt26=4;
                }
                break;
            case 38:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1626:3: kw= '<'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1632:3: kw= '<='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1638:3: kw= '=='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1644:3: kw= '>='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1650:3: kw= '>'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4());
                    		

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
    // InternalMyDsl.g:1659:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalMyDsl.g:1659:44: (iv_ruleSum= ruleSum EOF )
            // InternalMyDsl.g:1660:2: iv_ruleSum= ruleSum EOF
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
    // InternalMyDsl.g:1666:1: ruleSum returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1672:2: ( (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) )
            // InternalMyDsl.g:1673:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            {
            // InternalMyDsl.g:1673:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            // InternalMyDsl.g:1674:3: this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1682:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=39 && LA28_0<=40)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:1683:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) )
            	    {
            	    // InternalMyDsl.g:1683:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==39) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==40) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalMyDsl.g:1684:5: (otherlv_1= '+' () )
            	            {
            	            // InternalMyDsl.g:1684:5: (otherlv_1= '+' () )
            	            // InternalMyDsl.g:1685:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,39,FOLLOW_16); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalMyDsl.g:1689:6: ()
            	            // InternalMyDsl.g:1690:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1698:5: (otherlv_3= '-' () )
            	            {
            	            // InternalMyDsl.g:1698:5: (otherlv_3= '-' () )
            	            // InternalMyDsl.g:1699:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,40,FOLLOW_16); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalMyDsl.g:1703:6: ()
            	            // InternalMyDsl.g:1704:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1712:4: ( (lv_right_5_0= ruleMultiply ) )
            	    // InternalMyDsl.g:1713:5: (lv_right_5_0= ruleMultiply )
            	    {
            	    // InternalMyDsl.g:1713:5: (lv_right_5_0= ruleMultiply )
            	    // InternalMyDsl.g:1714:6: lv_right_5_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_5_0=ruleMultiply();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Multiply");
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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMultiply"
    // InternalMyDsl.g:1736:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalMyDsl.g:1736:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalMyDsl.g:1737:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalMyDsl.g:1743:1: ruleMultiply returns [EObject current=null] : (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AtomicNumber_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1749:2: ( (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) )
            // InternalMyDsl.g:1750:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            {
            // InternalMyDsl.g:1750:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            // InternalMyDsl.g:1751:3: this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_AtomicNumber_0=ruleAtomicNumber();

            state._fsp--;


            			current = this_AtomicNumber_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1759:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=41 && LA30_0<=42)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:1760:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) )
            	    {
            	    // InternalMyDsl.g:1760:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==41) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==42) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalMyDsl.g:1761:5: (otherlv_1= '*' () )
            	            {
            	            // InternalMyDsl.g:1761:5: (otherlv_1= '*' () )
            	            // InternalMyDsl.g:1762:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,41,FOLLOW_16); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalMyDsl.g:1766:6: ()
            	            // InternalMyDsl.g:1767:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1775:5: (otherlv_3= '/' () )
            	            {
            	            // InternalMyDsl.g:1775:5: (otherlv_3= '/' () )
            	            // InternalMyDsl.g:1776:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,42,FOLLOW_16); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalMyDsl.g:1780:6: ()
            	            // InternalMyDsl.g:1781:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1789:4: ( (lv_right_5_0= ruleAtomicNumber ) )
            	    // InternalMyDsl.g:1790:5: (lv_right_5_0= ruleAtomicNumber )
            	    {
            	    // InternalMyDsl.g:1790:5: (lv_right_5_0= ruleAtomicNumber )
            	    // InternalMyDsl.g:1791:6: lv_right_5_0= ruleAtomicNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_5_0=ruleAtomicNumber();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.AtomicNumber");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMyDsl.g:1813:1: entryRuleAtomicNumber returns [EObject current=null] : iv_ruleAtomicNumber= ruleAtomicNumber EOF ;
    public final EObject entryRuleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicNumber = null;


        try {
            // InternalMyDsl.g:1813:53: (iv_ruleAtomicNumber= ruleAtomicNumber EOF )
            // InternalMyDsl.g:1814:2: iv_ruleAtomicNumber= ruleAtomicNumber EOF
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
    // InternalMyDsl.g:1820:1: ruleAtomicNumber returns [EObject current=null] : ( ( (lv_value_0_0= ruleFloat ) ) | ( (lv_value2_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAtomicNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value2_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1826:2: ( ( ( (lv_value_0_0= ruleFloat ) ) | ( (lv_value2_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:1827:2: ( ( (lv_value_0_0= ruleFloat ) ) | ( (lv_value2_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:1827:2: ( ( (lv_value_0_0= ruleFloat ) ) | ( (lv_value2_1_0= RULE_INT ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==EOF||LA31_1==RULE_INT||LA31_1==12||(LA31_1>=14 && LA31_1<=16)||(LA31_1>=18 && LA31_1<=19)||(LA31_1>=22 && LA31_1<=26)||(LA31_1>=28 && LA31_1<=42)) ) {
                    alt31=2;
                }
                else if ( (LA31_1==43) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1828:3: ( (lv_value_0_0= ruleFloat ) )
                    {
                    // InternalMyDsl.g:1828:3: ( (lv_value_0_0= ruleFloat ) )
                    // InternalMyDsl.g:1829:4: (lv_value_0_0= ruleFloat )
                    {
                    // InternalMyDsl.g:1829:4: (lv_value_0_0= ruleFloat )
                    // InternalMyDsl.g:1830:5: lv_value_0_0= ruleFloat
                    {

                    					newCompositeNode(grammarAccess.getAtomicNumberAccess().getValueFloatParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleFloat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomicNumberRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Float");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1848:3: ( (lv_value2_1_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:1848:3: ( (lv_value2_1_0= RULE_INT ) )
                    // InternalMyDsl.g:1849:4: (lv_value2_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1849:4: (lv_value2_1_0= RULE_INT )
                    // InternalMyDsl.g:1850:5: lv_value2_1_0= RULE_INT
                    {
                    lv_value2_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value2_1_0, grammarAccess.getAtomicNumberAccess().getValue2INTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomicNumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value2",
                    						lv_value2_1_0,
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


    // $ANTLR start "entryRuleFloat"
    // InternalMyDsl.g:1870:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalMyDsl.g:1870:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalMyDsl.g:1871:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalMyDsl.g:1877:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1883:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyDsl.g:1884:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyDsl.g:1884:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMyDsl.g:1885:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,43,FOLLOW_16); 

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
    // InternalMyDsl.g:1908:1: entryRuleLegalType returns [String current=null] : iv_ruleLegalType= ruleLegalType EOF ;
    public final String entryRuleLegalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLegalType = null;


        try {
            // InternalMyDsl.g:1908:49: (iv_ruleLegalType= ruleLegalType EOF )
            // InternalMyDsl.g:1909:2: iv_ruleLegalType= ruleLegalType EOF
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
    // InternalMyDsl.g:1915:1: ruleLegalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Float' | kw= 'Integer' ) ;
    public final AntlrDatatypeRuleToken ruleLegalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1921:2: ( (kw= 'Float' | kw= 'Integer' ) )
            // InternalMyDsl.g:1922:2: (kw= 'Float' | kw= 'Integer' )
            {
            // InternalMyDsl.g:1922:2: (kw= 'Float' | kw= 'Integer' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            else if ( (LA32_0==45) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1923:3: kw= 'Float'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getFloatKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1929:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000284D002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000120300020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000300000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000120300032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000130300020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000120300022L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});

}