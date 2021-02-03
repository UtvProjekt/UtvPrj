package game;

import java.util.*;

public class TestingMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ChooseYourCharacter a = new ChooseYourCharacter();
		
		a.setUserName("niadra");
	
		a.CreateYourCharacter(scan);
		
		System.out.println(a);
		
	}
	
	
	
	
	
}
