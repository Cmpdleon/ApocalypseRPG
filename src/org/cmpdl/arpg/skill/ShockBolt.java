package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;
import java.util.Random;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.SkillMngr;

public class ShockBolt implements Skill{
	
	private final String name = "Shock Bolt";
	private final String desc = "Deals 70% of M Atk. 60% chance to apply stun. 100% if enemy has frostbite. Magic.";
	private final int TYPE = 1;
	private final int COOL = 4;
	private final double RATIO = 0.7;
	private final int SCALING = 2;
	private int currCool = 0;
	private int cost = 26;
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
		SkillMngr.DamageCalcalculation(source, target, RATIO, SCALING, TYPE);
		
		Random rand = new Random();
		int chance = rand.nextInt(5);
		int flag = target.getDebuff(1).getStacks();
		
		if (flag > 0) {
			target.setStunFlag(true);
			System.out.println("Shockbolt stuns.");
		}
		
		else if(chance >= 0 && chance < 3) {
			System.out.println("Shockbolt stuns.");
			target.setStunFlag(true);
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
