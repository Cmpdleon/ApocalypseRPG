package org.cmpdl.arpg.equips;

public class ProwlerBoots implements FootWear{
	private static int hp = 5;
	private static int mp = 0;
	private static int def = 5;
	private static int mdef = 7;
	private static int spd = 12;
	private static String name = "Prowler Boots";
	
	public String getName() {
		return name;
	}
	
	private static ProwlerBoots prowlerBoots = null;
	public static ProwlerBoots getInstance() {
		if (prowlerBoots == null) {
			prowlerBoots = new ProwlerBoots();
		}
		return prowlerBoots;
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
