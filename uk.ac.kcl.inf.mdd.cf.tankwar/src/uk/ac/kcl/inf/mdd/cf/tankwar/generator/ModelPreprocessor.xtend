package uk.ac.kcl.inf.mdd.cf.tankwar.generator

import org.eclipse.emf.ecore.resource.Resource
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame


class ModelPreprocessor {

	val TankWarGame twg
	

	

	new(Resource resource) {
		twg = resource.allContents.filter(TankWarGame).head		

	}


	def getTankWarGame() {
		twg
	}



}
