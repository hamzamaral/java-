import java.io.*;

public class File6 {
	public static void main(String[] args) throws Exception {
		
	       File fs2=new File("E:\\bilgisayar m 2\\Java\\GiriþÇýkýþÝþlemleri\\veri.txt");
	     FileWriter yazdýr=new FileWriter(fs2);
	     BufferedWriter yaz=new  BufferedWriter(yazdýr);
	     yaz.write("bu bir deneme yazýsýdýr .");
	     yaz.flush();// bilgiyi dosyaya yazar
	     yaz.close();
	     
		
		
	}
}
