package uk.ac.kcl.inf.mdd.cf.tankwar.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ObstacleMember
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WallObstacle
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.StartFieldDeclaration
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.OptionSpecification
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntLiteral
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.RealLiteral
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Multiplication
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Addition
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Expression

class FrameGenerator extends CommonGenerator {
	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateFrameClassFileName()»''', generateFrame());
	}

	def generateFrame() '''
		package «generateViewPackage»;
		
		import java.awt.*;
		import java.awt.event.*;
		import java.util.List;
		import java.util.ArrayList;
		import javax.swing.JOptionPane;
		import «generateLevelPackage».*;
		
		/*
		 *TankWar mainFrame
		 *@author tiyiran
		 */
		/**
		 * Created by tyr on 2016/2/21.
		 */
		public class «generateFrameClassName» extends Frame{
		    public static final int GAME_WIDTH = «twg.screen.screenWidth»;
		    public static final int GAME_HEIGHT = «twg.screen.screenHeight»;
			public int ENEMY_TANK_COUNT = 5;
		    «generateTankClassName» myTank = new «generateTankClassName»(50,50,true,this);
		   
			List<«generateWallClassName»> walls = new ArrayList<>();
		    List<«generateMissileClassName»> missiles = new ArrayList<>();
		    List<«generateExplodeClassName»> explodes = new ArrayList<>();
		    List<«generateTankClassName»> tanks = new ArrayList<>();
		    Image offScreenImage = null;
		    private «generateAbsLevelClassName» currentLevel = null;
		    
		    public «generateFrameClassName»(){
		    	currentLevel = new «getInitLevelName()»(this);
		    	init();
		    }
		
		    public void paint(Graphics g){
		
		        g.drawString("misslescount"+missiles.size(),10,50);
		        g.drawString("explodescount"+explodes.size(),10,70);
		        g.drawString("tankscount"+tanks.size(),10,90);
		        g.drawString("tanks life"+myTank.getLife(),10,100);
		
		        for(int i = 0;i<missiles.size();i++){
		            «generateMissileClassName» m  = missiles.get(i);
		            m.hitTanks(tanks);
		            m.hitTank(myTank);
					for («generateWallClassName» wall:walls){
						m.hitWall(wall);
					}		           
		            m.draw(g);
		        }
		        for(int  i=0;i<explodes.size();i++){
		            «generateExplodeClassName» e = explodes.get(i);
		            e.draw(g);
		        }
		        for(int i =0;i<tanks.size();i++){
		            «generateTankClassName» t = tanks.get(i);
		            for («generateWallClassName» wall:walls){
		                t.collidesWithWall(wall);
		            }
		            t.collidesWithTank(tanks);
		            t.draw(g);
		        }
		        
		        
		        for («generateWallClassName» wall:walls){
		        	myTank.collidesWithWall(wall);
		        }
		        myTank.draw(g);
		        for («generateWallClassName» wall:walls){
		        	wall.draw(g);
		        }
		        
		    }
		
		    public void update(Graphics g){
		        if(offScreenImage==null){
		            offScreenImage = this.createImage(GAME_WIDTH,GAME_HEIGHT);
		        }
		        Graphics goffScreen = offScreenImage.getGraphics();
		        Color c = goffScreen.getColor();
		        goffScreen.setColor(Color.GREEN);
		        goffScreen.fillRect(0,0,GAME_WIDTH,GAME_HEIGHT);
		        goffScreen.setColor(c);
		        paint(goffScreen);
		        g.drawImage(offScreenImage,0,0,null);
		    }
		    /*
		     xianshiTankmainFrame
		     */
		    public void launchFrame(){
«««		        for(int i =0;i<ENEMY_TANK_COUNT;i++){
«««		            tanks.add(new Tank(50+40*(i+1),50,false,Tank.Direction.D,this));
«««		        }
		        this.setTitle("TankWar");
		        this.setLocation(400,300);
		        this.setSize(GAME_WIDTH,GAME_HEIGHT);
		        this.addWindowListener(new WindowAdapter() {
		            public void windowClosing(WindowEvent e) {
		                System.exit(0);
		            }
		        });
		        this.setBackground(Color.GREEN);
		        this.addKeyListener(new KeyMonitor());
		        this.setResizable(false);
		        setVisible(true);
		
		        new Thread(new PaintThread()).start();
		    }
		    public static void main(String[] args){
		        «generateFrameClassName» tc = new «generateFrameClassName»();
		        tc.launchFrame();
		    }
		    
		    public void clean(){
		           walls.clear();
		           missiles.clear();
		           explodes.clear();
		           tanks.clear();
		    }
		    
		    public void init(){
		            myTank = new «generateTankClassName»(50,50,true,this);
		            walls = currentLevel.getWalls();
		            tanks = currentLevel.getTanks();
		    }
		
		    private class PaintThread implements Runnable{
		        public void run(){
		            while(true){
		            	
		            	«twg.options.join ("", [f | generateEndGameMessage(f)])»
		            	
		                repaint();
		                try{
		                    Thread.sleep(50);
		                }catch (InterruptedException e){
		                    e.printStackTrace();
		                }
		            }
		        }
		    }
		
		    private class KeyMonitor extends KeyAdapter{
		        public void keyPressed(KeyEvent e){
		            myTank.keyPressed(e);
		        }
		        public void keyReleased(KeyEvent e){
		            myTank.keyReleased(e);
		        }
		    }
		    
«««		    «twg.fields.join (" ", [f | generateFieldInitialiserFor(f)])»
		    
		
		}
		
	'''
	
	def generateEndGameMessage(OptionSpecification options){
		if(options instanceof EndGameBehaviour){
			'''
		     if(tanks.size()<=0) {
		     	Object[] options = {"next","exit"};
		     	int userOption = JOptionPane.showOptionDialog(null, "«options.win»", "TankWar Game Result", JOptionPane.YES_OPTION,
		     	                            JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
		        if (userOption == 0) {
		           currentLevel = currentLevel.getNextLevel();
		           if(currentLevel!=null){
		           	 	System.out.println(currentLevel.getEnemyNum());
		       			clean();
		           		init();
		           }
		     	}else {
		            System.exit(1);
		     	}
		     }
		     
		     if (!myTank.isLive()){
		     	Object[] options = {"replay","exit"};
		     	int userOption = JOptionPane.showOptionDialog(null,"«options.lost»", "TankWar Game Result", JOptionPane.YES_OPTION,
		     	                            JOptionPane.QUESTION_MESSAGE,null, options, options[0]);		 
		     	 if (userOption == 0) {
		     	 	System.out.println(currentLevel.getEnemyNum());
		       		clean();
		           	init();		         
		         }else {
		            System.exit(1);
		         }
		     }
		     '''
		}else{
			''''''
		}
	}
	
	
	def generateObstacleDrawFor(ObstacleMember member) {
		if(member instanceof WallObstacle){
			'''
				«member.name»Wall.draw(g);
			'''
		}else{
			''''''
		}
	}
	
	def generateObstacleHitFor(ObstacleMember member) {
		if(member instanceof WallObstacle){
			'''
			m.hitWall(«member.name»Wall);
			'''
		}else{
			''''''
		}
	}
	
	def generateObstacleCollideFor(ObstacleMember member) {
		if(member instanceof WallObstacle){
			'''
			t.collidesWithWall(«member.name»Wall);
			'''
		}
	}
	
	def generateObstacleMyTankCollideFor(ObstacleMember member) {
		if(member instanceof WallObstacle){
			'''
			myTank.collidesWithWall(«member.name»Wall);
			'''
		}else{
			''''''
		}
	}
	
	def getInitLevelName() {
		twg.options.filter(StartFieldDeclaration).join(" ", [o|'''Level«o.field.name.toFirstUpper»'''])
	}
	

}
