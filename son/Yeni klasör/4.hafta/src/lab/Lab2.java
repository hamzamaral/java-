package lab;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab2 {

	public static void main(String[] args) {
		String adsoyad , cinsiyet;
		int yaþ,yýl, no,alýnankredi;
		float ortalama;
		Scanner oku = new Scanner(System.in);
		
		//BU KISIM KONSOLDAN ALIP KONSOLA YAZMA KISIMI
		/*System.out.println("as soyad ,cinsiyet yaþ,no,yýl,ortalama,alýnakredi deðerleini giriniz:");
		adsoyad=oku.next();
		cinsiyet=oku.next();
		yaþ=oku.nextInt();
		no=oku.nextInt();
		yýl=oku.nextInt();
		ortalama=oku.nextFloat();
		alýnankredi=oku.nextInt();
		String mesaj="";
		
		mesaj=mesaj + "==========================================";
		mesaj=mesaj + "\n -----------------------";
		mesaj=mesaj + "\nadsoyad   =" + adsoyad + "\t\t\t" + "cinsiyet  =" + cinsiyet;
		mesaj=mesaj + "\nyaþ       =" + yaþ     + "\t\t\t\t" + "no        =" + no;
		mesaj=mesaj + "\nyýl       =" + yýl     + "\t\t\t\t" + "ortalama  =" + ortalama;
		mesaj=mesaj + "\nalýnan kredi=" + alýnankredi    ;
		System.out.println(mesaj);*/
		//ARAYÜZE YAZIP  ARA YÜZDEN OKUM AKISIM
		String cevap=JOptionPane.showInputDialog("as soyad ,cinsiyet yaþ,no,yýl,ortalama,alýnakredi deðerleini giriniz:");
        oku=new Scanner(cevap);
		adsoyad=oku.next();
		cinsiyet=oku.next();
		yaþ=oku.nextInt();
		no=oku.nextInt();
		yýl=oku.nextInt();
		ortalama=oku.nextFloat();
		alýnankredi=oku.nextInt();
		String mesaj="";
		
		mesaj=mesaj + "==========================================";
		mesaj=mesaj + "\n -----------------------";
		mesaj=mesaj + "\nadsoyad   =" + adsoyad + "\t\t\t" + "cinsiyet  =" + cinsiyet;
		mesaj=mesaj + "\nyaþ       =" + yaþ     + "\t\t\t\t" + "no        =" + no;
		mesaj=mesaj + "\nyýl       =" + yýl     + "\t\t\t\t" + "ortalama  =" + ortalama;
		mesaj=mesaj + "\nalýnan kredi=" + alýnankredi    ;
		
		JOptionPane.showMessageDialog(null, mesaj);
		
		
		
		
	}

}
