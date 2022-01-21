package org.cmpdl.arpg.textInterface;

import java.util.Scanner;

import org.cmpdl.arpg.characters.Player;
import org.cmpdl.arpg.playerclass.MageClass;
import org.cmpdl.arpg.playerclass.RogueClass;
import org.cmpdl.arpg.playerclass.WarriorClass;

/**
 * Facilitates the reward system every after winning the fight
 * @author cmpdl
 *
 */
public class Reward {
	/**
	 * Get reward depending on the stage
	 * @param player Player character
	 * @param stage stage number
	 */
	public static void getReward(Player player, int stage) {
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("As a reward your Hp and Mp will be healed by 70% of your Max Hp and Mp. And DoTs are cleared.");
		System.out.println("You will also be rewarded with a skill.");
		
		healPlayer(player);
		if(stage == 3) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int choice;
			System.out.println("");
			System.out.println("Choose a class to get 1 skill from its skillpool (can be the same with current class): ");
			
			while(true) {
				System.out.println("1. Warrior\n2. Mage\n3. Rogue\n");
				choice = scan.nextInt();
				switch(choice) {
					case(1):
							WarriorClass warrior = WarriorClass.getInstance();
							BuildCharacter.chooseClassSkill(player, warrior);
							break;
						
					case(2):
							MageClass mage = MageClass.getInstance();
							BuildCharacter.chooseClassSkill(player, mage);
							break;
						
					case(3):
							RogueClass rogue = RogueClass.getInstance();
							BuildCharacter.chooseClassSkill(player, rogue);
							break;
							
					default:
						System.out.println("Choose only 1-3. :)");
						continue;	
				}
			break;
			}
		}
		
		else {
			BuildCharacter.chooseClassSkill(player, player.getPlayerClass());
		}
	}

	/**
	 * Facilitates healing and restoring DoTs to 0
	 * @param player Player Character
	 */
	public static void healPlayer(Player player) {
		int healHp = (int) (player.getMaxHp() * 0.70);
		int healMp = (int) (player.getMaxMp() * 0.70);
		player.setHp(player.getHp() + healHp);
		player.setMp(player.getMp() + healMp);
		
		for(int i = 0; i < 3; i ++) {
			player.getDot(i).setStacks(0);
		}
		
	}
}
