
/*import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.
import java.awt.
import java.awt.
import java.awt.
import java.awt.
import java.awt.*/

/*import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;*/

import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jbutton extends  JFrame implements ActionListener{

	
	JLabel etiket =new JLabel("sonu� buraya yaz�lacak");
	
	
	
	
	public static void main(String[] args) {

		EventQueue.invokeLater(
				new  Runnable() {
					
					@Override
					public void run() {
						try {
							Jbutton �r=new Jbutton();
							�r.setVisible(true);
						}
						catch (Exception e) {
							
							e.printStackTrace();
						
						
						}
						
						
					}
				});
		
		
	}

}
