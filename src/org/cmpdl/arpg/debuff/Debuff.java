package org.cmpdl.arpg.debuff;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.DebuffVisitor;

/**
 * Lingering (based on stacks) detrimental effects that lowers the Apocalypse Characters' stats.
 * 
 * Utilizes the visitor design pattern.
 * Interface used for polymorphism
 * 
 * @author cmpdl
 *
 */
public interface Debuff {
	/**
	 * Get the description of debuff
	 * @return the description
	 */
	public String getDesc();
	
	/**
	 * Get the name of debuff
	 * @return the name
	 */
	public String getName();
	
	/**
	 * Get the stacks of the debuff
	 * @return number of stacks
	 */
	public int getStacks();
	
	/**
	 * Set the stacks of the debuff
	 * @param stack number of stacks
	 */
	public void setStacks(int stack);
	
	/**
	 * Get the Apocalypse Characters source of debuff
	 * @return source of debuff
	 */
	public ApocalypseCharacter getSource();
	
	/**
	 * Get the Apocalypse Characters target of debuff
	 * @return the target of debuff
	 */
	public ApocalypseCharacter getTarget();
	
	/**
	 * Set the target of debuff
	 * @param target Apocalypse Characters target of debuff
	 */
	public void setTarget(ApocalypseCharacter target);
	
	/**
	 * Set the source of debuff
	 * @param source Apocalypse Characters source of debuff
	 */
	public void setSource(ApocalypseCharacter source);
	
	/**
	 * Use the effect of debuff.
	 * Should not be used if target and source are not set
	 */
	public void useEffect();
	
	/**
	 * Reduce the stack of debuff.
	 */
	public void reduceStack();
	
	/**
	 * Accepts the DebuffVisitor
	 * @param visitor the DebuffVisitor
	 */
	public void accept(DebuffVisitor visitor);
}
