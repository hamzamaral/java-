import java.io.*;
public class Fİle8 {

	public static void main(String[] args) throws Exception {
		File fs3=new File("E:\\bilgisayar m 2\\Java\\GirişÇıkışİşlemleri\\RandomAccess.txt");
 	   RandomAccessFile nesne = new RandomAccessFile(fs3, "rw");
 	   nesne.writeBytes("java cok güzel");
 	   nesne.close();
 	   
 	   
 	   

	}

}
