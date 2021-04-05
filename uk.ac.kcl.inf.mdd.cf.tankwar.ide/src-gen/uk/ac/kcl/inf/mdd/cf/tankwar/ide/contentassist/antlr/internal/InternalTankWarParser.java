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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'game'", "'{'", "'}'", "'var'", "'='", "'end-game'", "'('", "','", "')'", "'screen'", "'screenWidth'", "'screenHeight'", "'obstacle'", "'water'", "'wall'", "'wallWidth'", "'wallHeight'", "'wallPosX'", "'wallPosY'", "'field'", "'enemyCount'", "'nextLevel'", "'goto'", "'superMode'", "'start'", "'allowRestart'", "'.'"
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTankWar.g:78:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalTankWar.g:79:1: ( ruleVariableDeclaration EOF )
            // InternalTankWar.g:80:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTankWar.g:87:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:91:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalTankWar.g:92:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalTankWar.g:92:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalTankWar.g:93:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalTankWar.g:94:3: ( rule__VariableDeclaration__Group__0 )
            // InternalTankWar.g:94:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableDeclaration"


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


    // $ANTLR start "entryRuleScreenSpecification"
    // InternalTankWar.g:128:1: entryRuleScreenSpecification : ruleScreenSpecification EOF ;
    public final void entryRuleScreenSpecification() throws RecognitionException {
        try {
            // InternalTankWar.g:129:1: ( ruleScreenSpecification EOF )
            // InternalTankWar.g:130:1: ruleScreenSpecification EOF
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
    // InternalTankWar.g:137:1: ruleScreenSpecification : ( ( rule__ScreenSpecification__Group__0 ) ) ;
    public final void ruleScreenSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:141:2: ( ( ( rule__ScreenSpecification__Group__0 ) ) )
            // InternalTankWar.g:142:2: ( ( rule__ScreenSpecification__Group__0 ) )
            {
            // InternalTankWar.g:142:2: ( ( rule__ScreenSpecification__Group__0 ) )
            // InternalTankWar.g:143:3: ( rule__ScreenSpecification__Group__0 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getGroup()); 
            // InternalTankWar.g:144:3: ( rule__ScreenSpecification__Group__0 )
            // InternalTankWar.g:144:4: rule__ScreenSpecification__Group__0
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
    // InternalTankWar.g:153:1: entryRuleObstaclepecification : ruleObstaclepecification EOF ;
    public final void entryRuleObstaclepecification() throws RecognitionException {
        try {
            // InternalTankWar.g:154:1: ( ruleObstaclepecification EOF )
            // InternalTankWar.g:155:1: ruleObstaclepecification EOF
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
    // InternalTankWar.g:162:1: ruleObstaclepecification : ( ( rule__Obstaclepecification__Group__0 ) ) ;
    public final void ruleObstaclepecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:166:2: ( ( ( rule__Obstaclepecification__Group__0 ) ) )
            // InternalTankWar.g:167:2: ( ( rule__Obstaclepecification__Group__0 ) )
            {
            // InternalTankWar.g:167:2: ( ( rule__Obstaclepecification__Group__0 ) )
            // InternalTankWar.g:168:3: ( rule__Obstaclepecification__Group__0 )
            {
             before(grammarAccess.getObstaclepecificationAccess().getGroup()); 
            // InternalTankWar.g:169:3: ( rule__Obstaclepecification__Group__0 )
            // InternalTankWar.g:169:4: rule__Obstaclepecification__Group__0
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
    // InternalTankWar.g:178:1: entryRuleObstacleMember : ruleObstacleMember EOF ;
    public final void entryRuleObstacleMember() throws RecognitionException {
        try {
            // InternalTankWar.g:179:1: ( ruleObstacleMember EOF )
            // InternalTankWar.g:180:1: ruleObstacleMember EOF
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
    // InternalTankWar.g:187:1: ruleObstacleMember : ( ( rule__ObstacleMember__Alternatives ) ) ;
    public final void ruleObstacleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:191:2: ( ( ( rule__ObstacleMember__Alternatives ) ) )
            // InternalTankWar.g:192:2: ( ( rule__ObstacleMember__Alternatives ) )
            {
            // InternalTankWar.g:192:2: ( ( rule__ObstacleMember__Alternatives ) )
            // InternalTankWar.g:193:3: ( rule__ObstacleMember__Alternatives )
            {
             before(grammarAccess.getObstacleMemberAccess().getAlternatives()); 
            // InternalTankWar.g:194:3: ( rule__ObstacleMember__Alternatives )
            // InternalTankWar.g:194:4: rule__ObstacleMember__Alternatives
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
    // InternalTankWar.g:203:1: entryRuleWaterObstacle : ruleWaterObstacle EOF ;
    public final void entryRuleWaterObstacle() throws RecognitionException {
        try {
            // InternalTankWar.g:204:1: ( ruleWaterObstacle EOF )
            // InternalTankWar.g:205:1: ruleWaterObstacle EOF
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
    // InternalTankWar.g:212:1: ruleWaterObstacle : ( ( rule__WaterObstacle__Group__0 ) ) ;
    public final void ruleWaterObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:216:2: ( ( ( rule__WaterObstacle__Group__0 ) ) )
            // InternalTankWar.g:217:2: ( ( rule__WaterObstacle__Group__0 ) )
            {
            // InternalTankWar.g:217:2: ( ( rule__WaterObstacle__Group__0 ) )
            // InternalTankWar.g:218:3: ( rule__WaterObstacle__Group__0 )
            {
             before(grammarAccess.getWaterObstacleAccess().getGroup()); 
            // InternalTankWar.g:219:3: ( rule__WaterObstacle__Group__0 )
            // InternalTankWar.g:219:4: rule__WaterObstacle__Group__0
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
    // InternalTankWar.g:228:1: entryRuleWallObstacle : ruleWallObstacle EOF ;
    public final void entryRuleWallObstacle() throws RecognitionException {
        try {
            // InternalTankWar.g:229:1: ( ruleWallObstacle EOF )
            // InternalTankWar.g:230:1: ruleWallObstacle EOF
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
    // InternalTankWar.g:237:1: ruleWallObstacle : ( ( rule__WallObstacle__Group__0 ) ) ;
    public final void ruleWallObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:241:2: ( ( ( rule__WallObstacle__Group__0 ) ) )
            // InternalTankWar.g:242:2: ( ( rule__WallObstacle__Group__0 ) )
            {
            // InternalTankWar.g:242:2: ( ( rule__WallObstacle__Group__0 ) )
            // InternalTankWar.g:243:3: ( rule__WallObstacle__Group__0 )
            {
             before(grammarAccess.getWallObstacleAccess().getGroup()); 
            // InternalTankWar.g:244:3: ( rule__WallObstacle__Group__0 )
            // InternalTankWar.g:244:4: rule__WallObstacle__Group__0
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
    // InternalTankWar.g:253:1: entryRuleFieldSpecification : ruleFieldSpecification EOF ;
    public final void entryRuleFieldSpecification() throws RecognitionException {
        try {
            // InternalTankWar.g:254:1: ( ruleFieldSpecification EOF )
            // InternalTankWar.g:255:1: ruleFieldSpecification EOF
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
    // InternalTankWar.g:262:1: ruleFieldSpecification : ( ( rule__FieldSpecification__Group__0 ) ) ;
    public final void ruleFieldSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:266:2: ( ( ( rule__FieldSpecification__Group__0 ) ) )
            // InternalTankWar.g:267:2: ( ( rule__FieldSpecification__Group__0 ) )
            {
            // InternalTankWar.g:267:2: ( ( rule__FieldSpecification__Group__0 ) )
            // InternalTankWar.g:268:3: ( rule__FieldSpecification__Group__0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getGroup()); 
            // InternalTankWar.g:269:3: ( rule__FieldSpecification__Group__0 )
            // InternalTankWar.g:269:4: rule__FieldSpecification__Group__0
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
    // InternalTankWar.g:278:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // InternalTankWar.g:279:1: ( ruleOptionSpecification EOF )
            // InternalTankWar.g:280:1: ruleOptionSpecification EOF
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
    // InternalTankWar.g:287:1: ruleOptionSpecification : ( ( rule__OptionSpecification__Alternatives ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:291:2: ( ( ( rule__OptionSpecification__Alternatives ) ) )
            // InternalTankWar.g:292:2: ( ( rule__OptionSpecification__Alternatives ) )
            {
            // InternalTankWar.g:292:2: ( ( rule__OptionSpecification__Alternatives ) )
            // InternalTankWar.g:293:3: ( rule__OptionSpecification__Alternatives )
            {
             before(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 
            // InternalTankWar.g:294:3: ( rule__OptionSpecification__Alternatives )
            // InternalTankWar.g:294:4: rule__OptionSpecification__Alternatives
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
    // InternalTankWar.g:303:1: entryRuleSuperModeDeclaration : ruleSuperModeDeclaration EOF ;
    public final void entryRuleSuperModeDeclaration() throws RecognitionException {
        try {
            // InternalTankWar.g:304:1: ( ruleSuperModeDeclaration EOF )
            // InternalTankWar.g:305:1: ruleSuperModeDeclaration EOF
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
    // InternalTankWar.g:312:1: ruleSuperModeDeclaration : ( ( rule__SuperModeDeclaration__Group__0 ) ) ;
    public final void ruleSuperModeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:316:2: ( ( ( rule__SuperModeDeclaration__Group__0 ) ) )
            // InternalTankWar.g:317:2: ( ( rule__SuperModeDeclaration__Group__0 ) )
            {
            // InternalTankWar.g:317:2: ( ( rule__SuperModeDeclaration__Group__0 ) )
            // InternalTankWar.g:318:3: ( rule__SuperModeDeclaration__Group__0 )
            {
             before(grammarAccess.getSuperModeDeclarationAccess().getGroup()); 
            // InternalTankWar.g:319:3: ( rule__SuperModeDeclaration__Group__0 )
            // InternalTankWar.g:319:4: rule__SuperModeDeclaration__Group__0
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
    // InternalTankWar.g:328:1: entryRuleStartFieldDeclaration : ruleStartFieldDeclaration EOF ;
    public final void entryRuleStartFieldDeclaration() throws RecognitionException {
        try {
            // InternalTankWar.g:329:1: ( ruleStartFieldDeclaration EOF )
            // InternalTankWar.g:330:1: ruleStartFieldDeclaration EOF
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
    // InternalTankWar.g:337:1: ruleStartFieldDeclaration : ( ( rule__StartFieldDeclaration__Group__0 ) ) ;
    public final void ruleStartFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:341:2: ( ( ( rule__StartFieldDeclaration__Group__0 ) ) )
            // InternalTankWar.g:342:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            {
            // InternalTankWar.g:342:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            // InternalTankWar.g:343:3: ( rule__StartFieldDeclaration__Group__0 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 
            // InternalTankWar.g:344:3: ( rule__StartFieldDeclaration__Group__0 )
            // InternalTankWar.g:344:4: rule__StartFieldDeclaration__Group__0
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
    // InternalTankWar.g:353:1: entryRuleAllowRestartMenu : ruleAllowRestartMenu EOF ;
    public final void entryRuleAllowRestartMenu() throws RecognitionException {
        try {
            // InternalTankWar.g:354:1: ( ruleAllowRestartMenu EOF )
            // InternalTankWar.g:355:1: ruleAllowRestartMenu EOF
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
    // InternalTankWar.g:362:1: ruleAllowRestartMenu : ( ( rule__AllowRestartMenu__Group__0 ) ) ;
    public final void ruleAllowRestartMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:366:2: ( ( ( rule__AllowRestartMenu__Group__0 ) ) )
            // InternalTankWar.g:367:2: ( ( rule__AllowRestartMenu__Group__0 ) )
            {
            // InternalTankWar.g:367:2: ( ( rule__AllowRestartMenu__Group__0 ) )
            // InternalTankWar.g:368:3: ( rule__AllowRestartMenu__Group__0 )
            {
             before(grammarAccess.getAllowRestartMenuAccess().getGroup()); 
            // InternalTankWar.g:369:3: ( rule__AllowRestartMenu__Group__0 )
            // InternalTankWar.g:369:4: rule__AllowRestartMenu__Group__0
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
    // InternalTankWar.g:378:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalTankWar.g:379:1: ( ruleAddition EOF )
            // InternalTankWar.g:380:1: ruleAddition EOF
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
    // InternalTankWar.g:387:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:391:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalTankWar.g:392:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalTankWar.g:392:2: ( ( rule__Addition__Group__0 ) )
            // InternalTankWar.g:393:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalTankWar.g:394:3: ( rule__Addition__Group__0 )
            // InternalTankWar.g:394:4: rule__Addition__Group__0
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
    // InternalTankWar.g:403:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalTankWar.g:404:1: ( ruleMultiplication EOF )
            // InternalTankWar.g:405:1: ruleMultiplication EOF
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
    // InternalTankWar.g:412:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:416:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalTankWar.g:417:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalTankWar.g:417:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalTankWar.g:418:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalTankWar.g:419:3: ( rule__Multiplication__Group__0 )
            // InternalTankWar.g:419:4: rule__Multiplication__Group__0
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
    // InternalTankWar.g:428:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTankWar.g:429:1: ( rulePrimary EOF )
            // InternalTankWar.g:430:1: rulePrimary EOF
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
    // InternalTankWar.g:437:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:441:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTankWar.g:442:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTankWar.g:442:2: ( ( rule__Primary__Alternatives ) )
            // InternalTankWar.g:443:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTankWar.g:444:3: ( rule__Primary__Alternatives )
            // InternalTankWar.g:444:4: rule__Primary__Alternatives
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


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalTankWar.g:453:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalTankWar.g:454:1: ( ruleIntVarExpression EOF )
            // InternalTankWar.g:455:1: ruleIntVarExpression EOF
            {
             before(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntVarExpression();

            state._fsp--;

             after(grammarAccess.getIntVarExpressionRule()); 
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
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalTankWar.g:462:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:466:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalTankWar.g:467:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalTankWar.g:467:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalTankWar.g:468:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalTankWar.g:469:3: ( rule__IntVarExpression__VarAssignment )
            // InternalTankWar.g:469:4: rule__IntVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 

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
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalTankWar.g:478:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalTankWar.g:479:1: ( ruleIntLiteral EOF )
            // InternalTankWar.g:480:1: ruleIntLiteral EOF
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
    // InternalTankWar.g:487:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:491:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalTankWar.g:492:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalTankWar.g:492:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalTankWar.g:493:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalTankWar.g:494:3: ( rule__IntLiteral__ValAssignment )
            // InternalTankWar.g:494:4: rule__IntLiteral__ValAssignment
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
    // InternalTankWar.g:503:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalTankWar.g:504:1: ( ruleRealLiteral EOF )
            // InternalTankWar.g:505:1: ruleRealLiteral EOF
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
    // InternalTankWar.g:512:1: ruleRealLiteral : ( ( rule__RealLiteral__ValAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:516:2: ( ( ( rule__RealLiteral__ValAssignment ) ) )
            // InternalTankWar.g:517:2: ( ( rule__RealLiteral__ValAssignment ) )
            {
            // InternalTankWar.g:517:2: ( ( rule__RealLiteral__ValAssignment ) )
            // InternalTankWar.g:518:3: ( rule__RealLiteral__ValAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getValAssignment()); 
            // InternalTankWar.g:519:3: ( rule__RealLiteral__ValAssignment )
            // InternalTankWar.g:519:4: rule__RealLiteral__ValAssignment
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
    // InternalTankWar.g:528:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTankWar.g:532:1: ( ruleREAL EOF )
            // InternalTankWar.g:533:1: ruleREAL EOF
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
    // InternalTankWar.g:543:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:548:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalTankWar.g:549:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalTankWar.g:549:2: ( ( rule__REAL__Group__0 ) )
            // InternalTankWar.g:550:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalTankWar.g:551:3: ( rule__REAL__Group__0 )
            // InternalTankWar.g:551:4: rule__REAL__Group__0
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
    // InternalTankWar.g:560:1: rule__ObstacleMember__Alternatives : ( ( ruleWallObstacle ) | ( ruleWaterObstacle ) );
    public final void rule__ObstacleMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:564:1: ( ( ruleWallObstacle ) | ( ruleWaterObstacle ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==28) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTankWar.g:565:2: ( ruleWallObstacle )
                    {
                    // InternalTankWar.g:565:2: ( ruleWallObstacle )
                    // InternalTankWar.g:566:3: ruleWallObstacle
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
                    // InternalTankWar.g:571:2: ( ruleWaterObstacle )
                    {
                    // InternalTankWar.g:571:2: ( ruleWaterObstacle )
                    // InternalTankWar.g:572:3: ruleWaterObstacle
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
    // InternalTankWar.g:581:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) | ( ruleSuperModeDeclaration ) | ( ruleEndGameBehaviour ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:585:1: ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) | ( ruleSuperModeDeclaration ) | ( ruleEndGameBehaviour ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            case 20:
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
                    // InternalTankWar.g:586:2: ( ruleStartFieldDeclaration )
                    {
                    // InternalTankWar.g:586:2: ( ruleStartFieldDeclaration )
                    // InternalTankWar.g:587:3: ruleStartFieldDeclaration
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
                    // InternalTankWar.g:592:2: ( ruleAllowRestartMenu )
                    {
                    // InternalTankWar.g:592:2: ( ruleAllowRestartMenu )
                    // InternalTankWar.g:593:3: ruleAllowRestartMenu
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
                    // InternalTankWar.g:598:2: ( ruleSuperModeDeclaration )
                    {
                    // InternalTankWar.g:598:2: ( ruleSuperModeDeclaration )
                    // InternalTankWar.g:599:3: ruleSuperModeDeclaration
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
                    // InternalTankWar.g:604:2: ( ruleEndGameBehaviour )
                    {
                    // InternalTankWar.g:604:2: ( ruleEndGameBehaviour )
                    // InternalTankWar.g:605:3: ruleEndGameBehaviour
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
    // InternalTankWar.g:614:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:618:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalTankWar.g:619:2: ( '+' )
                    {
                    // InternalTankWar.g:619:2: ( '+' )
                    // InternalTankWar.g:620:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTankWar.g:625:2: ( '-' )
                    {
                    // InternalTankWar.g:625:2: ( '-' )
                    // InternalTankWar.g:626:3: '-'
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
    // InternalTankWar.g:635:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:639:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalTankWar.g:640:2: ( '*' )
                    {
                    // InternalTankWar.g:640:2: ( '*' )
                    // InternalTankWar.g:641:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTankWar.g:646:2: ( '/' )
                    {
                    // InternalTankWar.g:646:2: ( '/' )
                    // InternalTankWar.g:647:3: '/'
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
    // InternalTankWar.g:656:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:660:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=11 && LA5_1<=14)||LA5_1==23||LA5_1==27) ) {
                    alt5=1;
                }
                else if ( (LA5_1==41) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 41:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTankWar.g:661:2: ( ruleIntLiteral )
                    {
                    // InternalTankWar.g:661:2: ( ruleIntLiteral )
                    // InternalTankWar.g:662:3: ruleIntLiteral
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
                    // InternalTankWar.g:667:2: ( ruleIntVarExpression )
                    {
                    // InternalTankWar.g:667:2: ( ruleIntVarExpression )
                    // InternalTankWar.g:668:3: ruleIntVarExpression
                    {
                     before(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntVarExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTankWar.g:673:2: ( ruleRealLiteral )
                    {
                    // InternalTankWar.g:673:2: ( ruleRealLiteral )
                    // InternalTankWar.g:674:3: ruleRealLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTankWar.g:679:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalTankWar.g:679:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalTankWar.g:680:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalTankWar.g:681:3: ( rule__Primary__Group_3__0 )
                    // InternalTankWar.g:681:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

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
    // InternalTankWar.g:689:1: rule__TankWarGame__Group__0 : rule__TankWarGame__Group__0__Impl rule__TankWarGame__Group__1 ;
    public final void rule__TankWarGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:693:1: ( rule__TankWarGame__Group__0__Impl rule__TankWarGame__Group__1 )
            // InternalTankWar.g:694:2: rule__TankWarGame__Group__0__Impl rule__TankWarGame__Group__1
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
    // InternalTankWar.g:701:1: rule__TankWarGame__Group__0__Impl : ( 'game' ) ;
    public final void rule__TankWarGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:705:1: ( ( 'game' ) )
            // InternalTankWar.g:706:1: ( 'game' )
            {
            // InternalTankWar.g:706:1: ( 'game' )
            // InternalTankWar.g:707:2: 'game'
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
    // InternalTankWar.g:716:1: rule__TankWarGame__Group__1 : rule__TankWarGame__Group__1__Impl rule__TankWarGame__Group__2 ;
    public final void rule__TankWarGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:720:1: ( rule__TankWarGame__Group__1__Impl rule__TankWarGame__Group__2 )
            // InternalTankWar.g:721:2: rule__TankWarGame__Group__1__Impl rule__TankWarGame__Group__2
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
    // InternalTankWar.g:728:1: rule__TankWarGame__Group__1__Impl : ( ( rule__TankWarGame__NameAssignment_1 ) ) ;
    public final void rule__TankWarGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:732:1: ( ( ( rule__TankWarGame__NameAssignment_1 ) ) )
            // InternalTankWar.g:733:1: ( ( rule__TankWarGame__NameAssignment_1 ) )
            {
            // InternalTankWar.g:733:1: ( ( rule__TankWarGame__NameAssignment_1 ) )
            // InternalTankWar.g:734:2: ( rule__TankWarGame__NameAssignment_1 )
            {
             before(grammarAccess.getTankWarGameAccess().getNameAssignment_1()); 
            // InternalTankWar.g:735:2: ( rule__TankWarGame__NameAssignment_1 )
            // InternalTankWar.g:735:3: rule__TankWarGame__NameAssignment_1
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
    // InternalTankWar.g:743:1: rule__TankWarGame__Group__2 : rule__TankWarGame__Group__2__Impl rule__TankWarGame__Group__3 ;
    public final void rule__TankWarGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:747:1: ( rule__TankWarGame__Group__2__Impl rule__TankWarGame__Group__3 )
            // InternalTankWar.g:748:2: rule__TankWarGame__Group__2__Impl rule__TankWarGame__Group__3
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
    // InternalTankWar.g:755:1: rule__TankWarGame__Group__2__Impl : ( '{' ) ;
    public final void rule__TankWarGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:759:1: ( ( '{' ) )
            // InternalTankWar.g:760:1: ( '{' )
            {
            // InternalTankWar.g:760:1: ( '{' )
            // InternalTankWar.g:761:2: '{'
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
    // InternalTankWar.g:770:1: rule__TankWarGame__Group__3 : rule__TankWarGame__Group__3__Impl rule__TankWarGame__Group__4 ;
    public final void rule__TankWarGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:774:1: ( rule__TankWarGame__Group__3__Impl rule__TankWarGame__Group__4 )
            // InternalTankWar.g:775:2: rule__TankWarGame__Group__3__Impl rule__TankWarGame__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalTankWar.g:782:1: rule__TankWarGame__Group__3__Impl : ( ( rule__TankWarGame__VariableAssignment_3 )? ) ;
    public final void rule__TankWarGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:786:1: ( ( ( rule__TankWarGame__VariableAssignment_3 )? ) )
            // InternalTankWar.g:787:1: ( ( rule__TankWarGame__VariableAssignment_3 )? )
            {
            // InternalTankWar.g:787:1: ( ( rule__TankWarGame__VariableAssignment_3 )? )
            // InternalTankWar.g:788:2: ( rule__TankWarGame__VariableAssignment_3 )?
            {
             before(grammarAccess.getTankWarGameAccess().getVariableAssignment_3()); 
            // InternalTankWar.g:789:2: ( rule__TankWarGame__VariableAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTankWar.g:789:3: rule__TankWarGame__VariableAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TankWarGame__VariableAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTankWarGameAccess().getVariableAssignment_3()); 

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
    // InternalTankWar.g:797:1: rule__TankWarGame__Group__4 : rule__TankWarGame__Group__4__Impl rule__TankWarGame__Group__5 ;
    public final void rule__TankWarGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:801:1: ( rule__TankWarGame__Group__4__Impl rule__TankWarGame__Group__5 )
            // InternalTankWar.g:802:2: rule__TankWarGame__Group__4__Impl rule__TankWarGame__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalTankWar.g:809:1: rule__TankWarGame__Group__4__Impl : ( ( rule__TankWarGame__ScreenAssignment_4 ) ) ;
    public final void rule__TankWarGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:813:1: ( ( ( rule__TankWarGame__ScreenAssignment_4 ) ) )
            // InternalTankWar.g:814:1: ( ( rule__TankWarGame__ScreenAssignment_4 ) )
            {
            // InternalTankWar.g:814:1: ( ( rule__TankWarGame__ScreenAssignment_4 ) )
            // InternalTankWar.g:815:2: ( rule__TankWarGame__ScreenAssignment_4 )
            {
             before(grammarAccess.getTankWarGameAccess().getScreenAssignment_4()); 
            // InternalTankWar.g:816:2: ( rule__TankWarGame__ScreenAssignment_4 )
            // InternalTankWar.g:816:3: rule__TankWarGame__ScreenAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TankWarGame__ScreenAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getScreenAssignment_4()); 

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
    // InternalTankWar.g:824:1: rule__TankWarGame__Group__5 : rule__TankWarGame__Group__5__Impl rule__TankWarGame__Group__6 ;
    public final void rule__TankWarGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:828:1: ( rule__TankWarGame__Group__5__Impl rule__TankWarGame__Group__6 )
            // InternalTankWar.g:829:2: rule__TankWarGame__Group__5__Impl rule__TankWarGame__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalTankWar.g:836:1: rule__TankWarGame__Group__5__Impl : ( ( ( rule__TankWarGame__FieldsAssignment_5 ) ) ( ( rule__TankWarGame__FieldsAssignment_5 )* ) ) ;
    public final void rule__TankWarGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:840:1: ( ( ( ( rule__TankWarGame__FieldsAssignment_5 ) ) ( ( rule__TankWarGame__FieldsAssignment_5 )* ) ) )
            // InternalTankWar.g:841:1: ( ( ( rule__TankWarGame__FieldsAssignment_5 ) ) ( ( rule__TankWarGame__FieldsAssignment_5 )* ) )
            {
            // InternalTankWar.g:841:1: ( ( ( rule__TankWarGame__FieldsAssignment_5 ) ) ( ( rule__TankWarGame__FieldsAssignment_5 )* ) )
            // InternalTankWar.g:842:2: ( ( rule__TankWarGame__FieldsAssignment_5 ) ) ( ( rule__TankWarGame__FieldsAssignment_5 )* )
            {
            // InternalTankWar.g:842:2: ( ( rule__TankWarGame__FieldsAssignment_5 ) )
            // InternalTankWar.g:843:3: ( rule__TankWarGame__FieldsAssignment_5 )
            {
             before(grammarAccess.getTankWarGameAccess().getFieldsAssignment_5()); 
            // InternalTankWar.g:844:3: ( rule__TankWarGame__FieldsAssignment_5 )
            // InternalTankWar.g:844:4: rule__TankWarGame__FieldsAssignment_5
            {
            pushFollow(FOLLOW_8);
            rule__TankWarGame__FieldsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getFieldsAssignment_5()); 

            }

            // InternalTankWar.g:847:2: ( ( rule__TankWarGame__FieldsAssignment_5 )* )
            // InternalTankWar.g:848:3: ( rule__TankWarGame__FieldsAssignment_5 )*
            {
             before(grammarAccess.getTankWarGameAccess().getFieldsAssignment_5()); 
            // InternalTankWar.g:849:3: ( rule__TankWarGame__FieldsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTankWar.g:849:4: rule__TankWarGame__FieldsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TankWarGame__FieldsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTankWarGameAccess().getFieldsAssignment_5()); 

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
    // InternalTankWar.g:858:1: rule__TankWarGame__Group__6 : rule__TankWarGame__Group__6__Impl rule__TankWarGame__Group__7 ;
    public final void rule__TankWarGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:862:1: ( rule__TankWarGame__Group__6__Impl rule__TankWarGame__Group__7 )
            // InternalTankWar.g:863:2: rule__TankWarGame__Group__6__Impl rule__TankWarGame__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__TankWarGame__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__7();

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
    // InternalTankWar.g:870:1: rule__TankWarGame__Group__6__Impl : ( ( ( rule__TankWarGame__OptionsAssignment_6 ) ) ( ( rule__TankWarGame__OptionsAssignment_6 )* ) ) ;
    public final void rule__TankWarGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:874:1: ( ( ( ( rule__TankWarGame__OptionsAssignment_6 ) ) ( ( rule__TankWarGame__OptionsAssignment_6 )* ) ) )
            // InternalTankWar.g:875:1: ( ( ( rule__TankWarGame__OptionsAssignment_6 ) ) ( ( rule__TankWarGame__OptionsAssignment_6 )* ) )
            {
            // InternalTankWar.g:875:1: ( ( ( rule__TankWarGame__OptionsAssignment_6 ) ) ( ( rule__TankWarGame__OptionsAssignment_6 )* ) )
            // InternalTankWar.g:876:2: ( ( rule__TankWarGame__OptionsAssignment_6 ) ) ( ( rule__TankWarGame__OptionsAssignment_6 )* )
            {
            // InternalTankWar.g:876:2: ( ( rule__TankWarGame__OptionsAssignment_6 ) )
            // InternalTankWar.g:877:3: ( rule__TankWarGame__OptionsAssignment_6 )
            {
             before(grammarAccess.getTankWarGameAccess().getOptionsAssignment_6()); 
            // InternalTankWar.g:878:3: ( rule__TankWarGame__OptionsAssignment_6 )
            // InternalTankWar.g:878:4: rule__TankWarGame__OptionsAssignment_6
            {
            pushFollow(FOLLOW_10);
            rule__TankWarGame__OptionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTankWarGameAccess().getOptionsAssignment_6()); 

            }

            // InternalTankWar.g:881:2: ( ( rule__TankWarGame__OptionsAssignment_6 )* )
            // InternalTankWar.g:882:3: ( rule__TankWarGame__OptionsAssignment_6 )*
            {
             before(grammarAccess.getTankWarGameAccess().getOptionsAssignment_6()); 
            // InternalTankWar.g:883:3: ( rule__TankWarGame__OptionsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20||(LA8_0>=38 && LA8_0<=40)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTankWar.g:883:4: rule__TankWarGame__OptionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TankWarGame__OptionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTankWarGameAccess().getOptionsAssignment_6()); 

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
    // $ANTLR end "rule__TankWarGame__Group__6__Impl"


    // $ANTLR start "rule__TankWarGame__Group__7"
    // InternalTankWar.g:892:1: rule__TankWarGame__Group__7 : rule__TankWarGame__Group__7__Impl ;
    public final void rule__TankWarGame__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:896:1: ( rule__TankWarGame__Group__7__Impl )
            // InternalTankWar.g:897:2: rule__TankWarGame__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TankWarGame__Group__7__Impl();

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
    // $ANTLR end "rule__TankWarGame__Group__7"


    // $ANTLR start "rule__TankWarGame__Group__7__Impl"
    // InternalTankWar.g:903:1: rule__TankWarGame__Group__7__Impl : ( '}' ) ;
    public final void rule__TankWarGame__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:907:1: ( ( '}' ) )
            // InternalTankWar.g:908:1: ( '}' )
            {
            // InternalTankWar.g:908:1: ( '}' )
            // InternalTankWar.g:909:2: '}'
            {
             before(grammarAccess.getTankWarGameAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTankWarGameAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__TankWarGame__Group__7__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalTankWar.g:919:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:923:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalTankWar.g:924:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalTankWar.g:931:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:935:1: ( ( 'var' ) )
            // InternalTankWar.g:936:1: ( 'var' )
            {
            // InternalTankWar.g:936:1: ( 'var' )
            // InternalTankWar.g:937:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalTankWar.g:946:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:950:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalTankWar.g:951:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalTankWar.g:958:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:962:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalTankWar.g:963:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalTankWar.g:963:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalTankWar.g:964:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:965:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalTankWar.g:965:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalTankWar.g:973:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:977:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalTankWar.g:978:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

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
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalTankWar.g:985:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:989:1: ( ( '=' ) )
            // InternalTankWar.g:990:1: ( '=' )
            {
            // InternalTankWar.g:990:1: ( '=' )
            // InternalTankWar.g:991:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalTankWar.g:1000:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1004:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalTankWar.g:1005:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalTankWar.g:1011:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1015:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalTankWar.g:1016:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalTankWar.g:1016:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalTankWar.g:1017:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalTankWar.g:1018:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalTankWar.g:1018:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__0"
    // InternalTankWar.g:1027:1: rule__EndGameBehaviour__Group__0 : rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1 ;
    public final void rule__EndGameBehaviour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1031:1: ( rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1 )
            // InternalTankWar.g:1032:2: rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTankWar.g:1039:1: rule__EndGameBehaviour__Group__0__Impl : ( 'end-game' ) ;
    public final void rule__EndGameBehaviour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1043:1: ( ( 'end-game' ) )
            // InternalTankWar.g:1044:1: ( 'end-game' )
            {
            // InternalTankWar.g:1044:1: ( 'end-game' )
            // InternalTankWar.g:1045:2: 'end-game'
            {
             before(grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTankWar.g:1054:1: rule__EndGameBehaviour__Group__1 : rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2 ;
    public final void rule__EndGameBehaviour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1058:1: ( rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2 )
            // InternalTankWar.g:1059:2: rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalTankWar.g:1066:1: rule__EndGameBehaviour__Group__1__Impl : ( '(' ) ;
    public final void rule__EndGameBehaviour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1070:1: ( ( '(' ) )
            // InternalTankWar.g:1071:1: ( '(' )
            {
            // InternalTankWar.g:1071:1: ( '(' )
            // InternalTankWar.g:1072:2: '('
            {
             before(grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTankWar.g:1081:1: rule__EndGameBehaviour__Group__2 : rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3 ;
    public final void rule__EndGameBehaviour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1085:1: ( rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3 )
            // InternalTankWar.g:1086:2: rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalTankWar.g:1093:1: rule__EndGameBehaviour__Group__2__Impl : ( ( rule__EndGameBehaviour__WinAssignment_2 ) ) ;
    public final void rule__EndGameBehaviour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1097:1: ( ( ( rule__EndGameBehaviour__WinAssignment_2 ) ) )
            // InternalTankWar.g:1098:1: ( ( rule__EndGameBehaviour__WinAssignment_2 ) )
            {
            // InternalTankWar.g:1098:1: ( ( rule__EndGameBehaviour__WinAssignment_2 ) )
            // InternalTankWar.g:1099:2: ( rule__EndGameBehaviour__WinAssignment_2 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getWinAssignment_2()); 
            // InternalTankWar.g:1100:2: ( rule__EndGameBehaviour__WinAssignment_2 )
            // InternalTankWar.g:1100:3: rule__EndGameBehaviour__WinAssignment_2
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
    // InternalTankWar.g:1108:1: rule__EndGameBehaviour__Group__3 : rule__EndGameBehaviour__Group__3__Impl rule__EndGameBehaviour__Group__4 ;
    public final void rule__EndGameBehaviour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1112:1: ( rule__EndGameBehaviour__Group__3__Impl rule__EndGameBehaviour__Group__4 )
            // InternalTankWar.g:1113:2: rule__EndGameBehaviour__Group__3__Impl rule__EndGameBehaviour__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalTankWar.g:1120:1: rule__EndGameBehaviour__Group__3__Impl : ( ',' ) ;
    public final void rule__EndGameBehaviour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1124:1: ( ( ',' ) )
            // InternalTankWar.g:1125:1: ( ',' )
            {
            // InternalTankWar.g:1125:1: ( ',' )
            // InternalTankWar.g:1126:2: ','
            {
             before(grammarAccess.getEndGameBehaviourAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTankWar.g:1135:1: rule__EndGameBehaviour__Group__4 : rule__EndGameBehaviour__Group__4__Impl rule__EndGameBehaviour__Group__5 ;
    public final void rule__EndGameBehaviour__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1139:1: ( rule__EndGameBehaviour__Group__4__Impl rule__EndGameBehaviour__Group__5 )
            // InternalTankWar.g:1140:2: rule__EndGameBehaviour__Group__4__Impl rule__EndGameBehaviour__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalTankWar.g:1147:1: rule__EndGameBehaviour__Group__4__Impl : ( ( rule__EndGameBehaviour__LostAssignment_4 ) ) ;
    public final void rule__EndGameBehaviour__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1151:1: ( ( ( rule__EndGameBehaviour__LostAssignment_4 ) ) )
            // InternalTankWar.g:1152:1: ( ( rule__EndGameBehaviour__LostAssignment_4 ) )
            {
            // InternalTankWar.g:1152:1: ( ( rule__EndGameBehaviour__LostAssignment_4 ) )
            // InternalTankWar.g:1153:2: ( rule__EndGameBehaviour__LostAssignment_4 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getLostAssignment_4()); 
            // InternalTankWar.g:1154:2: ( rule__EndGameBehaviour__LostAssignment_4 )
            // InternalTankWar.g:1154:3: rule__EndGameBehaviour__LostAssignment_4
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
    // InternalTankWar.g:1162:1: rule__EndGameBehaviour__Group__5 : rule__EndGameBehaviour__Group__5__Impl ;
    public final void rule__EndGameBehaviour__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1166:1: ( rule__EndGameBehaviour__Group__5__Impl )
            // InternalTankWar.g:1167:2: rule__EndGameBehaviour__Group__5__Impl
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
    // InternalTankWar.g:1173:1: rule__EndGameBehaviour__Group__5__Impl : ( ')' ) ;
    public final void rule__EndGameBehaviour__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1177:1: ( ( ')' ) )
            // InternalTankWar.g:1178:1: ( ')' )
            {
            // InternalTankWar.g:1178:1: ( ')' )
            // InternalTankWar.g:1179:2: ')'
            {
             before(grammarAccess.getEndGameBehaviourAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalTankWar.g:1189:1: rule__ScreenSpecification__Group__0 : rule__ScreenSpecification__Group__0__Impl rule__ScreenSpecification__Group__1 ;
    public final void rule__ScreenSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1193:1: ( rule__ScreenSpecification__Group__0__Impl rule__ScreenSpecification__Group__1 )
            // InternalTankWar.g:1194:2: rule__ScreenSpecification__Group__0__Impl rule__ScreenSpecification__Group__1
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
    // InternalTankWar.g:1201:1: rule__ScreenSpecification__Group__0__Impl : ( 'screen' ) ;
    public final void rule__ScreenSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1205:1: ( ( 'screen' ) )
            // InternalTankWar.g:1206:1: ( 'screen' )
            {
            // InternalTankWar.g:1206:1: ( 'screen' )
            // InternalTankWar.g:1207:2: 'screen'
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTankWar.g:1216:1: rule__ScreenSpecification__Group__1 : rule__ScreenSpecification__Group__1__Impl rule__ScreenSpecification__Group__2 ;
    public final void rule__ScreenSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1220:1: ( rule__ScreenSpecification__Group__1__Impl rule__ScreenSpecification__Group__2 )
            // InternalTankWar.g:1221:2: rule__ScreenSpecification__Group__1__Impl rule__ScreenSpecification__Group__2
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
    // InternalTankWar.g:1228:1: rule__ScreenSpecification__Group__1__Impl : ( ( rule__ScreenSpecification__NameAssignment_1 ) ) ;
    public final void rule__ScreenSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1232:1: ( ( ( rule__ScreenSpecification__NameAssignment_1 ) ) )
            // InternalTankWar.g:1233:1: ( ( rule__ScreenSpecification__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1233:1: ( ( rule__ScreenSpecification__NameAssignment_1 ) )
            // InternalTankWar.g:1234:2: ( rule__ScreenSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1235:2: ( rule__ScreenSpecification__NameAssignment_1 )
            // InternalTankWar.g:1235:3: rule__ScreenSpecification__NameAssignment_1
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
    // InternalTankWar.g:1243:1: rule__ScreenSpecification__Group__2 : rule__ScreenSpecification__Group__2__Impl rule__ScreenSpecification__Group__3 ;
    public final void rule__ScreenSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1247:1: ( rule__ScreenSpecification__Group__2__Impl rule__ScreenSpecification__Group__3 )
            // InternalTankWar.g:1248:2: rule__ScreenSpecification__Group__2__Impl rule__ScreenSpecification__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalTankWar.g:1255:1: rule__ScreenSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__ScreenSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1259:1: ( ( '{' ) )
            // InternalTankWar.g:1260:1: ( '{' )
            {
            // InternalTankWar.g:1260:1: ( '{' )
            // InternalTankWar.g:1261:2: '{'
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
    // InternalTankWar.g:1270:1: rule__ScreenSpecification__Group__3 : rule__ScreenSpecification__Group__3__Impl rule__ScreenSpecification__Group__4 ;
    public final void rule__ScreenSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1274:1: ( rule__ScreenSpecification__Group__3__Impl rule__ScreenSpecification__Group__4 )
            // InternalTankWar.g:1275:2: rule__ScreenSpecification__Group__3__Impl rule__ScreenSpecification__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalTankWar.g:1282:1: rule__ScreenSpecification__Group__3__Impl : ( 'screenWidth' ) ;
    public final void rule__ScreenSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1286:1: ( ( 'screenWidth' ) )
            // InternalTankWar.g:1287:1: ( 'screenWidth' )
            {
            // InternalTankWar.g:1287:1: ( 'screenWidth' )
            // InternalTankWar.g:1288:2: 'screenWidth'
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenWidthKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTankWar.g:1297:1: rule__ScreenSpecification__Group__4 : rule__ScreenSpecification__Group__4__Impl rule__ScreenSpecification__Group__5 ;
    public final void rule__ScreenSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1301:1: ( rule__ScreenSpecification__Group__4__Impl rule__ScreenSpecification__Group__5 )
            // InternalTankWar.g:1302:2: rule__ScreenSpecification__Group__4__Impl rule__ScreenSpecification__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalTankWar.g:1309:1: rule__ScreenSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__ScreenSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1313:1: ( ( '=' ) )
            // InternalTankWar.g:1314:1: ( '=' )
            {
            // InternalTankWar.g:1314:1: ( '=' )
            // InternalTankWar.g:1315:2: '='
            {
             before(grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTankWar.g:1324:1: rule__ScreenSpecification__Group__5 : rule__ScreenSpecification__Group__5__Impl rule__ScreenSpecification__Group__6 ;
    public final void rule__ScreenSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1328:1: ( rule__ScreenSpecification__Group__5__Impl rule__ScreenSpecification__Group__6 )
            // InternalTankWar.g:1329:2: rule__ScreenSpecification__Group__5__Impl rule__ScreenSpecification__Group__6
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
    // InternalTankWar.g:1336:1: rule__ScreenSpecification__Group__5__Impl : ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) ) ;
    public final void rule__ScreenSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1340:1: ( ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) ) )
            // InternalTankWar.g:1341:1: ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) )
            {
            // InternalTankWar.g:1341:1: ( ( rule__ScreenSpecification__ScreenWidthAssignment_5 ) )
            // InternalTankWar.g:1342:2: ( rule__ScreenSpecification__ScreenWidthAssignment_5 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenWidthAssignment_5()); 
            // InternalTankWar.g:1343:2: ( rule__ScreenSpecification__ScreenWidthAssignment_5 )
            // InternalTankWar.g:1343:3: rule__ScreenSpecification__ScreenWidthAssignment_5
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
    // InternalTankWar.g:1351:1: rule__ScreenSpecification__Group__6 : rule__ScreenSpecification__Group__6__Impl rule__ScreenSpecification__Group__7 ;
    public final void rule__ScreenSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1355:1: ( rule__ScreenSpecification__Group__6__Impl rule__ScreenSpecification__Group__7 )
            // InternalTankWar.g:1356:2: rule__ScreenSpecification__Group__6__Impl rule__ScreenSpecification__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalTankWar.g:1363:1: rule__ScreenSpecification__Group__6__Impl : ( 'screenHeight' ) ;
    public final void rule__ScreenSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1367:1: ( ( 'screenHeight' ) )
            // InternalTankWar.g:1368:1: ( 'screenHeight' )
            {
            // InternalTankWar.g:1368:1: ( 'screenHeight' )
            // InternalTankWar.g:1369:2: 'screenHeight'
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenHeightKeyword_6()); 
            match(input,26,FOLLOW_2); 
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
    // InternalTankWar.g:1378:1: rule__ScreenSpecification__Group__7 : rule__ScreenSpecification__Group__7__Impl rule__ScreenSpecification__Group__8 ;
    public final void rule__ScreenSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1382:1: ( rule__ScreenSpecification__Group__7__Impl rule__ScreenSpecification__Group__8 )
            // InternalTankWar.g:1383:2: rule__ScreenSpecification__Group__7__Impl rule__ScreenSpecification__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalTankWar.g:1390:1: rule__ScreenSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__ScreenSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1394:1: ( ( '=' ) )
            // InternalTankWar.g:1395:1: ( '=' )
            {
            // InternalTankWar.g:1395:1: ( '=' )
            // InternalTankWar.g:1396:2: '='
            {
             before(grammarAccess.getScreenSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTankWar.g:1405:1: rule__ScreenSpecification__Group__8 : rule__ScreenSpecification__Group__8__Impl rule__ScreenSpecification__Group__9 ;
    public final void rule__ScreenSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1409:1: ( rule__ScreenSpecification__Group__8__Impl rule__ScreenSpecification__Group__9 )
            // InternalTankWar.g:1410:2: rule__ScreenSpecification__Group__8__Impl rule__ScreenSpecification__Group__9
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
    // InternalTankWar.g:1417:1: rule__ScreenSpecification__Group__8__Impl : ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) ) ;
    public final void rule__ScreenSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1421:1: ( ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) ) )
            // InternalTankWar.g:1422:1: ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) )
            {
            // InternalTankWar.g:1422:1: ( ( rule__ScreenSpecification__ScreenHeightAssignment_8 ) )
            // InternalTankWar.g:1423:2: ( rule__ScreenSpecification__ScreenHeightAssignment_8 )
            {
             before(grammarAccess.getScreenSpecificationAccess().getScreenHeightAssignment_8()); 
            // InternalTankWar.g:1424:2: ( rule__ScreenSpecification__ScreenHeightAssignment_8 )
            // InternalTankWar.g:1424:3: rule__ScreenSpecification__ScreenHeightAssignment_8
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
    // InternalTankWar.g:1432:1: rule__ScreenSpecification__Group__9 : rule__ScreenSpecification__Group__9__Impl ;
    public final void rule__ScreenSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1436:1: ( rule__ScreenSpecification__Group__9__Impl )
            // InternalTankWar.g:1437:2: rule__ScreenSpecification__Group__9__Impl
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
    // InternalTankWar.g:1443:1: rule__ScreenSpecification__Group__9__Impl : ( '}' ) ;
    public final void rule__ScreenSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1447:1: ( ( '}' ) )
            // InternalTankWar.g:1448:1: ( '}' )
            {
            // InternalTankWar.g:1448:1: ( '}' )
            // InternalTankWar.g:1449:2: '}'
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
    // InternalTankWar.g:1459:1: rule__Obstaclepecification__Group__0 : rule__Obstaclepecification__Group__0__Impl rule__Obstaclepecification__Group__1 ;
    public final void rule__Obstaclepecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1463:1: ( rule__Obstaclepecification__Group__0__Impl rule__Obstaclepecification__Group__1 )
            // InternalTankWar.g:1464:2: rule__Obstaclepecification__Group__0__Impl rule__Obstaclepecification__Group__1
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
    // InternalTankWar.g:1471:1: rule__Obstaclepecification__Group__0__Impl : ( 'obstacle' ) ;
    public final void rule__Obstaclepecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1475:1: ( ( 'obstacle' ) )
            // InternalTankWar.g:1476:1: ( 'obstacle' )
            {
            // InternalTankWar.g:1476:1: ( 'obstacle' )
            // InternalTankWar.g:1477:2: 'obstacle'
            {
             before(grammarAccess.getObstaclepecificationAccess().getObstacleKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTankWar.g:1486:1: rule__Obstaclepecification__Group__1 : rule__Obstaclepecification__Group__1__Impl rule__Obstaclepecification__Group__2 ;
    public final void rule__Obstaclepecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1490:1: ( rule__Obstaclepecification__Group__1__Impl rule__Obstaclepecification__Group__2 )
            // InternalTankWar.g:1491:2: rule__Obstaclepecification__Group__1__Impl rule__Obstaclepecification__Group__2
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
    // InternalTankWar.g:1498:1: rule__Obstaclepecification__Group__1__Impl : ( ( rule__Obstaclepecification__NameAssignment_1 ) ) ;
    public final void rule__Obstaclepecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1502:1: ( ( ( rule__Obstaclepecification__NameAssignment_1 ) ) )
            // InternalTankWar.g:1503:1: ( ( rule__Obstaclepecification__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1503:1: ( ( rule__Obstaclepecification__NameAssignment_1 ) )
            // InternalTankWar.g:1504:2: ( rule__Obstaclepecification__NameAssignment_1 )
            {
             before(grammarAccess.getObstaclepecificationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1505:2: ( rule__Obstaclepecification__NameAssignment_1 )
            // InternalTankWar.g:1505:3: rule__Obstaclepecification__NameAssignment_1
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
    // InternalTankWar.g:1513:1: rule__Obstaclepecification__Group__2 : rule__Obstaclepecification__Group__2__Impl rule__Obstaclepecification__Group__3 ;
    public final void rule__Obstaclepecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1517:1: ( rule__Obstaclepecification__Group__2__Impl rule__Obstaclepecification__Group__3 )
            // InternalTankWar.g:1518:2: rule__Obstaclepecification__Group__2__Impl rule__Obstaclepecification__Group__3
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
    // InternalTankWar.g:1525:1: rule__Obstaclepecification__Group__2__Impl : ( '{' ) ;
    public final void rule__Obstaclepecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1529:1: ( ( '{' ) )
            // InternalTankWar.g:1530:1: ( '{' )
            {
            // InternalTankWar.g:1530:1: ( '{' )
            // InternalTankWar.g:1531:2: '{'
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
    // InternalTankWar.g:1540:1: rule__Obstaclepecification__Group__3 : rule__Obstaclepecification__Group__3__Impl rule__Obstaclepecification__Group__4 ;
    public final void rule__Obstaclepecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1544:1: ( rule__Obstaclepecification__Group__3__Impl rule__Obstaclepecification__Group__4 )
            // InternalTankWar.g:1545:2: rule__Obstaclepecification__Group__3__Impl rule__Obstaclepecification__Group__4
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
    // InternalTankWar.g:1552:1: rule__Obstaclepecification__Group__3__Impl : ( ( rule__Obstaclepecification__FieldsAssignment_3 )* ) ;
    public final void rule__Obstaclepecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1556:1: ( ( ( rule__Obstaclepecification__FieldsAssignment_3 )* ) )
            // InternalTankWar.g:1557:1: ( ( rule__Obstaclepecification__FieldsAssignment_3 )* )
            {
            // InternalTankWar.g:1557:1: ( ( rule__Obstaclepecification__FieldsAssignment_3 )* )
            // InternalTankWar.g:1558:2: ( rule__Obstaclepecification__FieldsAssignment_3 )*
            {
             before(grammarAccess.getObstaclepecificationAccess().getFieldsAssignment_3()); 
            // InternalTankWar.g:1559:2: ( rule__Obstaclepecification__FieldsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=28 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTankWar.g:1559:3: rule__Obstaclepecification__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Obstaclepecification__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalTankWar.g:1567:1: rule__Obstaclepecification__Group__4 : rule__Obstaclepecification__Group__4__Impl ;
    public final void rule__Obstaclepecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1571:1: ( rule__Obstaclepecification__Group__4__Impl )
            // InternalTankWar.g:1572:2: rule__Obstaclepecification__Group__4__Impl
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
    // InternalTankWar.g:1578:1: rule__Obstaclepecification__Group__4__Impl : ( '}' ) ;
    public final void rule__Obstaclepecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1582:1: ( ( '}' ) )
            // InternalTankWar.g:1583:1: ( '}' )
            {
            // InternalTankWar.g:1583:1: ( '}' )
            // InternalTankWar.g:1584:2: '}'
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
    // InternalTankWar.g:1594:1: rule__WaterObstacle__Group__0 : rule__WaterObstacle__Group__0__Impl rule__WaterObstacle__Group__1 ;
    public final void rule__WaterObstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1598:1: ( rule__WaterObstacle__Group__0__Impl rule__WaterObstacle__Group__1 )
            // InternalTankWar.g:1599:2: rule__WaterObstacle__Group__0__Impl rule__WaterObstacle__Group__1
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
    // InternalTankWar.g:1606:1: rule__WaterObstacle__Group__0__Impl : ( 'water' ) ;
    public final void rule__WaterObstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1610:1: ( ( 'water' ) )
            // InternalTankWar.g:1611:1: ( 'water' )
            {
            // InternalTankWar.g:1611:1: ( 'water' )
            // InternalTankWar.g:1612:2: 'water'
            {
             before(grammarAccess.getWaterObstacleAccess().getWaterKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTankWar.g:1621:1: rule__WaterObstacle__Group__1 : rule__WaterObstacle__Group__1__Impl rule__WaterObstacle__Group__2 ;
    public final void rule__WaterObstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1625:1: ( rule__WaterObstacle__Group__1__Impl rule__WaterObstacle__Group__2 )
            // InternalTankWar.g:1626:2: rule__WaterObstacle__Group__1__Impl rule__WaterObstacle__Group__2
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
    // InternalTankWar.g:1633:1: rule__WaterObstacle__Group__1__Impl : ( ( rule__WaterObstacle__NameAssignment_1 ) ) ;
    public final void rule__WaterObstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1637:1: ( ( ( rule__WaterObstacle__NameAssignment_1 ) ) )
            // InternalTankWar.g:1638:1: ( ( rule__WaterObstacle__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1638:1: ( ( rule__WaterObstacle__NameAssignment_1 ) )
            // InternalTankWar.g:1639:2: ( rule__WaterObstacle__NameAssignment_1 )
            {
             before(grammarAccess.getWaterObstacleAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1640:2: ( rule__WaterObstacle__NameAssignment_1 )
            // InternalTankWar.g:1640:3: rule__WaterObstacle__NameAssignment_1
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
    // InternalTankWar.g:1648:1: rule__WaterObstacle__Group__2 : rule__WaterObstacle__Group__2__Impl rule__WaterObstacle__Group__3 ;
    public final void rule__WaterObstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1652:1: ( rule__WaterObstacle__Group__2__Impl rule__WaterObstacle__Group__3 )
            // InternalTankWar.g:1653:2: rule__WaterObstacle__Group__2__Impl rule__WaterObstacle__Group__3
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
    // InternalTankWar.g:1660:1: rule__WaterObstacle__Group__2__Impl : ( '{' ) ;
    public final void rule__WaterObstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1664:1: ( ( '{' ) )
            // InternalTankWar.g:1665:1: ( '{' )
            {
            // InternalTankWar.g:1665:1: ( '{' )
            // InternalTankWar.g:1666:2: '{'
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
    // InternalTankWar.g:1675:1: rule__WaterObstacle__Group__3 : rule__WaterObstacle__Group__3__Impl ;
    public final void rule__WaterObstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1679:1: ( rule__WaterObstacle__Group__3__Impl )
            // InternalTankWar.g:1680:2: rule__WaterObstacle__Group__3__Impl
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
    // InternalTankWar.g:1686:1: rule__WaterObstacle__Group__3__Impl : ( '}' ) ;
    public final void rule__WaterObstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1690:1: ( ( '}' ) )
            // InternalTankWar.g:1691:1: ( '}' )
            {
            // InternalTankWar.g:1691:1: ( '}' )
            // InternalTankWar.g:1692:2: '}'
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
    // InternalTankWar.g:1702:1: rule__WallObstacle__Group__0 : rule__WallObstacle__Group__0__Impl rule__WallObstacle__Group__1 ;
    public final void rule__WallObstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1706:1: ( rule__WallObstacle__Group__0__Impl rule__WallObstacle__Group__1 )
            // InternalTankWar.g:1707:2: rule__WallObstacle__Group__0__Impl rule__WallObstacle__Group__1
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
    // InternalTankWar.g:1714:1: rule__WallObstacle__Group__0__Impl : ( 'wall' ) ;
    public final void rule__WallObstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1718:1: ( ( 'wall' ) )
            // InternalTankWar.g:1719:1: ( 'wall' )
            {
            // InternalTankWar.g:1719:1: ( 'wall' )
            // InternalTankWar.g:1720:2: 'wall'
            {
             before(grammarAccess.getWallObstacleAccess().getWallKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTankWar.g:1729:1: rule__WallObstacle__Group__1 : rule__WallObstacle__Group__1__Impl rule__WallObstacle__Group__2 ;
    public final void rule__WallObstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1733:1: ( rule__WallObstacle__Group__1__Impl rule__WallObstacle__Group__2 )
            // InternalTankWar.g:1734:2: rule__WallObstacle__Group__1__Impl rule__WallObstacle__Group__2
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
    // InternalTankWar.g:1741:1: rule__WallObstacle__Group__1__Impl : ( ( rule__WallObstacle__NameAssignment_1 ) ) ;
    public final void rule__WallObstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1745:1: ( ( ( rule__WallObstacle__NameAssignment_1 ) ) )
            // InternalTankWar.g:1746:1: ( ( rule__WallObstacle__NameAssignment_1 ) )
            {
            // InternalTankWar.g:1746:1: ( ( rule__WallObstacle__NameAssignment_1 ) )
            // InternalTankWar.g:1747:2: ( rule__WallObstacle__NameAssignment_1 )
            {
             before(grammarAccess.getWallObstacleAccess().getNameAssignment_1()); 
            // InternalTankWar.g:1748:2: ( rule__WallObstacle__NameAssignment_1 )
            // InternalTankWar.g:1748:3: rule__WallObstacle__NameAssignment_1
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
    // InternalTankWar.g:1756:1: rule__WallObstacle__Group__2 : rule__WallObstacle__Group__2__Impl rule__WallObstacle__Group__3 ;
    public final void rule__WallObstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1760:1: ( rule__WallObstacle__Group__2__Impl rule__WallObstacle__Group__3 )
            // InternalTankWar.g:1761:2: rule__WallObstacle__Group__2__Impl rule__WallObstacle__Group__3
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
    // InternalTankWar.g:1768:1: rule__WallObstacle__Group__2__Impl : ( '{' ) ;
    public final void rule__WallObstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1772:1: ( ( '{' ) )
            // InternalTankWar.g:1773:1: ( '{' )
            {
            // InternalTankWar.g:1773:1: ( '{' )
            // InternalTankWar.g:1774:2: '{'
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
    // InternalTankWar.g:1783:1: rule__WallObstacle__Group__3 : rule__WallObstacle__Group__3__Impl rule__WallObstacle__Group__4 ;
    public final void rule__WallObstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1787:1: ( rule__WallObstacle__Group__3__Impl rule__WallObstacle__Group__4 )
            // InternalTankWar.g:1788:2: rule__WallObstacle__Group__3__Impl rule__WallObstacle__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalTankWar.g:1795:1: rule__WallObstacle__Group__3__Impl : ( 'wallWidth' ) ;
    public final void rule__WallObstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1799:1: ( ( 'wallWidth' ) )
            // InternalTankWar.g:1800:1: ( 'wallWidth' )
            {
            // InternalTankWar.g:1800:1: ( 'wallWidth' )
            // InternalTankWar.g:1801:2: 'wallWidth'
            {
             before(grammarAccess.getWallObstacleAccess().getWallWidthKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTankWar.g:1810:1: rule__WallObstacle__Group__4 : rule__WallObstacle__Group__4__Impl rule__WallObstacle__Group__5 ;
    public final void rule__WallObstacle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1814:1: ( rule__WallObstacle__Group__4__Impl rule__WallObstacle__Group__5 )
            // InternalTankWar.g:1815:2: rule__WallObstacle__Group__4__Impl rule__WallObstacle__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalTankWar.g:1822:1: rule__WallObstacle__Group__4__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1826:1: ( ( '=' ) )
            // InternalTankWar.g:1827:1: ( '=' )
            {
            // InternalTankWar.g:1827:1: ( '=' )
            // InternalTankWar.g:1828:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTankWar.g:1837:1: rule__WallObstacle__Group__5 : rule__WallObstacle__Group__5__Impl rule__WallObstacle__Group__6 ;
    public final void rule__WallObstacle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1841:1: ( rule__WallObstacle__Group__5__Impl rule__WallObstacle__Group__6 )
            // InternalTankWar.g:1842:2: rule__WallObstacle__Group__5__Impl rule__WallObstacle__Group__6
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
    // InternalTankWar.g:1849:1: rule__WallObstacle__Group__5__Impl : ( ( rule__WallObstacle__WallWidthAssignment_5 ) ) ;
    public final void rule__WallObstacle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1853:1: ( ( ( rule__WallObstacle__WallWidthAssignment_5 ) ) )
            // InternalTankWar.g:1854:1: ( ( rule__WallObstacle__WallWidthAssignment_5 ) )
            {
            // InternalTankWar.g:1854:1: ( ( rule__WallObstacle__WallWidthAssignment_5 ) )
            // InternalTankWar.g:1855:2: ( rule__WallObstacle__WallWidthAssignment_5 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallWidthAssignment_5()); 
            // InternalTankWar.g:1856:2: ( rule__WallObstacle__WallWidthAssignment_5 )
            // InternalTankWar.g:1856:3: rule__WallObstacle__WallWidthAssignment_5
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
    // InternalTankWar.g:1864:1: rule__WallObstacle__Group__6 : rule__WallObstacle__Group__6__Impl rule__WallObstacle__Group__7 ;
    public final void rule__WallObstacle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1868:1: ( rule__WallObstacle__Group__6__Impl rule__WallObstacle__Group__7 )
            // InternalTankWar.g:1869:2: rule__WallObstacle__Group__6__Impl rule__WallObstacle__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalTankWar.g:1876:1: rule__WallObstacle__Group__6__Impl : ( 'wallHeight' ) ;
    public final void rule__WallObstacle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1880:1: ( ( 'wallHeight' ) )
            // InternalTankWar.g:1881:1: ( 'wallHeight' )
            {
            // InternalTankWar.g:1881:1: ( 'wallHeight' )
            // InternalTankWar.g:1882:2: 'wallHeight'
            {
             before(grammarAccess.getWallObstacleAccess().getWallHeightKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTankWar.g:1891:1: rule__WallObstacle__Group__7 : rule__WallObstacle__Group__7__Impl rule__WallObstacle__Group__8 ;
    public final void rule__WallObstacle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1895:1: ( rule__WallObstacle__Group__7__Impl rule__WallObstacle__Group__8 )
            // InternalTankWar.g:1896:2: rule__WallObstacle__Group__7__Impl rule__WallObstacle__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalTankWar.g:1903:1: rule__WallObstacle__Group__7__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1907:1: ( ( '=' ) )
            // InternalTankWar.g:1908:1: ( '=' )
            {
            // InternalTankWar.g:1908:1: ( '=' )
            // InternalTankWar.g:1909:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_7()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTankWar.g:1918:1: rule__WallObstacle__Group__8 : rule__WallObstacle__Group__8__Impl rule__WallObstacle__Group__9 ;
    public final void rule__WallObstacle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1922:1: ( rule__WallObstacle__Group__8__Impl rule__WallObstacle__Group__9 )
            // InternalTankWar.g:1923:2: rule__WallObstacle__Group__8__Impl rule__WallObstacle__Group__9
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
    // InternalTankWar.g:1930:1: rule__WallObstacle__Group__8__Impl : ( ( rule__WallObstacle__WallHeightAssignment_8 ) ) ;
    public final void rule__WallObstacle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1934:1: ( ( ( rule__WallObstacle__WallHeightAssignment_8 ) ) )
            // InternalTankWar.g:1935:1: ( ( rule__WallObstacle__WallHeightAssignment_8 ) )
            {
            // InternalTankWar.g:1935:1: ( ( rule__WallObstacle__WallHeightAssignment_8 ) )
            // InternalTankWar.g:1936:2: ( rule__WallObstacle__WallHeightAssignment_8 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallHeightAssignment_8()); 
            // InternalTankWar.g:1937:2: ( rule__WallObstacle__WallHeightAssignment_8 )
            // InternalTankWar.g:1937:3: rule__WallObstacle__WallHeightAssignment_8
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
    // InternalTankWar.g:1945:1: rule__WallObstacle__Group__9 : rule__WallObstacle__Group__9__Impl rule__WallObstacle__Group__10 ;
    public final void rule__WallObstacle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1949:1: ( rule__WallObstacle__Group__9__Impl rule__WallObstacle__Group__10 )
            // InternalTankWar.g:1950:2: rule__WallObstacle__Group__9__Impl rule__WallObstacle__Group__10
            {
            pushFollow(FOLLOW_11);
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
    // InternalTankWar.g:1957:1: rule__WallObstacle__Group__9__Impl : ( 'wallPosX' ) ;
    public final void rule__WallObstacle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1961:1: ( ( 'wallPosX' ) )
            // InternalTankWar.g:1962:1: ( 'wallPosX' )
            {
            // InternalTankWar.g:1962:1: ( 'wallPosX' )
            // InternalTankWar.g:1963:2: 'wallPosX'
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosXKeyword_9()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTankWar.g:1972:1: rule__WallObstacle__Group__10 : rule__WallObstacle__Group__10__Impl rule__WallObstacle__Group__11 ;
    public final void rule__WallObstacle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1976:1: ( rule__WallObstacle__Group__10__Impl rule__WallObstacle__Group__11 )
            // InternalTankWar.g:1977:2: rule__WallObstacle__Group__10__Impl rule__WallObstacle__Group__11
            {
            pushFollow(FOLLOW_12);
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
    // InternalTankWar.g:1984:1: rule__WallObstacle__Group__10__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:1988:1: ( ( '=' ) )
            // InternalTankWar.g:1989:1: ( '=' )
            {
            // InternalTankWar.g:1989:1: ( '=' )
            // InternalTankWar.g:1990:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_10()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTankWar.g:1999:1: rule__WallObstacle__Group__11 : rule__WallObstacle__Group__11__Impl rule__WallObstacle__Group__12 ;
    public final void rule__WallObstacle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2003:1: ( rule__WallObstacle__Group__11__Impl rule__WallObstacle__Group__12 )
            // InternalTankWar.g:2004:2: rule__WallObstacle__Group__11__Impl rule__WallObstacle__Group__12
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
    // InternalTankWar.g:2011:1: rule__WallObstacle__Group__11__Impl : ( ( rule__WallObstacle__WallPosXAssignment_11 ) ) ;
    public final void rule__WallObstacle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2015:1: ( ( ( rule__WallObstacle__WallPosXAssignment_11 ) ) )
            // InternalTankWar.g:2016:1: ( ( rule__WallObstacle__WallPosXAssignment_11 ) )
            {
            // InternalTankWar.g:2016:1: ( ( rule__WallObstacle__WallPosXAssignment_11 ) )
            // InternalTankWar.g:2017:2: ( rule__WallObstacle__WallPosXAssignment_11 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosXAssignment_11()); 
            // InternalTankWar.g:2018:2: ( rule__WallObstacle__WallPosXAssignment_11 )
            // InternalTankWar.g:2018:3: rule__WallObstacle__WallPosXAssignment_11
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
    // InternalTankWar.g:2026:1: rule__WallObstacle__Group__12 : rule__WallObstacle__Group__12__Impl rule__WallObstacle__Group__13 ;
    public final void rule__WallObstacle__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2030:1: ( rule__WallObstacle__Group__12__Impl rule__WallObstacle__Group__13 )
            // InternalTankWar.g:2031:2: rule__WallObstacle__Group__12__Impl rule__WallObstacle__Group__13
            {
            pushFollow(FOLLOW_11);
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
    // InternalTankWar.g:2038:1: rule__WallObstacle__Group__12__Impl : ( 'wallPosY' ) ;
    public final void rule__WallObstacle__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2042:1: ( ( 'wallPosY' ) )
            // InternalTankWar.g:2043:1: ( 'wallPosY' )
            {
            // InternalTankWar.g:2043:1: ( 'wallPosY' )
            // InternalTankWar.g:2044:2: 'wallPosY'
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosYKeyword_12()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTankWar.g:2053:1: rule__WallObstacle__Group__13 : rule__WallObstacle__Group__13__Impl rule__WallObstacle__Group__14 ;
    public final void rule__WallObstacle__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2057:1: ( rule__WallObstacle__Group__13__Impl rule__WallObstacle__Group__14 )
            // InternalTankWar.g:2058:2: rule__WallObstacle__Group__13__Impl rule__WallObstacle__Group__14
            {
            pushFollow(FOLLOW_12);
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
    // InternalTankWar.g:2065:1: rule__WallObstacle__Group__13__Impl : ( '=' ) ;
    public final void rule__WallObstacle__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2069:1: ( ( '=' ) )
            // InternalTankWar.g:2070:1: ( '=' )
            {
            // InternalTankWar.g:2070:1: ( '=' )
            // InternalTankWar.g:2071:2: '='
            {
             before(grammarAccess.getWallObstacleAccess().getEqualsSignKeyword_13()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTankWar.g:2080:1: rule__WallObstacle__Group__14 : rule__WallObstacle__Group__14__Impl rule__WallObstacle__Group__15 ;
    public final void rule__WallObstacle__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2084:1: ( rule__WallObstacle__Group__14__Impl rule__WallObstacle__Group__15 )
            // InternalTankWar.g:2085:2: rule__WallObstacle__Group__14__Impl rule__WallObstacle__Group__15
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
    // InternalTankWar.g:2092:1: rule__WallObstacle__Group__14__Impl : ( ( rule__WallObstacle__WallPosYAssignment_14 ) ) ;
    public final void rule__WallObstacle__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2096:1: ( ( ( rule__WallObstacle__WallPosYAssignment_14 ) ) )
            // InternalTankWar.g:2097:1: ( ( rule__WallObstacle__WallPosYAssignment_14 ) )
            {
            // InternalTankWar.g:2097:1: ( ( rule__WallObstacle__WallPosYAssignment_14 ) )
            // InternalTankWar.g:2098:2: ( rule__WallObstacle__WallPosYAssignment_14 )
            {
             before(grammarAccess.getWallObstacleAccess().getWallPosYAssignment_14()); 
            // InternalTankWar.g:2099:2: ( rule__WallObstacle__WallPosYAssignment_14 )
            // InternalTankWar.g:2099:3: rule__WallObstacle__WallPosYAssignment_14
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
    // InternalTankWar.g:2107:1: rule__WallObstacle__Group__15 : rule__WallObstacle__Group__15__Impl ;
    public final void rule__WallObstacle__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2111:1: ( rule__WallObstacle__Group__15__Impl )
            // InternalTankWar.g:2112:2: rule__WallObstacle__Group__15__Impl
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
    // InternalTankWar.g:2118:1: rule__WallObstacle__Group__15__Impl : ( '}' ) ;
    public final void rule__WallObstacle__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2122:1: ( ( '}' ) )
            // InternalTankWar.g:2123:1: ( '}' )
            {
            // InternalTankWar.g:2123:1: ( '}' )
            // InternalTankWar.g:2124:2: '}'
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
    // InternalTankWar.g:2134:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2138:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // InternalTankWar.g:2139:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
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
    // InternalTankWar.g:2146:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2150:1: ( ( 'field' ) )
            // InternalTankWar.g:2151:1: ( 'field' )
            {
            // InternalTankWar.g:2151:1: ( 'field' )
            // InternalTankWar.g:2152:2: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTankWar.g:2161:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2165:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // InternalTankWar.g:2166:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
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
    // InternalTankWar.g:2173:1: rule__FieldSpecification__Group__1__Impl : ( ( rule__FieldSpecification__NameAssignment_1 ) ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2177:1: ( ( ( rule__FieldSpecification__NameAssignment_1 ) ) )
            // InternalTankWar.g:2178:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            {
            // InternalTankWar.g:2178:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            // InternalTankWar.g:2179:2: ( rule__FieldSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 
            // InternalTankWar.g:2180:2: ( rule__FieldSpecification__NameAssignment_1 )
            // InternalTankWar.g:2180:3: rule__FieldSpecification__NameAssignment_1
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
    // InternalTankWar.g:2188:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2192:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // InternalTankWar.g:2193:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
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
    // InternalTankWar.g:2200:1: rule__FieldSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2204:1: ( ( '{' ) )
            // InternalTankWar.g:2205:1: ( '{' )
            {
            // InternalTankWar.g:2205:1: ( '{' )
            // InternalTankWar.g:2206:2: '{'
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
    // InternalTankWar.g:2215:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2219:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // InternalTankWar.g:2220:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalTankWar.g:2227:1: rule__FieldSpecification__Group__3__Impl : ( 'enemyCount' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2231:1: ( ( 'enemyCount' ) )
            // InternalTankWar.g:2232:1: ( 'enemyCount' )
            {
            // InternalTankWar.g:2232:1: ( 'enemyCount' )
            // InternalTankWar.g:2233:2: 'enemyCount'
            {
             before(grammarAccess.getFieldSpecificationAccess().getEnemyCountKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTankWar.g:2242:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2246:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // InternalTankWar.g:2247:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
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
    // InternalTankWar.g:2254:1: rule__FieldSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2258:1: ( ( '=' ) )
            // InternalTankWar.g:2259:1: ( '=' )
            {
            // InternalTankWar.g:2259:1: ( '=' )
            // InternalTankWar.g:2260:2: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTankWar.g:2269:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2273:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // InternalTankWar.g:2274:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
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
    // InternalTankWar.g:2281:1: rule__FieldSpecification__Group__5__Impl : ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2285:1: ( ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) ) )
            // InternalTankWar.g:2286:1: ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) )
            {
            // InternalTankWar.g:2286:1: ( ( rule__FieldSpecification__EnemyCountAssignment_5 ) )
            // InternalTankWar.g:2287:2: ( rule__FieldSpecification__EnemyCountAssignment_5 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getEnemyCountAssignment_5()); 
            // InternalTankWar.g:2288:2: ( rule__FieldSpecification__EnemyCountAssignment_5 )
            // InternalTankWar.g:2288:3: rule__FieldSpecification__EnemyCountAssignment_5
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
    // InternalTankWar.g:2296:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2300:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // InternalTankWar.g:2301:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
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
    // InternalTankWar.g:2308:1: rule__FieldSpecification__Group__6__Impl : ( ( rule__FieldSpecification__ObstacleAssignment_6 ) ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2312:1: ( ( ( rule__FieldSpecification__ObstacleAssignment_6 ) ) )
            // InternalTankWar.g:2313:1: ( ( rule__FieldSpecification__ObstacleAssignment_6 ) )
            {
            // InternalTankWar.g:2313:1: ( ( rule__FieldSpecification__ObstacleAssignment_6 ) )
            // InternalTankWar.g:2314:2: ( rule__FieldSpecification__ObstacleAssignment_6 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getObstacleAssignment_6()); 
            // InternalTankWar.g:2315:2: ( rule__FieldSpecification__ObstacleAssignment_6 )
            // InternalTankWar.g:2315:3: rule__FieldSpecification__ObstacleAssignment_6
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
    // InternalTankWar.g:2323:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2327:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // InternalTankWar.g:2328:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
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
    // InternalTankWar.g:2335:1: rule__FieldSpecification__Group__7__Impl : ( 'nextLevel' ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2339:1: ( ( 'nextLevel' ) )
            // InternalTankWar.g:2340:1: ( 'nextLevel' )
            {
            // InternalTankWar.g:2340:1: ( 'nextLevel' )
            // InternalTankWar.g:2341:2: 'nextLevel'
            {
             before(grammarAccess.getFieldSpecificationAccess().getNextLevelKeyword_7()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTankWar.g:2350:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2354:1: ( rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 )
            // InternalTankWar.g:2355:2: rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9
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
    // InternalTankWar.g:2362:1: rule__FieldSpecification__Group__8__Impl : ( 'goto' ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2366:1: ( ( 'goto' ) )
            // InternalTankWar.g:2367:1: ( 'goto' )
            {
            // InternalTankWar.g:2367:1: ( 'goto' )
            // InternalTankWar.g:2368:2: 'goto'
            {
             before(grammarAccess.getFieldSpecificationAccess().getGotoKeyword_8()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTankWar.g:2377:1: rule__FieldSpecification__Group__9 : rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 ;
    public final void rule__FieldSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2381:1: ( rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 )
            // InternalTankWar.g:2382:2: rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10
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
    // InternalTankWar.g:2389:1: rule__FieldSpecification__Group__9__Impl : ( ( rule__FieldSpecification__NextLevelAssignment_9 ) ) ;
    public final void rule__FieldSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2393:1: ( ( ( rule__FieldSpecification__NextLevelAssignment_9 ) ) )
            // InternalTankWar.g:2394:1: ( ( rule__FieldSpecification__NextLevelAssignment_9 ) )
            {
            // InternalTankWar.g:2394:1: ( ( rule__FieldSpecification__NextLevelAssignment_9 ) )
            // InternalTankWar.g:2395:2: ( rule__FieldSpecification__NextLevelAssignment_9 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNextLevelAssignment_9()); 
            // InternalTankWar.g:2396:2: ( rule__FieldSpecification__NextLevelAssignment_9 )
            // InternalTankWar.g:2396:3: rule__FieldSpecification__NextLevelAssignment_9
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
    // InternalTankWar.g:2404:1: rule__FieldSpecification__Group__10 : rule__FieldSpecification__Group__10__Impl ;
    public final void rule__FieldSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2408:1: ( rule__FieldSpecification__Group__10__Impl )
            // InternalTankWar.g:2409:2: rule__FieldSpecification__Group__10__Impl
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
    // InternalTankWar.g:2415:1: rule__FieldSpecification__Group__10__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2419:1: ( ( '}' ) )
            // InternalTankWar.g:2420:1: ( '}' )
            {
            // InternalTankWar.g:2420:1: ( '}' )
            // InternalTankWar.g:2421:2: '}'
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
    // InternalTankWar.g:2431:1: rule__SuperModeDeclaration__Group__0 : rule__SuperModeDeclaration__Group__0__Impl rule__SuperModeDeclaration__Group__1 ;
    public final void rule__SuperModeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2435:1: ( rule__SuperModeDeclaration__Group__0__Impl rule__SuperModeDeclaration__Group__1 )
            // InternalTankWar.g:2436:2: rule__SuperModeDeclaration__Group__0__Impl rule__SuperModeDeclaration__Group__1
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
    // InternalTankWar.g:2443:1: rule__SuperModeDeclaration__Group__0__Impl : ( 'superMode' ) ;
    public final void rule__SuperModeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2447:1: ( ( 'superMode' ) )
            // InternalTankWar.g:2448:1: ( 'superMode' )
            {
            // InternalTankWar.g:2448:1: ( 'superMode' )
            // InternalTankWar.g:2449:2: 'superMode'
            {
             before(grammarAccess.getSuperModeDeclarationAccess().getSuperModeKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTankWar.g:2458:1: rule__SuperModeDeclaration__Group__1 : rule__SuperModeDeclaration__Group__1__Impl ;
    public final void rule__SuperModeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2462:1: ( rule__SuperModeDeclaration__Group__1__Impl )
            // InternalTankWar.g:2463:2: rule__SuperModeDeclaration__Group__1__Impl
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
    // InternalTankWar.g:2469:1: rule__SuperModeDeclaration__Group__1__Impl : ( () ) ;
    public final void rule__SuperModeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2473:1: ( ( () ) )
            // InternalTankWar.g:2474:1: ( () )
            {
            // InternalTankWar.g:2474:1: ( () )
            // InternalTankWar.g:2475:2: ()
            {
             before(grammarAccess.getSuperModeDeclarationAccess().getSuperModeDeclarationAction_1()); 
            // InternalTankWar.g:2476:2: ()
            // InternalTankWar.g:2476:3: 
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
    // InternalTankWar.g:2485:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2489:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // InternalTankWar.g:2490:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalTankWar.g:2497:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2501:1: ( ( 'start' ) )
            // InternalTankWar.g:2502:1: ( 'start' )
            {
            // InternalTankWar.g:2502:1: ( 'start' )
            // InternalTankWar.g:2503:2: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTankWar.g:2512:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2516:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // InternalTankWar.g:2517:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
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
    // InternalTankWar.g:2524:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2528:1: ( ( '=' ) )
            // InternalTankWar.g:2529:1: ( '=' )
            {
            // InternalTankWar.g:2529:1: ( '=' )
            // InternalTankWar.g:2530:2: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTankWar.g:2539:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2543:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // InternalTankWar.g:2544:2: rule__StartFieldDeclaration__Group__2__Impl
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
    // InternalTankWar.g:2550:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2554:1: ( ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) )
            // InternalTankWar.g:2555:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            {
            // InternalTankWar.g:2555:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            // InternalTankWar.g:2556:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 
            // InternalTankWar.g:2557:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            // InternalTankWar.g:2557:3: rule__StartFieldDeclaration__FieldAssignment_2
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
    // InternalTankWar.g:2566:1: rule__AllowRestartMenu__Group__0 : rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 ;
    public final void rule__AllowRestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2570:1: ( rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 )
            // InternalTankWar.g:2571:2: rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1
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
    // InternalTankWar.g:2578:1: rule__AllowRestartMenu__Group__0__Impl : ( 'allowRestart' ) ;
    public final void rule__AllowRestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2582:1: ( ( 'allowRestart' ) )
            // InternalTankWar.g:2583:1: ( 'allowRestart' )
            {
            // InternalTankWar.g:2583:1: ( 'allowRestart' )
            // InternalTankWar.g:2584:2: 'allowRestart'
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTankWar.g:2593:1: rule__AllowRestartMenu__Group__1 : rule__AllowRestartMenu__Group__1__Impl ;
    public final void rule__AllowRestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2597:1: ( rule__AllowRestartMenu__Group__1__Impl )
            // InternalTankWar.g:2598:2: rule__AllowRestartMenu__Group__1__Impl
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
    // InternalTankWar.g:2604:1: rule__AllowRestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__AllowRestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2608:1: ( ( () ) )
            // InternalTankWar.g:2609:1: ( () )
            {
            // InternalTankWar.g:2609:1: ( () )
            // InternalTankWar.g:2610:2: ()
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 
            // InternalTankWar.g:2611:2: ()
            // InternalTankWar.g:2611:3: 
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
    // InternalTankWar.g:2620:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2624:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalTankWar.g:2625:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
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
    // InternalTankWar.g:2632:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2636:1: ( ( ruleMultiplication ) )
            // InternalTankWar.g:2637:1: ( ruleMultiplication )
            {
            // InternalTankWar.g:2637:1: ( ruleMultiplication )
            // InternalTankWar.g:2638:2: ruleMultiplication
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
    // InternalTankWar.g:2647:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2651:1: ( rule__Addition__Group__1__Impl )
            // InternalTankWar.g:2652:2: rule__Addition__Group__1__Impl
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
    // InternalTankWar.g:2658:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2662:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalTankWar.g:2663:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalTankWar.g:2663:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalTankWar.g:2664:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalTankWar.g:2665:2: ( rule__Addition__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTankWar.g:2665:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalTankWar.g:2674:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2678:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalTankWar.g:2679:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
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
    // InternalTankWar.g:2686:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2690:1: ( ( () ) )
            // InternalTankWar.g:2691:1: ( () )
            {
            // InternalTankWar.g:2691:1: ( () )
            // InternalTankWar.g:2692:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalTankWar.g:2693:2: ()
            // InternalTankWar.g:2693:3: 
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
    // InternalTankWar.g:2701:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2705:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalTankWar.g:2706:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
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
    // InternalTankWar.g:2713:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2717:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalTankWar.g:2718:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalTankWar.g:2718:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalTankWar.g:2719:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalTankWar.g:2720:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalTankWar.g:2720:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalTankWar.g:2728:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2732:1: ( rule__Addition__Group_1__2__Impl )
            // InternalTankWar.g:2733:2: rule__Addition__Group_1__2__Impl
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
    // InternalTankWar.g:2739:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2743:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalTankWar.g:2744:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalTankWar.g:2744:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalTankWar.g:2745:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalTankWar.g:2746:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalTankWar.g:2746:3: rule__Addition__RightAssignment_1_2
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
    // InternalTankWar.g:2755:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2759:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalTankWar.g:2760:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalTankWar.g:2767:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2771:1: ( ( rulePrimary ) )
            // InternalTankWar.g:2772:1: ( rulePrimary )
            {
            // InternalTankWar.g:2772:1: ( rulePrimary )
            // InternalTankWar.g:2773:2: rulePrimary
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
    // InternalTankWar.g:2782:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2786:1: ( rule__Multiplication__Group__1__Impl )
            // InternalTankWar.g:2787:2: rule__Multiplication__Group__1__Impl
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
    // InternalTankWar.g:2793:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2797:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalTankWar.g:2798:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalTankWar.g:2798:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalTankWar.g:2799:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalTankWar.g:2800:2: ( rule__Multiplication__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=13 && LA11_0<=14)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTankWar.g:2800:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalTankWar.g:2809:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2813:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalTankWar.g:2814:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
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
    // InternalTankWar.g:2821:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2825:1: ( ( () ) )
            // InternalTankWar.g:2826:1: ( () )
            {
            // InternalTankWar.g:2826:1: ( () )
            // InternalTankWar.g:2827:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalTankWar.g:2828:2: ()
            // InternalTankWar.g:2828:3: 
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
    // InternalTankWar.g:2836:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2840:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalTankWar.g:2841:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
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
    // InternalTankWar.g:2848:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2852:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalTankWar.g:2853:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalTankWar.g:2853:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalTankWar.g:2854:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalTankWar.g:2855:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalTankWar.g:2855:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalTankWar.g:2863:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2867:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalTankWar.g:2868:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalTankWar.g:2874:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2878:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalTankWar.g:2879:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalTankWar.g:2879:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalTankWar.g:2880:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalTankWar.g:2881:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalTankWar.g:2881:3: rule__Multiplication__RightAssignment_1_2
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


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalTankWar.g:2890:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2894:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalTankWar.g:2895:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

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
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalTankWar.g:2902:1: rule__Primary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2906:1: ( ( '(' ) )
            // InternalTankWar.g:2907:1: ( '(' )
            {
            // InternalTankWar.g:2907:1: ( '(' )
            // InternalTankWar.g:2908:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalTankWar.g:2917:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2921:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalTankWar.g:2922:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

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
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalTankWar.g:2929:1: rule__Primary__Group_3__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2933:1: ( ( ruleAddition ) )
            // InternalTankWar.g:2934:1: ( ruleAddition )
            {
            // InternalTankWar.g:2934:1: ( ruleAddition )
            // InternalTankWar.g:2935:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalTankWar.g:2944:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2948:1: ( rule__Primary__Group_3__2__Impl )
            // InternalTankWar.g:2949:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalTankWar.g:2955:1: rule__Primary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2959:1: ( ( ')' ) )
            // InternalTankWar.g:2960:1: ( ')' )
            {
            // InternalTankWar.g:2960:1: ( ')' )
            // InternalTankWar.g:2961:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalTankWar.g:2971:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2975:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalTankWar.g:2976:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
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
    // InternalTankWar.g:2983:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:2987:1: ( ( ( RULE_INT )? ) )
            // InternalTankWar.g:2988:1: ( ( RULE_INT )? )
            {
            // InternalTankWar.g:2988:1: ( ( RULE_INT )? )
            // InternalTankWar.g:2989:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalTankWar.g:2990:2: ( RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTankWar.g:2990:3: RULE_INT
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
    // InternalTankWar.g:2998:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3002:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalTankWar.g:3003:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTankWar.g:3010:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3014:1: ( ( '.' ) )
            // InternalTankWar.g:3015:1: ( '.' )
            {
            // InternalTankWar.g:3015:1: ( '.' )
            // InternalTankWar.g:3016:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTankWar.g:3025:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3029:1: ( rule__REAL__Group__2__Impl )
            // InternalTankWar.g:3030:2: rule__REAL__Group__2__Impl
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
    // InternalTankWar.g:3036:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3040:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3041:1: ( RULE_INT )
            {
            // InternalTankWar.g:3041:1: ( RULE_INT )
            // InternalTankWar.g:3042:2: RULE_INT
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
    // InternalTankWar.g:3052:1: rule__TankWarGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TankWarGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3056:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3057:2: ( RULE_ID )
            {
            // InternalTankWar.g:3057:2: ( RULE_ID )
            // InternalTankWar.g:3058:3: RULE_ID
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


    // $ANTLR start "rule__TankWarGame__VariableAssignment_3"
    // InternalTankWar.g:3067:1: rule__TankWarGame__VariableAssignment_3 : ( ruleVariableDeclaration ) ;
    public final void rule__TankWarGame__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3071:1: ( ( ruleVariableDeclaration ) )
            // InternalTankWar.g:3072:2: ( ruleVariableDeclaration )
            {
            // InternalTankWar.g:3072:2: ( ruleVariableDeclaration )
            // InternalTankWar.g:3073:3: ruleVariableDeclaration
            {
             before(grammarAccess.getTankWarGameAccess().getVariableVariableDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getTankWarGameAccess().getVariableVariableDeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TankWarGame__VariableAssignment_3"


    // $ANTLR start "rule__TankWarGame__ScreenAssignment_4"
    // InternalTankWar.g:3082:1: rule__TankWarGame__ScreenAssignment_4 : ( ruleScreenSpecification ) ;
    public final void rule__TankWarGame__ScreenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3086:1: ( ( ruleScreenSpecification ) )
            // InternalTankWar.g:3087:2: ( ruleScreenSpecification )
            {
            // InternalTankWar.g:3087:2: ( ruleScreenSpecification )
            // InternalTankWar.g:3088:3: ruleScreenSpecification
            {
             before(grammarAccess.getTankWarGameAccess().getScreenScreenSpecificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleScreenSpecification();

            state._fsp--;

             after(grammarAccess.getTankWarGameAccess().getScreenScreenSpecificationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__TankWarGame__ScreenAssignment_4"


    // $ANTLR start "rule__TankWarGame__FieldsAssignment_5"
    // InternalTankWar.g:3097:1: rule__TankWarGame__FieldsAssignment_5 : ( ruleFieldSpecification ) ;
    public final void rule__TankWarGame__FieldsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3101:1: ( ( ruleFieldSpecification ) )
            // InternalTankWar.g:3102:2: ( ruleFieldSpecification )
            {
            // InternalTankWar.g:3102:2: ( ruleFieldSpecification )
            // InternalTankWar.g:3103:3: ruleFieldSpecification
            {
             before(grammarAccess.getTankWarGameAccess().getFieldsFieldSpecificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getTankWarGameAccess().getFieldsFieldSpecificationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__TankWarGame__FieldsAssignment_5"


    // $ANTLR start "rule__TankWarGame__OptionsAssignment_6"
    // InternalTankWar.g:3112:1: rule__TankWarGame__OptionsAssignment_6 : ( ruleOptionSpecification ) ;
    public final void rule__TankWarGame__OptionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3116:1: ( ( ruleOptionSpecification ) )
            // InternalTankWar.g:3117:2: ( ruleOptionSpecification )
            {
            // InternalTankWar.g:3117:2: ( ruleOptionSpecification )
            // InternalTankWar.g:3118:3: ruleOptionSpecification
            {
             before(grammarAccess.getTankWarGameAccess().getOptionsOptionSpecificationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getTankWarGameAccess().getOptionsOptionSpecificationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__TankWarGame__OptionsAssignment_6"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalTankWar.g:3127:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3131:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3132:2: ( RULE_ID )
            {
            // InternalTankWar.g:3132:2: ( RULE_ID )
            // InternalTankWar.g:3133:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalTankWar.g:3142:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3146:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3147:2: ( RULE_INT )
            {
            // InternalTankWar.g:3147:2: ( RULE_INT )
            // InternalTankWar.g:3148:3: RULE_INT
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__EndGameBehaviour__WinAssignment_2"
    // InternalTankWar.g:3157:1: rule__EndGameBehaviour__WinAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EndGameBehaviour__WinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3161:1: ( ( RULE_STRING ) )
            // InternalTankWar.g:3162:2: ( RULE_STRING )
            {
            // InternalTankWar.g:3162:2: ( RULE_STRING )
            // InternalTankWar.g:3163:3: RULE_STRING
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
    // InternalTankWar.g:3172:1: rule__EndGameBehaviour__LostAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EndGameBehaviour__LostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3176:1: ( ( RULE_STRING ) )
            // InternalTankWar.g:3177:2: ( RULE_STRING )
            {
            // InternalTankWar.g:3177:2: ( RULE_STRING )
            // InternalTankWar.g:3178:3: RULE_STRING
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
    // InternalTankWar.g:3187:1: rule__ScreenSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScreenSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3191:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3192:2: ( RULE_ID )
            {
            // InternalTankWar.g:3192:2: ( RULE_ID )
            // InternalTankWar.g:3193:3: RULE_ID
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
    // InternalTankWar.g:3202:1: rule__ScreenSpecification__ScreenWidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__ScreenSpecification__ScreenWidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3206:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3207:2: ( RULE_INT )
            {
            // InternalTankWar.g:3207:2: ( RULE_INT )
            // InternalTankWar.g:3208:3: RULE_INT
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
    // InternalTankWar.g:3217:1: rule__ScreenSpecification__ScreenHeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__ScreenSpecification__ScreenHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3221:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3222:2: ( RULE_INT )
            {
            // InternalTankWar.g:3222:2: ( RULE_INT )
            // InternalTankWar.g:3223:3: RULE_INT
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
    // InternalTankWar.g:3232:1: rule__Obstaclepecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Obstaclepecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3236:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3237:2: ( RULE_ID )
            {
            // InternalTankWar.g:3237:2: ( RULE_ID )
            // InternalTankWar.g:3238:3: RULE_ID
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
    // InternalTankWar.g:3247:1: rule__Obstaclepecification__FieldsAssignment_3 : ( ruleObstacleMember ) ;
    public final void rule__Obstaclepecification__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3251:1: ( ( ruleObstacleMember ) )
            // InternalTankWar.g:3252:2: ( ruleObstacleMember )
            {
            // InternalTankWar.g:3252:2: ( ruleObstacleMember )
            // InternalTankWar.g:3253:3: ruleObstacleMember
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
    // InternalTankWar.g:3262:1: rule__WaterObstacle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WaterObstacle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3266:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3267:2: ( RULE_ID )
            {
            // InternalTankWar.g:3267:2: ( RULE_ID )
            // InternalTankWar.g:3268:3: RULE_ID
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
    // InternalTankWar.g:3277:1: rule__WallObstacle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WallObstacle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3281:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3282:2: ( RULE_ID )
            {
            // InternalTankWar.g:3282:2: ( RULE_ID )
            // InternalTankWar.g:3283:3: RULE_ID
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
    // InternalTankWar.g:3292:1: rule__WallObstacle__WallWidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallWidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3296:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3297:2: ( RULE_INT )
            {
            // InternalTankWar.g:3297:2: ( RULE_INT )
            // InternalTankWar.g:3298:3: RULE_INT
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
    // InternalTankWar.g:3307:1: rule__WallObstacle__WallHeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3311:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3312:2: ( RULE_INT )
            {
            // InternalTankWar.g:3312:2: ( RULE_INT )
            // InternalTankWar.g:3313:3: RULE_INT
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
    // InternalTankWar.g:3322:1: rule__WallObstacle__WallPosXAssignment_11 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallPosXAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3326:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3327:2: ( RULE_INT )
            {
            // InternalTankWar.g:3327:2: ( RULE_INT )
            // InternalTankWar.g:3328:3: RULE_INT
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
    // InternalTankWar.g:3337:1: rule__WallObstacle__WallPosYAssignment_14 : ( RULE_INT ) ;
    public final void rule__WallObstacle__WallPosYAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3341:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3342:2: ( RULE_INT )
            {
            // InternalTankWar.g:3342:2: ( RULE_INT )
            // InternalTankWar.g:3343:3: RULE_INT
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
    // InternalTankWar.g:3352:1: rule__FieldSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3356:1: ( ( RULE_ID ) )
            // InternalTankWar.g:3357:2: ( RULE_ID )
            {
            // InternalTankWar.g:3357:2: ( RULE_ID )
            // InternalTankWar.g:3358:3: RULE_ID
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
    // InternalTankWar.g:3367:1: rule__FieldSpecification__EnemyCountAssignment_5 : ( ruleAddition ) ;
    public final void rule__FieldSpecification__EnemyCountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3371:1: ( ( ruleAddition ) )
            // InternalTankWar.g:3372:2: ( ruleAddition )
            {
            // InternalTankWar.g:3372:2: ( ruleAddition )
            // InternalTankWar.g:3373:3: ruleAddition
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
    // InternalTankWar.g:3382:1: rule__FieldSpecification__ObstacleAssignment_6 : ( ruleObstaclepecification ) ;
    public final void rule__FieldSpecification__ObstacleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3386:1: ( ( ruleObstaclepecification ) )
            // InternalTankWar.g:3387:2: ( ruleObstaclepecification )
            {
            // InternalTankWar.g:3387:2: ( ruleObstaclepecification )
            // InternalTankWar.g:3388:3: ruleObstaclepecification
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
    // InternalTankWar.g:3397:1: rule__FieldSpecification__NextLevelAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__FieldSpecification__NextLevelAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3401:1: ( ( ( RULE_ID ) ) )
            // InternalTankWar.g:3402:2: ( ( RULE_ID ) )
            {
            // InternalTankWar.g:3402:2: ( ( RULE_ID ) )
            // InternalTankWar.g:3403:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNextLevelFieldSpecificationCrossReference_9_0()); 
            // InternalTankWar.g:3404:3: ( RULE_ID )
            // InternalTankWar.g:3405:4: RULE_ID
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
    // InternalTankWar.g:3416:1: rule__StartFieldDeclaration__FieldAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartFieldDeclaration__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3420:1: ( ( ( RULE_ID ) ) )
            // InternalTankWar.g:3421:2: ( ( RULE_ID ) )
            {
            // InternalTankWar.g:3421:2: ( ( RULE_ID ) )
            // InternalTankWar.g:3422:3: ( RULE_ID )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 
            // InternalTankWar.g:3423:3: ( RULE_ID )
            // InternalTankWar.g:3424:4: RULE_ID
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
    // InternalTankWar.g:3435:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3439:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalTankWar.g:3440:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTankWar.g:3440:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalTankWar.g:3441:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTankWar.g:3442:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalTankWar.g:3442:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalTankWar.g:3450:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3454:1: ( ( ruleMultiplication ) )
            // InternalTankWar.g:3455:2: ( ruleMultiplication )
            {
            // InternalTankWar.g:3455:2: ( ruleMultiplication )
            // InternalTankWar.g:3456:3: ruleMultiplication
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
    // InternalTankWar.g:3465:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3469:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalTankWar.g:3470:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTankWar.g:3470:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalTankWar.g:3471:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTankWar.g:3472:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalTankWar.g:3472:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalTankWar.g:3480:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3484:1: ( ( rulePrimary ) )
            // InternalTankWar.g:3485:2: ( rulePrimary )
            {
            // InternalTankWar.g:3485:2: ( rulePrimary )
            // InternalTankWar.g:3486:3: rulePrimary
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


    // $ANTLR start "rule__IntVarExpression__VarAssignment"
    // InternalTankWar.g:3495:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3499:1: ( ( ( RULE_ID ) ) )
            // InternalTankWar.g:3500:2: ( ( RULE_ID ) )
            {
            // InternalTankWar.g:3500:2: ( ( RULE_ID ) )
            // InternalTankWar.g:3501:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalTankWar.g:3502:3: ( RULE_ID )
            // InternalTankWar.g:3503:4: RULE_ID
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

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
    // $ANTLR end "rule__IntVarExpression__VarAssignment"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalTankWar.g:3514:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3518:1: ( ( RULE_INT ) )
            // InternalTankWar.g:3519:2: ( RULE_INT )
            {
            // InternalTankWar.g:3519:2: ( RULE_INT )
            // InternalTankWar.g:3520:3: RULE_INT
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
    // InternalTankWar.g:3529:1: rule__RealLiteral__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTankWar.g:3533:1: ( ( ruleREAL ) )
            // InternalTankWar.g:3534:2: ( ruleREAL )
            {
            // InternalTankWar.g:3534:2: ( ruleREAL )
            // InternalTankWar.g:3535:3: ruleREAL
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001C000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000001C000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000200030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000010L});

}