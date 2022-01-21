package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;

public class ArmorAlchemy implements Skill{
	
	private final String name = "Concoction";
	private final String desc = "Double the enemy's DOTs (burn, poison, deadly poison).";
	private final int TYPE = 0;
	private final int COOL = 12;
	private int currCool = 0;
	private int cost = 0;
	private ApocalypseCharacter source;
	private ApocalypseCharacter target;
	public final boolean armorSkill = true;

	public void setSource(ApocalypseCharacter source) {
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
		
		if(cool == 6) {
			source.setMdef(source.getMdef() - 200);
		}
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
		int burnStacks = target.getDot(0).getStacks();
		int poisonStacks = target.getDot(2).getStacks();
		int dpoisonStacks = target.getDot(1).getStacks();
		
		target.addDot(0, burnStacks);
		target.addDot(2, poisonStacks);
		target.addDot(1, dpoisonStacks);
		
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