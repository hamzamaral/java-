import java.io.*;

public class File6 {
	public static void main(String[] args) throws Exception {
		
	       File fs2=new File("E:\\bilgisayar m 2\\Java\\GirişÇıkışİşlemleri\\veri.txt");
	     FileWriter yazdır=new FileWriter(fs2);
	     BufferedWriter yaz=new  BufferedWriter(yazdır);
	     yaz.write("bu bir deneme yazısıdır .");
	     yaz.flush();// bilgiyi dosyaya yazar
	     yaz.close();
	     
		
		
	}
}
