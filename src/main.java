package yan;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		///////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		//Tell the user what's happening.
		//Give them 3 options
		//1) Explode
		//2) Run
		//3) Survive
		System.out.println("Welcome to Text Adventure, your with Michael Bay and everything might just EXPLODE!");

		String playerChoice ;
		
		System.out.println("Your in your room and you hear something stumble downstairs, what are you going to do?");
		System.out.println("(1). Stay in your room.");
		System.out.println("(2). Jump out your window, while Michael stays in your room");
		System.out.println("(3). Sit in your room playing video games until everything is resloved");
	     
		playerChoice = input.nextLine();
	    
	    
		if(playerChoice.equals("1")){
			System.out.println("Something explodes.. Its your whole house, MWAHAH!");
		} else if(playerChoice.equals("2")) {
			System.out.println("So you jump out your window, and then fall off the tree you climb on. -_-");
		}
		else if(playerChoice.equals("3")) {
			System.out.println("Pewh... Close call you survived!");
			System.out.println("You know what this means? You continue the game, PARTYY WOOT WOOOT!");
		    System.out.println("Next batch of questions coming right up!");
		    System.out.println("*Ding* Please continue down below!");
		    System.out.println("All your oreos are gone, what will you do now?");
			System.out.println("(4). Kill everyone in your house that you suspect ate your cookies.");
			System.out.println("(5). Report this intolerable crime to the police department and then let FBI handle it if the police can't figure it out.");
			System.out.println("(6). Let this act slide and just forget about it.");
			playerChoice = input.nextLine();
			if(playerChoice.equals("4")){
				System.out.println("You kill everyone in your house... You get caught by the police and it turns out someone else came in your house and stole your oreos which were everything to you and loved them so much.");
			} else if(playerChoice.equals("5")) {
				System.out.println("So you report this horrible crime and the police try to figure out the case but cannot find the thief, only one thing to say.. SUCKS TO SUCK!");
			}
			else if(playerChoice.equals("6")) {
				System.out.println("It turned out you were just dreaming and no one took your oreos, have a great day and keep eating oreos at your desire");
				System.out.println("Created by Yan Gorshtenin");
			}
			
		}

	}

}
