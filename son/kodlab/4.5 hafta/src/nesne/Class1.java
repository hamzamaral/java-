package nesne;

public class Class1 {
//örnek1
	
	
	/*static int sayý=0;
	public Class1()
	{
		sayý++;
	}
	
	public static void dongü(Class1 nesne[])
	{
		for(int i=0;i<4;i++) {
			nesne[i] = new Class1();
		}
		
	}
	
	
	public static void main(String[] args) {

		//ÖRNEK1
		Class1 nesne[]=new Class1[4];//nesne dizisi olüþturulur; 
		// nesne oluþturulduðunda ilk olarak ona ait bir yapýcý çaðrýlýr.
		Class1.dongü(nesne);
		System.out.println(sayý + " adet nesne oluþturuldu ");
		
	}*/
	
	//ÖRNEK2
	
	private void kasa ()//private  aahatar keliesi ile tanýmlanan sadeece tanýmlandaðý sýnýf içinde kullanalýlabilir 
	{
		System.out.println("gizli kasa");
	}

	private String belge="gizli";// private deðiþken tanýmlandý.
	
	public static void main(String[] args) {
	
		Class1 d1=new Class1();
		d1.kasa();//d1 nesnesi kasaya ulaþmaya çalýþiyor.
		System.out.println(d1.belge);
	}
		

}
