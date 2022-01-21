package org.cmpdl.arpg.attack;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.SkillMngr;
import org.cmpdl.arpg.core.SkillVisitor;

public class BattleAxeAtk implements WeaponAttack{
	private final String name = "Hack";
	private final String desc = "Deal 50% Atk. Physical.";
	private final int TYPE = 1;
	private final int SCALING = 1;
	private final double RATIO = 0.50;
	private ApocalypseCharacter source;
	private ApocalypseCharacter target;
	
	@Override
	public String getDesc() {
		return desc;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public ApocalypseCharacter getSource() {
		return source;
	}
	@Override
	public ApocalypseCharacter getTarget() {
		return target;
	}
	@Override
	public void setTarget(ApocalypseCharacter target) {
		this.target = target;
	}

	@Override
	public void useEffect() {
		SkillMngr.DamageCalcalculation(source, target, RATIO, SCALING, TYPE);
	}
	@Override
	public void accept(SkillVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void setSource(ApocalypseCharacter source) {
		this.source = source;	
	}
}
