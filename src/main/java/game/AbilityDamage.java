package game;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;



public class AbilityDamage {
	private int playerHealth;
	private int bossHealth = 300;
	private int ability;

	/**
	 * Method that lets you choose an ability to use and then reduces either the bosses or players health points.
	 * 
	 * 
	 * @param player Object of the class ChooseYourCharacter
	 * @param i variable that if 0 sets the players starting health
	 */
	public void PlayerAttack(ChooseYourCharacter player, int i) {
		
		if(i == 0)
		{
			playerHealth = player.getHealthOfCharacter();
		}
		
		System.out.println("Your turn! \nChoose an ability to use (1/2/3) or 4 to show the ability book");
		Scanner scan = new Scanner(System.in);
		ability = scan.nextInt();
		int random = ThreadLocalRandom.current().nextInt(10)+1;
		
		while(ability == 1 || ability == 2 || ability == 3)
		{
			if(player.getTypeOfCharacter() == TheDiffrentCharacters.FAERIE || player.getTypeOfCharacter() == TheDiffrentCharacters.SOUL_REAPER)
			{
				if (ability == 1) {
					System.out.println("You used Frostbolt");
					System.out.println("You dealt 20 damage to the boss!");
					bossHealth = bossHealth - 20;
					if(random < 4) {
						System.out.println("You froze the boss, preventing his attack!");
						break;
					}
					
				}
				else if (ability == 2) {
					System.out.println("You used Fire Blast");
					System.out.println("You dealt 35 damage to the boss!");
					bossHealth = bossHealth -35;
				}
				else if(ability == 3) {
					System.out.println("You used a Healing Potion");
					System.out.println("You heal for 25!");
					playerHealth = playerHealth + 25;
				}
			}
			
			if(player.getTypeOfCharacter() == TheDiffrentCharacters.ANGEL || player.getTypeOfCharacter() == TheDiffrentCharacters.NIGHTMARE_SHADOW)
			{
				if(ability == 1) {
					random = ThreadLocalRandom.current().nextInt(10)+1;
					System.out.println("You used Backstab");
					if(random<5) {
						System.out.println("You dealt 60(critical) damage to the boss!");
						bossHealth = bossHealth -60;
					}
					else
					{
						System.out.println("You dealt 30 damage to the boss!");
						bossHealth = bossHealth -30;
					}
				}
				else if(ability == 2)
				{
					System.out.println("You used Invisible");
					System.out.println("You go invisible. Preventing the boss from attacking you!");
					break;
				}
				else if(ability == 3)
				{
					System.out.println("You used Slicers Wrath");
					random = ThreadLocalRandom.current().nextInt(10)+1;
					if(random < 2)
					{
						System.out.println("You strike 4 times for a total of 80 damage");
						bossHealth = bossHealth - 80;
					}
					else if(random<3) {
						System.out.println("You strike 3 time for a total of 60 damage");
						bossHealth = bossHealth - 60;
					}
					else if(random <5)
					{
						System.out.println("You strike 2 times for a total of 40 damage");
						bossHealth = bossHealth - 40;
					}
					else {
						System.out.println("You strike 1 time for a total of 20 damage");
						bossHealth = bossHealth - 20;
					}
				}
			}
			
			if(player.getTypeOfCharacter() == TheDiffrentCharacters.SHEILDBEARER || player.getTypeOfCharacter() == TheDiffrentCharacters.DEMON)
			{
				if(ability == 1)
				{
					System.out.println("You used Shield Rush");
					System.out.println("You charged at the boss dealing 25 damage");
					random = ThreadLocalRandom.current().nextInt(10)+1;
					bossHealth = bossHealth - 25;
					if(random<4) {
						System.out.println("The charge stunned the boss");
						break;
					}
				}
				else if (ability == 2) {
					System.out.println("You used Shield Block");
					System.out.println("You raised your shield and block the bosses next attack");
					break;
				}
				else if(ability == 3){
					System.out.println("You used Axe Throw");
					System.out.println("You dealt 35 damage to the boss!");
					bossHealth = bossHealth - 35;
				}
			}
			
			random = ThreadLocalRandom.current().nextInt(10)+1;
			if(random < 3)
			{
				System.out.println("You dodged the boss's attack");
			}
			else if(random <7)
			{
				System.out.println("The boss used Quick Stab");
				System.out.println("The boss dealt 25 damage to you!");
				playerHealth = playerHealth - 25;				
			}
			else if(random<9)
			{
				System.out.println("The boss used Earthquake");
				System.out.println("The boss dealt 40 critical damage to you!");
				playerHealth = playerHealth -40;
			}
			else if(random<10) {
                System.out.println("The boss used devils grace");
                System.out.println("The boss healed for 75 health");
                bossHealth = bossHealth + 75;
            }
			
			break;
		}
		AbilityBook abilities = new AbilityBook();
		if(ability == 4)
		{
			if(player.getTypeOfCharacter() == TheDiffrentCharacters.ANGEL || player.getTypeOfCharacter() == TheDiffrentCharacters.NIGHTMARE_SHADOW) {
				abilities.printAssassin();
			}
			else if(player.getTypeOfCharacter() == TheDiffrentCharacters.FAERIE || player.getTypeOfCharacter() == TheDiffrentCharacters.SOUL_REAPER) {
				abilities.printMage();
			}
			else if(player.getTypeOfCharacter() == TheDiffrentCharacters.SHEILDBEARER || player.getTypeOfCharacter() == TheDiffrentCharacters.DEMON) {
				abilities.printTank();
			}
			
				
		}
		
		
	}
	/**
	 * 
	 * @return the player's health points
	 */
	public int getPlayerHealth()
	{
		return playerHealth; 
	}
	
	/**
	 * 
	 * @return the boss's health points
	 */
	public int getBossHealth()
	{
		return bossHealth;
	}
	
	
	
	
	

}
