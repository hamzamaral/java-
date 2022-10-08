package garbage;

public class Garbagecollector1 {
	Garbagecollector1(){
		System.out.println("NESNE OLUÞTURULDU");
	}
	
	protected void finalize() //Garbage collector nesneleri silmeden nce calýþtýrdýðý metod
	
	{
		System.out.println("nesne silind siliirken bu metod kullanýldý.( finalize() )");

	}
	

	public static void main(String[] args) {

		for (int i = 0;i < 3 ; i++ ) 
		{
			
			Garbagecollector1 ni = new Garbagecollector1();
			
		}
		
		Runtime.getRuntime().gc();
		
	}

}
