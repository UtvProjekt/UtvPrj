package game;

import java.util.*;

public class AbilityBook {
	
	private HashMap<Integer, HashMap> global;

	private HashMap<Integer, String> abilityMage;
	private String Frostbolt;
	private String Intelligence;
	private String Fireblast;

	private HashMap<Integer, String> abilityAssassin;
	private String Backstab;
	private String Poisonblades;
	private String Unconquerable;

	private HashMap<Integer, String> abilityTank;
	private String Charge;
	private String Enrage;
	private String Recharge;
	
	
	public AbilityBook() {
		
		global = new HashMap<>();
		
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
	
}
