import java.io.*;
public class F�le8 {

	public static void main(String[] args) throws Exception {
		File fs3=new File("E:\\bilgisayar m 2\\Java\\Giri���k����lemleri\\RandomAccess.txt");
 	   RandomAccessFile nesne = new RandomAccessFile(fs3, "rw");
 	   nesne.writeBytes("java cok g�zel");
 	   nesne.close();
 	   
 	   
 	   

	}

}
