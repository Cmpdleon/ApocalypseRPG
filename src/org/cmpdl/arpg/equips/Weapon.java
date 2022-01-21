package org.cmpdl.arpg.equips;

import org.cmpdl.arpg.attack.WeaponAttack;

/**
 * Extends equips.
 * Has an additional weapon attack
 * @author cmpdl
 *
 */
public interface Weapon extends Equips{
	//Stats, Name, and weapon attack getters
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
	public WeaponAttack getWeaponAttack();
}
