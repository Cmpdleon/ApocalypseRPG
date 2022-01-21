package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;

public class Elusive implements Skill{
	
	private final String name = "Elusive";
	private final String desc = "Evasion + 20, Speed + 20, and Atk increased by 30% for 2 turns.";
	private final int TYPE = 0;
	private final int COOL = 5;
	private int currCool = 0;
	private int cost = 20;
	private ApocalypseCharacter source;
	private ApocalypseCharacter target;
	int increase = 0;

	
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
		
		if(cool == 3) {
			source.setEva(source.getEva() - 20);
			source.setSpd(source.getSpd() - 65);
			source.setAtk(source.getAtk() - increase);
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
		increase = (int) (source.getAtk() * 0.30);
		source.setEva(source.getEva() + 20);
		source.setSpd(source.getSpd() + 20);
		source.setAtk(source.getAtk() + increase);
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
