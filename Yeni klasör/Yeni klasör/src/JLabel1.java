import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.*;

public class JLabel1 {
	
	public JLabel1() 
	{
		
		super("hamza");
		Container con =getContentPane();
		con.setLayout(new GridLayout());
		JLabel �r1 =new JLabel();
	    �r1.setText("�rnek1");
	
	
	   JLabel �r2 =new JLabel();
	   �r2.setText("�rnek2");
	   JLabel �r3 =new JLabel();
    	�r3.setText(�r1.getText());
	
	
	}		
	

}
