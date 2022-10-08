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
		JLabel ör1 =new JLabel();
	    ör1.setText("örnek1");
	
	
	   JLabel ör2 =new JLabel();
	   ör2.setText("örnek2");
	   JLabel ör3 =new JLabel();
    	ör3.setText(ör1.getText());
	
	
	}		
	

}
