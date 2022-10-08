package src.bankAccount;

public abstract class Bird extends Animal {

	public Bird(String name, int age) {
		super(name, age);
	}
	
	public void fly() {
		System.out.println("I can fly to the endless skies!");
	}
	
	public void omnivore() {
		System.out.println("I can eat everything!");
	}
	
}
