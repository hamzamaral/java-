package �dev;

import java.util.Scanner;

public class Dairedemo {

	public static void main(String[] args ) {
		System.out.println("1'�NC� DA�REN�N �ZELL�KLER�");
		Daire kap;
		kap=new Daire ((float) 2.14);
		float a=kap.getYar�cap();
		System.out.println("dairenin cevresi : " + kap.getYar�cap() );
		System.out.println("pi say�s�n�n yakla��k de�eri: " + kap.getPi());
		System.out.println( "dairein cevresi: " + kap.cevrehesapla(a));
        System.out.println("Dairenin alan: " + kap.alanhesapla(a));
        System.out.println("------------------------------------------------------");
        System.out.println("2'�NC� DA�REN�N �ZELL�KLER�");
        Daire kap1;
		kap1=new Daire ((float) 1.14);
		float b=kap1.getYar�cap();
		System.out.println("dairenin cevresi : " + kap1.getYar�cap() );
		System.out.println("pi say�s�n�n yakla��k de�eri: " + kap1.getPi());
		System.out.println( "dairein cevresi: " + kap1.cevrehesapla(a));
        System.out.println("Dairenin alan: " + kap1.alanhesapla(a));
        System.out.println("------------------------------------------------------");
        
        System.out.println("3'�NC� DA�REN�N �ZELL�KLER�");
		Daire kap3;
		kap3=new Daire ((float) 8.15);
		float k=kap3.getYar�cap();
		System.out.println("dairenin cevresi : " + kap3.getYar�cap() );
		System.out.println("pi say�s�n�n yakla��k de�eri: " + kap3.getPi());
		System.out.println( "dairein cevresi: " + kap3.cevrehesapla(k));
        System.out.println("Dairenin alan: " + kap3.alanhesapla(k));
        System.out.println("------------------------------------------------------");
}
	

}
