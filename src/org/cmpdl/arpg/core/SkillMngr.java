package org.cmpdl.arpg.core;

import java.util.Random;

import org.cmpdl.arpg.characters.ApocalypseCharacter;

/**
 * Calculates and applies the damage of skills/weapon attacks  to the target
 * @author cmpdl
 *
 */
public class SkillMngr {
	/**
	 * Damage calculation for skills/weapon attacks
	 * @param source source of skill/weapon attacks
	 * @param target target of skill/weapon attacks
	 * @param ratio ratio of damage based on the stat of source
	 * @param scaling stat of source that affects the skill damage (1. Atk  2. Matk  3. Hp  4. Spd  5. Shield)
	 * @param type damage applied type (1. Physical  2. Magic  3. True)
	 * @return applied damage
	 */
	public static int DamageCalcalculation(ApocalypseCharacter source, ApocalypseCharacter target, double ratio, int scaling, int type) { 
		// Scaling: atk, matk, hp, spd, shield
		//Type: physical, mgc, true
		double rawDamage = 0;
		double damageMultiplier = 0;
		double resultingDamge = 0;
		int appliedDamage = 0;
		
		switch(scaling) {	
			case (1): //Atk scaling
				rawDamage = source.getAtk() * ratio;
				break;
			
			case (2): //Mgc Scaling
				rawDamage = source.getMatk() * ratio;
				break;
			
			case (3): //Hp scaling
				rawDamage = source.getHp() * ratio;
				break;
			
			case (4): //Spd Scaling
				rawDamage = source.getSpd() * ratio;
				break;
			
			case (5): //Shield Scaling
				rawDamage = source.getShield() * ratio;
				break;
		}
		
		switch (type) {
			case(1): //Physcial Dmg
				double penMultiplier = 1 - source.getpPen();
				double def = target.getDef() * penMultiplier;
				
				//Damage multiplier logic is 100/(100 + target def) for positive def
				//2*(100/(100 - target def)) for negative def
				
				if(def >= 0 ) damageMultiplier = 100/(100 + def); //Positive Def
				else if (def < 0 && def  >= -99) { //Negative Def
					damageMultiplier = 2 - (100/(100 - def));	
				}
				else damageMultiplier = 2; //Maximum at 2x multiplier
			
				resultingDamge = rawDamage * damageMultiplier;
				break;
				
			case (2): //Magic Dmg
				
				//Similiar logic to def but stat is mdef
				double mpenMultiplier = 1 - source.getmPen();
				double mdef = target.getMdef() * mpenMultiplier;
				if(mdef >= 0 ) damageMultiplier = 100/(100 + mdef);
				else if (mdef < 0 && mdef >= -99) {
					damageMultiplier = 2 - (100/(100 - mdef));	
				}
				else damageMultiplier = 2;
				
				resultingDamge = rawDamage * damageMultiplier;
				break;
				
			case (3):
				resultingDamge = rawDamage;
				break;
		}
		
		appliedDamage = (int) resultingDamge;
		
		if (isHit(source, target)) {
			return (ApplyDamage(source, target, appliedDamage));
		}
		
		else{
			System.out.printf("%s dodged the attack.\n", target.getName());
			return 0;
		}

	}
	
	/**
	 * Check if the skill/weapon attack should hit
	 * @param source source of skill/weapon attack
	 * @param target target of skill/weapon attack
	 * @return the Hit status
	 */
	private static boolean isHit(ApocalypseCharacter source, ApocalypseCharacter target) {
		
		int accu = source.getAccu();
		int eva = target.getEva();
		int chance = accu - eva;
		
		if (chance >= 100) return true;
		else {
			Random rand = new Random();
			int randomNum = rand.nextInt(100);
			if(randomNum <= chance) {
				return true;
			}
			return false;
		}
	}

	/**
	 * Skill/weapon attack damage application
	 * @param source source of skill/weapon attack
	 * @param target target of skill/weapon attack
	 * @param appliedDamage damage to be applied
	 * @return damage applied
	 */
	public static int ApplyDamage(ApocalypseCharacter source, ApocalypseCharacter target, int appliedDamage) {
		int shield = target.getShield();
		
		if(shield >= appliedDamage) {
			target.setShield(shield - appliedDamage);
		}
		else {
			target.setShield(0);
			target.setHp(target.getHp() - (appliedDamage - shield));
		}
		System.out.printf("%s dealt %d to %s\n",source.getName(), appliedDamage, target.getName());
		
		boolean flag = target.getThornFlag();
		if (flag == true) {
			target.setThornFlag(false);
			int backdmg = appliedDamage;
			ApplyDamage(target, source, backdmg);
		}
		
		return appliedDamage;
	}
}
