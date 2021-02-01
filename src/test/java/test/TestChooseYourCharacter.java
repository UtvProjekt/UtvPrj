package test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.ChooseYourCharacter;
import game.TheDiffrentCharacters;

class TestChooseYourCharacter {

	
	@Test
	public void testSetUserName()
	{
		ChooseYourCharacter newCharacter = new ChooseYourCharacter();
		newCharacter.setUserName("Niadra");

		assertEquals("Niadra", newCharacter.getUserName());
	}

	@Test
	public void testCreateYourCharacter() 
	{
		try(Scanner input = new Scanner(System.in)) 
		{
			ChooseYourCharacter newCharacter = new ChooseYourCharacter();
			newCharacter.CreateYourCharacter(input);
			//i terminalen skriver jag in: 
			//1: bad 
			//2: demon
			
			assertEquals("bad " + TheDiffrentCharacters.DEMON, newCharacter.getTypeOfSide() + " " + newCharacter.getTypeOfCharacter());
		} 
		catch (Exception e) 
		{
			
		}
		
	}
	
	
	
	
}
