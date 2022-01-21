package org.cmpdl.arpg.core;

import org.cmpdl.arpg.characters.Player;
import org.cmpdl.arpg.equips.Armor;
import org.cmpdl.arpg.equips.FootWear;
import org.cmpdl.arpg.equips.Gloves;
import org.cmpdl.arpg.equips.HeadGear;
import org.cmpdl.arpg.equips.Weapon;
import org.cmpdl.arpg.playerclass.PlayerClassBase;
import org.cmpdl.arpg.skill.Skill;

/**
 * Sets and adds player stats, skills, weapon attack, etc.
 * @author cmpdl
 */

public class CharacterMngr {
	public static void addClass(Player player, PlayerClassBase playerClass) {
		player.setMaxHp(playerClass.getMAXHP());
		player.setMaxMp(playerClass.getMAXMP());
		player.setAtk(playerClass.getAtk());
		player.setMatk(playerClass.getMatk());
		player.setDef(playerClass.getDef());
		player.setMdef(playerClass.getMdef());
		player.setSpd(playerClass.getSpd());
		player.setpPen(playerClass.getpPen());
		player.setMpen(playerClass.getmPen());
		player.setEva(playerClass.getEva());
		player.setAccu(playerClass.getAccu());
		player.setHpReg(playerClass.getHpReg());
		player.setMpReg(playerClass.getMpReg());
		player.setPlayerClass(playerClass);
		player.setSkill(player.getPlayerClass().getUltimate());
	}

	public static void equipArmor(Player player, Armor armor) {
		player.setMaxHp(player.getMaxHp() + armor.getHp());
		player.setMaxMp(player.getMaxMp() + armor.getMp());
		player.setAtk(player.getAtk() + armor.getAtk());
		player.setMatk(player.getMatk() + armor.getMatk());
		player.setDef(player.getDef() + armor.getDef());
		player.setMdef(player.getMdef() + armor.getMdef());
		player.setSpd(player.getSpd() + armor.getSpd());
		player.setpPen(player.getpPen() + armor.getpPen());
		player.setMpen(player.getmPen() + armor.getmPen());
		player.setEva(player.getEva() + armor.getEva());
		player.setAccu(player.getAccu() + armor.getAccu());
		player.setHpReg(player.getHpReg() + armor.getHpReg());
		player.setMpReg(player.getMpReg() + armor.getMpReg());
		player.setSkill(armor.getSkill());
		player.setArmor(armor.getName());
	}

	public static void equipWeapon(Player player, Weapon weapon) {
		player.setMaxHp(player.getMaxHp() + weapon.getHp());
		player.setMaxMp(player.getMaxMp() + weapon.getMp());
		player.setAtk(player.getAtk() + weapon.getAtk());
		player.setMatk(player.getMatk() + weapon.getMatk());
		player.setDef(player.getDef() + weapon.getDef());
		player.setMdef(player.getMdef() + weapon.getMdef());
		player.setSpd(player.getSpd() + weapon.getSpd());
		player.setpPen(player.getpPen() + weapon.getpPen());
		player.setMpen(player.getmPen() + weapon.getmPen());
		player.setEva(player.getEva() + weapon.getEva());
		player.setAccu(player.getAccu() + weapon.getAccu());
		player.setHpReg(player.getHpReg() + weapon.getHpReg());
		player.setMpReg(player.getMpReg() + weapon.getMpReg());
		player.setWeaponAttack(weapon.getWeaponAttack());
		player.setWeapon(weapon.getName());
	}

	public static void equipHeadGear(Player player, HeadGear head){
		player.setMaxHp(player.getMaxHp() + head.getHp());
		player.setMaxMp(player.getMaxMp() + head.getMp());
		player.setAtk(player.getAtk() + head.getAtk());
		player.setMatk(player.getMatk() + head.getMatk());
		player.setDef(player.getDef() + head.getDef());
		player.setMdef(player.getMdef() + head.getMdef());
		player.setSpd(player.getSpd() + head.getSpd());
		player.setpPen(player.getpPen() + head.getpPen());
		player.setMpen(player.getmPen() + head.getmPen());
		player.setEva(player.getEva() + head.getEva());
		player.setAccu(player.getAccu() + head.getAccu());
		player.setHpReg(player.getHpReg() + head.getAccu());
		player.setMpReg(player.getMpReg() + head.getMpReg());
		player.setHeadGear(head.getName());
	}
		
	public static void equipFootWear(Player player, FootWear foot) {
		player.setMaxHp(player.getMaxHp() + foot.getHp());
		player.setMaxMp(player.getMaxMp() + foot.getMp());
		player.setAtk(player.getAtk() + foot.getAtk());
		player.setMatk(player.getMatk() + foot.getMatk());
		player.setDef(player.getDef() + foot.getDef());
		player.setMdef(player.getMdef() + foot.getMdef());
		player.setSpd(player.getSpd() + foot.getSpd());
		player.setpPen(player.getpPen() + foot.getpPen());
		player.setMpen(player.getmPen() + foot.getmPen());
		player.setEva(player.getEva() + foot.getEva());
		player.setAccu(player.getAccu() + foot.getAccu());
		player.setHpReg(player.getHpReg() + foot.getAccu());
		player.setMpReg(player.getMpReg() + foot.getMpReg());
		player.setFootWear(foot.getName());
	}
	
	public static void equipGloves(Player player, Gloves glove) {
		player.setMaxHp(player.getMaxHp() + glove.getHp());
		player.setMaxMp(player.getMaxMp() + glove.getMp());
		player.setAtk(player.getAtk() + glove.getAtk());
		player.setMatk(player.getMatk() + glove.getMatk());
		player.setDef(player.getDef() + glove.getDef());
		player.setMdef(player.getMdef() + glove.getMdef());
		player.setSpd(player.getSpd() + glove.getSpd());
		player.setpPen(player.getpPen() + glove.getpPen());
		player.setMpen(player.getmPen() + glove.getmPen());
		player.setEva(player.getEva() + glove.getEva());
		player.setAccu(player.getAccu() + glove.getAccu());
		player.setHpReg(player.getHpReg() + glove.getAccu());
		player.setMpReg(player.getMpReg() + glove.getMpReg());
		player.setGloves(glove.getName());
	}

	
	public static void equipClassSkill(Player player, PlayerClassBase playerClass, int skillIndex) {
		Skill skill = playerClass.getSkill(skillIndex);
		
		playerClass.setSkill(null, skillIndex); //Set to null to avoid duplicate skills for player.
		player.setSkill(skill);		
	}

}
