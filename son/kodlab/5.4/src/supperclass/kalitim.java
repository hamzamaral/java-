package supperclass;

class sinif1
{
	
	int x;
	void metod1() 
	{
	
		System.out.println("burasý metod1  ");
		
	}
	
}

class sinif2 extends sinif1 
{

	int y;
	void metod2()
	{
		
		System.out.println("burasý metod 2");
		
	}
	
}
public class kalitim {

	public static void main(String[] args) {

		sinif2 ns1=new sinif2();
		ns1.x=7;
		System.out.println(ns1.x);
		ns1.metod1();
		sinif1 ns2=new sinif1();//s2.metod2()bu metoda eriþilemez
		
	}

}
