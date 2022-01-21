package org.cmpdl.arpg.debuff;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.DebuffVisitor;

public class Silence implements Debuff{
	private final String name = "Silence";
	private int stacks = 0;
	private final String desc = "Can't use skills";
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
		this.stacks = stack;
		if(stacks < 0) {
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
	public void useEffect() {}
	
	@Override
	public void reduceStack() {
		this.setStacks(this.getStacks() - 1);
	}
	
	@Override
	public void accept(DebuffVisitor visitor) {
		visitor.visit(this);
	}
	
	
}
