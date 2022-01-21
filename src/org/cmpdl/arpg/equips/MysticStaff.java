package org.cmpdl.arpg.equips;

import org.cmpdl.arpg.attack.MysticStaffAtk;
import org.cmpdl.arpg.attack.WeaponAttack;

public class MysticStaff implements Weapon{
	private static int hp = 12;
	private static int mp = 33;
	private static int atk = 13;
	private static int matk = 38;
	private static int def = 0;
	private static int mdef = 0;
	private static int spd = 0;
	private static double pPen = 0;
	private static double mPen = 0.01;
	private static int eva = 0;
	private static int accu = 0;
	private static double hpReg = 0.00;
	private static double mpReg = 0.0;
	private static String name = "Mystic Staff";
	private static WeaponAttack weaponAttack = new MysticStaffAtk();
	
	private static MysticStaff staff = null;
	public static MysticStaff getInstance() {
		if (staff == null) {
			staff = new MysticStaff();
		}
		return staff;
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
