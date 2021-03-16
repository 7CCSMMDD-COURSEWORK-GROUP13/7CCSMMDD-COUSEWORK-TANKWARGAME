package uk.ac.kcl.inf.mdd.cf.tankwar.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class WallGenerator extends CommonGenerator {
	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateWallClassFileName()»''', generateWall());
	}

	def generateWall() '''
		package «generateViewPackage»;
		/**
		 * Created by tyr on 2016/2/22.
		 */
		import java.awt.*;
		public class Wall {
		    int x,y,w,h;
		    TankClient tc;
		
		    public Wall(int x,int y,int w,int h,TankClient tc){
		        this.x=x;
		        this.y=y;
		        this.w=w;
		        this.h=h;
		        this.tc = tc;
		    }
		
		    public void draw(Graphics g){
		        g.fillRect(x,y,w,h);
		    }
		
		    public Rectangle getRect(){
		        return  new Rectangle(x,y,w,h);
		    }
		
		}
		
		
		
		
	'''



}
