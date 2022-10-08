package array;

import java.lang.Exception;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionLab {
	
	public static ArrayList<String> nameList = new ArrayList<>();
	
	public static void dosyaIsim() throws FileNotFoundException {
		PrintWriter writer = new PrintWriter("benimDosyam.txt");
		writer.print("Nihal ALTUNTAS");
		writer.close();
	}
	
	public static int tamSayiInput() {
		int tamsayi = 0;
		Scanner scan = new Scanner(System.in);
		boolean tamsayiMi = false;
		
		while(!tamsayiMi) {
			try {
				System.out.println("Lütfen bir tamsayý giriniz: ");
				tamsayi = scan.nextInt();
				tamsayiMi = true;
			} catch(InputMismatchException e) {
				System.err.println("Hatalý Giriþ. Tamsayý deðil. Girilen deger: " + scan.next());
			}
		}
		
		return tamsayi;
	}
	
	public static void addName(String name) throws RecurredNameException {
		for(int i = 0; i < nameList.size(); i++) {
			if(name.equals(nameList.get(i))) {
				throw new RecurredNameException(name, "Listede bu isim zaten mevcut!!!");
			}
		}
		nameList.add(name);
	}

	public static void main(String[] args) {

		try {
			dosyaIsim();
			addName("Nihal");
			addName("Zuhal");
			addName("Handan");
			addName("Nihal");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (RecurredNameException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getName());
		}
		
		int x = tamSayiInput();
	System.out.println("Tebrikler, tamsayý girdiniz :)");
	System.out.println("Girilen tamsayý: " + x);
		
		
	}

}
