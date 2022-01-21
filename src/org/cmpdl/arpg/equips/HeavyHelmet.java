package org.cmpdl.arpg.equips;


public class HeavyHelmet implements HeadGear{
	private static int hp = 18;
	private static int mp = 10;
	private static int def = 13;
	private static int mdef = 11;
	private static String name = "Heavy Helmet";
	
	private static HeavyHelmet heavyHelm = null;
	public static HeavyHelmet getInstance() {
		if (heavyHelm == null) {
			heavyHelm = new HeavyHelmet();
		}
		return heavyHelm;
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
	public int getDef() {
		return def;
	}
	@Override
	public int getMdef() {
		return mdef;
	}

	@Override
	public String getName() {
		return name;
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
	public int getSpd() {
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