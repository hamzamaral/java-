import java.util.Scanner;
interface aray�zz
{

	public String kero(String k�);

}

public class S�n�f{
	  static double c;
	  static String k�;
	public class Yerels�n�f
	{
		public void yrl() {
				System.out.println("Karakter say�s�: "+c);

		}
		
		
	
		
	}
	
public String metods�n�f() {
			class Metots�n�f implements aray�zz 
			{

				@Override
				public String kero(String k�) {
					String k�1=k�;
					return k�1;
					
				}
				
				
				
			}
			Metots�n�f f =new Metots�n�f();
			String k�2=f.kero(k�);
			return "k���k hali:"+k�2;
		}
	public static void main(String arg[]) {
		
		Scanner a1=new Scanner(System.in);
		String b=a1.next();
		c=b.length();
		S�n�f.Yerels�n�f an =new S�n�f().new Yerels�n�f();
		an.yrl();
		S�n�f an1=new S�n�f();
		 k�=b.toLowerCase();
		 System.out.println(an1.metods�n�f());
		 String bk=b.toUpperCase();
	/*System.out.println("buyuk harflerle yaz�lmas� :" + bk);
		System.out.println("ku�uk harflerle yaz�lmas� : " + k�);*/
		
	}
	
}
