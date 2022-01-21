package org.cmpdl.arpg.playerclass;

import org.cmpdl.arpg.skill.Acceleration;
import org.cmpdl.arpg.skill.BladeFlurry;
import org.cmpdl.arpg.skill.Elusive;
import org.cmpdl.arpg.skill.ExecutionUlt;
import org.cmpdl.arpg.skill.PoisonTouch;
import org.cmpdl.arpg.skill.Skill;
import org.cmpdl.arpg.skill.VampiricStrike;
import org.cmpdl.arpg.skill.ViperBite;
import org.cmpdl.arpg.skill.WeakSpot;

public class RogueClass extends PlayerClassBase {
	private static RogueClass rogue = null;
	private static int MAXHP = 65;
	private static int MAXMP = 78;
	private static int atk = 48;
	private static int matk = 20;
	private static int def = 30;
	private static int mdef = 34;
	private static int spd = 18;
	private static double pPen = 0.05;
	private static double mPen = 0;
	private static int eva = 10;
	private static int accu = 110;
	private static double hpReg = 0.01;
	private static double mpReg = 0.02;
	private static String name = "Rogue";
	private static Skill ultimate = new ExecutionUlt();
	private static Skill[] skillPool = {new Acceleration(), new BladeFlurry(), new Elusive(), new PoisonTouch(), new VampiricStrike()
			, new ViperBite(), new WeakSpot()};
	
	public static RogueClass getInstance() {
		if (rogue == null) {
			rogue = new RogueClass();
		}
		return rogue;
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
		RogueClass.skillPool[index] = skill;
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
