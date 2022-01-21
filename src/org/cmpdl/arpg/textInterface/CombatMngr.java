package org.cmpdl.arpg.textInterface;

import java.util.Scanner;

import org.cmpdl.arpg.characters.ApocalypseCharacter;
import org.cmpdl.arpg.characters.Player;
import org.cmpdl.arpg.core.CoolVisitor;
import org.cmpdl.arpg.core.CoolVisitorImpl;
import org.cmpdl.arpg.core.DebuffVisitor;
import org.cmpdl.arpg.core.DebuffVisitorImpl;
import org.cmpdl.arpg.core.SkillVisitor;
import org.cmpdl.arpg.core.SkillVisitorImpl;
import org.cmpdl.arpg.core.SovereignFactory;
import org.cmpdl.arpg.skill.Skill;

/**
 * Facilitates combat.
 * @author cmpdl
 *
 */
public class CombatMngr{
	
	/**
	 * Main combat manager
	 * @param player Player character
	 * @param sovereign enemy character
	 * @throws InterruptedException 
	 */
	public static void fight(Player player, String sovereign) throws InterruptedException {
		System.out.println("---------------------------------------------------------------------------");
		ApocalypseCharacter enemy = SovereignFactory.generateSovereign(sovereign); //Generate enemy
		setSourceTarget(player, enemy);
		int round = 1;
		
		DisplayMngr.display(player, enemy);
		System.out.printf("Enemy ");
		DisplayMngr.displaySkills(enemy);
		Thread.sleep(2200);
		while(true) {
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Round " + round);
			System.out.println("---------------------------------------------------------------------------");
			
			//Pre-round applications
			applyRegen(player, enemy);
			reduceDebuffStacks(player);
			reduceDebuffStacks(enemy);


			
			//Check the speed to determine who moves first
			if(player.getSpd() >= enemy.getSpd()) {
				applyDotDmg(enemy);
				applyDotDmg(player);
				DisplayMngr.display(player, enemy);
				if (continueFlag(player, enemy) == false) break;
				
				reduceCool(player);
				playerTakeAction(player); //Player moves first
				DisplayMngr.display(player, enemy);
				if (continueFlag(player, enemy) == false) break;
				player.setStunFlag(false); //Reset stunFlag at end of turn
				Thread.sleep(1600);
				
				reduceCool(enemy);
				enemyTakeAction(enemy);
				DisplayMngr.display(player, enemy);
				if (continueFlag(player, enemy) == false) break;
				enemy.setStunFlag(false);
				Thread.sleep(1600);
			}
			else {
				applyDotDmg(player);
				applyDotDmg(enemy);
				DisplayMngr.display(player, enemy);
				if (continueFlag(player, enemy) == false) break;
				
				reduceCool(enemy);
				enemyTakeAction(enemy); //Enemy moves first
				DisplayMngr.display(player, enemy);
				if (continueFlag(player, enemy) == false) break;
				enemy.setStunFlag(false);
				Thread.sleep(1600);

				reduceCool(player);
				playerTakeAction(player);
				DisplayMngr.display(player, enemy);
				if (continueFlag(player, enemy) == false) break;
				player.setStunFlag(false);
				Thread.sleep(1600);
			}
			round ++;	
		}
	}

	/**
	 * Checks if the combat should contiue.
	 * Exit the game depending on the result
	 * @param player Player character
	 * @param enemy enemy character
	 * @return
	 */
	private static boolean continueFlag(Player player, ApocalypseCharacter enemy) {
		if(player.isDead() == true) {
			System.out.println("You have died... X_X");
			GameState.gameExit(1);
		}
		
		if(enemy.isDead() == true) {
			System.out.println("Congratulations!! You won the battle.");
			return false;
		}
		return true;
		
	}

	/**
	 * Set the source and target of skills, weapon attacks, debuffs, and DoTs
	 * @param player Player character
	 * @param enemy enemy character
	 */
	private static void setSourceTarget(Player player, ApocalypseCharacter enemy) { //Set the sources of skills, attacks, debuffs, etc.
																					//Required for using their effects
		
		//Target of characters' DoT and Debuffs are themselves, and sources are their enemies
		for (int i = 0; i < player.getDotSize(); i++) {	//Set player DoT source and target										
			player.getDot(i).setSource(enemy);
			player.getDot(i).setTarget(player);
		}
		
		for (int i = 0; i < enemy.getDotSize(); i++) {	//Set enemy DoT source and target
			enemy.getDot(i).setSource(player);
			enemy.getDot(i).setTarget(enemy);
		}
	
		for (int i = 0; i < player.getDebuffSize(); i++) { 	//Set player debuff source and target	
			player.getDebuff(i).setSource(enemy);
			player.getDebuff(i).setTarget(player);
		}
		
		for (int i = 0; i < enemy.getDebuffSize(); i++) { 	//Set enemy DoT source and target	
			enemy.getDebuff(i).setSource(player);
			enemy.getDebuff(i).setTarget(enemy);
		}
		
		//Target of characters' skills and attacks are their enemy, and sources are themselves
		for (int i = 0; i < player.getSkillSize(); i++) { //Set player skills source and target
			player.getSkill(i).setTarget(enemy);
			player.getSkill(i).setSource(player);
		}
		
		for (int i = 0; i < enemy.getSkillSize(); i++) { //Set player skills source and target
			enemy.getSkill(i).setTarget(enemy);
			enemy.getSkill(i).setSource(player);
		}
		
		player.getWeaponAttack().setTarget(enemy); //Set player weapon attack source and target
		player.getWeaponAttack().setSource(player);
		
		enemy.getWeaponAttack().setTarget(player); //Set enemy skills source and target
		enemy.getWeaponAttack().setSource(enemy);
	}


	
	/**
	 * Reduce debuff stacks of Apocalypse Characters
	 * @param apocalypseCharacter apocalypse character
	 */
	public static void reduceDebuffStacks(ApocalypseCharacter apocalypseCharacter) {
		System.out.println("Reducing debuff stacks...");
		DebuffVisitor visitor = new DebuffVisitorImpl();
		
		for(int i = 0; i < apocalypseCharacter.getDebuffSize(); i++) {
			apocalypseCharacter.getDebuff(i).accept(visitor);
		}
	}
	
	/**
	 * Uses CoolVisitor to reduce cooldown of available skills
	 * @param player Player character
	 * @param enemy enemy character
	 */
	private static void reduceCool(ApocalypseCharacter apocalypseCharacter) {
		CoolVisitor visitor = new CoolVisitorImpl();
		int skillSize = apocalypseCharacter.getSkillSize();
		
		for(int i = 0; i < skillSize; i++) {
			apocalypseCharacter.getSkill(i).accept(visitor);
		}
	}

	/**
	 * DoT damage application. Uses DebuffVisitor to activate effect
	 * @param target target character
	 * @param player Player character
	 * @param enemy enemy character
	 */
	private static void applyDotDmg(ApocalypseCharacter target) {
		boolean applyDmg = false;
		for(int i = 0; i < 3; i++) {
			if(target.getDot(i).getStacks() > 0) applyDmg = true;
		}
		
		if(applyDmg == true) {
			System.out.print("Applying DoT damge to " + target.getName());
			System.out.print("");
			DebuffVisitor visitor = new DebuffVisitorImpl();
			
			for(int i = 0; i < target.getDotSize(); i++) {
				target.getDot(i).accept(visitor);
			}
		}
	}

	/**
	 * Asks the user's move in their turn.
	 * @param player Player character
	 */
	private static void playerTakeAction(Player player) {
		System.out.println("-----------");
		System.out.println("Your turn.");
		System.out.println("-----------");
		SkillVisitor visitor = new SkillVisitorImpl();
		
		if(player.getStunFlag() == true) { //Skip a turn if stunned
			System.out.println("You are stunned. \n");
		}
		else {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int choice;
			int choice2;
			
			while(true) {
				System.out.println("Choose an action: ");
				System.out.println("[1. Weapon Attack     2. Use a Skill     3. Give up.]");
				choice = scan.nextInt();
				
				switch(choice) {
					case(1):
						System.out.printf("You used %s.\n", player.getWeapon());
						player.getWeaponAttack().accept(visitor);
						break;
					
					case(2):
						int silence = player.getDebuff(2).getStacks();
						if (silence > 0) { //Prompts user if they are silenced
							System.out.println("You are currently silenced. Can't use skills.");
							continue;
						}

						DisplayMngr.displaySkills(player);
						System.out.println("Choose a skill: ");
						choice2 = scan.nextInt();
						int skillIndex = choice2 - 1;
				
						if (choice < 0 || skillIndex >= player.getSkillSize()) { //Index out of bounds handler
							System.out.println("Skill not available.");
							continue;
						}
							
						if(canCastSkill(player, player.getSkill(skillIndex)) == true) {
							System.out.printf("You used %s.\n", player.getSkill(skillIndex).getName());
							player.getSkill(skillIndex).accept(visitor);
							break;
						}
							
						else {
							continue;
						}
						
					case(3):
						GameState.gameExit(2);
					
					default:
						System.out.print("Choose only from the options :)");
						continue;
				}
			break;
			}
		}
	}

	/**
	 * Check if the character can cast the skill
	 * @param playerChar Apocalypse Characters using the skill
	 * @param skill skill to be used
	 * @return status
	 */
	private static boolean canCastSkill(ApocalypseCharacter playerChar, Skill skill) {
		if(playerChar.getMp() < skill.getCost()) {
			System.out.println("Not enough mana to cast " + skill.getName() + ".");
			return false;
		}
		
		if(skill.getCurrCool() > 0) {
			System.out.println(skill.getName() + " is currently on cooldown.");
			return false;
		}
		
		return true;
	}
	
	/**
	 * Applies hp and mp regeneration
	 * @param player Player character
	 * @param enemy enemy character
	 */
	private static void applyRegen(Player player, ApocalypseCharacter enemy) {
		
		//Player and enemy Hp and mp regeneration
		System.out.println("Regenerating Hp and Mp...");
		
		//Get how much they regen
		int playerHpRegen = (int) (player.getMaxHp() * player.getHpReg());
		int playerMpRegen = (int) (player.getMaxMp() * player.getMpReg());
		int enemyHpRegen = (int) (enemy.getMaxHp() * enemy.getHpReg());
		int enemyMpRegen = (int) (enemy.getMaxMp() * enemy.getMpReg());
		
		//Apply regen
		player.setHp(player.getHp() + playerHpRegen);
		player.setMp(player.getMp() + playerMpRegen);
		enemy.setHp(enemy.getHp() + enemyHpRegen);
		enemy.setMp(enemy.getMp() + enemyMpRegen);
		
	}
	
	/**
	 * Facilitates the enemy's turn
	 * @param enemy enemy character
	 */
	private static void enemyTakeAction(ApocalypseCharacter enemy) {
		System.out.println("------------------------");
		System.out.println(enemy.getName() + "'s turn");
		System.out.println("------------------------");
		
		SkillVisitor visitor = new SkillVisitorImpl();
		int silence = enemy.getDebuff(2).getStacks();
		int skillCool = enemy.getSkill(0).getCurrCool();
		boolean canCast = canCastSkill(enemy, enemy.getSkill(0));
		boolean stunned = enemy.getStunFlag();
		
		if (stunned) { // Skip a turn
			System.out.printf("%s is stunned", enemy.getName());
		}
		
		else if (silence <= 0 && skillCool <= 0 && canCast == true) { //Cast skill whenever possible
			System.out.printf("%s casts %s\n", enemy.getName(), enemy.getSkill(0).getName());
			enemy.getSkill(0).accept(visitor);
		}
		
		else {
			enemy.getWeaponAttack().accept(visitor);
		}
	}
	

}
