package org.cmpdl.arpg.attack;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.SkillVisitor;

/**
 * Basic attacks and effects of weapons. 
 * Utilizes the visitor design pattern.
 * Different weapons may have different damage scaling, types, and effects.
 * Interface used for polymorphism
 * @author cmpdl
 *
 */
public interface WeaponAttack {
	
	/**
	 * Get the description of weapon attack
	 * @return the description
	 */
	public String getDesc();
	
	/**
	 * Get the name of weapon attack
	 * @return the name
	 */
	public String getName();
	
	/**
	 * Get the source of weapon attack
	 * @return the Apocalypse Characters sources
	 */
	public ApocalypseCharacter getSource();
	
	/**
	 * Get the target of weapon attack
	 * @return the Apocalypse Characters target
	 */
	public ApocalypseCharacter getTarget();
	
	/**
	 * Set the source of weapon attack
	 * @param source Apocalypse Characters source of the attack.
	 */
	public void setSource(ApocalypseCharacter source);
	
	/**
	 * Set the target of weapon attack
	 * @param target Apocalypse Characters target of the attack.
	 */
	public void setTarget(ApocalypseCharacter target);
	
	/**
	 * Use the effect of weapon attack.
	 * Should not be called without setting the source and target. 
	 */
	public void useEffect();
	
	/**
	 * Accepting visitors used in visitor design pattern
	 * @param visitor used to use the effect of weapon attack.
	 */
	public void accept(SkillVisitor visitor);
}
