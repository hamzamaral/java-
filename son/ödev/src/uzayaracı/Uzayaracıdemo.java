package uzayarac�;

public class Uzayarac�demo {

	public static void main(String[] args) {
		
		D�nyaY�r�gesindekiUydular x= new D�nyaY�r�gesindekiUydular();
		x.ara�isim="t�rkmtrji";
		System.out.println("arac�m�z�n ismi : " + x.ara�isim);
		System.out.println("uzay arac�n  h�z�:" + x.hiz(15000) );
		x.d�nyaY�r�ngesindekiDolanmaH�z�=10000;
		x.uyduT�r�="Meteoroloji  uydular�";
		x.uyduSay�lar�=10543;
		System.out.println("d�ynya y�rgesindeki toplam uydu say�s�:" + x.uyduSay�lar�);
		System.out.println("uydu t�r� :" + x.uyduT�r�);
		System.out.println("uydununn y�r�ngede dolanma  h�z� :" + x.d�nyaY�r�ngesindekiDolanmaH�z�);
		x.g�reveBa�lamaY�l�=1999;
		x.g�reviBitirmeY�l�=2005;
		//String k = x.G�revi("hava durumu ile ilgi tahmin �retmek:");
		
		System.out.println(" arac�n g�reve ba�lama h�z�:  " + x.g�reveBa�lamaY�l�);
		System.out.println(" arac�n g�revi bitirme y�l�: "  + x.g�reviBitirmeY�l�);
		System.out.println("arac�n g�revi : " + x.G�revi("hava durumu ile ilgi tahmin �retmek:" ));
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
		
		
		GezgegenSondalar h=new GezgegenSondalar();
		h.ara�isim="Akatsuki";
		//h.hiz(5);
		h.g�reveBa�lamaY�l�=2011;
		h.g�reviBitirmeY�l�=2020;
		//h.G�revi("hava durumu ile ilgi tahmin �retmek:")
		h.bulundu�uGezegenin�smi="mars";
		h.bulundu�uGezendeYerdekiH�z�=100;
		//h.gezegeni�ncele("y�zeyden al�nan topra��n anal�zi ba�ar�yla ger�ekle�mi�tir")
		System.out.println("arac�n ismi : " + h.ara�isim);
		System.out.println("arac�n h�z� : " + h.hiz(51520));
		System.out.println(" arac�n g�reve ba�lama h�z�:  " + h.g�reveBa�lamaY�l�);
		System.out.println(" arac�n g�revi bitirme y�l�: "  + h.g�reviBitirmeY�l�);
		System.out.println("arac�n g�revi : " + x.G�revi("y�zeyden al�nan topra��n anal�zi ba�ar�yla ger�ekle�mi�tir" ) );
		System.out.println( "arac�n buludu�u gezegenin y�zeyindeki h�z� : "  + h.bulundu�uGezegenin�smi);
		System.out.println("arc�n y�zeyinde dola�t��� gezegenin ismi : "  + h.bulundu�uGezegenin�smi);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
		�nsanl� y=new �nsanl�();
		y.ara�isim="Syncom ";
		//y.hiz(0)
		y.insanisimleri="muhammed hamza: ";
		y.insansay�s�=10;
		System.out.println("arac�n ismi : " + y.ara�isim);
		System.out.println("arac�n h�z� : " + y.hiz(51500));
		System.out.println("insan say�s�: " + y.insanisimleri);
		System.out.println("insan say�s� : " + y.insansay�s�);
		System.out.println("arac�n g�revi : "  + y.G�revi("bilimsel arast�rmalar yapmak."));
		
		
		


	}

} 
