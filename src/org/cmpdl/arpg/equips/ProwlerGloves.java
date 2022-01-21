package org.cmpdl.arpg.equips;

public class ProwlerGloves implements Gloves{
	private static int hp = 7;
	private static int mp = 12;
	private static int atk = 20;
	private static int matk = 11;
	private static int def = 6;
	private static int mdef = 9;
	private static String name = "Prowler Gloves";
	
	private static ProwlerGloves prowlerGlove = null;
	public static ProwlerGloves getInstance() {
		if (prowlerGlove == null) {
			prowlerGlove = new ProwlerGloves();
		}
		return prowlerGlove;
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
