package uzayaracı;

public class Uzayaracı {

	public String araçisim;
//	public int a;
	
	
	
	public int hiz(int a) {
		
		return a  ;
	}

}

class İnsanlı extends Uzayaracı{
	public int insansayısı;
	public String insanisimleri;
	
	public String Görevi(String b) {
		String b1=b;
		return b1;
	}
	
	
}

class İnsansız extends Uzayaracı{
	
	public int göreveBaşlamaYılı;
	public int göreviBitirmeYılı;
	
	public String Görevi(String c) {
	 	String c1=c;
		return c1;
	}
}


class GezgegenSondalar extends  İnsansız{
	//public String k="";
	public String  bulunduğuGezegeninİsmi; 
	public int bulunduğuGezendeYerdekiHızı;
	public String gezegeniİncele (String k) {
      return k;
		}

}
class DünyaYörügesindekiUydular extends İnsansız{
	public int uyduSayıları;
	public int dünyaYörüngesindekiDolanmaHızı;
	public String uyduTürü;
			
	
	
}

