package uk.ac.kcl.inf.mdd.cf.tankwar.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class ExplodeGenerator extends CommonGenerator {
	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateExplodeClassFileName()»''', generateExplode());
	}

	def generateExplode() '''
		package «generateViewPackage»;
		import java.awt.*;
		/**
		 * Created by tyr on 2016/2/22.
		 */
		public class Explode {
		    int x,y;
		    private boolean live = true;
		
		    int[] diameter = {4,7,12,18,26,32,49,30,14,6};
		    int step = 0;
		    private TankClient tc = null;
		
		    public Explode(int x,int y,TankClient tc){
		        this.x= x;
		        this.y= y;
		        this.tc = tc;
		    }
		    public void draw(Graphics g){
		        if(!live){
		            tc.explodes.remove(this);
		            return;
		        }
		        if(step==diameter.length){
		            live = false;
		            step=0;
		            return;
		        }
		        Color c = g.getColor();
		        g.setColor(Color.orange);
		        g.fillOval(x,y,diameter[step],diameter[step]);
		        g.setColor(c);
		        step++;
		    }
		}

		
		
		
		
	'''



}
