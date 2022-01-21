package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillVisitor;
import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.SkillMngr;

public class VampiricStrike implements Skill{
	
	private final String name = "Vampiric Strike";
	private final String desc = "Deal damage equal to 78% Atk. Heal 80% of the damage. Magic.";
	private final int TYPE = 2;
	private final int COOL = 5;
	private final double RATIO = 0.78;
	private final int SCALING = 1;
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
		int heal = (int) (SkillMngr.DamageCalcalculation(source, target, RATIO, SCALING, TYPE) * 0.8);
		source.setHp(source.getHp() + heal);
		displayHeal(heal);
		source.setMp(source.getMp() - cost);
		this.setCurrCool(this.getMaxCool());
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