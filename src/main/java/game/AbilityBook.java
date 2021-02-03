package game;

import java.util.*;

public class AbilityBook {
	
	/*
	 * A global HashMap that contains all the other HashMaps
	 * for abilities and Constructor for getName/getTypeOfSide/getTypeOfCharacter.
	 * */
	private HashMap<Integer, HashMap> global;
	/*
	 * Abilities for mage's including HashMap for mage's
	 * */
	private HashMap<String, String> abilityMage;
	private String Frostbolt;
	private String HealingPotion;
	private String Fireblast;

	/*
	 * Abilities for assassin's including HashMap for assassin's
	 * */
	private HashMap<String, String> abilityAssassin;
	private String Backstab;
	private String SlicersWrath;
	private String Unconquerable;

	/*
	 * Abilities for tanks including HashMap for tanks
	 * */
	private HashMap<String, String> abilityTank;
	private String SheildRush;
	private String SheildBlock;
	private String AxeThrow;
	
	/*
	 * Every effect in the game.
	 * */
	private HashMap<String, String> effects;
	private String Freeze;
	private String Invisible;
	private String Stun;
	
	public AbilityBook() {
		
		global = new LinkedHashMap<Integer, HashMap>();
		
		abilityMage = new LinkedHashMap<String, String>();
		Frostbolt = "Deal 20 damage to the enemy and has a 30% chance to freeze.";
		Fireblast = "Fireball the enemy dealing 35 damage.";
		HealingPotion = "Heal yourself for 25.";
		
		abilityAssassin = new LinkedHashMap<String, String>();
		Backstab = "Deal 15 damage but has a 40% chance to critical strike dealing 30 instead.";
		Unconquerable = "Go invisible.";
		SlicersWrath = "Slice the enemy dealing 20, 40, 60 or 80 damage";
		
		abilityTank = new LinkedHashMap<String, String>();
		SheildRush = "You charge at the enemy dealing 25 damage with a 30% chance to stun.";
		SheildBlock = "Use your sheild and block the next attack.";
		AxeThrow = "Throw your axe dealing 35 damage.";
		
		effects = new LinkedHashMap<String, String>();
		Freeze = "Enemy can not attack for 1 turn.";
		Invisible = "You can not be attacked for 1 turn.";
		Stun = "The enemy is stunned for 1 turn.";
		
		/*
		 * Adding all the abilities to the HashMaps
		 * starting with mage then assassin then tank.
		 */
		abilityMage.put("Frostbolt", Frostbolt);
		abilityMage.put("Healing Potion", HealingPotion);
		abilityMage.put("Fireblast", Fireblast);
		
		abilityAssassin.put("Backstab", Backstab);
		abilityAssassin.put("Unconquerable", Unconquerable);
		abilityAssassin.put("Slicers Wrath", SlicersWrath);
		
		abilityTank.put("Sheild Rush", SheildRush);
		abilityTank.put("Sheild Block", SheildBlock);
		abilityTank.put("Axe throw", AxeThrow);
		
		global.put(1, abilityMage);
		global.put(2, abilityAssassin);
		global.put(3, abilityTank);
		
		/*Adding all effects to a HashMap*/
		effects.put("Freeze", Freeze);
		effects.put("Invisible", Invisible);
		effects.put("Stun", Stun);
		
	}
	
	/* 4 different print methods
	 * printGlobal: prints out all attacks and effects for every character 
	 * printMage: only prints attacks for mage characters
	 * printAssassin: only prints attacks for Assassin characters
	 * printTank: only prints attacks for Tank characters*/
	
	public void printGlobal() {
		System.out.println("All attacks and effects for all characters");
		printMage();
		printAssassin();
		printTank();
		printEffects();
	}
	
	public void printMage() {
		System.out.println("\nAttacks Faerie(good), Soul Reaper(evil).\n");
		for(Map.Entry<String, String> entry : abilityMage.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}	
		System.out.println("");
	}
	
	public void printAssassin() {	
		System.out.println("\nAttacks Angel(good), Nightmare Shadow(evil).\n");
		for(Map.Entry<String, String> entry : abilityAssassin.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("");
	}
	
	public void printTank() {		
		System.out.println("\nAttacks SheildBearer(good), Demon(evil).\n");
		for(Map.Entry<String, String> entry : abilityTank.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}	
	}
	
	public void printEffects() {
		System.out.println("\nEffects.");
		for(Map.Entry<String, String> entry : effects.entrySet()) {
			System.out.println(entry.getKey().toString() + ": " + entry.getValue().toString());
		}
		System.out.println("");
	}
	/*@return
	 * Testing methods for jUnit test file "AbilityBookTest.java"
	 * I am testing whether values are stored or not 
	 */
	
	public boolean mageHasAttack() {
		if(abilityMage.containsValue(Frostbolt) && abilityMage.containsValue(Fireblast) && abilityMage.containsValue(HealingPotion)) {
			return true;
		}
		return false;
	}
	
	public boolean assasinhasAttack() {
		if(abilityAssassin.containsValue(Backstab) && abilityAssassin.containsValue(Unconquerable) && abilityAssassin.containsValue(SlicersWrath)) {
			return true;
		}
		return false;
	}
	
	public boolean tankHasAttack() {
		if(abilityTank.containsValue(SheildRush) && abilityTank.containsValue(SheildBlock) && abilityTank.containsValue(AxeThrow)) {
			return true;
		}
		return false;
	}
	
	public boolean effectIsStored() {
		if(effects.containsValue(Freeze) && effects.containsValue(Invisible) && effects.containsValue(Stun)) {
			return true;
		}
		return false;
	}

}
