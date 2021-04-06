package Tank.level;
import java.util.ArrayList;
import java.util.List;

import Tank.view.Tank;
import Tank.view.TankClient;
import Tank.view.Wall;

/**
 * Created by tyr on 2021/3/23.
 */
public class LevelEasy extends Level {

    public LevelEasy(TankClient tankClient){
        this.tankClient = tankClient;
    }

    @Override
    public List<Wall> getWalls() {
        walls = new ArrayList<>();
       	walls.add(new Wall(190,200,100,100,tankClient));
        return walls;
    }

    @Override
    public List<Tank> getTanks() {
        tanks = new ArrayList<>();
        for(int i =0;i<getEnemyNum();i++){
            tanks.add(new Tank(50+40*(i+1),50,false,Tank.Direction.D,tankClient));
        }
        return tanks;
    }

    @Override
    public Level getNextLevel() {
        return new LevelMedium(tankClient);
    }

    @Override
    public Level getCurrentLevel() {
        return this;
    }

    @Override
    public int getEnemyNum() {
        return 3;
    }


}

