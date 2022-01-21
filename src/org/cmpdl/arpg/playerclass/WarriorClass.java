package org.cmpdl.arpg.playerclass;

import org.cmpdl.arpg.skill.ChainWhip;
import org.cmpdl.arpg.skill.ColdSteel;
import org.cmpdl.arpg.skill.DebilitatingStrike;
import org.cmpdl.arpg.skill.GigaImpact;
import org.cmpdl.arpg.skill.MaxVitalityUlt;
import org.cmpdl.arpg.skill.Rejuvinate;
import org.cmpdl.arpg.skill.ShieldBash;
import org.cmpdl.arpg.skill.Shields;
import org.cmpdl.arpg.skill.Skill;

public class WarriorClass extends PlayerClassBase {
	private static WarriorClass warrior = null;
	private static int MAXHP = 90;
	private static int MAXMP = 60;
	private static int atk = 36;
	private static int matk = 10;
	private static int def = 45;
	private static int mdef = 42;
	private static int spd = 10;
	private static double pPen = 0;
	private static double mPen = 0;
	private static int eva = 0;
	private static int accu = 100;
	private static double hpReg = 0.03;
	private static double mpReg = 0.01;
	private static String name = "Warrior";
	private static Skill ultimate = new MaxVitalityUlt();
	private static Skill[] skillPool = {new ChainWhip(), new ColdSteel(), new DebilitatingStrike(), new GigaImpact(), new Rejuvinate(),
			new ShieldBash(), new Shields()};
	
	public static WarriorClass getInstance() {
		if (warrior == null) {
			warrior = new WarriorClass();
		}
		return warrior;
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
		WarriorClass.skillPool[index] = skill;
	}

	
	@Override
	public Skill getUltimate() {
		return ultimate;
	}
	
	@Override
	public Skill getSkill(int index) {
		return skillPool[index];
	}
	
	@Override
	public int getMaxSkillSize() {
		return skillPool.length;
	}
}
