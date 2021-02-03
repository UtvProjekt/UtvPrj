package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.AbilityBook;
import game.TheStory;
	
class AbilityBookTest{
	/*
	 * Checking if all attacks/effects are stored within the HashMaps
	 * @return returns true if they exist*/
	AbilityBook book = new AbilityBook();
	@Test
	void testingMageAttack() {
		assertTrue(book.mageHasAttack());
	}
	@Test
	void testingAssassinAttack(){
		assertTrue(book.assasinhasAttack());
	}
	@Test
	void testingTankAttack() {
		assertTrue(book.tankHasAttack());
	}
	@Test
	void testingEffects() {
		assertTrue(book.effectIsStored());
	}
}
