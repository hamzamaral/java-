package uzayaracý;

public class Uzayaracý {

	public String araçisim;
//	public int a;
	
	
	
	public int hiz(int a) {
		
		return a  ;
	}

}

class Ýnsanlý extends Uzayaracý{
	public int insansayýsý;
	public String insanisimleri;
	
	public String Görevi(String b) {
		String b1=b;
		return b1;
	}
	
	
}

class Ýnsansýz extends Uzayaracý{
	
	public int göreveBaþlamaYýlý;
	public int göreviBitirmeYýlý;
	
	public String Görevi(String c) {
	 	String c1=c;
		return c1;
	}
}


class GezgegenSondalar extends  Ýnsansýz{
	//public String k="";
	public String  bulunduðuGezegeninÝsmi; 
	public int bulunduðuGezendeYerdekiHýzý;
	public String gezegeniÝncele (String k) {
      return k;
		}

}
class DünyaYörügesindekiUydular extends Ýnsansýz{
	public int uyduSayýlarý;
	public int dünyaYörüngesindekiDolanmaHýzý;
	public String uyduTürü;
			
	
	
}

