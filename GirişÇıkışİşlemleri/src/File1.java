import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {

		File f=new File("E:\\bilgisayar m 2\\Java\\GirişÇıkışİşlemleri\\ornek.txt");
		try 
		{
		
			f.createNewFile();//yeni bir dosya oluşturuldu
			
		}
		catch(IOException e) 
		{
			
			e.printStackTrace();
			
		}
	}

}
