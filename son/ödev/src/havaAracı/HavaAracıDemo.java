package havaAracý;

public class HavaAracýDemo {

	public static void main(String[] args) {

		YolcuUçaðý x=new YolcuUçaðý();
		x.araçismi="boeing 17";
		x.üretimyeri="amerika ";
		//x.hýzý(0)
		x.ruhsatNumarasý=15426358;
		x.Marka="Airbus A220.\r\n";
		x.fiyat=1254333;
		x.yolcusayýsý=112;
		x.Koltuknumarasý=5;
		x.hostetSayýsý=7;
		x.pilotÝsmi="muhammed hamaza maral";
		x.koltukSayýsý=126;
		x.bagajKapasitesi=15;//ton
		System.out.println("Araçismi : " + x.araçismi);
		System.out.println("üretim yeri : "  +x.üretimyeri);
		System.out.println("uçagýn saatteki hýzý :" + x.hýzý(900));
		System.out.println("aracýn ruhsat numarasý : " + x.ruhsatNumarasý);
		System.out.println("marka : " + x.Marka);
		System.out.println("aracýn fiyatý : " + x.fiyat);
		System.out.println("yolcu sayýsý : " + x.yolcusayýsý);
		System.out.println("koltuk numarsý : "  + x.Koltuknumarasý);
		System.out.println("aractaki hostes sayýsý : " + x.hostetSayýsý);
		System.out.println("pilot ismi : " + x.pilotÝsmi);
		System.out.println("aractaki koltuk sayýsý : " + x.koltukSayýsý);
		System.out.println("ucaktaki bagaj kapasitesi :" +x.bagajKapasitesi +  "ton");
		System.out.println("-*--*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		
		SavaþUçaðý y=new SavaþUçaðý();
		y.araçismi="F-16 Fighting Falcon";
		y.üretimyeri="amerika ";
		//y.hýzý(0)
		y.ruhsatNumarasý=16854558;
		y.Marka="General Dynamics ";
		y.fiyat=1899933;
		y.pilotÝsmi="muhammed hamza maral";		
		System.out.println("Araçismi : " + y.araçismi);
		System.out.println("üretim yeri : "  +y.üretimyeri);
		System.out.println("Savaþ uçagýn saatteki hýzý :" + y.hýzý(900));
		System.out.println("aracýn ruhsat numarasý : " + y.ruhsatNumarasý);
		System.out.println("marka : " + y.Marka);
		System.out.println("pilot ismi : " + y.pilotÝsmi);
		System.out.println("pilotun variþ yeri : " + y.hedefKonum("yunanistan"));
		System.out.println("yakýt dolumu gerçekleþtirme : " +y.yakýtDoldurma("yakýt doldurma  baþarýyla tamamlanmiþtýr.") );
		System.out.println("-*--*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		
		uçurtma k=new uçurtma();
		k.araçismi="üçgen uçurtma : ";
		k.üretimyeri="türkiye ";
		//k.hýzý(45)
		k.üretimYýlý=1958;
		k.göreviYitirmeYýlý=1997;
		k.kullanýmNedeni="hobi olarak ,eðlence olarak kullanýlýr : ";
		k.uçurtanKiþi="halil ibrahim maral";
		k.ipinUzunluðu=67;
		k.uçurtmaAðýrlýðý=3;
		k.uçurtmaFiyatý=154;
		System.out.println("Araçismi : " + k.araçismi);
		System.out.println("üretim yeri : "  +k.üretimyeri);
		System.out.println("üçurtmanýn saatteki hýz : " + k.hýzý(45));
		System.out.println("ucurtmaný üretim yýlý : " + k.üretimYýlý);
		System.out.println("ucurtmanýn kullanýndan kalýdýrýlma yýlý  : " + k.göreviYitirmeYýlý);
		System.out.println("kullaným nedeni : " + k.kullanýmNedeni);
		System.out.println("kullanan kiþi : " + k.uçurtanKiþi);
		System.out.println("ipin uzunluðu : " + k.ipinUzunluðu);
		System.out.println("uçurtmanýn aðýrlýðý : " + k.uçurtmaAðýrlýðý);
		System.out.println("uçurtmanýn fiyatý : " + k.uçurtmaFiyatý);
		System.out.println("-*--*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        
		
		zeplin l=new zeplin();
		l.araçismi="zeplin : ";
	    l.üretimyeri="almanya ";
		//k.hýzý(45)
		l.üretimYýlý=1948;
		l.göreviYitirmeYýlý=1994;
		l.kullanýmNedeni="bir yerden baþka bir yere hava yolu ile ulaþým aracý olarak kullanýlýr. ";
		l.pilotÝsmi="mehmetþah : " ;
		l.yolcuSayýsý=136;
		l.biletFiyatý=546;
		//l.yolcuaðýrlýðý(0)
		l.yolcuÝsmi="muhammed ali";
		System.out.println("Araçismi : " + l.araçismi);
		System.out.println("üretim yeri : "  +l.üretimyeri);
		System.out.println("zeplinin saatteki hýz : " + l.hýzý(45));
		System.out.println("zeplinin üretim yýlý : " + l.üretimYýlý);
		System.out.println("zeplinin kullanýndan kalýdýrýlma yýlý  : " + l.göreviYitirmeYýlý);
		System.out.println("aracýn kullanýlma nedeni :" + l.kullanýmNedeni );
		System.out.println("pilotismi :" + l.pilotÝsmi);
		System.out.println("yolcu sayýsý : "  + l.yolcuSayýsý);
		System.out.println("bileetfiyatý : " + l.biletFiyatý);
		
				
		
		
	}

}
