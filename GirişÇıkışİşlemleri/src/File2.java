import java.io.File;


public class File2 {

	public static void main(String[] args) {

		File f=new File("E:\\bilgisayar m 2\\Java\\GirişÇıkışİşlemleri\\ornek.txt");
		
		System.out.println("txt dosyasını ismi : "+f.getName());
		System.out.println("txt dosyasının yolu : "+f.getAbsolutePath());
		//System.out.println("txt dosyasını silme : "+f.delete());
		System.out.println("txt dosyası var mı? kontrol et : "+f.exists());
		//System.out.println("txt dosyasınıb ismi : "+);
		
	}

}
