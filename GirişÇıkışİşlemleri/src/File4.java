import java.io.*;

import javax.print.DocFlavor.STRING;

public class File4 {
	
	public static void main(String[] args) {
	       /* File f=new File("E:\\bilgisayar m 2\\Java\\Giri���k����lemleri\\ornekKlas�r");
	        		f.mkdir();//�rnek klosa�r olu�turma yarar.*/
	       File f1=new File("E:\\bilgisayar m 2\\Java\\Giri���k����lemleri\\veri2.txt");
	       
	   
	       try 
	       {
	    	   
	    	   
	    	   f1.createNewFile();
	    	   //   yazma i�lemleri
	      
	       FileWriter yaz=new FileWriter(f1);
	       String yazd�r="sen itsin o�lum sen adam  de�ilsin ";
	       yaz.write(yazd�r);
	       yaz.close();
	       char veriler1[] =new char[(int)f1.length()];
	    	   FileReader f2=new FileReader(f1);
	    	   f2.read(veriler1);
	    	   String okunan=String.copyValueOf(veriler1);
	    	   //String okunan =new String(veriler1);
	    	   System.out.println(okunan);
	       }
	       catch (FileNotFoundException e) {
	    	   
	    	   e.printStackTrace();
	    	   
	       }
	       catch (Exception e) {

	       e.printStackTrace();
	       }
	       

		
			
		}

	
}
