package havaArac�;

public class HavaArac� {

	public String ara�ismi;
	public String �retimyeri;
	public int h�z�(int a) {
		return a;
	}

}

class MotorluHavrac� extends HavaArac�
{
	
	public int ruhsatNumaras�;
	public String Marka;
	public int fiyat;
	
	
}

class YolcuU�a�� extends MotorluHavrac�
{
	public int yolcusay�s�;
	public int Koltuknumaras�;
	public int  hostetSay�s�;
	public String pilot�smi;
	public int koltukSay�s�;
	public int bagajKapasitesi;
}

class Sava�U�a�� extends MotorluHavrac�
{
	
	public String pilot�smi;
	public String hedefKonum(String a) {
		String a1=a;
		return a1;
	}
	public String yak�tDoldurma(String b) {
		String b1=b;
		return b1;
}
	
}


class MotorsuzHavaArac� extends HavaArac�
{
	
	public String kullan�mNedeni;
	public int �retimY�l�;
	public int g�reviYitirmeY�l�;
	
}

class u�urtma extends MotorsuzHavaArac�
{
	public String u�urtanKi�i;
	public int ipinUzunlu�u;
	public int u�urtmaFiyat�;
	public int u�urtmaA��rl���;
	
	
}

class zeplin extends MotorsuzHavaArac�
{
	public String pilot�smi;
	public int yolcuSay�s�;
	public int biletFiyat�;
	public String yolcu�smi;
	public int yolcua��rl���(int a) {
		return a;
	}
	
	
}
