package garbage;


class A {
	A()
	{
		
		System.out.println("A s�n�f�ndan nesne olu�turuldu : ");
		
	}
	protected void finalize() 
	{
		
		System.out.println("Buras� a'nin finalize metodu");
		
	}
}

 class B extends A
 {
		
	
	 
	 B () 
	 {
		super.finalize();// �st s�n�f�n nesnesinin olu�mas� istedik
		  System.out.println("B s�n�f�ndan nesne olu�turuldu");
		 
	 }
	 
	 protected void finalize() 
		{
			
			System.out.println("Buras� A'nin finalize metodu");
		}

	 
 }

public class Finalizemetodu {

	public static void main(String[] args) {
		
	B nesne1 = new B();
	Runtime.getRuntime().gc();
	
		
	}

}
