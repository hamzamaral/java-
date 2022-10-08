package src.bankAccount;

public class Sheep extends Mammal {

	private static int count = 0;
	
	public Sheep(String name, int age) {
		super(name, age);
		setLegNumber(4);
		count++;
	}

	@Override
	public void sayGreeting() {
		System.out.println("Four legs good, two legs better!");
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		String s = "Ben bir koyunum. \n\t Ad�m: " + this.getName() + "\n\t Ya��m: " + this.getAge() + "\n\t Bacak Say�m: " + this.getLegNumber();
		return s;
	}

}