package org.cmpdl.arpg.equips;

public class MagicalBoots implements FootWear{
	private static int hp = 6;
	private static int mp = 0;
	private static int def = 6;
	private static int mdef = 7;
	private static int spd = 10;
	private String name ="Magical Boots";
	
	public String getName() {
		return name;
	}
	
	private static MagicalBoots mageBoots = null;
	public static MagicalBoots getInstance() {
		if (mageBoots == null) {
			mageBoots = new MagicalBoots();
		}
		return mageBoots;
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
