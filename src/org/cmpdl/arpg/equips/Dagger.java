package org.cmpdl.arpg.equips;

import org.cmpdl.arpg.attack.DaggerAtk;
import org.cmpdl.arpg.attack.WeaponAttack;

public class Dagger implements Weapon{
	private static int hp = 9;
	private static int mp = 26;
	private static int atk = 40;
	private static int matk = 18;
	private static int def = 0;
	private static int mdef = 0;
	private static int spd = 0;
	private static double pPen = 0.03;
	private static double mPen = 0;
	private static int eva = 0;
	private static int accu = 0;
	private static double hpReg = 0.00;
	private static double mpReg = 0.01;
	private static String name = "Daggers";
	private static WeaponAttack weaponAttack = new DaggerAtk();
	
	private static Dagger dagger = null;
	public static Dagger getInstance() {
		if (dagger == null) {
			dagger = new Dagger();
		}
		return dagger;
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
	public WeaponAttack getWeaponAttack() {
		return weaponAttack;
	}
}
