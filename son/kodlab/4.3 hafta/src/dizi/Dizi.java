package dizi;

import java.util.Arrays;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;//�RNEK5*/

//import java.util.Arrays;
//import java.util.Scanner;

public class Dizi {

	public static void main(String[] args) {
//�RNEK 1
		/*int dizi[];//int dizi[] = new int[5];
		dizi = new int[] {1,2,3,4,5};
		for(int i :dizi)
			System.out.println("dizi" + "[" + i + "]" + "de�eri:" + dizi[i]);*/
		
		//�RNEK2
		
		/*Object [] dizi =new Object[3];// object dizi syesinde varkl� de�iken tipteri bir arada kullanabiliyoruz
		dizi[0]=0;
		dizi[1]=1;
		dizi[2]="adana";
		for(int i=0;i<3;i++) {
			System.out.println(dizi[i]);
			}
		System.out.println( dizi.length);*/
		
		//�RNEK3 D�Z� KOPYALAMA
		
	
		/*int dizi1[]=new int[4];
		for(int i=0;i<dizi1.length;i++)
		   dizi1[i]=i+i;
		int dizi2[]=new int[dizi1.length];
		for(int i=0;i<dizi1.length;i++)
			dizi2[i]=dizi1[i];
		for(int i=0;i<dizi1.length;i++)
			System.out.println(dizi2[i]);*/
		
		//�RENK SYSTEM.ARRAYCOPY ve Array.sort METODU
		
		/*int [] dizi1 = new int[]{5,6,7,2,8,9,1};
		Arrays.sort(dizi1,2,5);//sadece 2'den 5'e kadar olan konumlar� s�ralay�n�z.
		int dizi2[]=new int [7];
		System.arraycopy(dizi1, 0, dizi2, 0, 7);//haz�r medod
		for (int i=0;i<dizi2.length;i++)
			System.out.println(dizi2[i]);*/
		   
		//�RNEK4 �K� BOYUTLU D�Z�LER
	
	/*	int dizi[][]=new int [3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				dizi[i][j]=i+j;
				System.out.println(dizi[i][j]);
			}
			
		}*/
		
		
		//�RNEK5 
		/*String dizi1[]= {"hamza","halil","ibrahim","maral"};
		Integer dizi2[]= {12,23,34,45};//dizilei olu�turduk
		
		List listeyap�s�=new ArrayList();
		List listeyap�s�1=new ArrayList();//liste yap�lar�n� olusturduk
		
		listeyap�s�=Arrays.asList(dizi1);
		listeyap�s�1=Arrays.asList(dizi2);//aslist metodu ile liste yap�s�na cevrildi
		
		System.out.println(listeyap�s�);
		System.out.println(listeyap�s�1);
		
		for(int i=0;i<5;i++)
		System.out.println(listeyap�s�.get(i));*/
		
		//�RNEK6 ARRAY D�Z�S�
		
		
		
		/*char dizi[]= {'m','u','h','a','m','m','e','t'};
		char yenidizi[]= {};
		System.out.println("kopyalanacak dizi: ");
		for(int i=0;i<dizi.length;i++)
		{
			System.out.println(dizi[i]);
		}
		
		yenidizi=Arrays.copyOf(dizi,3);// kaynak dizide beirledi�imiz kadar eleman kopyalad�k
		
		System.out.println("kopyalama i�leminden sonra olu�an dizi: " );
		
		for(int j=0;j<yenidizi.length;j++) {
			System.out.println(yenidizi[j]);
		}*/
			
		
		//�RNEK7
		
		
		int dizi[]= {1,1,1,1,1,1,1};
		int dizi1[]= {0,0,0,0,0,0,0};
		
		Arrays.fill(dizi,5);//dizinin tamam�na 5 de�erini ekle
		Arrays.fill(dizi1,2,4,3);//2'den 5'e kadar olan indixlere 3 de�eriyle change yap
		
		for(int i=0;i<dizi.length;i++) {
			System.out.println("dizi[" +  i + "] " +  dizi[i]);
		}
		
		for(int j=0;j<dizi1.length;j++) {
			
			System.out.println("dizi[" + j + "]" +dizi1[j]);
			
		}
	}

	

}
