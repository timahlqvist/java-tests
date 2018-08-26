public class Main {

	public static void main(String[] args) {
		
		String x = "Hallo! Ich heisse Tim und ich liebe Computerspielen";
		
		int antalTecken = x.length();
		
		System.out.println(antalTecken);
		
		String y = "Hallo! Ich heisse";
		
		System.out.println(y.concat(" Tim"));
		System.out.println(y + " Tim");
		System.out.println("Hallo! Ich heisse" + " Tim");
		
	}

}
