package org.cmpdl.arpg.core;

import org.cmpdl.arpg.debuff.Burn;
import org.cmpdl.arpg.debuff.Curse;
import org.cmpdl.arpg.debuff.DPoison;
import org.cmpdl.arpg.debuff.Frostbite;
import org.cmpdl.arpg.debuff.Poison;
import org.cmpdl.arpg.debuff.Silence;
import org.cmpdl.arpg.debuff.Vulnerable;
import org.cmpdl.arpg.debuff.Weakness;

/**
 * Visits the Debuffs to use their effects.
 * @author cmpdl
 *
 */
public interface DebuffVisitor {
	void visit(Burn burn);
	void visit(Poison poison);
	void visit(DPoison dpoison);
	void visit(Frostbite frostbite);
	void visit(Curse curse);
	void visit(Silence silence);
	void visit(Vulnerable vulnerable);
	void visit(Weakness weakness);
}
