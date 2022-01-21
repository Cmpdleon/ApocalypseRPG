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

/**
 * Visits the skills to reduce their cooldown
 * @author cmpdl
 */
public interface CoolVisitor {
	void visit(Acceleration acceleration);
	void visit(ArcaneShift arcaneShift);
	void visit(ArmorAlchemy armorAlchecmy);
	void visit(ArmorCurse armorCurse);
	void visit(ArmorMana armorMana);
	void visit(ArmorNull armorNull);
	void visit(ArmorReflect armorReflect);
	void visit(BladeFlurry bladeFlurry);
	void visit(ChainWhip chainWhip);
	void visit(ColdSteel coldSteel);
	void visit(DebilitatingStrike dStrike);
	void visit(Elusive elusive);
	void visit(Enflame enflame);
	void visit(ExecutionUlt execute);
	void visit(Fireball fireBall);
	void visit(GigaImpact gigaImpact);
	void visit(IceShard iceShard);
	void visit(ManaDrain manaDrain);
	void visit(MaxVitalityUlt maxVitality);
	void visit(MindBreakUlt mindBreak);
	void visit(PoisonTouch poisonTouch);
	void visit(Rejuvinate rejuvinate);
	void visit(ShieldBash shieldBash);
	void visit(Shields shields);
	void visit(ShockBolt shockBolt);
	void visit(SnowFall snowFall);
	void visit(VampiricStrike vampiricStrike);
	void visit(ViperBite viperBite);
	void visit(WeakSpot weakSpot);
	void visit(Feast feast);
	void visit(BattleCry battleCry);
	void visit(Immunity immune);
	void visit(DeathStrike deathStrike);
}
