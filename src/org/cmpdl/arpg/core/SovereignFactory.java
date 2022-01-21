package org.cmpdl.arpg.core;

import org.cmpdl.arpg.characters.Death;
import org.cmpdl.arpg.characters.Famine;
import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.characters.Pestilence;
import org.cmpdl.arpg.characters.War;

/**
 * Generates the enemies in apocalypse rpg called sovereigns
 * @author cmpdl
 *
 */
public class SovereignFactory{
	/**
	 * Sovereigns generation
	 * @param name name of the sovereign
	 * @return the Sovereign object or null
	 */
	public static ApocalypseCharacter generateSovereign(String name) {
		if(name.equals("PESTILENCE")) {
			return new Pestilence();
		}
		if(name.equals("WAR")) {
			return new War();
		}
		if(name.equals("FAMINE")) {
			return new Famine();
		}
		if(name.equals("DEATH")) {
			return new Death();
		}
		return null;
	}
}
