package org.cmpdl.arpg.equips;

import org.cmpdl.arpg.skill.Skill;

/**
 * Extends the equips interface.
 * Has an additional skill
 * @author cmpdl
 *
 */
public interface Armor extends Equips {
	//Stats, Name, and Skill getters
	public int getHp();
	public int getMp();
	public int getAtk();
	public int getMatk();
	public int getDef();
	public int getMdef();
	public int getSpd();
	public double getpPen();
	public double getmPen();
	public int getEva();
	public int getAccu();
	public double getMpReg();
	public double getHpReg();
	public String getName();
	public Skill getSkill();
}
