package game;

import java.util.*;

public class TheStory {

	public void Story() {
		
		Scanner input = new Scanner(System.in);
		String name;
		ChooseYourCharacter player = new ChooseYourCharacter();
		AbilityDamage damage = new AbilityDamage();
		AbilityBook book = new AbilityBook();
		int i = 0;
		
		System.out.println("Welcome To The Final Boss.\n\nYour story begins in a small town called Teratopia as a lone student.\n\nYou've just entered the local"
				+ " tavern and someone calls on you. (Enter)");
		input.nextLine();
		
		System.out.println("What is your name wanderer?");
		name = input.next();
		player.setUserName(name);
		
		System.out.println("\nMy name is " + player.getUserName() + " and im new in town. Can i have your finest ale please?(Enter)");
		input.nextLine();
		
		System.out.println("\nOf course my friend! But i have to ask.. I haven't seen your kind here before?\nWhat are you?\n");
		System.out.println("(All) to look at the characters abilities. (Enter) to skip");
		String all;
		all = input.next();
		if(all.toLowerCase().equals("all")){
			book.printGlobal();
		}
		player.CreateYourCharacter(input);
		
		
		input.nextLine();
		System.out.println("Ahh i see, you know i've only heard legends about your kind, " + player.getTypeOfCharacter() + "'s are known to be very strong...(Enter)");
		input.nextLine();
		
		System.out.println("As years went by the village continued to live happily and you finally found a place to live.\nAlthough there was joy, it wasn't"
				+ " going to stick around for a lot longer. After you finally settled in the village it was struck by a horrible attack with \na lot of hatred."
				+ " The towns strongest warriors gathered for an attack towards the hills, right now, they need you more than ever.(Enter)");
		input.nextLine();
		
		System.out.println("You've just entered the grand masters cave and prepared for the final boss, one versus one you fight to the death.(Enter)");
		input.nextLine();
		
		
		
	}
}
