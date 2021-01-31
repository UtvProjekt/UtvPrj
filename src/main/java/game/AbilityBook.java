package game;

import java.util.*;

public class AbilityBook {
	
	/*
	 * A global HashMap that contains all the other HashMaps
	 * for abilities.
	 * */
	private HashMap<Integer, HashMap> global;

	/*
	 * Abilities for mage's including HashMap for mage's
	 * */
	private HashMap<Integer, String> abilityMage;
	private String Frostbolt;
	private String Intelligence;
	private String Fireblast;

	/*
	 * Abilities for assassin's including HashMap for assassin's
	 * */
	private HashMap<Integer, String> abilityAssassin;
	private String Backstab;
	private String Poisonblades;
	private String Unconquerable;

	/*
	 * Abilities for tanks including HashMap for tanks
	 * */
	private HashMap<Integer, String> abilityTank;
	private String Charge;
	private String Enrage;
	private String Recharge;
	
	/*
	 * Every effect in the game.
	 * */
	
	
	public AbilityBook() {
		
		global = new HashMap<Integer, HashMap>();
		
		abilityMage = new HashMap<Integer, String>();
		Frostbolt = "Deal 15 damage to the enemy and has 20% chance to freeze the enemy.";
		Intelligence = "You gain 25% damage increase for 2 turns and restore 15% of your current health.";
		Fireblast = "Fireball the enemy dealing 30 damage and have a 30% chance to cause burn effect";
		
		abilityAssassin = new HashMap<Integer, String>();
		Backstab = "Deal 15 damage but has a 40% chance to critical strike dealing 30 instead.";
		Poisonblades = "Deal 30 damage and poison the enemy.";
		Unconquerable = "Go invisible and regenerate 40 health";
		
		abilityTank = new HashMap<Integer, String>();
		Charge = "Charge the boss dealing 10 damage and has a 25% chance to lower the enemy damage by 60%.";
		Enrage = "Gain 60% attack damage for 2 turns.";
		Recharge = "Regenerate back 80hp instantly.";
		
		/*
		 * Adding all the abilities to the maps
		 * starting with mage then assassin then tank.
		 */
		abilityMage.put(1, Frostbolt);
		abilityMage.put(2, Intelligence);
		abilityMage.put(3, Fireblast);
		
		abilityAssassin.put(1, Backstab);
		abilityAssassin.put(2, Poisonblades);
		abilityAssassin.put(3, Unconquerable);
		
		abilityTank.put(1, Charge);
		abilityTank.put(2, Enrage);
		abilityTank.put(3, Recharge);
		
		global.put(1, abilityMage);
		global.put(2, abilityAssassin);
		global.put(3, abilityTank);
	}
	
	public void printGlobal() {
		System.out.println("All attacks for all heroes!");
		printMage();
		printAssassin();
		printTank();
	}
	
	public void printMage() {
		System.out.println("\nAttacks for Mage.");
		for(Map.Entry<Integer, String> entry : abilityMage.entrySet()) {
			System.out.println("Attack " + entry.getKey() + ": " + entry.getValue());
		}	
	}
	
	public void printAssassin() {	
		System.out.println("\nAttacks for Assassins.");
		for(Map.Entry<Integer, String> entry : abilityAssassin.entrySet()) {
			System.out.println("Attack " + entry.getKey() + ": " + entry.getValue());
		}	
	}
	
	public void printTank() {		
		System.out.println("\nAttacks for Tanks.");
		for(Map.Entry<Integer, String> entry : abilityTank.entrySet()) {
			System.out.println("Attack " + entry.getKey() + ": " + entry.getValue());
		}	
	}	
}
