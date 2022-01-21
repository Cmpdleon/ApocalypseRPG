package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillMngr;
import org.cmpdl.arpg.core.SkillVisitor;

public class WeakSpot implements Skill{
	
	private final String name = "Weak Spot";
	private final String desc = "Deal 70% of Atk. Ignores 35% Armor. Applies weakness and vulnerable(2x). Physical.";
	private final int TYPE = 1;
	private final int COOL = 4;
	private final double RATIO = 0.70;
	private final int SCALING = 1;
	private int currCool = 0;
	private int cost = 30;
	private ApocalypseCharacter source;
	private ApocalypseCharacter target;

	
	@Override
	public void setSource(ApocalypseCharacter source){
		this.source = source;
	}
	
	@Override
	public void setTarget(ApocalypseCharacter target) {
		this.target = target;
	}
	
	@Override
	public String getDesc() {
		return this.desc;
	}

	@Override
	public String getName() {
		return this.name;
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
	public int getCurrCool() {
		return currCool;
	}

	@Override
	public int getMaxCool() {
		return COOL;
	}

	@Override
	public void setCurrCool(int cool) {
		this.currCool = cool;
		if(currCool < 0) {
			this.currCool = 0;
		}
	}

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public int getType() {
		return TYPE;
	}

	@Override
	public void useEffect() {
		int reduce = (int) (target.getDef() * 0.35);
		target.setDef(target.getDef() - reduce);
		SkillMngr.DamageCalcalculation(source, target, RATIO, SCALING, TYPE);
		target.setDef(target.getDef() + reduce);
		
		target.addDebuff(3, 2);
		target.addDebuff(4, 2);
		
		source.setMp(source.getMp() - cost);
		this.setCurrCool(this.getMaxCool());
	}

	@Override
	public void accept(SkillVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void accept(CoolVisitor visitor) {
		visitor.visit(this);
	}

}
