import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("You are the Guesser, So Guess a Number");
		int GuesserNum = sc.nextInt();
		System.out.println("You are the Player 1, So Guess a Number");
		int P1num = sc.nextInt();
		System.out.println("You are the Player 2, So Guess a Number");
		int P2num = sc.nextInt();
		System.out.println("You are the Player 3, So Guess a Number");
		int P3num = sc.nextInt();

		System.out.println("Hey Folks, I'm the umpire and I'm Gonna Announce the WINNER");
		if (P1num == GuesserNum) {
			if(P2num == GuesserNum && P3num == GuesserNum) {
				System.out.println("Player 1,2 and Player 3 are The Winners");
			}
			else if(P2num == GuesserNum ) {
				System.out.println("Player 1 and Player 2 are The Winners");
			}
			else if(P3num == GuesserNum ) {
				System.out.println("Player 1 and Player 3 are The Winners");
			}
			else {
			System.out.println("Player 1 Is The Winner");
			}
		}
		else if (P2num == GuesserNum) {
			if(P3num == GuesserNum) {
				System.out.println("Player 2 and Player 3 are The Winners");
			}
			else {
				System.out.println("Player 2 Is The Winner");
			}
			
		}
		else if (P3num == GuesserNum) {
			System.out.println("Player 3 Is The Winner");
		}
		else {
			System.out.println("No One Is The Winner");
		}

	}

}