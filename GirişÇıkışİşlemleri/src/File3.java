import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File3 {

	public static void main(String[] args) {
       /* File f=new File("E:\\bilgisayar m 2\\Java\\Giri���k����lemleri\\ornekKlas�r");
        		f.mkdir();//�rnek klosa�r olu�turma yarar.*/
       File f=new File("E:\\bilgisayar m 2\\Java\\Giri���k����lemleri\\veri.txt");
       char veriler[] =new char[(int)f.length()];
       try 
       {
    	   FileReader f2=new FileReader(f);
    	   f2.read(veriler);
    	   String okunan =new String(veriler);
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
