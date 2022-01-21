package org.cmpdl.arpg.textInterface;
import java.util.*;

import org.cmpdl.arpg.characters.Player;
import org.cmpdl.arpg.core.CharacterMngr;
import org.cmpdl.arpg.equips.AlchemistCloak;
import org.cmpdl.arpg.equips.ArcaneRobe;
import org.cmpdl.arpg.equips.BattleAxe;
import org.cmpdl.arpg.equips.ClothGloves;
import org.cmpdl.arpg.equips.ClothHead;
import org.cmpdl.arpg.equips.CursedArmor;
import org.cmpdl.arpg.equips.Dagger;
import org.cmpdl.arpg.equips.HeavyHelmet;
import org.cmpdl.arpg.equips.IronBoots;
import org.cmpdl.arpg.equips.IronGloves;
import org.cmpdl.arpg.equips.MagicalBoots;
import org.cmpdl.arpg.equips.MysticStaff;
import org.cmpdl.arpg.equips.NullMagic;
import org.cmpdl.arpg.equips.ProwlerBoots;
import org.cmpdl.arpg.equips.ProwlerGloves;
import org.cmpdl.arpg.equips.ThornVest;
import org.cmpdl.arpg.equips.TragedyMask;
import org.cmpdl.arpg.playerclass.MageClass;
import org.cmpdl.arpg.playerclass.PlayerClassBase;
import org.cmpdl.arpg.playerclass.RogueClass;
import org.cmpdl.arpg.playerclass.WarriorClass;

/**
 * Builds the Player character based on the user's choice
 * Serves as a mediator between display manager, character manager, and user input
 * @author cmpdl
 *
 */
public class BuildCharacter {
	
	/**
	 * Character builder
	 * @param player Player character
	 */
	public static void buildCharacter(Player player) {
		chooseClass(player);
		DisplayMngr.PreviewPlayer(player);
		chooseArmor(player);
		DisplayMngr.PreviewEquips(player);
		DisplayMngr.PreviewPlayer(player);
		chooseWeapon(player);
		DisplayMngr.PreviewEquips(player);
		DisplayMngr.PreviewPlayer(player);
		chooseHeadgear(player);
		DisplayMngr.PreviewEquips(player);
		DisplayMngr.PreviewPlayer(player);
		chooseFootwear(player);
		DisplayMngr.PreviewEquips(player);
		DisplayMngr.PreviewPlayer(player);
		chooseGloves(player);
		DisplayMngr.PreviewEquips(player);
		DisplayMngr.PreviewPlayer(player);
		chooseClassSkill(player, player.getPlayerClass());	
		DisplayMngr.displaySkills(player);
	}
	
	
	/**
	 * Asks the user's for class choice
	 * @param player Player character
	 */
	public static void chooseClass(Player player) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice;
		int choice2;
		
		while(true) {
			System.out.println("Hello " + player.getName() + "! Choose a class. Your Class determines your primary skill choices.");
			System.out.println("1. Warrior");
			System.out.println("2. Mage");
			System.out.println("3. Rogue");
			System.out.println("0. Quit");
		
			choice = scan.nextInt();
			switch (choice) {
				case(1):
					WarriorClass warrior = new WarriorClass();
					DisplayMngr.previewClass(warrior);
					System.out.printf("1. Confirm\n2. Cancel.\n");
					choice2 = scan.nextInt();
					if(choice2 == 1) {
						CharacterMngr.addClass(player, warrior);
						break;
					}
					else continue;
				
				case(2):
					MageClass mage = new MageClass();
					DisplayMngr.previewClass(mage);
					System.out.printf("1. Confirm\n2. Cancel.\n");
					choice2 = scan.nextInt();
					if(choice2 == 1) {
						CharacterMngr.addClass(player, mage);
						break;
					}
					else continue;
					
				case (3):
					RogueClass rogue = new RogueClass();
					DisplayMngr.previewClass(rogue);
					System.out.printf("1. Confirm\n2. Cancel.\n");
					choice2 = scan.nextInt();
					if(choice2 == 1) {
						CharacterMngr.addClass(player, rogue);
						break; 
					}
					else continue;
				
				case(0):
					GameState.gameExit(2);

				default:
					System.out.println("Choose only 0-3 :)");
					continue;
			}
			break;
		}
	}
	
	/**
	 *  Asks the user's for armor choice
	 * @param player Player character
	 */
	public static void chooseArmor(Player player) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice;
		int choice2;
		 
		while(true) {
			System.out.println("");
			System.out.println("Choose your armor:");
			System.out.printf("1. Thorn Vest\n2. Null Magic Armor\n3. Arcane Robe\n4. Cursed Armor\n5. Alchemist Cloak\n 0. Quit\n");
			choice = scan.nextInt();
			 
			switch(choice) {
				case(1):
					ThornVest thornVest = ThornVest.getInstance();
					DisplayMngr.previewArmor(thornVest);
			 		System.out.printf("1. Confirm\n2. Cancel.\n");
			 		choice2 = scan.nextInt();
			 		if(choice2 == 1) {
			 			CharacterMngr.equipArmor(player, thornVest);
			 			break; 
			 		}
			 		else continue;
			 	
				case(2):
					NullMagic nullMagic = NullMagic.getInstance();
			 		DisplayMngr.previewArmor(nullMagic);
			 		System.out.printf("1. Confirm\n2. Cancel.\n");
			 		choice2 = scan.nextInt();
			 		if(choice2 == 1) {
			 			CharacterMngr.equipArmor(player, nullMagic);
			 			break; 
			 		}
			 		else continue;
			 	
			 	case(3):
			 		ArcaneRobe arcaneRobe = ArcaneRobe.getInstance();
			 		DisplayMngr.previewArmor(arcaneRobe);
			 		System.out.printf("1. Confirm\n2. Cancel.\n");
			 		choice2 = scan.nextInt();
			 		if(choice2 == 1) {
			 			CharacterMngr.equipArmor(player, arcaneRobe);
			 			break; 
			 		}
			 		else continue;
			 		
			 	case(4):
			 		CursedArmor cursedArmor = CursedArmor.getInstance();
			 		DisplayMngr.previewArmor(cursedArmor);
			 		System.out.printf("1. Confirm\n2. Cancel.\n");
			 		choice2 = scan.nextInt();
			 		if(choice2 == 1) {
			 			CharacterMngr.equipArmor(player, cursedArmor);
			 			break; 
			 		}
			 		else continue;
			 		
			 	case(5):
			 		AlchemistCloak alchemistCloak = AlchemistCloak.getInstance();
			 		DisplayMngr.previewArmor(alchemistCloak);
			 		System.out.printf("1. Confirm\n2. Cancel.\n");
			 		choice2 = scan.nextInt();
			 		if(choice2 == 1) {
			 			CharacterMngr.equipArmor(player, alchemistCloak);
			 			break; 
			 		}
			 		else continue;
			 		
				case(0):
					GameState.gameExit(2);

				default:
					System.out.println("Choose only 0-5 :)");
					continue;
			}
		break;
		}
	 }
	
	/**
	 *  Asks the user's for weapon choice
	 * @param player Player character
	 */
	public static void chooseWeapon(Player player){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice;
		int choice2;
		 
		while(true) {
			System.out.println("");
			System.out.println("Choose your weapon:");
			System.out.printf("1. Battle Axe\n2. Mystic Staff\n3. Dagger\n0. Quit\n");
			choice = scan.nextInt();
			
			switch(choice) {
				case(1):
					BattleAxe battleAxe = BattleAxe.getInstance();
					DisplayMngr.previewWeapon(battleAxe);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
			 			CharacterMngr.equipWeapon(player, battleAxe);
		 				break;
		 			}
		 			else continue;
		 	
				case(2):
					MysticStaff mysticStaff = MysticStaff.getInstance();
					DisplayMngr.previewWeapon(mysticStaff);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
			 			CharacterMngr.equipWeapon(player, mysticStaff);
		 				break;
		 			}
		 			else continue;
		 	
				case(3):
					Dagger dagger = Dagger.getInstance();
					DisplayMngr.previewWeapon(dagger);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
			 			CharacterMngr.equipWeapon(player, dagger);
		 				break;
		 			}
		 			else continue;
		 	
				case(0):
					GameState.gameExit(2);

				default:
					System.out.println("Choose only 0-3 :)");
					continue;
			}
			break;
		}
	}
	
	/**
	 *  Asks the user's for head gear choice
	 * @param player Player character
	 */
	public static void chooseHeadgear(Player player) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice;
		int choice2;
		 
		while(true) {
			System.out.println("");
			System.out.println("Choose your headgear:");
			System.out.printf("1. Heavy Helmet\n2. Cloth Headgear\n3. Tragedy Mask\n0. Quit\n");
			choice = scan.nextInt();
			
			switch(choice) {
				case(1):
					HeavyHelmet heavyHelm = HeavyHelmet.getInstance();
					DisplayMngr.previewHead(heavyHelm);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
			 			CharacterMngr.equipHeadGear(player, heavyHelm);
		 				break; 
		 			}
		 			else continue;
		 	
				case(2):
					ClothHead clothHead = ClothHead.getInstance();
					DisplayMngr.previewHead(clothHead);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
		 				CharacterMngr.equipHeadGear(player, clothHead);
		 				break; 
		 			}
		 			else continue;
		 	
				case(3):
					TragedyMask tragedyMask = TragedyMask.getInstance();
					DisplayMngr.previewHead(tragedyMask);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
		 				CharacterMngr.equipHeadGear(player, tragedyMask);
		 				break;
		 			}
		 			else continue;
		 	
				case(0):
					GameState.gameExit(2);

				default:
					System.out.println("Choose only 0-3 :)");
					continue;
			}
			break;
		}
	}
	
	/**
	 *  Asks the user's for glove choice
	 * @param player Player character
	 */
	public static void chooseGloves(Player player) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice;
		int choice2;
		 
		while(true) {
			System.out.println("");
			System.out.println("Choose your gloves:");
			System.out.printf("1. Iron Gloves\n2. Cloth Gloves\n3. Prowler Gloves\n0. Quit\n");
			choice = scan.nextInt();
			
			switch(choice) {
				case(1):
					IronGloves ironGloves = IronGloves.getInstance();
					DisplayMngr.previewGlove(ironGloves);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
		 				CharacterMngr.equipGloves(player, ironGloves);
		 				break; 
		 			}
		 			else continue;
		 	
				case(2):
					ClothGloves clothGloves = ClothGloves.getInstance();
					DisplayMngr.previewGlove(clothGloves);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
		 				CharacterMngr.equipGloves(player, clothGloves);
		 				break; 
		 			}
		 			else continue;
		 	
				case(3):
					ProwlerGloves prowlerGloves = ProwlerGloves.getInstance();
					DisplayMngr.previewGlove(prowlerGloves);
		 			System.out.printf("1. Confirm\n2. Cancel.");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
		 				CharacterMngr.equipGloves(player, prowlerGloves);
		 				break; 
		 			}
		 			else continue;
		 	
				case(0):
					GameState.gameExit(2);

				default:
					System.out.println("Choose only 0-3 :)");
					continue;
			}
			break;
		}
	}
	
	/**
	 *  Asks the user's for footwear choice
	 * @param player Player character
	 */
	public static void chooseFootwear(Player player) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice;
		int choice2;
		 
		while(true) {
			System.out.println("");
			System.out.println("Choose your footwear:");
			System.out.printf("1. Iron Boots\n2. Magical Boots\n3. Prowler Boots\n0. Quit\n");
			choice = scan.nextInt();
			
			switch(choice) {
				case(1):
					IronBoots ironBoots = IronBoots.getInstance();
					DisplayMngr.previewFootwear(ironBoots);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
		 				CharacterMngr.equipFootWear(player, ironBoots);
		 				break; 
		 			}
		 			else continue;
		 	
				case(2):
					MagicalBoots magicalBoots = MagicalBoots.getInstance();
					DisplayMngr.previewFootwear(magicalBoots);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
		 				CharacterMngr.equipFootWear(player, magicalBoots);
		 				break; 
		 			}
		 			else continue;
		 	
				case(3):
					ProwlerBoots prowlerBoots = ProwlerBoots.getInstance();
					DisplayMngr.previewFootwear(prowlerBoots);
		 			System.out.printf("1. Confirm\n2. Cancel.\n");
		 			choice2 = scan.nextInt();
		 			if(choice2 == 1) {
		 				CharacterMngr.equipFootWear(player, prowlerBoots);
		 				break; 
		 			}
		 			else continue;
		 	
				case(0):
					GameState.gameExit(2);
				default:
					System.out.println("Choose only 0-3 :)");
					continue;
			}
			break;
		}
	}
	
	/**
	 * Asks the user's for class skill choice
	 * @param player Player character
	 * @param playerClass Player class
	 */
	public static void chooseClassSkill(Player player, PlayerClassBase playerClass ) {
		System.out.println("");
		System.out.printf("Choose 1 skill from the %s skillpool.\n", playerClass.getName());
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice;
		
		while(true) {
			DisplayMngr.previewSkillPool(playerClass);
			choice = scan.nextInt();
			int skillIndex = choice - 1; //Indices starts at 0
			
			if(choice > playerClass.getMaxSkillSize() || choice < 1) {
				System.out.println("Skill not available");
				continue;
			}
			
			if(playerClass.getSkill(skillIndex) == null) {
				System.out.println("Skill not available.");
				continue;
			}
			CharacterMngr.equipClassSkill(player, playerClass, skillIndex);
			break;
		}	
	}
}
