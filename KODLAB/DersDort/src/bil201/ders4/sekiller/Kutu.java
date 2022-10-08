package src.bil201.ders4.sekiller;

public class Kutu {
	public int genislik;// 
	public int derinlik;
	public int yukseklik;
	public static int toplamKutuSayisi = 0;
	
	public Kutu (int genislik, int derinlik, int yukseklik)// parentez i�idekide�i�kenler lokald�r. 
	//geni�lik derinlik  y�kseklik
	{
		this.genislik = genislik;
		this.derinlik = derinlik;
		this.yukseklik = yukseklik;
		toplamKutuSayisi++;
	}
	
	int hacimHesapla() {
		int hacim = genislik * derinlik * yukseklik;
		return hacim;
	}
	
	int alanHesapla() {
		int alan = 2 * (genislik * derinlik + genislik * yukseklik + derinlik * yukseklik);
		return alan;
	}
}
