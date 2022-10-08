package kitap.bölüm3.HALIT.we;

 import java.util.Scanner;

 import javax.swing.JOptionPane;

public class Kuten {

	 //private Object system;
	
	public static void main(String[] args) {
		String satýr1="There are two ways of spreading light:";
        String satýr2="To be the candle, or the mirror that reflects it";
        System.out.println(satýr1+"\n\n"+satýr2);//"\n" bir alt satýra geç komutu verir
        
        JOptionPane.showMessageDialog(null, satýr1+ "\n\n" + satýr2);  
		
		
		/*String satýr1="There are two ways of spreading light:";
        String satýr2="To be the candle, or the mirror that reflects it";
       
        System.out.println("\t\t\t\"" + satýr1 + "\n\n" + satýr2  + "\"");
        
        JOptionPane.showMessageDialog(null,"      \"" + satýr1 + "\n\n" + satýr2 + "\"");
		 
		
		int gun,ay,yýl;
		Scanner konsoloku = new Scanner(System.in);//diþarýdan her tür bilgiyi içeri aktarýr
		// BU KISIM KONSOLDAN ALIP KONSOLA YAZMA KISIMI
		System.out.println("Doðum tarihinizi gün ay ve yýl olarak giriniz:");
		gun=konsoloku.nextInt();//nextýnt= girdiðimiz deðeri döndürür.
		ay=konsoloku.nextInt();
		yýl=konsoloku.nextInt();
		
		System.out.println("tebrikler doðum tariiniz:"+ gun + "-" + ay+ "-" + yýl);
		int yas=  2021-yýl;
		 
		System.out.println("(2021-"+yýl+")="+yas+"yaþýndasýnýz");
		//ekrana yazýlmýþ hali  (ARAYÜZE YAZIP  ARA YÜZDEN OKUM AKISIM)
		String cevap=JOptionPane.showInputDialog("Doðum tarihinizi gün ay ve yýl olarak giriniz: ");//showInputDialogun  çýktýsýný strin olark cevap'a atarýz
		//daha sonra cevabý yorumlamam gerek  yaný showInputDialog' girdiðim deðerleri
		konsoloku= new Scanner(cevap);//konsoloku artýk  yei oluþturulan nesnede bilgileri alýr
		gun=konsoloku.nextInt();
		ay=konsoloku.nextInt();
		yýl=konsoloku.nextInt();
		 
		int yas=2021-yýl;
		String mesaj="tebrikler doðum tarihiniz" +gun+ "-" +ay+ "-" +yýl;
		mesaj=mesaj+"\n(2021-"+yýl+")="+yas+"yaþýndaasýnýz";
		JOptionPane.showMessageDialog(null, mesaj);
		//"showInputDialog" inputtan veri okumamýzý saðla
	
		
		int num1,num2,num3;
		Scanner oku=new Scanner(System.in);
		// BU KISIM KONSOLDAN ALIP KONSOLA YAZMA KISIMI
		
		System.out.println("3 sayý giriniz");
		num1=oku.nextInt();
		num2=oku.nextInt();
	    num3=oku.nextInt();
	    
	    String mesaj="";
	    
	    mesaj=num1 + " + " + num2 + " + " + num3  + " = "  + (num1+num2+num3);
	    mesaj=mesaj + "\n" + num1 + " - " + num2 + " - " + num3 + " = " + (num1+num2+num3);
	    mesaj=mesaj + "\n" + num1 + " * " + num2 + " * " + num3 + " = " + (num1+num2+num3);
	    
	    mesaj = mesaj + "\n\n\"num1=(num2+num3)\" eþit deðildir \"num1=num2+num3\"";
	    mesaj=mesaj + "\nispat:\n;
	    
	    mesaj=mesaj + num1 +  " * (" + num2 + " + "  + num3 + ") =" + (num1 * (num2+num3))  + "eþit deðildir" ;
	    mesaj=mesaj + "\t" + num1 + " * " +  + num2 + " + " + num3  + " = " + (num1*num2+num3);
		System.out.println(mesaj);
		
		//ARAYÜZE YAZDIRMA
		
		String cevap=JOptionPane.showInputDialog("ekrana 3 sayý girin:");
		oku = new Scanner(cevap);
		num1=oku.nextInt();
		num2=oku.nextInt();
	    num3=oku.nextInt();
        String mesaj="";
	    
	    mesaj=num1 + " + " + num2 + " + " + num3  + " = "  + (num1+num2+num3);
	    mesaj=mesaj + "\n" + num1 + " - " + num2 + " - " + num3 + " = " + (num1+num2+num3);
	    mesaj=mesaj + "\n" + num1 + " * " + num2 + " * " + num3 + " = " + (num1+num2+num3);
	    
	    mesaj = mesaj + "\n\n\"num1=(num2+num3)\" eþit deðildir \"num1=num2+num3\"";
	    mesaj=mesaj + "\nispat:\n"  ;
	    mesaj=mesaj + num1 +  " * (" + num2 + " + "  + num3 + ") =" + (num1 * (num2+num3))  + "eþit deðildir" ;
	    mesaj=mesaj + "\t" + num1 + " * " +  + num2 + " + " + num3  + " = " + (num1*num2+num3);
		
	    JOptionPane.showMessageDialog(null, mesaj);*/
		
		

		
		
		
		
	}

}

