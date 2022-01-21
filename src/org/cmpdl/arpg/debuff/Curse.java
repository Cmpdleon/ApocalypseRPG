package org.cmpdl.arpg.debuff;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.DebuffVisitor;

public class Curse implements Debuff{
	
	
	private final String name = "Curse";
	private int stacks = 0;
	private final String desc = "Reduce Def and M Def by 30%";
	private ApocalypseCharacter source;
	private ApocalypseCharacter target;
	private int prevStacks = 0;
	int reduceDef = 0;
	int reduceMdef = 0;
	
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
				
		if(stack == 0 && prevStacks > 0) {
			target.setDef(target.getDef() + reduceDef);
			target.setMdef(target.getMdef() + reduceMdef);
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
		reduceDef = (int) (target.getDef() * 0.30);
		reduceMdef = (int) (target.getMdef() * 0.30);
		target.setDef(target.getDef() - reduceDef);
		target.setMdef(target.getMdef() - reduceMdef);
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
