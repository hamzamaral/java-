package src.bankAccount;

import java.util.Scanner;

public class Bankamoundttest {

	public static void main(String[] args) {
		BankAccount Bankact1 =new BankAccount("halil maral",50.00);
		BankAccount Bankact2 =new BankAccount("hamza maral",-15.87);
        System.out.println("nesne 1'in ilk bakiyesi :"+Bankact1.getBalance() );
        System.out.println("nesne 2'in ilk bakiyesi :"+Bankact2.getBalance() );

        
        Scanner input=new Scanner(System.in);
        System.out.println("\n BankAct1'den depozito tutar�n� giriniz:");
        double deositAmount=input.nextDouble();
        System.out.println("\n depozit miktar�n�z+depositAmount"+deositAmount);
        Bankact1.deposit(deositAmount);
        
        System.out.println("\n nesne1'in ismi:"+ Bankact1.getName()+ "bakiyesi:"+ Bankact1.getBalance());//getName() ile biz private fonsiyonun i�indeki de�eri okuruz
        System.out.println("\n nesne2'in ismi:"+ Bankact2.getName()+ "bakiyesi:"+ Bankact2.getBalance());

        System.out.println("\n BankAct2'den depozito tutar�n� giriniz:");
         deositAmount=input.nextDouble();//ba�ta double olark(sat�r15) tan�mland��� i�in tekrar double kullan�lmas� gerekmez. hepsi hesaplan��
        System.out.println("\n depozit miktar�n�z + depositAmount"+deositAmount);
        Bankact2.deposit(deositAmount);
        
        System.out.println("\n nesne1'in ismi:"+ Bankact1.getName()+ "\tbakiyesi:"+ Bankact1.getBalance());
        System.out.println("\n nesne2'in ismi:"+ Bankact2.getName()+ "\tbakiyesi:"+ Bankact2.getBalance());
        
	}

}
