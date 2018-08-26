public class Main {

	public static void main(String[] args) {
		
		String ord[] = {"tim", "bil", "lim", "bajs", "majs", "klocka", "klot", "pim", "gramas"};
		String helloWorld;
		
		helloWorld = "Hello World!";
		
		
		/*for(String x : ord) {
			if(x.endsWith("im")) {
				System.out.println(x);
			}
		}
		*/
		
		for(String w : ord) {
			if(w.startsWith("k")){
				System.out.println(w);
			}
	
		}
		
		System.out.println(helloWorld.indexOf("W"));

	}
}