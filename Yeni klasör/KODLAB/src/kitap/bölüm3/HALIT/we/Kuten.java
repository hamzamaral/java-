package kitap.b�l�m3.HALIT.we;

 import java.util.Scanner;

 import javax.swing.JOptionPane;

public class Kuten {

	 //private Object system;
	
	public static void main(String[] args) {
		String sat�r1="There are two ways of spreading light:";
        String sat�r2="To be the candle, or the mirror that reflects it";
        System.out.println(sat�r1+"\n\n"+sat�r2);//"\n" bir alt sat�ra ge� komutu verir
        
        JOptionPane.showMessageDialog(null, sat�r1+ "\n\n" + sat�r2);  
		
		
		/*String sat�r1="There are two ways of spreading light:";
        String sat�r2="To be the candle, or the mirror that reflects it";
       
        System.out.println("\t\t\t\"" + sat�r1 + "\n\n" + sat�r2  + "\"");
        
        JOptionPane.showMessageDialog(null,"      \"" + sat�r1 + "\n\n" + sat�r2 + "\"");
		 
		
		int gun,ay,y�l;
		Scanner konsoloku = new Scanner(System.in);//di�ar�dan her t�r bilgiyi i�eri aktar�r
		// BU KISIM KONSOLDAN ALIP KONSOLA YAZMA KISIMI
		System.out.println("Do�um tarihinizi g�n ay ve y�l olarak giriniz:");
		gun=konsoloku.nextInt();//next�nt= girdi�imiz de�eri d�nd�r�r.
		ay=konsoloku.nextInt();
		y�l=konsoloku.nextInt();
		
		System.out.println("tebrikler do�um tariiniz:"+ gun + "-" + ay+ "-" + y�l);
		int yas=  2021-y�l;
		 
		System.out.println("(2021-"+y�l+")="+yas+"ya��ndas�n�z");
		//ekrana yaz�lm�� hali  (ARAY�ZE YAZIP  ARA Y�ZDEN OKUM AKISIM)
		String cevap=JOptionPane.showInputDialog("Do�um tarihinizi g�n ay ve y�l olarak giriniz: ");//showInputDialogun  ��kt�s�n� strin olark cevap'a atar�z
		//daha sonra cevab� yorumlamam gerek  yan� showInputDialog' girdi�im de�erleri
		konsoloku= new Scanner(cevap);//konsoloku art�k  yei olu�turulan nesnede bilgileri al�r
		gun=konsoloku.nextInt();
		ay=konsoloku.nextInt();
		y�l=konsoloku.nextInt();
		 
		int yas=2021-y�l;
		String mesaj="tebrikler do�um tarihiniz" +gun+ "-" +ay+ "-" +y�l;
		mesaj=mesaj+"\n(2021-"+y�l+")="+yas+"ya��ndaas�n�z";
		JOptionPane.showMessageDialog(null, mesaj);
		//"showInputDialog" inputtan veri okumam�z� sa�la
	
		
		int num1,num2,num3;
		Scanner oku=new Scanner(System.in);
		// BU KISIM KONSOLDAN ALIP KONSOLA YAZMA KISIMI
		
		System.out.println("3 say� giriniz");
		num1=oku.nextInt();
		num2=oku.nextInt();
	    num3=oku.nextInt();
	    
	    String mesaj="";
	    
	    mesaj=num1 + " + " + num2 + " + " + num3  + " = "  + (num1+num2+num3);
	    mesaj=mesaj + "\n" + num1 + " - " + num2 + " - " + num3 + " = " + (num1+num2+num3);
	    mesaj=mesaj + "\n" + num1 + " * " + num2 + " * " + num3 + " = " + (num1+num2+num3);
	    
	    mesaj = mesaj + "\n\n\"num1=(num2+num3)\" e�it de�ildir \"num1=num2+num3\"";
	    mesaj=mesaj + "\nispat:\n;
	    
	    mesaj=mesaj + num1 +  " * (" + num2 + " + "  + num3 + ") =" + (num1 * (num2+num3))  + "e�it de�ildir" ;
	    mesaj=mesaj + "\t" + num1 + " * " +  + num2 + " + " + num3  + " = " + (num1*num2+num3);
		System.out.println(mesaj);
		
		//ARAY�ZE YAZDIRMA
		
		String cevap=JOptionPane.showInputDialog("ekrana 3 say� girin:");
		oku = new Scanner(cevap);
		num1=oku.nextInt();
		num2=oku.nextInt();
	    num3=oku.nextInt();
        String mesaj="";
	    
	    mesaj=num1 + " + " + num2 + " + " + num3  + " = "  + (num1+num2+num3);
	    mesaj=mesaj + "\n" + num1 + " - " + num2 + " - " + num3 + " = " + (num1+num2+num3);
	    mesaj=mesaj + "\n" + num1 + " * " + num2 + " * " + num3 + " = " + (num1+num2+num3);
	    
	    mesaj = mesaj + "\n\n\"num1=(num2+num3)\" e�it de�ildir \"num1=num2+num3\"";
	    mesaj=mesaj + "\nispat:\n"  ;
	    mesaj=mesaj + num1 +  " * (" + num2 + " + "  + num3 + ") =" + (num1 * (num2+num3))  + "e�it de�ildir" ;
	    mesaj=mesaj + "\t" + num1 + " * " +  + num2 + " + " + num3  + " = " + (num1*num2+num3);
		
	    JOptionPane.showMessageDialog(null, mesaj);*/
		
		

		
		
		
		
	}

}

