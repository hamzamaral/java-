


import java.util.Scanner;

public class ?ali?ma2 {
//static String ad? , soyad?;//(5-18 sat?r) static metodlar icerinde  olmayan bir de?er geri d?nd?r?lemez bu yuzden "static" kullan?l?r
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ad, soyad;//kullanmasakda olur
		de?eral("mehmet","karata?");
		yazd?r();

	}
	static void de?eral(String ad,String soyad)
	{
		ad?=ad;
		soyad?=soyad;
	}
static void yazd?r() {
	System.out.println("tam isim:"+ ad? + " " + soyad?);
}*/
	
		/*public static void main(String[] args) {
			int dizi[] =new int [] {1,4,7};
			islemyap(dizi);
			for (int i:dizi)
				System.out.println(i);
					
		}
		
	static void islemyap(int dizi[])
	{
		for(int i=0;i<3;i++)
			{
			dizi[i]=i*i;
		}
	}*/
	
	/*public static void main(String[] args) {
		
		int k=overloading1(5,6.2);
		System.out.println(k + "\n" );
		System.out.println(overloading1(4,7.3));
		
	}
	
	static int overloading1(int a , double b) {
		return a;
		
	}
	
	static int overloading1(double b,int a) {
		return a;
	}*/
	/*public static void main(String[] args) {
		//recursive
		System.out.println(topla(10));
		
	}
	
	static int topla(int a) {
		int b = 0 ;
		int d = 0 ;
		for(int i=0;i<a+1;i++) {
			d=d+b;
		    b++;
		}
		return d;
		
	}*/
	
	static int  recursive(int a) {
		if (a==0)
			return 0;
		else
		
			return (a + recursive(a-1));
			
	}
	
	public static void main(String[] args) {
		
		System.out.println(recursive(10));
	}
}