import java.util.Scanner;

public class Operatorler1 {

	public static void main(String[] args) {
		System.out.println("üç sayý giriniz");
		Scanner a= new Scanner(System.in);
		int b= a.nextInt();
		Scanner c= new Scanner(System.in);
		int d= c.nextInt();
		Scanner g= new Scanner(System.in);
		int f= g.nextInt();
		
		int enbuyuk=b;
		int enküçük=d;
		int orta=f;

		if(b < d) {
			enbuyuk=d;
			if(d<f) {
				enbuyuk=f;
			}
			
		}
		if(b > d) {
			enküçük=d;
			if(d>f) {
				enküçük=f;
			}
			
		}
		
		if (enküçük < f && f<enbuyuk) {
			orta=f;
		}
		if (enküçük < d && d<enbuyuk) {
			orta=d;
		}
		if (enküçük < b && b<enbuyuk) {
			orta=b;
		}
		

		System.out.println("enbuyuk: " + enbuyuk + "enkuçuk :" + enküçük + "orta : " + orta );
	}

}
