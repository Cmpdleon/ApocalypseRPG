package org.cmpdl.arpg.equips;

public class TragedyMask implements HeadGear{
	private static int hp = 12;
	private static int mp = 12;
	private static int def = 9;
	private static int mdef = 11;
	private static String name = "Tragedy Mask";
	
	private static TragedyMask mask = null;
	public static TragedyMask getInstance() {
		if (mask == null) {
			mask = new TragedyMask();
		}
		return mask;
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
