package org.cmpdl.arpg.equips;

/**
 * Extends equips.
 * Lesser additional stats.
 * @author cmpdl
 *
 */
public interface HeadGear extends Equips{
	//Stats and Name getters
	public int getHp();
	public int getMp();
	public int getDef();
	public int getMdef();
	public String getName();
}
