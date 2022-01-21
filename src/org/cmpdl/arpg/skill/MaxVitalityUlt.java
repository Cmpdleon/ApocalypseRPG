package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;
import org.cmpdl.arpg.characters.ApocalypseCharacter;

public class MaxVitalityUlt implements Skill{
	
	private final String name = "Max Vitality (Ult)";
	private final String desc = "Heal 60% of Max Hp over 3 turns. Dispells debuffs and Dots.";
	private final int TYPE = 0;
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
		
		int regen = (int) (source.getMaxHp() * 0.2);
		if (cool == 9) {
			source.setHp(source.getHp() + regen);
			displayHeal(regen);
		}
		if (cool == 8) {
			source.setHp(source.getHp() + regen);
			displayHeal(regen);
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
		for (int i = 0; i < 5; i++) {
			source.setDebuff(i, 0);
		}
		for (int i = 0; i < 3; i++) {
			source.setDot(i, 0);
		}
		int regen = (int) (source.getMaxHp() * 0.2);
		source.setHp(source.getHp() + regen);
		displayHeal(regen);
		source.setMp(source.getMp() - cost);
		this.setCurrCool(this.getMaxCool());
	}

	private void displayHeal(int heal) {
		System.out.printf("%s Regenerates %d Hp %s\n.", source.getName(), heal);
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