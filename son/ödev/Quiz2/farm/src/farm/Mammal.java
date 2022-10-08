package farm;

public abstract class Mammal extends Animal {

	public Mammal(String name , int age)
	{
		super(name,age);
		setAge(age);
		setName(name);
	}
	
	public void walk() {
		System.out.println("I can walk to the far away lands!");
	}
	
	public void herbivore() {
		System.out.println("I eat plants only!”");
	}
	
	@Override
	public java.lang.String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
