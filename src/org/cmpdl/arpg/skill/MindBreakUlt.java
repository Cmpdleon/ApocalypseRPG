package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;
import org.cmpdl.arpg.characters.ApocalypseCharacter;

public class MindBreakUlt implements Skill{
	
	private final String name = "Mind Break (Ult)";
	private final String desc = "Deal 180% of your Mp minus the enemy's. True.";
	private final int TYPE = 3;
	private final int COOL = 10;
	private int currCool = 6;
	private int cost = 0;
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
		double dmg = (source.getMp() - target.getMp()) * 1.8;
		int apply = (int) dmg;
		if(apply < 0) apply = 0;
		target.setHp(target.getHp() - apply);
		source.setMp(source.getMp() - cost);
		System.out.printf("%s dealt %d to %s\n", source.getName(), apply, target.getName());
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
