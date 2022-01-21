package org.cmpdl.arpg.debuff;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.DebuffVisitor;

public class Vulnerable implements Debuff{
	
	private final String name = "Vulnerable";
	private int stacks = 0;
	private int prevStacks = 0;
	private final String desc = "Def and Mdef reduced by 42.";
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
			target.setDef(target.getDef() + 42);
			target.setMdef(target.getMdef() + 42);
			this.stacks = 0;
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
		target.setDef(target.getDef() - 42);
		target.setMdef(target.getMdef() - 42);
	}
	
	@Override
	public void reduceStack() {
		this.setStacks(this.getStacks() - 1);
	}
	
	@Override
	public void accept(DebuffVisitor visitor) {
		visitor.visit(this);
	}

}
