package org.cmpdl.arpg.equips;

/**
 * Extends equips.
 * Lesser additional stats.
 * @author cmpdl
 *
 */
public interface Gloves extends Equips{
	//Stats and Name getters
	public int getHp();
	public int getMp();
	public int getAtk();
	public int getMatk();
	public int getDef();
	public int getMdef();
	public String getName();
}
