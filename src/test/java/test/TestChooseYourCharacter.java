package test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.ChooseYourCharacter;

class TestChooseYourCharacter {

	/**
	 * setting characters name and checking if its correct (Niadra)
	 */
	
	@Test
	public void testSetUserName()
	{
		ChooseYourCharacter newCharacter = new ChooseYourCharacter();
		newCharacter.setUserName("Niadra");

		assertEquals("Niadra", newCharacter.getUserName());
	}
	
	/**
	 * Testing if the input "evil" and "demon" is equal to "evil DEMON"
	 */

	@Test
	public void testCreateYourCharacter() 
	{
			Scanner input = new Scanner("evil demon");
			ChooseYourCharacter newCharacter = new ChooseYourCharacter();
			newCharacter.CreateYourCharacter(input);
			
			assertEquals("evil " + "DEMON", newCharacter.getTypeOfSide() + " " + newCharacter.getTypeOfCharacter());

	}

	
		  
	
	
	
	
}
