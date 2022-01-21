package org.cmpdl.arpg.debuff;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.DebuffVisitor;

public class Weakness implements Debuff{
	
	private final String name = "Weakness";
	private int stacks = 0;
	private int prevStacks = 0;
	private final String desc = "Deal 25% less damage";
	private ApocalypseCharacter source;
	private ApocalypseCharacter target;
	int reduceAtk = 0;
	int reduceMatk = 0;
	
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
			target.setAtk(target.getAtk() + reduceAtk);
			target.setMatk(target.getMatk() + reduceMatk);
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
		reduceAtk = (int) (target.getAtk() * 0.25);
		reduceMatk = (int) (target.getMatk() * 0.25);
		target.setAtk(target.getAtk() - reduceAtk);
		target.setMatk(target.getMatk() - reduceMatk);
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
