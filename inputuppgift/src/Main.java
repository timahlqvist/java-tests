import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int n = rand.nextInt(100) + 1;
		int svar = 0;
		int försök = 1;
		
		while(svar != n) {
		System.out.println("Gissa på ett tal mellan 1 - 100: ");
		svar = scan.nextInt();
		
		if(svar == n) {
			System.out.println("Grattis, du klarade spelet på " + försök + " försök");
		}
		else if(svar < n) {
			System.out.println("högre");
			försök += 1;
		}
		else if(svar > n) {
			System.out.println("lägre");
			försök += 1;
		}
		else {
			System.out.println("Nu vet jag inte vad som blev fel");
		}
		}
	}

}
