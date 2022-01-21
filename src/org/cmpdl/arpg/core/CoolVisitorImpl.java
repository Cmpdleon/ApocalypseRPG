package org.cmpdl.arpg.core;

import org.cmpdl.arpg.skill.Acceleration;
import org.cmpdl.arpg.skill.ArcaneShift;
import org.cmpdl.arpg.skill.ArmorAlchemy;
import org.cmpdl.arpg.skill.ArmorCurse;
import org.cmpdl.arpg.skill.ArmorMana;
import org.cmpdl.arpg.skill.ArmorNull;
import org.cmpdl.arpg.skill.ArmorReflect;
import org.cmpdl.arpg.skill.BattleCry;
import org.cmpdl.arpg.skill.BladeFlurry;
import org.cmpdl.arpg.skill.ChainWhip;
import org.cmpdl.arpg.skill.ColdSteel;
import org.cmpdl.arpg.skill.DeathStrike;
import org.cmpdl.arpg.skill.DebilitatingStrike;
import org.cmpdl.arpg.skill.Elusive;
import org.cmpdl.arpg.skill.Enflame;
import org.cmpdl.arpg.skill.ExecutionUlt;
import org.cmpdl.arpg.skill.Feast;
import org.cmpdl.arpg.skill.Fireball;
import org.cmpdl.arpg.skill.GigaImpact;
import org.cmpdl.arpg.skill.IceShard;
import org.cmpdl.arpg.skill.Immunity;
import org.cmpdl.arpg.skill.ManaDrain;
import org.cmpdl.arpg.skill.MaxVitalityUlt;
import org.cmpdl.arpg.skill.MindBreakUlt;
import org.cmpdl.arpg.skill.PoisonTouch;
import org.cmpdl.arpg.skill.Rejuvinate;
import org.cmpdl.arpg.skill.ShieldBash;
import org.cmpdl.arpg.skill.Shields;
import org.cmpdl.arpg.skill.ShockBolt;
import org.cmpdl.arpg.skill.SnowFall;
import org.cmpdl.arpg.skill.VampiricStrike;
import org.cmpdl.arpg.skill.ViperBite;
import org.cmpdl.arpg.skill.WeakSpot;

public class CoolVisitorImpl implements CoolVisitor{

	@Override
	public void visit(Acceleration acceleration) {
		acceleration.setCurrCool(acceleration.getCurrCool() - 1);
	}

	@Override
	public void visit(ArcaneShift arcaneShift) {
		arcaneShift.setCurrCool(arcaneShift.getCurrCool() - 1);	
	}

	@Override
	public void visit(BladeFlurry bladeFlurry) {
		bladeFlurry.setCurrCool(bladeFlurry.getCurrCool() - 1);	
	}

	@Override
	public void visit(ArmorAlchemy armorAlchecmy) {
		armorAlchecmy.setCurrCool(armorAlchecmy.getCurrCool() - 1);
	}

	@Override
	public void visit(ArmorCurse armorCurse) {
		armorCurse.setCurrCool(armorCurse.getCurrCool() - 1);
	}

	@Override
	public void visit(ArmorMana armorMana) {
		armorMana.setCurrCool(armorMana.getCurrCool() - 1);
		
	}

	@Override
	public void visit(ArmorNull armorNull) {
		armorNull.setCurrCool(armorNull.getCurrCool() - 1);
		
	}

	@Override
	public void visit(ArmorReflect armorReflect) {
		armorReflect.setCurrCool(armorReflect.getCurrCool() - 1);
		
	}

	@Override
	public void visit(ChainWhip chainWhip) {
		chainWhip.setCurrCool(chainWhip.getCurrCool() - 1);
		
	}

	@Override
	public void visit(ColdSteel coldSteel) {
		coldSteel.setCurrCool(coldSteel.getCurrCool() - 1);
		
	}

	@Override
	public void visit(DebilitatingStrike dStrike) {
		dStrike.setCurrCool(dStrike.getCurrCool() - 1);
		
	}

	@Override
	public void visit(Elusive elusive) {
		elusive.setCurrCool(elusive.getCurrCool() - 1);
		
	}

	@Override
	public void visit(Enflame enflame) {
		enflame.setCurrCool(enflame.getCurrCool() - 1);
		
	}

	@Override
	public void visit(ExecutionUlt execute) {
		execute.setCurrCool(execute.getCurrCool() - 1);
	}

	@Override
	public void visit(Fireball fireBall) {
		fireBall.setCurrCool(fireBall.getCurrCool() - 1);
		
	}

	@Override
	public void visit(GigaImpact gigaImpact) {
		gigaImpact.setCurrCool(gigaImpact.getCurrCool() - 1);
		
	}

	@Override
	public void visit(IceShard iceShard) {
		iceShard.setCurrCool(iceShard.getCurrCool() - 1);
		
	}

	@Override
	public void visit(ManaDrain manaDrain) {
		manaDrain.setCurrCool(manaDrain.getCurrCool() - 1);
	}

	@Override
	public void visit(MaxVitalityUlt maxVitality) {
		maxVitality.setCurrCool(maxVitality.getCurrCool() - 1);
		
	}

	@Override
	public void visit(MindBreakUlt mindBreak) {
		mindBreak.setCurrCool(mindBreak.getCurrCool() - 1);
		
	}

	@Override
	public void visit(PoisonTouch poisonTouch) {
		poisonTouch.setCurrCool(poisonTouch.getCurrCool() - 1);
		
	}

	@Override
	public void visit(Rejuvinate rejuvinate) {
		rejuvinate.setCurrCool(rejuvinate.getCurrCool() - 1);
		
	}

	@Override
	public void visit(ShieldBash shieldBash) {
		shieldBash.setCurrCool(shieldBash.getCurrCool() - 1);
		
	}

	@Override
	public void visit(Shields shields) {
		shields.setCurrCool(shields.getCurrCool() - 1);
		
	}

	@Override
	public void visit(ShockBolt shockBolt) {
		shockBolt.setCurrCool(shockBolt.getCurrCool() - 1);
		
	}

	@Override
	public void visit(SnowFall snowFall) {
		snowFall.setCurrCool(snowFall.getCurrCool() - 1);
		
	}

	@Override
	public void visit(VampiricStrike vampiricStrike) {
		vampiricStrike.setCurrCool(vampiricStrike.getCurrCool() - 1);
		
	}
	
	@Override
	public void visit(ViperBite viperBite) {
		viperBite.useEffect();
	}

	@Override
	public void visit(WeakSpot weakSpot) {
		weakSpot.setCurrCool(weakSpot.getCurrCool() - 1);
	}

	@Override
	public void visit(Feast feast) {
		feast.setCurrCool(feast.getCurrCool() - 1);
	}

	@Override
	public void visit(BattleCry battleCry) {
		battleCry.setCurrCool(battleCry.getCurrCool() - 1);
		
	}

	@Override
	public void visit(Immunity immune) {
		immune.setCurrCool(immune.getCurrCool() - 1);
	}

	@Override
	public void visit(DeathStrike deathStrike) {
		deathStrike.setCurrCool(deathStrike.getCurrCool() - 1);
		
	}
	
	

}
