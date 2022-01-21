package org.cmpdl.arpg;

import java.util.*;

import org.cmpdl.arpg.textInterface.GameState;
import org.cmpdl.arpg.textInterface.Glossary;

/**
 * Main Class of Apocalypse RPG. Initializes the main menu.
 * @author cmpdl
 *
 */
public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.printf("1. Start\n2. Glossary \n3. Quit\n");
			int choice = scan.nextInt();
		
			switch(choice) {
				case(1):
					GameState.start();
					break;
				case(2):
					Glossary.displayGlossary();
					continue;
				default:
					System.out.println("Thanks for playing!!!");
					scan.close();
			}
		break;
		}
	}
}
