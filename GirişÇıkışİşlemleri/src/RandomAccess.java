import java.io.*;

public class RandomAccess {

	public static void main(String[] args)  {
		File fs3=new File("E:\\bilgisayar m 2\\Java\\Giri���k����lemleri\\RandomAccess.txt");
	    
	    
	    
	    
		
		   try 
	       
	       {
	    	   
	    	   RandomAccessFile nesne = new RandomAccessFile(fs3, "rw");
	    byte bt=nesne.readByte();
	    System.out.println((char)bt);
	    String sat�r=nesne.readLine();
	    System.out.println(sat�r);
	    nesne.seek(0);
	    String sat�r1=nesne.readLine();
	    System.out.println(sat�r1);
	    nesne.seek(9);
	    byte ns[]="ensar".getBytes();
	    nesne.write(ns);
	    nesne.seek(0);
	  sat�r1=nesne.readLine();
	  
	  System.out.println(sat�r1);
	       }
	       
	       catch (Exception e) {
			// TODO: handle exception
		}
	}

}
