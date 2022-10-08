package srclm;

import amk.lale.Kutu;

public class KutuDemo {
	public static void main(String[] args) {
		//Kutu kutu1 = new Kutu(2.5f, 3.7f, 6.1f);
		//float hacim = kutu1.hacimHesapla();
		//System.out.println("1. Kutunun hacmi: " + hacim);
	
    	/*Kutu kutu2 = new Kutu();
		float hacim = kutu2.hacimHesapla();
		System.out.println("2. Kutunun hacmi: " + hacim);*/
		
		/*Kutu kutu3 = new Kutu(3.0f);
		float hacim = kutu3.hacimHesapla();
		System.out.println("3. Kutunun hacmi: " + hacim);*/
		
		/*Kutu kutu4 = new Kutu(kutu1);
		float hacim = kutu4.hacimHesapla();
		System.out.println("4. Kutunun hacmi: " + hacim);*/
		
		/*kutu1.genislik = 1;
		hacim = kutu1.hacimHesapla();
		System.out.println("1. Kutunun hacmi: " + hacim);
	    hacim = kutu4.hacimHesapla();
		System.out.println("4.2 Kutunun hacmi: " + hacim);*/
		
		Kutu benimKutum = new Kutu(-7, 1, 1);
		System.out.println("Hacim: " + benimKutum.hacimHesapla());

		benimKutum.setGenislik(8.3F);
		System.out.println("Hacim: " + benimKutum.hacimHesapla());

		benimKutum.setGenislik(-3F);
		System.out.println("Hacim: " + benimKutum.hacimHesapla());
		
	}
}
