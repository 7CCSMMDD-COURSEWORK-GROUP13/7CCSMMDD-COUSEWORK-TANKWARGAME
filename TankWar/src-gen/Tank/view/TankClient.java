package Tank.view;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Tank.level.*;

/*
 *TankWar mainFrame
 *@author tiyiran
 */
/**
 * Created by tyr on 2016/2/21.
 */
public class TankClient extends Frame{
    public static final int GAME_WIDTH = 760;
    public static final int GAME_HEIGHT = 750;
	public int ENEMY_TANK_COUNT = 5;
    Tank myTank = new Tank(50,50,true,this);
   
	List<Wall> walls = new ArrayList<>();
    List<Missile> missiles = new ArrayList<>();
    List<Explode> explodes = new ArrayList<>();
    List<Tank> tanks = new ArrayList<>();
    Image offScreenImage = null;
    private Level currentLevel = null;
    
    public TankClient(){
    	currentLevel = new LevelEasy(this);
    	init();
    }

    public void paint(Graphics g){

        g.drawString("misslescount"+missiles.size(),10,50);
        g.drawString("explodescount"+explodes.size(),10,70);
        g.drawString("tankscount"+tanks.size(),10,90);
        g.drawString("tanks life"+myTank.getLife(),10,100);

        for(int i = 0;i<missiles.size();i++){
            Missile m  = missiles.get(i);
            m.hitTanks(tanks);
            m.hitTank(myTank);
			for (Wall wall:walls){
				m.hitWall(wall);
			}		           
            m.draw(g);
        }
        for(int  i=0;i<explodes.size();i++){
            Explode e = explodes.get(i);
            e.draw(g);
        }
        for(int i =0;i<tanks.size();i++){
            Tank t = tanks.get(i);
            for (Wall wall:walls){
                t.collidesWithWall(wall);
            }
            t.collidesWithTank(tanks);
            t.draw(g);
        }
        
        
        for (Wall wall:walls){
        	myTank.collidesWithWall(wall);
        }
        myTank.draw(g);
        for (Wall wall:walls){
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
        TankClient tc = new TankClient();
        tc.launchFrame();
    }
    
    public void clean(){
           walls.clear();
           missiles.clear();
           explodes.clear();
           tanks.clear();
    }
    
    public void init(){
            myTank = new Tank(50,50,true,this);
            walls = currentLevel.getWalls();
            tanks = currentLevel.getTanks();
    }

    private class PaintThread implements Runnable{
        public void run(){
            while(true){
            	
            	if(tanks.size()<=0) {
            		Object[] options = {"next","exit"};
            		int userOption = JOptionPane.showOptionDialog(null, "Congratulations You Win!", "TankWar Game Result", JOptionPane.YES_OPTION,
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
            		int userOption = JOptionPane.showOptionDialog(null,"Unfortunately You Lost!", "TankWar Game Result", JOptionPane.YES_OPTION,
            		                            JOptionPane.QUESTION_MESSAGE,null, options, options[0]);		 
            		 if (userOption == 0) {
            		 	System.out.println(currentLevel.getEnemyNum());
            	  		clean();
            	      	init();		         
            	    }else {
            	       System.exit(1);
            	    }
            	}
            	
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
    
    

}

