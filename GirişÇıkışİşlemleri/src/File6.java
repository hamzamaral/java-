import java.io.*;

public class File6 {
	public static void main(String[] args) throws Exception {
		
	       File fs2=new File("E:\\bilgisayar m 2\\Java\\Giri���k����lemleri\\veri.txt");
	     FileWriter yazd�r=new FileWriter(fs2);
	     BufferedWriter yaz=new  BufferedWriter(yazd�r);
	     yaz.write("bu bir deneme yaz�s�d�r .");
	     yaz.flush();// bilgiyi dosyaya yazar
	     yaz.close();
	     
		
		
	}
}
