import java.util.Scanner;

public class D�ng�leer3 {

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
	       ublic static void main(String[] args // Scanner S�n�f�n� Tan�mlama:
	        Scanner konsolVeri = new Scanner(System.in);
	        // De�i�ken Tan�malamas�:
	        int ��gen;
	        System.out.println("------------\nKlavyeden Veri Alarak Y�ld�zlarla ��gen Olu�turma\n------------");
	        System.out.print("-> ��gen ��in Veri Giri�i Sa�lay�n: ");
	        ��gen = konsolVeri.nextInt();
	        System.out.print("------------\n");
	        for(int i=0;i<��gen;i++){
	            for(int k=1;k<��gen-i;k++){
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
		 System.out.println("��genin y�ksekli�i ka� birim olsun?");
		 int yukseklik=klavye.nextInt();
		 
		 for (int i=1; i<yukseklik*2; i+= 2) //1 3 5 7 9
		 {
		     for (int k=0; k < (20 - i/2); k++) //her sat�rdaki bo�luklar
		         System.out.print(" ");
		     
		     for (int j=0; j<i; j++)
		         System.out.print("*");
		     
		     System.out.println("");
		 }
		 
	    }*/

}
