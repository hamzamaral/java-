package uzayarac�;

public class Uzayarac� {

	public String ara�isim;
//	public int a;
	
	
	
	public int hiz(int a) {
		
		return a  ;
	}

}

class �nsanl� extends Uzayarac�{
	public int insansay�s�;
	public String insanisimleri;
	
	public String G�revi(String b) {
		String b1=b;
		return b1;
	}
	
	
}

class �nsans�z extends Uzayarac�{
	
	public int g�reveBa�lamaY�l�;
	public int g�reviBitirmeY�l�;
	
	public String G�revi(String c) {
	 	String c1=c;
		return c1;
	}
}


class GezgegenSondalar extends  �nsans�z{
	//public String k="";
	public String  bulundu�uGezegenin�smi; 
	public int bulundu�uGezendeYerdekiH�z�;
	public String gezegeni�ncele (String k) {
      return k;
		}

}
class D�nyaY�r�gesindekiUydular extends �nsans�z{
	public int uyduSay�lar�;
	public int d�nyaY�r�ngesindekiDolanmaH�z�;
	public String uyduT�r�;
			
	
	
}

