package hafta5�1.pratik.sekil;


public  class Kutu {
	public int genislik;// //"public" t�m  nesneler taraf�ndan ,
     //ba�ka bir s�n�f i�erinden �agr�labilmesini sa�lar
	 public int derinlik;
	public  int yukseklik;
	public static int toplamKutuSayisi = 0;// static sayesinde  biz  s�n�f de�i�keni olu�turduk
	//ve her "kutu 1" ve "kutu  2" de�eri ayn� de�eri kullanm�� oldu(toplamkutusay�s�).
	
	public  Kutu (int genislik, int derinlik, int yukseklik)// parentez i�idekide�i�kenler lokald�r. 
	//geni�lik derinlik  y�kseklik
	{
		this.genislik = genislik;//this geni�lik sunan olusturdu�um geni�lik nesnesinin i�ine
		//ata (parentez i�inde tan�mlad�n geni�lik de�erini)
		this.derinlik = derinlik;
		this.yukseklik = yukseklik;
		toplamKutuSayisi++;
	}
	
	public double hacimHesapla() {
		double hacim1 = genislik * derinlik * yukseklik;
		return hacim1;
	}
	
	int alanHesapla() {
		int alan = 2 * (genislik * derinlik + genislik * yukseklik + derinlik * yukseklik);
		return alan;
	}

	
}