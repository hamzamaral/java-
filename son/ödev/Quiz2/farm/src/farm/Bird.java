package farm;

public abstract class Bird extends Animal {
	
	public Bird(String name ,int age) 
	{
		super(name,age);
		setAge(age);
		setName(name);
	}
	public String b1;
	public String b2;
	public String b3;
	public String b4;
	
	public void fly() 
	{
		System.out.println("I can fly to the endless skies!");
		b1="I can fly to the endless skies!";
	}
	
	public void omnivore()
	{
		System.out.println("I can eat everything!");
		b2="I can eat everything!";
	}
	
	@Override
	public java.lang.String toString() {
      b3="burasý bird soyut sýnýfý";
		return b3;
	}
	
	
}



