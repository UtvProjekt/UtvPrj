package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAbilityDamage {

	/**
	 * Testing if the boss's starting health is correct (300)
	 */
	@Test
	void testBossHealth() {
		AbilityDamage a = new AbilityDamage();
		assertEquals(a.getBossHealth(), 300);
	}
	
	

}
