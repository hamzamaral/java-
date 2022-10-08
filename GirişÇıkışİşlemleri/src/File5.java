import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class File5 {
	public static void main(String[] args) {
		
		//Buffer
		try {
	       File fs1=new File("E:\\bilgisayar m 2\\Java\\GiriþÇýkýþÝþlemleri\\veri2.txt");
	       FileReader itibar=new FileReader(fs1);
	       BufferedReader kes=new BufferedReader(itibar);
	       String oku=kes.readLine();
	       System.out.println(oku);
	       kes.close();
		}
		catch (Exception e) {

		e.getStackTrace();
		}
		
		
	}
}
