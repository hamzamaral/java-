package lab;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab2 {

	public static void main(String[] args) {
		String adsoyad , cinsiyet;
		int ya�,y�l, no,al�nankredi;
		float ortalama;
		Scanner oku = new Scanner(System.in);
		
		//BU KISIM KONSOLDAN ALIP KONSOLA YAZMA KISIMI
		/*System.out.println("as soyad ,cinsiyet ya�,no,y�l,ortalama,al�nakredi de�erleini giriniz:");
		adsoyad=oku.next();
		cinsiyet=oku.next();
		ya�=oku.nextInt();
		no=oku.nextInt();
		y�l=oku.nextInt();
		ortalama=oku.nextFloat();
		al�nankredi=oku.nextInt();
		String mesaj="";
		
		mesaj=mesaj + "==========================================";
		mesaj=mesaj + "\n -----------------------";
		mesaj=mesaj + "\nadsoyad   =" + adsoyad + "\t\t\t" + "cinsiyet  =" + cinsiyet;
		mesaj=mesaj + "\nya�       =" + ya�     + "\t\t\t\t" + "no        =" + no;
		mesaj=mesaj + "\ny�l       =" + y�l     + "\t\t\t\t" + "ortalama  =" + ortalama;
		mesaj=mesaj + "\nal�nan kredi=" + al�nankredi    ;
		System.out.println(mesaj);*/
		//ARAY�ZE YAZIP  ARA Y�ZDEN OKUM AKISIM
		String cevap=JOptionPane.showInputDialog("as soyad ,cinsiyet ya�,no,y�l,ortalama,al�nakredi de�erleini giriniz:");
        oku=new Scanner(cevap);
		adsoyad=oku.next();
		cinsiyet=oku.next();
		ya�=oku.nextInt();
		no=oku.nextInt();
		y�l=oku.nextInt();
		ortalama=oku.nextFloat();
		al�nankredi=oku.nextInt();
		String mesaj="";
		
		mesaj=mesaj + "==========================================";
		mesaj=mesaj + "\n -----------------------";
		mesaj=mesaj + "\nadsoyad   =" + adsoyad + "\t\t\t" + "cinsiyet  =" + cinsiyet;
		mesaj=mesaj + "\nya�       =" + ya�     + "\t\t\t\t" + "no        =" + no;
		mesaj=mesaj + "\ny�l       =" + y�l     + "\t\t\t\t" + "ortalama  =" + ortalama;
		mesaj=mesaj + "\nal�nan kredi=" + al�nankredi    ;
		
		JOptionPane.showMessageDialog(null, mesaj);
		
		
		
		
	}

}
