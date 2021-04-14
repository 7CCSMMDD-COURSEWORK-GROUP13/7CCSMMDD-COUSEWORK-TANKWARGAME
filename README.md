# COUSEWORK-TANKWARGAME
It is 7CCSMMDD CourseWork TankWarGame belongs to GROUP 13
## Description
This is a tank war game! The only way to win is destroy all enemy tanks.

Control your tank by dir key such as up,down,left and right

Shoot your enemies by space key.

Come up! Solider!

## Environment
- Development Environment: Eclipse
- Java version: Java 11

## Warning: Please clean all the project before you build.
## Get Start
[Configuration Guide](./GUIDE.md)

## Directory Structure:

These following directories are project code, you should import them into eclipse.And then you can run them as Eclipse Application
- uk.ac.kcl.inf.mdd.cf.tankwar
- uk.ac.kcl.inf.mdd.cf.tankwar.ide
- uk.ac.kcl.inf.mdd.cf.tankwar.tests
- uk.ac.kcl.inf.mdd.cf.tankwar.ui
- uk.ac.kcl.inf.mdd.cf.tankwar.ui.tests

These following directories are demo code, you should import them into runtime-eclipse.And then you can run the TankWar.tgame as Java Application.
- TankWar
  - src 
    - TankWar.tgame
These following directories are test code, you should import them into runtime-eclipse.And then you can run the test1.tgame.xt as Java Application.
- uk.ac.kcl.inf.language.tgame.xpect
  - src
    - test1.tgame.xt  	

## Syntax:
```
game Tank{
	var baseEnemyCount = 1
	screen MainFrame{            //it contains the mainframe attributes
		screenWidth = 750    //screenwidth 
		screenHeight = 750   //screenheight
	}
	
	
	//every field points to a level, it contains these following attributes, enemyCount means the number of enemy tank, obstacle means the wall and other obstacles.
	// wall contains width,height and x,y.
	// nextLevel means when you defeat this level, which level you will go.
	field easy {
		enemyCount = baseEnemyCount*1+2
		obstacle test{
			wall first{
				wallWidth = 100
				wallHeight = 100
				wallPosX = 250
				wallPosY = 250
			}
		}
		
		nextLevel goto medium
	}
	
	field medium {
		enemyCount = baseEnemyCount*2+3
		obstacle test{
			wall first{
				wallWidth = 100
				wallHeight = 100
				wallPosX = 250
				wallPosY = 250
			}
			wall second{
				wallWidth = 100
				wallHeight = 100
				wallPosX = 550
				wallPosY = 550
			}
		}
		
		nextLevel goto hard
		
		
	}
	
	field hard {
		enemyCount = baseEnemyCount*3+4
		obstacle test{
			wall first{
				wallWidth = 100
				wallHeight = 100
				wallPosX = 250
				wallPosY = 250
			}
			wall second{
				wallWidth = 100
				wallHeight = 100
				wallPosX = 550
				wallPosY = 550
			}
			wall third{
				wallWidth = 100
				wallHeight = 100
				wallPosX = 600
				wallPosY = 600
			}
		}
		
		nextLevel goto easy
		
	}
	// superMode is a super mode, you can try it to find everything is excellent!!!!
	//superMode
	
	//end-game will push some sentence to the dialog when you win or lost, the first occurs when you win, the second occurs when you lost
	end-game("Congratulations You Win!","Unfortunately You Lost!")
	//start means the first level you will play
	start = easy
}
```
