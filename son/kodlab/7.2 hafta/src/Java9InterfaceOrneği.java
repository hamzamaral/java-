
public interface Java9InterfaceOrneði {
	
	default void  defaultMetod() {
		System.out.println("java 8 default metod ");
		privatemetod();
	}
	static void StaticMetod() {
		System.out.println("java 8 static metod");
		
	}
	
	private void privatemetod() {
		System.out.println("java 8 static private metod");
		privatestticMetod();

	}
	
	private static void privatestticMetod() {
		System.out.println("java 8 private static metod");
		StaticMetod();

	}

}

public class Calýþtýr implements Java9InterfaceOrneði{
	public static void main(String args[]) {
		Calýþtýr cal = new Calýþtýr();
		cal.defaultMetod();
	}
}