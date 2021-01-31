package game;

import java.util.*;

public class ChooseYourCharacter {

	private String userName;
	private String typeOfSide;
	private TheDiffrentCharacters typeOfCharacter;


	public void CreateYourCharacter() {

		try (Scanner input = new Scanner(System.in)) {

			System.out.println("Create Username: ");
			userName = input.next();

			System.out.println("Pick a side [GOOD/BAD]: ");
			typeOfSide = input.next();

			
			if(!typeOfSide.toLowerCase().equals("good") && !typeOfSide.toLowerCase().equals("bad")) {
				System.out.println("That is not valid side!");
				
				while(!typeOfSide.toLowerCase().equals("good") && !typeOfSide.toLowerCase().equals("bad")){
					System.out.print("Pick a side [GOOD/BAD]: ");
					typeOfSide = input.next();

				} 
				
			}
			
			

			if (typeOfSide.toLowerCase().equals("good")) {
				String answer;
				System.out.println("Pick a character - [Angel/Faerie/ShieldBearer]: ");
				answer = input.next();
				
				if(!answer.toLowerCase().equals("angel") && !answer.toLowerCase().equals("faerie")
						&& !answer.toLowerCase().equals("sheildbearer")) {
					
					do {
						System.out.println("This character doesn't exist");
						System.out.println("Pick a character - [ANGEL/FAERIE/SHEILDBEARER]: ");

						answer = input.next();
					} while (!answer.toLowerCase().equals("angel") && !answer.toLowerCase().equals("faerie")
							&& !answer.toLowerCase().equals("sheildbearer"));
					
					
				}
				if (answer.toLowerCase().equals("angel")) {
					typeOfCharacter = TheDiffrentCharacters.ANGEL;
				}
				else if (answer.toLowerCase().equals("faerie")) {
					typeOfCharacter = TheDiffrentCharacters.FAERIE;
				}
				else if (answer.toLowerCase().equals("sheildbearer")) {
					typeOfCharacter = TheDiffrentCharacters.SHEILDBEARER;
				} 
				
			}	
			    if (typeOfSide.toLowerCase().equals("bad")) {
			    String answer;
				System.out.println("Pick a character - [NightmareShadow/SoulReaper/Demon]: ");
				answer = input.next();
				
				if(!answer.toLowerCase().equals("nightmareshadow") && !answer.toLowerCase().equals("soulreaper") && !answer.toLowerCase().equals("demon")) {
					
					do {
						System.out.println("This character doesn't exist");
						System.out.println("Pick a character - [NightmareShadow/SoulReaper/Demon]: ");

						answer = input.next();
					} while (!answer.toLowerCase().equals("nightmareshadow")
							&& !answer.toLowerCase().equals("soulreaper") && !answer.toLowerCase().equals("demon"));
					
				}
				if (answer.toLowerCase().equals("nightmareshadow")) {
					typeOfCharacter = TheDiffrentCharacters.NIGHTMARE_SHADOW;
				}
				else if (answer.toLowerCase().equals("soulreaper")) {
					typeOfCharacter = TheDiffrentCharacters.SOUL_REAPER;
				}
				else if (answer.toLowerCase().equals("demon")) {
					typeOfCharacter = TheDiffrentCharacters.DEMON;
				}
			} 
			
		
			
			System.out.println(" hej" + userName + typeOfSide + typeOfCharacter);
			
			
		} catch (Exception e) {

		}

	}

	public String getUserName() {
		return userName;
	}

	public String getTypeOfSide() {
		return typeOfSide;
	}

	public TheDiffrentCharacters getTypeOfCharacter() {
		return typeOfCharacter;
	}

}
