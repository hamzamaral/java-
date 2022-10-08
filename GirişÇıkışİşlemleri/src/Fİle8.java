import java.io.*;
public class FÝle8 {

	public static void main(String[] args) throws Exception {
		File fs3=new File("E:\\bilgisayar m 2\\Java\\GiriþÇýkýþÝþlemleri\\RandomAccess.txt");
 	   RandomAccessFile nesne = new RandomAccessFile(fs3, "rw");
 	   nesne.writeBytes("java cok güzel");
 	   nesne.close();
 	   
 	   
 	   

	}

}
