package org.cmpdl.arpg.equips;

public class ClothHead implements HeadGear{
	private static int hp = 14;
	private static int mp = 15;
	private static int def = 8;
	private static int mdef = 12;
	private static String name = "Cloth Headgear";
	
	private static ClothHead clothHead = null;
	public static ClothHead getInstance() {
		if (clothHead == null) {
			clothHead = new ClothHead();
		}
		return clothHead;
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
