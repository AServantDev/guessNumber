package devinette;
import java.util.Scanner;
public class Devinette {
	
	int tries = 10;
	int secretNumber;
	boolean win = false;
	
	int randomizeNumber(int a, int b){
		
		secretNumber = (int) (Math.random() * a+b);
		System.out.println("Guess the number between " + a + " and " + b);
		return secretNumber;		
	}

	boolean guessNumber() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input == secretNumber) {
			System.out.println("Yaaaaaay");
			
			return true;
		}else if (input > secretNumber) {
			System.out.println("You number is greater than the secret one");
			tries = tries -1;
			System.out.println("You lost one try, you have " + tries + " tries left");
			}else if(input < secretNumber){
			System.out.println("You number is lower than the secret one");
			tries = tries -1;
			System.out.println("You lost one try, you have " + tries + " tries left");
			
		}
		return false;
	}
	
	boolean endGame(){
		if(tries == 0) {
			return false;
		
		}return true;
	}
	
	void gameStart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two int for the range");
		int input = sc.nextInt();
		int input2 = sc.nextInt();
		
		randomizeNumber(input, input2);
		while((endGame() == true)) {
		
		guessNumber();
		endGame();
		}
	}
}
