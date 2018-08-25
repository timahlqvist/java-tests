public class Main {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 5;
		int total;
		
		do {
			total = x * y;
			System.out.println(x + " * " + y + " = " + total);
			x++;
		} while(x <= 10);
		
		x = 1;
		y = 5;
		
		do {
			total = x * y;
			System.out.println(x + " * " + y + " = " + total);
			x++;
		} while(x >= 10);
		
	}
}
