import java.util.Scanner;

import javax.swing.JOptionPane;

public class Scannersýnýf {

	public static void main(String[] args) {
		
		
		int ilksayý;
		int ikincisayý;
		
		String a =JOptionPane.showInputDialog("ilksayý,ikincisayý");
		 Scanner oku = new Scanner(a);
		 
		ilksayý=oku.nextInt();
		ikincisayý=oku.nextInt();
	//	int c=Integer.parseInt(ilksayý);
	//	int d=Integer.parseInt(ikincisayý);
		int b=ikincisayý+ilksayý;
		/**
		 * Stringi cast etmemiz lazim
		 * 
		 */
		
		
		JOptionPane.showMessageDialog(null,b);
		
	}

}
