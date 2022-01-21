package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;
import org.cmpdl.arpg.characters.ApocalypseCharacter;

public class Rejuvinate implements Skill{
	
	private final String name = "Rejuvinate";
	private final String desc = "Heal 20% Hp. Dispell DOTs.";
	private final int TYPE = 0;
	private final int COOL = 7;
	private int currCool = 0;
	private int cost = 29;
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
		int heal = (int) (source.getHp() * 0.2);
		source.setHp(source.getHp() + heal);
		
		for (int i = 0; i < 3; i++) {
			source.setDot(i, 0);
		}
		
		this.setCurrCool(this.getMaxCool());
		displayHeal(heal);
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
