import java.io.*;

public class File7 {
	public static void main(String[] args) throws Exception {
		
	       File fs2=new File("E:\\bilgisayar m 2\\Java\\Giri���k����lemleri\\Bufferedoutput.txt");
	       try 
	       
	       {
	    	   fs2.createNewFile();
	    	    FileOutputStream yazd�r=new  FileOutputStream(fs2);
	    	    BufferedOutputStream yaz =new BufferedOutputStream(yazd�r);
	    	    byte[] yrk="k�zi kera p�r ha�a   .".getBytes();
	     yaz.write(yrk);
	     yaz.flush();// bilgiyi dosyaya yazar
	     yaz.close();
	    	   
	       }
	       
	       catch (Exception e) {
			// TODO: handle exception
		}
	    
	     
		
		
	}
}
