import java.io.*;

public class File7 {
	public static void main(String[] args) throws Exception {
		
	       File fs2=new File("E:\\bilgisayar m 2\\Java\\GiriþÇýkýþÝþlemleri\\Bufferedoutput.txt");
	       try 
	       
	       {
	    	   fs2.createNewFile();
	    	    FileOutputStream yazdýr=new  FileOutputStream(fs2);
	    	    BufferedOutputStream yaz =new BufferedOutputStream(yazdýr);
	    	    byte[] yrk="küzi kera pýr haþa   .".getBytes();
	     yaz.write(yrk);
	     yaz.flush();// bilgiyi dosyaya yazar
	     yaz.close();
	    	   
	       }
	       
	       catch (Exception e) {
			// TODO: handle exception
		}
	    
	     
		
		
	}
}
