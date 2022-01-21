package org.cmpdl.arpg.core;

import org.cmpdl.arpg.debuff.Burn;
import org.cmpdl.arpg.debuff.Curse;
import org.cmpdl.arpg.debuff.DPoison;
import org.cmpdl.arpg.debuff.Frostbite;
import org.cmpdl.arpg.debuff.Poison;
import org.cmpdl.arpg.debuff.Silence;
import org.cmpdl.arpg.debuff.Vulnerable;
import org.cmpdl.arpg.debuff.Weakness;

public class DebuffVisitorImpl implements DebuffVisitor {

	@Override
	public void visit(Burn burn) {
		if(burn.getStacks() > 0) {
			burn.useEffect();
		}
	}
	
	@Override
	public void visit(Poison poison) {
		if(poison.getStacks() > 0) {
			poison.useEffect();
		}
	}
	
	@Override
	public void visit(DPoison dpoison) {
		if(dpoison.getStacks() > 0) {
			dpoison.useEffect();
		}
	}

	@Override
	public void visit(Frostbite frostbite) {
		frostbite.reduceStack();
	}

	@Override
	public void visit(Curse curse) {
		curse.reduceStack();
	}

	@Override
	public void visit(Silence silence) {
		silence.reduceStack();	
	}

	@Override
	public void visit(Vulnerable vulnerable) {
		vulnerable.reduceStack();
	}

	@Override
	public void visit(Weakness weakness) {
		weakness.reduceStack();	
	}

}
