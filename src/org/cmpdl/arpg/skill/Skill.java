package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;

/**
 * Moves with special effects used by Apocalypse Characters
 * Utilizes the visitor design pattern.
 * Interface used for polymorphism
 * @author cmpdl
 *
 */
public interface Skill {
	/**
	 * Get the skill description
	 * @return skill description
	 */
	public String getDesc();
	
	/**
	 * Get the skill name
	 * @return skill name
	 */
	public String getName();
	
	/**
	 * Get skill source
	 * @return Apocalypse Characters source
	 */
	public ApocalypseCharacter getSource();
	
	/**
	 * Get skill target
	 * @return Apocalypse Characters target
	 */
	public  ApocalypseCharacter getTarget();
	
	/**
	 * Set skill target
	 * @param target Apocalypse Characters target
	 */
	public void setTarget(ApocalypseCharacter target);
	
	/**
	 * Set skill source
	 * @param source Apocalypse Characters source
	 */
	public void setSource(ApocalypseCharacter source);
	
	/**
	 * Get the current cooldown of the skill.
	 * @return cooldown count
	 */
	public int getCurrCool();
	
	/**
	 * Get the max cooldwon of the skill
	 * @return max cooldown count
	 */
	public int getMaxCool();
	
	/**
	 * Set current cooldown of skill
	 * @param cool cooldwon count
	 */
	public void setCurrCool(int cool);
	
	/**
	 * Get the Mp cost of skill
	 * @return skill Mp cost
	 */
	public int getCost();
	
	/**
	 * Get the skill damage type
	 * @return damage type (-1. Special  0. No Damage  1. Physical  2. Magic  3. True )
	 */
	public int getType();
	
	/**
	 * Use the skill effect. Should not be used if target and source are not set.
	 */
	public void useEffect();
	
	/**
	 * accepts the SkillVisitor
	 * @param visitor the SkillVisitor
	 */
	public void accept(SkillVisitor visitor);
	
	/**
	 * accepts the CoolVisitor
	 * @param visitor the CoolVisitor
	 */
	public void accept(CoolVisitor visitor);
}
