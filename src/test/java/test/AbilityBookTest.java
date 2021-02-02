package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.AbilityBook;
import game.TheStory;

class AbilityBookTest extends AbilityBook{
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

}
