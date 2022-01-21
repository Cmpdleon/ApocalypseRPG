package org.cmpdl.arpg.core;

import org.cmpdl.arpg.attack.BattleAxeAtk;
import org.cmpdl.arpg.attack.DaggerAtk;
import org.cmpdl.arpg.attack.DeathAtk;
import org.cmpdl.arpg.attack.EnemyMgcAtk;
import org.cmpdl.arpg.attack.EnemyPhysAtk;
import org.cmpdl.arpg.attack.MysticStaffAtk;
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

public class SkillVisitorImpl implements SkillVisitor {

	@Override
	public void visit(Acceleration acceleration) {
		acceleration.useEffect();
	}

	@Override
	public void visit(ArcaneShift arcaneShift) {
		arcaneShift.useEffect();
	}

	@Override
	public void visit(BladeFlurry bladeFlurry) {
		bladeFlurry.useEffect();
	}

	@Override
	public void visit(ArmorAlchemy armorAlchecmy) {
		armorAlchecmy.useEffect();
	}

	@Override
	public void visit(ArmorCurse armorCurse) {
		armorCurse.useEffect();
	}

	@Override
	public void visit(ArmorMana armorMana) {
		armorMana.useEffect();
		
	}

	@Override
	public void visit(ArmorNull armorNull) {
		armorNull.useEffect();
		
	}

	@Override
	public void visit(ArmorReflect armorReflect) {
		armorReflect.useEffect();
		
	}

	@Override
	public void visit(ChainWhip chainWhip) {
		chainWhip.useEffect();
		
	}

	@Override
	public void visit(ColdSteel coldSteel) {
		coldSteel.useEffect();
		
	}

	@Override
	public void visit(DebilitatingStrike dStrike) {
		dStrike.useEffect();
		
	}

	@Override
	public void visit(Elusive elusive) {
		elusive.useEffect();
		
	}

	@Override
	public void visit(Enflame enflame) {
		enflame.useEffect();
		
	}

	@Override
	public void visit(ExecutionUlt execute) {
		execute.useEffect();
	}

	@Override
	public void visit(Fireball fireBall) {
		fireBall.useEffect();
		
	}

	@Override
	public void visit(GigaImpact gigaImpact) {
		gigaImpact.useEffect();
		
	}

	@Override
	public void visit(IceShard iceShard) {
		iceShard.useEffect();
		
	}

	@Override
	public void visit(ManaDrain manaDrain) {
		manaDrain.useEffect();
	}

	@Override
	public void visit(MaxVitalityUlt maxVitality) {
		maxVitality.useEffect();
		
	}

	@Override
	public void visit(MindBreakUlt mindBreak) {
		mindBreak.useEffect();
		
	}

	@Override
	public void visit(PoisonTouch poisonTouch) {
		poisonTouch.useEffect();
		
	}

	@Override
	public void visit(Rejuvinate rejuvinate) {
		rejuvinate.useEffect();
		
	}

	@Override
	public void visit(ShieldBash shieldBash) {
		shieldBash.useEffect();
		
	}

	@Override
	public void visit(Shields shields) {
		shields.useEffect();
		
	}

	@Override
	public void visit(ShockBolt shockBolt) {
		shockBolt.useEffect();
		
	}

	@Override
	public void visit(SnowFall snowFall) {
		snowFall.useEffect();
		
	}

	@Override
	public void visit(VampiricStrike vampiricStrike) {
		vampiricStrike.useEffect();
		
	}
	
	@Override
	public void visit(ViperBite viperBite) {
		viperBite.useEffect();
	}

	@Override
	public void visit(WeakSpot weakSpot) {
		weakSpot.useEffect();
	}

	@Override
	public void visit(BattleAxeAtk battleAxeAtk) {
		battleAxeAtk.useEffect();
	}

	@Override
	public void visit(MysticStaffAtk mysticStaffAtk) {
		mysticStaffAtk.useEffect();
	}

	@Override
	public void visit(DaggerAtk daggerAtk) {
		daggerAtk.useEffect();
		
	}

	@Override
	public void visit(Feast feast) {
		feast.useEffect();
	}

	@Override
	public void visit(BattleCry battleCry) {
		battleCry.useEffect();
	}

	@Override
	public void visit(Immunity immune) {
		immune.useEffect();
	}

	@Override
	public void visit(DeathStrike deathStrike) {
		deathStrike.useEffect();
	}

	@Override
	public void visit(EnemyPhysAtk enemyPhysAtk) {
		enemyPhysAtk.useEffect();
		
	}

	@Override
	public void visit(EnemyMgcAtk enemyMgcAtk) {
		enemyMgcAtk.useEffect();
		
	}

	@Override
	public void visit(DeathAtk deathAtk) {
		deathAtk.useEffect();
	}

}
