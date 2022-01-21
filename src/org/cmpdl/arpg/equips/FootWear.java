package org.cmpdl.arpg.equips;

/**
 * Extends equips.
 * Lesser additional stats.
 * @author cmpdl
 *
 */
public interface FootWear extends Equips{	
	//Stats and Name gatters
	public String getName();
	public int getHp();
	public int getMp();
	public int getMdef();
	public int getDef();
	public int getSpd();
}
