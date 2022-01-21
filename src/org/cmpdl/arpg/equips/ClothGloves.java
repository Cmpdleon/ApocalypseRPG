package org.cmpdl.arpg.equips;

public class ClothGloves implements Gloves{
	private static int hp = 8;
	private static int mp = 13;
	private static int atk = 6;
	private static int matk = 18;
	private static int def = 8;
	private static int mdef = 8;
	private static String name = "Cloth Gloves";
	
	private static ClothGloves clothGloves = null;
	public static ClothGloves getInstance() {
		if (clothGloves == null) {
			clothGloves = new ClothGloves();
		}
		return clothGloves;
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
