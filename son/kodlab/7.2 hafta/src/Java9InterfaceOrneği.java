
public interface Java9InterfaceOrne�i {
	
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

public class Cal��t�r implements Java9InterfaceOrne�i{
	public static void main(String args[]) {
		Cal��t�r cal = new Cal��t�r();
		cal.defaultMetod();
	}
}