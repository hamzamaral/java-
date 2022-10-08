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
		String s = "Ben bir tavuðum. \n\t Adým: " + this.getName() + "\n\t Yaþým: " + this.getAge() + "\n\t Bacak Sayým: " + this.getLegNumber();
		return s;
	}
	
	/*public static void main(String[] args) {
		
		System.out.println("Bu Chicken Sýnýfý için bir test metodudur");
		
		System.out.println("Tavuk sayýsý: " + Chicken.getCount());
		
		Chicken chicken = new Chicken("Tavuk1", 1);
		chicken.sayGreeting();
		chicken.fly();
		chicken.omnivore();
		
		System.out.println("Tavuk sayýsý: " + Chicken.getCount());
		
		chicken = new Chicken("Tavuk1", 1);
		chicken = new Chicken("Tavuk1", 1);
		chicken = new Chicken("Tavuk1", 1);
		chicken = new Chicken("Tavuk1", 1);
		System.out.println("Tavuk sayýsý: " + Chicken.getCount());
		
	}*/

}
