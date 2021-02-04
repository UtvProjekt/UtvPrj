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
	
	/**
	 * Testing if the input "good" and "angel" is equal to "evil ANGEL"
	 */
	@Test
	public void testGoodCreateYourCharacter() 
	{
		Scanner input = new Scanner("good angel");
		ChooseYourCharacter newCharacter = new ChooseYourCharacter();
		newCharacter.CreateYourCharacter(input);
		
		assertEquals("good " + "ANGEL", newCharacter.getTypeOfSide() + " " + newCharacter.getTypeOfCharacter());
		
	}

	
		  
	
	
	
	
}
