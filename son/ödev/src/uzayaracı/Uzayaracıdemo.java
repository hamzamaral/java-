package uzayaracý;

public class Uzayaracýdemo {

	public static void main(String[] args) {
		
		DünyaYörügesindekiUydular x= new DünyaYörügesindekiUydular();
		x.araçisim="türkmtrji";
		System.out.println("aracýmýzýn ismi : " + x.araçisim);
		System.out.println("uzay aracýn  hýzý:" + x.hiz(15000) );
		x.dünyaYörüngesindekiDolanmaHýzý=10000;
		x.uyduTürü="Meteoroloji  uydularý";
		x.uyduSayýlarý=10543;
		System.out.println("düynya yörgesindeki toplam uydu sayýsý:" + x.uyduSayýlarý);
		System.out.println("uydu türü :" + x.uyduTürü);
		System.out.println("uydununn yörüngede dolanma  hýzý :" + x.dünyaYörüngesindekiDolanmaHýzý);
		x.göreveBaþlamaYýlý=1999;
		x.göreviBitirmeYýlý=2005;
		//String k = x.Görevi("hava durumu ile ilgi tahmin üretmek:");
		
		System.out.println(" aracýn göreve baþlama hýzý:  " + x.göreveBaþlamaYýlý);
		System.out.println(" aracýn görevi bitirme yýlý: "  + x.göreviBitirmeYýlý);
		System.out.println("aracýn görevi : " + x.Görevi("hava durumu ile ilgi tahmin üretmek:" ));
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
		
		
		GezgegenSondalar h=new GezgegenSondalar();
		h.araçisim="Akatsuki";
		//h.hiz(5);
		h.göreveBaþlamaYýlý=2011;
		h.göreviBitirmeYýlý=2020;
		//h.Görevi("hava durumu ile ilgi tahmin üretmek:")
		h.bulunduðuGezegeninÝsmi="mars";
		h.bulunduðuGezendeYerdekiHýzý=100;
		//h.gezegeniÝncele("yüzeyden alýnan topraðýn analýzi baþarýyla gerçekleþmiþtir")
		System.out.println("aracýn ismi : " + h.araçisim);
		System.out.println("aracýn hýzý : " + h.hiz(51520));
		System.out.println(" aracýn göreve baþlama hýzý:  " + h.göreveBaþlamaYýlý);
		System.out.println(" aracýn görevi bitirme yýlý: "  + h.göreviBitirmeYýlý);
		System.out.println("aracýn görevi : " + x.Görevi("yüzeyden alýnan topraðýn analýzi baþarýyla gerçekleþmiþtir" ) );
		System.out.println( "aracýn buluduðu gezegenin yüzeyindeki hýzý : "  + h.bulunduðuGezegeninÝsmi);
		System.out.println("arcýn yüzeyinde dolaþtýðý gezegenin ismi : "  + h.bulunduðuGezegeninÝsmi);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
		Ýnsanlý y=new Ýnsanlý();
		y.araçisim="Syncom ";
		//y.hiz(0)
		y.insanisimleri="muhammed hamza: ";
		y.insansayýsý=10;
		System.out.println("aracýn ismi : " + y.araçisim);
		System.out.println("aracýn hýzý : " + y.hiz(51500));
		System.out.println("insan sayýsý: " + y.insanisimleri);
		System.out.println("insan sayýsý : " + y.insansayýsý);
		System.out.println("aracýn görevi : "  + y.Görevi("bilimsel arastýrmalar yapmak."));
		
		
		


	}

} 
