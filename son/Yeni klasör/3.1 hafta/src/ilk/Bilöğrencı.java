 package ilk; 

public class Bilöðrencý{
	
	String isim;
	int ogrNo;
	Bilöðrencý labarkadaþý;
	
	public Bilöðrencý(String i , int No) {
		isim=i;
		ogrNo=No;
		System.out.println(isim+"! sýnýfýmýza hoþ geldin.");
	} 

	String getisim() {
		return isim;
	
	}
	void labarkadaþýata(Bilöðrencý ogr ) {
	labarkadaþý=ogr;
	System.out.println("artýk bir lab arkadaþýn var:"+ogr.getisim());
	  }
	
	public String tostring() {
		return null;
		  
	}
}     