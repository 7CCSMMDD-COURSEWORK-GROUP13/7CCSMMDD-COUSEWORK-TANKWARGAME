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
**1. Clone project to your Eclipse.**

Open Eclipse -> File -> Import 

![image](https://user-images.githubusercontent.com/77758668/114480417-714e0580-9bfa-11eb-9f8e-a02617296f33.png)

Click Projects from Git -> Next

![image](https://user-images.githubusercontent.com/77758668/114483827-ff2cef00-9c00-11eb-8a6e-87c13f794ee2.png)

Click Clone URL -> Next

Then input URL: https://github.com/7CCSMMDD-COURSEWORK-GROUP13/7CCSMMDD-COUSEWORK-TANKWARGAME.git

![image](https://user-images.githubusercontent.com/77758668/114483948-356a6e80-9c01-11eb-8eba-2b25f2a5843f.png)

Input User and Password -> Next

![image](https://user-images.githubusercontent.com/77758668/114483992-4c10c580-9c01-11eb-8a87-7d359cc01634.png)

Select the branch: master -> Next

![image](https://user-images.githubusercontent.com/77758668/114484063-6f3b7500-9c01-11eb-8396-19083d5a7b0a.png)

Chose your local destination -> Next

![image](https://user-images.githubusercontent.com/77758668/114484309-e113be80-9c01-11eb-98fb-9444b81bdf32.png)

Chose import existing Eclipse projects -> Next

![image](https://user-images.githubusercontent.com/77758668/114484438-220bd300-9c02-11eb-9070-73c1fa52d260.png)

Chose projects we need to clone as picture shows -> Finish

**if you see some problems as picture shows**

![image](https://user-images.githubusercontent.com/77758668/114484837-d279d700-9c02-11eb-9330-b71844dcc78c.png)

Right click Project 'uk.ac.kcl.inf.mdd.cf.tankwar.ui.tests' -> New -> Folder

![image](https://user-images.githubusercontent.com/77758668/114484994-0fde6480-9c03-11eb-8716-f49fda0809b0.png)

Input Folder name 'src' -> Finish

Right click Project 'uk.ac.kcl.inf.mdd.cf.tankwar.ui.tests' -> New -> Folder

![image](https://user-images.githubusercontent.com/77758668/114485079-40260300-9c03-11eb-821d-03e20a3d10c9.png)

Input Folder name 'xtend-gen' -> Finish

**2. Generate Xtext Artififacts**

Click project 'uk.ac.kcl.inf.mdd.cf.tankwar' -> src -> package 'uk.ac.kcl.inf.mdd.cf.tankwar' -> double click 'TankWar.xtext'

After opening 'TankWat.xtext', right click -> Run as -> Generate Xtext Artififacts

The console shows as pictures:

![image](https://user-images.githubusercontent.com/77758668/114487425-782f4500-9c07-11eb-9224-f4818381ac78.png)

**3. Run an example writen by TGAME language**

Right click 'uk.ac.kcl.inf.mdd.cf.tankwar' -> Run as -> Eclipse Application

After opening another Eclipse application

Click File -> 'Open Projects from File System'

![image](https://user-images.githubusercontent.com/77758668/114488239-efb1a400-9c08-11eb-8e98-d4c5ace254a2.png)

The import source is the local destination in step1

Click this two projects as picture shows

Click Finish

**4. Run the example project**

Click 'TankWar' -> src -> 'TankWar.tgame' 

This is an example file about how to use TGAME language

Right click 'TankWar' -> Run as 'Java Application' 

Then we can run the example

**'TankWar' is an example project about how to use TGAME language**
**'uk.ac.kcl.inf.language.tgame.xpect' is the xpect project to test**

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
