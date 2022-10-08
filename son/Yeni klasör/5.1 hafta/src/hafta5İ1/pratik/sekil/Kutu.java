package hafta5İ1.pratik.sekil;


public  class Kutu {
	public int genislik;// //"public" tüm  nesneler tarafından ,
     //başka bir sınıf içerinden çagrılabilmesini sağlar
	 public int derinlik;
	public  int yukseklik;
	public static int toplamKutuSayisi = 0;// static sayesinde  biz  sınıf değişkeni oluşturduk
	//ve her "kutu 1" ve "kutu  2" değeri aynı değeri kullanmış oldu(toplamkutusayısı).
	
	public  Kutu (int genislik, int derinlik, int yukseklik)// parentez içidekideğişkenler lokaldır. 
	//genişlik derinlik  yükseklik
	{
		this.genislik = genislik;//this genişlik sunan olusturduğum genişlik nesnesinin içine
		//ata (parentez içinde tanımladın genişlik değerini)
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