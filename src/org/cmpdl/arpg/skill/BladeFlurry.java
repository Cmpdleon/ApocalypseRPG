package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;
import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.SkillMngr;
import java.util.Random;

public class BladeFlurry implements Skill{
	
	private final String name = "Blade Flurry";
	private final String desc = "Deal damage equal to 20% Atk 3 times. 50% chance to crit each strike. Physical.";
	private final int TYPE = 1;
	private final int COOL = 4;
	private final double RATIO = 0.20;
	private final int SCALING = 1;
	private int currCool = 0;
	private int cost = 16;
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
		
		for (int i = 0; i < 3; i ++) {
			int chance = rand.nextInt(2);
			if(chance == 0) SkillMngr.DamageCalcalculation(source, target, RATIO*2, SCALING, TYPE);
			else SkillMngr.DamageCalcalculation(source, target, RATIO, SCALING, TYPE);
			
		}
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