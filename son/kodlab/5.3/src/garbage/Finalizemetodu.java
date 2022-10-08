package garbage;


class A {
	A()
	{
		
		System.out.println("A sýnýfýndan nesne oluþturuldu : ");
		
	}
	protected void finalize() 
	{
		
		System.out.println("Burasý a'nin finalize metodu");
		
	}
}

 class B extends A
 {
		
	
	 
	 B () 
	 {
		super.finalize();// üst sýnýfýn nesnesinin oluþmasý istedik
		  System.out.println("B sýnýfýndan nesne oluþturuldu");
		 
	 }
	 
	 protected void finalize() 
		{
			
			System.out.println("Burasý A'nin finalize metodu");
		}

	 
 }

public class Finalizemetodu {

	public static void main(String[] args) {
		
	B nesne1 = new B();
	Runtime.getRuntime().gc();
	
		
	}

}
