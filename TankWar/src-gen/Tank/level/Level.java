package Tank.level;
import java.util.List;
import Tank.view.Tank;
import Tank.view.TankClient;
import Tank.view.Wall;

/**
 * Created by tyr on 2021/3/23.
 */
public abstract class Level {

    protected Level nextLevel;
    protected List<Wall> walls;
    protected List<Tank> tanks;
    protected int enemyNum;
    protected TankClient tankClient;


    public abstract List<Wall> getWalls();
    public abstract List<Tank> getTanks();
    public abstract Level getNextLevel();
    public abstract Level getCurrentLevel();
    public abstract int getEnemyNum();



}

