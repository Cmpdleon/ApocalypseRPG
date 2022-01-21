package org.cmpdl.arpg.attack;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.SkillMngr;
import org.cmpdl.arpg.core.SkillVisitor;

public class DeathAtk implements WeaponAttack{
	private final String name = "Enemy Attack.";
	private final String desc = "Deal 50% Atk then 50% Matk. Apply Weakness 2x. Physical then Magic.";
	private final int TYPE = 1;
	private final int SCALING = 1;
	private final double RATIO = 0.50;
	private final int TYPE2 = 2;
	private final int SCALING2 = 2;
	private final double RATIO2 = 0.50;
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
		SkillMngr.DamageCalcalculation(source, target, RATIO2, SCALING2, TYPE2);
		target.setDebuff(4, 2);
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
