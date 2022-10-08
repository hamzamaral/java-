package src.bankAccount;

public abstract class Animal {
	
	private String name;
	private int legNumber;
	private int age;
	
	public Animal(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public abstract void sayGreeting();
	
	public String getName() {
		return name;
	}
	
	public int getLegNumber() {
		return legNumber;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLegNumber(int legNumber) {
		this.legNumber = legNumber;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
