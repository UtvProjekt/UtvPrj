package game;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;



public class AbilityDamage {
	private int playerHealth;
	private int bossHealth = 300;

	public void PlayerAttack(ChooseYourCharacter player, ChooseYourCharacter boss, int i) {
		
		if(i == 0)
		{
			playerHealth = player.getHealth();
		}
		
		System.out.println("Your turn! \nChoose an ability to use (1/2/3) p to show ability book");
		Scanner scan = new Scanner(System.in);
		int ability = scan.nextInt();
		int random = ThreadLocalRandom.current().nextInt(10)+1;
		
		while(ability == 1 || ability == 2)
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
					System.out.println("You heal for 30!");
					playerHealth = playerHealth + 30;
				}
			}
			
			if(player.getTypeOfCharacter() == TheDiffrentCharacters.ANGEL || player.getTypeOfCharacter() == TheDiffrentCharacters.NIGHTMARE_SHADOW)
			{
				if(ability == 1) {
					random = ThreadLocalRandom.current().nextInt(10)+1;
					System.out.println("You used Backstab");
					if(random<5) {
						System.out.println("You dealt 40(critical) damage to the boss!");
						bossHealth = bossHealth -40;
					}
					else
					{
						System.out.println("You dealt 20 damage to the boss!");
						bossHealth = bossHealth -20;
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
						System.out.println("You strike 4 times for a total of 60 damage");
						bossHealth = bossHealth - 60;
					}
					else if(random<3) {
						System.out.println("You strike 3 time for a total of 45 damage");
						bossHealth = bossHealth - 45;
					}
					else if(random <5)
					{
						System.out.println("You strike 2 times for a total of 30 damage");
						bossHealth = bossHealth - 45;
					}
					else {
						System.out.println("You strike 1 time for a total of 15 damage");
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
					if(random<3) {
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
			else if(random<10)
			{
				System.out.println("The boss used Earthquake");
				System.out.println("The boss dealt 40 critical damage to you!");
				playerHealth = playerHealth -40;
			}
			
			break;
		}
		
		
	}
	
	public int getPlayerHealth()
	{
		return playerHealth; 
	}
	
	public int getBossHealth()
	{
		return bossHealth;
	}
	
	
	

}
