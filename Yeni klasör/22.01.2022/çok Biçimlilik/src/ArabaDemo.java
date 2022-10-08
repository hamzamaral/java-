
public class ArabaDemo {
	public static void main(String arg[])
	
	{
		
		Araba a1=new Araba();
		a1.hız=50;
		a1.marka();

		a1.fren="merhaba Araba";
		BenzinliAraba b1 =new BenzinliAraba();
		b1.hız=70;
		b1.marka();

		b1.fren="merhaba benzinli Araba";
		GazlıAraba g1=new GazlıAraba();
		g1.hız=80;
		g1.marka();
		g1.fren="merhaba Gazlı Araba";
		referans(a1);
		referans(b1);
		referans(g1);
		System.out.println("-------------"+ g1.abs);
	}
	
	
	public static void referans(Araba a1) 
	
	{

		a1.hız();
        a1.fren();	
        a1.marka();
	}
	
	
}
