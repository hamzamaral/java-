package farm;

public class Horse extends Mammal {
//Horse sýnýfýnýn nesnesi gerçek bir atý temsil eder. Mammal 
	//sýnýfýnýn alt sýnýfýdýr. Bacak sayýs 4’tür.
	private static int  count=0;
	
	public static int getCount() {
		return count;
	}
	public String a1;
	public String a2;


	public void setCount(int count) {
		this.count = count;
	}

	public Horse(String name,int age) 
	{
		super(name,age);
		setAge(age);
		setName(name);
		count++;
		count1++;
	}
	
	public void sayGreeting() {
		System.out.println("I will work harder!");
		a1="I will work harder!";
	}
	@Override
		public java.lang.String toString() {
		a2="burasý horse sýnýfýnýnn toString metodu. ";
		return a2;
		}
	

}
