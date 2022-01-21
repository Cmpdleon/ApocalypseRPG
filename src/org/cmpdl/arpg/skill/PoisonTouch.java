package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;
import java.util.Random;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.SkillMngr;

public class PoisonTouch implements Skill{
	
	private final String name = "Poison Touch";
	private final String desc = "Deal 60% damage. Applies poison (5x). 50% Chance to Apply poison (8x) instead. Physical.";
	private final int TYPE = 1;
	private final int COOL = 2;
	private final double RATIO = 0.60;
	private final int SCALING = 1;
	private int currCool = 0;
	private int cost = 19;
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
		Random rand = new Random();
		int chance = rand.nextInt(2);
		
		SkillMngr.DamageCalcalculation(source, target, RATIO, SCALING, TYPE);
		
		if(chance == 0) {
			target.addDot(2, 8);
		}
		else {

			target.addDot(2, 5);
		}
		
		this.setCurrCool(this.getMaxCool());
		source.setMp(source.getMp() - cost);
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
