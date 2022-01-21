package org.cmpdl.arpg.equips;

import org.cmpdl.arpg.skill.ArmorReflect;
import org.cmpdl.arpg.skill.Skill;

public class ThornVest implements Armor{
	private static int hp = 25;
	private static int mp = 10;
	private static int atk = 0;
	private static int matk = 0;
	private static int def = 32;
	private static int mdef = 28;
	private static int spd = 0;
	private static double pPen = 0;
	private static double mPen = 0;
	private static int eva = 0;
	private static int accu = 0;
	private static double hpReg = 0.01;
	private static double mpReg = 0.00;
	private static String name = "Thorn Vest";
	private static Skill skill = new ArmorReflect();
	
	private static ThornVest thorn = null;
	public static ThornVest getInstance() {
		if (thorn == null) {
			thorn = new ThornVest();
		}
		return thorn;
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
