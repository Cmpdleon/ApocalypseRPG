package org.cmpdl.arpg.playerclass;

import org.cmpdl.arpg.skill.Skill;

/**
 * Abstract class of Apocalypse RPG Classes
 * Classes that extends PlayerClassBase are singleton.
 * @author cmpdl
 *
 */
public abstract class PlayerClassBase {
	//Stats of the class
	private int MAXHP;
	private int MAXMP;
	private int atk;
	private int matk;
	private int def;
	private int mdef;
	private int spd;
	private double pPen;
	private double mPen;
	private int eva;
	private int accu;
	private double hpReg;
	private double mpReg;
	private String name;
	
	//Getters and setters for skillPool and ultimate
	public abstract Skill[] getSkillPool();
	public abstract void setSkill(Skill skill, int index);
	public abstract Skill getUltimate();
	public abstract Skill getSkill(int index);
	
	/**
	 * Get how much skill the Apocalypse character can store
	 * @return num of skills possible
	 */
	public abstract int getMaxSkillSize();
	
	//Getters and setters for stats
	public int getMAXHP() {
		return MAXHP;
	}

	public int getMAXMP() {
		return MAXMP;
	}

	public int getMatk() {
		return matk;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}

	public int getMdef() {
		return mdef;
	}

	public int getSpd() {
		return spd;
	}

	public double getpPen() {
		return pPen;
	}

	public double getmPen() {
		return mPen;
	}

	public int getEva() {
		return eva;
	}

	public int getAccu() {
		return accu;
	}

	public double getHpReg() {
		return hpReg;
	}

	public double getMpReg() {
		return mpReg;
	}

	public String getName() {
		return name;
	}
}
