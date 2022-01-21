package org.cmpdl.arpg.attack;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.SkillMngr;
import org.cmpdl.arpg.core.SkillVisitor;

public class EnemyMgcAtk implements WeaponAttack{
	private final String name = "Enemy Magic Attack.";
	private final String desc = "Deal 80% Matk. Magic.";
	private final int TYPE = 2;
	private final int SCALING = 2;
	private final double RATIO = 0.8;
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
