package string;

import java.util.Scanner;

public class StringS�n�f� {
 
	public static void main(String klnkln[]) {
		Scanner scr =new Scanner(System.in);
	    String pl=scr.next();
    	StringBuffer s=new StringBuffer();
	   StringBuffer ab= s.append(pl);
	  s.reverse();
	  if(s.reverse()==ab)
	  {
		  
		  System.out.println("metin palindormedir :"  + pl.toLowerCase());
	  }
	
	  else
	  {
		  System.out.println("metin palindorme de�il. :" + pl.toUpperCase());
	  }
	
	
	}
	
	
	
	
}
