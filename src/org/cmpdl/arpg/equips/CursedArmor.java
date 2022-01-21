package org.cmpdl.arpg.equips;

import org.cmpdl.arpg.skill.ArmorCurse;
import org.cmpdl.arpg.skill.Skill;

public class CursedArmor implements Armor{
	private static int hp = 20;
	private static int mp = 14;
	private static int atk = 0;
	private static int matk = 0;
	private static int def = 26;
	private static int mdef = 24;
	private static int spd = 0;
	private static double pPen = 0.02;
	private static double mPen = 0.02;
	private static int eva = 0;
	private static int accu = 0;
	private static double hpReg = 0.01;
	private static double mpReg = 0.01;
	private static String name = "Cursed Armor";
	private static Skill skill = new ArmorCurse();
	
	private static CursedArmor cursedArmor = null;
	public static CursedArmor getInstance() {
		if (cursedArmor == null) {
			cursedArmor = new CursedArmor();
		}
		return cursedArmor;
	}
	
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public int getMp() {
		return mp;
	}
	@Override
	public int getAtk() {
		return atk;
	}
	@Override
	public int getMatk() {
		return matk;
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
	public double getMpReg() {
		return mpReg;
	}
	@Override
	public double getHpReg() {
		return hpReg;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public Skill getSkill() {
		return skill;
	}
}
