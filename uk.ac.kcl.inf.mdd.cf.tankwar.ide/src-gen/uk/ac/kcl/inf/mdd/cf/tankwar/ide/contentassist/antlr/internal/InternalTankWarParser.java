package uk.ac.kcl.inf.mdd.cf.tankwar.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.mdd.cf.tankwar.services.TankWarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTankWarParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nop'", "'game'", "'{'", "'}'", "'end-game'", "'('", "','", "')'", "'screen'", "'screenWidth'", "'='", "'screenHeight'", "'obstacle'", "'water'", "'wall'", "'wallWidth'", "'wallHeight'", "'wallPosX'", "'wallPosY'", "'field'", "'enemyCount'", "'init'", "';'", "'default'", "':'", "'defaultInitialisation'", "'random'", "'randomInitialisation'", "'context'", "'contextInitialisation'", "'superMode'", "'start'", "'allowRestart'"
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

    	public void setGrammarAccess(TankWarGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTankWarGame"
    // InternalTankWar.g:53:1: entryRuleTankWarGame : ruleTankWarGame EOF ;
    public final void entryRuleTankWarGame() throws RecognitionException {
        try {
            // InternalTankWar.g:54:1: ( ruleTankWarGame EOF )
            // InternalTankWar.g:55:1: ruleTankWarGame EOF
            {
             before(grammarAccess.getTankWarGameRule()); 
            pushFollow(FOLLOW_1);
            ruleTankWarGame();

            state._fsp--;

             after(grammarAccess.getTankWarGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTankWarGame"


    // $ANTLR start "ruleTankWarGame"
    // InternalTankWar.g:62:1: ruleTankWarGame : ( ( rule__TankWarGame__Group__0 ) ) ;
    public final void ruleTankWarGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:66:2: ( ( ( rule__TankWarGame__Group__0 ) ) )
            // InternalTankWar.g:67:2: ( ( rule__TankWarGame__Group__0 ) )
            {
            // InternalTankWar.g:67:2: ( ( rule__TankWarGame__Group__0 ) )
            // InternalTankWar.g:68:3: ( rule__TankWarGame__Group__0 )
            {
             before(grammarAccess.getTankWarGameAccess().getGroup()); 
            // InternalTankWar.g:69:3: ( rule__TankWarGame__Group__0 )
            // InternalTankWar.g:69:4: rule__TankWarGame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTankWarGame"


    // $ANTLR start "entryRuleDirectBehaviour"
    // InternalTankWar.g:78:1: entryRuleDirectBehaviour : ruleDirectBehaviour EOF ;
    public final void entryRuleDirectBehaviour() throws RecognitionException {
        try {
            // InternalTankWar.g:79:1: ( ruleDirectBehaviour EOF )
            // InternalTankWar.g:80:1: ruleDirectBehaviour EOF
            {
             before(grammarAccess.getDirectBehaviourRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectBehaviour();

            state._fsp--;

             after(grammarAccess.getDirectBehaviourRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectBehaviour"


    // $ANTLR start "ruleDirectBehaviour"
    // InternalTankWar.g:87:1: ruleDirectBehaviour : ( ( rule__DirectBehaviour__Alternatives ) ) ;
    public final void ruleDirectBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:91:2: ( ( ( rule__DirectBehaviour__Alternatives ) ) )
            // InternalTankWar.g:92:2: ( ( rule__DirectBehaviour__Alternatives ) )
            {
            // InternalTankWar.g:92:2: ( ( rule__DirectBehaviour__Alternatives ) )
            // InternalTankWar.g:93:3: ( rule__DirectBehaviour__Alternatives )
            {
             before(grammarAccess.getDirectBehaviourAccess().getAlternatives()); 
            // InternalTankWar.g:94:3: ( rule__DirectBehaviour__Alternatives )
            // InternalTankWar.g:94:4: rule__DirectBehaviour__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DirectBehaviour__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectBehaviourAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectBehaviour"


    // $ANTLR start "entryRuleEndGameBehaviour"
    // InternalTankWar.g:103:1: entryRuleEndGameBehaviour : ruleEndGameBehaviour EOF ;
    public final void entryRuleEndGameBehaviour() throws RecognitionException {
        try {
            // InternalTankWar.g:104:1: ( ruleEndGameBehaviour EOF )
            // InternalTankWar.g:105:1: ruleEndGameBehaviour EOF
            {
             before(grammarAccess.getEndGameBehaviourRule()); 
            pushFollow(FOLLOW_1);
            ruleEndGameBehaviour();

            state._fsp--;

             after(grammarAccess.getEndGameBehaviourRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndGameBehaviour"


    // $ANTLR start "ruleEndGameBehaviour"
    // InternalTankWar.g:112:1: ruleEndGameBehaviour : ( ( rule__EndGameBehaviour__Group__0 ) ) ;
    public final void ruleEndGameBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:116:2: ( ( ( rule__EndGameBehaviour__Group__0 ) ) )
            // InternalTankWar.g:117:2: ( ( rule__EndGameBehaviour__Group__0 ) )
            {
            // InternalTankWar.g:117:2: ( ( rule__EndGameBehaviour__Group__0 ) )
            // InternalTankWar.g:118:3: ( rule__EndGameBehaviour__Group__0 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getGroup()); 
            // InternalTankWar.g:119:3: ( rule__EndGameBehaviour__Group__0 )
            // InternalTankWar.g:119:4: rule__EndGameBehaviour__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndGameBehaviourAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndGameBehaviour"


    // $ANTLR start "entryRuleNoOpBehaviour"
    // InternalTankWar.g:128:1: entryRuleNoOpBehaviour : ruleNoOpBehaviour EOF ;
    public final void entryRuleNoOpBehaviour() throws RecognitionException {
        try {
            // InternalTankWar.g:129:1: ( ruleNoOpBehaviour EOF )
            // InternalTankWar.g:130:1: ruleNoOpBehaviour EOF
            {
             before(grammarAccess.getNoOpBehaviourRule()); 
            pushFollow(FOLLOW_1);
            ruleNoOpBehaviour();

            state._fsp--;

             after(grammarAccess.getNoOpBehaviourRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoOpBehaviour"


    // $ANTLR start "ruleNoOpBehaviour"
    // InternalTankWar.g:137:1: ruleNoOpBehaviour : ( 'nop' ) ;
    public final void ruleNoOpBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:141:2: ( ( 'nop' ) )
            // InternalTankWar.g:142:2: ( 'nop' )
            {
            // InternalTankWar.g:142:2: ( 'nop' )
            // InternalTankWar.g:143:3: 'nop'
            {
             before(grammarAccess.getNoOpBehaviourAccess().getNopKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNoOpBehaviourAccess().getNopKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoOpBehaviour"


    // $ANTLR start "entryRuleStringValue"
    // InternalTankWar.g:153:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalTankWar.g:154:1: ( ruleStringValue EOF )
            // InternalTankWar.g:155:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalTankWar.g:162:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:166:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalTankWar.g:167:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalTankWar.g:167:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalTankWar.g:168:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalTankWar.g:169:3: ( rule__StringValue__ValueAssignment )
            // InternalTankWar.g:169:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalTankWar.g:178:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalTankWar.g:179:1: ( ruleIntValue EOF )
            // InternalTankWar.g:180:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalTankWar.g:187:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:191:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalTankWar.g:192:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalTankWar.g:192:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalTankWar.g:193:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalTankWar.g:194:3: ( rule__IntValue__ValueAssignment )
            // InternalTankWar.g:194:4: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleScreenSpecification"
    // InternalTankWar.g:203:1: entryRuleScreenSpecification : ruleScreenSpecification EOF ;
    public final void entryRuleScreenSpecification() throws RecognitionException {
        try {
            // InternalTankWar.g:204:1: ( ruleScreenSpecification EOF )
            // InternalTankWar.g:205:1: ruleScreenSpecification EOF
            {
             before(grammarAccess.getScreenSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleScreenSpecification();

            state._fsp--;

             after(grammarAccess.getScreenSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScreenSpecification"


    // $ANTLR start "ruleScreenSpecification"
    // InternalTankWar.g:212:1: ruleScreenSpecification : ( ( rule__ScreenSpecification__Group__0 ) ) ;
    public final void ruleScreenSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:216:2: ( ( ( rule__ScreenSpecification__Group__0 ) ) )
            // InternalTankWar.g:217:2: ( ( rule__ScreenSpecification__Group__0 ) )
            {
            // InternalTankWar.g:217:2: ( ( rule__ScreenSpecification__Group__0 ) )
            // InternalTankWar.g:218:3: ( rule__ScreenSpecification__Group__0 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getGroup()); 
            // InternalTankWar.g:219:3: ( rule__ScreenSpecification__Group__0 )
            // InternalTankWar.g:219:4: rule__ScreenSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScreenSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScreenSpecification"


    // $ANTLR start "entryRuleObstaclepecification"
    // InternalTankWar.g:228:1: entryRuleObstaclepecification : ruleObstaclepecification EOF ;
    public final void entryRuleObstaclepecification() throws RecognitionException {
        try {
            // InternalTankWar.g:229:1: ( ruleObstaclepecification EOF )
            // InternalTankWar.g:230:1: ruleObstaclepecification EOF
            {
             before(grammarAccess.getObstaclepecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleObstaclepecification();

            state._fsp--;

             after(grammarAccess.getObstaclepecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObstaclepecification"


    // $ANTLR start "ruleObstaclepecification"
    // InternalTankWar.g:237:1: ruleObstaclepecification : ( ( rule__Obstaclepecification__Group__0 ) ) ;
    public final void ruleObstaclepecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:241:2: ( ( ( rule__Obstaclepecification__Group__0 ) ) )
            // InternalTankWar.g:242:2: ( ( rule__Obstaclepecification__Group__0 ) )
            {
            // InternalTankWar.g:242:2: ( ( rule__Obstaclepecification__Group__0 ) )
            // InternalTankWar.g:243:3: ( rule__Obstaclepecification__Group__0 )
            {
             before(grammarAccess.getObstaclepecificationAccess().getGroup()); 
            // InternalTankWar.g:244:3: ( rule__Obstaclepecification__Group__0 )
            // InternalTankWar.g:244:4: rule__Obstaclepecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Obstaclepecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObstaclepecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObstaclepecification"


    // $ANTLR start "entryRuleObstacleMember"
    // InternalTankWar.g:253:1: entryRuleObstacleMember : ruleObstacleMember EOF ;
    public final void entryRuleObstacleMember() throws RecognitionException {
        try {
            // InternalTankWar.g:254:1: ( ruleObstacleMember EOF )
            // InternalTankWar.g:255:1: ruleObstacleMember EOF
            {
             before(grammarAccess.getObstacleMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleObstacleMember();

            state._fsp--;

             after(grammarAccess.getObstacleMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObstacleMember"


    // $ANTLR start "ruleObstacleMember"
    // InternalTankWar.g:262:1: ruleObstacleMember : ( ( rule__ObstacleMember__Alternatives ) ) ;
    public final void ruleObstacleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:266:2: ( ( ( rule__ObstacleMember__Alternatives ) ) )
            // InternalTankWar.g:267:2: ( ( rule__ObstacleMember__Alternatives ) )
            {
            // InternalTankWar.g:267:2: ( ( rule__ObstacleMember__Alternatives ) )
            // InternalTankWar.g:268:3: ( rule__ObstacleMember__Alternatives )
            {
             before(grammarAccess.getObstacleMemberAccess().getAlternatives()); 
            // InternalTankWar.g:269:3: ( rule__ObstacleMember__Alternatives )
            // InternalTankWar.g:269:4: rule__ObstacleMember__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObstacleMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObstacleMember"


    // $ANTLR start "entryRuleWaterObstacle"
    // InternalTankWar.g:278:1: entryRuleWaterObstacle : ruleWaterObstacle EOF ;
    public final void entryRuleWaterObstacle() throws RecognitionException {
        try {
            // InternalTankWar.g:279:1: ( ruleWaterObstacle EOF )
            // InternalTankWar.g:280:1: ruleWaterObstacle EOF
            {
             before(grammarAccess.getWaterObstacleRule()); 
            pushFollow(FOLLOW_1);
            ruleWaterObstacle();

            state._fsp--;

             after(grammarAccess.getWaterObstacleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWaterObstacle"


    // $ANTLR start "ruleWaterObstacle"
    // InternalTankWar.g:287:1: ruleWaterObstacle : ( ( rule__WaterObstacle__Group__0 ) ) ;
    public final void ruleWaterObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:291:2: ( ( ( rule__WaterObstacle__Group__0 ) ) )
            // InternalTankWar.g:292:2: ( ( rule__WaterObstacle__Group__0 ) )
            {
            // InternalTankWar.g:292:2: ( ( rule__WaterObstacle__Group__0 ) )
            // InternalTankWar.g:293:3: ( rule__WaterObstacle__Group__0 )
            {
             before(grammarAccess.getWaterObstacleAccess().getGroup()); 
            // InternalTankWar.g:294:3: ( rule__WaterObstacle__Group__0 )
            // InternalTankWar.g:294:4: rule__WaterObstacle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WaterObstacle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaterObstacleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWaterObstacle"


    // $ANTLR start "entryRuleWallObstacle"
    // InternalTankWar.g:303:1: entryRuleWallObstacle : ruleWallObstacle EOF ;
    public final void entryRuleWallObstacle() throws RecognitionException {
        try {
            // InternalTankWar.g:304:1: ( ruleWallObstacle EOF )
            // InternalTankWar.g:305:1: ruleWallObstacle EOF
            {
             before(grammarAccess.getWallObstacleRule()); 
            pushFollow(FOLLOW_1);
            ruleWallObstacle();

            state._fsp--;

             after(grammarAccess.getWallObstacleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWallObstacle"


    // $ANTLR start "ruleWallObstacle"
    // InternalTankWar.g:312:1: ruleWallObstacle : ( ( rule__WallObstacle__Group__0 ) ) ;
    public final void ruleWallObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:316:2: ( ( ( rule__WallObstacle__Group__0 ) ) )
            // InternalTankWar.g:317:2: ( ( rule__WallObstacle__Group__0 ) )
            {
            // InternalTankWar.g:317:2: ( ( rule__WallObstacle__Group__0 ) )
            // InternalTankWar.g:318:3: ( rule__WallObstacle__Group__0 )
            {
             before(grammarAccess.getWallObstacleAccess().getGroup()); 
            // InternalTankWar.g:319:3: ( rule__WallObstacle__Group__0 )
            // InternalTankWar.g:319:4: rule__WallObstacle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWallObstacleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWallObstacle"


    // $ANTLR start "entryRuleFieldSpecification"
    // InternalTankWar.g:328:1: entryRuleFieldSpecification : ruleFieldSpecification EOF ;
    public final void entryRuleFieldSpecification() throws RecognitionException {
        try {
            // InternalTankWar.g:329:1: ( ruleFieldSpecification EOF )
            // InternalTankWar.g:330:1: ruleFieldSpecification EOF
            {
             before(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getFieldSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldSpecification"


    // $ANTLR start "ruleFieldSpecification"
    // InternalTankWar.g:337:1: ruleFieldSpecification : ( ( rule__FieldSpecification__Group__0 ) ) ;
    public final void ruleFieldSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:341:2: ( ( ( rule__FieldSpecification__Group__0 ) ) )
            // InternalTankWar.g:342:2: ( ( rule__FieldSpecification__Group__0 ) )
            {
            // InternalTankWar.g:342:2: ( ( rule__FieldSpecification__Group__0 ) )
            // InternalTankWar.g:343:3: ( rule__FieldSpecification__Group__0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getGroup()); 
            // InternalTankWar.g:344:3: ( rule__FieldSpecification__Group__0 )
            // InternalTankWar.g:344:4: rule__FieldSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldSpecification"


    // $ANTLR start "entryRuleLocalFieldInitialisations"
    // InternalTankWar.g:353:1: entryRuleLocalFieldInitialisations : ruleLocalFieldInitialisations EOF ;
    public final void entryRuleLocalFieldInitialisations() throws RecognitionException {
        try {
            // InternalTankWar.g:354:1: ( ruleLocalFieldInitialisations EOF )
            // InternalTankWar.g:355:1: ruleLocalFieldInitialisations EOF
            {
             before(grammarAccess.getLocalFieldInitialisationsRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalFieldInitialisations();

            state._fsp--;

             after(grammarAccess.getLocalFieldInitialisationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalFieldInitialisations"


    // $ANTLR start "ruleLocalFieldInitialisations"
    // InternalTankWar.g:362:1: ruleLocalFieldInitialisations : ( ( rule__LocalFieldInitialisations__Group__0 ) ) ;
    public final void ruleLocalFieldInitialisations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:366:2: ( ( ( rule__LocalFieldInitialisations__Group__0 ) ) )
            // InternalTankWar.g:367:2: ( ( rule__LocalFieldInitialisations__Group__0 ) )
            {
            // InternalTankWar.g:367:2: ( ( rule__LocalFieldInitialisations__Group__0 ) )
            // InternalTankWar.g:368:3: ( rule__LocalFieldInitialisations__Group__0 )
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getGroup()); 
            // InternalTankWar.g:369:3: ( rule__LocalFieldInitialisations__Group__0 )
            // InternalTankWar.g:369:4: rule__LocalFieldInitialisations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalFieldInitialisationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalFieldInitialisations"


    // $ANTLR start "entryRuleFieldInitialisation"
    // InternalTankWar.g:378:1: entryRuleFieldInitialisation : ruleFieldInitialisation EOF ;
    public final void entryRuleFieldInitialisation() throws RecognitionException {
        try {
            // InternalTankWar.g:379:1: ( ruleFieldInitialisation EOF )
            // InternalTankWar.g:380:1: ruleFieldInitialisation EOF
            {
             before(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldInitialisation"


    // $ANTLR start "ruleFieldInitialisation"
    // InternalTankWar.g:387:1: ruleFieldInitialisation : ( ( rule__FieldInitialisation__Alternatives ) ) ;
    public final void ruleFieldInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:391:2: ( ( ( rule__FieldInitialisation__Alternatives ) ) )
            // InternalTankWar.g:392:2: ( ( rule__FieldInitialisation__Alternatives ) )
            {
            // InternalTankWar.g:392:2: ( ( rule__FieldInitialisation__Alternatives ) )
            // InternalTankWar.g:393:3: ( rule__FieldInitialisation__Alternatives )
            {
             before(grammarAccess.getFieldInitialisationAccess().getAlternatives()); 
            // InternalTankWar.g:394:3: ( rule__FieldInitialisation__Alternatives )
            // InternalTankWar.g:394:4: rule__FieldInitialisation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldInitialisation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldInitialisation"


    // $ANTLR start "entryRuleDefaultInitialisation"
    // InternalTankWar.g:403:1: entryRuleDefaultInitialisation : ruleDefaultInitialisation EOF ;
    public final void entryRuleDefaultInitialisation() throws RecognitionException {
        try {
            // InternalTankWar.g:404:1: ( ruleDefaultInitialisation EOF )
            // InternalTankWar.g:405:1: ruleDefaultInitialisation EOF
            {
             before(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultInitialisation();

            state._fsp--;

             after(grammarAccess.getDefaultInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultInitialisation"


    // $ANTLR start "ruleDefaultInitialisation"
    // InternalTankWar.g:412:1: ruleDefaultInitialisation : ( ( rule__DefaultInitialisation__Group__0 ) ) ;
    public final void ruleDefaultInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:416:2: ( ( ( rule__DefaultInitialisation__Group__0 ) ) )
            // InternalTankWar.g:417:2: ( ( rule__DefaultInitialisation__Group__0 ) )
            {
            // InternalTankWar.g:417:2: ( ( rule__DefaultInitialisation__Group__0 ) )
            // InternalTankWar.g:418:3: ( rule__DefaultInitialisation__Group__0 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getGroup()); 
            // InternalTankWar.g:419:3: ( rule__DefaultInitialisation__Group__0 )
            // InternalTankWar.g:419:4: rule__DefaultInitialisation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInitialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultInitialisation"


    // $ANTLR start "entryRuleRandomInitialisation"
    // InternalTankWar.g:428:1: entryRuleRandomInitialisation : ruleRandomInitialisation EOF ;
    public final void entryRuleRandomInitialisation() throws RecognitionException {
        try {
            // InternalTankWar.g:429:1: ( ruleRandomInitialisation EOF )
            // InternalTankWar.g:430:1: ruleRandomInitialisation EOF
            {
             before(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleRandomInitialisation();

            state._fsp--;

             after(grammarAccess.getRandomInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRandomInitialisation"


    // $ANTLR start "ruleRandomInitialisation"
    // InternalTankWar.g:437:1: ruleRandomInitialisation : ( ( rule__RandomInitialisation__Group__0 ) ) ;
    public final void ruleRandomInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:441:2: ( ( ( rule__RandomInitialisation__Group__0 ) ) )
            // InternalTankWar.g:442:2: ( ( rule__RandomInitialisation__Group__0 ) )
            {
            // InternalTankWar.g:442:2: ( ( rule__RandomInitialisation__Group__0 ) )
            // InternalTankWar.g:443:3: ( rule__RandomInitialisation__Group__0 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getGroup()); 
            // InternalTankWar.g:444:3: ( rule__RandomInitialisation__Group__0 )
            // InternalTankWar.g:444:4: rule__RandomInitialisation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RandomInitialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRandomInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRandomInitialisation"


    // $ANTLR start "entryRuleContextInitialisation"
    // InternalTankWar.g:453:1: entryRuleContextInitialisation : ruleContextInitialisation EOF ;
    public final void entryRuleContextInitialisation() throws RecognitionException {
        try {
            // InternalTankWar.g:454:1: ( ruleContextInitialisation EOF )
            // InternalTankWar.g:455:1: ruleContextInitialisation EOF
            {
             before(grammarAccess.getContextInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleContextInitialisation();

            state._fsp--;

             after(grammarAccess.getContextInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextInitialisation"


    // $ANTLR start "ruleContextInitialisation"
    // InternalTankWar.g:462:1: ruleContextInitialisation : ( ( rule__ContextInitialisation__Group__0 ) ) ;
    public final void ruleContextInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:466:2: ( ( ( rule__ContextInitialisation__Group__0 ) ) )
            // InternalTankWar.g:467:2: ( ( rule__ContextInitialisation__Group__0 ) )
            {
            // InternalTankWar.g:467:2: ( ( rule__ContextInitialisation__Group__0 ) )
            // InternalTankWar.g:468:3: ( rule__ContextInitialisation__Group__0 )
            {
             before(grammarAccess.getContextInitialisationAccess().getGroup()); 
            // InternalTankWar.g:469:3: ( rule__ContextInitialisation__Group__0 )
            // InternalTankWar.g:469:4: rule__ContextInitialisation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextInitialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextInitialisation"


    // $ANTLR start "entryRuleOptionSpecification"
    // InternalTankWar.g:478:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // InternalTankWar.g:479:1: ( ruleOptionSpecification EOF )
            // InternalTankWar.g:480:1: ruleOptionSpecification EOF
            {
             before(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getOptionSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionSpecification"


    // $ANTLR start "ruleOptionSpecification"
    // InternalTankWar.g:487:1: ruleOptionSpecification : ( ( rule__OptionSpecification__Alternatives ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:491:2: ( ( ( rule__OptionSpecification__Alternatives ) ) )
            // InternalTankWar.g:492:2: ( ( rule__OptionSpecification__Alternatives ) )
            {
            // InternalTankWar.g:492:2: ( ( rule__OptionSpecification__Alternatives ) )
            // InternalTankWar.g:493:3: ( rule__OptionSpecification__Alternatives )
            {
             before(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 
            // InternalTankWar.g:494:3: ( rule__OptionSpecification__Alternatives )
            // InternalTankWar.g:494:4: rule__OptionSpecification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OptionSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionSpecification"


    // $ANTLR start "entryRuleSuperModeDeclaration"
    // InternalTankWar.g:503:1: entryRuleSuperModeDeclaration : ruleSuperModeDeclaration EOF ;
    public final void entryRuleSuperModeDeclaration() throws RecognitionException {
        try {
            // InternalTankWar.g:504:1: ( ruleSuperModeDeclaration EOF )
            // InternalTankWar.g:505:1: ruleSuperModeDeclaration EOF
            {
             before(grammarAccess.getSuperModeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSuperModeDeclaration();

            state._fsp--;

             after(grammarAccess.getSuperModeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuperModeDeclaration"


    // $ANTLR start "ruleSuperModeDeclaration"
    // InternalTankWar.g:512:1: ruleSuperModeDeclaration : ( ( rule__SuperModeDeclaration__Group__0 ) ) ;
    public final void ruleSuperModeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:516:2: ( ( ( rule__SuperModeDeclaration__Group__0 ) ) )
            // InternalTankWar.g:517:2: ( ( rule__SuperModeDeclaration__Group__0 ) )
            {
            // InternalTankWar.g:517:2: ( ( rule__SuperModeDeclaration__Group__0 ) )
            // InternalTankWar.g:518:3: ( rule__SuperModeDeclaration__Group__0 )
            {
             before(grammarAccess.getSuperModeDeclarationAccess().getGroup()); 
            // InternalTankWar.g:519:3: ( rule__SuperModeDeclaration__Group__0 )
            // InternalTankWar.g:519:4: rule__SuperModeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SuperModeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuperModeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperModeDeclaration"


    // $ANTLR start "entryRuleStartFieldDeclaration"
    // InternalTankWar.g:528:1: entryRuleStartFieldDeclaration : ruleStartFieldDeclaration EOF ;
    public final void entryRuleStartFieldDeclaration() throws RecognitionException {
        try {
            // InternalTankWar.g:529:1: ( ruleStartFieldDeclaration EOF )
            // InternalTankWar.g:530:1: ruleStartFieldDeclaration EOF
            {
             before(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleStartFieldDeclaration();

            state._fsp--;

             after(grammarAccess.getStartFieldDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartFieldDeclaration"


    // $ANTLR start "ruleStartFieldDeclaration"
    // InternalTankWar.g:537:1: ruleStartFieldDeclaration : ( ( rule__StartFieldDeclaration__Group__0 ) ) ;
    public final void ruleStartFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:541:2: ( ( ( rule__StartFieldDeclaration__Group__0 ) ) )
            // InternalTankWar.g:542:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            {
            // InternalTankWar.g:542:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            // InternalTankWar.g:543:3: ( rule__StartFieldDeclaration__Group__0 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 
            // InternalTankWar.g:544:3: ( rule__StartFieldDeclaration__Group__0 )
            // InternalTankWar.g:544:4: rule__StartFieldDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartFieldDeclaration"


    // $ANTLR start "entryRuleAllowRestartMenu"
    // InternalTankWar.g:553:1: entryRuleAllowRestartMenu : ruleAllowRestartMenu EOF ;
    public final void entryRuleAllowRestartMenu() throws RecognitionException {
        try {
            // InternalTankWar.g:554:1: ( ruleAllowRestartMenu EOF )
            // InternalTankWar.g:555:1: ruleAllowRestartMenu EOF
            {
             before(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_1);
            ruleAllowRestartMenu();

            state._fsp--;

             after(grammarAccess.getAllowRestartMenuRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllowRestartMenu"


    // $ANTLR start "ruleAllowRestartMenu"
    // InternalTankWar.g:562:1: ruleAllowRestartMenu : ( ( rule__AllowRestartMenu__Group__0 ) ) ;
    public final void ruleAllowRestartMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:566:2: ( ( ( rule__AllowRestartMenu__Group__0 ) ) )
            // InternalTankWar.g:567:2: ( ( rule__AllowRestartMenu__Group__0 ) )
            {
            // InternalTankWar.g:567:2: ( ( rule__AllowRestartMenu__Group__0 ) )
            // InternalTankWar.g:568:3: ( rule__AllowRestartMenu__Group__0 )
            {
             before(grammarAccess.getAllowRestartMenuAccess().getGroup()); 
            // InternalTankWar.g:569:3: ( rule__AllowRestartMenu__Group__0 )
            // InternalTankWar.g:569:4: rule__AllowRestartMenu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllowRestartMenu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllowRestartMenuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllowRestartMenu"


    // $ANTLR start "rule__DirectBehaviour__Alternatives"
    // InternalTankWar.g:577:1: rule__DirectBehaviour__Alternatives : ( ( ruleEndGameBehaviour ) | ( ( rule__DirectBehaviour__Group_1__0 ) ) );
    public final void rule__DirectBehaviour__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:581:1: ( ( ruleEndGameBehaviour ) | ( ( rule__DirectBehaviour__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTankWar.g:582:2: ( ruleEndGameBehaviour )
                    {
                    // InternalTankWar.g:582:2: ( ruleEndGameBehaviour )
                    // InternalTankWar.g:583:3: ruleEndGameBehaviour
                    {
                     before(grammarAccess.getDirectBehaviourAccess().getEndGameBehaviourParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEndGameBehaviour();

                    state._fsp--;

                     after(grammarAccess.getDirectBehaviourAccess().getEndGameBehaviourParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTankWar.g:588:2: ( ( rule__DirectBehaviour__Group_1__0 ) )
                    {
                    // InternalTankWar.g:588:2: ( ( rule__DirectBehaviour__Group_1__0 ) )
                    // InternalTankWar.g:589:3: ( rule__DirectBehaviour__Group_1__0 )
                    {
                     before(grammarAccess.getDirectBehaviourAccess().getGroup_1()); 
                    // InternalTankWar.g:590:3: ( rule__DirectBehaviour__Group_1__0 )
                    // InternalTankWar.g:590:4: rule__DirectBehaviour__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectBehaviour__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectBehaviourAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectBehaviour__Alternatives"


    // $ANTLR start "rule__ObstacleMember__Alternatives"
    // InternalTankWar.g:598:1: rule__ObstacleMember__Alternatives : ( ( ruleWallObstacle ) | ( ruleWaterObstacle ) );
    public final void rule__ObstacleMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:602:1: ( ( ruleWallObstacle ) | ( ruleWaterObstacle ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTankWar.g:603:2: ( ruleWallObstacle )
                    {
                    // InternalTankWar.g:603:2: ( ruleWallObstacle )
                    // InternalTankWar.g:604:3: ruleWallObstacle
                    {
                     before(grammarAccess.getObstacleMemberAccess().getWallObstacleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWallObstacle();

                    state._fsp--;

                     after(grammarAccess.getObstacleMemberAccess().getWallObstacleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTankWar.g:609:2: ( ruleWaterObstacle )
                    {
                    // InternalTankWar.g:609:2: ( ruleWaterObstacle )
                    // InternalTankWar.g:610:3: ruleWaterObstacle
                    {
                     before(grammarAccess.getObstacleMemberAccess().getWaterObstacleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWaterObstacle();

                    state._fsp--;

                     after(grammarAccess.getObstacleMemberAccess().getWaterObstacleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleMember__Alternatives"


    // $ANTLR start "rule__FieldInitialisation__Alternatives"
    // InternalTankWar.g:619:1: rule__FieldInitialisation__Alternatives : ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) );
    public final void rule__FieldInitialisation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:623:1: ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTankWar.g:624:2: ( ruleDefaultInitialisation )
                    {
                    // InternalTankWar.g:624:2: ( ruleDefaultInitialisation )
                    // InternalTankWar.g:625:3: ruleDefaultInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTankWar.g:630:2: ( ruleRandomInitialisation )
                    {
                    // InternalTankWar.g:630:2: ( ruleRandomInitialisation )
                    // InternalTankWar.g:631:3: ruleRandomInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRandomInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTankWar.g:636:2: ( ruleContextInitialisation )
                    {
                    // InternalTankWar.g:636:2: ( ruleContextInitialisation )
                    // InternalTankWar.g:637:3: ruleContextInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleContextInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisation__Alternatives"


    // $ANTLR start "rule__OptionSpecification__Alternatives"
    // InternalTankWar.g:646:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) | ( ruleSuperModeDeclaration ) | ( ruleEndGameBehaviour ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:650:1: ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) | ( ruleSuperModeDeclaration ) | ( ruleEndGameBehaviour ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 41:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTankWar.g:651:2: ( ruleStartFieldDeclaration )
                    {
                    // InternalTankWar.g:651:2: ( ruleStartFieldDeclaration )
                    // InternalTankWar.g:652:3: ruleStartFieldDeclaration
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStartFieldDeclaration();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTankWar.g:657:2: ( ruleAllowRestartMenu )
                    {
                    // InternalTankWar.g:657:2: ( ruleAllowRestartMenu )
                    // InternalTankWar.g:658:3: ruleAllowRestartMenu
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAllowRestartMenu();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTankWar.g:663:2: ( ruleSuperModeDeclaration )
                    {
                    // InternalTankWar.g:663:2: ( ruleSuperModeDeclaration )
                    // InternalTankWar.g:664:3: ruleSuperModeDeclaration
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getSuperModeDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSuperModeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getSuperModeDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTankWar.g:669:2: ( ruleEndGameBehaviour )
                    {
                    // InternalTankWar.g:669:2: ( ruleEndGameBehaviour )
                    // InternalTankWar.g:670:3: ruleEndGameBehaviour
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getEndGameBehaviourParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEndGameBehaviour();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getEndGameBehaviourParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionSpecification__Alternatives"


    // $ANTLR start "rule__TankWarGame__Group__0"
    // InternalTankWar.g:679:1: rule__TankWarGame__Group__0 : rule__TankWarGame__Group__0__Impl rule__TankWarGame__Group__1 ;
    public final void rule__TankWarGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:683:1: ( rule__TankWarGame__Group__0__Impl rule__TankWarGame__Group__1 )
            // InternalTankWar.g:684:2: rule__TankWarGame__Group__0__Impl rule__TankWarGame__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TankWarGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__0"


    // $ANTLR start "rule__TankWarGame__Group__0__Impl"
    // InternalTankWar.g:691:1: rule__TankWarGame__Group__0__Impl : ( 'game' ) ;
    public final void rule__TankWarGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:695:1: ( ( 'game' ) )
            // InternalTankWar.g:696:1: ( 'game' )
            {
            // InternalTankWar.g:696:1: ( 'game' )
            // InternalTankWar.g:697:2: 'game'
            {
             before(grammarAccess.getTankWarGameAccess().getGameKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTankWarGameAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__0__Impl"


    // $ANTLR start "rule__TankWarGame__Group__1"
    // InternalTankWar.g:706:1: rule__TankWarGame__Group__1 : rule__TankWarGame__Group__1__Impl rule__TankWarGame__Group__2 ;
    public final void rule__TankWarGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:710:1: ( rule__TankWarGame__Group__1__Impl rule__TankWarGame__Group__2 )
            // InternalTankWar.g:711:2: rule__TankWarGame__Group__1__Impl rule__TankWarGame__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TankWarGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__1"


    // $ANTLR start "rule__TankWarGame__Group__1__Impl"
    // InternalTankWar.g:718:1: rule__TankWarGame__Group__1__Impl : ( ( rule__TankWarGame__NameAssignment_1 ) ) ;
    public final void rule__TankWarGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:722:1: ( ( ( rule__TankWarGame__NameAssignment_1 ) ) )
            // InternalTankWar.g:723:1: ( ( rule__TankWarGame__NameAssignment_1 ) )
            {
            // InternalTankWar.g:723:1: ( ( rule__TankWarGame__NameAssignment_1 ) )
            // InternalTankWar.g:724:2: ( rule__TankWarGame__NameAssignment_1 )
            {
             before(grammarAccess.getTankWarGameAccess().getNameAssignment_1()); 
            // InternalTankWar.g:725:2: ( rule__TankWarGame__NameAssignment_1 )
            // InternalTankWar.g:725:3: rule__TankWarGame__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TankWarGame__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__1__Impl"


    // $ANTLR start "rule__TankWarGame__Group__2"
    // InternalTankWar.g:733:1: rule__TankWarGame__Group__2 : rule__TankWarGame__Group__2__Impl rule__TankWarGame__Group__3 ;
    public final void rule__TankWarGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:737:1: ( rule__TankWarGame__Group__2__Impl rule__TankWarGame__Group__3 )
            // InternalTankWar.g:738:2: rule__TankWarGame__Group__2__Impl rule__TankWarGame__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TankWarGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__2"


    // $ANTLR start "rule__TankWarGame__Group__2__Impl"
    // InternalTankWar.g:745:1: rule__TankWarGame__Group__2__Impl : ( '{' ) ;
    public final void rule__TankWarGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:749:1: ( ( '{' ) )
            // InternalTankWar.g:750:1: ( '{' )
            {
            // InternalTankWar.g:750:1: ( '{' )
            // InternalTankWar.g:751:2: '{'
            {
             before(grammarAccess.getTankWarGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTankWarGameAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__2__Impl"


    // $ANTLR start "rule__TankWarGame__Group__3"
    // InternalTankWar.g:760:1: rule__TankWarGame__Group__3 : rule__TankWarGame__Group__3__Impl rule__TankWarGame__Group__4 ;
    public final void rule__TankWarGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:764:1: ( rule__TankWarGame__Group__3__Impl rule__TankWarGame__Group__4 )
            // InternalTankWar.g:765:2: rule__TankWarGame__Group__3__Impl rule__TankWarGame__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TankWarGame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__3"


    // $ANTLR start "rule__TankWarGame__Group__3__Impl"
    // InternalTankWar.g:772:1: rule__TankWarGame__Group__3__Impl : ( ( rule__TankWarGame__ScreenAssignment_3 ) ) ;
    public final void rule__TankWarGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:776:1: ( ( ( rule__TankWarGame__ScreenAssignment_3 ) ) )
            // InternalTankWar.g:777:1: ( ( rule__TankWarGame__ScreenAssignment_3 ) )
            {
            // InternalTankWar.g:777:1: ( ( rule__TankWarGame__ScreenAssignment_3 ) )
            // InternalTankWar.g:778:2: ( rule__TankWarGame__ScreenAssignment_3 )
            {
             before(grammarAccess.getTankWarGameAccess().getScreenAssignment_3()); 
            // InternalTankWar.g:779:2: ( rule__TankWarGame__ScreenAssignment_3 )
            // InternalTankWar.g:779:3: rule__TankWarGame__ScreenAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TankWarGame__ScreenAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getScreenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__3__Impl"


    // $ANTLR start "rule__TankWarGame__Group__4"
    // InternalTankWar.g:787:1: rule__TankWarGame__Group__4 : rule__TankWarGame__Group__4__Impl rule__TankWarGame__Group__5 ;
    public final void rule__TankWarGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:791:1: ( rule__TankWarGame__Group__4__Impl rule__TankWarGame__Group__5 )
            // InternalTankWar.g:792:2: rule__TankWarGame__Group__4__Impl rule__TankWarGame__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__TankWarGame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__4"


    // $ANTLR start "rule__TankWarGame__Group__4__Impl"
    // InternalTankWar.g:799:1: rule__TankWarGame__Group__4__Impl : ( ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* ) ) ;
    public final void rule__TankWarGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:803:1: ( ( ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* ) ) )
            // InternalTankWar.g:804:1: ( ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* ) )
            {
            // InternalTankWar.g:804:1: ( ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* ) )
            // InternalTankWar.g:805:2: ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* )
            {
            // InternalTankWar.g:805:2: ( ( rule__TankWarGame__FieldsAssignment_4 ) )
            // InternalTankWar.g:806:3: ( rule__TankWarGame__FieldsAssignment_4 )
            {
             before(grammarAccess.getTankWarGameAccess().getFieldsAssignment_4()); 
            // InternalTankWar.g:807:3: ( rule__TankWarGame__FieldsAssignment_4 )
            // InternalTankWar.g:807:4: rule__TankWarGame__FieldsAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__TankWarGame__FieldsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getFieldsAssignment_4()); 

            }

            // InternalTankWar.g:810:2: ( ( rule__TankWarGame__FieldsAssignment_4 )* )
            // InternalTankWar.g:811:3: ( rule__TankWarGame__FieldsAssignment_4 )*
            {
             before(grammarAccess.getTankWarGameAccess().getFieldsAssignment_4()); 
            // InternalTankWar.g:812:3: ( rule__TankWarGame__FieldsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTankWar.g:812:4: rule__TankWarGame__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TankWarGame__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTankWarGameAccess().getFieldsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__4__Impl"


    // $ANTLR start "rule__TankWarGame__Group__5"
    // InternalTankWar.g:821:1: rule__TankWarGame__Group__5 : rule__TankWarGame__Group__5__Impl rule__TankWarGame__Group__6 ;
    public final void rule__TankWarGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:825:1: ( rule__TankWarGame__Group__5__Impl rule__TankWarGame__Group__6 )
            // InternalTankWar.g:826:2: rule__TankWarGame__Group__5__Impl rule__TankWarGame__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__TankWarGame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__5"


    // $ANTLR start "rule__TankWarGame__Group__5__Impl"
    // InternalTankWar.g:833:1: rule__TankWarGame__Group__5__Impl : ( ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* ) ) ;
    public final void rule__TankWarGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:837:1: ( ( ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* ) ) )
            // InternalTankWar.g:838:1: ( ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* ) )
            {
            // InternalTankWar.g:838:1: ( ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* ) )
            // InternalTankWar.g:839:2: ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* )
            {
            // InternalTankWar.g:839:2: ( ( rule__TankWarGame__OptionsAssignment_5 ) )
            // InternalTankWar.g:840:3: ( rule__TankWarGame__OptionsAssignment_5 )
            {
             before(grammarAccess.getTankWarGameAccess().getOptionsAssignment_5()); 
            // InternalTankWar.g:841:3: ( rule__TankWarGame__OptionsAssignment_5 )
            // InternalTankWar.g:841:4: rule__TankWarGame__OptionsAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__TankWarGame__OptionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getOptionsAssignment_5()); 

            }

            // InternalTankWar.g:844:2: ( ( rule__TankWarGame__OptionsAssignment_5 )* )
            // InternalTankWar.g:845:3: ( rule__TankWarGame__OptionsAssignment_5 )*
            {
             before(grammarAccess.getTankWarGameAccess().getOptionsAssignment_5()); 
            // InternalTankWar.g:846:3: ( rule__TankWarGame__OptionsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15||(LA6_0>=41 && LA6_0<=43)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTankWar.g:846:4: rule__TankWarGame__OptionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TankWarGame__OptionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTankWarGameAccess().getOptionsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__5__Impl"


    // $ANTLR start "rule__TankWarGame__Group__6"
    // InternalTankWar.g:855:1: rule__TankWarGame__Group__6 : rule__TankWarGame__Group__6__Impl ;
    public final void rule__TankWarGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:859:1: ( rule__TankWarGame__Group__6__Impl )
            // InternalTankWar.g:860:2: rule__TankWarGame__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__6"


    // $ANTLR start "rule__TankWarGame__Group__6__Impl"
    // InternalTankWar.g:866:1: rule__TankWarGame__Group__6__Impl : ( '}' ) ;
    public final void rule__TankWarGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:870:1: ( ( '}' ) )
            // InternalTankWar.g:871:1: ( '}' )
            {
            // InternalTankWar.g:871:1: ( '}' )
            // InternalTankWar.g:872:2: '}'
            {
             before(grammarAccess.getTankWarGameAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTankWarGameAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__Group__6__Impl"


    // $ANTLR start "rule__DirectBehaviour__Group_1__0"
    // InternalTankWar.g:882:1: rule__DirectBehaviour__Group_1__0 : rule__DirectBehaviour__Group_1__0__Impl rule__DirectBehaviour__Group_1__1 ;
    public final void rule__DirectBehaviour__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:886:1: ( rule__DirectBehaviour__Group_1__0__Impl rule__DirectBehaviour__Group_1__1 )
            // InternalTankWar.g:887:2: rule__DirectBehaviour__Group_1__0__Impl rule__DirectBehaviour__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__DirectBehaviour__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectBehaviour__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectBehaviour__Group_1__0"


    // $ANTLR start "rule__DirectBehaviour__Group_1__0__Impl"
    // InternalTankWar.g:894:1: rule__DirectBehaviour__Group_1__0__Impl : ( ruleNoOpBehaviour ) ;
    public final void rule__DirectBehaviour__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:898:1: ( ( ruleNoOpBehaviour ) )
            // InternalTankWar.g:899:1: ( ruleNoOpBehaviour )
            {
            // InternalTankWar.g:899:1: ( ruleNoOpBehaviour )
            // InternalTankWar.g:900:2: ruleNoOpBehaviour
            {
             before(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNoOpBehaviour();

            state._fsp--;

             after(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectBehaviour__Group_1__0__Impl"


    // $ANTLR start "rule__DirectBehaviour__Group_1__1"
    // InternalTankWar.g:909:1: rule__DirectBehaviour__Group_1__1 : rule__DirectBehaviour__Group_1__1__Impl ;
    public final void rule__DirectBehaviour__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:913:1: ( rule__DirectBehaviour__Group_1__1__Impl )
            // InternalTankWar.g:914:2: rule__DirectBehaviour__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectBehaviour__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectBehaviour__Group_1__1"


    // $ANTLR start "rule__DirectBehaviour__Group_1__1__Impl"
    // InternalTankWar.g:920:1: rule__DirectBehaviour__Group_1__1__Impl : ( () ) ;
    public final void rule__DirectBehaviour__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:924:1: ( ( () ) )
            // InternalTankWar.g:925:1: ( () )
            {
            // InternalTankWar.g:925:1: ( () )
            // InternalTankWar.g:926:2: ()
            {
             before(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourAction_1_1()); 
            // InternalTankWar.g:927:2: ()
            // InternalTankWar.g:927:3: 
            {
            }

             after(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectBehaviour__Group_1__1__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__0"
    // InternalTankWar.g:936:1: rule__EndGameBehaviour__Group__0 : rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1 ;
    public final void rule__EndGameBehaviour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:940:1: ( rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1 )
            // InternalTankWar.g:941:2: rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EndGameBehaviour__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__0"


    // $ANTLR start "rule__EndGameBehaviour__Group__0__Impl"
    // InternalTankWar.g:948:1: rule__EndGameBehaviour__Group__0__Impl : ( 'end-game' ) ;
    public final void rule__EndGameBehaviour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:952:1: ( ( 'end-game' ) )
            // InternalTankWar.g:953:1: ( 'end-game' )
            {
            // InternalTankWar.g:953:1: ( 'end-game' )
            // InternalTankWar.g:954:2: 'end-game'
            {
             before(grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__0__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__1"
    // InternalTankWar.g:963:1: rule__EndGameBehaviour__Group__1 : rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2 ;
    public final void rule__EndGameBehaviour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:967:1: ( rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2 )
            // InternalTankWar.g:968:2: rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EndGameBehaviour__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__1"


    // $ANTLR start "rule__EndGameBehaviour__Group__1__Impl"
    // InternalTankWar.g:975:1: rule__EndGameBehaviour__Group__1__Impl : ( '(' ) ;
    public final void rule__EndGameBehaviour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:979:1: ( ( '(' ) )
            // InternalTankWar.g:980:1: ( '(' )
            {
            // InternalTankWar.g:980:1: ( '(' )
            // InternalTankWar.g:981:2: '('
            {
             before(grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__1__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__2"
    // InternalTankWar.g:990:1: rule__EndGameBehaviour__Group__2 : rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3 ;
    public final void rule__EndGameBehaviour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:994:1: ( rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3 )
            // InternalTankWar.g:995:2: rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EndGameBehaviour__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__2"


    // $ANTLR start "rule__EndGameBehaviour__Group__2__Impl"
    // InternalTankWar.g:1002:1: rule__EndGameBehaviour__Group__2__Impl : ( ( rule__EndGameBehaviour__WinAssignment_2 ) ) ;
    public final void rule__EndGameBehaviour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1006:1: ( ( ( rule__EndGameBehaviour__WinAssignment_2 ) ) )
            // InternalTankWar.g:1007:1: ( ( rule__EndGameBehaviour__WinAssignment_2 ) )
            {
            // InternalTankWar.g:1007:1: ( ( rule__EndGameBehaviour__WinAssignment_2 ) )
            // InternalTankWar.g:1008:2: ( rule__EndGameBehaviour__WinAssignment_2 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getWinAssignment_2()); 
            // InternalTankWar.g:1009:2: ( rule__EndGameBehaviour__WinAssignment_2 )
            // InternalTankWar.g:1009:3: rule__EndGameBehaviour__WinAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__WinAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndGameBehaviourAccess().getWinAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__2__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__3"
    // InternalTankWar.g:1017:1: rule__EndGameBehaviour__Group__3 : rule__EndGameBehaviour__Group__3__Impl rule__EndGameBehaviour__Group__4 ;
    public final void rule__EndGameBehaviour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1021:1: ( rule__EndGameBehaviour__Group__3__Impl rule__EndGameBehaviour__Group__4 )
            // InternalTankWar.g:1022:2: rule__EndGameBehaviour__Group__3__Impl rule__EndGameBehaviour__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EndGameBehaviour__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__3"


    // $ANTLR start "rule__EndGameBehaviour__Group__3__Impl"
    // InternalTankWar.g:1029:1: rule__EndGameBehaviour__Group__3__Impl : ( ',' ) ;
    public final void rule__EndGameBehaviour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1033:1: ( ( ',' ) )
            // InternalTankWar.g:1034:1: ( ',' )
            {
            // InternalTankWar.g:1034:1: ( ',' )
            // InternalTankWar.g:1035:2: ','
            {
             before(grammarAccess.getEndGameBehaviourAccess().getCommaKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__3__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__4"
    // InternalTankWar.g:1044:1: rule__EndGameBehaviour__Group__4 : rule__EndGameBehaviour__Group__4__Impl rule__EndGameBehaviour__Group__5 ;
    public final void rule__EndGameBehaviour__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1048:1: ( rule__EndGameBehaviour__Group__4__Impl rule__EndGameBehaviour__Group__5 )
            // InternalTankWar.g:1049:2: rule__EndGameBehaviour__Group__4__Impl rule__EndGameBehaviour__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__EndGameBehaviour__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__4"


    // $ANTLR start "rule__EndGameBehaviour__Group__4__Impl"
    // InternalTankWar.g:1056:1: rule__EndGameBehaviour__Group__4__Impl : ( ( rule__EndGameBehaviour__LostAssignment_4 ) ) ;
    public final void rule__EndGameBehaviour__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1060:1: ( ( ( rule__EndGameBehaviour__LostAssignment_4 ) ) )
            // InternalTankWar.g:1061:1: ( ( rule__EndGameBehaviour__LostAssignment_4 ) )
            {
            // InternalTankWar.g:1061:1: ( ( rule__EndGameBehaviour__LostAssignment_4 ) )
            // InternalTankWar.g:1062:2: ( rule__EndGameBehaviour__LostAssignment_4 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getLostAssignment_4()); 
            // InternalTankWar.g:1063:2: ( rule__EndGameBehaviour__LostAssignment_4 )
            // InternalTankWar.g:1063:3: rule__EndGameBehaviour__LostAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__LostAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEndGameBehaviourAccess().getLostAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__4__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__5"
    // InternalTankWar.g:1071:1: rule__EndGameBehaviour__Group__5 : rule__EndGameBehaviour__Group__5__Impl ;
    public final void rule__EndGameBehaviour__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1075:1: ( rule__EndGameBehaviour__Group__5__Impl )
            // InternalTankWar.g:1076:2: rule__EndGameBehaviour__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__5"


    // $ANTLR start "rule__EndGameBehaviour__Group__5__Impl"
    // InternalTankWar.g:1082:1: rule__EndGameBehaviour__Group__5__Impl : ( ')' ) ;
    public final void rule__EndGameBehaviour__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1086:1: ( ( ')' ) )
            // InternalTankWar.g:1087:1: ( ')' )
            {
            // InternalTankWar.g:1087:1: ( ')' )
            // InternalTankWar.g:1088:2: ')'
            {
             before(grammarAccess.getEndGameBehaviourAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__5__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__0"
    // InternalTankWar.g:1098:1: rule__ScreenSpecification__Group__0 : rule__ScreenSpecification__Group__0__Impl rule__ScreenSpecification__Group__1 ;
    public final void rule__ScreenSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1102:1: ( rule__ScreenSpecification__Group__0__Impl rule__ScreenSpecification__Group__1 )
            // InternalTankWar.g:1103:2: rule__ScreenSpecification__Group__0__Impl rule__ScreenSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ScreenSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__0"


    // $ANTLR start "rule__ScreenSpecification__Group__0__Impl"
    // InternalTankWar.g:1110:1: rule__ScreenSpecification__Group__0__Impl : ( 'screen' ) ;
    public final void rule__ScreenSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1114:1: ( ( 'screen' ) )
            // InternalTankWar.g:1115:1: ( 'screen' )
            {
            // InternalTankWar.g:1115:1: ( 'screen' )
            // InternalTankWar.g:1116:2: 'screen'
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getScreenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__0__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__1"
    // InternalTankWar.g:1125:1: rule__ScreenSpecification__Group__1 : rule__ScreenSpecification__Group__1__Impl rule__ScreenSpecification__Group__2 ;
    public final void rule__ScreenSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1129:1: ( rule__ScreenSpecification__Group__1__Impl rule__ScreenSpecification__Group__2 )
            // InternalTankWar.g:1130:2: rule__ScreenSpecification__Group__1__Impl rule__ScreenSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ScreenSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__1"


    // $ANTLR start "rule__ScreenSpecification__Group__1__Impl"
    // InternalTankWar.g:1137:1: rule__ScreenSpecification__Group__1__Impl : ( ( rule__ScreenSpecification__NameAssignment_1 ) ) ;
    public final void rule__ScreenSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1141:1: ( ( ( rule__ScreenSpecification__NameAssignment_1 ) ) )
            // InternalTankWar.g:1142:1: ( ( rule__ScreenSpecification__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1142:1: ( ( rule__ScreenSpecification__NameAssignment_1 ) )
            // InternalTankWar.g:1143:2: ( rule__ScreenSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1144:2: ( rule__ScreenSpecification__NameAssignment_1 )
            // InternalTankWar.g:1144:3: rule__ScreenSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScreenSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__1__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__2"
    // InternalTankWar.g:1152:1: rule__ScreenSpecification__Group__2 : rule__ScreenSpecification__Group__2__Impl rule__ScreenSpecification__Group__3 ;
    public final void rule__ScreenSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1156:1: ( rule__ScreenSpecification__Group__2__Impl rule__ScreenSpecification__Group__3 )
            // InternalTankWar.g:1157:2: rule__ScreenSpecification__Group__2__Impl rule__ScreenSpecification__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ScreenSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__2"


    // $ANTLR start "rule__ScreenSpecification__Group__2__Impl"
    // InternalTankWar.g:1164:1: rule__ScreenSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__ScreenSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1168:1: ( ( '{' ) )
            // InternalTankWar.g:1169:1: ( '{' )
            {
            // InternalTankWar.g:1169:1: ( '{' )
            // InternalTankWar.g:1170:2: '{'
            {
             before(grammarAccess.getScreenSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__2__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__3"
    // InternalTankWar.g:1179:1: rule__ScreenSpecification__Group__3 : rule__ScreenSpecification__Group__3__Impl rule__ScreenSpecification__Group__4 ;
    public final void rule__ScreenSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1183:1: ( rule__ScreenSpecification__Group__3__Impl rule__ScreenSpecification__Group__4 )
            // InternalTankWar.g:1184:2: rule__ScreenSpecification__Group__3__Impl rule__ScreenSpecification__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ScreenSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__3"


    // $ANTLR start "rule__ScreenSpecification__Group__3__Impl"
    // InternalTankWar.g:1191:1: rule__ScreenSpecification__Group__3__Impl : ( 'screenWidth' ) ;
    public final void rule__ScreenSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1195:1: ( ( 'screenWidth' ) )
            // InternalTankWar.g:1196:1: ( 'screenWidth' )
            {
            // InternalTankWar.g:1196:1: ( 'screenWidth' )
            // InternalTankWar.g:1197:2: 'screenWidth'
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenWidthKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getScreenWidthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__3__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__4"
    // InternalTankWar.g:1206:1: rule__ScreenSpecification__Group__4 : rule__ScreenSpecification__Group__4__Impl rule__ScreenSpecification__Group__5 ;
    public final void rule__ScreenSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1210:1: ( rule__ScreenSpecification__Group__4__Impl rule__ScreenSpecification__Group__5 )
            // InternalTankWar.g:1211:2: rule__ScreenSpecification__Group__4__Impl rule__ScreenSpecification__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ScreenSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__4"


    // $ANTLR start "rule__ScreenSpecification__Group__4__Impl"
    // InternalTankWar.g:1218:1: rule__ScreenSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__ScreenSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1222:1: ( ( '=' ) )
            // InternalTankWar.g:1223:1: ( '=' )
            {
            // InternalTankWar.g:1223:1: ( '=' )
            // InternalTankWar.g:1224:2: '='
            {
             before(grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__4__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__5"
    // InternalTankWar.g:1233:1: rule__ScreenSpecification__Group__5 : rule__ScreenSpecification__Group__5__Impl rule__ScreenSpecification__Group__6 ;
    public final void rule__ScreenSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1237:1: ( rule__ScreenSpecification__Group__5__Impl rule__ScreenSpecification__Group__6 )
            // InternalTankWar.g:1238:2: rule__ScreenSpecification__Group__5__Impl rule__ScreenSpecification__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ScreenSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__5"


    // $ANTLR start "rule__ScreenSpecification__Group__5__Impl"
    // InternalTankWar.g:1245:1: rule__ScreenSpecification__Group__5__Impl : ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) ) ;
    public final void rule__ScreenSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1249:1: ( ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) ) )
            // InternalTankWar.g:1250:1: ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) )
            {
            // InternalTankWar.g:1250:1: ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) )
            // InternalTankWar.g:1251:2: ( rule__ScreenSpecification__ScreenWidthAssignment_5 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenWidthAssignment_5()); 
            // InternalTankWar.g:1252:2: ( rule__ScreenSpecification__ScreenWidthAssignment_5 )
            // InternalTankWar.g:1252:3: rule__ScreenSpecification__ScreenWidthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__ScreenWidthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScreenSpecificationAccess().getScreenWidthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__5__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__6"
    // InternalTankWar.g:1260:1: rule__ScreenSpecification__Group__6 : rule__ScreenSpecification__Group__6__Impl rule__ScreenSpecification__Group__7 ;
    public final void rule__ScreenSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1264:1: ( rule__ScreenSpecification__Group__6__Impl rule__ScreenSpecification__Group__7 )
            // InternalTankWar.g:1265:2: rule__ScreenSpecification__Group__6__Impl rule__ScreenSpecification__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__ScreenSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__6"


    // $ANTLR start "rule__ScreenSpecification__Group__6__Impl"
    // InternalTankWar.g:1272:1: rule__ScreenSpecification__Group__6__Impl : ( 'screenHeight' ) ;
    public final void rule__ScreenSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1276:1: ( ( 'screenHeight' ) )
            // InternalTankWar.g:1277:1: ( 'screenHeight' )
            {
            // InternalTankWar.g:1277:1: ( 'screenHeight' )
            // InternalTankWar.g:1278:2: 'screenHeight'
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenHeightKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getScreenHeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__6__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__7"
    // InternalTankWar.g:1287:1: rule__ScreenSpecification__Group__7 : rule__ScreenSpecification__Group__7__Impl rule__ScreenSpecification__Group__8 ;
    public final void rule__ScreenSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1291:1: ( rule__ScreenSpecification__Group__7__Impl rule__ScreenSpecification__Group__8 )
            // InternalTankWar.g:1292:2: rule__ScreenSpecification__Group__7__Impl rule__ScreenSpecification__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__ScreenSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__7"


    // $ANTLR start "rule__ScreenSpecification__Group__7__Impl"
    // InternalTankWar.g:1299:1: rule__ScreenSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__ScreenSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1303:1: ( ( '=' ) )
            // InternalTankWar.g:1304:1: ( '=' )
            {
            // InternalTankWar.g:1304:1: ( '=' )
            // InternalTankWar.g:1305:2: '='
            {
             before(grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__7__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__8"
    // InternalTankWar.g:1314:1: rule__ScreenSpecification__Group__8 : rule__ScreenSpecification__Group__8__Impl rule__ScreenSpecification__Group__9 ;
    public final void rule__ScreenSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1318:1: ( rule__ScreenSpecification__Group__8__Impl rule__ScreenSpecification__Group__9 )
            // InternalTankWar.g:1319:2: rule__ScreenSpecification__Group__8__Impl rule__ScreenSpecification__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__ScreenSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__8"


    // $ANTLR start "rule__ScreenSpecification__Group__8__Impl"
    // InternalTankWar.g:1326:1: rule__ScreenSpecification__Group__8__Impl : ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) ) ;
    public final void rule__ScreenSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1330:1: ( ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) ) )
            // InternalTankWar.g:1331:1: ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) )
            {
            // InternalTankWar.g:1331:1: ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) )
            // InternalTankWar.g:1332:2: ( rule__ScreenSpecification__ScreenHeightAssignment_8 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenHeightAssignment_8()); 
            // InternalTankWar.g:1333:2: ( rule__ScreenSpecification__ScreenHeightAssignment_8 )
            // InternalTankWar.g:1333:3: rule__ScreenSpecification__ScreenHeightAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__ScreenHeightAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getScreenSpecificationAccess().getScreenHeightAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__8__Impl"


    // $ANTLR start "rule__ScreenSpecification__Group__9"
    // InternalTankWar.g:1341:1: rule__ScreenSpecification__Group__9 : rule__ScreenSpecification__Group__9__Impl ;
    public final void rule__ScreenSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1345:1: ( rule__ScreenSpecification__Group__9__Impl )
            // InternalTankWar.g:1346:2: rule__ScreenSpecification__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScreenSpecification__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__9"


    // $ANTLR start "rule__ScreenSpecification__Group__9__Impl"
    // InternalTankWar.g:1352:1: rule__ScreenSpecification__Group__9__Impl : ( '}' ) ;
    public final void rule__ScreenSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1356:1: ( ( '}' ) )
            // InternalTankWar.g:1357:1: ( '}' )
            {
            // InternalTankWar.g:1357:1: ( '}' )
            // InternalTankWar.g:1358:2: '}'
            {
             before(grammarAccess.getScreenSpecificationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__Group__9__Impl"


    // $ANTLR start "rule__Obstaclepecification__Group__0"
    // InternalTankWar.g:1368:1: rule__Obstaclepecification__Group__0 : rule__Obstaclepecification__Group__0__Impl rule__Obstaclepecification__Group__1 ;
    public final void rule__Obstaclepecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1372:1: ( rule__Obstaclepecification__Group__0__Impl rule__Obstaclepecification__Group__1 )
            // InternalTankWar.g:1373:2: rule__Obstaclepecification__Group__0__Impl rule__Obstaclepecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Obstaclepecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstaclepecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__0"


    // $ANTLR start "rule__Obstaclepecification__Group__0__Impl"
    // InternalTankWar.g:1380:1: rule__Obstaclepecification__Group__0__Impl : ( 'obstacle' ) ;
    public final void rule__Obstaclepecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1384:1: ( ( 'obstacle' ) )
            // InternalTankWar.g:1385:1: ( 'obstacle' )
            {
            // InternalTankWar.g:1385:1: ( 'obstacle' )
            // InternalTankWar.g:1386:2: 'obstacle'
            {
             before(grammarAccess.getObstaclepecificationAccess().getObstacleKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObstaclepecificationAccess().getObstacleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__0__Impl"


    // $ANTLR start "rule__Obstaclepecification__Group__1"
    // InternalTankWar.g:1395:1: rule__Obstaclepecification__Group__1 : rule__Obstaclepecification__Group__1__Impl rule__Obstaclepecification__Group__2 ;
    public final void rule__Obstaclepecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1399:1: ( rule__Obstaclepecification__Group__1__Impl rule__Obstaclepecification__Group__2 )
            // InternalTankWar.g:1400:2: rule__Obstaclepecification__Group__1__Impl rule__Obstaclepecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Obstaclepecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstaclepecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__1"


    // $ANTLR start "rule__Obstaclepecification__Group__1__Impl"
    // InternalTankWar.g:1407:1: rule__Obstaclepecification__Group__1__Impl : ( ( rule__Obstaclepecification__NameAssignment_1 ) ) ;
    public final void rule__Obstaclepecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1411:1: ( ( ( rule__Obstaclepecification__NameAssignment_1 ) ) )
            // InternalTankWar.g:1412:1: ( ( rule__Obstaclepecification__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1412:1: ( ( rule__Obstaclepecification__NameAssignment_1 ) )
            // InternalTankWar.g:1413:2: ( rule__Obstaclepecification__NameAssignment_1 )
            {
             before(grammarAccess.getObstaclepecificationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1414:2: ( rule__Obstaclepecification__NameAssignment_1 )
            // InternalTankWar.g:1414:3: rule__Obstaclepecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Obstaclepecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObstaclepecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__1__Impl"


    // $ANTLR start "rule__Obstaclepecification__Group__2"
    // InternalTankWar.g:1422:1: rule__Obstaclepecification__Group__2 : rule__Obstaclepecification__Group__2__Impl rule__Obstaclepecification__Group__3 ;
    public final void rule__Obstaclepecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1426:1: ( rule__Obstaclepecification__Group__2__Impl rule__Obstaclepecification__Group__3 )
            // InternalTankWar.g:1427:2: rule__Obstaclepecification__Group__2__Impl rule__Obstaclepecification__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Obstaclepecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstaclepecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__2"


    // $ANTLR start "rule__Obstaclepecification__Group__2__Impl"
    // InternalTankWar.g:1434:1: rule__Obstaclepecification__Group__2__Impl : ( '{' ) ;
    public final void rule__Obstaclepecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1438:1: ( ( '{' ) )
            // InternalTankWar.g:1439:1: ( '{' )
            {
            // InternalTankWar.g:1439:1: ( '{' )
            // InternalTankWar.g:1440:2: '{'
            {
             before(grammarAccess.getObstaclepecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getObstaclepecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__2__Impl"


    // $ANTLR start "rule__Obstaclepecification__Group__3"
    // InternalTankWar.g:1449:1: rule__Obstaclepecification__Group__3 : rule__Obstaclepecification__Group__3__Impl rule__Obstaclepecification__Group__4 ;
    public final void rule__Obstaclepecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1453:1: ( rule__Obstaclepecification__Group__3__Impl rule__Obstaclepecification__Group__4 )
            // InternalTankWar.g:1454:2: rule__Obstaclepecification__Group__3__Impl rule__Obstaclepecification__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Obstaclepecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstaclepecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__3"


    // $ANTLR start "rule__Obstaclepecification__Group__3__Impl"
    // InternalTankWar.g:1461:1: rule__Obstaclepecification__Group__3__Impl : ( ( rule__Obstaclepecification__FieldsAssignment_3 )* ) ;
    public final void rule__Obstaclepecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1465:1: ( ( ( rule__Obstaclepecification__FieldsAssignment_3 )* ) )
            // InternalTankWar.g:1466:1: ( ( rule__Obstaclepecification__FieldsAssignment_3 )* )
            {
            // InternalTankWar.g:1466:1: ( ( rule__Obstaclepecification__FieldsAssignment_3 )* )
            // InternalTankWar.g:1467:2: ( rule__Obstaclepecification__FieldsAssignment_3 )*
            {
             before(grammarAccess.getObstaclepecificationAccess().getFieldsAssignment_3()); 
            // InternalTankWar.g:1468:2: ( rule__Obstaclepecification__FieldsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTankWar.g:1468:3: rule__Obstaclepecification__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Obstaclepecification__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getObstaclepecificationAccess().getFieldsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__3__Impl"


    // $ANTLR start "rule__Obstaclepecification__Group__4"
    // InternalTankWar.g:1476:1: rule__Obstaclepecification__Group__4 : rule__Obstaclepecification__Group__4__Impl ;
    public final void rule__Obstaclepecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1480:1: ( rule__Obstaclepecification__Group__4__Impl )
            // InternalTankWar.g:1481:2: rule__Obstaclepecification__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Obstaclepecification__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__4"


    // $ANTLR start "rule__Obstaclepecification__Group__4__Impl"
    // InternalTankWar.g:1487:1: rule__Obstaclepecification__Group__4__Impl : ( '}' ) ;
    public final void rule__Obstaclepecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1491:1: ( ( '}' ) )
            // InternalTankWar.g:1492:1: ( '}' )
            {
            // InternalTankWar.g:1492:1: ( '}' )
            // InternalTankWar.g:1493:2: '}'
            {
             before(grammarAccess.getObstaclepecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getObstaclepecificationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__Group__4__Impl"


    // $ANTLR start "rule__WaterObstacle__Group__0"
    // InternalTankWar.g:1503:1: rule__WaterObstacle__Group__0 : rule__WaterObstacle__Group__0__Impl rule__WaterObstacle__Group__1 ;
    public final void rule__WaterObstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1507:1: ( rule__WaterObstacle__Group__0__Impl rule__WaterObstacle__Group__1 )
            // InternalTankWar.g:1508:2: rule__WaterObstacle__Group__0__Impl rule__WaterObstacle__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WaterObstacle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaterObstacle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaterObstacle__Group__0"


    // $ANTLR start "rule__WaterObstacle__Group__0__Impl"
    // InternalTankWar.g:1515:1: rule__WaterObstacle__Group__0__Impl : ( 'water' ) ;
    public final void rule__WaterObstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1519:1: ( ( 'water' ) )
            // InternalTankWar.g:1520:1: ( 'water' )
            {
            // InternalTankWar.g:1520:1: ( 'water' )
            // InternalTankWar.g:1521:2: 'water'
            {
             before(grammarAccess.getWaterObstacleAccess().getWaterKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWaterObstacleAccess().getWaterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaterObstacle__Group__0__Impl"


    // $ANTLR start "rule__WaterObstacle__Group__1"
    // InternalTankWar.g:1530:1: rule__WaterObstacle__Group__1 : rule__WaterObstacle__Group__1__Impl rule__WaterObstacle__Group__2 ;
    public final void rule__WaterObstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1534:1: ( rule__WaterObstacle__Group__1__Impl rule__WaterObstacle__Group__2 )
            // InternalTankWar.g:1535:2: rule__WaterObstacle__Group__1__Impl rule__WaterObstacle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WaterObstacle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaterObstacle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaterObstacle__Group__1"


    // $ANTLR start "rule__WaterObstacle__Group__1__Impl"
    // InternalTankWar.g:1542:1: rule__WaterObstacle__Group__1__Impl : ( ( rule__WaterObstacle__NameAssignment_1 ) ) ;
    public final void rule__WaterObstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1546:1: ( ( ( rule__WaterObstacle__NameAssignment_1 ) ) )
            // InternalTankWar.g:1547:1: ( ( rule__WaterObstacle__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1547:1: ( ( rule__WaterObstacle__NameAssignment_1 ) )
            // InternalTankWar.g:1548:2: ( rule__WaterObstacle__NameAssignment_1 )
            {
             before(grammarAccess.getWaterObstacleAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1549:2: ( rule__WaterObstacle__NameAssignment_1 )
            // InternalTankWar.g:1549:3: rule__WaterObstacle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WaterObstacle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWaterObstacleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaterObstacle__Group__1__Impl"


    // $ANTLR start "rule__WaterObstacle__Group__2"
    // InternalTankWar.g:1557:1: rule__WaterObstacle__Group__2 : rule__WaterObstacle__Group__2__Impl rule__WaterObstacle__Group__3 ;
    public final void rule__WaterObstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1561:1: ( rule__WaterObstacle__Group__2__Impl rule__WaterObstacle__Group__3 )
            // InternalTankWar.g:1562:2: rule__WaterObstacle__Group__2__Impl rule__WaterObstacle__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__WaterObstacle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaterObstacle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaterObstacle__Group__2"


    // $ANTLR start "rule__WaterObstacle__Group__2__Impl"
    // InternalTankWar.g:1569:1: rule__WaterObstacle__Group__2__Impl : ( '{' ) ;
    public final void rule__WaterObstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1573:1: ( ( '{' ) )
            // InternalTankWar.g:1574:1: ( '{' )
            {
            // InternalTankWar.g:1574:1: ( '{' )
            // InternalTankWar.g:1575:2: '{'
            {
             before(grammarAccess.getWaterObstacleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWaterObstacleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaterObstacle__Group__2__Impl"


    // $ANTLR start "rule__WaterObstacle__Group__3"
    // InternalTankWar.g:1584:1: rule__WaterObstacle__Group__3 : rule__WaterObstacle__Group__3__Impl ;
    public final void rule__WaterObstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1588:1: ( rule__WaterObstacle__Group__3__Impl )
            // InternalTankWar.g:1589:2: rule__WaterObstacle__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WaterObstacle__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaterObstacle__Group__3"


    // $ANTLR start "rule__WaterObstacle__Group__3__Impl"
    // InternalTankWar.g:1595:1: rule__WaterObstacle__Group__3__Impl : ( '}' ) ;
    public final void rule__WaterObstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1599:1: ( ( '}' ) )
            // InternalTankWar.g:1600:1: ( '}' )
            {
            // InternalTankWar.g:1600:1: ( '}' )
            // InternalTankWar.g:1601:2: '}'
            {
             before(grammarAccess.getWaterObstacleAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWaterObstacleAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaterObstacle__Group__3__Impl"


    // $ANTLR start "rule__WallObstacle__Group__0"
    // InternalTankWar.g:1611:1: rule__WallObstacle__Group__0 : rule__WallObstacle__Group__0__Impl rule__WallObstacle__Group__1 ;
    public final void rule__WallObstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1615:1: ( rule__WallObstacle__Group__0__Impl rule__WallObstacle__Group__1 )
            // InternalTankWar.g:1616:2: rule__WallObstacle__Group__0__Impl rule__WallObstacle__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WallObstacle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__0"


    // $ANTLR start "rule__WallObstacle__Group__0__Impl"
    // InternalTankWar.g:1623:1: rule__WallObstacle__Group__0__Impl : ( 'wall' ) ;
    public final void rule__WallObstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1627:1: ( ( 'wall' ) )
            // InternalTankWar.g:1628:1: ( 'wall' )
            {
            // InternalTankWar.g:1628:1: ( 'wall' )
            // InternalTankWar.g:1629:2: 'wall'
            {
             before(grammarAccess.getWallObstacleAccess().getWallKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getWallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__0__Impl"


    // $ANTLR start "rule__WallObstacle__Group__1"
    // InternalTankWar.g:1638:1: rule__WallObstacle__Group__1 : rule__WallObstacle__Group__1__Impl rule__WallObstacle__Group__2 ;
    public final void rule__WallObstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1642:1: ( rule__WallObstacle__Group__1__Impl rule__WallObstacle__Group__2 )
            // InternalTankWar.g:1643:2: rule__WallObstacle__Group__1__Impl rule__WallObstacle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WallObstacle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__1"


    // $ANTLR start "rule__WallObstacle__Group__1__Impl"
    // InternalTankWar.g:1650:1: rule__WallObstacle__Group__1__Impl : ( ( rule__WallObstacle__NameAssignment_1 ) ) ;
    public final void rule__WallObstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1654:1: ( ( ( rule__WallObstacle__NameAssignment_1 ) ) )
            // InternalTankWar.g:1655:1: ( ( rule__WallObstacle__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1655:1: ( ( rule__WallObstacle__NameAssignment_1 ) )
            // InternalTankWar.g:1656:2: ( rule__WallObstacle__NameAssignment_1 )
            {
             before(grammarAccess.getWallObstacleAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1657:2: ( rule__WallObstacle__NameAssignment_1 )
            // InternalTankWar.g:1657:3: rule__WallObstacle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WallObstacle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWallObstacleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__1__Impl"


    // $ANTLR start "rule__WallObstacle__Group__2"
    // InternalTankWar.g:1665:1: rule__WallObstacle__Group__2 : rule__WallObstacle__Group__2__Impl rule__WallObstacle__Group__3 ;
    public final void rule__WallObstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1669:1: ( rule__WallObstacle__Group__2__Impl rule__WallObstacle__Group__3 )
            // InternalTankWar.g:1670:2: rule__WallObstacle__Group__2__Impl rule__WallObstacle__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__WallObstacle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__2"


    // $ANTLR start "rule__WallObstacle__Group__2__Impl"
    // InternalTankWar.g:1677:1: rule__WallObstacle__Group__2__Impl : ( '{' ) ;
    public final void rule__WallObstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1681:1: ( ( '{' ) )
            // InternalTankWar.g:1682:1: ( '{' )
            {
            // InternalTankWar.g:1682:1: ( '{' )
            // InternalTankWar.g:1683:2: '{'
            {
             before(grammarAccess.getWallObstacleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__2__Impl"


    // $ANTLR start "rule__WallObstacle__Group__3"
    // InternalTankWar.g:1692:1: rule__WallObstacle__Group__3 : rule__WallObstacle__Group__3__Impl rule__WallObstacle__Group__4 ;
    public final void rule__WallObstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1696:1: ( rule__WallObstacle__Group__3__Impl rule__WallObstacle__Group__4 )
            // InternalTankWar.g:1697:2: rule__WallObstacle__Group__3__Impl rule__WallObstacle__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__WallObstacle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__3"


    // $ANTLR start "rule__WallObstacle__Group__3__Impl"
    // InternalTankWar.g:1704:1: rule__WallObstacle__Group__3__Impl : ( 'wallWidth' ) ;
    public final void rule__WallObstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1708:1: ( ( 'wallWidth' ) )
            // InternalTankWar.g:1709:1: ( 'wallWidth' )
            {
            // InternalTankWar.g:1709:1: ( 'wallWidth' )
            // InternalTankWar.g:1710:2: 'wallWidth'
            {
             before(grammarAccess.getWallObstacleAccess().getWallWidthKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getWallWidthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__3__Impl"


    // $ANTLR start "rule__WallObstacle__Group__4"
    // InternalTankWar.g:1719:1: rule__WallObstacle__Group__4 : rule__WallObstacle__Group__4__Impl rule__WallObstacle__Group__5 ;
    public final void rule__WallObstacle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1723:1: ( rule__WallObstacle__Group__4__Impl rule__WallObstacle__Group__5 )
            // InternalTankWar.g:1724:2: rule__WallObstacle__Group__4__Impl rule__WallObstacle__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__WallObstacle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__4"


    // $ANTLR start "rule__WallObstacle__Group__4__Impl"
    // InternalTankWar.g:1731:1: rule__WallObstacle__Group__4__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1735:1: ( ( '=' ) )
            // InternalTankWar.g:1736:1: ( '=' )
            {
            // InternalTankWar.g:1736:1: ( '=' )
            // InternalTankWar.g:1737:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__4__Impl"


    // $ANTLR start "rule__WallObstacle__Group__5"
    // InternalTankWar.g:1746:1: rule__WallObstacle__Group__5 : rule__WallObstacle__Group__5__Impl rule__WallObstacle__Group__6 ;
    public final void rule__WallObstacle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1750:1: ( rule__WallObstacle__Group__5__Impl rule__WallObstacle__Group__6 )
            // InternalTankWar.g:1751:2: rule__WallObstacle__Group__5__Impl rule__WallObstacle__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__WallObstacle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__5"


    // $ANTLR start "rule__WallObstacle__Group__5__Impl"
    // InternalTankWar.g:1758:1: rule__WallObstacle__Group__5__Impl : ( ( rule__WallObstacle__WallWidthAssignment_5 ) ) ;
    public final void rule__WallObstacle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1762:1: ( ( ( rule__WallObstacle__WallWidthAssignment_5 ) ) )
            // InternalTankWar.g:1763:1: ( ( rule__WallObstacle__WallWidthAssignment_5 ) )
            {
            // InternalTankWar.g:1763:1: ( ( rule__WallObstacle__WallWidthAssignment_5 ) )
            // InternalTankWar.g:1764:2: ( rule__WallObstacle__WallWidthAssignment_5 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallWidthAssignment_5()); 
            // InternalTankWar.g:1765:2: ( rule__WallObstacle__WallWidthAssignment_5 )
            // InternalTankWar.g:1765:3: rule__WallObstacle__WallWidthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WallObstacle__WallWidthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWallObstacleAccess().getWallWidthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__5__Impl"


    // $ANTLR start "rule__WallObstacle__Group__6"
    // InternalTankWar.g:1773:1: rule__WallObstacle__Group__6 : rule__WallObstacle__Group__6__Impl rule__WallObstacle__Group__7 ;
    public final void rule__WallObstacle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1777:1: ( rule__WallObstacle__Group__6__Impl rule__WallObstacle__Group__7 )
            // InternalTankWar.g:1778:2: rule__WallObstacle__Group__6__Impl rule__WallObstacle__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__WallObstacle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__6"


    // $ANTLR start "rule__WallObstacle__Group__6__Impl"
    // InternalTankWar.g:1785:1: rule__WallObstacle__Group__6__Impl : ( 'wallHeight' ) ;
    public final void rule__WallObstacle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1789:1: ( ( 'wallHeight' ) )
            // InternalTankWar.g:1790:1: ( 'wallHeight' )
            {
            // InternalTankWar.g:1790:1: ( 'wallHeight' )
            // InternalTankWar.g:1791:2: 'wallHeight'
            {
             before(grammarAccess.getWallObstacleAccess().getWallHeightKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getWallHeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__6__Impl"


    // $ANTLR start "rule__WallObstacle__Group__7"
    // InternalTankWar.g:1800:1: rule__WallObstacle__Group__7 : rule__WallObstacle__Group__7__Impl rule__WallObstacle__Group__8 ;
    public final void rule__WallObstacle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1804:1: ( rule__WallObstacle__Group__7__Impl rule__WallObstacle__Group__8 )
            // InternalTankWar.g:1805:2: rule__WallObstacle__Group__7__Impl rule__WallObstacle__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__WallObstacle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__7"


    // $ANTLR start "rule__WallObstacle__Group__7__Impl"
    // InternalTankWar.g:1812:1: rule__WallObstacle__Group__7__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1816:1: ( ( '=' ) )
            // InternalTankWar.g:1817:1: ( '=' )
            {
            // InternalTankWar.g:1817:1: ( '=' )
            // InternalTankWar.g:1818:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__7__Impl"


    // $ANTLR start "rule__WallObstacle__Group__8"
    // InternalTankWar.g:1827:1: rule__WallObstacle__Group__8 : rule__WallObstacle__Group__8__Impl rule__WallObstacle__Group__9 ;
    public final void rule__WallObstacle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1831:1: ( rule__WallObstacle__Group__8__Impl rule__WallObstacle__Group__9 )
            // InternalTankWar.g:1832:2: rule__WallObstacle__Group__8__Impl rule__WallObstacle__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__WallObstacle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__8"


    // $ANTLR start "rule__WallObstacle__Group__8__Impl"
    // InternalTankWar.g:1839:1: rule__WallObstacle__Group__8__Impl : ( ( rule__WallObstacle__WallHeightAssignment_8 ) ) ;
    public final void rule__WallObstacle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1843:1: ( ( ( rule__WallObstacle__WallHeightAssignment_8 ) ) )
            // InternalTankWar.g:1844:1: ( ( rule__WallObstacle__WallHeightAssignment_8 ) )
            {
            // InternalTankWar.g:1844:1: ( ( rule__WallObstacle__WallHeightAssignment_8 ) )
            // InternalTankWar.g:1845:2: ( rule__WallObstacle__WallHeightAssignment_8 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallHeightAssignment_8()); 
            // InternalTankWar.g:1846:2: ( rule__WallObstacle__WallHeightAssignment_8 )
            // InternalTankWar.g:1846:3: rule__WallObstacle__WallHeightAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__WallObstacle__WallHeightAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getWallObstacleAccess().getWallHeightAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__8__Impl"


    // $ANTLR start "rule__WallObstacle__Group__9"
    // InternalTankWar.g:1854:1: rule__WallObstacle__Group__9 : rule__WallObstacle__Group__9__Impl rule__WallObstacle__Group__10 ;
    public final void rule__WallObstacle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1858:1: ( rule__WallObstacle__Group__9__Impl rule__WallObstacle__Group__10 )
            // InternalTankWar.g:1859:2: rule__WallObstacle__Group__9__Impl rule__WallObstacle__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__WallObstacle__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__9"


    // $ANTLR start "rule__WallObstacle__Group__9__Impl"
    // InternalTankWar.g:1866:1: rule__WallObstacle__Group__9__Impl : ( 'wallPosX' ) ;
    public final void rule__WallObstacle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1870:1: ( ( 'wallPosX' ) )
            // InternalTankWar.g:1871:1: ( 'wallPosX' )
            {
            // InternalTankWar.g:1871:1: ( 'wallPosX' )
            // InternalTankWar.g:1872:2: 'wallPosX'
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosXKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getWallPosXKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__9__Impl"


    // $ANTLR start "rule__WallObstacle__Group__10"
    // InternalTankWar.g:1881:1: rule__WallObstacle__Group__10 : rule__WallObstacle__Group__10__Impl rule__WallObstacle__Group__11 ;
    public final void rule__WallObstacle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1885:1: ( rule__WallObstacle__Group__10__Impl rule__WallObstacle__Group__11 )
            // InternalTankWar.g:1886:2: rule__WallObstacle__Group__10__Impl rule__WallObstacle__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__WallObstacle__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__10"


    // $ANTLR start "rule__WallObstacle__Group__10__Impl"
    // InternalTankWar.g:1893:1: rule__WallObstacle__Group__10__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1897:1: ( ( '=' ) )
            // InternalTankWar.g:1898:1: ( '=' )
            {
            // InternalTankWar.g:1898:1: ( '=' )
            // InternalTankWar.g:1899:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__10__Impl"


    // $ANTLR start "rule__WallObstacle__Group__11"
    // InternalTankWar.g:1908:1: rule__WallObstacle__Group__11 : rule__WallObstacle__Group__11__Impl rule__WallObstacle__Group__12 ;
    public final void rule__WallObstacle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1912:1: ( rule__WallObstacle__Group__11__Impl rule__WallObstacle__Group__12 )
            // InternalTankWar.g:1913:2: rule__WallObstacle__Group__11__Impl rule__WallObstacle__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__WallObstacle__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__11"


    // $ANTLR start "rule__WallObstacle__Group__11__Impl"
    // InternalTankWar.g:1920:1: rule__WallObstacle__Group__11__Impl : ( ( rule__WallObstacle__WallPosXAssignment_11 ) ) ;
    public final void rule__WallObstacle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1924:1: ( ( ( rule__WallObstacle__WallPosXAssignment_11 ) ) )
            // InternalTankWar.g:1925:1: ( ( rule__WallObstacle__WallPosXAssignment_11 ) )
            {
            // InternalTankWar.g:1925:1: ( ( rule__WallObstacle__WallPosXAssignment_11 ) )
            // InternalTankWar.g:1926:2: ( rule__WallObstacle__WallPosXAssignment_11 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosXAssignment_11()); 
            // InternalTankWar.g:1927:2: ( rule__WallObstacle__WallPosXAssignment_11 )
            // InternalTankWar.g:1927:3: rule__WallObstacle__WallPosXAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__WallObstacle__WallPosXAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getWallObstacleAccess().getWallPosXAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__11__Impl"


    // $ANTLR start "rule__WallObstacle__Group__12"
    // InternalTankWar.g:1935:1: rule__WallObstacle__Group__12 : rule__WallObstacle__Group__12__Impl rule__WallObstacle__Group__13 ;
    public final void rule__WallObstacle__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1939:1: ( rule__WallObstacle__Group__12__Impl rule__WallObstacle__Group__13 )
            // InternalTankWar.g:1940:2: rule__WallObstacle__Group__12__Impl rule__WallObstacle__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__WallObstacle__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__12"


    // $ANTLR start "rule__WallObstacle__Group__12__Impl"
    // InternalTankWar.g:1947:1: rule__WallObstacle__Group__12__Impl : ( 'wallPosY' ) ;
    public final void rule__WallObstacle__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1951:1: ( ( 'wallPosY' ) )
            // InternalTankWar.g:1952:1: ( 'wallPosY' )
            {
            // InternalTankWar.g:1952:1: ( 'wallPosY' )
            // InternalTankWar.g:1953:2: 'wallPosY'
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosYKeyword_12()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getWallPosYKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__12__Impl"


    // $ANTLR start "rule__WallObstacle__Group__13"
    // InternalTankWar.g:1962:1: rule__WallObstacle__Group__13 : rule__WallObstacle__Group__13__Impl rule__WallObstacle__Group__14 ;
    public final void rule__WallObstacle__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1966:1: ( rule__WallObstacle__Group__13__Impl rule__WallObstacle__Group__14 )
            // InternalTankWar.g:1967:2: rule__WallObstacle__Group__13__Impl rule__WallObstacle__Group__14
            {
            pushFollow(FOLLOW_17);
            rule__WallObstacle__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__13"


    // $ANTLR start "rule__WallObstacle__Group__13__Impl"
    // InternalTankWar.g:1974:1: rule__WallObstacle__Group__13__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1978:1: ( ( '=' ) )
            // InternalTankWar.g:1979:1: ( '=' )
            {
            // InternalTankWar.g:1979:1: ( '=' )
            // InternalTankWar.g:1980:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__13__Impl"


    // $ANTLR start "rule__WallObstacle__Group__14"
    // InternalTankWar.g:1989:1: rule__WallObstacle__Group__14 : rule__WallObstacle__Group__14__Impl rule__WallObstacle__Group__15 ;
    public final void rule__WallObstacle__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1993:1: ( rule__WallObstacle__Group__14__Impl rule__WallObstacle__Group__15 )
            // InternalTankWar.g:1994:2: rule__WallObstacle__Group__14__Impl rule__WallObstacle__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__WallObstacle__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__14"


    // $ANTLR start "rule__WallObstacle__Group__14__Impl"
    // InternalTankWar.g:2001:1: rule__WallObstacle__Group__14__Impl : ( ( rule__WallObstacle__WallPosYAssignment_14 ) ) ;
    public final void rule__WallObstacle__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2005:1: ( ( ( rule__WallObstacle__WallPosYAssignment_14 ) ) )
            // InternalTankWar.g:2006:1: ( ( rule__WallObstacle__WallPosYAssignment_14 ) )
            {
            // InternalTankWar.g:2006:1: ( ( rule__WallObstacle__WallPosYAssignment_14 ) )
            // InternalTankWar.g:2007:2: ( rule__WallObstacle__WallPosYAssignment_14 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosYAssignment_14()); 
            // InternalTankWar.g:2008:2: ( rule__WallObstacle__WallPosYAssignment_14 )
            // InternalTankWar.g:2008:3: rule__WallObstacle__WallPosYAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__WallObstacle__WallPosYAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getWallObstacleAccess().getWallPosYAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__14__Impl"


    // $ANTLR start "rule__WallObstacle__Group__15"
    // InternalTankWar.g:2016:1: rule__WallObstacle__Group__15 : rule__WallObstacle__Group__15__Impl ;
    public final void rule__WallObstacle__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2020:1: ( rule__WallObstacle__Group__15__Impl )
            // InternalTankWar.g:2021:2: rule__WallObstacle__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WallObstacle__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__15"


    // $ANTLR start "rule__WallObstacle__Group__15__Impl"
    // InternalTankWar.g:2027:1: rule__WallObstacle__Group__15__Impl : ( '}' ) ;
    public final void rule__WallObstacle__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2031:1: ( ( '}' ) )
            // InternalTankWar.g:2032:1: ( '}' )
            {
            // InternalTankWar.g:2032:1: ( '}' )
            // InternalTankWar.g:2033:2: '}'
            {
             before(grammarAccess.getWallObstacleAccess().getRightCurlyBracketKeyword_15()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__Group__15__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__0"
    // InternalTankWar.g:2043:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2047:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // InternalTankWar.g:2048:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FieldSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__0"


    // $ANTLR start "rule__FieldSpecification__Group__0__Impl"
    // InternalTankWar.g:2055:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2059:1: ( ( 'field' ) )
            // InternalTankWar.g:2060:1: ( 'field' )
            {
            // InternalTankWar.g:2060:1: ( 'field' )
            // InternalTankWar.g:2061:2: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__0__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__1"
    // InternalTankWar.g:2070:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2074:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // InternalTankWar.g:2075:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FieldSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__1"


    // $ANTLR start "rule__FieldSpecification__Group__1__Impl"
    // InternalTankWar.g:2082:1: rule__FieldSpecification__Group__1__Impl : ( ( rule__FieldSpecification__NameAssignment_1 ) ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2086:1: ( ( ( rule__FieldSpecification__NameAssignment_1 ) ) )
            // InternalTankWar.g:2087:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            {
            // InternalTankWar.g:2087:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            // InternalTankWar.g:2088:2: ( rule__FieldSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:2089:2: ( rule__FieldSpecification__NameAssignment_1 )
            // InternalTankWar.g:2089:3: rule__FieldSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__1__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__2"
    // InternalTankWar.g:2097:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2101:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // InternalTankWar.g:2102:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__FieldSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__2"


    // $ANTLR start "rule__FieldSpecification__Group__2__Impl"
    // InternalTankWar.g:2109:1: rule__FieldSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2113:1: ( ( '{' ) )
            // InternalTankWar.g:2114:1: ( '{' )
            {
            // InternalTankWar.g:2114:1: ( '{' )
            // InternalTankWar.g:2115:2: '{'
            {
             before(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__2__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__3"
    // InternalTankWar.g:2124:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2128:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // InternalTankWar.g:2129:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__FieldSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__3"


    // $ANTLR start "rule__FieldSpecification__Group__3__Impl"
    // InternalTankWar.g:2136:1: rule__FieldSpecification__Group__3__Impl : ( 'enemyCount' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2140:1: ( ( 'enemyCount' ) )
            // InternalTankWar.g:2141:1: ( 'enemyCount' )
            {
            // InternalTankWar.g:2141:1: ( 'enemyCount' )
            // InternalTankWar.g:2142:2: 'enemyCount'
            {
             before(grammarAccess.getFieldSpecificationAccess().getEnemyCountKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getEnemyCountKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__3__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__4"
    // InternalTankWar.g:2151:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2155:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // InternalTankWar.g:2156:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__FieldSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__4"


    // $ANTLR start "rule__FieldSpecification__Group__4__Impl"
    // InternalTankWar.g:2163:1: rule__FieldSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2167:1: ( ( '=' ) )
            // InternalTankWar.g:2168:1: ( '=' )
            {
            // InternalTankWar.g:2168:1: ( '=' )
            // InternalTankWar.g:2169:2: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__4__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__5"
    // InternalTankWar.g:2178:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2182:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // InternalTankWar.g:2183:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__FieldSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__5"


    // $ANTLR start "rule__FieldSpecification__Group__5__Impl"
    // InternalTankWar.g:2190:1: rule__FieldSpecification__Group__5__Impl : ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2194:1: ( ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) ) )
            // InternalTankWar.g:2195:1: ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) )
            {
            // InternalTankWar.g:2195:1: ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) )
            // InternalTankWar.g:2196:2: ( rule__FieldSpecification__EnemyCountAssignment_5 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getEnemyCountAssignment_5()); 
            // InternalTankWar.g:2197:2: ( rule__FieldSpecification__EnemyCountAssignment_5 )
            // InternalTankWar.g:2197:3: rule__FieldSpecification__EnemyCountAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__EnemyCountAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getEnemyCountAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__5__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__6"
    // InternalTankWar.g:2205:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2209:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // InternalTankWar.g:2210:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__FieldSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__6"


    // $ANTLR start "rule__FieldSpecification__Group__6__Impl"
    // InternalTankWar.g:2217:1: rule__FieldSpecification__Group__6__Impl : ( ( rule__FieldSpecification__ObstacleAssignment_6 ) ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2221:1: ( ( ( rule__FieldSpecification__ObstacleAssignment_6 ) ) )
            // InternalTankWar.g:2222:1: ( ( rule__FieldSpecification__ObstacleAssignment_6 ) )
            {
            // InternalTankWar.g:2222:1: ( ( rule__FieldSpecification__ObstacleAssignment_6 ) )
            // InternalTankWar.g:2223:2: ( rule__FieldSpecification__ObstacleAssignment_6 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getObstacleAssignment_6()); 
            // InternalTankWar.g:2224:2: ( rule__FieldSpecification__ObstacleAssignment_6 )
            // InternalTankWar.g:2224:3: rule__FieldSpecification__ObstacleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__ObstacleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getObstacleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__6__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__7"
    // InternalTankWar.g:2232:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2236:1: ( rule__FieldSpecification__Group__7__Impl )
            // InternalTankWar.g:2237:2: rule__FieldSpecification__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__7"


    // $ANTLR start "rule__FieldSpecification__Group__7__Impl"
    // InternalTankWar.g:2243:1: rule__FieldSpecification__Group__7__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2247:1: ( ( '}' ) )
            // InternalTankWar.g:2248:1: ( '}' )
            {
            // InternalTankWar.g:2248:1: ( '}' )
            // InternalTankWar.g:2249:2: '}'
            {
             before(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__7__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__0"
    // InternalTankWar.g:2259:1: rule__LocalFieldInitialisations__Group__0 : rule__LocalFieldInitialisations__Group__0__Impl rule__LocalFieldInitialisations__Group__1 ;
    public final void rule__LocalFieldInitialisations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2263:1: ( rule__LocalFieldInitialisations__Group__0__Impl rule__LocalFieldInitialisations__Group__1 )
            // InternalTankWar.g:2264:2: rule__LocalFieldInitialisations__Group__0__Impl rule__LocalFieldInitialisations__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LocalFieldInitialisations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__0"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__0__Impl"
    // InternalTankWar.g:2271:1: rule__LocalFieldInitialisations__Group__0__Impl : ( 'init' ) ;
    public final void rule__LocalFieldInitialisations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2275:1: ( ( 'init' ) )
            // InternalTankWar.g:2276:1: ( 'init' )
            {
            // InternalTankWar.g:2276:1: ( 'init' )
            // InternalTankWar.g:2277:2: 'init'
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getInitKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLocalFieldInitialisationsAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__0__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__1"
    // InternalTankWar.g:2286:1: rule__LocalFieldInitialisations__Group__1 : rule__LocalFieldInitialisations__Group__1__Impl rule__LocalFieldInitialisations__Group__2 ;
    public final void rule__LocalFieldInitialisations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2290:1: ( rule__LocalFieldInitialisations__Group__1__Impl rule__LocalFieldInitialisations__Group__2 )
            // InternalTankWar.g:2291:2: rule__LocalFieldInitialisations__Group__1__Impl rule__LocalFieldInitialisations__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__LocalFieldInitialisations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__1"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__1__Impl"
    // InternalTankWar.g:2298:1: rule__LocalFieldInitialisations__Group__1__Impl : ( '{' ) ;
    public final void rule__LocalFieldInitialisations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2302:1: ( ( '{' ) )
            // InternalTankWar.g:2303:1: ( '{' )
            {
            // InternalTankWar.g:2303:1: ( '{' )
            // InternalTankWar.g:2304:2: '{'
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLocalFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__1__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__2"
    // InternalTankWar.g:2313:1: rule__LocalFieldInitialisations__Group__2 : rule__LocalFieldInitialisations__Group__2__Impl rule__LocalFieldInitialisations__Group__3 ;
    public final void rule__LocalFieldInitialisations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2317:1: ( rule__LocalFieldInitialisations__Group__2__Impl rule__LocalFieldInitialisations__Group__3 )
            // InternalTankWar.g:2318:2: rule__LocalFieldInitialisations__Group__2__Impl rule__LocalFieldInitialisations__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__LocalFieldInitialisations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__2"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__2__Impl"
    // InternalTankWar.g:2325:1: rule__LocalFieldInitialisations__Group__2__Impl : ( ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* ) ) ;
    public final void rule__LocalFieldInitialisations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2329:1: ( ( ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* ) ) )
            // InternalTankWar.g:2330:1: ( ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* ) )
            {
            // InternalTankWar.g:2330:1: ( ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* ) )
            // InternalTankWar.g:2331:2: ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* )
            {
            // InternalTankWar.g:2331:2: ( ( rule__LocalFieldInitialisations__Group_2__0 ) )
            // InternalTankWar.g:2332:3: ( rule__LocalFieldInitialisations__Group_2__0 )
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getGroup_2()); 
            // InternalTankWar.g:2333:3: ( rule__LocalFieldInitialisations__Group_2__0 )
            // InternalTankWar.g:2333:4: rule__LocalFieldInitialisations__Group_2__0
            {
            pushFollow(FOLLOW_28);
            rule__LocalFieldInitialisations__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalFieldInitialisationsAccess().getGroup_2()); 

            }

            // InternalTankWar.g:2336:2: ( ( rule__LocalFieldInitialisations__Group_2__0 )* )
            // InternalTankWar.g:2337:3: ( rule__LocalFieldInitialisations__Group_2__0 )*
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getGroup_2()); 
            // InternalTankWar.g:2338:3: ( rule__LocalFieldInitialisations__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34||LA8_0==37||LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTankWar.g:2338:4: rule__LocalFieldInitialisations__Group_2__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__LocalFieldInitialisations__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLocalFieldInitialisationsAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__2__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__3"
    // InternalTankWar.g:2347:1: rule__LocalFieldInitialisations__Group__3 : rule__LocalFieldInitialisations__Group__3__Impl ;
    public final void rule__LocalFieldInitialisations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2351:1: ( rule__LocalFieldInitialisations__Group__3__Impl )
            // InternalTankWar.g:2352:2: rule__LocalFieldInitialisations__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__3"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__3__Impl"
    // InternalTankWar.g:2358:1: rule__LocalFieldInitialisations__Group__3__Impl : ( '}' ) ;
    public final void rule__LocalFieldInitialisations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2362:1: ( ( '}' ) )
            // InternalTankWar.g:2363:1: ( '}' )
            {
            // InternalTankWar.g:2363:1: ( '}' )
            // InternalTankWar.g:2364:2: '}'
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLocalFieldInitialisationsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__3__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group_2__0"
    // InternalTankWar.g:2374:1: rule__LocalFieldInitialisations__Group_2__0 : rule__LocalFieldInitialisations__Group_2__0__Impl rule__LocalFieldInitialisations__Group_2__1 ;
    public final void rule__LocalFieldInitialisations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2378:1: ( rule__LocalFieldInitialisations__Group_2__0__Impl rule__LocalFieldInitialisations__Group_2__1 )
            // InternalTankWar.g:2379:2: rule__LocalFieldInitialisations__Group_2__0__Impl rule__LocalFieldInitialisations__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__LocalFieldInitialisations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group_2__0"


    // $ANTLR start "rule__LocalFieldInitialisations__Group_2__0__Impl"
    // InternalTankWar.g:2386:1: rule__LocalFieldInitialisations__Group_2__0__Impl : ( ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 ) ) ;
    public final void rule__LocalFieldInitialisations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2390:1: ( ( ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 ) ) )
            // InternalTankWar.g:2391:1: ( ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 ) )
            {
            // InternalTankWar.g:2391:1: ( ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 ) )
            // InternalTankWar.g:2392:2: ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 )
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsAssignment_2_0()); 
            // InternalTankWar.g:2393:2: ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 )
            // InternalTankWar.g:2393:3: rule__LocalFieldInitialisations__InitialisationsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__InitialisationsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group_2__0__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group_2__1"
    // InternalTankWar.g:2401:1: rule__LocalFieldInitialisations__Group_2__1 : rule__LocalFieldInitialisations__Group_2__1__Impl ;
    public final void rule__LocalFieldInitialisations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2405:1: ( rule__LocalFieldInitialisations__Group_2__1__Impl )
            // InternalTankWar.g:2406:2: rule__LocalFieldInitialisations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group_2__1"


    // $ANTLR start "rule__LocalFieldInitialisations__Group_2__1__Impl"
    // InternalTankWar.g:2412:1: rule__LocalFieldInitialisations__Group_2__1__Impl : ( ';' ) ;
    public final void rule__LocalFieldInitialisations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2416:1: ( ( ';' ) )
            // InternalTankWar.g:2417:1: ( ';' )
            {
            // InternalTankWar.g:2417:1: ( ';' )
            // InternalTankWar.g:2418:2: ';'
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getSemicolonKeyword_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLocalFieldInitialisationsAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group_2__1__Impl"


    // $ANTLR start "rule__DefaultInitialisation__Group__0"
    // InternalTankWar.g:2428:1: rule__DefaultInitialisation__Group__0 : rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 ;
    public final void rule__DefaultInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2432:1: ( rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 )
            // InternalTankWar.g:2433:2: rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__DefaultInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultInitialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__0"


    // $ANTLR start "rule__DefaultInitialisation__Group__0__Impl"
    // InternalTankWar.g:2440:1: rule__DefaultInitialisation__Group__0__Impl : ( 'default' ) ;
    public final void rule__DefaultInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2444:1: ( ( 'default' ) )
            // InternalTankWar.g:2445:1: ( 'default' )
            {
            // InternalTankWar.g:2445:1: ( 'default' )
            // InternalTankWar.g:2446:2: 'default'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__0__Impl"


    // $ANTLR start "rule__DefaultInitialisation__Group__1"
    // InternalTankWar.g:2455:1: rule__DefaultInitialisation__Group__1 : rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 ;
    public final void rule__DefaultInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2459:1: ( rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 )
            // InternalTankWar.g:2460:2: rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__DefaultInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultInitialisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__1"


    // $ANTLR start "rule__DefaultInitialisation__Group__1__Impl"
    // InternalTankWar.g:2467:1: rule__DefaultInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__DefaultInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2471:1: ( ( ':' ) )
            // InternalTankWar.g:2472:1: ( ':' )
            {
            // InternalTankWar.g:2472:1: ( ':' )
            // InternalTankWar.g:2473:2: ':'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__1__Impl"


    // $ANTLR start "rule__DefaultInitialisation__Group__2"
    // InternalTankWar.g:2482:1: rule__DefaultInitialisation__Group__2 : rule__DefaultInitialisation__Group__2__Impl ;
    public final void rule__DefaultInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2486:1: ( rule__DefaultInitialisation__Group__2__Impl )
            // InternalTankWar.g:2487:2: rule__DefaultInitialisation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInitialisation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__2"


    // $ANTLR start "rule__DefaultInitialisation__Group__2__Impl"
    // InternalTankWar.g:2493:1: rule__DefaultInitialisation__Group__2__Impl : ( 'defaultInitialisation' ) ;
    public final void rule__DefaultInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2497:1: ( ( 'defaultInitialisation' ) )
            // InternalTankWar.g:2498:1: ( 'defaultInitialisation' )
            {
            // InternalTankWar.g:2498:1: ( 'defaultInitialisation' )
            // InternalTankWar.g:2499:2: 'defaultInitialisation'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getDefaultInitialisationKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDefaultInitialisationAccess().getDefaultInitialisationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__2__Impl"


    // $ANTLR start "rule__RandomInitialisation__Group__0"
    // InternalTankWar.g:2509:1: rule__RandomInitialisation__Group__0 : rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 ;
    public final void rule__RandomInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2513:1: ( rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 )
            // InternalTankWar.g:2514:2: rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__RandomInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RandomInitialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__0"


    // $ANTLR start "rule__RandomInitialisation__Group__0__Impl"
    // InternalTankWar.g:2521:1: rule__RandomInitialisation__Group__0__Impl : ( 'random' ) ;
    public final void rule__RandomInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2525:1: ( ( 'random' ) )
            // InternalTankWar.g:2526:1: ( 'random' )
            {
            // InternalTankWar.g:2526:1: ( 'random' )
            // InternalTankWar.g:2527:2: 'random'
            {
             before(grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__0__Impl"


    // $ANTLR start "rule__RandomInitialisation__Group__1"
    // InternalTankWar.g:2536:1: rule__RandomInitialisation__Group__1 : rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 ;
    public final void rule__RandomInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2540:1: ( rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 )
            // InternalTankWar.g:2541:2: rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__RandomInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RandomInitialisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__1"


    // $ANTLR start "rule__RandomInitialisation__Group__1__Impl"
    // InternalTankWar.g:2548:1: rule__RandomInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__RandomInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2552:1: ( ( ':' ) )
            // InternalTankWar.g:2553:1: ( ':' )
            {
            // InternalTankWar.g:2553:1: ( ':' )
            // InternalTankWar.g:2554:2: ':'
            {
             before(grammarAccess.getRandomInitialisationAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRandomInitialisationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__1__Impl"


    // $ANTLR start "rule__RandomInitialisation__Group__2"
    // InternalTankWar.g:2563:1: rule__RandomInitialisation__Group__2 : rule__RandomInitialisation__Group__2__Impl ;
    public final void rule__RandomInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2567:1: ( rule__RandomInitialisation__Group__2__Impl )
            // InternalTankWar.g:2568:2: rule__RandomInitialisation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RandomInitialisation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__2"


    // $ANTLR start "rule__RandomInitialisation__Group__2__Impl"
    // InternalTankWar.g:2574:1: rule__RandomInitialisation__Group__2__Impl : ( 'randomInitialisation' ) ;
    public final void rule__RandomInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2578:1: ( ( 'randomInitialisation' ) )
            // InternalTankWar.g:2579:1: ( 'randomInitialisation' )
            {
            // InternalTankWar.g:2579:1: ( 'randomInitialisation' )
            // InternalTankWar.g:2580:2: 'randomInitialisation'
            {
             before(grammarAccess.getRandomInitialisationAccess().getRandomInitialisationKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRandomInitialisationAccess().getRandomInitialisationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__2__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__0"
    // InternalTankWar.g:2590:1: rule__ContextInitialisation__Group__0 : rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 ;
    public final void rule__ContextInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2594:1: ( rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 )
            // InternalTankWar.g:2595:2: rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ContextInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextInitialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__0"


    // $ANTLR start "rule__ContextInitialisation__Group__0__Impl"
    // InternalTankWar.g:2602:1: rule__ContextInitialisation__Group__0__Impl : ( 'context' ) ;
    public final void rule__ContextInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2606:1: ( ( 'context' ) )
            // InternalTankWar.g:2607:1: ( 'context' )
            {
            // InternalTankWar.g:2607:1: ( 'context' )
            // InternalTankWar.g:2608:2: 'context'
            {
             before(grammarAccess.getContextInitialisationAccess().getContextKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getContextInitialisationAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__0__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__1"
    // InternalTankWar.g:2617:1: rule__ContextInitialisation__Group__1 : rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 ;
    public final void rule__ContextInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2621:1: ( rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 )
            // InternalTankWar.g:2622:2: rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ContextInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextInitialisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__1"


    // $ANTLR start "rule__ContextInitialisation__Group__1__Impl"
    // InternalTankWar.g:2629:1: rule__ContextInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__ContextInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2633:1: ( ( ':' ) )
            // InternalTankWar.g:2634:1: ( ':' )
            {
            // InternalTankWar.g:2634:1: ( ':' )
            // InternalTankWar.g:2635:2: ':'
            {
             before(grammarAccess.getContextInitialisationAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getContextInitialisationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__1__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__2"
    // InternalTankWar.g:2644:1: rule__ContextInitialisation__Group__2 : rule__ContextInitialisation__Group__2__Impl ;
    public final void rule__ContextInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2648:1: ( rule__ContextInitialisation__Group__2__Impl )
            // InternalTankWar.g:2649:2: rule__ContextInitialisation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextInitialisation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__2"


    // $ANTLR start "rule__ContextInitialisation__Group__2__Impl"
    // InternalTankWar.g:2655:1: rule__ContextInitialisation__Group__2__Impl : ( 'contextInitialisation' ) ;
    public final void rule__ContextInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2659:1: ( ( 'contextInitialisation' ) )
            // InternalTankWar.g:2660:1: ( 'contextInitialisation' )
            {
            // InternalTankWar.g:2660:1: ( 'contextInitialisation' )
            // InternalTankWar.g:2661:2: 'contextInitialisation'
            {
             before(grammarAccess.getContextInitialisationAccess().getContextInitialisationKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getContextInitialisationAccess().getContextInitialisationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__2__Impl"


    // $ANTLR start "rule__SuperModeDeclaration__Group__0"
    // InternalTankWar.g:2671:1: rule__SuperModeDeclaration__Group__0 : rule__SuperModeDeclaration__Group__0__Impl rule__SuperModeDeclaration__Group__1 ;
    public final void rule__SuperModeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2675:1: ( rule__SuperModeDeclaration__Group__0__Impl rule__SuperModeDeclaration__Group__1 )
            // InternalTankWar.g:2676:2: rule__SuperModeDeclaration__Group__0__Impl rule__SuperModeDeclaration__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__SuperModeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperModeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperModeDeclaration__Group__0"


    // $ANTLR start "rule__SuperModeDeclaration__Group__0__Impl"
    // InternalTankWar.g:2683:1: rule__SuperModeDeclaration__Group__0__Impl : ( 'superMode' ) ;
    public final void rule__SuperModeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2687:1: ( ( 'superMode' ) )
            // InternalTankWar.g:2688:1: ( 'superMode' )
            {
            // InternalTankWar.g:2688:1: ( 'superMode' )
            // InternalTankWar.g:2689:2: 'superMode'
            {
             before(grammarAccess.getSuperModeDeclarationAccess().getSuperModeKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSuperModeDeclarationAccess().getSuperModeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperModeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SuperModeDeclaration__Group__1"
    // InternalTankWar.g:2698:1: rule__SuperModeDeclaration__Group__1 : rule__SuperModeDeclaration__Group__1__Impl ;
    public final void rule__SuperModeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2702:1: ( rule__SuperModeDeclaration__Group__1__Impl )
            // InternalTankWar.g:2703:2: rule__SuperModeDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperModeDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperModeDeclaration__Group__1"


    // $ANTLR start "rule__SuperModeDeclaration__Group__1__Impl"
    // InternalTankWar.g:2709:1: rule__SuperModeDeclaration__Group__1__Impl : ( () ) ;
    public final void rule__SuperModeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2713:1: ( ( () ) )
            // InternalTankWar.g:2714:1: ( () )
            {
            // InternalTankWar.g:2714:1: ( () )
            // InternalTankWar.g:2715:2: ()
            {
             before(grammarAccess.getSuperModeDeclarationAccess().getSuperModeDeclarationAction_1()); 
            // InternalTankWar.g:2716:2: ()
            // InternalTankWar.g:2716:3: 
            {
            }

             after(grammarAccess.getSuperModeDeclarationAccess().getSuperModeDeclarationAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperModeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StartFieldDeclaration__Group__0"
    // InternalTankWar.g:2725:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2729:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // InternalTankWar.g:2730:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__StartFieldDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__0"


    // $ANTLR start "rule__StartFieldDeclaration__Group__0__Impl"
    // InternalTankWar.g:2737:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2741:1: ( ( 'start' ) )
            // InternalTankWar.g:2742:1: ( 'start' )
            {
            // InternalTankWar.g:2742:1: ( 'start' )
            // InternalTankWar.g:2743:2: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StartFieldDeclaration__Group__1"
    // InternalTankWar.g:2752:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2756:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // InternalTankWar.g:2757:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__StartFieldDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__1"


    // $ANTLR start "rule__StartFieldDeclaration__Group__1__Impl"
    // InternalTankWar.g:2764:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2768:1: ( ( '=' ) )
            // InternalTankWar.g:2769:1: ( '=' )
            {
            // InternalTankWar.g:2769:1: ( '=' )
            // InternalTankWar.g:2770:2: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StartFieldDeclaration__Group__2"
    // InternalTankWar.g:2779:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2783:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // InternalTankWar.g:2784:2: rule__StartFieldDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__2"


    // $ANTLR start "rule__StartFieldDeclaration__Group__2__Impl"
    // InternalTankWar.g:2790:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2794:1: ( ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) )
            // InternalTankWar.g:2795:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            {
            // InternalTankWar.g:2795:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            // InternalTankWar.g:2796:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 
            // InternalTankWar.g:2797:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            // InternalTankWar.g:2797:3: rule__StartFieldDeclaration__FieldAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__FieldAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__2__Impl"


    // $ANTLR start "rule__AllowRestartMenu__Group__0"
    // InternalTankWar.g:2806:1: rule__AllowRestartMenu__Group__0 : rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 ;
    public final void rule__AllowRestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2810:1: ( rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 )
            // InternalTankWar.g:2811:2: rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__AllowRestartMenu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllowRestartMenu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowRestartMenu__Group__0"


    // $ANTLR start "rule__AllowRestartMenu__Group__0__Impl"
    // InternalTankWar.g:2818:1: rule__AllowRestartMenu__Group__0__Impl : ( 'allowRestart' ) ;
    public final void rule__AllowRestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2822:1: ( ( 'allowRestart' ) )
            // InternalTankWar.g:2823:1: ( 'allowRestart' )
            {
            // InternalTankWar.g:2823:1: ( 'allowRestart' )
            // InternalTankWar.g:2824:2: 'allowRestart'
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAllowRestartMenuAccess().getAllowRestartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowRestartMenu__Group__0__Impl"


    // $ANTLR start "rule__AllowRestartMenu__Group__1"
    // InternalTankWar.g:2833:1: rule__AllowRestartMenu__Group__1 : rule__AllowRestartMenu__Group__1__Impl ;
    public final void rule__AllowRestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2837:1: ( rule__AllowRestartMenu__Group__1__Impl )
            // InternalTankWar.g:2838:2: rule__AllowRestartMenu__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllowRestartMenu__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowRestartMenu__Group__1"


    // $ANTLR start "rule__AllowRestartMenu__Group__1__Impl"
    // InternalTankWar.g:2844:1: rule__AllowRestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__AllowRestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2848:1: ( ( () ) )
            // InternalTankWar.g:2849:1: ( () )
            {
            // InternalTankWar.g:2849:1: ( () )
            // InternalTankWar.g:2850:2: ()
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 
            // InternalTankWar.g:2851:2: ()
            // InternalTankWar.g:2851:3: 
            {
            }

             after(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowRestartMenu__Group__1__Impl"


    // $ANTLR start "rule__TankWarGame__NameAssignment_1"
    // InternalTankWar.g:2860:1: rule__TankWarGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TankWarGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2864:1: ( ( RULE_ID ) )
            // InternalTankWar.g:2865:2: ( RULE_ID )
            {
            // InternalTankWar.g:2865:2: ( RULE_ID )
            // InternalTankWar.g:2866:3: RULE_ID
            {
             before(grammarAccess.getTankWarGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTankWarGameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__NameAssignment_1"


    // $ANTLR start "rule__TankWarGame__ScreenAssignment_3"
    // InternalTankWar.g:2875:1: rule__TankWarGame__ScreenAssignment_3 : ( ruleScreenSpecification ) ;
    public final void rule__TankWarGame__ScreenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2879:1: ( ( ruleScreenSpecification ) )
            // InternalTankWar.g:2880:2: ( ruleScreenSpecification )
            {
            // InternalTankWar.g:2880:2: ( ruleScreenSpecification )
            // InternalTankWar.g:2881:3: ruleScreenSpecification
            {
             before(grammarAccess.getTankWarGameAccess().getScreenScreenSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScreenSpecification();

            state._fsp--;

             after(grammarAccess.getTankWarGameAccess().getScreenScreenSpecificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__ScreenAssignment_3"


    // $ANTLR start "rule__TankWarGame__FieldsAssignment_4"
    // InternalTankWar.g:2890:1: rule__TankWarGame__FieldsAssignment_4 : ( ruleFieldSpecification ) ;
    public final void rule__TankWarGame__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2894:1: ( ( ruleFieldSpecification ) )
            // InternalTankWar.g:2895:2: ( ruleFieldSpecification )
            {
            // InternalTankWar.g:2895:2: ( ruleFieldSpecification )
            // InternalTankWar.g:2896:3: ruleFieldSpecification
            {
             before(grammarAccess.getTankWarGameAccess().getFieldsFieldSpecificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getTankWarGameAccess().getFieldsFieldSpecificationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__FieldsAssignment_4"


    // $ANTLR start "rule__TankWarGame__OptionsAssignment_5"
    // InternalTankWar.g:2905:1: rule__TankWarGame__OptionsAssignment_5 : ( ruleOptionSpecification ) ;
    public final void rule__TankWarGame__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2909:1: ( ( ruleOptionSpecification ) )
            // InternalTankWar.g:2910:2: ( ruleOptionSpecification )
            {
            // InternalTankWar.g:2910:2: ( ruleOptionSpecification )
            // InternalTankWar.g:2911:3: ruleOptionSpecification
            {
             before(grammarAccess.getTankWarGameAccess().getOptionsOptionSpecificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getTankWarGameAccess().getOptionsOptionSpecificationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TankWarGame__OptionsAssignment_5"


    // $ANTLR start "rule__EndGameBehaviour__WinAssignment_2"
    // InternalTankWar.g:2920:1: rule__EndGameBehaviour__WinAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EndGameBehaviour__WinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2924:1: ( ( RULE_STRING ) )
            // InternalTankWar.g:2925:2: ( RULE_STRING )
            {
            // InternalTankWar.g:2925:2: ( RULE_STRING )
            // InternalTankWar.g:2926:3: RULE_STRING
            {
             before(grammarAccess.getEndGameBehaviourAccess().getWinSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getWinSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__WinAssignment_2"


    // $ANTLR start "rule__EndGameBehaviour__LostAssignment_4"
    // InternalTankWar.g:2935:1: rule__EndGameBehaviour__LostAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EndGameBehaviour__LostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2939:1: ( ( RULE_STRING ) )
            // InternalTankWar.g:2940:2: ( RULE_STRING )
            {
            // InternalTankWar.g:2940:2: ( RULE_STRING )
            // InternalTankWar.g:2941:3: RULE_STRING
            {
             before(grammarAccess.getEndGameBehaviourAccess().getLostSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getLostSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__LostAssignment_4"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalTankWar.g:2950:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2954:1: ( ( RULE_STRING ) )
            // InternalTankWar.g:2955:2: ( RULE_STRING )
            {
            // InternalTankWar.g:2955:2: ( RULE_STRING )
            // InternalTankWar.g:2956:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // InternalTankWar.g:2965:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2969:1: ( ( RULE_INT ) )
            // InternalTankWar.g:2970:2: ( RULE_INT )
            {
            // InternalTankWar.g:2970:2: ( RULE_INT )
            // InternalTankWar.g:2971:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__ScreenSpecification__NameAssignment_1"
    // InternalTankWar.g:2980:1: rule__ScreenSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScreenSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2984:1: ( ( RULE_ID ) )
            // InternalTankWar.g:2985:2: ( RULE_ID )
            {
            // InternalTankWar.g:2985:2: ( RULE_ID )
            // InternalTankWar.g:2986:3: RULE_ID
            {
             before(grammarAccess.getScreenSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__NameAssignment_1"


    // $ANTLR start "rule__ScreenSpecification__ScreenWidthAssignment_5"
    // InternalTankWar.g:2995:1: rule__ScreenSpecification__ScreenWidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__ScreenSpecification__ScreenWidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2999:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3000:2: ( RULE_INT )
            {
            // InternalTankWar.g:3000:2: ( RULE_INT )
            // InternalTankWar.g:3001:3: RULE_INT
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getScreenWidthINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__ScreenWidthAssignment_5"


    // $ANTLR start "rule__ScreenSpecification__ScreenHeightAssignment_8"
    // InternalTankWar.g:3010:1: rule__ScreenSpecification__ScreenHeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__ScreenSpecification__ScreenHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3014:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3015:2: ( RULE_INT )
            {
            // InternalTankWar.g:3015:2: ( RULE_INT )
            // InternalTankWar.g:3016:3: RULE_INT
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenHeightINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScreenSpecificationAccess().getScreenHeightINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSpecification__ScreenHeightAssignment_8"


    // $ANTLR start "rule__Obstaclepecification__NameAssignment_1"
    // InternalTankWar.g:3025:1: rule__Obstaclepecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Obstaclepecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3029:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3030:2: ( RULE_ID )
            {
            // InternalTankWar.g:3030:2: ( RULE_ID )
            // InternalTankWar.g:3031:3: RULE_ID
            {
             before(grammarAccess.getObstaclepecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObstaclepecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__NameAssignment_1"


    // $ANTLR start "rule__Obstaclepecification__FieldsAssignment_3"
    // InternalTankWar.g:3040:1: rule__Obstaclepecification__FieldsAssignment_3 : ( ruleObstacleMember ) ;
    public final void rule__Obstaclepecification__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3044:1: ( ( ruleObstacleMember ) )
            // InternalTankWar.g:3045:2: ( ruleObstacleMember )
            {
            // InternalTankWar.g:3045:2: ( ruleObstacleMember )
            // InternalTankWar.g:3046:3: ruleObstacleMember
            {
             before(grammarAccess.getObstaclepecificationAccess().getFieldsObstacleMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObstacleMember();

            state._fsp--;

             after(grammarAccess.getObstaclepecificationAccess().getFieldsObstacleMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstaclepecification__FieldsAssignment_3"


    // $ANTLR start "rule__WaterObstacle__NameAssignment_1"
    // InternalTankWar.g:3055:1: rule__WaterObstacle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WaterObstacle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3059:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3060:2: ( RULE_ID )
            {
            // InternalTankWar.g:3060:2: ( RULE_ID )
            // InternalTankWar.g:3061:3: RULE_ID
            {
             before(grammarAccess.getWaterObstacleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWaterObstacleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaterObstacle__NameAssignment_1"


    // $ANTLR start "rule__WallObstacle__NameAssignment_1"
    // InternalTankWar.g:3070:1: rule__WallObstacle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WallObstacle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3074:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3075:2: ( RULE_ID )
            {
            // InternalTankWar.g:3075:2: ( RULE_ID )
            // InternalTankWar.g:3076:3: RULE_ID
            {
             before(grammarAccess.getWallObstacleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__NameAssignment_1"


    // $ANTLR start "rule__WallObstacle__WallWidthAssignment_5"
    // InternalTankWar.g:3085:1: rule__WallObstacle__WallWidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallWidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3089:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3090:2: ( RULE_INT )
            {
            // InternalTankWar.g:3090:2: ( RULE_INT )
            // InternalTankWar.g:3091:3: RULE_INT
            {
             before(grammarAccess.getWallObstacleAccess().getWallWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getWallWidthINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__WallWidthAssignment_5"


    // $ANTLR start "rule__WallObstacle__WallHeightAssignment_8"
    // InternalTankWar.g:3100:1: rule__WallObstacle__WallHeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3104:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3105:2: ( RULE_INT )
            {
            // InternalTankWar.g:3105:2: ( RULE_INT )
            // InternalTankWar.g:3106:3: RULE_INT
            {
             before(grammarAccess.getWallObstacleAccess().getWallHeightINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getWallHeightINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__WallHeightAssignment_8"


    // $ANTLR start "rule__WallObstacle__WallPosXAssignment_11"
    // InternalTankWar.g:3115:1: rule__WallObstacle__WallPosXAssignment_11 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallPosXAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3119:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3120:2: ( RULE_INT )
            {
            // InternalTankWar.g:3120:2: ( RULE_INT )
            // InternalTankWar.g:3121:3: RULE_INT
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosXINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getWallPosXINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__WallPosXAssignment_11"


    // $ANTLR start "rule__WallObstacle__WallPosYAssignment_14"
    // InternalTankWar.g:3130:1: rule__WallObstacle__WallPosYAssignment_14 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallPosYAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3134:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3135:2: ( RULE_INT )
            {
            // InternalTankWar.g:3135:2: ( RULE_INT )
            // InternalTankWar.g:3136:3: RULE_INT
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosYINTTerminalRuleCall_14_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWallObstacleAccess().getWallPosYINTTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallObstacle__WallPosYAssignment_14"


    // $ANTLR start "rule__FieldSpecification__NameAssignment_1"
    // InternalTankWar.g:3145:1: rule__FieldSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3149:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3150:2: ( RULE_ID )
            {
            // InternalTankWar.g:3150:2: ( RULE_ID )
            // InternalTankWar.g:3151:3: RULE_ID
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__NameAssignment_1"


    // $ANTLR start "rule__FieldSpecification__EnemyCountAssignment_5"
    // InternalTankWar.g:3160:1: rule__FieldSpecification__EnemyCountAssignment_5 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__EnemyCountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3164:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3165:2: ( RULE_INT )
            {
            // InternalTankWar.g:3165:2: ( RULE_INT )
            // InternalTankWar.g:3166:3: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getEnemyCountINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getEnemyCountINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__EnemyCountAssignment_5"


    // $ANTLR start "rule__FieldSpecification__ObstacleAssignment_6"
    // InternalTankWar.g:3175:1: rule__FieldSpecification__ObstacleAssignment_6 : ( ruleObstaclepecification ) ;
    public final void rule__FieldSpecification__ObstacleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3179:1: ( ( ruleObstaclepecification ) )
            // InternalTankWar.g:3180:2: ( ruleObstaclepecification )
            {
            // InternalTankWar.g:3180:2: ( ruleObstaclepecification )
            // InternalTankWar.g:3181:3: ruleObstaclepecification
            {
             before(grammarAccess.getFieldSpecificationAccess().getObstacleObstaclepecificationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleObstaclepecification();

            state._fsp--;

             after(grammarAccess.getFieldSpecificationAccess().getObstacleObstaclepecificationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__ObstacleAssignment_6"


    // $ANTLR start "rule__LocalFieldInitialisations__InitialisationsAssignment_2_0"
    // InternalTankWar.g:3190:1: rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 : ( ruleFieldInitialisation ) ;
    public final void rule__LocalFieldInitialisations__InitialisationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3194:1: ( ( ruleFieldInitialisation ) )
            // InternalTankWar.g:3195:2: ( ruleFieldInitialisation )
            {
            // InternalTankWar.g:3195:2: ( ruleFieldInitialisation )
            // InternalTankWar.g:3196:3: ruleFieldInitialisation
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__InitialisationsAssignment_2_0"


    // $ANTLR start "rule__StartFieldDeclaration__FieldAssignment_2"
    // InternalTankWar.g:3205:1: rule__StartFieldDeclaration__FieldAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartFieldDeclaration__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3209:1: ( ( ( RULE_ID ) ) )
            // InternalTankWar.g:3210:2: ( ( RULE_ID ) )
            {
            // InternalTankWar.g:3210:2: ( ( RULE_ID ) )
            // InternalTankWar.g:3211:3: ( RULE_ID )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 
            // InternalTankWar.g:3212:3: ( RULE_ID )
            // InternalTankWar.g:3213:4: RULE_ID
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__FieldAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000E0000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000E0000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000A400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000A400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});

}