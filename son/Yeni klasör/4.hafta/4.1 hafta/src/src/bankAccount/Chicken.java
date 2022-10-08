package src.bankAccount;

public class Chicken extends Bird {

	private static int count = 0;
	
	public Chicken(String name, int age) {
		super(name, age);
		setLegNumber(2);
		count++;
	}

	@Override
	public void sayGreeting() {
		System.out.println("I have nothing to say other than I am against Pigs!");
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		String s = "Ben bir tavu�um. \n\t Ad�m: " + this.getName() + "\n\t Ya��m: " + this.getAge() + "\n\t Bacak Say�m: " + this.getLegNumber();
		return s;
	}
	
	/*public static void main(String[] args) {
		
		System.out.println("Bu Chicken S�n�f� i�in bir test metodudur");
		
		System.out.println("Tavuk say�s�: " + Chicken.getCount());
		
		Chicken chicken = new Chicken("Tavuk1", 1);
		chicken.sayGreeting();
		chicken.fly();
		chicken.omnivore();
		
		System.out.println("Tavuk say�s�: " + Chicken.getCount());
		
		chicken = new Chicken("Tavuk1", 1);
		chicken = new Chicken("Tavuk1", 1);
		chicken = new Chicken("Tavuk1", 1);
		chicken = new Chicken("Tavuk1", 1);
		System.out.println("Tavuk say�s�: " + Chicken.getCount());
		
	}*/

}
