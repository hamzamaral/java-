package sed;


public enum Arabam {

	 AUD�(),BMW(199),OPEL(255),FIAT(160);
	 public int hiz ;
	 Arabam(int hiz)
	 {
		 this.hiz=hiz;
		 
	 }
}
public class Enum {

	public static void main(String[] args) {
		 System.out.println(Arabam.AUD�.hiz);
		 System.out.println(Arabam.BMW.hiz);
		 System.out.println(Arabam.OPEL.hiz);
		 System.out.println(Arabam.FIAT.hiz);
	}

}