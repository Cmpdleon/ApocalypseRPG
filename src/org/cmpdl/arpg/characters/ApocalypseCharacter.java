package org.cmpdl.arpg.characters;

import org.cmpdl.arpg.skill.Skill;
import org.cmpdl.arpg.attack.WeaponAttack;
import org.cmpdl.arpg.debuff.*;


/**
 * Apocalypse Character. The playing character in Apocalypse rpg.
 * 
 * Includes the Player and the enemies called sovereigns.
 * Interface used for polymorphism
 * 
 * @author cmpdl
 *
 */

public interface ApocalypseCharacter {
	
	/**
	 * Checks if the character is dead
	 * @return Hp status
	 */
	public boolean isDead();
	
	/**
	 * Checks if the character should return damage.
	 * @return thornFlag status
	 */
	public boolean getThornFlag();
	
	/**
	 * Set the thornFlag status
	 * @param thornFlag thornFlag status
	 */
	public void setThornFlag(boolean thornFlag);
	
	/**
	 * Get the skill of Apocalypse Characters at the specified index.
	 * @param index index of the skill
	 * @return the skill
	 */
	public Skill getSkill(int index);
	
	/**
	 * Get all none hp decreasing debuffs of Apocalypse Characters
	 * @return all non hp decreasing debuffs
	 */
	public Debuff [] getAllDebuff();
	
	/**
	 * Get all hp decreasing debuffs of Apocalypse Characters. These are called DoTs
	 * @return all DoTs
	 */
	public Debuff [] getAllDoT();
	
	/**
	 * Set the Skill of Apocalypse Characters.
	 * @param skill
	 */
	public void setSkill(Skill skill);
	
	/**
	 * Increment the debuff at a specified index.
	 * @param index
	 * @param increment
	 */
	public void addDebuff(int index,int increment);
	
	/**
	 * Set the debuff at a specified index.
	 * @param index debuff index
	 * @param value debuff stack value.
	 */
	public void setDebuff(int index, int value);
	
	/**
	 * Get the debuff at a specified index.
	 * @param index index of debuff
	 * @return the debuff
	 */
	public Debuff getDebuff(int index);
	
	/**
	 * Increment DoT at the specified index
	 * @param index index of DoT
	 * @param increment add to the DoT stack(s)
	 */
	public void addDot(int index,int increment);
	
	/**
	 * Set the Dot at the specified index
	 * @param index index of DoT
	 * @param value stack(s) of DoT
	 */
	public void setDot(int index, int value);
	
	/**
	 * Get the DoT at the specified index.
	 * @param index index of DoT
	 * @return the DoT
	 */
	public Debuff getDot(int index);
	
	/**
	 * Get the name of Apocalypse Characters
	 * @return the name
	 */
	public String getName();
	
	/**
	 * Set the name of Apocalypse Characters
	 * @param name name of Apocalypse Character
	 */
	public void setName(String name);
	
	//Getters and Setters for general stats of Apocalypse Character
	public int getHp();
	public void setHp(int hp);
	public int getShield();
	public void setShield(int shield);
	public int getMp();
	public void setMp(int mp);
	public int getMaxHp();
	public int getMaxMp();
	public void setMaxHp(int max);
	public void setMaxMp(int max);
	public int getAtk();
	public void setAtk(int atk);
	public int getMatk();
	public void setMatk(int matk);
	public int getDef();
	public void setDef(int def);
	public int getMdef();
	public void setMdef(int mdef);
	public int getSpd();
	public void setSpd(int spd);
	public double getpPen();
	public void setpPen(double pPen);
	public double getmPen();
	public void setMpen(double mPen);
	public int getEva();
	public void setEva(int eva);
	public int getAccu();
	public void setAccu(int accu);
	public double getHpReg();
	public void setHpReg(double hpReg);
	public double getMpReg();
	public void setMpReg(double mpReg);
	
	/**
	 * Get how many skills the Apocalypse character can store
	 * @return num of skills possible
	 */
	public int getMaxSkillSize();
	
	/**
	 * Get how many kinds of debuff the Apocalypse character can store
	 * @return num of skills possible
	 */
	public int getDebuffSize();
	
	/**
	 * Get how many kinds of DoT the Apocalypse character can store
	 * @return num of skills possible
	 */
	public int getDotSize();
	
	/**
	 * Check if the Apocalypse Character should skip a turn
	 * @return the stunFlag status
	 */
	public boolean getStunFlag();
	
	/**
	 * Set the stunFlag status
	 * @param bool the stunFlag status
	 */
	public void setStunFlag(boolean bool);
	
	/**
	 * Get the weapon attack equiped by Apocalypse Character
	 * @return the weaponAttack
	 */
	public WeaponAttack getWeaponAttack();

	/**
	 * Get the number of skills the character has
	 * @return the number of skills
	 */
	public int getSkillSize();
	
}
