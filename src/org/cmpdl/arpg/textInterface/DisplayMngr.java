package org.cmpdl.arpg.textInterface;

import java.util.Scanner;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.characters.Player;
import org.cmpdl.arpg.debuff.Debuff;
import org.cmpdl.arpg.equips.Armor;
import org.cmpdl.arpg.equips.FootWear;
import org.cmpdl.arpg.equips.Gloves;
import org.cmpdl.arpg.equips.HeadGear;
import org.cmpdl.arpg.equips.Weapon;
import org.cmpdl.arpg.playerclass.PlayerClassBase;
import org.cmpdl.arpg.skill.Skill;

/**
 * Displays useful information to the user.
 * @author cmpdl
 *
 */
public class DisplayMngr {
	private DisplayMngr() {}
	
	/**
	 * Display the introduction
	 */
	public static void displayIntro(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("");
		System.out.println("You are the last person to defend what is left of humanity from the invasion of the four");
		System.out.println("sovereigns of apocalypse. You have nowhere to run, you only have two choices...");
		System.out.println("1. Fight	2. Watch");
		System.out.println("");
		choice = scan.nextInt();
		
		switch(choice) {
			case(1):
				System.out.println("You choose to fight. You prepare for your possibly final battle...");
				break;
			case(2):
				GameState.gameExit(3);
				break;
			default:
				System.out.println("Choosing nothing is the same as watching.");
				GameState.gameExit(3);
		}
		
	}
	
	public static void previewClass(PlayerClassBase playClass) {
		System.out.println("");
		System.out.printf("Class: %s\n", playClass.getName());
		System.out.printf("Hp: %d\n", playClass.getMAXHP());
		System.out.printf("Mp: %d\n", playClass.getMAXMP());
		System.out.printf("Atk: %d\n", playClass.getAtk());
		System.out.printf("Matk: %d\n", playClass.getMatk());
		System.out.printf("Def: %d\n", playClass.getDef());
		System.out.printf("Mdef:%d \n", playClass.getMdef());
		System.out.printf("Speed: %d\n", playClass.getSpd());
		System.out.printf("Phys Pen: %.2f\n", playClass.getpPen());
		System.out.printf("Magic Pen: %.2f\n", playClass.getmPen());
		System.out.printf("Eva: %d\n", playClass.getEva());
		System.out.printf("Accu: %d\n", playClass.getAccu());
		System.out.printf("Hp Reg: %.2f\n", playClass.getHpReg());
		System.out.printf("Mp Reg: %.2f\n", playClass.getMpReg());
		System.out.println("Additional Skill: ");
		System.out.printf("%s: %s Cost: %d Cooldown: %d\n", playClass.getUltimate().getName(), playClass.getUltimate().getDesc(), 
				playClass.getUltimate().getCost(), playClass.getUltimate().getMaxCool());
	}

	public static void PreviewEquips(Player player) {
		System.out.println("");
		System.out.println("Current Equipment: ");
		System.out.printf("Weapon: %s\t", player.getWeapon());
		System.out.printf("Armor: %s\t",player.getArmor());
		System.out.printf("Headgear: %s\t",player.getHeadGear());
		System.out.printf("Gloves: %s\t", player.getGloves());
		System.out.printf("Footwear: %s\t", player.getFootWear());
		System.out.println("");
	}
	
	public static void PreviewPlayer(Player player) {
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Current Stats:");
		System.out.printf("Class: %s\n", player.getPlayerClass().getName());
		System.out.printf("Hp: %d\n", player.getMaxHp());
		System.out.printf("Mp: %d\n", player.getMaxMp());
		System.out.printf("Atk: %d\n", player.getAtk());
		System.out.printf("Matk: %d\n", player.getMatk());
		System.out.printf("Def: %d\n", player.getDef());
		System.out.printf("Mdef:%d \n", player.getMdef());
		System.out.printf("Speed: %d\n", player.getSpd());
		System.out.printf("Phys Pen: %.2f\n", player.getpPen());
		System.out.printf("Magic Pen: %.2f\n", player.getmPen());
		System.out.printf("Eva: %d\n", player.getEva());
		System.out.printf("Accu: %d\n", player.getAccu());
		System.out.printf("Hp Reg: %.2f\n", player.getHpReg());
		System.out.printf("Mp Reg: %.2f\n", player.getMpReg());
		System.out.println("---------------------------------------------------------------------------");
		
	}

	public static void previewArmor(Armor armor) {
		System.out.println("");
		System.out.println("Additional Stats:");
		System.out.printf("Armor: %s\n", armor.getName());
		System.out.printf("Hp: %d\n", armor.getHp());
		System.out.printf("Mp: %d\n", armor.getMp());
		System.out.printf("Def: %d\n", armor.getDef());
		System.out.printf("Mdef:%d \n", armor.getMdef());
		System.out.printf("Hp Reg: %.2f\n", armor.getHpReg());
		System.out.printf("Mp Reg: %.2f\n", armor.getMpReg());
		System.out.println("Additional Skill:");
		System.out.printf("%s: %s\n", armor.getSkill().getName(),armor.getSkill().getDesc());
		System.out.println("");
		
	}

	public static void previewWeapon(Weapon weapon) {
		System.out.println("");
		System.out.println("Additional Stats:");
		System.out.printf("Weapon: %s\n", weapon.getName());
		System.out.printf("Hp: %d\n", weapon.getHp());
		System.out.printf("Mp: %d\n", weapon.getMp());
		System.out.printf("Atk: %d\n", weapon.getAtk());
		System.out.printf("Matk: %d\n", weapon.getMatk());
		System.out.printf("Def: %d\n", weapon.getDef());
		System.out.printf("Mdef:%d \n", weapon.getMdef());
		System.out.printf("Speed: %d\n", weapon.getSpd());
		System.out.printf("Phys Pen: %.2f\n", weapon.getpPen());
		System.out.printf("Magic Pen: %.2f\n", weapon.getmPen());
		System.out.printf("Eva: %d\n", weapon.getEva());
		System.out.printf("Accu: %d\n", weapon.getAccu());
		System.out.printf("Hp Reg: %.2f\n", weapon.getHpReg());
		System.out.printf("Mp Reg: %.2f\n", weapon.getMpReg());
		System.out.println("Weapon Attak:");
		System.out.printf("%s: %s\n", weapon.getWeaponAttack().getName(), weapon.getWeaponAttack().getDesc());
		System.out.println("");	
	}

	public static void previewHead(HeadGear head) {
		System.out.println("");
		System.out.println("Additional Stats:");
		System.out.printf("Head Gear: %s\n", head.getName());
		System.out.printf("Hp: %d\n", head.getHp());
		System.out.printf("Mp: %d\n", head.getMp());
		System.out.printf("Def: %d\n", head.getDef());
		System.out.printf("Mdef:%d \n", head.getMdef());
		System.out.println("");
	}

	public static void previewGlove(Gloves gloves) {
		System.out.println("");
		System.out.println("Additional Stats:");
		System.out.printf("Weapon: %s\n", gloves.getName());
		System.out.printf("Hp: %d\n", gloves.getHp());
		System.out.printf("Mp: %d\n", gloves.getMp());
		System.out.printf("Atk: %d\n", gloves.getAtk());
		System.out.printf("Matk: %d\n", gloves.getMatk());
		System.out.printf("Def: %d\n", gloves.getDef());
		System.out.printf("Mdef:%d \n", gloves.getMdef());
		System.out.println("");
	}

	public static void previewFootwear(FootWear boots) {
		System.out.println("");
		System.out.println("Additional Stats:");
		System.out.printf("Weapon: %s\n", boots.getName());
		System.out.printf("Hp: %d\n", boots.getHp());
		System.out.printf("Mp: %d\n", boots.getMp());
		System.out.printf("Def: %d\n", boots.getDef());
		System.out.printf("Mdef:%d \n", boots.getMdef());
		System.out.printf("Speed: %d\n", boots.getSpd());
		System.out.println("");
	}


	public static void previewSkillPool(PlayerClassBase playerClass) {
		Skill[] skillPool = playerClass.getSkillPool();
		for(int i = 0; i < 7; i++) {
			if(skillPool[i] != null) {
				System.out.printf("%d. %s: %s\n\tCost: %d. Cooldown: %d\n", i+1, skillPool[i].getName(), skillPool[i].getDesc(),
						skillPool[i].getCost(), skillPool[i].getMaxCool());
			}
		}
		System.out.println("");
		
	}
	
	/**
	 * Displays available skills to the user
	 * @param apocalypseCharacter apocalypse character
	 */
	public static void displaySkills(ApocalypseCharacter apocalypseCharacter) {
		int size = apocalypseCharacter.getSkillSize();
		System.out.printf("Skills:\n");
		
		for (int i = 0; i < size; i++) {
			System.out.printf("%d. %-25sCost: %s. Cooldown: %d.\n",i+1,apocalypseCharacter.getSkill(i).getName(),
					apocalypseCharacter.getSkill(i).getCost(), apocalypseCharacter.getSkill(i).getCurrCool());
		}
	}
	
	/**
	 * Displays useful information for the user
	 * @param player Player character
	 * @param enemy enemy character
	 */
	public static void display(Player player, ApocalypseCharacter enemy) {
		System.out.println("");
		String template = "%s: %-17d%24s: %d\n";
		System.out.printf("%-20s%25s\n",player.getName(), enemy.getName());
		System.out.printf(template, "Hp", player.getHp() ,"Hp",enemy.getHp());
		System.out.printf(template, "Mp", player.getMp(), "Mp", enemy.getMp());
		System.out.printf(template, "Shields" , player.getShield(), "Shields" ,enemy.getShield() );
		System.out.println("");
		System.out.printf("Debuffs: \n");
		
		Debuff [] playerDebuff = player.getAllDebuff();
		Debuff [] enemyDebuff = enemy.getAllDebuff();
		Debuff [] playerDot = player.getAllDoT();
		Debuff [] enemyDot = enemy.getAllDoT();
		
		
		for(int i = 0; i < 5; i++) {
			if(playerDebuff[i].getStacks() > 0) {
				System.out.printf("\n\t%s: %-45d", playerDebuff[i].getName(), playerDebuff[i].getStacks());
			}
			if(enemyDebuff[i].getStacks() > 0) {
				System.out.printf("\t%45s: %d\n", enemyDebuff[i].getName(), enemyDebuff[i].getStacks());
			}
		}
		System.out.println("");
		System.out.printf("DoTs: \n");
		for(int i = 0; i < 3; i++) {
			if(playerDot[i].getStacks() > 0) {
				System.out.printf("\n\t%s: %-45d", playerDot[i].getName(), playerDot[i].getStacks());
			}
			if(enemyDot[i].getStacks() > 0) {
				System.out.printf("\t%45s: %d\n", enemyDot[i].getName(), enemyDot[i].getStacks());
			}
		}
		System.out.println("");
		
	}

}
