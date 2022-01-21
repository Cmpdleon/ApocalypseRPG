package org.cmpdl.arpg.debuff;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.DebuffVisitor;

public class Frostbite implements Debuff{
	
	private final String name = "Frostbite";
	private int stacks = 0;
	private int prevStacks = 0;
	private final String desc = "Def -15, M def -15, Speed -10";
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
		return desc;
	}
	@Override
	public String getName() {
		return name;
		
	}
	@Override
	public int getStacks() {
		return stacks;
		
	}
	@Override
	public void setStacks(int stack) {
		this.prevStacks = this.stacks;
		this.stacks = stack;
		
		if (this.prevStacks == 0 && this.stacks > 0) {
			this.useEffect();
		}
		
		if(stack == 0 && prevStacks > 0)  {
			target.setDef(target.getDef() + 15);
			target.setMdef(target.getMdef() + 15);
			target.setSpd(target.getSpd() +10);
		}
		
		else if(stack < 0) {
			this.stacks = 0;
		}
		
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
	public void useEffect() {
		target.setDef(target.getDef() - 15);
		target.setMdef(target.getMdef() - 15);
		target.setSpd(target.getSpd() - 10);
	}
	
	@Override
	public void accept(DebuffVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void reduceStack() {
		this.setStacks(this.getStacks() - 1);
	}
	
	
}
