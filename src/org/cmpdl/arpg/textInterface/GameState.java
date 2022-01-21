package org.cmpdl.arpg.textInterface;
import java.util.*;

import org.cmpdl.arpg.characters.Player;

/**
 * Enter and Exit the game depending on the user's choices.
 * @author cmpdl
 *
 */
public class GameState {
	/**
	 * Starts the game
	 * @throws InterruptedException 
	 */
	public static void start() throws InterruptedException {
		int stage = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		if(name.equals("")) name = "Chip"; //Default name if blank;
		
		Player player = Player.getInstance();
		player.setName(name);
		DisplayMngr.displayIntro();
		
		BuildCharacter.buildCharacter(player);
		player.setHp(player.getMaxHp());
		player.setMp(player.getMaxMp());
		
		CombatMngr.fight(player, "PESTILENCE");
		stage ++;
		Reward.getReward(player, stage);
		CombatMngr.fight(player,"WAR");
		stage ++;
		Reward.getReward(player, stage);
		CombatMngr.fight(player,"FAMINE");
		stage ++;
		Reward.getReward(player, stage);
		CombatMngr.fight(player,"DEATH");
		System.out.println("\nI'm called Death for something.\n");
		Reward.healPlayer(player);
		CombatMngr.fight(player,"DEATH");
		scan.close();
		gameExit(0);
	}
	
	/**
	 * Exits the game depending on the state.
	 * The state determines what to print before closing the game
	 * @param state
	 */
	public static void gameExit(int state) {
		switch(state) {
			case(0):
				//Use when the player won
				System.out.println("Congratulations!! You stopped the apocalypse, you saved humanity from extinction. For now.");
				System.out.println("FIN.");
				System.out.println("");
				System.out.println("Thank you for playing!! :D :D :D");
				System.exit(0);
			case(1):
				//Use when the player dies or gives  up
				System.out.printf("...Kudos for trying %s. But you will not be remembered,\n", Player.getInstance().getName());
				System.out.println("for there will be no one left to remember you.");
				System.out.println("FIN.");
				System.out.println("");
				System.out.println("Thank you for playing!! :D :D :D");
				System.exit(0);
			case(2):
				//Use when the player quits
				System.out.println("In a do or die situation, you didn't do. You died...");
				System.out.println("FIN.");
				System.out.println("");
				System.out.println("Thank you for playing!! :D :D :D");
				System.exit(0);
			case(3):
				//Used when the player choose to watch
				System.out.println("You watch as the rest of humanity is slaughtered before you.");
				System.out.println("You are the last person standing... for a short time. ");
				System.out.println("FIN.");
				System.out.println("");
				System.out.println("Thank you for playing!! :D :D :D");
				System.exit(0);
		}
	}
}
