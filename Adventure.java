import java.awt.Choice;
import java.security.KeyStore.Entry;
import java.util.Scanner;

public class Adventure {
	private static Scanner scan = new Scanner(System.in);
	private static boolean Playing = true;
	
	public static void main(String[] args) {
		
		while (Playing) {
			
			System.out.println("Welcome to Punt, Pass, or Kick!");
			
			System.out.println("\n It's a 4th and goal situation. What will you do?\n");
			
			System.out.println("\tP. Punt\n" + "\tT. Pass\n" + "\tK. Kick\n");
			
			String decisions= scan.nextLine();
			
			whatWillYouDo(decisions);
		}
			
	}

	public static boolean whatWillYouDo(String decisions) {
		
		switch (decisions.toLowerCase()){
		
		case "p":
			ChosePunt();
			break;
		case "t":
			ChosePass();
			break;
		case "k":
			ChoseKick();
			break;
		default:
			System.out.println("You've chosen an incorrect choice");
			System.exit(0);
							
		}
		return Playing;
	}
	public static boolean ChosePunt(){
		System.out.println("You dummy. You punted 4th and goal. You Lose!");
		System.out.println("Would you like to play again?\n Y or N");
		
		String playAgain = scan.nextLine();
		
		switch (playAgain.toLowerCase()){
		case "y":
			restart();
			break;
		case "n":
			endGame();
			break;
		default:
			System.out.println("Invalid choice. Please use Y or N");
		}
		return Playing;
		
	}

	private static boolean endGame() {
		Playing = false;
				return Playing;
	}

	private static boolean restart() {
		return Playing;
		
	}
}
