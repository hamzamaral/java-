import java.io.*;

public class RandomAccess {

	public static void main(String[] args)  {
		File fs3=new File("E:\\bilgisayar m 2\\Java\\GiriþÇýkýþÝþlemleri\\RandomAccess.txt");
	    
	    
	    
	    
		
		   try 
	       
	       {
	    	   
	    	   RandomAccessFile nesne = new RandomAccessFile(fs3, "rw");
	    byte bt=nesne.readByte();
	    System.out.println((char)bt);
	    String satýr=nesne.readLine();
	    System.out.println(satýr);
	    nesne.seek(0);
	    String satýr1=nesne.readLine();
	    System.out.println(satýr1);
	    nesne.seek(9);
	    byte ns[]="ensar".getBytes();
	    nesne.write(ns);
	    nesne.seek(0);
	  satýr1=nesne.readLine();
	  
	  System.out.println(satýr1);
	       }
	       
	       catch (Exception e) {
			// TODO: handle exception
		}
	}

}
