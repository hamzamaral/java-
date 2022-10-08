import java.util.Scanner;
interface arayüzz
{

	public String kero(String kç);

}

public class Sýnýf{
	  static double c;
	  static String kç;
	public class Yerelsýnýf
	{
		public void yrl() {
				System.out.println("Karakter sayýsý: "+c);

		}
		
		
	
		
	}
	
public String metodsýnýf() {
			class Metotsýnýf implements arayüzz 
			{

				@Override
				public String kero(String kç) {
					String kç1=kç;
					return kç1;
					
				}
				
				
				
			}
			Metotsýnýf f =new Metotsýnýf();
			String kç2=f.kero(kç);
			return "küçük hali:"+kç2;
		}
	public static void main(String arg[]) {
		
		Scanner a1=new Scanner(System.in);
		String b=a1.next();
		c=b.length();
		Sýnýf.Yerelsýnýf an =new Sýnýf().new Yerelsýnýf();
		an.yrl();
		Sýnýf an1=new Sýnýf();
		 kç=b.toLowerCase();
		 System.out.println(an1.metodsýnýf());
		 String bk=b.toUpperCase();
	/*System.out.println("buyuk harflerle yazýlmasý :" + bk);
		System.out.println("kuçuk harflerle yazýlmasý : " + kç);*/
		
	}
	
}
