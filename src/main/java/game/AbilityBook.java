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
	private HashMap<String, String> abilityMage;
	private String Frostbolt;
	private String Intelligence;
	private String Fireblast;

	/*
	 * Abilities for assassin's including HashMap for assassin's
	 * */
	private HashMap<String, String> abilityAssassin;
	private String Backstab;
	private String Poisonblades;
	private String Unconquerable;

	/*
	 * Abilities for tanks including HashMap for tanks
	 * */
	private HashMap<String, String> abilityTank;
	private String Charge;
	private String Enrage;
	private String Recharge;
	
	/*
	 * Every effect in the game.
	 * */
	private HashMap<String, String> effects;
	private String Freeze;
	private String Burn;
	private String Invisible;
	private String Poison;
	
	public AbilityBook() {
		
		global = new HashMap<Integer, HashMap>();
		
		abilityMage = new HashMap<String, String>();
		Frostbolt = "Deal 15 damage to the enemy and has 20% chance to freeze the enemy.";
		Intelligence = "You gain 25% damage increase for 2 turns and restore 15% of your current health.";
		Fireblast = "Fireball the enemy dealing 30 damage and have a 30% chance to cause burn effect";
		
		abilityAssassin = new HashMap<String, String>();
		Backstab = "Deal 15 damage but has a 40% chance to critical strike dealing 30 instead.";
		Poisonblades = "Deal 30 damage and poison the enemy.";
		Unconquerable = "Go invisible and regenerate 40 health";
		
		abilityTank = new HashMap<String, String>();
		Charge = "Charge the boss dealing 10 damage and has a 25% chance to lower the enemy damage by 60%.";
		Enrage = "Gain 60% attack damage for 2 turns.";
		Recharge = "Regenerate back 80hp instantly.";
		
		effects = new HashMap<String, String>();
		Freeze = "Enemy can not attack for 1 turn.";
		Burn = "Enemy takes 5 damage for 3 turns.";
		Invisible = "You can not be attacked for 1 turn.";
		Poison = "Enemy takes an additional 30% extra damage next turn.";
		
		/*
		 * Adding all the abilities to the maps
		 * starting with mage then assassin then tank.
		 */
		abilityMage.put("Frostbolt", Frostbolt);
		abilityMage.put("Intelligence", Intelligence);
		abilityMage.put("Fireblast", Fireblast);
		
		abilityAssassin.put("Backstab", Backstab);
		abilityAssassin.put("Poisonblades", Poisonblades);
		abilityAssassin.put("Unconquerable", Unconquerable);
		
		abilityTank.put("Charge", Charge);
		abilityTank.put("Enrage", Enrage);
		abilityTank.put("Recharge", Recharge);
		
		global.put(1, abilityMage);
		global.put(2, abilityAssassin);
		global.put(3, abilityTank);
		
		/*Adding all effects to a HashMap*/
		effects.put("Freeze", Freeze);
		effects.put("Burn", Burn);
		effects.put("Invisible", Invisible);
		effects.put("Poison", Poison);
		
	}
	
	public void printGlobal() {
		System.out.println("All attacks for all heroes");
		printMage();
		printAssassin();
		printTank();
	}
	
	public void printMage() {
		System.out.println("\nAttacks Mage's.");
		for(Map.Entry<String, String> entry : abilityMage.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}	
	}
	
	public void printAssassin() {	
		System.out.println("\nAttacks Assassins.");
		for(Map.Entry<String, String> entry : abilityAssassin.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}	
	}
	
	public void printTank() {		
		System.out.println("\nAttacks Tanks.");
		for(Map.Entry<String, String> entry : abilityTank.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}	
	}
	
	public void printEffects() {
		System.out.println("Effects.");
		for(Map.Entry<String, String> entry : effects.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
