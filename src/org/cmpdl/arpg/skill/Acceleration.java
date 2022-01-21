package org.cmpdl.arpg.skill;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.SkillMngr;
import org.cmpdl.arpg.core.SkillVisitor;

public class Acceleration implements Skill{
	
	private final String name = "Acceleration";
	private final String desc = "Deal 120% Speed then deal 30% Atk. Speed + 10. Physical";
	private final int TYPE = 1;
	private final double RATIO = 1.20;
	private final double RATIO2 = 0.30;
	private final int SCALING = 4;
	private final int SCALING2 = 1;
	private final int COOL = 3;
	private int currCool = 0;
	private int cost = 15;
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
	public void useEffect() {
		SkillMngr.DamageCalcalculation(source, target, RATIO, SCALING, TYPE);
		SkillMngr.DamageCalcalculation(source, target, RATIO2, SCALING2, TYPE);
		source.setSpd(source.getSpd() + 10);
		source.setMp(source.getMp() - cost);
		this.setCurrCool(this.getMaxCool());
	}
	
	@Override
	public int getType() {
		return TYPE;
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
