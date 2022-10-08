import java.util.Scanner;

public class Döngüleer3 {

public static void main(String[] args) {
	int k,i;
	int sembol =9;
		for(k=0; k<9; k++) {
			for( i=0; i <sembol; i++) {
				System.out.print("*");
			}
			System.out.println("");
			sembol--;		
		}
		
	}
	/* p) {
	       ublic static void main(String[] args // Scanner Sýnýfýný Tanýmlama:
	        Scanner konsolVeri = new Scanner(System.in);
	        // Deðiþken Tanýmalamasý:
	        int üçgen;
	        System.out.println("------------\nKlavyeden Veri Alarak Yýldýzlarla Üçgen Oluþturma\n------------");
	        System.out.print("-> Üçgen Ýçin Veri Giriþi Saðlayýn: ");
	        üçgen = konsolVeri.nextInt();
	        System.out.print("------------\n");
	        for(int i=0;i<üçgen;i++){
	            for(int k=1;k<üçgen-i;k++){
	                System.out.print(" ");
	            }
	            for(int x=0;x<=i*2;x++){
	                System.out.print("*");
	            }
	            System.out.println(" ");
	        }
	    }*/
	
	
/*public static void main(String [] args) {
	     
		 Scanner klavye=new Scanner(System.in);
		 System.out.println("Üçgenin yüksekliði kaç birim olsun?");
		 int yukseklik=klavye.nextInt();
		 
		 for (int i=1; i<yukseklik*2; i+= 2) //1 3 5 7 9
		 {
		     for (int k=0; k < (20 - i/2); k++) //her satýrdaki boþluklar
		         System.out.print(" ");
		     
		     for (int j=0; j<i; j++)
		         System.out.print("*");
		     
		     System.out.println("");
		 }
		 
	    }*/

}
