import java.util.Scanner;

public class Faktöryel{

	public static void main (String arg[])
	{
		System.out.println("0 ile 100 arasýnda bir sayý giriniz.");
		Scanner itm = new Scanner(System.in);
		int b = itm.nextInt();
		
		if (0<b && b<100){
			System.out.println(fak(b));
		}
		else {
					 System.out.println("0 ile 100 arasýnda bir sayý giriniz.");

		}

		
	}
	
	public static int fak(int a) {
		if (a==1) {
			return 1;
		}
		else {
			return a*fak(a-1);

		}
		
		
	}
	
}

	