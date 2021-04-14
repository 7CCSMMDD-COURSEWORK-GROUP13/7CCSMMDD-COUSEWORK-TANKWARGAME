## Get Start
**1. Clone project to your Eclipse.**

Open Eclipse -> File -> Import 
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114480417-714e0580-9bfa-11eb-9f8e-a02617296f33.png" alt="Editor" width="500">
</div>
Click Projects from Git -> Next
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114483827-ff2cef00-9c00-11eb-8a6e-87c13f794ee2.png" alt="Editor" width="500">
</div>
Click Clone URL -> Next

Then input URL: https://github.com/7CCSMMDD-COURSEWORK-GROUP13/7CCSMMDD-COUSEWORK-TANKWARGAME.git

<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114483948-356a6e80-9c01-11eb-8eba-2b25f2a5843f.png" alt="Editor" width="500">
</div>
Input User and Password -> Next
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114483992-4c10c580-9c01-11eb-8a87-7d359cc01634.png" alt="Editor" width="500">
</div>
Select the branch: master -> Next
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114484063-6f3b7500-9c01-11eb-8396-19083d5a7b0a.png" alt="Editor" width="500">
</div>
Chose your local destination -> Next
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114484309-e113be80-9c01-11eb-98fb-9444b81bdf32.png" alt="Editor" width="500">
</div>
Chose import existing Eclipse projects -> Next
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114484438-220bd300-9c02-11eb-9070-73c1fa52d260.png" alt="Editor" width="500">
</div>
Chose projects we need to clone as picture shows -> Finish

**if you see some problems as picture shows**
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114484837-d279d700-9c02-11eb-9330-b71844dcc78c.png" alt="Editor" width="500">
</div>
Right click Project 'uk.ac.kcl.inf.mdd.cf.tankwar.ui.tests' -> New -> Folder
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114484994-0fde6480-9c03-11eb-8716-f49fda0809b0.png" alt="Editor" width="500">
</div>
Input Folder name 'src' -> Finish

Right click Project 'uk.ac.kcl.inf.mdd.cf.tankwar.ui.tests' -> New -> Folder
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114485079-40260300-9c03-11eb-821d-03e20a3d10c9.png" alt="Editor" width="500">
</div>

Input Folder name 'xtend-gen' -> Finish

**2. Generate Xtext Artififacts**

Click project 'uk.ac.kcl.inf.mdd.cf.tankwar' -> src -> package 'uk.ac.kcl.inf.mdd.cf.tankwar' -> double click 'TankWar.xtext'

After opening 'TankWat.xtext', right click -> Run as -> Generate Xtext Artififacts

The console shows as pictures:
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114487425-782f4500-9c07-11eb-9224-f4818381ac78.png" alt="Editor" width="500">
</div>
**3. Run an example writen by TGAME language**

Right click 'uk.ac.kcl.inf.mdd.cf.tankwar' -> Run as -> Eclipse Application

After opening another Eclipse application

Click File -> 'Open Projects from File System'
<div align="left">
	<img src="https://user-images.githubusercontent.com/77758668/114488239-efb1a400-9c08-11eb-8e98-d4c5ace254a2.png" alt="Editor" width="500">
</div>
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

[Back To ReadMe](./README.md)
