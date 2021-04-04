package uk.ac.kcl.inf.mdd.cf.tankwar.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WallObstacle
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ObstacleMember
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Expression

class LevelGenerator extends CommonGenerator{
	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateAbsLevelClassFileName()»''', generateAbsLevelClass())
		
		twg.fields.forEach [ l |
			fsa.generateFile('''«generateLevelClassFileName(l.name)»''', generateLevelClass(l))
		]
	}
	
	
	
	def generateLevelClass(FieldSpecification f) '''
			package «generateLevelPackage»;
			import java.util.ArrayList;
			import java.util.List;
			
			import «generateViewPackage».«generateTankClassName»;
			import «generateViewPackage».«generateFrameClassName»;
			import «generateViewPackage».«generateWallClassName»;
			
			/**
			 * Created by tyr on 2021/3/23.
			 */
			public class «generateLevelClassName(f.name)» extends Level {
			
			    public «generateLevelClassName(f.name)»(«generateFrameClassName» tankClient){
			        this.tankClient = tankClient;
			    }
			
			    @Override
			    public List<«generateWallClassName»> getWalls() {
			        walls = new ArrayList<>();
			       	«f.obstacle.fields.join("",[obstacle| generateObstacleFieldInitialiserFor(obstacle)])»
			        return walls;
			    }
			
			    @Override
			    public List<«generateTankClassName»> getTanks() {
			        tanks = new ArrayList<>();
			        for(int i =0;i<getEnemyNum();i++){
			            tanks.add(new «generateTankClassName»(50+40*(i+1),50,false,«generateTankClassName».Direction.D,tankClient));
			        }
			        return tanks;
			    }
			
			    @Override
			    public «generateAbsLevelClassName» getNextLevel() {
			        return new «generateLevelClassName(f.nextLevel.name)»(tankClient);
			    }
			
			    @Override
			    public «generateAbsLevelClassName» getCurrentLevel() {
			        return this;
			    }
			
			    @Override
			    public int getEnemyNum() {
			        return «f.enemyCount.evaluate.intValue»;
			    }
			
			
			}
			
	'''
	
	
	def generateAbsLevelClass() '''
		package «generateLevelPackage»;
		import java.util.List;
		import «generateViewPackage».«generateTankClassName»;
		import «generateViewPackage».«generateFrameClassName»;
		import «generateViewPackage».«generateWallClassName»;
		
		/**
		 * Created by tyr on 2021/3/23.
		 */
		public abstract class «generateAbsLevelClassName» {
		
		    protected «generateAbsLevelClassName» nextLevel;
		    protected List<«generateWallClassName»> walls;
		    protected List<«generateTankClassName»> tanks;
		    protected int enemyNum;
		    protected «generateFrameClassName» tankClient;
		
		
		    public abstract List<«generateWallClassName»> getWalls();
		    public abstract List<«generateTankClassName»> getTanks();
		    public abstract «generateAbsLevelClassName» getNextLevel();
		    public abstract «generateAbsLevelClassName» getCurrentLevel();
		    public abstract int getEnemyNum();
		
		
		
		}
		
	'''
	def generateObstacleFieldInitialiserFor(ObstacleMember member) {
		if(member instanceof WallObstacle){
			'''
				walls.add(new «generateWallClassName»(«member.wallPosX»,«member.wallPosY»,«member.wallWidth»,«member.wallHeight»,tankClient));
			'''
		}else{
			''''''
		}
	}


}
