package src.bankAccount;

public abstract class Mammal extends Animal {

	public Mammal(String name, int age) {
		super(name, age);
	}
	
	public void walk() {
		System.out.println("can walk to the far away lands!");
	}
	
	public void herbivore() {
		System.out.println("I eat plants only!");
	}
	
}
