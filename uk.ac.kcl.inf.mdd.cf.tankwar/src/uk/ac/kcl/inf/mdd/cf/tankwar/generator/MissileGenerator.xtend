package uk.ac.kcl.inf.mdd.cf.tankwar.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class MissileGenerator extends CommonGenerator {
	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateMissileClassFileName()»''', generateMissile());
	}

	def generateMissile() '''
		package «generateViewPackage»;
		import java.awt.*;
		
		import java.util.List;
		
		/**
		 * Created by tyr on 2016/2/21.
		 */
		public class  «generateMissileClassName»{
		    public static final int XSPEED = 10;
		    public static final int YSPEED = 10;
		
		    public static final int WIDTH = 10;
		    public static final int HEIGHT = 10;
		    int x,y;
		    private boolean live = true;
		
		    private boolean good;
		
		    «generateTankClassName».Direction dir;
		    «generateFrameClassName» tc ;
		    public «generateMissileClassName»(int x,int y,«generateTankClassName».Direction dir){
		        this.x = x;
		        this.y = y;
		        this.dir = dir;
		    }
		
		    public «generateMissileClassName»(int x,int y,boolean good, «generateTankClassName».Direction dir,TankClient tc){
		        this(x,y,dir);
		        this.good = good;
		        this.tc = tc;
		    }
		
		    public void draw(Graphics g){
		        if(!live){
		             tc.missiles.remove(this);
		             return;
		        }
		        Color c =g.getColor();
		        g.setColor(Color.black);
		        g.fillOval(x,y,WIDTH,HEIGHT);
		        g.setColor(c);
		
		        move();
		    }
		
		    private void move(){
		
		        switch (dir){
		            case L:
		                x-=XSPEED;
		                break;
		            case LU:
		                x-=XSPEED;
		                y-=YSPEED;
		                break;
		            case U:
		                y-=YSPEED;
		                break;
		            case RU:
		                x+=XSPEED;
		                y-=YSPEED;
		                break;
		            case R:
		                x+=XSPEED;
		                break;
		            case RD:
		                x+=XSPEED;
		                y+=YSPEED;
		                break;
		            case D:
		                y+=YSPEED;
		                break;
		            case LD:
		                x-=XSPEED;
		                y+=YSPEED;
		                break;
		            case STOP:
		                break;
		        }
		        if(x<0||y<0||x>«generateFrameClassName».GAME_HEIGHT||y>«generateFrameClassName».GAME_WIDTH){
		            live = false;
		        }
		
		
		    }
		
		    public boolean isLive(){
		        return live;
		    }
		
		    public void setLive(boolean live){
		        this.live = live;
		    }
		
		    public Rectangle getRect(){
		        return new Rectangle(x,y,WIDTH,HEIGHT);
		    }
		
		    public boolean hitTank(«generateTankClassName» t){
		        if(this.live&&this.getRect().intersects(t.getRect())&&t.isLive()&this.good!=t.isGood()){
		            if(t.isGood()){
		                t.setLife(t.getLife()-20);
		                if(t.getLife()<=0) t.setLive(false);
		            }else {
		                t.setLive(false);
		            }
		
		            this.setLive(false);
		            «generateExplodeClassName» e = new «generateExplodeClassName»(x,y,tc);
		            tc.explodes.add(e);
		            return true;
		        }
		        return false;
		    }
		
		    public boolean hitTanks(List<«generateTankClassName»> tanks){
		        for(int i =0;i<tanks.size();i++){
		            if(hitTank(tanks.get(i))){
		                return true;
		            }
		
		        }
		        return false;
		    }
		
		    public boolean hitWall(«generateWallClassName» w){
		        if(this.live&&this.getRect().intersects(w.getRect())){
		            this.live = false;
		            return true;
		        }
		        return false;
		    }
		}

		
		
		
	'''



}
