package org.cmpdl.arpg.playerclass;

import org.cmpdl.arpg.skill.*;
import org.cmpdl.arpg.skill.Skill;

public class MageClass extends PlayerClassBase {
	private static MageClass mage = null;
	private static int MAXHP = 78;
	private static int MAXMP = 95;
	private static int atk = 16;
	private static int matk = 50;
	private static int def = 32;
	private static int mdef = 36;
	private static int spd = 12;
	private static double pPen = 0.00;
	private static double mPen = 0.03;
	private static int eva = 0;
	private static int accu = 100;
	private static double hpReg = 0.00;
	private static double mpReg = 0.04;
	private static String name = "Mage";
	private static Skill ultimate = new MindBreakUlt();
	private static Skill[] skillPool = {new ArcaneShift(), new Enflame(), new Fireball(), new IceShard(), new ManaDrain()
			, new ShockBolt(), new SnowFall()};
	
	
	
	public static MageClass getInstance() {
		if (mage == null) {
			mage = new MageClass();
		}
		return mage;
	}
	
	@Override
	public int getMaxSkillSize() {
		return skillPool.length;
	}
	
	@Override
	public int getMAXHP() {
		return MAXHP;
	}
	@Override
	public int getMAXMP() {
		return MAXMP;
	}
	@Override
	public int getMatk() {
		return matk;
	}
	@Override
	public int getAtk() {
		return atk;
	}
	@Override
	public int getDef() {
		return def;
	}
	@Override
	public int getMdef() {
		return mdef;
	}
	@Override
	public int getSpd() {
		return spd;
	}
	@Override
	public double getpPen() {
		return pPen;
	}
	@Override
	public double getmPen() {
		return mPen;
	}
	@Override
	public int getEva() {
		return eva;
	}
	@Override
	public int getAccu() {
		return accu;
	}
	@Override
	public double getHpReg() {
		return hpReg;
	}
	@Override
	public double getMpReg() {
		return mpReg;
	}
	@Override
	public String getName() {
		return name;
	}


	@Override
	public Skill[] getSkillPool() {
		return skillPool;
	}

	
	@Override
	public void setSkill(Skill skill, int index) {
		MageClass.skillPool[index] = skill;
	}

	@Override
	public Skill getUltimate() {
		return ultimate;
	}


	@Override
	public Skill getSkill(int index) {
		return skillPool[index];
	}
}
