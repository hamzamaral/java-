import java.util.Scanner;

public class Operatorler1 {

	public static void main(String[] args) {
		System.out.println("�� say� giriniz");
		Scanner a= new Scanner(System.in);
		int b= a.nextInt();
		Scanner c= new Scanner(System.in);
		int d= c.nextInt();
		Scanner g= new Scanner(System.in);
		int f= g.nextInt();
		
		int enbuyuk=b;
		int enk���k=d;
		int orta=f;

		if(b < d) {
			enbuyuk=d;
			if(d<f) {
				enbuyuk=f;
			}
			
		}
		if(b > d) {
			enk���k=d;
			if(d>f) {
				enk���k=f;
			}
			
		}
		
		if (enk���k < f && f<enbuyuk) {
			orta=f;
		}
		if (enk���k < d && d<enbuyuk) {
			orta=d;
		}
		if (enk���k < b && b<enbuyuk) {
			orta=b;
		}
		

		System.out.println("enbuyuk: " + enbuyuk + "enku�uk :" + enk���k + "orta : " + orta );
	}

}
