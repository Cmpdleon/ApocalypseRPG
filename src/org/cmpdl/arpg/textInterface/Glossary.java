package org.cmpdl.arpg.textInterface;

import org.cmpdl.arpg.debuff.Burn;
import org.cmpdl.arpg.debuff.Curse;
import org.cmpdl.arpg.debuff.DPoison;
import org.cmpdl.arpg.debuff.Debuff;
import org.cmpdl.arpg.debuff.Frostbite;
import org.cmpdl.arpg.debuff.Poison;
import org.cmpdl.arpg.debuff.Silence;
import org.cmpdl.arpg.debuff.Vulnerable;
import org.cmpdl.arpg.debuff.Weakness;

/**
 * Displays the deinition of terms used in the game in case the player wants to learn them.
 * @author cmpdl
 *
 */
public class Glossary {
	public static void displayGlossary() {
		Debuff[] debuffs = {new Curse(),new Frostbite(), new Silence(), new Vulnerable(), new Weakness()};
		Debuff[] dots = {new Burn(), new DPoison(), new Poison()};
		String template = "%-25s%25s\n";
		System.out.println("Definition of Terms:");
		System.out.println("");
		System.out.printf(template,"Skill:", "Special move of Apocalypse Characters.");
		System.out.printf(template,"Weapon Attack:","Basic attacks of weapons equiped.");
		System.out.printf(template, "Attacks:","All damaging spells and weapon attacks are collectively called attacks.");
		System.out.printf(template,"Apocalypse Characters:","All characters in the game such as the 'Player' and the four Sovereigns.");
		System.out.printf(template,"Debuffs:","Effects reducing the Apocalypse Character's stats.");
		System.out.printf(template,"DoT:","Damage over time. Type of debuffs that deal damage per turn.");
		System.out.println("");
		System.out.printf(template,"Hp:","Hit Points. Battle ends when either you or the enemy Hp hit zero.");
		System.out.printf(template,"Mp:","Mana Points. Used in casting most skills.");
		System.out.printf(template,"Shields:","Takes hit for Hp from damaging skills. DoTs bypass shields.");
		System.out.printf(template,"Atk:","Attack stat. Affects damage output of atk scaling attacks");
		System.out.printf(template,"Matk:","Magic attack stat. Affects damage output of matk scaling attacks");
		System.out.printf(template,"Def:","Lowers damage taken from physical attacks.");
		System.out.printf(template,"Mdef:","Lowers damage taken from magical attacks.");
		System.out.printf(template,"Spd:","Determines who attack first in a round.");
		System.out.printf(template,"Phys Pen:","Physical Penetration. Reduce the effectivity of def.");
		System.out.printf(template,"Magic Pen:","Magical Penetration. Reduce the effectivity of mdef.");
		System.out.printf(template,"Eva:","Evasion. Lowers the chance of enemy hitting their attacks.");
		System.out.printf(template,"Accu:",	"Accuracy. Determines how likely attacks will hit. Measured against eva.");
		System.out.printf(template,"Hp Reg:","Hit Points Regeneration. Determines how much Hp is regained per round.");
		System.out.printf(template,"Mp Reg.","Mana Points Regeneration. Determines how much Mp is regained per round.");
		System.out.printf(template,"Mp Reg.","Mana Points Regeneration. Determines how much Mp is regained per round.");
		System.out.println("");	
		
		for(Debuff debuff : debuffs) {
			System.out.printf(template, debuff.getName(), debuff.getDesc());	
		}
		
		for(Debuff dot : dots) {
			System.out.printf(template, dot.getName(), dot.getDesc());
		}
	}
}
