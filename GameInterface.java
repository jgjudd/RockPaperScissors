package game;
import java.util.Scanner;
import java.util.Random;

public class GameInterface {

	 public static void main(String[] args) {
		
		System.out.println("Welcome to the game.");
		boolean playAgain = true;
		
	while (playAgain = true) {	
		
		System.out.println("Do you want to play? Yes/No?");
		
		Scanner scan = new Scanner(System.in);  
		String input = scan.nextLine();
		
		if (input.equalsIgnoreCase("no")) {
			System.out.println("Bummer...see ya, i guess? Loser.");
		} else if (!input.equalsIgnoreCase("no") && !input.equalsIgnoreCase("yes")){
			System.out.println("Do you speak English? HELLO?!?!?!?! HABLAS ESPANOL?!?!?!");
		} else { //start of game
		
			System.out.println("Choose an opponent: ");
			System.out.println("Dwayne 'the Rock' Johnson, Donald Trump, or Leroy Jenkins");
			
			String opponent = scan.nextLine();
			if (opponent.equalsIgnoreCase("Dwayne 'the Rock' Johnson")) {
			} else if (opponent.equalsIgnoreCase("Donald Trump")) {
			} else if (opponent.equalsIgnoreCase("Leroy Jenkins")) {
			} else System.out.println("Face your fears. Choose a valid opponent. ");
				
			
				System.out.println("Let's begin...");
				System.out.println("Rock" + "\n" + "Paper" + "\n" + "Scissors" + "\n" + "Shoot!");
				
				System.out.println("Enter your play: ");
				
				Roshambo userShoot = Roshambo.valueOf(scan.next().toUpperCase());
				String cluck = userShoot.toString();
				
				
				
				
				Random compPick = new Random();
				
				
				switch (cluck) {
		
					case "Rock": 
						if (compPick.nextInt(3) == 0 ){
							System.out.println("Tie game!");
							
						}
						
						if	(compPick.nextInt(3) == 1) {
							System.out.println( "You lose!");
							
						}	
						if	(compPick.nextInt(3) == 2) {
							System.out.println( "You win!");
							
						}
					case "Paper": 
						if (compPick.nextInt(3) == 1){
							System.out.println("Tie game!");
							
						}
						
						if	(compPick.nextInt(3) == 0) {
							System.out.println( "You lose!");
							
						}	
						if	(compPick.nextInt(3) == 2) {
							System.out.println( "You win!");
							
						}
					case "Scissors": 
						if (compPick.nextInt(3) == 2){
							System.out.println("Tie game!");
							
						}
						
						if	(compPick.nextInt(3) == 0) {
							System.out.println( "You lose!");
							
						}	
						if	(compPick.nextInt(3) == 1) {
							System.out.println( "You win!");
							
					
							
					}
				}
				
			}
			
			
			System.out.println("Do you want to play again? Yes/No?");	
				String finalAnswer = scan.nextLine();
				System.out.println();
				
				if (finalAnswer.equalsIgnoreCase("yes")) {
					playAgain = true;
				} else {
					playAgain = false;
				}  
				
		}  
		
	}
}