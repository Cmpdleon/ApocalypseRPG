package org.cmpdl.arpg.equips;

public class IronBoots implements FootWear{
	private static int hp = 8;
	private static int mp = 0;
	private static int def = 8;
	private static int mdef = 6;
	private static int spd = 5;
	private static String name = "Iron Boots.";
	
	public String getName() {
		return name;
	}
	
	private static IronBoots ironBoots = null;
	public static IronBoots getInstance() {
		if (ironBoots == null) {
			ironBoots = new IronBoots();
		}
		return ironBoots;
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
	public int getMdef() {
		return mdef;
	}
	@Override
	public int getDef() {
		return def;
	}
	@Override
	public int getSpd() {
		return spd;
	}

	@Override
	public int getAtk() {
		return 0;
	}

	@Override
	public int getMatk() {
		return 0;
	}

	@Override
	public double getpPen() {
		return 0;
	}

	@Override
	public double getmPen() {
		return 0;
	}

	@Override
	public int getEva() {
		return 0;
	}

	@Override
	public int getAccu() {
		return 0;
	}

	@Override
	public double getMpReg() {
		return 0;
	}

	@Override
	public double getHpReg() {
		return 0;
	}
}
