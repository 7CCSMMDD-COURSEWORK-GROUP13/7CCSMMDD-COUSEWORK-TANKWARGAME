# COUSEWORK-TANKWARGAME
It is 7CCSMMDD CourseWork TankWarGame belongs to GROUP 13

Development Environment: Eclipse

Java version: Java 11

Demo Directory: TankWar

Demo File: TankWar.tgame

Warning: Please clean all the project before you build.

```
game Tank{
	
	screen MainFrame{
		screenWidth = 750
		screenHeight = 750
	}
	
	
	
	field easy {
		enemyCount = 2
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
		enemyCount = 4
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
		enemyCount = 8
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
	
	//superMode
	end-game("Congratulations You Win!","Unfortunately You Lost!")
	start = easy
}
```
