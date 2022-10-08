package src.bankAccount;

public class Horse extends Mammal {

	private static int count = 0;
	
	public Horse(String name, int age) {
		super(name, age);
		setLegNumber(4);
		count++;
	}

	@Override
	public void sayGreeting() {
		System.out.println("I will work harder!");
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		String s = "Ben bir atým. \n\t Adým: " + this.getName() + "\n\t Yaþým: " + this.getAge() + "\n\t Bacak Sayým: " + this.getLegNumber();
		return s;
	}

}