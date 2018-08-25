public class Main {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		x = 42;
		y = 255;
		z = 2;
		
		if(x == z) {
			System.out.println(x + " = " + z);
		}
		else if(y == z) {
			System.out.println(y + " = " + z);
		}
		else if(x == y) {
			System.out.println(x + " = " + y);
		}
		else if(x > z) {
			System.out.println(x + " > " + z);
		}
		else if(x < z) {
			System.out.println(x + " < " + y);
		}
		else if(y > z) {
			System.out.println(y + " > " + z);
		}
		else if(y < z) {
			System.out.println(y + " < " + z);
		}
	}
}
