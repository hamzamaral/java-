package sed.enu;


enum Araba {

	 AUD�(23),BMW(199),OPEL(255),FIAT(160);
	 public int hiz ;
	 Araba(int hiz)
	 {
		 this.hiz=hiz;
		 
	 }
}

public class Enum {

	
	public static void main(String[] args) {
		Araba.AUD�.hiz=230;
		 System.out.println(Araba.AUD�.hiz);
		 System.out.println(Araba.BMW.hiz);
		 System.out.println(Araba.OPEL.hiz);
		 System.out.println(Araba.FIAT.hiz);
	}

}
