package Tank.view;
import java.awt.*;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.util.*;

/**
 * Created by tyr on 2016/2/21.
 */
public class Tank {
    private int x,y;
    /*
    the whole width
     */
    public static final int WIDTH = 30;
    public static final int Height = 30;
    public static final int XSPEED = 5;
    public static final int YSPEED = 5;

    private BloodeBar bb = new BloodeBar();

    private static Random r = new Random();

    private int life = 100;

    TankClient tc ;

    private boolean live = true;

    private boolean good;

    private int Oldx,Oldy;
    private boolean bL = false,bU = false,bR = false,bD = false;

    public enum Direction{L,LU,U,RU,RD,R,D,LD,STOP};

    private Direction dir = Direction.STOP;
    private Direction ptdir = Direction.D;

    private int step = r.nextInt(12)+3;
    public Tank(int x,int y,boolean good,TankClient tc){
        this.x = x;
        this.y = y;
        this.Oldx = x;
        this.Oldy = y;
        this.tc = tc;
        this.good = good;
    }

    public Tank(int x,int y,boolean good,Direction dir,TankClient tc){
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.good = good;
        this.tc = tc;
    }

    public void draw(Graphics g){
        if(!live) {
            if(!good){
                tc.tanks.remove(this);
            }
            return;
        }
        Color c = g.getColor();
        if(good) g.setColor(Color.RED);
        else g.setColor(Color.blue);
        g.fillOval(x,y,WIDTH,Height);
        g.setColor(c);

        if(good) bb.draw(g);

        move();

        switch (ptdir){
            case L:
                g.drawLine(x+Tank.WIDTH/2,y+Tank.Height/2,x,y+Tank.Height/2);
                break;
            case LU:
                g.drawLine(x+Tank.WIDTH/2,y+Tank.Height/2,x,y);
                break;
            case U:
                g.drawLine(x+Tank.WIDTH/2,y+Tank.Height/2,x+Tank.WIDTH/2,y);
                break;
            case RU:
                g.drawLine(x+Tank.WIDTH/2,y+Tank.Height/2,x+Tank.WIDTH,y);
                break;
            case R:
                g.drawLine(x+Tank.WIDTH/2,y+Tank.Height/2,x+Tank.WIDTH,y+Tank.Height/2);
                break;
            case RD:
                g.drawLine(x+Tank.WIDTH/2,y+Tank.Height/2,x+Tank.WIDTH,y+Tank.Height);
                break;
            case D:
                g.drawLine(x+Tank.WIDTH/2,y+Tank.Height/2,x+Tank.WIDTH/2,y+Tank.Height);
                break;
            case LD:
                g.drawLine(x+Tank.WIDTH/2,y+Tank.Height/2,x,y+Tank.Height);
                break;
            case STOP:
                break;
        }
        if(x<0) x=0;
        if(y<30) y=30;
        if(x+Tank.WIDTH>TankClient.GAME_WIDTH) x = TankClient.GAME_WIDTH-Tank.WIDTH;
        if(y+Tank.Height>TankClient.GAME_HEIGHT) y = TankClient.GAME_HEIGHT-Tank.Height;

        if(!good){
            Direction[] dirs = Direction.values();
            if(step==0){
                step = r.nextInt(12)+3;
                int rn = r.nextInt(dirs.length);
                dir = dirs[rn];
            }

            step--;
            if(r.nextInt(40)>20) this.fire();
        }
    }

    void move(){
        this.Oldx = x; this.Oldy = y;
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

        if(this.dir!= Direction.STOP){
            this.ptdir = this.dir;
        }

    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_LEFT:
                bL = true;
                break;
            case KeyEvent.VK_UP:
                bU = true;
                break;
            case KeyEvent.VK_RIGHT:
                bR = true;
                break;
            case KeyEvent.VK_DOWN:
                bD = true;
                break;
        }
        locateDirection();
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_F2:
                if(!this.live){
                    this.live  = true;
                    this.life = 100;
                }
            case KeyEvent.VK_CONTROL:
                tc.missiles.add(fire());
                break;
            case KeyEvent.VK_LEFT:
                bL = false;
                break;
            case KeyEvent.VK_UP:
                bU = false;
                break;
            case KeyEvent.VK_RIGHT:
                bR = false;
                break;
            case KeyEvent.VK_DOWN:
                bD = false;
                break;
            case KeyEvent.VK_SPACE:
            	fire();
                break;
        }
    }

    void locateDirection(){
        if(bL&&!bU&&!bR&&!bD) dir = Direction.L;
        else if(bL&&bU&&!bR&&!bD) dir = Direction.LU;
        else if(!bL&&bU&&!bR&&!bD) dir = Direction.U;
        else if(!bL&&bU&&bR&&!bD) dir = Direction.RU;
        else if(!bL&&!bU&&bR&&!bD) dir = Direction.R;
        else if(!bL&&!bU&&bR&&bD) dir = Direction.RD;
        else if(!bL&&!bU&&!bR&&bD) dir = Direction.D;
        else if(bL&&!bU&&!bR&&bD) dir = Direction.LD;
        else if(!bL&&!bU&&!bR&&!bD) dir = Direction.STOP;
    }

    public Missile fire(){
        if(!live) return null;
        int x = this.x+Tank.WIDTH/2-Missile.WIDTH/2;
        int y = this.y+Tank.Height/2-Missile.HEIGHT/2;
        Missile m  =  new Missile(x,y,good,ptdir,tc);
        tc.missiles.add(m);
        return m;
    }

    public Missile fire(Direction dir){
        if(!live) return null;
        int x = this.x+Tank.WIDTH/2-Missile.WIDTH/2;
        int y = this.y+Tank.Height/2-Missile.HEIGHT/2;
        Missile m  =  new Missile(x,y,good,dir,tc);
        tc.missiles.add(m);
        return m;
    }

    public void superFire(){
        Direction[] dirs = Direction.values();
        for(int i=0;i<8;i++){
            tc.missiles.add(fire(dirs[i]));
        }
    }

    public boolean isLive(){
        return live;
    }

    public void setLive(boolean live){
        this.live = live;
    }

    public Rectangle getRect(){
        return new Rectangle(x,y,WIDTH,Height);
    }

    public boolean isGood(){return good;}

    private void stay(){
        x=Oldx;
        y=Oldy;
    }

    public int getLife(){
        return life;
    }

    public int setLife(int life){
        this.life = life;
        return life;
    }
    /*
    @param w Wall
    @return true,or false
     */
    public boolean collidesWithWall(Wall w){
        if(this.live&&this.getRect().intersects(w.getRect())){
            this.stay();
            return true;
        }
        return false;
    }

    public boolean collidesWithTank(java.util.List<Tank> tanks){
        for(int i =0 ;i<tanks.size();i++){
            Tank t = tanks.get(i);
            if(this!=t){
                if(this.live&&t.isLive()&&this.getRect().intersects(t.getRect())){
                    this.stay();
                    t.stay();
                    return true;
                }
            }
        }
        return false;
    }

    private class BloodeBar{
        public void draw(Graphics g){
            Color c = g.getColor();
            g.setColor(Color.red);
            g.drawRect(x,y-10,WIDTH,10);
            int w = WIDTH*life/100;
            g.fillRect(x,y-10,w,10);
            g.setColor(c);
        }
    }
}



