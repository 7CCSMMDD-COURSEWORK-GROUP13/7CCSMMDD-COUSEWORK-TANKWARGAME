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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'{'", "'}'", "'end-game'", "'('", "','", "')'", "'nop'", "'screen'", "'screenWidth'", "'='", "'screenHeight'", "'obstacle'", "'water'", "'wall'", "'wallWidth'", "'wallHeight'", "'wallPosX'", "'wallPosY'", "'field'", "'enemyCount'", "'nextLevel'", "'goto'", "'init'", "';'", "'default'", "':'", "'defaultInitialisation'", "'random'", "'randomInitialisation'", "'context'", "'contextInitialisation'", "'superMode'", "'start'", "'allowRestart'"
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    // InternalTankWar.g:71:1: ruleTankWarGame returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screen_3_0= ruleScreenSpecification ) ) ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )+ otherlv_6= '}' ) ;
    public final EObject ruleTankWarGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_screen_3_0 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_options_5_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screen_3_0= ruleScreenSpecification ) ) ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )+ otherlv_6= '}' ) )
            // InternalTankWar.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screen_3_0= ruleScreenSpecification ) ) ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )+ otherlv_6= '}' )
            {
            // InternalTankWar.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screen_3_0= ruleScreenSpecification ) ) ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )+ otherlv_6= '}' )
            // InternalTankWar.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screen_3_0= ruleScreenSpecification ) ) ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )+ otherlv_6= '}'
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
            		
            // InternalTankWar.g:105:3: ( (lv_screen_3_0= ruleScreenSpecification ) )
            // InternalTankWar.g:106:4: (lv_screen_3_0= ruleScreenSpecification )
            {
            // InternalTankWar.g:106:4: (lv_screen_3_0= ruleScreenSpecification )
            // InternalTankWar.g:107:5: lv_screen_3_0= ruleScreenSpecification
            {

            					newCompositeNode(grammarAccess.getTankWarGameAccess().getScreenScreenSpecificationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_screen_3_0=ruleScreenSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTankWarGameRule());
            					}
            					set(
            						current,
            						"screen",
            						lv_screen_3_0,
            						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.ScreenSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTankWar.g:124:3: ( (lv_fields_4_0= ruleFieldSpecification ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTankWar.g:125:4: (lv_fields_4_0= ruleFieldSpecification )
            	    {
            	    // InternalTankWar.g:125:4: (lv_fields_4_0= ruleFieldSpecification )
            	    // InternalTankWar.g:126:5: lv_fields_4_0= ruleFieldSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getTankWarGameAccess().getFieldsFieldSpecificationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_fields_4_0=ruleFieldSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTankWarGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_4_0,
            	    						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.FieldSpecification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalTankWar.g:143:3: ( (lv_options_5_0= ruleOptionSpecification ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||(LA2_0>=43 && LA2_0<=45)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTankWar.g:144:4: (lv_options_5_0= ruleOptionSpecification )
            	    {
            	    // InternalTankWar.g:144:4: (lv_options_5_0= ruleOptionSpecification )
            	    // InternalTankWar.g:145:5: lv_options_5_0= ruleOptionSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getTankWarGameAccess().getOptionsOptionSpecificationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_options_5_0=ruleOptionSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTankWarGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"options",
            	    						lv_options_5_0,
            	    						"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.OptionSpecification");
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

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTankWarGameAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleDirectBehaviour"
    // InternalTankWar.g:170:1: entryRuleDirectBehaviour returns [EObject current=null] : iv_ruleDirectBehaviour= ruleDirectBehaviour EOF ;
    public final EObject entryRuleDirectBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectBehaviour = null;


        try {
            // InternalTankWar.g:170:56: (iv_ruleDirectBehaviour= ruleDirectBehaviour EOF )
            // InternalTankWar.g:171:2: iv_ruleDirectBehaviour= ruleDirectBehaviour EOF
            {
             newCompositeNode(grammarAccess.getDirectBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectBehaviour=ruleDirectBehaviour();

            state._fsp--;

             current =iv_ruleDirectBehaviour; 
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
    // $ANTLR end "entryRuleDirectBehaviour"


    // $ANTLR start "ruleDirectBehaviour"
    // InternalTankWar.g:177:1: ruleDirectBehaviour returns [EObject current=null] : (this_EndGameBehaviour_0= ruleEndGameBehaviour | ( ruleNoOpBehaviour () ) ) ;
    public final EObject ruleDirectBehaviour() throws RecognitionException {
        EObject current = null;

        EObject this_EndGameBehaviour_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:183:2: ( (this_EndGameBehaviour_0= ruleEndGameBehaviour | ( ruleNoOpBehaviour () ) ) )
            // InternalTankWar.g:184:2: (this_EndGameBehaviour_0= ruleEndGameBehaviour | ( ruleNoOpBehaviour () ) )
            {
            // InternalTankWar.g:184:2: (this_EndGameBehaviour_0= ruleEndGameBehaviour | ( ruleNoOpBehaviour () ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTankWar.g:185:3: this_EndGameBehaviour_0= ruleEndGameBehaviour
                    {

                    			newCompositeNode(grammarAccess.getDirectBehaviourAccess().getEndGameBehaviourParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndGameBehaviour_0=ruleEndGameBehaviour();

                    state._fsp--;


                    			current = this_EndGameBehaviour_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTankWar.g:194:3: ( ruleNoOpBehaviour () )
                    {
                    // InternalTankWar.g:194:3: ( ruleNoOpBehaviour () )
                    // InternalTankWar.g:195:4: ruleNoOpBehaviour ()
                    {

                    				newCompositeNode(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    ruleNoOpBehaviour();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalTankWar.g:202:4: ()
                    // InternalTankWar.g:203:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourAction_1_1(),
                    						current);
                    				

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
    // $ANTLR end "ruleDirectBehaviour"


    // $ANTLR start "entryRuleEndGameBehaviour"
    // InternalTankWar.g:214:1: entryRuleEndGameBehaviour returns [EObject current=null] : iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF ;
    public final EObject entryRuleEndGameBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndGameBehaviour = null;


        try {
            // InternalTankWar.g:214:57: (iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF )
            // InternalTankWar.g:215:2: iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF
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
    // InternalTankWar.g:221:1: ruleEndGameBehaviour returns [EObject current=null] : (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalTankWar.g:227:2: ( (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalTankWar.g:228:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalTankWar.g:228:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalTankWar.g:229:3: otherlv_0= 'end-game' otherlv_1= '(' ( (lv_win_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_lost_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTankWar.g:237:3: ( (lv_win_2_0= RULE_STRING ) )
            // InternalTankWar.g:238:4: (lv_win_2_0= RULE_STRING )
            {
            // InternalTankWar.g:238:4: (lv_win_2_0= RULE_STRING )
            // InternalTankWar.g:239:5: lv_win_2_0= RULE_STRING
            {
            lv_win_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getEndGameBehaviourAccess().getCommaKeyword_3());
            		
            // InternalTankWar.g:259:3: ( (lv_lost_4_0= RULE_STRING ) )
            // InternalTankWar.g:260:4: (lv_lost_4_0= RULE_STRING )
            {
            // InternalTankWar.g:260:4: (lv_lost_4_0= RULE_STRING )
            // InternalTankWar.g:261:5: lv_lost_4_0= RULE_STRING
            {
            lv_lost_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNoOpBehaviour"
    // InternalTankWar.g:285:1: entryRuleNoOpBehaviour returns [String current=null] : iv_ruleNoOpBehaviour= ruleNoOpBehaviour EOF ;
    public final String entryRuleNoOpBehaviour() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoOpBehaviour = null;


        try {
            // InternalTankWar.g:285:53: (iv_ruleNoOpBehaviour= ruleNoOpBehaviour EOF )
            // InternalTankWar.g:286:2: iv_ruleNoOpBehaviour= ruleNoOpBehaviour EOF
            {
             newCompositeNode(grammarAccess.getNoOpBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoOpBehaviour=ruleNoOpBehaviour();

            state._fsp--;

             current =iv_ruleNoOpBehaviour.getText(); 
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
    // $ANTLR end "entryRuleNoOpBehaviour"


    // $ANTLR start "ruleNoOpBehaviour"
    // InternalTankWar.g:292:1: ruleNoOpBehaviour returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'nop' ;
    public final AntlrDatatypeRuleToken ruleNoOpBehaviour() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTankWar.g:298:2: (kw= 'nop' )
            // InternalTankWar.g:299:2: kw= 'nop'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNoOpBehaviourAccess().getNopKeyword());
            	

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
    // $ANTLR end "ruleNoOpBehaviour"


    // $ANTLR start "entryRuleStringValue"
    // InternalTankWar.g:307:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalTankWar.g:307:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalTankWar.g:308:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalTankWar.g:314:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTankWar.g:320:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTankWar.g:321:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTankWar.g:321:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTankWar.g:322:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTankWar.g:322:3: (lv_value_0_0= RULE_STRING )
            // InternalTankWar.g:323:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalTankWar.g:342:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalTankWar.g:342:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalTankWar.g:343:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalTankWar.g:349:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTankWar.g:355:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTankWar.g:356:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTankWar.g:356:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTankWar.g:357:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTankWar.g:357:3: (lv_value_0_0= RULE_INT )
            // InternalTankWar.g:358:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleScreenSpecification"
    // InternalTankWar.g:377:1: entryRuleScreenSpecification returns [EObject current=null] : iv_ruleScreenSpecification= ruleScreenSpecification EOF ;
    public final EObject entryRuleScreenSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenSpecification = null;


        try {
            // InternalTankWar.g:377:60: (iv_ruleScreenSpecification= ruleScreenSpecification EOF )
            // InternalTankWar.g:378:2: iv_ruleScreenSpecification= ruleScreenSpecification EOF
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
    // InternalTankWar.g:384:1: ruleScreenSpecification returns [EObject current=null] : (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
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
            // InternalTankWar.g:390:2: ( (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalTankWar.g:391:2: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalTankWar.g:391:2: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalTankWar.g:392:3: otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screenWidth' otherlv_4= '=' ( (lv_screenWidth_5_0= RULE_INT ) ) otherlv_6= 'screenHeight' otherlv_7= '=' ( (lv_screenHeight_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScreenSpecificationAccess().getScreenKeyword_0());
            		
            // InternalTankWar.g:396:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:397:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:397:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:398:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getScreenSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getScreenSpecificationAccess().getScreenWidthKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_4());
            		
            // InternalTankWar.g:426:3: ( (lv_screenWidth_5_0= RULE_INT ) )
            // InternalTankWar.g:427:4: (lv_screenWidth_5_0= RULE_INT )
            {
            // InternalTankWar.g:427:4: (lv_screenWidth_5_0= RULE_INT )
            // InternalTankWar.g:428:5: lv_screenWidth_5_0= RULE_INT
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

            otherlv_6=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getScreenSpecificationAccess().getScreenHeightKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_7());
            		
            // InternalTankWar.g:452:3: ( (lv_screenHeight_8_0= RULE_INT ) )
            // InternalTankWar.g:453:4: (lv_screenHeight_8_0= RULE_INT )
            {
            // InternalTankWar.g:453:4: (lv_screenHeight_8_0= RULE_INT )
            // InternalTankWar.g:454:5: lv_screenHeight_8_0= RULE_INT
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
    // InternalTankWar.g:478:1: entryRuleObstaclepecification returns [EObject current=null] : iv_ruleObstaclepecification= ruleObstaclepecification EOF ;
    public final EObject entryRuleObstaclepecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstaclepecification = null;


        try {
            // InternalTankWar.g:478:61: (iv_ruleObstaclepecification= ruleObstaclepecification EOF )
            // InternalTankWar.g:479:2: iv_ruleObstaclepecification= ruleObstaclepecification EOF
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
    // InternalTankWar.g:485:1: ruleObstaclepecification returns [EObject current=null] : (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleObstaclepecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:491:2: ( (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}' ) )
            // InternalTankWar.g:492:2: (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}' )
            {
            // InternalTankWar.g:492:2: (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}' )
            // InternalTankWar.g:493:3: otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleObstacleMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObstaclepecificationAccess().getObstacleKeyword_0());
            		
            // InternalTankWar.g:497:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:498:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:498:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:499:5: lv_name_1_0= RULE_ID
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
            		
            // InternalTankWar.g:519:3: ( (lv_fields_3_0= ruleObstacleMember ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=24 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTankWar.g:520:4: (lv_fields_3_0= ruleObstacleMember )
            	    {
            	    // InternalTankWar.g:520:4: (lv_fields_3_0= ruleObstacleMember )
            	    // InternalTankWar.g:521:5: lv_fields_3_0= ruleObstacleMember
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
    // InternalTankWar.g:546:1: entryRuleObstacleMember returns [EObject current=null] : iv_ruleObstacleMember= ruleObstacleMember EOF ;
    public final EObject entryRuleObstacleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacleMember = null;


        try {
            // InternalTankWar.g:546:55: (iv_ruleObstacleMember= ruleObstacleMember EOF )
            // InternalTankWar.g:547:2: iv_ruleObstacleMember= ruleObstacleMember EOF
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
    // InternalTankWar.g:553:1: ruleObstacleMember returns [EObject current=null] : (this_WallObstacle_0= ruleWallObstacle | this_WaterObstacle_1= ruleWaterObstacle ) ;
    public final EObject ruleObstacleMember() throws RecognitionException {
        EObject current = null;

        EObject this_WallObstacle_0 = null;

        EObject this_WaterObstacle_1 = null;



        	enterRule();

        try {
            // InternalTankWar.g:559:2: ( (this_WallObstacle_0= ruleWallObstacle | this_WaterObstacle_1= ruleWaterObstacle ) )
            // InternalTankWar.g:560:2: (this_WallObstacle_0= ruleWallObstacle | this_WaterObstacle_1= ruleWaterObstacle )
            {
            // InternalTankWar.g:560:2: (this_WallObstacle_0= ruleWallObstacle | this_WaterObstacle_1= ruleWaterObstacle )
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
                    // InternalTankWar.g:561:3: this_WallObstacle_0= ruleWallObstacle
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
                    // InternalTankWar.g:570:3: this_WaterObstacle_1= ruleWaterObstacle
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
    // InternalTankWar.g:582:1: entryRuleWaterObstacle returns [EObject current=null] : iv_ruleWaterObstacle= ruleWaterObstacle EOF ;
    public final EObject entryRuleWaterObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaterObstacle = null;


        try {
            // InternalTankWar.g:582:54: (iv_ruleWaterObstacle= ruleWaterObstacle EOF )
            // InternalTankWar.g:583:2: iv_ruleWaterObstacle= ruleWaterObstacle EOF
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
    // InternalTankWar.g:589:1: ruleWaterObstacle returns [EObject current=null] : (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleWaterObstacle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTankWar.g:595:2: ( (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalTankWar.g:596:2: (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalTankWar.g:596:2: (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalTankWar.g:597:3: otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWaterObstacleAccess().getWaterKeyword_0());
            		
            // InternalTankWar.g:601:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:602:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:602:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:603:5: lv_name_1_0= RULE_ID
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
    // InternalTankWar.g:631:1: entryRuleWallObstacle returns [EObject current=null] : iv_ruleWallObstacle= ruleWallObstacle EOF ;
    public final EObject entryRuleWallObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallObstacle = null;


        try {
            // InternalTankWar.g:631:53: (iv_ruleWallObstacle= ruleWallObstacle EOF )
            // InternalTankWar.g:632:2: iv_ruleWallObstacle= ruleWallObstacle EOF
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
    // InternalTankWar.g:638:1: ruleWallObstacle returns [EObject current=null] : (otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}' ) ;
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
            // InternalTankWar.g:644:2: ( (otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}' ) )
            // InternalTankWar.g:645:2: (otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}' )
            {
            // InternalTankWar.g:645:2: (otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}' )
            // InternalTankWar.g:646:3: otherlv_0= 'wall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'wallWidth' otherlv_4= '=' ( (lv_wallWidth_5_0= RULE_INT ) ) otherlv_6= 'wallHeight' otherlv_7= '=' ( (lv_wallHeight_8_0= RULE_INT ) ) otherlv_9= 'wallPosX' otherlv_10= '=' ( (lv_wallPosX_11_0= RULE_INT ) ) otherlv_12= 'wallPosY' otherlv_13= '=' ( (lv_wallPosY_14_0= RULE_INT ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWallObstacleAccess().getWallKeyword_0());
            		
            // InternalTankWar.g:650:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:651:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:651:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:652:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getWallObstacleAccess().getWallWidthKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_4());
            		
            // InternalTankWar.g:680:3: ( (lv_wallWidth_5_0= RULE_INT ) )
            // InternalTankWar.g:681:4: (lv_wallWidth_5_0= RULE_INT )
            {
            // InternalTankWar.g:681:4: (lv_wallWidth_5_0= RULE_INT )
            // InternalTankWar.g:682:5: lv_wallWidth_5_0= RULE_INT
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

            otherlv_6=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getWallObstacleAccess().getWallHeightKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_7());
            		
            // InternalTankWar.g:706:3: ( (lv_wallHeight_8_0= RULE_INT ) )
            // InternalTankWar.g:707:4: (lv_wallHeight_8_0= RULE_INT )
            {
            // InternalTankWar.g:707:4: (lv_wallHeight_8_0= RULE_INT )
            // InternalTankWar.g:708:5: lv_wallHeight_8_0= RULE_INT
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

            otherlv_9=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getWallObstacleAccess().getWallPosXKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_10());
            		
            // InternalTankWar.g:732:3: ( (lv_wallPosX_11_0= RULE_INT ) )
            // InternalTankWar.g:733:4: (lv_wallPosX_11_0= RULE_INT )
            {
            // InternalTankWar.g:733:4: (lv_wallPosX_11_0= RULE_INT )
            // InternalTankWar.g:734:5: lv_wallPosX_11_0= RULE_INT
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

            otherlv_12=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getWallObstacleAccess().getWallPosYKeyword_12());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_13, grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_13());
            		
            // InternalTankWar.g:758:3: ( (lv_wallPosY_14_0= RULE_INT ) )
            // InternalTankWar.g:759:4: (lv_wallPosY_14_0= RULE_INT )
            {
            // InternalTankWar.g:759:4: (lv_wallPosY_14_0= RULE_INT )
            // InternalTankWar.g:760:5: lv_wallPosY_14_0= RULE_INT
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
    // InternalTankWar.g:784:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // InternalTankWar.g:784:59: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // InternalTankWar.g:785:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
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
    // InternalTankWar.g:791:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= RULE_INT ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) ;
    public final EObject ruleFieldSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_enemyCount_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_obstacle_6_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:797:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= RULE_INT ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) )
            // InternalTankWar.g:798:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= RULE_INT ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            {
            // InternalTankWar.g:798:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= RULE_INT ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            // InternalTankWar.g:799:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'enemyCount' otherlv_4= '=' ( (lv_enemyCount_5_0= RULE_INT ) ) ( (lv_obstacle_6_0= ruleObstaclepecification ) ) otherlv_7= 'nextLevel' otherlv_8= 'goto' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
            		
            // InternalTankWar.g:803:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTankWar.g:804:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTankWar.g:804:4: (lv_name_1_0= RULE_ID )
            // InternalTankWar.g:805:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getEnemyCountKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4());
            		
            // InternalTankWar.g:833:3: ( (lv_enemyCount_5_0= RULE_INT ) )
            // InternalTankWar.g:834:4: (lv_enemyCount_5_0= RULE_INT )
            {
            // InternalTankWar.g:834:4: (lv_enemyCount_5_0= RULE_INT )
            // InternalTankWar.g:835:5: lv_enemyCount_5_0= RULE_INT
            {
            lv_enemyCount_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_enemyCount_5_0, grammarAccess.getFieldSpecificationAccess().getEnemyCountINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"enemyCount",
            						lv_enemyCount_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalTankWar.g:851:3: ( (lv_obstacle_6_0= ruleObstaclepecification ) )
            // InternalTankWar.g:852:4: (lv_obstacle_6_0= ruleObstaclepecification )
            {
            // InternalTankWar.g:852:4: (lv_obstacle_6_0= ruleObstaclepecification )
            // InternalTankWar.g:853:5: lv_obstacle_6_0= ruleObstaclepecification
            {

            					newCompositeNode(grammarAccess.getFieldSpecificationAccess().getObstacleObstaclepecificationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_7=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getFieldSpecificationAccess().getNextLevelKeyword_7());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getFieldSpecificationAccess().getGotoKeyword_8());
            		
            // InternalTankWar.g:878:3: ( (otherlv_9= RULE_ID ) )
            // InternalTankWar.g:879:4: (otherlv_9= RULE_ID )
            {
            // InternalTankWar.g:879:4: (otherlv_9= RULE_ID )
            // InternalTankWar.g:880:5: otherlv_9= RULE_ID
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


    // $ANTLR start "entryRuleLocalFieldInitialisations"
    // InternalTankWar.g:899:1: entryRuleLocalFieldInitialisations returns [EObject current=null] : iv_ruleLocalFieldInitialisations= ruleLocalFieldInitialisations EOF ;
    public final EObject entryRuleLocalFieldInitialisations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalFieldInitialisations = null;


        try {
            // InternalTankWar.g:899:66: (iv_ruleLocalFieldInitialisations= ruleLocalFieldInitialisations EOF )
            // InternalTankWar.g:900:2: iv_ruleLocalFieldInitialisations= ruleLocalFieldInitialisations EOF
            {
             newCompositeNode(grammarAccess.getLocalFieldInitialisationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalFieldInitialisations=ruleLocalFieldInitialisations();

            state._fsp--;

             current =iv_ruleLocalFieldInitialisations; 
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
    // $ANTLR end "entryRuleLocalFieldInitialisations"


    // $ANTLR start "ruleLocalFieldInitialisations"
    // InternalTankWar.g:906:1: ruleLocalFieldInitialisations returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' ) ;
    public final EObject ruleLocalFieldInitialisations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_initialisations_2_0 = null;



        	enterRule();

        try {
            // InternalTankWar.g:912:2: ( (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' ) )
            // InternalTankWar.g:913:2: (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            {
            // InternalTankWar.g:913:2: (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            // InternalTankWar.g:914:3: otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalFieldInitialisationsAccess().getInitKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTankWar.g:922:3: ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36||LA6_0==39||LA6_0==41) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTankWar.g:923:4: ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';'
            	    {
            	    // InternalTankWar.g:923:4: ( (lv_initialisations_2_0= ruleFieldInitialisation ) )
            	    // InternalTankWar.g:924:5: (lv_initialisations_2_0= ruleFieldInitialisation )
            	    {
            	    // InternalTankWar.g:924:5: (lv_initialisations_2_0= ruleFieldInitialisation )
            	    // InternalTankWar.g:925:6: lv_initialisations_2_0= ruleFieldInitialisation
            	    {

            	    						newCompositeNode(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_initialisations_2_0=ruleFieldInitialisation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLocalFieldInitialisationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"initialisations",
            	    							lv_initialisations_2_0,
            	    							"uk.ac.kcl.inf.mdd.cf.tankwar.TankWar.FieldInitialisation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,35,FOLLOW_29); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLocalFieldInitialisationsAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLocalFieldInitialisationsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLocalFieldInitialisations"


    // $ANTLR start "entryRuleFieldInitialisation"
    // InternalTankWar.g:955:1: entryRuleFieldInitialisation returns [String current=null] : iv_ruleFieldInitialisation= ruleFieldInitialisation EOF ;
    public final String entryRuleFieldInitialisation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldInitialisation = null;


        try {
            // InternalTankWar.g:955:59: (iv_ruleFieldInitialisation= ruleFieldInitialisation EOF )
            // InternalTankWar.g:956:2: iv_ruleFieldInitialisation= ruleFieldInitialisation EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldInitialisation=ruleFieldInitialisation();

            state._fsp--;

             current =iv_ruleFieldInitialisation.getText(); 
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
    // $ANTLR end "entryRuleFieldInitialisation"


    // $ANTLR start "ruleFieldInitialisation"
    // InternalTankWar.g:962:1: ruleFieldInitialisation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation ) ;
    public final AntlrDatatypeRuleToken ruleFieldInitialisation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DefaultInitialisation_0 = null;

        AntlrDatatypeRuleToken this_RandomInitialisation_1 = null;

        AntlrDatatypeRuleToken this_ContextInitialisation_2 = null;



        	enterRule();

        try {
            // InternalTankWar.g:968:2: ( (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation ) )
            // InternalTankWar.g:969:2: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation )
            {
            // InternalTankWar.g:969:2: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt7=1;
                }
                break;
            case 39:
                {
                alt7=2;
                }
                break;
            case 41:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTankWar.g:970:3: this_DefaultInitialisation_0= ruleDefaultInitialisation
                    {

                    			newCompositeNode(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefaultInitialisation_0=ruleDefaultInitialisation();

                    state._fsp--;


                    			current.merge(this_DefaultInitialisation_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTankWar.g:981:3: this_RandomInitialisation_1= ruleRandomInitialisation
                    {

                    			newCompositeNode(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RandomInitialisation_1=ruleRandomInitialisation();

                    state._fsp--;


                    			current.merge(this_RandomInitialisation_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTankWar.g:992:3: this_ContextInitialisation_2= ruleContextInitialisation
                    {

                    			newCompositeNode(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextInitialisation_2=ruleContextInitialisation();

                    state._fsp--;


                    			current.merge(this_ContextInitialisation_2);
                    		

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
    // $ANTLR end "ruleFieldInitialisation"


    // $ANTLR start "entryRuleDefaultInitialisation"
    // InternalTankWar.g:1006:1: entryRuleDefaultInitialisation returns [String current=null] : iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF ;
    public final String entryRuleDefaultInitialisation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultInitialisation = null;


        try {
            // InternalTankWar.g:1006:61: (iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF )
            // InternalTankWar.g:1007:2: iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF
            {
             newCompositeNode(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultInitialisation=ruleDefaultInitialisation();

            state._fsp--;

             current =iv_ruleDefaultInitialisation.getText(); 
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
    // $ANTLR end "entryRuleDefaultInitialisation"


    // $ANTLR start "ruleDefaultInitialisation"
    // InternalTankWar.g:1013:1: ruleDefaultInitialisation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'default' kw= ':' kw= 'defaultInitialisation' ) ;
    public final AntlrDatatypeRuleToken ruleDefaultInitialisation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTankWar.g:1019:2: ( (kw= 'default' kw= ':' kw= 'defaultInitialisation' ) )
            // InternalTankWar.g:1020:2: (kw= 'default' kw= ':' kw= 'defaultInitialisation' )
            {
            // InternalTankWar.g:1020:2: (kw= 'default' kw= ':' kw= 'defaultInitialisation' )
            // InternalTankWar.g:1021:3: kw= 'default' kw= ':' kw= 'defaultInitialisation'
            {
            kw=(Token)match(input,36,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0());
            		
            kw=(Token)match(input,37,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1());
            		
            kw=(Token)match(input,38,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefaultInitialisationAccess().getDefaultInitialisationKeyword_2());
            		

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
    // $ANTLR end "ruleDefaultInitialisation"


    // $ANTLR start "entryRuleRandomInitialisation"
    // InternalTankWar.g:1040:1: entryRuleRandomInitialisation returns [String current=null] : iv_ruleRandomInitialisation= ruleRandomInitialisation EOF ;
    public final String entryRuleRandomInitialisation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRandomInitialisation = null;


        try {
            // InternalTankWar.g:1040:60: (iv_ruleRandomInitialisation= ruleRandomInitialisation EOF )
            // InternalTankWar.g:1041:2: iv_ruleRandomInitialisation= ruleRandomInitialisation EOF
            {
             newCompositeNode(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandomInitialisation=ruleRandomInitialisation();

            state._fsp--;

             current =iv_ruleRandomInitialisation.getText(); 
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
    // $ANTLR end "entryRuleRandomInitialisation"


    // $ANTLR start "ruleRandomInitialisation"
    // InternalTankWar.g:1047:1: ruleRandomInitialisation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'random' kw= ':' kw= 'randomInitialisation' ) ;
    public final AntlrDatatypeRuleToken ruleRandomInitialisation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTankWar.g:1053:2: ( (kw= 'random' kw= ':' kw= 'randomInitialisation' ) )
            // InternalTankWar.g:1054:2: (kw= 'random' kw= ':' kw= 'randomInitialisation' )
            {
            // InternalTankWar.g:1054:2: (kw= 'random' kw= ':' kw= 'randomInitialisation' )
            // InternalTankWar.g:1055:3: kw= 'random' kw= ':' kw= 'randomInitialisation'
            {
            kw=(Token)match(input,39,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0());
            		
            kw=(Token)match(input,37,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRandomInitialisationAccess().getColonKeyword_1());
            		
            kw=(Token)match(input,40,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRandomInitialisationAccess().getRandomInitialisationKeyword_2());
            		

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
    // $ANTLR end "ruleRandomInitialisation"


    // $ANTLR start "entryRuleContextInitialisation"
    // InternalTankWar.g:1074:1: entryRuleContextInitialisation returns [String current=null] : iv_ruleContextInitialisation= ruleContextInitialisation EOF ;
    public final String entryRuleContextInitialisation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContextInitialisation = null;


        try {
            // InternalTankWar.g:1074:61: (iv_ruleContextInitialisation= ruleContextInitialisation EOF )
            // InternalTankWar.g:1075:2: iv_ruleContextInitialisation= ruleContextInitialisation EOF
            {
             newCompositeNode(grammarAccess.getContextInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextInitialisation=ruleContextInitialisation();

            state._fsp--;

             current =iv_ruleContextInitialisation.getText(); 
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
    // $ANTLR end "entryRuleContextInitialisation"


    // $ANTLR start "ruleContextInitialisation"
    // InternalTankWar.g:1081:1: ruleContextInitialisation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'context' kw= ':' kw= 'contextInitialisation' ) ;
    public final AntlrDatatypeRuleToken ruleContextInitialisation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTankWar.g:1087:2: ( (kw= 'context' kw= ':' kw= 'contextInitialisation' ) )
            // InternalTankWar.g:1088:2: (kw= 'context' kw= ':' kw= 'contextInitialisation' )
            {
            // InternalTankWar.g:1088:2: (kw= 'context' kw= ':' kw= 'contextInitialisation' )
            // InternalTankWar.g:1089:3: kw= 'context' kw= ':' kw= 'contextInitialisation'
            {
            kw=(Token)match(input,41,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getContextInitialisationAccess().getContextKeyword_0());
            		
            kw=(Token)match(input,37,FOLLOW_33); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getContextInitialisationAccess().getColonKeyword_1());
            		
            kw=(Token)match(input,42,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getContextInitialisationAccess().getContextInitialisationKeyword_2());
            		

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
    // $ANTLR end "ruleContextInitialisation"


    // $ANTLR start "entryRuleOptionSpecification"
    // InternalTankWar.g:1108:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // InternalTankWar.g:1108:60: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // InternalTankWar.g:1109:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
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
    // InternalTankWar.g:1115:1: ruleOptionSpecification returns [EObject current=null] : (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_SuperModeDeclaration_2= ruleSuperModeDeclaration | this_EndGameBehaviour_3= ruleEndGameBehaviour ) ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StartFieldDeclaration_0 = null;

        EObject this_AllowRestartMenu_1 = null;

        EObject this_SuperModeDeclaration_2 = null;

        EObject this_EndGameBehaviour_3 = null;



        	enterRule();

        try {
            // InternalTankWar.g:1121:2: ( (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_SuperModeDeclaration_2= ruleSuperModeDeclaration | this_EndGameBehaviour_3= ruleEndGameBehaviour ) )
            // InternalTankWar.g:1122:2: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_SuperModeDeclaration_2= ruleSuperModeDeclaration | this_EndGameBehaviour_3= ruleEndGameBehaviour )
            {
            // InternalTankWar.g:1122:2: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_SuperModeDeclaration_2= ruleSuperModeDeclaration | this_EndGameBehaviour_3= ruleEndGameBehaviour )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt8=1;
                }
                break;
            case 45:
                {
                alt8=2;
                }
                break;
            case 43:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTankWar.g:1123:3: this_StartFieldDeclaration_0= ruleStartFieldDeclaration
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
                    // InternalTankWar.g:1132:3: this_AllowRestartMenu_1= ruleAllowRestartMenu
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
                    // InternalTankWar.g:1141:3: this_SuperModeDeclaration_2= ruleSuperModeDeclaration
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
                    // InternalTankWar.g:1150:3: this_EndGameBehaviour_3= ruleEndGameBehaviour
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
    // InternalTankWar.g:1162:1: entryRuleSuperModeDeclaration returns [EObject current=null] : iv_ruleSuperModeDeclaration= ruleSuperModeDeclaration EOF ;
    public final EObject entryRuleSuperModeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperModeDeclaration = null;


        try {
            // InternalTankWar.g:1162:61: (iv_ruleSuperModeDeclaration= ruleSuperModeDeclaration EOF )
            // InternalTankWar.g:1163:2: iv_ruleSuperModeDeclaration= ruleSuperModeDeclaration EOF
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
    // InternalTankWar.g:1169:1: ruleSuperModeDeclaration returns [EObject current=null] : (otherlv_0= 'superMode' () ) ;
    public final EObject ruleSuperModeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTankWar.g:1175:2: ( (otherlv_0= 'superMode' () ) )
            // InternalTankWar.g:1176:2: (otherlv_0= 'superMode' () )
            {
            // InternalTankWar.g:1176:2: (otherlv_0= 'superMode' () )
            // InternalTankWar.g:1177:3: otherlv_0= 'superMode' ()
            {
            otherlv_0=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperModeDeclarationAccess().getSuperModeKeyword_0());
            		
            // InternalTankWar.g:1181:3: ()
            // InternalTankWar.g:1182:4: 
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
    // InternalTankWar.g:1192:1: entryRuleStartFieldDeclaration returns [EObject current=null] : iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF ;
    public final EObject entryRuleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartFieldDeclaration = null;


        try {
            // InternalTankWar.g:1192:62: (iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF )
            // InternalTankWar.g:1193:2: iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF
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
    // InternalTankWar.g:1199:1: ruleStartFieldDeclaration returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTankWar.g:1205:2: ( (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTankWar.g:1206:2: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTankWar.g:1206:2: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalTankWar.g:1207:3: otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1());
            		
            // InternalTankWar.g:1215:3: ( (otherlv_2= RULE_ID ) )
            // InternalTankWar.g:1216:4: (otherlv_2= RULE_ID )
            {
            // InternalTankWar.g:1216:4: (otherlv_2= RULE_ID )
            // InternalTankWar.g:1217:5: otherlv_2= RULE_ID
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
    // InternalTankWar.g:1232:1: entryRuleAllowRestartMenu returns [EObject current=null] : iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF ;
    public final EObject entryRuleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowRestartMenu = null;


        try {
            // InternalTankWar.g:1232:57: (iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF )
            // InternalTankWar.g:1233:2: iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF
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
    // InternalTankWar.g:1239:1: ruleAllowRestartMenu returns [EObject current=null] : (otherlv_0= 'allowRestart' () ) ;
    public final EObject ruleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTankWar.g:1245:2: ( (otherlv_0= 'allowRestart' () ) )
            // InternalTankWar.g:1246:2: (otherlv_0= 'allowRestart' () )
            {
            // InternalTankWar.g:1246:2: (otherlv_0= 'allowRestart' () )
            // InternalTankWar.g:1247:3: otherlv_0= 'allowRestart' ()
            {
            otherlv_0=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getAllowRestartMenuAccess().getAllowRestartKeyword_0());
            		
            // InternalTankWar.g:1251:3: ()
            // InternalTankWar.g:1252:4: 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000380040004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000380000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000029000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000029000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});

}