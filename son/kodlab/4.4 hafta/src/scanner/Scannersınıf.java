package scanner;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Scannersýnýf {
	public static void main(String[] args) {
		//ÖRNEK1
		
		/*System.out.println("inpu a  value:");
		Scanner verial=new Scanner(System.in);
	   
		for(int i=0;i<10;i++) {
			
			String veri1=verial.next();
			System.out.println("dizi" + "[" + i + "]" + veri1);
			
		}*/
		
		//ÖRNEK2
		/*System.out.println("dizinin deðerlerini giriniz: ");
		Scanner s=new Scanner(System.in);
		int dizi[][]=new int[3][3];
        dizi[0][0]=s.nextInt();		
        dizi[0][1]=s.nextInt();
        dizi[0][2]=s.nextInt();		
        dizi[1][0]=s.nextInt();		
        dizi[1][1]=s.nextInt();		
        dizi[1][2]=s.nextInt();		
        dizi[2][0]=s.nextInt();		
        dizi[2][1]=s.nextInt();		
        dizi[2][2]=s.nextInt();		

        for(int i=0;i<3;i++)
        	for(int j=0;j<3;j++)
        {
        	
        	System.out.println("\tdizi" + "[" + i + "] " + "[" + j + "] " + "Deðeri " + dizi[i][j]);
        	
        }*/
		
		//ÖRNEK3
		
		/*String ktt = JOptionPane.showInputDialog("bir sayý gir: ");*/
		
		/*JOptionPane.showMessageDialog(null,"bilgilendirme Mesajý ",	"sonuç",JOptionPane.OK_OPTION);*/
	
		/*int i=0;
		Random apk=new Random();
		int ars=apk.nextInt(10);
		while(true) {

			String tahmin=JOptionPane.showInputDialog("tahmini sayýyý gir: ");
	int t =Integer.parseInt(tahmin);
	
	if(t==ars) {
		
		String mesaj="tahmini sayýyý " + i + "denemede bildiniz";
		JOptionPane.showMessageDialog(null,mesaj,"tebrikler",JOptionPane.CANCEL_OPTION);
		break;
	}
	
	else {
		i++;
	}
	
}*/
		//ÖRNEK4
		/*String sayý1=JOptionPane.showInputDialog("a : deðeri ");
		int a=Integer.parseInt(sayý1);
		String sayý2=JOptionPane.showInputDialog("b : deðeri ");
		int b=Integer.parseInt(sayý2);
		int sonuc = hesapla(a,b);
		JOptionPane.showMessageDialog(null,sonuc,"toplam",JOptionPane.CANCEL_OPTION);
		
		
	}
	static int hesapla(int a,int b)   //ÖRENEK4
	{
		return a+b;}*/
		
		//ÖRNEK 5
		String vizenotu=JOptionPane.showInputDialog("vize notunu gir: ");
		isnt vzn=Integer.parseInt(vizenotu);
		while(vzn<0 || vzn>100) {
		vizenotu =JOptionPane.showInputDialog(null, "hatalý giriþ tekrar deneyiniz.");
		vzn=ýnteger.parseInt(vizenotu);
		}
		String finalortalama=JOptionPane.showInputDialog("vize notunu gir: ");
		int fnl=Integer.parseInt(finalortalama);
		while(fnl<0 || fnl>100) {
			finalortalama =JOptionPane.showInputDialog(null, "hatalý giriþ tekrar deneyiniz.");
			fnl=Integer.parseInt(finalortalama);
			}
		
		Double b=(vzn)*(0.3)+(fnl)* (0.7);
		String sonuc="notunuz: " + b;
		
		JOptionPane.showMessageDialog(null, sonuc ,"ortalama",JOptionPane.PLAIN_MESSAGE );

		
		
	}

	

}
