package kitap.bölüm3;

public class SAYFA77 {
	
	public static void main(String[] args) {
	String ornek="5";
	int yeni1=Integer.valueOf(ornek);//string olarak tanýmlanan
	//deðer valueof ýle int'e çevrilir eðer int'e
	//cevirmeseydik üzerinde iþlem yapamazdýk
	System.out.println(yeni1*yeni1);
	int sayý1=9;
	
	String sayý2=String.valueOf(sayý1);//int deðeri 2  farklý yoldan  
	//stringe çevrilmiþtir
	String sayý3=Integer.toString(sayý1);
	System.out.println(sayý2+" "+sayý3);
	
	

	}

}
