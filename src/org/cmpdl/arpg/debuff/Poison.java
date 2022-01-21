package org.cmpdl.arpg.debuff;
import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.core.DoTManager;
import org.cmpdl.arpg.core.DebuffVisitor;

public class Poison implements Debuff {
	
	
	private final String name = "Poison";
	private int stacks = 0;
	private final String desc = "Deal 7% Atk (Stacks). Physical.";
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
		int dmg = DoTManager.DamageCalcalculation(source, target, 0.07, stacks, 1);
		System.out.println("\nPoison dealt " + dmg);
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
