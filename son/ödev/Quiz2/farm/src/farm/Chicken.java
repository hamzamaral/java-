package farm;

public class Chicken extends Bird {
	// count oluşturulan tavuk sayısını tutar. Her yeni tavuk nesnesi için değeri bir arttırılmalıdır.
	private static int count=0;
	
	
	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Chicken(String name ,int age)
	//Chicken sınıfının nesnesi gerçek bir tavuğu temsil eder. Bird sınıfının alt sınıfıdır. Bacak
	//sayısı 2’dir.

	{
		
        super(name,age);
		setAge(age);
		setName(name);
		
		count++;
		count1++;
		
	}
	
	public String a1;
	public String a2;

	public void sayGreeting() {
		
	System.out.println("I have nothing to say other than I am against Pigs!”");
	 a1 = "I have nothing to say other than I am against Pigs!";



	}
	@Override
	public java.lang.String toString() {
		// TODO Auto-generated method stub
		a2="burası chicken sınıfınınn toString metodu. ";
		return a2;
	}

}
