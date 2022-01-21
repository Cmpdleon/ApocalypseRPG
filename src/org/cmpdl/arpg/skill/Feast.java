package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillMngr;
import org.cmpdl.arpg.core.SkillVisitor;

public class Feast implements Skill{
	private final String name = "Feast";
	private final String desc = "Deal 80% M atk. Heal 100% of the Damage. Apply Vulnerable to the enemy (2x). Magic.";
	private final int TYPE = 2;
	private final int COOL = 3;
	private final double RATIO = 0.80;
	private final int SCALING = 2;
	private int currCool = 2;
	private int cost = 25;
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
		int heal = SkillMngr.DamageCalcalculation(source, target, RATIO, SCALING, TYPE);
		source.setHp(source.getHp() + heal);
		displayHeal(heal);
		target.setDebuff(3, 2);
		this.setCurrCool(this.getMaxCool());
		source.setMp(source.getMp() - cost);
	}

	private void displayHeal(int heal) {
		System.out.printf("%s steals %d Hp from %s\n.", source.getName(), heal, target.getName());
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
