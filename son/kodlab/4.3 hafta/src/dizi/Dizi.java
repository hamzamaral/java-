package dizi;

import java.util.Arrays;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;//ÖRNEK5*/

//import java.util.Arrays;
//import java.util.Scanner;

public class Dizi {

	public static void main(String[] args) {
//ÖRNEK 1
		/*int dizi[];//int dizi[] = new int[5];
		dizi = new int[] {1,2,3,4,5};
		for(int i :dizi)
			System.out.println("dizi" + "[" + i + "]" + "deðeri:" + dizi[i]);*/
		
		//ÖRNEK2
		
		/*Object [] dizi =new Object[3];// object dizi syesinde varklý deðiken tipteri bir arada kullanabiliyoruz
		dizi[0]=0;
		dizi[1]=1;
		dizi[2]="adana";
		for(int i=0;i<3;i++) {
			System.out.println(dizi[i]);
			}
		System.out.println( dizi.length);*/
		
		//ÖRNEK3 DÝZÝ KOPYALAMA
		
	
		/*int dizi1[]=new int[4];
		for(int i=0;i<dizi1.length;i++)
		   dizi1[i]=i+i;
		int dizi2[]=new int[dizi1.length];
		for(int i=0;i<dizi1.length;i++)
			dizi2[i]=dizi1[i];
		for(int i=0;i<dizi1.length;i++)
			System.out.println(dizi2[i]);*/
		
		//ÖRENK SYSTEM.ARRAYCOPY ve Array.sort METODU
		
		/*int [] dizi1 = new int[]{5,6,7,2,8,9,1};
		Arrays.sort(dizi1,2,5);//sadece 2'den 5'e kadar olan konumlarý sýralayýnýz.
		int dizi2[]=new int [7];
		System.arraycopy(dizi1, 0, dizi2, 0, 7);//hazýr medod
		for (int i=0;i<dizi2.length;i++)
			System.out.println(dizi2[i]);*/
		   
		//ÖRNEK4 ÝKÝ BOYUTLU DÝZÝLER
	
	/*	int dizi[][]=new int [3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				dizi[i][j]=i+j;
				System.out.println(dizi[i][j]);
			}
			
		}*/
		
		
		//ÖRNEK5 
		/*String dizi1[]= {"hamza","halil","ibrahim","maral"};
		Integer dizi2[]= {12,23,34,45};//dizilei oluþturduk
		
		List listeyapýsý=new ArrayList();
		List listeyapýsý1=new ArrayList();//liste yapýlarýný olusturduk
		
		listeyapýsý=Arrays.asList(dizi1);
		listeyapýsý1=Arrays.asList(dizi2);//aslist metodu ile liste yapýsýna cevrildi
		
		System.out.println(listeyapýsý);
		System.out.println(listeyapýsý1);
		
		for(int i=0;i<5;i++)
		System.out.println(listeyapýsý.get(i));*/
		
		//ÖRNEK6 ARRAY DÝZÝSÝ
		
		
		
		/*char dizi[]= {'m','u','h','a','m','m','e','t'};
		char yenidizi[]= {};
		System.out.println("kopyalanacak dizi: ");
		for(int i=0;i<dizi.length;i++)
		{
			System.out.println(dizi[i]);
		}
		
		yenidizi=Arrays.copyOf(dizi,3);// kaynak dizide beirlediðimiz kadar eleman kopyaladýk
		
		System.out.println("kopyalama iþleminden sonra oluþan dizi: " );
		
		for(int j=0;j<yenidizi.length;j++) {
			System.out.println(yenidizi[j]);
		}*/
			
		
		//ÖRNEK7
		
		
		int dizi[]= {1,1,1,1,1,1,1};
		int dizi1[]= {0,0,0,0,0,0,0};
		
		Arrays.fill(dizi,5);//dizinin tamamýna 5 deðerini ekle
		Arrays.fill(dizi1,2,4,3);//2'den 5'e kadar olan indixlere 3 deðeriyle change yap
		
		for(int i=0;i<dizi.length;i++) {
			System.out.println("dizi[" +  i + "] " +  dizi[i]);
		}
		
		for(int j=0;j<dizi1.length;j++) {
			
			System.out.println("dizi[" + j + "]" +dizi1[j]);
			
		}
	}

	

}
