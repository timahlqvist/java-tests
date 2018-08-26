public class NewClass {
	
	String name;
	int age;
	
	public NewClass(String name, int age) {
		this.name = name;
		this.age = age;
		metod();
	}
	
	public void metod() {
		System.out.println("Hej " + name + " du är " + age + " år gammal");
	}
	
}
