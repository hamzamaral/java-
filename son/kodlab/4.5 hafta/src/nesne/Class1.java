package nesne;

public class Class1 {
//�rnek1
	
	
	/*static int say�=0;
	public Class1()
	{
		say�++;
	}
	
	public static void dong�(Class1 nesne[])
	{
		for(int i=0;i<4;i++) {
			nesne[i] = new Class1();
		}
		
	}
	
	
	public static void main(String[] args) {

		//�RNEK1
		Class1 nesne[]=new Class1[4];//nesne dizisi ol��turulur; 
		// nesne olu�turuldu�unda ilk olarak ona ait bir yap�c� �a�r�l�r.
		Class1.dong�(nesne);
		System.out.println(say� + " adet nesne olu�turuldu ");
		
	}*/
	
	//�RNEK2
	
	private void kasa ()//private  aahatar keliesi ile tan�mlanan sadeece tan�mlanda�� s�n�f i�inde kullanal�labilir 
	{
		System.out.println("gizli kasa");
	}

	private String belge="gizli";// private de�i�ken tan�mland�.
	
	public static void main(String[] args) {
	
		Class1 d1=new Class1();
		d1.kasa();//d1 nesnesi kasaya ula�maya �al��iyor.
		System.out.println(d1.belge);
	}
		

}
