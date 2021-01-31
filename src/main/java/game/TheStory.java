package game;

import java.util.*;

public class TheStory {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome To The Final Boss.\n\nYour story begins in a small town called Teratopia as a lone student.\n\nYou've just entered the local"
				+ " tavern and someone calls on you. (Enter)");
		input.nextLine();
		
		String userName;
		System.out.println("What is your name wanderer?");
		System.out.print("Name: ");
		userName = input.next();
		
		System.out.println("\nMy name is " + userName + " and im new in town. Can i have your finest ale please?");
		input.nextLine();
		String type;
		System.out.println("\nOf course my friend! But i have to ask.. I haven't seen your kind here before?\nWhat are you?");
		System.out.print("Type: ");
		type = input.next();
		
		input.nextLine();
		System.out.println("Ahh i see, you know i've only heard legends about your kind, " + type + "'s are known to be very strong.");
		System.out.println("What brings you here?");
		
		
		
		System.out.println("As years went by the village continued to live happily and you finally found a place to live.\nAlthough there was joy, it wasn't"
				+ " going to stick around for a lot longer. After you finally settled in the village it was struck by a horrible attack with a lot of hatred."
				+ " The towns strongest warriors gathered for an attack, right now, they need you more than ever.");
		
		
	}

}
