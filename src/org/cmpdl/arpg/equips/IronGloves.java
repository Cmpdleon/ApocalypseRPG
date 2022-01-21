package org.cmpdl.arpg.equips;

public class IronGloves implements Gloves{
	private static int hp = 10;
	private static int mp = 10;
	private static int atk = 15;
	private static int matk = 4;
	private static int def = 10;
	private static int mdef = 9;
	private static String name = "Iron Gloves";
	
	private static IronGloves ironGloves = null;
	public static IronGloves getInstance() {
		if (ironGloves == null) {
			ironGloves = new IronGloves();
		}
		return ironGloves;
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
		return atk;
	}
	@Override
	public int getMatk() {
		return matk;
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
