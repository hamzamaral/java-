package kitap.b�l�m3;

public class SAYFA77 {
	
	public static void main(String[] args) {
	String ornek="5";
	int yeni1=Integer.valueOf(ornek);//string olarak tan�mlanan
	//de�er valueof �le int'e �evrilir e�er int'e
	//cevirmeseydik �zerinde i�lem yapamazd�k
	System.out.println(yeni1*yeni1);
	int say�1=9;
	
	String say�2=String.valueOf(say�1);//int de�eri 2  farkl� yoldan  
	//stringe �evrilmi�tir
	String say�3=Integer.toString(say�1);
	System.out.println(say�2+" "+say�3);
	
	

	}

}
