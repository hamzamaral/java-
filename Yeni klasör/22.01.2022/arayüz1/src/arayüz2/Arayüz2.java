package arayüz2;

public interface Arayüz2 {

	  String yazar = "sada";
	String türügt;
	double fiyatý;
	default void krhn(String yazar,double türü,double fiyatý) {
		
		this. yazar=yazar;
		this. türü=türü;
		this. fiyatý=fiyatý;
		
		
		
		
	}
	
	
	public  void yazdýr(String c);
}
