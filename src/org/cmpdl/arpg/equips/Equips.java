package org.cmpdl.arpg.equips;

/**
 * Equipments in the game that increases Apocalypse Characters' stats.
 * Equipments implementations uses the singleton pattern.
 * Interface used for polymorphism
 * 
 * @author cmpdl
 *
 */
public interface Equips {
	
	//Stats and name getters
	public int getHp();
	public int getMp();
	public int getAtk();
	public int getMatk();
	public int getDef();
	public int getMdef();
	public int getSpd();
	public double getpPen();
	public double getmPen();
	public int getEva();
	public int getAccu();
	public double getMpReg();
	public double getHpReg();
	public String getName();
}
