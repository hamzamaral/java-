package src.bil201.ders4.demo;
import src.bil201.ders4.sekiller.Kutu;

public class KutuDemo {

	public static void main(String[] args) {
		Kutu kutu1;
		kutu1 = new Kutu(3, 5, 7);
		
		System.out.println("Kutu1 Geni�lik: " + kutu1.genislik);
		System.out.println("Kutu1 Derinlik: " + kutu1.derinlik);
		System.out.println("Kutu1 Y�kseklik: " + kutu1.yukseklik);
		System.out.println("Toplam kutu say�s�: " + Kutu.toplamKutuSayisi);

		System.out.println("\n--------------\n");
		
		Kutu kutu2;
		kutu2 = new Kutu(2, 4, 6);
		
		System.out.println("Kutu2 Geni�lik: " + kutu2.genislik);
		System.out.println("Kutu2 Derinlik: " + kutu2.derinlik);
		System.out.println("Kutu2 Y�kseklik: " + kutu2.yukseklik);
		System.out.println("Toplam kutu say�s�: " + Kutu.toplamKutuSayisi);

	}

}
