package scanner;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Scanners�n�f {
	public static void main(String[] args) {
		//�RNEK1
		
		/*System.out.println("inpu a  value:");
		Scanner verial=new Scanner(System.in);
	   
		for(int i=0;i<10;i++) {
			
			String veri1=verial.next();
			System.out.println("dizi" + "[" + i + "]" + veri1);
			
		}*/
		
		//�RNEK2
		/*System.out.println("dizinin de�erlerini giriniz: ");
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
        	
        	System.out.println("\tdizi" + "[" + i + "] " + "[" + j + "] " + "De�eri " + dizi[i][j]);
        	
        }*/
		
		//�RNEK3
		
		/*String ktt = JOptionPane.showInputDialog("bir say� gir: ");*/
		
		/*JOptionPane.showMessageDialog(null,"bilgilendirme Mesaj� ",	"sonu�",JOptionPane.OK_OPTION);*/
	
		/*int i=0;
		Random apk=new Random();
		int ars=apk.nextInt(10);
		while(true) {

			String tahmin=JOptionPane.showInputDialog("tahmini say�y� gir: ");
	int t =Integer.parseInt(tahmin);
	
	if(t==ars) {
		
		String mesaj="tahmini say�y� " + i + "denemede bildiniz";
		JOptionPane.showMessageDialog(null,mesaj,"tebrikler",JOptionPane.CANCEL_OPTION);
		break;
	}
	
	else {
		i++;
	}
	
}*/
		//�RNEK4
		/*String say�1=JOptionPane.showInputDialog("a : de�eri ");
		int a=Integer.parseInt(say�1);
		String say�2=JOptionPane.showInputDialog("b : de�eri ");
		int b=Integer.parseInt(say�2);
		int sonuc = hesapla(a,b);
		JOptionPane.showMessageDialog(null,sonuc,"toplam",JOptionPane.CANCEL_OPTION);
		
		
	}
	static int hesapla(int a,int b)   //�RENEK4
	{
		return a+b;}*/
		
		//�RNEK 5
		String vizenotu=JOptionPane.showInputDialog("vize notunu gir: ");
		isnt vzn=Integer.parseInt(vizenotu);
		while(vzn<0 || vzn>100) {
		vizenotu =JOptionPane.showInputDialog(null, "hatal� giri� tekrar deneyiniz.");
		vzn=�nteger.parseInt(vizenotu);
		}
		String finalortalama=JOptionPane.showInputDialog("vize notunu gir: ");
		int fnl=Integer.parseInt(finalortalama);
		while(fnl<0 || fnl>100) {
			finalortalama =JOptionPane.showInputDialog(null, "hatal� giri� tekrar deneyiniz.");
			fnl=Integer.parseInt(finalortalama);
			}
		
		Double b=(vzn)*(0.3)+(fnl)* (0.7);
		String sonuc="notunuz: " + b;
		
		JOptionPane.showMessageDialog(null, sonuc ,"ortalama",JOptionPane.PLAIN_MESSAGE );

		
		
	}

	

}
