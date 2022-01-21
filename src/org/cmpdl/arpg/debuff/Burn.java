package org.cmpdl.arpg.debuff;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.DebuffVisitor;
import org.cmpdl.arpg.core.DoTManager;

public class Burn implements Debuff{
	
	
	private final String name = "Burn";
	private int stacks = 0;
	private final String desc = "Deal 10% M atk per turn (Stacks). Magic.";
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
	public void useEffect() {
		int dmg = DoTManager.DamageCalcalculation(source,target, 0.10, stacks, 2);
		System.out.println("Burn dealt " + dmg);
		this.reduceStack();
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
