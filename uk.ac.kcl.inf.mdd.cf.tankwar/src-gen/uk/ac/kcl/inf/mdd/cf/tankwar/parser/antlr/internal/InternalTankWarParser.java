package uk.ac.kcl.inf.mdd.cf.tankwar.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.mdd.cf.tankwar.services.TankWarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTankWarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'{'", "'}'", "'var'", "'='", "'end-game'", "'('", "','", "')'", "'screen'", "'screenWidth'", "'screenHeight'", "'obstacle'", "'water'", "'wall'", "'wallWidth'", "'wallHeight'", "'wallPosX'", "'wallPosY'", "'field'", "'enemyCount'", "'nextLevel'", "'goto'", "'superMode'", "'start'", "'allowRestart'", "'+'", "'-'", "'*'", "'/'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTankWarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTankWarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTankWarParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTankWar.g"; }



     	private TankWarGrammarAccess grammarAccess;

        public InternalTankWarParser(TokenStream input, TankWarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TankWarGame";
       	}

       	@Override
       	protected TankWarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTankWarGame"
    // InternalTankWar.g:64:1: entryRuleTankWarGame returns [EObject current=null] : iv_ruleTankWarGame= ruleTankWarGame EOF ;
    public final EObject entryRuleTankWarGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTankWarGame = null;


        try {
            // InternalTankWar.g:64:52: (iv_ruleTankWarGame= ruleTankWarGame EOF )
            // InternalTankWar.g:65:2: iv_ruleTankWarGame= ruleTankWarGame EOF
            {
             newCompositeNode(grammarAccess.getTankWarGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTankWarGame=ruleTankWarGame();

            state._fsp--;

             current =iv_ruleTankWarGame; 
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
    // $ANTLR end "entryRuleTankWarGame"


    // $ANTLR start "ruleTankWarGame"
    // InternalTankWar.g:71:1: ruleTankWarGame returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variable_3_0= ruleVariableDeclaration ) )? ( (lv_screen_4_0= ruleScreenSpecification ) ) ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )+ otherlv_7= '}' ) ;
    public final EObject ruleTankWarGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_variable_3_0 = null;

        EObject lv_screen_4_0 = null;

        EObject lv_fields_5_0 = null;

        EObject lv_options_6_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variable_3_0= ruleVariableDeclaration ) )? ( (lv_screen_4_0= ruleScreenSpecification ) ) ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )+ otherlv_7= '}' ) )
            // InternalTankWar.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variable_3_0= ruleVariableDeclaration ) )? ( (lv_screen_4_0= ruleScreenSpecification ) ) ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )+ otherlv_7= '}' )
            {
            // InternalTankWar.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variable_3_0= ruleVariableDeclaration ) )? ( (lv_screen_4_0= ruleScreenSpecification ) ) ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )+ otherlv_7= '}' )
            // InternalTankWar.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variable_3_0= ruleVariableDeclaration ) )? ( (lv_screen_4_0= ruleScreenSpecification ) ) ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTankWarGameAccess().getGameKeyword_0());
            		
            // InternalTankWar.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTankWarGameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTankWarGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTankWarGameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTankWar.g:105:3: ( (lv_variable_3_0= ruleVariableDeclaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTankWar.g:106:4: (lv_variable_3_0= ruleVariableDeclaration )
                    {
                    // InternalTankWar.g:106:4: (lv_variable_3_0= ruleVariableDeclaration )
                    // InternalTankWar.g:107:5: lv_variable_3_0= ruleVariableDeclaration
                    {

                    					newCompositeNode(grammarAccess.getTankWarGameAccess().getVariableVariableDeclarationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_variable_3_0=ruleVariableDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTankWarGameRule());
                    					}
                    					add(
                    						current,
                    						"variable",
                    						lv_variable_3_0,
                    						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.VariableDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTankWar.g:124:3: ( (lv_screen_4_0= ruleScreenSpecification ) )
            // InternalTankWar.g:125:4: (lv_screen_4_0= ruleScreenSpecification )
            {
            // InternalTankWar.g:125:4: (lv_screen_4_0= ruleScreenSpecification )
            // InternalTankWar.g:126:5: lv_screen_4_0= ruleScreenSpecification
            {

            					newCompositeNode(grammarAccess.getTankWarGameAccess().getScreenScreenSpecificationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_screen_4_0=ruleScreenSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTankWarGameRule());
            					}
            					set(
            						current,
            						"screen",
            						lv_screen_4_0,
            						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.ScreenSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTankWar.g:143:3: ( (lv_fields_5_0= ruleFieldSpecification ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTankWar.g:144:4: (lv_fields_5_0= ruleFieldSpecification )
            	    {
            	    // InternalTankWar.g:144:4: (lv_fields_5_0= ruleFieldSpecification )
            	    // InternalTankWar.g:145:5: lv_fields_5_0= ruleFieldSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getTankWarGameAccess().getFieldsFieldSpecificationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_fields_5_0=ruleFieldSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTankWarGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_5_0,
            	    						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.FieldSpecification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalTankWar.g:162:3: ( (lv_options_6_0= ruleOptionSpecification ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||(LA3_0>=34 && LA3_0<=36)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTankWar.g:163:4: (lv_options_6_0= ruleOptionSpecification )
            	    {
            	    // InternalTankWar.g:163:4: (lv_options_6_0= ruleOptionSpecification )
            	    // InternalTankWar.g:164:5: lv_options_6_0= ruleOptionSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getTankWarGameAccess().getOptionsOptionSpecificationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_options_6_0=ruleOptionSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTankWarGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"options",
            	    						lv_options_6_0,
            	    						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.OptionSpecification");
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

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTankWarGameAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTankWarGame"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTankWar.g:189:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTankWar.g:189:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTankWar.g:190:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTankWar.g:196:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTankWar.g:202:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalTankWar.g:203:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalTankWar.g:203:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalTankWar.g:204:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalTankWar.g:208:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:209:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:209:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:210:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalTankWar.g:230:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalTankWar.g:231:4: (lv_value_3_0= RULE_INT )
            {
            // InternalTankWar.g:231:4: (lv_value_3_0= RULE_INT )
            // InternalTankWar.g:232:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleEndGameBehaviour"
    // InternalTankWar.g:252:1: entryRuleEndGameBehaviour returns [EObject current=null] : iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF ;
    public final EObject entryRuleEndGameBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndGameBehaviour = null;


        try {
            // InternalTankWar.g:252:57: (iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF )
            // InternalTankWar.g:253:2: iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF
            {
             newCompositeNode(grammarAccess.getEndGameBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndGameBehaviour=ruleEndGameBehaviour();

            state._fsp--;

             current =iv_ruleEndGameBehaviour; 
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
    // $ANTLR end "entryRuleEndGameBehaviour"


    // $ANTLR start "ruleEndGameBehaviour"
    // InternalTankWar.g:259:1: ruleEndGameBehaviour returns [EObject current=null] : (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleEndGameBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_win_2_0=null;
        Token otherlv_3=null;
        Token lv_lost_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalTankWar.g:265:2: ( (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalTankWar.g:266:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalTankWar.g:266:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalTankWar.g:267:3: otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTankWar.g:275:3: ( (lv_win_2_0= RULE_STRING ) )
            // InternalTankWar.g:276:4: (lv_win_2_0= RULE_STRING )
            {
            // InternalTankWar.g:276:4: (lv_win_2_0= RULE_STRING )
            // InternalTankWar.g:277:5: lv_win_2_0= RULE_STRING
            {
            lv_win_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_win_2_0, grammarAccess.getEndGameBehaviourAccess().getWinSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndGameBehaviourRule());
            					}
            					setWithLastConsumed(
            						current,
            						"win",
            						lv_win_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getEndGameBehaviourAccess().getCommaKeyword_3());
            		
            // InternalTankWar.g:297:3: ( (lv_lost_4_0= RULE_STRING ) )
            // InternalTankWar.g:298:4: (lv_lost_4_0= RULE_STRING )
            {
            // InternalTankWar.g:298:4: (lv_lost_4_0= RULE_STRING )
            // InternalTankWar.g:299:5: lv_lost_4_0= RULE_STRING
            {
            lv_lost_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_lost_4_0, grammarAccess.getEndGameBehaviourAccess().getLostSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndGameBehaviourRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lost",
            						lv_lost_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEndGameBehaviourAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleEndGameBehaviour"


    // $ANTLR start "entryRuleScreenSpecification"
    // InternalTankWar.g:323:1: entryRuleScreenSpecification returns [EObject current=null] : iv_ruleScreenSpecification= ruleScreenSpecification EOF ;
    public final EObject entryRuleScreenSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenSpecification = null;


        try {
            // InternalTankWar.g:323:60: (iv_ruleScreenSpecification= ruleScreenSpecification EOF )
            // InternalTankWar.g:324:2: iv_ruleScreenSpecification= ruleScreenSpecification EOF
            {
             newCompositeNode(grammarAccess.getScreenSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScreenSpecification=ruleScreenSpecification();

            state._fsp--;

             current =iv_ruleScreenSpecification; 
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
    // $ANTLR end "entryRuleScreenSpecification"


    // $ANTLR start "ruleScreenSpecification"
    // InternalTankWar.g:330:1: ruleScreenSpecification returns [EObject current=null] : (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
    public final EObject ruleScreenSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_screenWidth_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_screenHeight_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalTankWar.g:336:2: ( (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalTankWar.g:337:2: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalTankWar.g:337:2: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalTankWar.g:338:3: otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScreenSpecificationAccess().getScreenKeyword_0());
            		
            // InternalTankWar.g:342:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:343:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:343:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:344:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScreenSpecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScreenSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getScreenSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getScreenSpecificationAccess().getScreenWidthKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_4());
            		
            // InternalTankWar.g:372:3: ( (lv_screenWidth_5_0= RULE_INT ) )
            // InternalTankWar.g:373:4: (lv_screenWidth_5_0= RULE_INT )
            {
            // InternalTankWar.g:373:4: (lv_screenWidth_5_0= RULE_INT )
            // InternalTankWar.g:374:5: lv_screenWidth_5_0= RULE_INT
            {
            lv_screenWidth_5_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_screenWidth_5_0, grammarAccess.getScreenSpecificationAccess().getScreenWidthINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScreenSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"screenWidth",
            						lv_screenWidth_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getScreenSpecificationAccess().getScreenHeightKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_7());
            		
            // InternalTankWar.g:398:3: ( (lv_screenHeight_8_0= RULE_INT ) )
            // InternalTankWar.g:399:4: (lv_screenHeight_8_0= RULE_INT )
            {
            // InternalTankWar.g:399:4: (lv_screenHeight_8_0= RULE_INT )
            // InternalTankWar.g:400:5: lv_screenHeight_8_0= RULE_INT
            {
            lv_screenHeight_8_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_screenHeight_8_0, grammarAccess.getScreenSpecificationAccess().getScreenHeightINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScreenSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"screenHeight",
            						lv_screenHeight_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getScreenSpecificationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleScreenSpecification"


    // $ANTLR start "entryRuleObstaclepecification"
    // InternalTankWar.g:424:1: entryRuleObstaclepecification returns [EObject current=null] : iv_ruleObstaclepecification= ruleObstaclepecification EOF ;
    public final EObject entryRuleObstaclepecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstaclepecification = null;


        try {
            // InternalTankWar.g:424:61: (iv_ruleObstaclepecification= ruleObstaclepecification EOF )
            // InternalTankWar.g:425:2: iv_ruleObstaclepecification= ruleObstaclepecification EOF
            {
             newCompositeNode(grammarAccess.getObstaclepecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstaclepecification=ruleObstaclepecification();

            state._fsp--;

             current =iv_ruleObstaclepecification; 
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
    // $ANTLR end "entryRuleObstaclepecification"


    // $ANTLR start "ruleObstaclepecification"
    // InternalTankWar.g:431:1: ruleObstaclepecification returns [EObject current=null] : (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleObstaclepecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:437:2: ( (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}' ) )
            // InternalTankWar.g:438:2: (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}' )
            {
            // InternalTankWar.g:438:2: (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}' )
            // InternalTankWar.g:439:3: otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObstaclepecificationAccess().getObstacleKeyword_0());
            		
            // InternalTankWar.g:443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:444:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObstaclepecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstaclepecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getObstaclepecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTankWar.g:465:3: ( (lv_fields_3_0= ruleObstacleMember ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=24 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTankWar.g:466:4: (lv_fields_3_0= ruleObstacleMember )
            	    {
            	    // InternalTankWar.g:466:4: (lv_fields_3_0= ruleObstacleMember )
            	    // InternalTankWar.g:467:5: lv_fields_3_0= ruleObstacleMember
            	    {

            	    					newCompositeNode(grammarAccess.getObstaclepecificationAccess().getFieldsObstacleMemberParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_fields_3_0=ruleObstacleMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObstaclepecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_3_0,
            	    						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.ObstacleMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getObstaclepecificationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleObstaclepecification"


    // $ANTLR start "entryRuleObstacleMember"
    // InternalTankWar.g:492:1: entryRuleObstacleMember returns [EObject current=null] : iv_ruleObstacleMember= ruleObstacleMember EOF ;
    public final EObject entryRuleObstacleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacleMember = null;


        try {
            // InternalTankWar.g:492:55: (iv_ruleObstacleMember= ruleObstacleMember EOF )
            // InternalTankWar.g:493:2: iv_ruleObstacleMember= ruleObstacleMember EOF
            {
             newCompositeNode(grammarAccess.getObstacleMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstacleMember=ruleObstacleMember();

            state._fsp--;

             current =iv_ruleObstacleMember; 
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
    // $ANTLR end "entryRuleObstacleMember"


    // $ANTLR start "ruleObstacleMember"
    // InternalTankWar.g:499:1: ruleObstacleMember returns [EObject current=null] : (this_WallObstacle_0= ruleWallObstacle | this_WaterObstacle_1= ruleWaterObstacle ) ;
    public final EObject ruleObstacleMember() throws RecognitionException {
        EObject current = null;

        EObject this_WallObstacle_0 = null;

        EObject this_WaterObstacle_1 = null;



        	enterRule();

        try {
            // InternalTankWar.g:505:2: ( (this_WallObstacle_0= ruleWallObstacle | this_WaterObstacle_1= ruleWaterObstacle ) )
            // InternalTankWar.g:506:2: (this_WallObstacle_0= ruleWallObstacle | this_WaterObstacle_1= ruleWaterObstacle )
            {
            // InternalTankWar.g:506:2: (this_WallObstacle_0= ruleWallObstacle | this_WaterObstacle_1= ruleWaterObstacle )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTankWar.g:507:3: this_WallObstacle_0= ruleWallObstacle
                    {

                    			newCompositeNode(grammarAccess.getObstacleMemberAccess().getWallObstacleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WallObstacle_0=ruleWallObstacle();

                    state._fsp--;


                    			current = this_WallObstacle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTankWar.g:516:3: this_WaterObstacle_1= ruleWaterObstacle
                    {

                    			newCompositeNode(grammarAccess.getObstacleMemberAccess().getWaterObstacleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaterObstacle_1=ruleWaterObstacle();

                    state._fsp--;


                    			current = this_WaterObstacle_1;
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
    // $ANTLR end "ruleObstacleMember"


    // $ANTLR start "entryRuleWaterObstacle"
    // InternalTankWar.g:528:1: entryRuleWaterObstacle returns [EObject current=null] : iv_ruleWaterObstacle= ruleWaterObstacle EOF ;
    public final EObject entryRuleWaterObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaterObstacle = null;


        try {
            // InternalTankWar.g:528:54: (iv_ruleWaterObstacle= ruleWaterObstacle EOF )
            // InternalTankWar.g:529:2: iv_ruleWaterObstacle= ruleWaterObstacle EOF
            {
             newCompositeNode(grammarAccess.getWaterObstacleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaterObstacle=ruleWaterObstacle();

            state._fsp--;

             current =iv_ruleWaterObstacle; 
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
    // $ANTLR end "entryRuleWaterObstacle"


    // $ANTLR start "ruleWaterObstacle"
    // InternalTankWar.g:535:1: ruleWaterObstacle returns [EObject current=null] : (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleWaterObstacle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTankWar.g:541:2: ( (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalTankWar.g:542:2: (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalTankWar.g:542:2: (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalTankWar.g:543:3: otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWaterObstacleAccess().getWaterKeyword_0());
            		
            // InternalTankWar.g:547:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:548:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:548:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:549:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWaterObstacleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaterObstacleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getWaterObstacleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWaterObstacleAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleWaterObstacle"


    // $ANTLR start "entryRuleWallObstacle"
    // InternalTankWar.g:577:1: entryRuleWallObstacle returns [EObject current=null] : iv_ruleWallObstacle= ruleWallObstacle EOF ;
    public final EObject entryRuleWallObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallObstacle = null;


        try {
            // InternalTankWar.g:577:53: (iv_ruleWallObstacle= ruleWallObstacle EOF )
            // InternalTankWar.g:578:2: iv_ruleWallObstacle= ruleWallObstacle EOF
            {
             newCompositeNode(grammarAccess.getWallObstacleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWallObstacle=ruleWallObstacle();

            state._fsp--;

             current =iv_ruleWallObstacle; 
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
    // $ANTLR end "entryRuleWallObstacle"


    // $ANTLR start "ruleWallObstacle"
    // InternalTankWar.g:584:1: ruleWallObstacle returns [EObject current=null] : (otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}' ) ;
    public final EObject ruleWallObstacle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_wallWidth_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_wallHeight_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_wallPosX_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_wallPosY_14_0=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalTankWar.g:590:2: ( (otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}' ) )
            // InternalTankWar.g:591:2: (otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}' )
            {
            // InternalTankWar.g:591:2: (otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}' )
            // InternalTankWar.g:592:3: otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWallObstacleAccess().getWallKeyword_0());
            		
            // InternalTankWar.g:596:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:597:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:597:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:598:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWallObstacleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWallObstacleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getWallObstacleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getWallObstacleAccess().getWallWidthKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_4());
            		
            // InternalTankWar.g:626:3: ( (lv_wallWidth_5_0= RULE_INT ) )
            // InternalTankWar.g:627:4: (lv_wallWidth_5_0= RULE_INT )
            {
            // InternalTankWar.g:627:4: (lv_wallWidth_5_0= RULE_INT )
            // InternalTankWar.g:628:5: lv_wallWidth_5_0= RULE_INT
            {
            lv_wallWidth_5_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_wallWidth_5_0, grammarAccess.getWallObstacleAccess().getWallWidthINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWallObstacleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"wallWidth",
            						lv_wallWidth_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getWallObstacleAccess().getWallHeightKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_7());
            		
            // InternalTankWar.g:652:3: ( (lv_wallHeight_8_0= RULE_INT ) )
            // InternalTankWar.g:653:4: (lv_wallHeight_8_0= RULE_INT )
            {
            // InternalTankWar.g:653:4: (lv_wallHeight_8_0= RULE_INT )
            // InternalTankWar.g:654:5: lv_wallHeight_8_0= RULE_INT
            {
            lv_wallHeight_8_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_wallHeight_8_0, grammarAccess.getWallObstacleAccess().getWallHeightINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWallObstacleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"wallHeight",
            						lv_wallHeight_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getWallObstacleAccess().getWallPosXKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_10());
            		
            // InternalTankWar.g:678:3: ( (lv_wallPosX_11_0= RULE_INT ) )
            // InternalTankWar.g:679:4: (lv_wallPosX_11_0= RULE_INT )
            {
            // InternalTankWar.g:679:4: (lv_wallPosX_11_0= RULE_INT )
            // InternalTankWar.g:680:5: lv_wallPosX_11_0= RULE_INT
            {
            lv_wallPosX_11_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_wallPosX_11_0, grammarAccess.getWallObstacleAccess().getWallPosXINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWallObstacleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"wallPosX",
            						lv_wallPosX_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getWallObstacleAccess().getWallPosYKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_13());
            		
            // InternalTankWar.g:704:3: ( (lv_wallPosY_14_0= RULE_INT ) )
            // InternalTankWar.g:705:4: (lv_wallPosY_14_0= RULE_INT )
            {
            // InternalTankWar.g:705:4: (lv_wallPosY_14_0= RULE_INT )
            // InternalTankWar.g:706:5: lv_wallPosY_14_0= RULE_INT
            {
            lv_wallPosY_14_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_wallPosY_14_0, grammarAccess.getWallObstacleAccess().getWallPosYINTTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWallObstacleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"wallPosY",
            						lv_wallPosY_14_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getWallObstacleAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleWallObstacle"


    // $ANTLR start "entryRuleFieldSpecification"
    // InternalTankWar.g:730:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // InternalTankWar.g:730:59: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // InternalTankWar.g:731:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
            {
             newCompositeNode(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSpecification=ruleFieldSpecification();

            state._fsp--;

             current =iv_ruleFieldSpecification; 
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
    // $ANTLR end "entryRuleFieldSpecification"


    // $ANTLR start "ruleFieldSpecification"
    // InternalTankWar.g:737:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= ruleAddition ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) ;
    public final EObject ruleFieldSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_enemyCount_5_0 = null;

        EObject lv_obstacle_6_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:743:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= ruleAddition ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) )
            // InternalTankWar.g:744:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= ruleAddition ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            {
            // InternalTankWar.g:744:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= ruleAddition ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            // InternalTankWar.g:745:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= ruleAddition ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
            		
            // InternalTankWar.g:749:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:750:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:750:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:751:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getEnemyCountKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4());
            		
            // InternalTankWar.g:779:3: ( (lv_enemyCount_5_0= ruleAddition ) )
            // InternalTankWar.g:780:4: (lv_enemyCount_5_0= ruleAddition )
            {
            // InternalTankWar.g:780:4: (lv_enemyCount_5_0= ruleAddition )
            // InternalTankWar.g:781:5: lv_enemyCount_5_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getFieldSpecificationAccess().getEnemyCountAdditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_enemyCount_5_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldSpecificationRule());
            					}
            					set(
            						current,
            						"enemyCount",
            						lv_enemyCount_5_0,
            						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTankWar.g:798:3: ( (lv_obstacle_6_0= ruleObstaclepecification ) )
            // InternalTankWar.g:799:4: (lv_obstacle_6_0= ruleObstaclepecification )
            {
            // InternalTankWar.g:799:4: (lv_obstacle_6_0= ruleObstaclepecification )
            // InternalTankWar.g:800:5: lv_obstacle_6_0= ruleObstaclepecification
            {

            					newCompositeNode(grammarAccess.getFieldSpecificationAccess().getObstacleObstaclepecificationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_26);
            lv_obstacle_6_0=ruleObstaclepecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldSpecificationRule());
            					}
            					set(
            						current,
            						"obstacle",
            						lv_obstacle_6_0,
            						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.Obstaclepecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_7, grammarAccess.getFieldSpecificationAccess().getNextLevelKeyword_7());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getFieldSpecificationAccess().getGotoKeyword_8());
            		
            // InternalTankWar.g:825:3: ( (otherlv_9= RULE_ID ) )
            // InternalTankWar.g:826:4: (otherlv_9= RULE_ID )
            {
            // InternalTankWar.g:826:4: (otherlv_9= RULE_ID )
            // InternalTankWar.g:827:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldSpecificationRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_9, grammarAccess.getFieldSpecificationAccess().getNextLevelFieldSpecificationCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleFieldSpecification"


    // $ANTLR start "entryRuleOptionSpecification"
    // InternalTankWar.g:846:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // InternalTankWar.g:846:60: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // InternalTankWar.g:847:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionSpecification=ruleOptionSpecification();

            state._fsp--;

             current =iv_ruleOptionSpecification; 
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
    // $ANTLR end "entryRuleOptionSpecification"


    // $ANTLR start "ruleOptionSpecification"
    // InternalTankWar.g:853:1: ruleOptionSpecification returns [EObject current=null] : (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_SuperModeDeclaration_2= ruleSuperModeDeclaration | this_EndGameBehaviour_3= ruleEndGameBehaviour ) ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StartFieldDeclaration_0 = null;

        EObject this_AllowRestartMenu_1 = null;

        EObject this_SuperModeDeclaration_2 = null;

        EObject this_EndGameBehaviour_3 = null;



        	enterRule();

        try {
            // InternalTankWar.g:859:2: ( (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_SuperModeDeclaration_2= ruleSuperModeDeclaration | this_EndGameBehaviour_3= ruleEndGameBehaviour ) )
            // InternalTankWar.g:860:2: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_SuperModeDeclaration_2= ruleSuperModeDeclaration | this_EndGameBehaviour_3= ruleEndGameBehaviour )
            {
            // InternalTankWar.g:860:2: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_SuperModeDeclaration_2= ruleSuperModeDeclaration | this_EndGameBehaviour_3= ruleEndGameBehaviour )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTankWar.g:861:3: this_StartFieldDeclaration_0= ruleStartFieldDeclaration
                    {

                    			newCompositeNode(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartFieldDeclaration_0=ruleStartFieldDeclaration();

                    state._fsp--;


                    			current = this_StartFieldDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTankWar.g:870:3: this_AllowRestartMenu_1= ruleAllowRestartMenu
                    {

                    			newCompositeNode(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllowRestartMenu_1=ruleAllowRestartMenu();

                    state._fsp--;


                    			current = this_AllowRestartMenu_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTankWar.g:879:3: this_SuperModeDeclaration_2= ruleSuperModeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getOptionSpecificationAccess().getSuperModeDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SuperModeDeclaration_2=ruleSuperModeDeclaration();

                    state._fsp--;


                    			current = this_SuperModeDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTankWar.g:888:3: this_EndGameBehaviour_3= ruleEndGameBehaviour
                    {

                    			newCompositeNode(grammarAccess.getOptionSpecificationAccess().getEndGameBehaviourParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndGameBehaviour_3=ruleEndGameBehaviour();

                    state._fsp--;


                    			current = this_EndGameBehaviour_3;
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
    // $ANTLR end "ruleOptionSpecification"


    // $ANTLR start "entryRuleSuperModeDeclaration"
    // InternalTankWar.g:900:1: entryRuleSuperModeDeclaration returns [EObject current=null] : iv_ruleSuperModeDeclaration= ruleSuperModeDeclaration EOF ;
    public final EObject entryRuleSuperModeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperModeDeclaration = null;


        try {
            // InternalTankWar.g:900:61: (iv_ruleSuperModeDeclaration= ruleSuperModeDeclaration EOF )
            // InternalTankWar.g:901:2: iv_ruleSuperModeDeclaration= ruleSuperModeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSuperModeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperModeDeclaration=ruleSuperModeDeclaration();

            state._fsp--;

             current =iv_ruleSuperModeDeclaration; 
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
    // $ANTLR end "entryRuleSuperModeDeclaration"


    // $ANTLR start "ruleSuperModeDeclaration"
    // InternalTankWar.g:907:1: ruleSuperModeDeclaration returns [EObject current=null] : (otherlv_0= 'superMode' () ) ;
    public final EObject ruleSuperModeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTankWar.g:913:2: ( (otherlv_0= 'superMode' () ) )
            // InternalTankWar.g:914:2: (otherlv_0= 'superMode' () )
            {
            // InternalTankWar.g:914:2: (otherlv_0= 'superMode' () )
            // InternalTankWar.g:915:3: otherlv_0= 'superMode' ()
            {
            otherlv_0=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperModeDeclarationAccess().getSuperModeKeyword_0());
            		
            // InternalTankWar.g:919:3: ()
            // InternalTankWar.g:920:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSuperModeDeclarationAccess().getSuperModeDeclarationAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleSuperModeDeclaration"


    // $ANTLR start "entryRuleStartFieldDeclaration"
    // InternalTankWar.g:930:1: entryRuleStartFieldDeclaration returns [EObject current=null] : iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF ;
    public final EObject entryRuleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartFieldDeclaration = null;


        try {
            // InternalTankWar.g:930:62: (iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF )
            // InternalTankWar.g:931:2: iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartFieldDeclaration=ruleStartFieldDeclaration();

            state._fsp--;

             current =iv_ruleStartFieldDeclaration; 
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
    // $ANTLR end "entryRuleStartFieldDeclaration"


    // $ANTLR start "ruleStartFieldDeclaration"
    // InternalTankWar.g:937:1: ruleStartFieldDeclaration returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTankWar.g:943:2: ( (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTankWar.g:944:2: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTankWar.g:944:2: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalTankWar.g:945:3: otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1());
            		
            // InternalTankWar.g:953:3: ( (otherlv_2= RULE_ID ) )
            // InternalTankWar.g:954:4: (otherlv_2= RULE_ID )
            {
            // InternalTankWar.g:954:4: (otherlv_2= RULE_ID )
            // InternalTankWar.g:955:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartFieldDeclarationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0());
            				

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
    // $ANTLR end "ruleStartFieldDeclaration"


    // $ANTLR start "entryRuleAllowRestartMenu"
    // InternalTankWar.g:970:1: entryRuleAllowRestartMenu returns [EObject current=null] : iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF ;
    public final EObject entryRuleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowRestartMenu = null;


        try {
            // InternalTankWar.g:970:57: (iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF )
            // InternalTankWar.g:971:2: iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF
            {
             newCompositeNode(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllowRestartMenu=ruleAllowRestartMenu();

            state._fsp--;

             current =iv_ruleAllowRestartMenu; 
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
    // $ANTLR end "entryRuleAllowRestartMenu"


    // $ANTLR start "ruleAllowRestartMenu"
    // InternalTankWar.g:977:1: ruleAllowRestartMenu returns [EObject current=null] : (otherlv_0= 'allowRestart' () ) ;
    public final EObject ruleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTankWar.g:983:2: ( (otherlv_0= 'allowRestart' () ) )
            // InternalTankWar.g:984:2: (otherlv_0= 'allowRestart' () )
            {
            // InternalTankWar.g:984:2: (otherlv_0= 'allowRestart' () )
            // InternalTankWar.g:985:3: otherlv_0= 'allowRestart' ()
            {
            otherlv_0=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getAllowRestartMenuAccess().getAllowRestartKeyword_0());
            		
            // InternalTankWar.g:989:3: ()
            // InternalTankWar.g:990:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleAllowRestartMenu"


    // $ANTLR start "entryRuleAddition"
    // InternalTankWar.g:1000:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalTankWar.g:1000:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalTankWar.g:1001:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalTankWar.g:1007:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:1013:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalTankWar.g:1014:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalTankWar.g:1014:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalTankWar.g:1015:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTankWar.g:1023:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=37 && LA8_0<=38)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTankWar.g:1024:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalTankWar.g:1024:4: ()
            	    // InternalTankWar.g:1025:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTankWar.g:1031:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalTankWar.g:1032:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalTankWar.g:1032:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalTankWar.g:1033:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalTankWar.g:1033:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==37) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==38) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalTankWar.g:1034:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,37,FOLLOW_24); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTankWar.g:1045:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,38,FOLLOW_24); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTankWar.g:1058:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalTankWar.g:1059:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalTankWar.g:1059:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalTankWar.g:1060:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalTankWar.g:1082:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalTankWar.g:1082:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalTankWar.g:1083:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalTankWar.g:1089:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:1095:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTankWar.g:1096:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTankWar.g:1096:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTankWar.g:1097:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTankWar.g:1105:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=39 && LA10_0<=40)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTankWar.g:1106:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTankWar.g:1106:4: ()
            	    // InternalTankWar.g:1107:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTankWar.g:1113:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalTankWar.g:1114:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalTankWar.g:1114:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalTankWar.g:1115:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalTankWar.g:1115:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==39) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==40) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalTankWar.g:1116:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,39,FOLLOW_24); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTankWar.g:1127:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,40,FOLLOW_24); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTankWar.g:1140:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTankWar.g:1141:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTankWar.g:1141:5: (lv_right_3_0= rulePrimary )
            	    // InternalTankWar.g:1142:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalTankWar.g:1164:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTankWar.g:1164:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTankWar.g:1165:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalTankWar.g:1171:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_RealLiteral_2 = null;

        EObject this_Addition_4 = null;



        	enterRule();

        try {
            // InternalTankWar.g:1177:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) )
            // InternalTankWar.g:1178:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            {
            // InternalTankWar.g:1178:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==19||LA11_1==23||(LA11_1>=37 && LA11_1<=40)) ) {
                    alt11=1;
                }
                else if ( (LA11_1==41) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 41:
                {
                alt11=3;
                }
                break;
            case 17:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTankWar.g:1179:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTankWar.g:1188:3: this_IntVarExpression_1= ruleIntVarExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarExpression_1=ruleIntVarExpression();

                    state._fsp--;


                    			current = this_IntVarExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTankWar.g:1197:3: this_RealLiteral_2= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_2=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTankWar.g:1206:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    {
                    // InternalTankWar.g:1206:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    // InternalTankWar.g:1207:4: otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_14);
                    this_Addition_4=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalTankWar.g:1228:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalTankWar.g:1228:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalTankWar.g:1229:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
            {
             newCompositeNode(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVarExpression=ruleIntVarExpression();

            state._fsp--;

             current =iv_ruleIntVarExpression; 
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
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalTankWar.g:1235:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTankWar.g:1241:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTankWar.g:1242:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTankWar.g:1242:2: ( (otherlv_0= RULE_ID ) )
            // InternalTankWar.g:1243:3: (otherlv_0= RULE_ID )
            {
            // InternalTankWar.g:1243:3: (otherlv_0= RULE_ID )
            // InternalTankWar.g:1244:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalTankWar.g:1258:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalTankWar.g:1258:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalTankWar.g:1259:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalTankWar.g:1265:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalTankWar.g:1271:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalTankWar.g:1272:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalTankWar.g:1272:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalTankWar.g:1273:3: (lv_val_0_0= RULE_INT )
            {
            // InternalTankWar.g:1273:3: (lv_val_0_0= RULE_INT )
            // InternalTankWar.g:1274:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalTankWar.g:1293:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalTankWar.g:1293:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalTankWar.g:1294:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalTankWar.g:1300:1: ruleRealLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleREAL ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:1306:2: ( ( (lv_val_0_0= ruleREAL ) ) )
            // InternalTankWar.g:1307:2: ( (lv_val_0_0= ruleREAL ) )
            {
            // InternalTankWar.g:1307:2: ( (lv_val_0_0= ruleREAL ) )
            // InternalTankWar.g:1308:3: (lv_val_0_0= ruleREAL )
            {
            // InternalTankWar.g:1308:3: (lv_val_0_0= ruleREAL )
            // InternalTankWar.g:1309:4: lv_val_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.REAL");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleREAL"
    // InternalTankWar.g:1329:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTankWar.g:1331:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalTankWar.g:1332:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalTankWar.g:1341:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTankWar.g:1348:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalTankWar.g:1349:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalTankWar.g:1349:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalTankWar.g:1350:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalTankWar.g:1350:3: (this_INT_0= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTankWar.g:1351:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001C40010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001C00012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000020030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});

}