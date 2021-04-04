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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'game'", "'{'", "'}'", "'end-game'", "'('", "','", "')'", "'screen'", "'screenWidth'", "'='", "'screenHeight'", "'obstacle'", "'water'", "'wall'", "'wallWidth'", "'wallHeight'", "'wallPosX'", "'wallPosY'", "'field'", "'enemyCount'", "'nextLevel'", "'goto'", "'superMode'", "'start'", "'allowRestart'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
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


    // $ANTLR start "entryRuleEndGameBehaviour"
    // InternalTankWar.g:78:1: entryRuleEndGameBehaviour : ruleEndGameBehaviour EOF ;
    public final void entryRuleEndGameBehaviour() throws RecognitionException {
        try {
            // InternalTankWar.g:79:1: ( ruleEndGameBehaviour EOF )
            // InternalTankWar.g:80:1: ruleEndGameBehaviour EOF
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
    // InternalTankWar.g:87:1: ruleEndGameBehaviour : ( ( rule__EndGameBehaviour__Group__0 ) ) ;
    public final void ruleEndGameBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:91:2: ( ( ( rule__EndGameBehaviour__Group__0 ) ) )
            // InternalTankWar.g:92:2: ( ( rule__EndGameBehaviour__Group__0 ) )
            {
            // InternalTankWar.g:92:2: ( ( rule__EndGameBehaviour__Group__0 ) )
            // InternalTankWar.g:93:3: ( rule__EndGameBehaviour__Group__0 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getGroup()); 
            // InternalTankWar.g:94:3: ( rule__EndGameBehaviour__Group__0 )
            // InternalTankWar.g:94:4: rule__EndGameBehaviour__Group__0
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


    // $ANTLR start "entryRuleScreenSpecification"
    // InternalTankWar.g:103:1: entryRuleScreenSpecification : ruleScreenSpecification EOF ;
    public final void entryRuleScreenSpecification() throws RecognitionException {
        try {
            // InternalTankWar.g:104:1: ( ruleScreenSpecification EOF )
            // InternalTankWar.g:105:1: ruleScreenSpecification EOF
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
    // InternalTankWar.g:112:1: ruleScreenSpecification : ( ( rule__ScreenSpecification__Group__0 ) ) ;
    public final void ruleScreenSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:116:2: ( ( ( rule__ScreenSpecification__Group__0 ) ) )
            // InternalTankWar.g:117:2: ( ( rule__ScreenSpecification__Group__0 ) )
            {
            // InternalTankWar.g:117:2: ( ( rule__ScreenSpecification__Group__0 ) )
            // InternalTankWar.g:118:3: ( rule__ScreenSpecification__Group__0 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getGroup()); 
            // InternalTankWar.g:119:3: ( rule__ScreenSpecification__Group__0 )
            // InternalTankWar.g:119:4: rule__ScreenSpecification__Group__0
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
    // InternalTankWar.g:128:1: entryRuleObstaclepecification : ruleObstaclepecification EOF ;
    public final void entryRuleObstaclepecification() throws RecognitionException {
        try {
            // InternalTankWar.g:129:1: ( ruleObstaclepecification EOF )
            // InternalTankWar.g:130:1: ruleObstaclepecification EOF
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
    // InternalTankWar.g:137:1: ruleObstaclepecification : ( ( rule__Obstaclepecification__Group__0 ) ) ;
    public final void ruleObstaclepecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:141:2: ( ( ( rule__Obstaclepecification__Group__0 ) ) )
            // InternalTankWar.g:142:2: ( ( rule__Obstaclepecification__Group__0 ) )
            {
            // InternalTankWar.g:142:2: ( ( rule__Obstaclepecification__Group__0 ) )
            // InternalTankWar.g:143:3: ( rule__Obstaclepecification__Group__0 )
            {
             before(grammarAccess.getObstaclepecificationAccess().getGroup()); 
            // InternalTankWar.g:144:3: ( rule__Obstaclepecification__Group__0 )
            // InternalTankWar.g:144:4: rule__Obstaclepecification__Group__0
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
    // InternalTankWar.g:153:1: entryRuleObstacleMember : ruleObstacleMember EOF ;
    public final void entryRuleObstacleMember() throws RecognitionException {
        try {
            // InternalTankWar.g:154:1: ( ruleObstacleMember EOF )
            // InternalTankWar.g:155:1: ruleObstacleMember EOF
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
    // InternalTankWar.g:162:1: ruleObstacleMember : ( ( rule__ObstacleMember__Alternatives ) ) ;
    public final void ruleObstacleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:166:2: ( ( ( rule__ObstacleMember__Alternatives ) ) )
            // InternalTankWar.g:167:2: ( ( rule__ObstacleMember__Alternatives ) )
            {
            // InternalTankWar.g:167:2: ( ( rule__ObstacleMember__Alternatives ) )
            // InternalTankWar.g:168:3: ( rule__ObstacleMember__Alternatives )
            {
             before(grammarAccess.getObstacleMemberAccess().getAlternatives()); 
            // InternalTankWar.g:169:3: ( rule__ObstacleMember__Alternatives )
            // InternalTankWar.g:169:4: rule__ObstacleMember__Alternatives
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
    // InternalTankWar.g:178:1: entryRuleWaterObstacle : ruleWaterObstacle EOF ;
    public final void entryRuleWaterObstacle() throws RecognitionException {
        try {
            // InternalTankWar.g:179:1: ( ruleWaterObstacle EOF )
            // InternalTankWar.g:180:1: ruleWaterObstacle EOF
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
    // InternalTankWar.g:187:1: ruleWaterObstacle : ( ( rule__WaterObstacle__Group__0 ) ) ;
    public final void ruleWaterObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:191:2: ( ( ( rule__WaterObstacle__Group__0 ) ) )
            // InternalTankWar.g:192:2: ( ( rule__WaterObstacle__Group__0 ) )
            {
            // InternalTankWar.g:192:2: ( ( rule__WaterObstacle__Group__0 ) )
            // InternalTankWar.g:193:3: ( rule__WaterObstacle__Group__0 )
            {
             before(grammarAccess.getWaterObstacleAccess().getGroup()); 
            // InternalTankWar.g:194:3: ( rule__WaterObstacle__Group__0 )
            // InternalTankWar.g:194:4: rule__WaterObstacle__Group__0
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
    // InternalTankWar.g:203:1: entryRuleWallObstacle : ruleWallObstacle EOF ;
    public final void entryRuleWallObstacle() throws RecognitionException {
        try {
            // InternalTankWar.g:204:1: ( ruleWallObstacle EOF )
            // InternalTankWar.g:205:1: ruleWallObstacle EOF
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
    // InternalTankWar.g:212:1: ruleWallObstacle : ( ( rule__WallObstacle__Group__0 ) ) ;
    public final void ruleWallObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:216:2: ( ( ( rule__WallObstacle__Group__0 ) ) )
            // InternalTankWar.g:217:2: ( ( rule__WallObstacle__Group__0 ) )
            {
            // InternalTankWar.g:217:2: ( ( rule__WallObstacle__Group__0 ) )
            // InternalTankWar.g:218:3: ( rule__WallObstacle__Group__0 )
            {
             before(grammarAccess.getWallObstacleAccess().getGroup()); 
            // InternalTankWar.g:219:3: ( rule__WallObstacle__Group__0 )
            // InternalTankWar.g:219:4: rule__WallObstacle__Group__0
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
    // InternalTankWar.g:228:1: entryRuleFieldSpecification : ruleFieldSpecification EOF ;
    public final void entryRuleFieldSpecification() throws RecognitionException {
        try {
            // InternalTankWar.g:229:1: ( ruleFieldSpecification EOF )
            // InternalTankWar.g:230:1: ruleFieldSpecification EOF
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
    // InternalTankWar.g:237:1: ruleFieldSpecification : ( ( rule__FieldSpecification__Group__0 ) ) ;
    public final void ruleFieldSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:241:2: ( ( ( rule__FieldSpecification__Group__0 ) ) )
            // InternalTankWar.g:242:2: ( ( rule__FieldSpecification__Group__0 ) )
            {
            // InternalTankWar.g:242:2: ( ( rule__FieldSpecification__Group__0 ) )
            // InternalTankWar.g:243:3: ( rule__FieldSpecification__Group__0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getGroup()); 
            // InternalTankWar.g:244:3: ( rule__FieldSpecification__Group__0 )
            // InternalTankWar.g:244:4: rule__FieldSpecification__Group__0
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


    // $ANTLR start "entryRuleOptionSpecification"
    // InternalTankWar.g:253:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // InternalTankWar.g:254:1: ( ruleOptionSpecification EOF )
            // InternalTankWar.g:255:1: ruleOptionSpecification EOF
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
    // InternalTankWar.g:262:1: ruleOptionSpecification : ( ( rule__OptionSpecification__Alternatives ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:266:2: ( ( ( rule__OptionSpecification__Alternatives ) ) )
            // InternalTankWar.g:267:2: ( ( rule__OptionSpecification__Alternatives ) )
            {
            // InternalTankWar.g:267:2: ( ( rule__OptionSpecification__Alternatives ) )
            // InternalTankWar.g:268:3: ( rule__OptionSpecification__Alternatives )
            {
             before(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 
            // InternalTankWar.g:269:3: ( rule__OptionSpecification__Alternatives )
            // InternalTankWar.g:269:4: rule__OptionSpecification__Alternatives
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
    // InternalTankWar.g:278:1: entryRuleSuperModeDeclaration : ruleSuperModeDeclaration EOF ;
    public final void entryRuleSuperModeDeclaration() throws RecognitionException {
        try {
            // InternalTankWar.g:279:1: ( ruleSuperModeDeclaration EOF )
            // InternalTankWar.g:280:1: ruleSuperModeDeclaration EOF
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
    // InternalTankWar.g:287:1: ruleSuperModeDeclaration : ( ( rule__SuperModeDeclaration__Group__0 ) ) ;
    public final void ruleSuperModeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:291:2: ( ( ( rule__SuperModeDeclaration__Group__0 ) ) )
            // InternalTankWar.g:292:2: ( ( rule__SuperModeDeclaration__Group__0 ) )
            {
            // InternalTankWar.g:292:2: ( ( rule__SuperModeDeclaration__Group__0 ) )
            // InternalTankWar.g:293:3: ( rule__SuperModeDeclaration__Group__0 )
            {
             before(grammarAccess.getSuperModeDeclarationAccess().getGroup()); 
            // InternalTankWar.g:294:3: ( rule__SuperModeDeclaration__Group__0 )
            // InternalTankWar.g:294:4: rule__SuperModeDeclaration__Group__0
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
    // InternalTankWar.g:303:1: entryRuleStartFieldDeclaration : ruleStartFieldDeclaration EOF ;
    public final void entryRuleStartFieldDeclaration() throws RecognitionException {
        try {
            // InternalTankWar.g:304:1: ( ruleStartFieldDeclaration EOF )
            // InternalTankWar.g:305:1: ruleStartFieldDeclaration EOF
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
    // InternalTankWar.g:312:1: ruleStartFieldDeclaration : ( ( rule__StartFieldDeclaration__Group__0 ) ) ;
    public final void ruleStartFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:316:2: ( ( ( rule__StartFieldDeclaration__Group__0 ) ) )
            // InternalTankWar.g:317:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            {
            // InternalTankWar.g:317:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            // InternalTankWar.g:318:3: ( rule__StartFieldDeclaration__Group__0 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 
            // InternalTankWar.g:319:3: ( rule__StartFieldDeclaration__Group__0 )
            // InternalTankWar.g:319:4: rule__StartFieldDeclaration__Group__0
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
    // InternalTankWar.g:328:1: entryRuleAllowRestartMenu : ruleAllowRestartMenu EOF ;
    public final void entryRuleAllowRestartMenu() throws RecognitionException {
        try {
            // InternalTankWar.g:329:1: ( ruleAllowRestartMenu EOF )
            // InternalTankWar.g:330:1: ruleAllowRestartMenu EOF
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
    // InternalTankWar.g:337:1: ruleAllowRestartMenu : ( ( rule__AllowRestartMenu__Group__0 ) ) ;
    public final void ruleAllowRestartMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:341:2: ( ( ( rule__AllowRestartMenu__Group__0 ) ) )
            // InternalTankWar.g:342:2: ( ( rule__AllowRestartMenu__Group__0 ) )
            {
            // InternalTankWar.g:342:2: ( ( rule__AllowRestartMenu__Group__0 ) )
            // InternalTankWar.g:343:3: ( rule__AllowRestartMenu__Group__0 )
            {
             before(grammarAccess.getAllowRestartMenuAccess().getGroup()); 
            // InternalTankWar.g:344:3: ( rule__AllowRestartMenu__Group__0 )
            // InternalTankWar.g:344:4: rule__AllowRestartMenu__Group__0
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


    // $ANTLR start "entryRuleAddition"
    // InternalTankWar.g:353:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalTankWar.g:354:1: ( ruleAddition EOF )
            // InternalTankWar.g:355:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalTankWar.g:362:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:366:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalTankWar.g:367:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalTankWar.g:367:2: ( ( rule__Addition__Group__0 ) )
            // InternalTankWar.g:368:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalTankWar.g:369:3: ( rule__Addition__Group__0 )
            // InternalTankWar.g:369:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalTankWar.g:378:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalTankWar.g:379:1: ( ruleMultiplication EOF )
            // InternalTankWar.g:380:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalTankWar.g:387:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:391:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalTankWar.g:392:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalTankWar.g:392:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalTankWar.g:393:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalTankWar.g:394:3: ( rule__Multiplication__Group__0 )
            // InternalTankWar.g:394:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalTankWar.g:403:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTankWar.g:404:1: ( rulePrimary EOF )
            // InternalTankWar.g:405:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalTankWar.g:412:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:416:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTankWar.g:417:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTankWar.g:417:2: ( ( rule__Primary__Alternatives ) )
            // InternalTankWar.g:418:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTankWar.g:419:3: ( rule__Primary__Alternatives )
            // InternalTankWar.g:419:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalTankWar.g:428:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalTankWar.g:429:1: ( ruleIntLiteral EOF )
            // InternalTankWar.g:430:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalTankWar.g:437:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:441:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalTankWar.g:442:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalTankWar.g:442:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalTankWar.g:443:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalTankWar.g:444:3: ( rule__IntLiteral__ValAssignment )
            // InternalTankWar.g:444:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalTankWar.g:453:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalTankWar.g:454:1: ( ruleRealLiteral EOF )
            // InternalTankWar.g:455:1: ruleRealLiteral EOF
            {
             before(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleRealLiteral();

            state._fsp--;

             after(grammarAccess.getRealLiteralRule()); 
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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalTankWar.g:462:1: ruleRealLiteral : ( ( rule__RealLiteral__ValAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:466:2: ( ( ( rule__RealLiteral__ValAssignment ) ) )
            // InternalTankWar.g:467:2: ( ( rule__RealLiteral__ValAssignment ) )
            {
            // InternalTankWar.g:467:2: ( ( rule__RealLiteral__ValAssignment ) )
            // InternalTankWar.g:468:3: ( rule__RealLiteral__ValAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getValAssignment()); 
            // InternalTankWar.g:469:3: ( rule__RealLiteral__ValAssignment )
            // InternalTankWar.g:469:4: rule__RealLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getValAssignment()); 

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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleREAL"
    // InternalTankWar.g:478:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTankWar.g:482:1: ( ruleREAL EOF )
            // InternalTankWar.g:483:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalTankWar.g:493:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:498:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalTankWar.g:499:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalTankWar.g:499:2: ( ( rule__REAL__Group__0 ) )
            // InternalTankWar.g:500:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalTankWar.g:501:3: ( rule__REAL__Group__0 )
            // InternalTankWar.g:501:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "rule__ObstacleMember__Alternatives"
    // InternalTankWar.g:510:1: rule__ObstacleMember__Alternatives : ( ( ruleWallObstacle ) | ( ruleWaterObstacle ) );
    public final void rule__ObstacleMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:514:1: ( ( ruleWallObstacle ) | ( ruleWaterObstacle ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTankWar.g:515:2: ( ruleWallObstacle )
                    {
                    // InternalTankWar.g:515:2: ( ruleWallObstacle )
                    // InternalTankWar.g:516:3: ruleWallObstacle
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
                    // InternalTankWar.g:521:2: ( ruleWaterObstacle )
                    {
                    // InternalTankWar.g:521:2: ( ruleWaterObstacle )
                    // InternalTankWar.g:522:3: ruleWaterObstacle
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


    // $ANTLR start "rule__OptionSpecification__Alternatives"
    // InternalTankWar.g:531:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) | ( ruleSuperModeDeclaration ) | ( ruleEndGameBehaviour ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:535:1: ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) | ( ruleSuperModeDeclaration ) | ( ruleEndGameBehaviour ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTankWar.g:536:2: ( ruleStartFieldDeclaration )
                    {
                    // InternalTankWar.g:536:2: ( ruleStartFieldDeclaration )
                    // InternalTankWar.g:537:3: ruleStartFieldDeclaration
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
                    // InternalTankWar.g:542:2: ( ruleAllowRestartMenu )
                    {
                    // InternalTankWar.g:542:2: ( ruleAllowRestartMenu )
                    // InternalTankWar.g:543:3: ruleAllowRestartMenu
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
                    // InternalTankWar.g:548:2: ( ruleSuperModeDeclaration )
                    {
                    // InternalTankWar.g:548:2: ( ruleSuperModeDeclaration )
                    // InternalTankWar.g:549:3: ruleSuperModeDeclaration
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
                    // InternalTankWar.g:554:2: ( ruleEndGameBehaviour )
                    {
                    // InternalTankWar.g:554:2: ( ruleEndGameBehaviour )
                    // InternalTankWar.g:555:3: ruleEndGameBehaviour
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


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalTankWar.g:564:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:568:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTankWar.g:569:2: ( '+' )
                    {
                    // InternalTankWar.g:569:2: ( '+' )
                    // InternalTankWar.g:570:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTankWar.g:575:2: ( '-' )
                    {
                    // InternalTankWar.g:575:2: ( '-' )
                    // InternalTankWar.g:576:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalTankWar.g:585:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:589:1: ( ( '*' ) | ( '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTankWar.g:590:2: ( '*' )
                    {
                    // InternalTankWar.g:590:2: ( '*' )
                    // InternalTankWar.g:591:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTankWar.g:596:2: ( '/' )
                    {
                    // InternalTankWar.g:596:2: ( '/' )
                    // InternalTankWar.g:597:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalTankWar.g:606:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:610:1: ( ( ruleIntLiteral ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=11 && LA5_1<=14)||LA5_1==21||LA5_1==26) ) {
                    alt5=1;
                }
                else if ( (LA5_1==40) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTankWar.g:611:2: ( ruleIntLiteral )
                    {
                    // InternalTankWar.g:611:2: ( ruleIntLiteral )
                    // InternalTankWar.g:612:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTankWar.g:617:2: ( ruleRealLiteral )
                    {
                    // InternalTankWar.g:617:2: ( ruleRealLiteral )
                    // InternalTankWar.g:618:3: ruleRealLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTankWar.g:623:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalTankWar.g:623:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalTankWar.g:624:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalTankWar.g:625:3: ( rule__Primary__Group_2__0 )
                    // InternalTankWar.g:625:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__TankWarGame__Group__0"
    // InternalTankWar.g:633:1: rule__TankWarGame__Group__0 : rule__TankWarGame__Group__0__Impl rule__TankWarGame__Group__1 ;
    public final void rule__TankWarGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:637:1: ( rule__TankWarGame__Group__0__Impl rule__TankWarGame__Group__1 )
            // InternalTankWar.g:638:2: rule__TankWarGame__Group__0__Impl rule__TankWarGame__Group__1
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
    // InternalTankWar.g:645:1: rule__TankWarGame__Group__0__Impl : ( 'game' ) ;
    public final void rule__TankWarGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:649:1: ( ( 'game' ) )
            // InternalTankWar.g:650:1: ( 'game' )
            {
            // InternalTankWar.g:650:1: ( 'game' )
            // InternalTankWar.g:651:2: 'game'
            {
             before(grammarAccess.getTankWarGameAccess().getGameKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTankWar.g:660:1: rule__TankWarGame__Group__1 : rule__TankWarGame__Group__1__Impl rule__TankWarGame__Group__2 ;
    public final void rule__TankWarGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:664:1: ( rule__TankWarGame__Group__1__Impl rule__TankWarGame__Group__2 )
            // InternalTankWar.g:665:2: rule__TankWarGame__Group__1__Impl rule__TankWarGame__Group__2
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
    // InternalTankWar.g:672:1: rule__TankWarGame__Group__1__Impl : ( ( rule__TankWarGame__NameAssignment_1 ) ) ;
    public final void rule__TankWarGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:676:1: ( ( ( rule__TankWarGame__NameAssignment_1 ) ) )
            // InternalTankWar.g:677:1: ( ( rule__TankWarGame__NameAssignment_1 ) )
            {
            // InternalTankWar.g:677:1: ( ( rule__TankWarGame__NameAssignment_1 ) )
            // InternalTankWar.g:678:2: ( rule__TankWarGame__NameAssignment_1 )
            {
             before(grammarAccess.getTankWarGameAccess().getNameAssignment_1()); 
            // InternalTankWar.g:679:2: ( rule__TankWarGame__NameAssignment_1 )
            // InternalTankWar.g:679:3: rule__TankWarGame__NameAssignment_1
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
    // InternalTankWar.g:687:1: rule__TankWarGame__Group__2 : rule__TankWarGame__Group__2__Impl rule__TankWarGame__Group__3 ;
    public final void rule__TankWarGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:691:1: ( rule__TankWarGame__Group__2__Impl rule__TankWarGame__Group__3 )
            // InternalTankWar.g:692:2: rule__TankWarGame__Group__2__Impl rule__TankWarGame__Group__3
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
    // InternalTankWar.g:699:1: rule__TankWarGame__Group__2__Impl : ( '{' ) ;
    public final void rule__TankWarGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:703:1: ( ( '{' ) )
            // InternalTankWar.g:704:1: ( '{' )
            {
            // InternalTankWar.g:704:1: ( '{' )
            // InternalTankWar.g:705:2: '{'
            {
             before(grammarAccess.getTankWarGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTankWar.g:714:1: rule__TankWarGame__Group__3 : rule__TankWarGame__Group__3__Impl rule__TankWarGame__Group__4 ;
    public final void rule__TankWarGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:718:1: ( rule__TankWarGame__Group__3__Impl rule__TankWarGame__Group__4 )
            // InternalTankWar.g:719:2: rule__TankWarGame__Group__3__Impl rule__TankWarGame__Group__4
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
    // InternalTankWar.g:726:1: rule__TankWarGame__Group__3__Impl : ( ( rule__TankWarGame__ScreenAssignment_3 ) ) ;
    public final void rule__TankWarGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:730:1: ( ( ( rule__TankWarGame__ScreenAssignment_3 ) ) )
            // InternalTankWar.g:731:1: ( ( rule__TankWarGame__ScreenAssignment_3 ) )
            {
            // InternalTankWar.g:731:1: ( ( rule__TankWarGame__ScreenAssignment_3 ) )
            // InternalTankWar.g:732:2: ( rule__TankWarGame__ScreenAssignment_3 )
            {
             before(grammarAccess.getTankWarGameAccess().getScreenAssignment_3()); 
            // InternalTankWar.g:733:2: ( rule__TankWarGame__ScreenAssignment_3 )
            // InternalTankWar.g:733:3: rule__TankWarGame__ScreenAssignment_3
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
    // InternalTankWar.g:741:1: rule__TankWarGame__Group__4 : rule__TankWarGame__Group__4__Impl rule__TankWarGame__Group__5 ;
    public final void rule__TankWarGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:745:1: ( rule__TankWarGame__Group__4__Impl rule__TankWarGame__Group__5 )
            // InternalTankWar.g:746:2: rule__TankWarGame__Group__4__Impl rule__TankWarGame__Group__5
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
    // InternalTankWar.g:753:1: rule__TankWarGame__Group__4__Impl : ( ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* ) ) ;
    public final void rule__TankWarGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:757:1: ( ( ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* ) ) )
            // InternalTankWar.g:758:1: ( ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* ) )
            {
            // InternalTankWar.g:758:1: ( ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* ) )
            // InternalTankWar.g:759:2: ( ( rule__TankWarGame__FieldsAssignment_4 ) ) ( ( rule__TankWarGame__FieldsAssignment_4 )* )
            {
            // InternalTankWar.g:759:2: ( ( rule__TankWarGame__FieldsAssignment_4 ) )
            // InternalTankWar.g:760:3: ( rule__TankWarGame__FieldsAssignment_4 )
            {
             before(grammarAccess.getTankWarGameAccess().getFieldsAssignment_4()); 
            // InternalTankWar.g:761:3: ( rule__TankWarGame__FieldsAssignment_4 )
            // InternalTankWar.g:761:4: rule__TankWarGame__FieldsAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__TankWarGame__FieldsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getFieldsAssignment_4()); 

            }

            // InternalTankWar.g:764:2: ( ( rule__TankWarGame__FieldsAssignment_4 )* )
            // InternalTankWar.g:765:3: ( rule__TankWarGame__FieldsAssignment_4 )*
            {
             before(grammarAccess.getTankWarGameAccess().getFieldsAssignment_4()); 
            // InternalTankWar.g:766:3: ( rule__TankWarGame__FieldsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTankWar.g:766:4: rule__TankWarGame__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TankWarGame__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalTankWar.g:775:1: rule__TankWarGame__Group__5 : rule__TankWarGame__Group__5__Impl rule__TankWarGame__Group__6 ;
    public final void rule__TankWarGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:779:1: ( rule__TankWarGame__Group__5__Impl rule__TankWarGame__Group__6 )
            // InternalTankWar.g:780:2: rule__TankWarGame__Group__5__Impl rule__TankWarGame__Group__6
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
    // InternalTankWar.g:787:1: rule__TankWarGame__Group__5__Impl : ( ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* ) ) ;
    public final void rule__TankWarGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:791:1: ( ( ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* ) ) )
            // InternalTankWar.g:792:1: ( ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* ) )
            {
            // InternalTankWar.g:792:1: ( ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* ) )
            // InternalTankWar.g:793:2: ( ( rule__TankWarGame__OptionsAssignment_5 ) ) ( ( rule__TankWarGame__OptionsAssignment_5 )* )
            {
            // InternalTankWar.g:793:2: ( ( rule__TankWarGame__OptionsAssignment_5 ) )
            // InternalTankWar.g:794:3: ( rule__TankWarGame__OptionsAssignment_5 )
            {
             before(grammarAccess.getTankWarGameAccess().getOptionsAssignment_5()); 
            // InternalTankWar.g:795:3: ( rule__TankWarGame__OptionsAssignment_5 )
            // InternalTankWar.g:795:4: rule__TankWarGame__OptionsAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__TankWarGame__OptionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getOptionsAssignment_5()); 

            }

            // InternalTankWar.g:798:2: ( ( rule__TankWarGame__OptionsAssignment_5 )* )
            // InternalTankWar.g:799:3: ( rule__TankWarGame__OptionsAssignment_5 )*
            {
             before(grammarAccess.getTankWarGameAccess().getOptionsAssignment_5()); 
            // InternalTankWar.g:800:3: ( rule__TankWarGame__OptionsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||(LA7_0>=37 && LA7_0<=39)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTankWar.g:800:4: rule__TankWarGame__OptionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TankWarGame__OptionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalTankWar.g:809:1: rule__TankWarGame__Group__6 : rule__TankWarGame__Group__6__Impl ;
    public final void rule__TankWarGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:813:1: ( rule__TankWarGame__Group__6__Impl )
            // InternalTankWar.g:814:2: rule__TankWarGame__Group__6__Impl
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
    // InternalTankWar.g:820:1: rule__TankWarGame__Group__6__Impl : ( '}' ) ;
    public final void rule__TankWarGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:824:1: ( ( '}' ) )
            // InternalTankWar.g:825:1: ( '}' )
            {
            // InternalTankWar.g:825:1: ( '}' )
            // InternalTankWar.g:826:2: '}'
            {
             before(grammarAccess.getTankWarGameAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__EndGameBehaviour__Group__0"
    // InternalTankWar.g:836:1: rule__EndGameBehaviour__Group__0 : rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1 ;
    public final void rule__EndGameBehaviour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:840:1: ( rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1 )
            // InternalTankWar.g:841:2: rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1
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
    // InternalTankWar.g:848:1: rule__EndGameBehaviour__Group__0__Impl : ( 'end-game' ) ;
    public final void rule__EndGameBehaviour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:852:1: ( ( 'end-game' ) )
            // InternalTankWar.g:853:1: ( 'end-game' )
            {
            // InternalTankWar.g:853:1: ( 'end-game' )
            // InternalTankWar.g:854:2: 'end-game'
            {
             before(grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalTankWar.g:863:1: rule__EndGameBehaviour__Group__1 : rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2 ;
    public final void rule__EndGameBehaviour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:867:1: ( rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2 )
            // InternalTankWar.g:868:2: rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2
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
    // InternalTankWar.g:875:1: rule__EndGameBehaviour__Group__1__Impl : ( '(' ) ;
    public final void rule__EndGameBehaviour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:879:1: ( ( '(' ) )
            // InternalTankWar.g:880:1: ( '(' )
            {
            // InternalTankWar.g:880:1: ( '(' )
            // InternalTankWar.g:881:2: '('
            {
             before(grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTankWar.g:890:1: rule__EndGameBehaviour__Group__2 : rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3 ;
    public final void rule__EndGameBehaviour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:894:1: ( rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3 )
            // InternalTankWar.g:895:2: rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3
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
    // InternalTankWar.g:902:1: rule__EndGameBehaviour__Group__2__Impl : ( ( rule__EndGameBehaviour__WinAssignment_2 ) ) ;
    public final void rule__EndGameBehaviour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:906:1: ( ( ( rule__EndGameBehaviour__WinAssignment_2 ) ) )
            // InternalTankWar.g:907:1: ( ( rule__EndGameBehaviour__WinAssignment_2 ) )
            {
            // InternalTankWar.g:907:1: ( ( rule__EndGameBehaviour__WinAssignment_2 ) )
            // InternalTankWar.g:908:2: ( rule__EndGameBehaviour__WinAssignment_2 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getWinAssignment_2()); 
            // InternalTankWar.g:909:2: ( rule__EndGameBehaviour__WinAssignment_2 )
            // InternalTankWar.g:909:3: rule__EndGameBehaviour__WinAssignment_2
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
    // InternalTankWar.g:917:1: rule__EndGameBehaviour__Group__3 : rule__EndGameBehaviour__Group__3__Impl rule__EndGameBehaviour__Group__4 ;
    public final void rule__EndGameBehaviour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:921:1: ( rule__EndGameBehaviour__Group__3__Impl rule__EndGameBehaviour__Group__4 )
            // InternalTankWar.g:922:2: rule__EndGameBehaviour__Group__3__Impl rule__EndGameBehaviour__Group__4
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
    // InternalTankWar.g:929:1: rule__EndGameBehaviour__Group__3__Impl : ( ',' ) ;
    public final void rule__EndGameBehaviour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:933:1: ( ( ',' ) )
            // InternalTankWar.g:934:1: ( ',' )
            {
            // InternalTankWar.g:934:1: ( ',' )
            // InternalTankWar.g:935:2: ','
            {
             before(grammarAccess.getEndGameBehaviourAccess().getCommaKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTankWar.g:944:1: rule__EndGameBehaviour__Group__4 : rule__EndGameBehaviour__Group__4__Impl rule__EndGameBehaviour__Group__5 ;
    public final void rule__EndGameBehaviour__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:948:1: ( rule__EndGameBehaviour__Group__4__Impl rule__EndGameBehaviour__Group__5 )
            // InternalTankWar.g:949:2: rule__EndGameBehaviour__Group__4__Impl rule__EndGameBehaviour__Group__5
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
    // InternalTankWar.g:956:1: rule__EndGameBehaviour__Group__4__Impl : ( ( rule__EndGameBehaviour__LostAssignment_4 ) ) ;
    public final void rule__EndGameBehaviour__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:960:1: ( ( ( rule__EndGameBehaviour__LostAssignment_4 ) ) )
            // InternalTankWar.g:961:1: ( ( rule__EndGameBehaviour__LostAssignment_4 ) )
            {
            // InternalTankWar.g:961:1: ( ( rule__EndGameBehaviour__LostAssignment_4 ) )
            // InternalTankWar.g:962:2: ( rule__EndGameBehaviour__LostAssignment_4 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getLostAssignment_4()); 
            // InternalTankWar.g:963:2: ( rule__EndGameBehaviour__LostAssignment_4 )
            // InternalTankWar.g:963:3: rule__EndGameBehaviour__LostAssignment_4
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
    // InternalTankWar.g:971:1: rule__EndGameBehaviour__Group__5 : rule__EndGameBehaviour__Group__5__Impl ;
    public final void rule__EndGameBehaviour__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:975:1: ( rule__EndGameBehaviour__Group__5__Impl )
            // InternalTankWar.g:976:2: rule__EndGameBehaviour__Group__5__Impl
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
    // InternalTankWar.g:982:1: rule__EndGameBehaviour__Group__5__Impl : ( ')' ) ;
    public final void rule__EndGameBehaviour__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:986:1: ( ( ')' ) )
            // InternalTankWar.g:987:1: ( ')' )
            {
            // InternalTankWar.g:987:1: ( ')' )
            // InternalTankWar.g:988:2: ')'
            {
             before(grammarAccess.getEndGameBehaviourAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTankWar.g:998:1: rule__ScreenSpecification__Group__0 : rule__ScreenSpecification__Group__0__Impl rule__ScreenSpecification__Group__1 ;
    public final void rule__ScreenSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1002:1: ( rule__ScreenSpecification__Group__0__Impl rule__ScreenSpecification__Group__1 )
            // InternalTankWar.g:1003:2: rule__ScreenSpecification__Group__0__Impl rule__ScreenSpecification__Group__1
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
    // InternalTankWar.g:1010:1: rule__ScreenSpecification__Group__0__Impl : ( 'screen' ) ;
    public final void rule__ScreenSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1014:1: ( ( 'screen' ) )
            // InternalTankWar.g:1015:1: ( 'screen' )
            {
            // InternalTankWar.g:1015:1: ( 'screen' )
            // InternalTankWar.g:1016:2: 'screen'
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTankWar.g:1025:1: rule__ScreenSpecification__Group__1 : rule__ScreenSpecification__Group__1__Impl rule__ScreenSpecification__Group__2 ;
    public final void rule__ScreenSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1029:1: ( rule__ScreenSpecification__Group__1__Impl rule__ScreenSpecification__Group__2 )
            // InternalTankWar.g:1030:2: rule__ScreenSpecification__Group__1__Impl rule__ScreenSpecification__Group__2
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
    // InternalTankWar.g:1037:1: rule__ScreenSpecification__Group__1__Impl : ( ( rule__ScreenSpecification__NameAssignment_1 ) ) ;
    public final void rule__ScreenSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1041:1: ( ( ( rule__ScreenSpecification__NameAssignment_1 ) ) )
            // InternalTankWar.g:1042:1: ( ( rule__ScreenSpecification__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1042:1: ( ( rule__ScreenSpecification__NameAssignment_1 ) )
            // InternalTankWar.g:1043:2: ( rule__ScreenSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1044:2: ( rule__ScreenSpecification__NameAssignment_1 )
            // InternalTankWar.g:1044:3: rule__ScreenSpecification__NameAssignment_1
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
    // InternalTankWar.g:1052:1: rule__ScreenSpecification__Group__2 : rule__ScreenSpecification__Group__2__Impl rule__ScreenSpecification__Group__3 ;
    public final void rule__ScreenSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1056:1: ( rule__ScreenSpecification__Group__2__Impl rule__ScreenSpecification__Group__3 )
            // InternalTankWar.g:1057:2: rule__ScreenSpecification__Group__2__Impl rule__ScreenSpecification__Group__3
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
    // InternalTankWar.g:1064:1: rule__ScreenSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__ScreenSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1068:1: ( ( '{' ) )
            // InternalTankWar.g:1069:1: ( '{' )
            {
            // InternalTankWar.g:1069:1: ( '{' )
            // InternalTankWar.g:1070:2: '{'
            {
             before(grammarAccess.getScreenSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTankWar.g:1079:1: rule__ScreenSpecification__Group__3 : rule__ScreenSpecification__Group__3__Impl rule__ScreenSpecification__Group__4 ;
    public final void rule__ScreenSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1083:1: ( rule__ScreenSpecification__Group__3__Impl rule__ScreenSpecification__Group__4 )
            // InternalTankWar.g:1084:2: rule__ScreenSpecification__Group__3__Impl rule__ScreenSpecification__Group__4
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
    // InternalTankWar.g:1091:1: rule__ScreenSpecification__Group__3__Impl : ( 'screenWidth' ) ;
    public final void rule__ScreenSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1095:1: ( ( 'screenWidth' ) )
            // InternalTankWar.g:1096:1: ( 'screenWidth' )
            {
            // InternalTankWar.g:1096:1: ( 'screenWidth' )
            // InternalTankWar.g:1097:2: 'screenWidth'
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenWidthKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalTankWar.g:1106:1: rule__ScreenSpecification__Group__4 : rule__ScreenSpecification__Group__4__Impl rule__ScreenSpecification__Group__5 ;
    public final void rule__ScreenSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1110:1: ( rule__ScreenSpecification__Group__4__Impl rule__ScreenSpecification__Group__5 )
            // InternalTankWar.g:1111:2: rule__ScreenSpecification__Group__4__Impl rule__ScreenSpecification__Group__5
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
    // InternalTankWar.g:1118:1: rule__ScreenSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__ScreenSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1122:1: ( ( '=' ) )
            // InternalTankWar.g:1123:1: ( '=' )
            {
            // InternalTankWar.g:1123:1: ( '=' )
            // InternalTankWar.g:1124:2: '='
            {
             before(grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTankWar.g:1133:1: rule__ScreenSpecification__Group__5 : rule__ScreenSpecification__Group__5__Impl rule__ScreenSpecification__Group__6 ;
    public final void rule__ScreenSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1137:1: ( rule__ScreenSpecification__Group__5__Impl rule__ScreenSpecification__Group__6 )
            // InternalTankWar.g:1138:2: rule__ScreenSpecification__Group__5__Impl rule__ScreenSpecification__Group__6
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
    // InternalTankWar.g:1145:1: rule__ScreenSpecification__Group__5__Impl : ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) ) ;
    public final void rule__ScreenSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1149:1: ( ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) ) )
            // InternalTankWar.g:1150:1: ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) )
            {
            // InternalTankWar.g:1150:1: ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) )
            // InternalTankWar.g:1151:2: ( rule__ScreenSpecification__ScreenWidthAssignment_5 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenWidthAssignment_5()); 
            // InternalTankWar.g:1152:2: ( rule__ScreenSpecification__ScreenWidthAssignment_5 )
            // InternalTankWar.g:1152:3: rule__ScreenSpecification__ScreenWidthAssignment_5
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
    // InternalTankWar.g:1160:1: rule__ScreenSpecification__Group__6 : rule__ScreenSpecification__Group__6__Impl rule__ScreenSpecification__Group__7 ;
    public final void rule__ScreenSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1164:1: ( rule__ScreenSpecification__Group__6__Impl rule__ScreenSpecification__Group__7 )
            // InternalTankWar.g:1165:2: rule__ScreenSpecification__Group__6__Impl rule__ScreenSpecification__Group__7
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
    // InternalTankWar.g:1172:1: rule__ScreenSpecification__Group__6__Impl : ( 'screenHeight' ) ;
    public final void rule__ScreenSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1176:1: ( ( 'screenHeight' ) )
            // InternalTankWar.g:1177:1: ( 'screenHeight' )
            {
            // InternalTankWar.g:1177:1: ( 'screenHeight' )
            // InternalTankWar.g:1178:2: 'screenHeight'
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenHeightKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTankWar.g:1187:1: rule__ScreenSpecification__Group__7 : rule__ScreenSpecification__Group__7__Impl rule__ScreenSpecification__Group__8 ;
    public final void rule__ScreenSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1191:1: ( rule__ScreenSpecification__Group__7__Impl rule__ScreenSpecification__Group__8 )
            // InternalTankWar.g:1192:2: rule__ScreenSpecification__Group__7__Impl rule__ScreenSpecification__Group__8
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
    // InternalTankWar.g:1199:1: rule__ScreenSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__ScreenSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1203:1: ( ( '=' ) )
            // InternalTankWar.g:1204:1: ( '=' )
            {
            // InternalTankWar.g:1204:1: ( '=' )
            // InternalTankWar.g:1205:2: '='
            {
             before(grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTankWar.g:1214:1: rule__ScreenSpecification__Group__8 : rule__ScreenSpecification__Group__8__Impl rule__ScreenSpecification__Group__9 ;
    public final void rule__ScreenSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1218:1: ( rule__ScreenSpecification__Group__8__Impl rule__ScreenSpecification__Group__9 )
            // InternalTankWar.g:1219:2: rule__ScreenSpecification__Group__8__Impl rule__ScreenSpecification__Group__9
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
    // InternalTankWar.g:1226:1: rule__ScreenSpecification__Group__8__Impl : ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) ) ;
    public final void rule__ScreenSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1230:1: ( ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) ) )
            // InternalTankWar.g:1231:1: ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) )
            {
            // InternalTankWar.g:1231:1: ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) )
            // InternalTankWar.g:1232:2: ( rule__ScreenSpecification__ScreenHeightAssignment_8 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenHeightAssignment_8()); 
            // InternalTankWar.g:1233:2: ( rule__ScreenSpecification__ScreenHeightAssignment_8 )
            // InternalTankWar.g:1233:3: rule__ScreenSpecification__ScreenHeightAssignment_8
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
    // InternalTankWar.g:1241:1: rule__ScreenSpecification__Group__9 : rule__ScreenSpecification__Group__9__Impl ;
    public final void rule__ScreenSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1245:1: ( rule__ScreenSpecification__Group__9__Impl )
            // InternalTankWar.g:1246:2: rule__ScreenSpecification__Group__9__Impl
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
    // InternalTankWar.g:1252:1: rule__ScreenSpecification__Group__9__Impl : ( '}' ) ;
    public final void rule__ScreenSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1256:1: ( ( '}' ) )
            // InternalTankWar.g:1257:1: ( '}' )
            {
            // InternalTankWar.g:1257:1: ( '}' )
            // InternalTankWar.g:1258:2: '}'
            {
             before(grammarAccess.getScreenSpecificationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTankWar.g:1268:1: rule__Obstaclepecification__Group__0 : rule__Obstaclepecification__Group__0__Impl rule__Obstaclepecification__Group__1 ;
    public final void rule__Obstaclepecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1272:1: ( rule__Obstaclepecification__Group__0__Impl rule__Obstaclepecification__Group__1 )
            // InternalTankWar.g:1273:2: rule__Obstaclepecification__Group__0__Impl rule__Obstaclepecification__Group__1
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
    // InternalTankWar.g:1280:1: rule__Obstaclepecification__Group__0__Impl : ( 'obstacle' ) ;
    public final void rule__Obstaclepecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1284:1: ( ( 'obstacle' ) )
            // InternalTankWar.g:1285:1: ( 'obstacle' )
            {
            // InternalTankWar.g:1285:1: ( 'obstacle' )
            // InternalTankWar.g:1286:2: 'obstacle'
            {
             before(grammarAccess.getObstaclepecificationAccess().getObstacleKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalTankWar.g:1295:1: rule__Obstaclepecification__Group__1 : rule__Obstaclepecification__Group__1__Impl rule__Obstaclepecification__Group__2 ;
    public final void rule__Obstaclepecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1299:1: ( rule__Obstaclepecification__Group__1__Impl rule__Obstaclepecification__Group__2 )
            // InternalTankWar.g:1300:2: rule__Obstaclepecification__Group__1__Impl rule__Obstaclepecification__Group__2
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
    // InternalTankWar.g:1307:1: rule__Obstaclepecification__Group__1__Impl : ( ( rule__Obstaclepecification__NameAssignment_1 ) ) ;
    public final void rule__Obstaclepecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1311:1: ( ( ( rule__Obstaclepecification__NameAssignment_1 ) ) )
            // InternalTankWar.g:1312:1: ( ( rule__Obstaclepecification__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1312:1: ( ( rule__Obstaclepecification__NameAssignment_1 ) )
            // InternalTankWar.g:1313:2: ( rule__Obstaclepecification__NameAssignment_1 )
            {
             before(grammarAccess.getObstaclepecificationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1314:2: ( rule__Obstaclepecification__NameAssignment_1 )
            // InternalTankWar.g:1314:3: rule__Obstaclepecification__NameAssignment_1
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
    // InternalTankWar.g:1322:1: rule__Obstaclepecification__Group__2 : rule__Obstaclepecification__Group__2__Impl rule__Obstaclepecification__Group__3 ;
    public final void rule__Obstaclepecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1326:1: ( rule__Obstaclepecification__Group__2__Impl rule__Obstaclepecification__Group__3 )
            // InternalTankWar.g:1327:2: rule__Obstaclepecification__Group__2__Impl rule__Obstaclepecification__Group__3
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
    // InternalTankWar.g:1334:1: rule__Obstaclepecification__Group__2__Impl : ( '{' ) ;
    public final void rule__Obstaclepecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1338:1: ( ( '{' ) )
            // InternalTankWar.g:1339:1: ( '{' )
            {
            // InternalTankWar.g:1339:1: ( '{' )
            // InternalTankWar.g:1340:2: '{'
            {
             before(grammarAccess.getObstaclepecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTankWar.g:1349:1: rule__Obstaclepecification__Group__3 : rule__Obstaclepecification__Group__3__Impl rule__Obstaclepecification__Group__4 ;
    public final void rule__Obstaclepecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1353:1: ( rule__Obstaclepecification__Group__3__Impl rule__Obstaclepecification__Group__4 )
            // InternalTankWar.g:1354:2: rule__Obstaclepecification__Group__3__Impl rule__Obstaclepecification__Group__4
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
    // InternalTankWar.g:1361:1: rule__Obstaclepecification__Group__3__Impl : ( ( rule__Obstaclepecification__FieldsAssignment_3 )* ) ;
    public final void rule__Obstaclepecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1365:1: ( ( ( rule__Obstaclepecification__FieldsAssignment_3 )* ) )
            // InternalTankWar.g:1366:1: ( ( rule__Obstaclepecification__FieldsAssignment_3 )* )
            {
            // InternalTankWar.g:1366:1: ( ( rule__Obstaclepecification__FieldsAssignment_3 )* )
            // InternalTankWar.g:1367:2: ( rule__Obstaclepecification__FieldsAssignment_3 )*
            {
             before(grammarAccess.getObstaclepecificationAccess().getFieldsAssignment_3()); 
            // InternalTankWar.g:1368:2: ( rule__Obstaclepecification__FieldsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTankWar.g:1368:3: rule__Obstaclepecification__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Obstaclepecification__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalTankWar.g:1376:1: rule__Obstaclepecification__Group__4 : rule__Obstaclepecification__Group__4__Impl ;
    public final void rule__Obstaclepecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1380:1: ( rule__Obstaclepecification__Group__4__Impl )
            // InternalTankWar.g:1381:2: rule__Obstaclepecification__Group__4__Impl
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
    // InternalTankWar.g:1387:1: rule__Obstaclepecification__Group__4__Impl : ( '}' ) ;
    public final void rule__Obstaclepecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1391:1: ( ( '}' ) )
            // InternalTankWar.g:1392:1: ( '}' )
            {
            // InternalTankWar.g:1392:1: ( '}' )
            // InternalTankWar.g:1393:2: '}'
            {
             before(grammarAccess.getObstaclepecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTankWar.g:1403:1: rule__WaterObstacle__Group__0 : rule__WaterObstacle__Group__0__Impl rule__WaterObstacle__Group__1 ;
    public final void rule__WaterObstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1407:1: ( rule__WaterObstacle__Group__0__Impl rule__WaterObstacle__Group__1 )
            // InternalTankWar.g:1408:2: rule__WaterObstacle__Group__0__Impl rule__WaterObstacle__Group__1
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
    // InternalTankWar.g:1415:1: rule__WaterObstacle__Group__0__Impl : ( 'water' ) ;
    public final void rule__WaterObstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1419:1: ( ( 'water' ) )
            // InternalTankWar.g:1420:1: ( 'water' )
            {
            // InternalTankWar.g:1420:1: ( 'water' )
            // InternalTankWar.g:1421:2: 'water'
            {
             before(grammarAccess.getWaterObstacleAccess().getWaterKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTankWar.g:1430:1: rule__WaterObstacle__Group__1 : rule__WaterObstacle__Group__1__Impl rule__WaterObstacle__Group__2 ;
    public final void rule__WaterObstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1434:1: ( rule__WaterObstacle__Group__1__Impl rule__WaterObstacle__Group__2 )
            // InternalTankWar.g:1435:2: rule__WaterObstacle__Group__1__Impl rule__WaterObstacle__Group__2
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
    // InternalTankWar.g:1442:1: rule__WaterObstacle__Group__1__Impl : ( ( rule__WaterObstacle__NameAssignment_1 ) ) ;
    public final void rule__WaterObstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1446:1: ( ( ( rule__WaterObstacle__NameAssignment_1 ) ) )
            // InternalTankWar.g:1447:1: ( ( rule__WaterObstacle__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1447:1: ( ( rule__WaterObstacle__NameAssignment_1 ) )
            // InternalTankWar.g:1448:2: ( rule__WaterObstacle__NameAssignment_1 )
            {
             before(grammarAccess.getWaterObstacleAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1449:2: ( rule__WaterObstacle__NameAssignment_1 )
            // InternalTankWar.g:1449:3: rule__WaterObstacle__NameAssignment_1
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
    // InternalTankWar.g:1457:1: rule__WaterObstacle__Group__2 : rule__WaterObstacle__Group__2__Impl rule__WaterObstacle__Group__3 ;
    public final void rule__WaterObstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1461:1: ( rule__WaterObstacle__Group__2__Impl rule__WaterObstacle__Group__3 )
            // InternalTankWar.g:1462:2: rule__WaterObstacle__Group__2__Impl rule__WaterObstacle__Group__3
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
    // InternalTankWar.g:1469:1: rule__WaterObstacle__Group__2__Impl : ( '{' ) ;
    public final void rule__WaterObstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1473:1: ( ( '{' ) )
            // InternalTankWar.g:1474:1: ( '{' )
            {
            // InternalTankWar.g:1474:1: ( '{' )
            // InternalTankWar.g:1475:2: '{'
            {
             before(grammarAccess.getWaterObstacleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTankWar.g:1484:1: rule__WaterObstacle__Group__3 : rule__WaterObstacle__Group__3__Impl ;
    public final void rule__WaterObstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1488:1: ( rule__WaterObstacle__Group__3__Impl )
            // InternalTankWar.g:1489:2: rule__WaterObstacle__Group__3__Impl
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
    // InternalTankWar.g:1495:1: rule__WaterObstacle__Group__3__Impl : ( '}' ) ;
    public final void rule__WaterObstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1499:1: ( ( '}' ) )
            // InternalTankWar.g:1500:1: ( '}' )
            {
            // InternalTankWar.g:1500:1: ( '}' )
            // InternalTankWar.g:1501:2: '}'
            {
             before(grammarAccess.getWaterObstacleAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTankWar.g:1511:1: rule__WallObstacle__Group__0 : rule__WallObstacle__Group__0__Impl rule__WallObstacle__Group__1 ;
    public final void rule__WallObstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1515:1: ( rule__WallObstacle__Group__0__Impl rule__WallObstacle__Group__1 )
            // InternalTankWar.g:1516:2: rule__WallObstacle__Group__0__Impl rule__WallObstacle__Group__1
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
    // InternalTankWar.g:1523:1: rule__WallObstacle__Group__0__Impl : ( 'wall' ) ;
    public final void rule__WallObstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1527:1: ( ( 'wall' ) )
            // InternalTankWar.g:1528:1: ( 'wall' )
            {
            // InternalTankWar.g:1528:1: ( 'wall' )
            // InternalTankWar.g:1529:2: 'wall'
            {
             before(grammarAccess.getWallObstacleAccess().getWallKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTankWar.g:1538:1: rule__WallObstacle__Group__1 : rule__WallObstacle__Group__1__Impl rule__WallObstacle__Group__2 ;
    public final void rule__WallObstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1542:1: ( rule__WallObstacle__Group__1__Impl rule__WallObstacle__Group__2 )
            // InternalTankWar.g:1543:2: rule__WallObstacle__Group__1__Impl rule__WallObstacle__Group__2
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
    // InternalTankWar.g:1550:1: rule__WallObstacle__Group__1__Impl : ( ( rule__WallObstacle__NameAssignment_1 ) ) ;
    public final void rule__WallObstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1554:1: ( ( ( rule__WallObstacle__NameAssignment_1 ) ) )
            // InternalTankWar.g:1555:1: ( ( rule__WallObstacle__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1555:1: ( ( rule__WallObstacle__NameAssignment_1 ) )
            // InternalTankWar.g:1556:2: ( rule__WallObstacle__NameAssignment_1 )
            {
             before(grammarAccess.getWallObstacleAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1557:2: ( rule__WallObstacle__NameAssignment_1 )
            // InternalTankWar.g:1557:3: rule__WallObstacle__NameAssignment_1
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
    // InternalTankWar.g:1565:1: rule__WallObstacle__Group__2 : rule__WallObstacle__Group__2__Impl rule__WallObstacle__Group__3 ;
    public final void rule__WallObstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1569:1: ( rule__WallObstacle__Group__2__Impl rule__WallObstacle__Group__3 )
            // InternalTankWar.g:1570:2: rule__WallObstacle__Group__2__Impl rule__WallObstacle__Group__3
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
    // InternalTankWar.g:1577:1: rule__WallObstacle__Group__2__Impl : ( '{' ) ;
    public final void rule__WallObstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1581:1: ( ( '{' ) )
            // InternalTankWar.g:1582:1: ( '{' )
            {
            // InternalTankWar.g:1582:1: ( '{' )
            // InternalTankWar.g:1583:2: '{'
            {
             before(grammarAccess.getWallObstacleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTankWar.g:1592:1: rule__WallObstacle__Group__3 : rule__WallObstacle__Group__3__Impl rule__WallObstacle__Group__4 ;
    public final void rule__WallObstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1596:1: ( rule__WallObstacle__Group__3__Impl rule__WallObstacle__Group__4 )
            // InternalTankWar.g:1597:2: rule__WallObstacle__Group__3__Impl rule__WallObstacle__Group__4
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
    // InternalTankWar.g:1604:1: rule__WallObstacle__Group__3__Impl : ( 'wallWidth' ) ;
    public final void rule__WallObstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1608:1: ( ( 'wallWidth' ) )
            // InternalTankWar.g:1609:1: ( 'wallWidth' )
            {
            // InternalTankWar.g:1609:1: ( 'wallWidth' )
            // InternalTankWar.g:1610:2: 'wallWidth'
            {
             before(grammarAccess.getWallObstacleAccess().getWallWidthKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTankWar.g:1619:1: rule__WallObstacle__Group__4 : rule__WallObstacle__Group__4__Impl rule__WallObstacle__Group__5 ;
    public final void rule__WallObstacle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1623:1: ( rule__WallObstacle__Group__4__Impl rule__WallObstacle__Group__5 )
            // InternalTankWar.g:1624:2: rule__WallObstacle__Group__4__Impl rule__WallObstacle__Group__5
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
    // InternalTankWar.g:1631:1: rule__WallObstacle__Group__4__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1635:1: ( ( '=' ) )
            // InternalTankWar.g:1636:1: ( '=' )
            {
            // InternalTankWar.g:1636:1: ( '=' )
            // InternalTankWar.g:1637:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTankWar.g:1646:1: rule__WallObstacle__Group__5 : rule__WallObstacle__Group__5__Impl rule__WallObstacle__Group__6 ;
    public final void rule__WallObstacle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1650:1: ( rule__WallObstacle__Group__5__Impl rule__WallObstacle__Group__6 )
            // InternalTankWar.g:1651:2: rule__WallObstacle__Group__5__Impl rule__WallObstacle__Group__6
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
    // InternalTankWar.g:1658:1: rule__WallObstacle__Group__5__Impl : ( ( rule__WallObstacle__WallWidthAssignment_5 ) ) ;
    public final void rule__WallObstacle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1662:1: ( ( ( rule__WallObstacle__WallWidthAssignment_5 ) ) )
            // InternalTankWar.g:1663:1: ( ( rule__WallObstacle__WallWidthAssignment_5 ) )
            {
            // InternalTankWar.g:1663:1: ( ( rule__WallObstacle__WallWidthAssignment_5 ) )
            // InternalTankWar.g:1664:2: ( rule__WallObstacle__WallWidthAssignment_5 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallWidthAssignment_5()); 
            // InternalTankWar.g:1665:2: ( rule__WallObstacle__WallWidthAssignment_5 )
            // InternalTankWar.g:1665:3: rule__WallObstacle__WallWidthAssignment_5
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
    // InternalTankWar.g:1673:1: rule__WallObstacle__Group__6 : rule__WallObstacle__Group__6__Impl rule__WallObstacle__Group__7 ;
    public final void rule__WallObstacle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1677:1: ( rule__WallObstacle__Group__6__Impl rule__WallObstacle__Group__7 )
            // InternalTankWar.g:1678:2: rule__WallObstacle__Group__6__Impl rule__WallObstacle__Group__7
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
    // InternalTankWar.g:1685:1: rule__WallObstacle__Group__6__Impl : ( 'wallHeight' ) ;
    public final void rule__WallObstacle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1689:1: ( ( 'wallHeight' ) )
            // InternalTankWar.g:1690:1: ( 'wallHeight' )
            {
            // InternalTankWar.g:1690:1: ( 'wallHeight' )
            // InternalTankWar.g:1691:2: 'wallHeight'
            {
             before(grammarAccess.getWallObstacleAccess().getWallHeightKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTankWar.g:1700:1: rule__WallObstacle__Group__7 : rule__WallObstacle__Group__7__Impl rule__WallObstacle__Group__8 ;
    public final void rule__WallObstacle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1704:1: ( rule__WallObstacle__Group__7__Impl rule__WallObstacle__Group__8 )
            // InternalTankWar.g:1705:2: rule__WallObstacle__Group__7__Impl rule__WallObstacle__Group__8
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
    // InternalTankWar.g:1712:1: rule__WallObstacle__Group__7__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1716:1: ( ( '=' ) )
            // InternalTankWar.g:1717:1: ( '=' )
            {
            // InternalTankWar.g:1717:1: ( '=' )
            // InternalTankWar.g:1718:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTankWar.g:1727:1: rule__WallObstacle__Group__8 : rule__WallObstacle__Group__8__Impl rule__WallObstacle__Group__9 ;
    public final void rule__WallObstacle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1731:1: ( rule__WallObstacle__Group__8__Impl rule__WallObstacle__Group__9 )
            // InternalTankWar.g:1732:2: rule__WallObstacle__Group__8__Impl rule__WallObstacle__Group__9
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
    // InternalTankWar.g:1739:1: rule__WallObstacle__Group__8__Impl : ( ( rule__WallObstacle__WallHeightAssignment_8 ) ) ;
    public final void rule__WallObstacle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1743:1: ( ( ( rule__WallObstacle__WallHeightAssignment_8 ) ) )
            // InternalTankWar.g:1744:1: ( ( rule__WallObstacle__WallHeightAssignment_8 ) )
            {
            // InternalTankWar.g:1744:1: ( ( rule__WallObstacle__WallHeightAssignment_8 ) )
            // InternalTankWar.g:1745:2: ( rule__WallObstacle__WallHeightAssignment_8 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallHeightAssignment_8()); 
            // InternalTankWar.g:1746:2: ( rule__WallObstacle__WallHeightAssignment_8 )
            // InternalTankWar.g:1746:3: rule__WallObstacle__WallHeightAssignment_8
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
    // InternalTankWar.g:1754:1: rule__WallObstacle__Group__9 : rule__WallObstacle__Group__9__Impl rule__WallObstacle__Group__10 ;
    public final void rule__WallObstacle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1758:1: ( rule__WallObstacle__Group__9__Impl rule__WallObstacle__Group__10 )
            // InternalTankWar.g:1759:2: rule__WallObstacle__Group__9__Impl rule__WallObstacle__Group__10
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
    // InternalTankWar.g:1766:1: rule__WallObstacle__Group__9__Impl : ( 'wallPosX' ) ;
    public final void rule__WallObstacle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1770:1: ( ( 'wallPosX' ) )
            // InternalTankWar.g:1771:1: ( 'wallPosX' )
            {
            // InternalTankWar.g:1771:1: ( 'wallPosX' )
            // InternalTankWar.g:1772:2: 'wallPosX'
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosXKeyword_9()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTankWar.g:1781:1: rule__WallObstacle__Group__10 : rule__WallObstacle__Group__10__Impl rule__WallObstacle__Group__11 ;
    public final void rule__WallObstacle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1785:1: ( rule__WallObstacle__Group__10__Impl rule__WallObstacle__Group__11 )
            // InternalTankWar.g:1786:2: rule__WallObstacle__Group__10__Impl rule__WallObstacle__Group__11
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
    // InternalTankWar.g:1793:1: rule__WallObstacle__Group__10__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1797:1: ( ( '=' ) )
            // InternalTankWar.g:1798:1: ( '=' )
            {
            // InternalTankWar.g:1798:1: ( '=' )
            // InternalTankWar.g:1799:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_10()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTankWar.g:1808:1: rule__WallObstacle__Group__11 : rule__WallObstacle__Group__11__Impl rule__WallObstacle__Group__12 ;
    public final void rule__WallObstacle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1812:1: ( rule__WallObstacle__Group__11__Impl rule__WallObstacle__Group__12 )
            // InternalTankWar.g:1813:2: rule__WallObstacle__Group__11__Impl rule__WallObstacle__Group__12
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
    // InternalTankWar.g:1820:1: rule__WallObstacle__Group__11__Impl : ( ( rule__WallObstacle__WallPosXAssignment_11 ) ) ;
    public final void rule__WallObstacle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1824:1: ( ( ( rule__WallObstacle__WallPosXAssignment_11 ) ) )
            // InternalTankWar.g:1825:1: ( ( rule__WallObstacle__WallPosXAssignment_11 ) )
            {
            // InternalTankWar.g:1825:1: ( ( rule__WallObstacle__WallPosXAssignment_11 ) )
            // InternalTankWar.g:1826:2: ( rule__WallObstacle__WallPosXAssignment_11 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosXAssignment_11()); 
            // InternalTankWar.g:1827:2: ( rule__WallObstacle__WallPosXAssignment_11 )
            // InternalTankWar.g:1827:3: rule__WallObstacle__WallPosXAssignment_11
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
    // InternalTankWar.g:1835:1: rule__WallObstacle__Group__12 : rule__WallObstacle__Group__12__Impl rule__WallObstacle__Group__13 ;
    public final void rule__WallObstacle__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1839:1: ( rule__WallObstacle__Group__12__Impl rule__WallObstacle__Group__13 )
            // InternalTankWar.g:1840:2: rule__WallObstacle__Group__12__Impl rule__WallObstacle__Group__13
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
    // InternalTankWar.g:1847:1: rule__WallObstacle__Group__12__Impl : ( 'wallPosY' ) ;
    public final void rule__WallObstacle__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1851:1: ( ( 'wallPosY' ) )
            // InternalTankWar.g:1852:1: ( 'wallPosY' )
            {
            // InternalTankWar.g:1852:1: ( 'wallPosY' )
            // InternalTankWar.g:1853:2: 'wallPosY'
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosYKeyword_12()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTankWar.g:1862:1: rule__WallObstacle__Group__13 : rule__WallObstacle__Group__13__Impl rule__WallObstacle__Group__14 ;
    public final void rule__WallObstacle__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1866:1: ( rule__WallObstacle__Group__13__Impl rule__WallObstacle__Group__14 )
            // InternalTankWar.g:1867:2: rule__WallObstacle__Group__13__Impl rule__WallObstacle__Group__14
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
    // InternalTankWar.g:1874:1: rule__WallObstacle__Group__13__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1878:1: ( ( '=' ) )
            // InternalTankWar.g:1879:1: ( '=' )
            {
            // InternalTankWar.g:1879:1: ( '=' )
            // InternalTankWar.g:1880:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_13()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTankWar.g:1889:1: rule__WallObstacle__Group__14 : rule__WallObstacle__Group__14__Impl rule__WallObstacle__Group__15 ;
    public final void rule__WallObstacle__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1893:1: ( rule__WallObstacle__Group__14__Impl rule__WallObstacle__Group__15 )
            // InternalTankWar.g:1894:2: rule__WallObstacle__Group__14__Impl rule__WallObstacle__Group__15
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
    // InternalTankWar.g:1901:1: rule__WallObstacle__Group__14__Impl : ( ( rule__WallObstacle__WallPosYAssignment_14 ) ) ;
    public final void rule__WallObstacle__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1905:1: ( ( ( rule__WallObstacle__WallPosYAssignment_14 ) ) )
            // InternalTankWar.g:1906:1: ( ( rule__WallObstacle__WallPosYAssignment_14 ) )
            {
            // InternalTankWar.g:1906:1: ( ( rule__WallObstacle__WallPosYAssignment_14 ) )
            // InternalTankWar.g:1907:2: ( rule__WallObstacle__WallPosYAssignment_14 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosYAssignment_14()); 
            // InternalTankWar.g:1908:2: ( rule__WallObstacle__WallPosYAssignment_14 )
            // InternalTankWar.g:1908:3: rule__WallObstacle__WallPosYAssignment_14
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
    // InternalTankWar.g:1916:1: rule__WallObstacle__Group__15 : rule__WallObstacle__Group__15__Impl ;
    public final void rule__WallObstacle__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1920:1: ( rule__WallObstacle__Group__15__Impl )
            // InternalTankWar.g:1921:2: rule__WallObstacle__Group__15__Impl
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
    // InternalTankWar.g:1927:1: rule__WallObstacle__Group__15__Impl : ( '}' ) ;
    public final void rule__WallObstacle__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1931:1: ( ( '}' ) )
            // InternalTankWar.g:1932:1: ( '}' )
            {
            // InternalTankWar.g:1932:1: ( '}' )
            // InternalTankWar.g:1933:2: '}'
            {
             before(grammarAccess.getWallObstacleAccess().getRightCurlyBracketKeyword_15()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTankWar.g:1943:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1947:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // InternalTankWar.g:1948:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
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
    // InternalTankWar.g:1955:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1959:1: ( ( 'field' ) )
            // InternalTankWar.g:1960:1: ( 'field' )
            {
            // InternalTankWar.g:1960:1: ( 'field' )
            // InternalTankWar.g:1961:2: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTankWar.g:1970:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1974:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // InternalTankWar.g:1975:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
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
    // InternalTankWar.g:1982:1: rule__FieldSpecification__Group__1__Impl : ( ( rule__FieldSpecification__NameAssignment_1 ) ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1986:1: ( ( ( rule__FieldSpecification__NameAssignment_1 ) ) )
            // InternalTankWar.g:1987:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1987:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            // InternalTankWar.g:1988:2: ( rule__FieldSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1989:2: ( rule__FieldSpecification__NameAssignment_1 )
            // InternalTankWar.g:1989:3: rule__FieldSpecification__NameAssignment_1
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
    // InternalTankWar.g:1997:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2001:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // InternalTankWar.g:2002:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
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
    // InternalTankWar.g:2009:1: rule__FieldSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2013:1: ( ( '{' ) )
            // InternalTankWar.g:2014:1: ( '{' )
            {
            // InternalTankWar.g:2014:1: ( '{' )
            // InternalTankWar.g:2015:2: '{'
            {
             before(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTankWar.g:2024:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2028:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // InternalTankWar.g:2029:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
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
    // InternalTankWar.g:2036:1: rule__FieldSpecification__Group__3__Impl : ( 'enemyCount' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2040:1: ( ( 'enemyCount' ) )
            // InternalTankWar.g:2041:1: ( 'enemyCount' )
            {
            // InternalTankWar.g:2041:1: ( 'enemyCount' )
            // InternalTankWar.g:2042:2: 'enemyCount'
            {
             before(grammarAccess.getFieldSpecificationAccess().getEnemyCountKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTankWar.g:2051:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2055:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // InternalTankWar.g:2056:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalTankWar.g:2063:1: rule__FieldSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2067:1: ( ( '=' ) )
            // InternalTankWar.g:2068:1: ( '=' )
            {
            // InternalTankWar.g:2068:1: ( '=' )
            // InternalTankWar.g:2069:2: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTankWar.g:2078:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2082:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // InternalTankWar.g:2083:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalTankWar.g:2090:1: rule__FieldSpecification__Group__5__Impl : ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2094:1: ( ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) ) )
            // InternalTankWar.g:2095:1: ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) )
            {
            // InternalTankWar.g:2095:1: ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) )
            // InternalTankWar.g:2096:2: ( rule__FieldSpecification__EnemyCountAssignment_5 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getEnemyCountAssignment_5()); 
            // InternalTankWar.g:2097:2: ( rule__FieldSpecification__EnemyCountAssignment_5 )
            // InternalTankWar.g:2097:3: rule__FieldSpecification__EnemyCountAssignment_5
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
    // InternalTankWar.g:2105:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2109:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // InternalTankWar.g:2110:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalTankWar.g:2117:1: rule__FieldSpecification__Group__6__Impl : ( ( rule__FieldSpecification__ObstacleAssignment_6 ) ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2121:1: ( ( ( rule__FieldSpecification__ObstacleAssignment_6 ) ) )
            // InternalTankWar.g:2122:1: ( ( rule__FieldSpecification__ObstacleAssignment_6 ) )
            {
            // InternalTankWar.g:2122:1: ( ( rule__FieldSpecification__ObstacleAssignment_6 ) )
            // InternalTankWar.g:2123:2: ( rule__FieldSpecification__ObstacleAssignment_6 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getObstacleAssignment_6()); 
            // InternalTankWar.g:2124:2: ( rule__FieldSpecification__ObstacleAssignment_6 )
            // InternalTankWar.g:2124:3: rule__FieldSpecification__ObstacleAssignment_6
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
    // InternalTankWar.g:2132:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2136:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // InternalTankWar.g:2137:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__FieldSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__8();

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
    // InternalTankWar.g:2144:1: rule__FieldSpecification__Group__7__Impl : ( 'nextLevel' ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2148:1: ( ( 'nextLevel' ) )
            // InternalTankWar.g:2149:1: ( 'nextLevel' )
            {
            // InternalTankWar.g:2149:1: ( 'nextLevel' )
            // InternalTankWar.g:2150:2: 'nextLevel'
            {
             before(grammarAccess.getFieldSpecificationAccess().getNextLevelKeyword_7()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getNextLevelKeyword_7()); 

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


    // $ANTLR start "rule__FieldSpecification__Group__8"
    // InternalTankWar.g:2159:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2163:1: ( rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 )
            // InternalTankWar.g:2164:2: rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__FieldSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__9();

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
    // $ANTLR end "rule__FieldSpecification__Group__8"


    // $ANTLR start "rule__FieldSpecification__Group__8__Impl"
    // InternalTankWar.g:2171:1: rule__FieldSpecification__Group__8__Impl : ( 'goto' ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2175:1: ( ( 'goto' ) )
            // InternalTankWar.g:2176:1: ( 'goto' )
            {
            // InternalTankWar.g:2176:1: ( 'goto' )
            // InternalTankWar.g:2177:2: 'goto'
            {
             before(grammarAccess.getFieldSpecificationAccess().getGotoKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getGotoKeyword_8()); 

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
    // $ANTLR end "rule__FieldSpecification__Group__8__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__9"
    // InternalTankWar.g:2186:1: rule__FieldSpecification__Group__9 : rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 ;
    public final void rule__FieldSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2190:1: ( rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 )
            // InternalTankWar.g:2191:2: rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__FieldSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__10();

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
    // $ANTLR end "rule__FieldSpecification__Group__9"


    // $ANTLR start "rule__FieldSpecification__Group__9__Impl"
    // InternalTankWar.g:2198:1: rule__FieldSpecification__Group__9__Impl : ( ( rule__FieldSpecification__NextLevelAssignment_9 ) ) ;
    public final void rule__FieldSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2202:1: ( ( ( rule__FieldSpecification__NextLevelAssignment_9 ) ) )
            // InternalTankWar.g:2203:1: ( ( rule__FieldSpecification__NextLevelAssignment_9 ) )
            {
            // InternalTankWar.g:2203:1: ( ( rule__FieldSpecification__NextLevelAssignment_9 ) )
            // InternalTankWar.g:2204:2: ( rule__FieldSpecification__NextLevelAssignment_9 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNextLevelAssignment_9()); 
            // InternalTankWar.g:2205:2: ( rule__FieldSpecification__NextLevelAssignment_9 )
            // InternalTankWar.g:2205:3: rule__FieldSpecification__NextLevelAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__NextLevelAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getNextLevelAssignment_9()); 

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
    // $ANTLR end "rule__FieldSpecification__Group__9__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__10"
    // InternalTankWar.g:2213:1: rule__FieldSpecification__Group__10 : rule__FieldSpecification__Group__10__Impl ;
    public final void rule__FieldSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2217:1: ( rule__FieldSpecification__Group__10__Impl )
            // InternalTankWar.g:2218:2: rule__FieldSpecification__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__10__Impl();

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
    // $ANTLR end "rule__FieldSpecification__Group__10"


    // $ANTLR start "rule__FieldSpecification__Group__10__Impl"
    // InternalTankWar.g:2224:1: rule__FieldSpecification__Group__10__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2228:1: ( ( '}' ) )
            // InternalTankWar.g:2229:1: ( '}' )
            {
            // InternalTankWar.g:2229:1: ( '}' )
            // InternalTankWar.g:2230:2: '}'
            {
             before(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__FieldSpecification__Group__10__Impl"


    // $ANTLR start "rule__SuperModeDeclaration__Group__0"
    // InternalTankWar.g:2240:1: rule__SuperModeDeclaration__Group__0 : rule__SuperModeDeclaration__Group__0__Impl rule__SuperModeDeclaration__Group__1 ;
    public final void rule__SuperModeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2244:1: ( rule__SuperModeDeclaration__Group__0__Impl rule__SuperModeDeclaration__Group__1 )
            // InternalTankWar.g:2245:2: rule__SuperModeDeclaration__Group__0__Impl rule__SuperModeDeclaration__Group__1
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
    // InternalTankWar.g:2252:1: rule__SuperModeDeclaration__Group__0__Impl : ( 'superMode' ) ;
    public final void rule__SuperModeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2256:1: ( ( 'superMode' ) )
            // InternalTankWar.g:2257:1: ( 'superMode' )
            {
            // InternalTankWar.g:2257:1: ( 'superMode' )
            // InternalTankWar.g:2258:2: 'superMode'
            {
             before(grammarAccess.getSuperModeDeclarationAccess().getSuperModeKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTankWar.g:2267:1: rule__SuperModeDeclaration__Group__1 : rule__SuperModeDeclaration__Group__1__Impl ;
    public final void rule__SuperModeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2271:1: ( rule__SuperModeDeclaration__Group__1__Impl )
            // InternalTankWar.g:2272:2: rule__SuperModeDeclaration__Group__1__Impl
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
    // InternalTankWar.g:2278:1: rule__SuperModeDeclaration__Group__1__Impl : ( () ) ;
    public final void rule__SuperModeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2282:1: ( ( () ) )
            // InternalTankWar.g:2283:1: ( () )
            {
            // InternalTankWar.g:2283:1: ( () )
            // InternalTankWar.g:2284:2: ()
            {
             before(grammarAccess.getSuperModeDeclarationAccess().getSuperModeDeclarationAction_1()); 
            // InternalTankWar.g:2285:2: ()
            // InternalTankWar.g:2285:3: 
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
    // InternalTankWar.g:2294:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2298:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // InternalTankWar.g:2299:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
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
    // InternalTankWar.g:2306:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2310:1: ( ( 'start' ) )
            // InternalTankWar.g:2311:1: ( 'start' )
            {
            // InternalTankWar.g:2311:1: ( 'start' )
            // InternalTankWar.g:2312:2: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTankWar.g:2321:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2325:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // InternalTankWar.g:2326:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
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
    // InternalTankWar.g:2333:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2337:1: ( ( '=' ) )
            // InternalTankWar.g:2338:1: ( '=' )
            {
            // InternalTankWar.g:2338:1: ( '=' )
            // InternalTankWar.g:2339:2: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTankWar.g:2348:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2352:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // InternalTankWar.g:2353:2: rule__StartFieldDeclaration__Group__2__Impl
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
    // InternalTankWar.g:2359:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2363:1: ( ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) )
            // InternalTankWar.g:2364:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            {
            // InternalTankWar.g:2364:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            // InternalTankWar.g:2365:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 
            // InternalTankWar.g:2366:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            // InternalTankWar.g:2366:3: rule__StartFieldDeclaration__FieldAssignment_2
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
    // InternalTankWar.g:2375:1: rule__AllowRestartMenu__Group__0 : rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 ;
    public final void rule__AllowRestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2379:1: ( rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 )
            // InternalTankWar.g:2380:2: rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1
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
    // InternalTankWar.g:2387:1: rule__AllowRestartMenu__Group__0__Impl : ( 'allowRestart' ) ;
    public final void rule__AllowRestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2391:1: ( ( 'allowRestart' ) )
            // InternalTankWar.g:2392:1: ( 'allowRestart' )
            {
            // InternalTankWar.g:2392:1: ( 'allowRestart' )
            // InternalTankWar.g:2393:2: 'allowRestart'
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTankWar.g:2402:1: rule__AllowRestartMenu__Group__1 : rule__AllowRestartMenu__Group__1__Impl ;
    public final void rule__AllowRestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2406:1: ( rule__AllowRestartMenu__Group__1__Impl )
            // InternalTankWar.g:2407:2: rule__AllowRestartMenu__Group__1__Impl
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
    // InternalTankWar.g:2413:1: rule__AllowRestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__AllowRestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2417:1: ( ( () ) )
            // InternalTankWar.g:2418:1: ( () )
            {
            // InternalTankWar.g:2418:1: ( () )
            // InternalTankWar.g:2419:2: ()
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 
            // InternalTankWar.g:2420:2: ()
            // InternalTankWar.g:2420:3: 
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


    // $ANTLR start "rule__Addition__Group__0"
    // InternalTankWar.g:2429:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2433:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalTankWar.g:2434:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalTankWar.g:2441:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2445:1: ( ( ruleMultiplication ) )
            // InternalTankWar.g:2446:1: ( ruleMultiplication )
            {
            // InternalTankWar.g:2446:1: ( ruleMultiplication )
            // InternalTankWar.g:2447:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalTankWar.g:2456:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2460:1: ( rule__Addition__Group__1__Impl )
            // InternalTankWar.g:2461:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalTankWar.g:2467:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2471:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalTankWar.g:2472:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalTankWar.g:2472:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalTankWar.g:2473:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalTankWar.g:2474:2: ( rule__Addition__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTankWar.g:2474:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalTankWar.g:2483:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2487:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalTankWar.g:2488:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalTankWar.g:2495:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2499:1: ( ( () ) )
            // InternalTankWar.g:2500:1: ( () )
            {
            // InternalTankWar.g:2500:1: ( () )
            // InternalTankWar.g:2501:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalTankWar.g:2502:2: ()
            // InternalTankWar.g:2502:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalTankWar.g:2510:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2514:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalTankWar.g:2515:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalTankWar.g:2522:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2526:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalTankWar.g:2527:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalTankWar.g:2527:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalTankWar.g:2528:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalTankWar.g:2529:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalTankWar.g:2529:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalTankWar.g:2537:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2541:1: ( rule__Addition__Group_1__2__Impl )
            // InternalTankWar.g:2542:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalTankWar.g:2548:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2552:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalTankWar.g:2553:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalTankWar.g:2553:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalTankWar.g:2554:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalTankWar.g:2555:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalTankWar.g:2555:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalTankWar.g:2564:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2568:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalTankWar.g:2569:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalTankWar.g:2576:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2580:1: ( ( rulePrimary ) )
            // InternalTankWar.g:2581:1: ( rulePrimary )
            {
            // InternalTankWar.g:2581:1: ( rulePrimary )
            // InternalTankWar.g:2582:2: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalTankWar.g:2591:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2595:1: ( rule__Multiplication__Group__1__Impl )
            // InternalTankWar.g:2596:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalTankWar.g:2602:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2606:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalTankWar.g:2607:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalTankWar.g:2607:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalTankWar.g:2608:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalTankWar.g:2609:2: ( rule__Multiplication__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTankWar.g:2609:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalTankWar.g:2618:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2622:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalTankWar.g:2623:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalTankWar.g:2630:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2634:1: ( ( () ) )
            // InternalTankWar.g:2635:1: ( () )
            {
            // InternalTankWar.g:2635:1: ( () )
            // InternalTankWar.g:2636:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalTankWar.g:2637:2: ()
            // InternalTankWar.g:2637:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalTankWar.g:2645:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2649:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalTankWar.g:2650:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalTankWar.g:2657:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2661:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalTankWar.g:2662:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalTankWar.g:2662:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalTankWar.g:2663:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalTankWar.g:2664:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalTankWar.g:2664:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalTankWar.g:2672:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2676:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalTankWar.g:2677:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalTankWar.g:2683:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2687:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalTankWar.g:2688:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalTankWar.g:2688:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalTankWar.g:2689:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalTankWar.g:2690:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalTankWar.g:2690:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalTankWar.g:2699:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2703:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalTankWar.g:2704:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

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
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalTankWar.g:2711:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2715:1: ( ( '(' ) )
            // InternalTankWar.g:2716:1: ( '(' )
            {
            // InternalTankWar.g:2716:1: ( '(' )
            // InternalTankWar.g:2717:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalTankWar.g:2726:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2730:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalTankWar.g:2731:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

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
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalTankWar.g:2738:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2742:1: ( ( ruleAddition ) )
            // InternalTankWar.g:2743:1: ( ruleAddition )
            {
            // InternalTankWar.g:2743:1: ( ruleAddition )
            // InternalTankWar.g:2744:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalTankWar.g:2753:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2757:1: ( rule__Primary__Group_2__2__Impl )
            // InternalTankWar.g:2758:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalTankWar.g:2764:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2768:1: ( ( ')' ) )
            // InternalTankWar.g:2769:1: ( ')' )
            {
            // InternalTankWar.g:2769:1: ( ')' )
            // InternalTankWar.g:2770:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalTankWar.g:2780:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2784:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalTankWar.g:2785:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

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
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalTankWar.g:2792:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2796:1: ( ( ( RULE_INT )? ) )
            // InternalTankWar.g:2797:1: ( ( RULE_INT )? )
            {
            // InternalTankWar.g:2797:1: ( ( RULE_INT )? )
            // InternalTankWar.g:2798:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalTankWar.g:2799:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTankWar.g:2799:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalTankWar.g:2807:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2811:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalTankWar.g:2812:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

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
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalTankWar.g:2819:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2823:1: ( ( '.' ) )
            // InternalTankWar.g:2824:1: ( '.' )
            {
            // InternalTankWar.g:2824:1: ( '.' )
            // InternalTankWar.g:2825:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalTankWar.g:2834:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2838:1: ( rule__REAL__Group__2__Impl )
            // InternalTankWar.g:2839:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

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
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalTankWar.g:2845:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2849:1: ( ( RULE_INT ) )
            // InternalTankWar.g:2850:1: ( RULE_INT )
            {
            // InternalTankWar.g:2850:1: ( RULE_INT )
            // InternalTankWar.g:2851:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__TankWarGame__NameAssignment_1"
    // InternalTankWar.g:2861:1: rule__TankWarGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TankWarGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2865:1: ( ( RULE_ID ) )
            // InternalTankWar.g:2866:2: ( RULE_ID )
            {
            // InternalTankWar.g:2866:2: ( RULE_ID )
            // InternalTankWar.g:2867:3: RULE_ID
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
    // InternalTankWar.g:2876:1: rule__TankWarGame__ScreenAssignment_3 : ( ruleScreenSpecification ) ;
    public final void rule__TankWarGame__ScreenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2880:1: ( ( ruleScreenSpecification ) )
            // InternalTankWar.g:2881:2: ( ruleScreenSpecification )
            {
            // InternalTankWar.g:2881:2: ( ruleScreenSpecification )
            // InternalTankWar.g:2882:3: ruleScreenSpecification
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
    // InternalTankWar.g:2891:1: rule__TankWarGame__FieldsAssignment_4 : ( ruleFieldSpecification ) ;
    public final void rule__TankWarGame__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2895:1: ( ( ruleFieldSpecification ) )
            // InternalTankWar.g:2896:2: ( ruleFieldSpecification )
            {
            // InternalTankWar.g:2896:2: ( ruleFieldSpecification )
            // InternalTankWar.g:2897:3: ruleFieldSpecification
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
    // InternalTankWar.g:2906:1: rule__TankWarGame__OptionsAssignment_5 : ( ruleOptionSpecification ) ;
    public final void rule__TankWarGame__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2910:1: ( ( ruleOptionSpecification ) )
            // InternalTankWar.g:2911:2: ( ruleOptionSpecification )
            {
            // InternalTankWar.g:2911:2: ( ruleOptionSpecification )
            // InternalTankWar.g:2912:3: ruleOptionSpecification
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
    // InternalTankWar.g:2921:1: rule__EndGameBehaviour__WinAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EndGameBehaviour__WinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2925:1: ( ( RULE_STRING ) )
            // InternalTankWar.g:2926:2: ( RULE_STRING )
            {
            // InternalTankWar.g:2926:2: ( RULE_STRING )
            // InternalTankWar.g:2927:3: RULE_STRING
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
    // InternalTankWar.g:2936:1: rule__EndGameBehaviour__LostAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EndGameBehaviour__LostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2940:1: ( ( RULE_STRING ) )
            // InternalTankWar.g:2941:2: ( RULE_STRING )
            {
            // InternalTankWar.g:2941:2: ( RULE_STRING )
            // InternalTankWar.g:2942:3: RULE_STRING
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


    // $ANTLR start "rule__ScreenSpecification__NameAssignment_1"
    // InternalTankWar.g:2951:1: rule__ScreenSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScreenSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2955:1: ( ( RULE_ID ) )
            // InternalTankWar.g:2956:2: ( RULE_ID )
            {
            // InternalTankWar.g:2956:2: ( RULE_ID )
            // InternalTankWar.g:2957:3: RULE_ID
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
    // InternalTankWar.g:2966:1: rule__ScreenSpecification__ScreenWidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__ScreenSpecification__ScreenWidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2970:1: ( ( RULE_INT ) )
            // InternalTankWar.g:2971:2: ( RULE_INT )
            {
            // InternalTankWar.g:2971:2: ( RULE_INT )
            // InternalTankWar.g:2972:3: RULE_INT
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
    // InternalTankWar.g:2981:1: rule__ScreenSpecification__ScreenHeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__ScreenSpecification__ScreenHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2985:1: ( ( RULE_INT ) )
            // InternalTankWar.g:2986:2: ( RULE_INT )
            {
            // InternalTankWar.g:2986:2: ( RULE_INT )
            // InternalTankWar.g:2987:3: RULE_INT
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
    // InternalTankWar.g:2996:1: rule__Obstaclepecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Obstaclepecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3000:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3001:2: ( RULE_ID )
            {
            // InternalTankWar.g:3001:2: ( RULE_ID )
            // InternalTankWar.g:3002:3: RULE_ID
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
    // InternalTankWar.g:3011:1: rule__Obstaclepecification__FieldsAssignment_3 : ( ruleObstacleMember ) ;
    public final void rule__Obstaclepecification__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3015:1: ( ( ruleObstacleMember ) )
            // InternalTankWar.g:3016:2: ( ruleObstacleMember )
            {
            // InternalTankWar.g:3016:2: ( ruleObstacleMember )
            // InternalTankWar.g:3017:3: ruleObstacleMember
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
    // InternalTankWar.g:3026:1: rule__WaterObstacle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WaterObstacle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3030:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3031:2: ( RULE_ID )
            {
            // InternalTankWar.g:3031:2: ( RULE_ID )
            // InternalTankWar.g:3032:3: RULE_ID
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
    // InternalTankWar.g:3041:1: rule__WallObstacle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WallObstacle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3045:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3046:2: ( RULE_ID )
            {
            // InternalTankWar.g:3046:2: ( RULE_ID )
            // InternalTankWar.g:3047:3: RULE_ID
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
    // InternalTankWar.g:3056:1: rule__WallObstacle__WallWidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallWidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3060:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3061:2: ( RULE_INT )
            {
            // InternalTankWar.g:3061:2: ( RULE_INT )
            // InternalTankWar.g:3062:3: RULE_INT
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
    // InternalTankWar.g:3071:1: rule__WallObstacle__WallHeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3075:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3076:2: ( RULE_INT )
            {
            // InternalTankWar.g:3076:2: ( RULE_INT )
            // InternalTankWar.g:3077:3: RULE_INT
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
    // InternalTankWar.g:3086:1: rule__WallObstacle__WallPosXAssignment_11 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallPosXAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3090:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3091:2: ( RULE_INT )
            {
            // InternalTankWar.g:3091:2: ( RULE_INT )
            // InternalTankWar.g:3092:3: RULE_INT
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
    // InternalTankWar.g:3101:1: rule__WallObstacle__WallPosYAssignment_14 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallPosYAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3105:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3106:2: ( RULE_INT )
            {
            // InternalTankWar.g:3106:2: ( RULE_INT )
            // InternalTankWar.g:3107:3: RULE_INT
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
    // InternalTankWar.g:3116:1: rule__FieldSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3120:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3121:2: ( RULE_ID )
            {
            // InternalTankWar.g:3121:2: ( RULE_ID )
            // InternalTankWar.g:3122:3: RULE_ID
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
    // InternalTankWar.g:3131:1: rule__FieldSpecification__EnemyCountAssignment_5 : ( ruleAddition ) ;
    public final void rule__FieldSpecification__EnemyCountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3135:1: ( ( ruleAddition ) )
            // InternalTankWar.g:3136:2: ( ruleAddition )
            {
            // InternalTankWar.g:3136:2: ( ruleAddition )
            // InternalTankWar.g:3137:3: ruleAddition
            {
             before(grammarAccess.getFieldSpecificationAccess().getEnemyCountAdditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getFieldSpecificationAccess().getEnemyCountAdditionParserRuleCall_5_0()); 

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
    // InternalTankWar.g:3146:1: rule__FieldSpecification__ObstacleAssignment_6 : ( ruleObstaclepecification ) ;
    public final void rule__FieldSpecification__ObstacleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3150:1: ( ( ruleObstaclepecification ) )
            // InternalTankWar.g:3151:2: ( ruleObstaclepecification )
            {
            // InternalTankWar.g:3151:2: ( ruleObstaclepecification )
            // InternalTankWar.g:3152:3: ruleObstaclepecification
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


    // $ANTLR start "rule__FieldSpecification__NextLevelAssignment_9"
    // InternalTankWar.g:3161:1: rule__FieldSpecification__NextLevelAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__FieldSpecification__NextLevelAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3165:1: ( ( ( RULE_ID ) ) )
            // InternalTankWar.g:3166:2: ( ( RULE_ID ) )
            {
            // InternalTankWar.g:3166:2: ( ( RULE_ID ) )
            // InternalTankWar.g:3167:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNextLevelFieldSpecificationCrossReference_9_0()); 
            // InternalTankWar.g:3168:3: ( RULE_ID )
            // InternalTankWar.g:3169:4: RULE_ID
            {
             before(grammarAccess.getFieldSpecificationAccess().getNextLevelFieldSpecificationIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getNextLevelFieldSpecificationIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getFieldSpecificationAccess().getNextLevelFieldSpecificationCrossReference_9_0()); 

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
    // $ANTLR end "rule__FieldSpecification__NextLevelAssignment_9"


    // $ANTLR start "rule__StartFieldDeclaration__FieldAssignment_2"
    // InternalTankWar.g:3180:1: rule__StartFieldDeclaration__FieldAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartFieldDeclaration__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3184:1: ( ( ( RULE_ID ) ) )
            // InternalTankWar.g:3185:2: ( ( RULE_ID ) )
            {
            // InternalTankWar.g:3185:2: ( ( RULE_ID ) )
            // InternalTankWar.g:3186:3: ( RULE_ID )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 
            // InternalTankWar.g:3187:3: ( RULE_ID )
            // InternalTankWar.g:3188:4: RULE_ID
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


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalTankWar.g:3199:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3203:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalTankWar.g:3204:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTankWar.g:3204:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalTankWar.g:3205:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTankWar.g:3206:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalTankWar.g:3206:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalTankWar.g:3214:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3218:1: ( ( ruleMultiplication ) )
            // InternalTankWar.g:3219:2: ( ruleMultiplication )
            {
            // InternalTankWar.g:3219:2: ( ruleMultiplication )
            // InternalTankWar.g:3220:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalTankWar.g:3229:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3233:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalTankWar.g:3234:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTankWar.g:3234:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalTankWar.g:3235:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTankWar.g:3236:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalTankWar.g:3236:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalTankWar.g:3244:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3248:1: ( ( rulePrimary ) )
            // InternalTankWar.g:3249:2: ( rulePrimary )
            {
            // InternalTankWar.g:3249:2: ( rulePrimary )
            // InternalTankWar.g:3250:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalTankWar.g:3259:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3263:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3264:2: ( RULE_INT )
            {
            // InternalTankWar.g:3264:2: ( RULE_INT )
            // InternalTankWar.g:3265:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__RealLiteral__ValAssignment"
    // InternalTankWar.g:3274:1: rule__RealLiteral__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3278:1: ( ( ruleREAL ) )
            // InternalTankWar.g:3279:2: ( ruleREAL )
            {
            // InternalTankWar.g:3279:2: ( ruleREAL )
            // InternalTankWar.g:3280:3: ruleREAL
            {
             before(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 

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
    // $ANTLR end "rule__RealLiteral__ValAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000E000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000E000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000080010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000010L});

}