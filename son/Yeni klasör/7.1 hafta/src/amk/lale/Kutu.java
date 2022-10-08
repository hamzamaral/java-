,
package amk.lale;
public class Kutu {
	private float genislik;
	private float yukseklik;
	private float derinlik;
	
	public Kutu() {
		this(1.0f);
	}
	
	public Kutu(float boyut) {
		this(boyut, boyut, boyut);
	}
	
	public Kutu(Kutu ornekKutu) {
		this(ornekKutu.genislik, ornekKutu.yukseklik, ornekKutu.derinlik);
	}	
	
	public Kutu(float genislik, float yukseklik, float derinlik) {
		setGenislik(genislik);
		setYukseklik(yukseklik);
		setDerinlik(derinlik);
	}
	
	public float hacimHesapla() {
		return this.genislik * this.yukseklik * this.derinlik;
	}
	
	public float getGenislik() {
		return genislik;
	}
	
	public float getYukseklik() {
		return yukseklik;
	}
	
	public float getDerinlik() {
		return derinlik;
	}
	
	public void setGenislik(float genislik) {
		if(genislik <= 0) {
			System.out.println("Genişlik değeri sıfırdan küçük olamaz");
			this.genislik = 1;
		}
		else
			this.genislik = genislik;

	}
	
	public void setYukseklik(float yukseklik) {
		if(yukseklik <= 0) {
			System.out.println("Yükseklik değeri sıfırdan küçük olamaz");
			this.yukseklik = 1;
		}
		else
			this.yukseklik = yukseklik;
	}
	
	public void setDerinlik(float derinlik) {
		if(derinlik <= 0) {
			System.out.println("Derinlik değeri sıfırdan küçük olamaz");
			this.derinlik = 1;
		}
		else
			this.derinlik = derinlik;
	}
}
