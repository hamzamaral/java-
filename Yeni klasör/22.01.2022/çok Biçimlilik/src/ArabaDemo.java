
public class ArabaDemo {
	public static void main(String arg[])
	
	{
		
		Araba a1=new Araba();
		a1.h�z=50;
		a1.marka();

		a1.fren="merhaba Araba";
		BenzinliAraba b1 =new BenzinliAraba();
		b1.h�z=70;
		b1.marka();

		b1.fren="merhaba benzinli Araba";
		Gazl�Araba g1=new Gazl�Araba();
		g1.h�z=80;
		g1.marka();
		g1.fren="merhaba Gazl� Araba";
		referans(a1);
		referans(b1);
		referans(g1);
		System.out.println("-------------"+ g1.abs);
	}
	
	
	public static void referans(Araba a1) 
	
	{

		a1.h�z();
        a1.fren();	
        a1.marka();
	}
	
	
}
