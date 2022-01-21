package org.cmpdl.arpg.core;

import org.cmpdl.arpg.characters.ApocalypseCharacter;

/**
 * Calculates and applies the damage of DoTs to the target.
 * @author cmpdl
 *
 */
public class DoTManager {
	/**
	 * Damage calculation for the DoT.
	 * @param source source of DoT damage
	 * @param target target of DoT damage
	 * @param ratio ratio of DoT damage with the stats of source
	 * @param stacks DoT stacks
	 * @param type damage applied type (1. Physical, 2. Magic, 3. True)
	 * @return the damage applied
	 */
	public static int DamageCalcalculation(ApocalypseCharacter source, ApocalypseCharacter target, double ratio, int stacks, int type) {
		double rawDamage = 0;
		double damageMultiplier = 0;
		double resultingDamge = 0;
		int appliedDamage = 0;
		
		switch (type){
			case(1): //Physical Type
				rawDamage = source.getAtk()*ratio;
				
			    //Defense damage multiplier logic
				//Damage multiplier logic is 100/(100 + target def) for positive def
				//2 - (100/(100 - target def)) for negative def
		
				if(target.getDef() >= 0 ) { //Positive def
					double denominator = 100 + target.getDef();
					damageMultiplier = 100/(denominator);
				}
				
				else if (target.getDef() < 0 && target.getDef() >= -99) { //Negaitve def
					double denominator = 100 - target.getDef();
					damageMultiplier = 2 - (100/denominator);	
				}
				
				else damageMultiplier = 2; //Multiplier maxed at 2
			
				resultingDamge = rawDamage * damageMultiplier;
				break;
				
			case (2): //Magic type
				rawDamage = source.getMatk()*ratio;

		    	//Magic defense damage multiplier logic
				//Similar to def but stat used is mdef
				if(target.getMdef() >= 0 ) {
					double denominator = 100 + target.getMdef();
					damageMultiplier = 100/denominator;
				}
				
				else if (target.getMdef() < 0 && target.getMdef() >= -99) {
					double denominator = 100 - target.getMdef();
					damageMultiplier = 2 - (100/denominator);	
				}
				
				else damageMultiplier = 2;
				
				resultingDamge = rawDamage * damageMultiplier;
				break;
				
			case (3): //True Damage (Ignores Defenses) for atk scaling
				rawDamage = source.getAtk()*ratio;
				resultingDamge = rawDamage;
				break;
				
			case (4): //True Damage for magic scaling
				rawDamage = source.getMatk()*ratio;
				resultingDamge = rawDamage;
				break;
		}
		appliedDamage = (int) resultingDamge * stacks;
		target.setHp(target.getHp() - appliedDamage);
		return appliedDamage;
	}
	
}
