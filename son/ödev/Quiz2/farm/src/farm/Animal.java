package farm;

  public abstract class Animal extends AnimalFarm {
	
	private String name ;
	private int legNumber;
	private int age ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegNumber() {
		return legNumber;
	}
	public void setLegNumber(int legNumber) {
		this.legNumber = legNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(String name,int age)
	{
		super();
		setName(name);
		setAge(age);
		
	}

	public abstract void sayGreeting();
	
	

}
