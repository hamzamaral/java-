import java.util.Scanner;

import javax.swing.JOptionPane;

public class Scanners�n�f {

	public static void main(String[] args) {
		
		
		int ilksay�;
		int ikincisay�;
		
		String a =JOptionPane.showInputDialog("ilksay�,ikincisay�");
		 Scanner oku = new Scanner(a);
		 
		ilksay�=oku.nextInt();
		ikincisay�=oku.nextInt();
	//	int c=Integer.parseInt(ilksay�);
	//	int d=Integer.parseInt(ikincisay�);
		int b=ikincisay�+ilksay�;
		/**
		 * Stringi cast etmemiz lazim
		 * 
		 */
		
		
		JOptionPane.showMessageDialog(null,b);
		
	}

}
