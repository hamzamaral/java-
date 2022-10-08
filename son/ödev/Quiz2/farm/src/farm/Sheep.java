package farm;

public class Sheep extends Mammal {
public Sheep(java.lang.String name, int age) {
		super(name, age);
		setAge(age);
		setName(name);	
		count++;
		count1++;
		}
	// count oluşturulan koyun sayısını tutar. Her yeni koyun nesnesi için değeri bir arttırılmalıdır.
//bacak sayısı4	

	private static int count=0;
	public String a3;
	public String a2;

	public  static int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
public void sayGreeting() {
	System.out.println("Four legs good, two legs better!");
	a3= "Four legs good, two legs better!";
}
@Override
	public java.lang.String toString() {
	a2="burası sheep sınıfınınn toString metodu. ";
	return a2;
	}
}
