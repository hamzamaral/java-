 package ilk; 

public class Bil��renc�{
	
	String isim;
	int ogrNo;
	Bil��renc� labarkada��;
	
	public Bil��renc�(String i , int No) {
		isim=i;
		ogrNo=No;
		System.out.println(isim+"! s�n�f�m�za ho� geldin.");
	} 

	String getisim() {
		return isim;
	
	}
	void labarkada��ata(Bil��renc� ogr ) {
	labarkada��=ogr;
	System.out.println("art�k bir lab arkada��n var:"+ogr.getisim());
	  }
	
	public String tostring() {
		return null;
		  
	}
}     