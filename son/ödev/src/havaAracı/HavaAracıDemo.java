package havaArac�;

public class HavaArac�Demo {

	public static void main(String[] args) {

		YolcuU�a�� x=new YolcuU�a��();
		x.ara�ismi="boeing 17";
		x.�retimyeri="amerika ";
		//x.h�z�(0)
		x.ruhsatNumaras�=15426358;
		x.Marka="Airbus A220.\r\n";
		x.fiyat=1254333;
		x.yolcusay�s�=112;
		x.Koltuknumaras�=5;
		x.hostetSay�s�=7;
		x.pilot�smi="muhammed hamaza maral";
		x.koltukSay�s�=126;
		x.bagajKapasitesi=15;//ton
		System.out.println("Ara�ismi : " + x.ara�ismi);
		System.out.println("�retim yeri : "  +x.�retimyeri);
		System.out.println("u�ag�n saatteki h�z� :" + x.h�z�(900));
		System.out.println("arac�n ruhsat numaras� : " + x.ruhsatNumaras�);
		System.out.println("marka : " + x.Marka);
		System.out.println("arac�n fiyat� : " + x.fiyat);
		System.out.println("yolcu say�s� : " + x.yolcusay�s�);
		System.out.println("koltuk numars� : "  + x.Koltuknumaras�);
		System.out.println("aractaki hostes say�s� : " + x.hostetSay�s�);
		System.out.println("pilot ismi : " + x.pilot�smi);
		System.out.println("aractaki koltuk say�s� : " + x.koltukSay�s�);
		System.out.println("ucaktaki bagaj kapasitesi :" +x.bagajKapasitesi +  "ton");
		System.out.println("-*--*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		
		Sava�U�a�� y=new Sava�U�a��();
		y.ara�ismi="F-16 Fighting Falcon";
		y.�retimyeri="amerika ";
		//y.h�z�(0)
		y.ruhsatNumaras�=16854558;
		y.Marka="General Dynamics ";
		y.fiyat=1899933;
		y.pilot�smi="muhammed hamza maral";		
		System.out.println("Ara�ismi : " + y.ara�ismi);
		System.out.println("�retim yeri : "  +y.�retimyeri);
		System.out.println("Sava� u�ag�n saatteki h�z� :" + y.h�z�(900));
		System.out.println("arac�n ruhsat numaras� : " + y.ruhsatNumaras�);
		System.out.println("marka : " + y.Marka);
		System.out.println("pilot ismi : " + y.pilot�smi);
		System.out.println("pilotun vari� yeri : " + y.hedefKonum("yunanistan"));
		System.out.println("yak�t dolumu ger�ekle�tirme : " +y.yak�tDoldurma("yak�t doldurma  ba�ar�yla tamamlanmi�t�r.") );
		System.out.println("-*--*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		
		u�urtma k=new u�urtma();
		k.ara�ismi="��gen u�urtma : ";
		k.�retimyeri="t�rkiye ";
		//k.h�z�(45)
		k.�retimY�l�=1958;
		k.g�reviYitirmeY�l�=1997;
		k.kullan�mNedeni="hobi olarak ,e�lence olarak kullan�l�r : ";
		k.u�urtanKi�i="halil ibrahim maral";
		k.ipinUzunlu�u=67;
		k.u�urtmaA��rl���=3;
		k.u�urtmaFiyat�=154;
		System.out.println("Ara�ismi : " + k.ara�ismi);
		System.out.println("�retim yeri : "  +k.�retimyeri);
		System.out.println("��urtman�n saatteki h�z : " + k.h�z�(45));
		System.out.println("ucurtman� �retim y�l� : " + k.�retimY�l�);
		System.out.println("ucurtman�n kullan�ndan kal�d�r�lma y�l�  : " + k.g�reviYitirmeY�l�);
		System.out.println("kullan�m nedeni : " + k.kullan�mNedeni);
		System.out.println("kullanan ki�i : " + k.u�urtanKi�i);
		System.out.println("ipin uzunlu�u : " + k.ipinUzunlu�u);
		System.out.println("u�urtman�n a��rl��� : " + k.u�urtmaA��rl���);
		System.out.println("u�urtman�n fiyat� : " + k.u�urtmaFiyat�);
		System.out.println("-*--*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        
		
		zeplin l=new zeplin();
		l.ara�ismi="zeplin : ";
	    l.�retimyeri="almanya ";
		//k.h�z�(45)
		l.�retimY�l�=1948;
		l.g�reviYitirmeY�l�=1994;
		l.kullan�mNedeni="bir yerden ba�ka bir yere hava yolu ile ula��m arac� olarak kullan�l�r. ";
		l.pilot�smi="mehmet�ah : " ;
		l.yolcuSay�s�=136;
		l.biletFiyat�=546;
		//l.yolcua��rl���(0)
		l.yolcu�smi="muhammed ali";
		System.out.println("Ara�ismi : " + l.ara�ismi);
		System.out.println("�retim yeri : "  +l.�retimyeri);
		System.out.println("zeplinin saatteki h�z : " + l.h�z�(45));
		System.out.println("zeplinin �retim y�l� : " + l.�retimY�l�);
		System.out.println("zeplinin kullan�ndan kal�d�r�lma y�l�  : " + l.g�reviYitirmeY�l�);
		System.out.println("arac�n kullan�lma nedeni :" + l.kullan�mNedeni );
		System.out.println("pilotismi :" + l.pilot�smi);
		System.out.println("yolcu say�s� : "  + l.yolcuSay�s�);
		System.out.println("bileetfiyat� : " + l.biletFiyat�);
		
				
		
		
	}

}
