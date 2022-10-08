package arayüz1;

public class Demo {

	public static void main(String[] args) {
		
		Üçgen ns1=new Üçgen();
		
		
		System.out.println("alan :" + ns1.alan(5, 7));
		System.out.println("çevre :" + ns1.çevre(5, 7));
		System.out.println(ns1.ky);
		ns1.tina();
		
		DÝkdörtgen dk1=new DÝkdörtgen();
		
	
		System.out.println("alan :" +dk1.alan(8, 7) );
		System.out.println("çevre :" +dk1.çevre(8, 7) );
		
	
	}

}
