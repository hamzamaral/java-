package havaAracı;

public class HavaAracı {

	public String araçismi;
	public String üretimyeri;
	public int hızı(int a) {
		return a;
	}

}

class MotorluHavracı extends HavaAracı
{
	
	public int ruhsatNumarası;
	public String Marka;
	public int fiyat;
	
	
}

class YolcuUçağı extends MotorluHavracı
{
	public int yolcusayısı;
	public int Koltuknumarası;
	public int  hostetSayısı;
	public String pilotİsmi;
	public int koltukSayısı;
	public int bagajKapasitesi;
}

class SavaşUçağı extends MotorluHavracı
{
	
	public String pilotİsmi;
	public String hedefKonum(String a) {
		String a1=a;
		return a1;
	}
	public String yakıtDoldurma(String b) {
		String b1=b;
		return b1;
}
	
}


class MotorsuzHavaAracı extends HavaAracı
{
	
	public String kullanımNedeni;
	public int üretimYılı;
	public int göreviYitirmeYılı;
	
}

class uçurtma extends MotorsuzHavaAracı
{
	public String uçurtanKişi;
	public int ipinUzunluğu;
	public int uçurtmaFiyatı;
	public int uçurtmaAğırlığı;
	
	
}

class zeplin extends MotorsuzHavaAracı
{
	public String pilotİsmi;
	public int yolcuSayısı;
	public int biletFiyatı;
	public String yolcuİsmi;
	public int yolcuağırlığı(int a) {
		return a;
	}
	
	
}
