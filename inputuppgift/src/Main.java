import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int n = rand.nextInt(100) + 1;
		int svar = 0;
		int f�rs�k = 1;
		
		while(svar != n) {
		System.out.println("Gissa p� ett tal mellan 1 - 100: ");
		svar = scan.nextInt();
		
		if(svar == n) {
			System.out.println("Grattis, du klarade spelet p� " + f�rs�k + " f�rs�k");
		}
		else if(svar < n) {
			System.out.println("h�gre");
			f�rs�k += 1;
		}
		else if(svar > n) {
			System.out.println("l�gre");
			f�rs�k += 1;
		}
		else {
			System.out.println("Nu vet jag inte vad som blev fel");
		}
		}
	}

}
