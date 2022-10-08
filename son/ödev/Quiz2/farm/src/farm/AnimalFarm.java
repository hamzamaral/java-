package farm;

import java.util.ArrayList;

public class AnimalFarm {
	
	private String animalist[]=new String[50];
	private final int capacýty=50;
	public String String;
	private static int numberOfAnimals=0;//mevcut hayvan sayýsý
	public static int count1=-1;
	

	
public AnimalFarm() {
}

public String getAnimalist() {  
		return animalist[count1];
	}
	public void setAnimalist(String string) {
		this.animalist[count1] = string;
	}
	public static int getNumberOfAnimals() {
		return numberOfAnimals;
	}
	public static void setNumberOfAnimals(int numberOfAnimals) {
		AnimalFarm.numberOfAnimals = numberOfAnimals;
	}
	public int getCapacýty() {
		return capacýty;
	}
public  boolean addAnimal(Animal animal)//addAnimal metodu çiftlikte yer var ise verilen hayvaný animalList listesine ekler. Bu
//metot eðer ekleme baþarýlý ise true deðilse false döner.
{
	if(count1<capacýty) {
		setAnimalist(String);
		System.out.println("animalist " + "[" + count1  + "]" + "baþarýyla eklenmiþtir : "+"true");
		return true;
	}
	else
	{
		System.out.println("false");
	return false;
	}

}
public void  printAllAnimalGreetings(String a1) //printAllAnimalGreetings metodu animalList listesindeki tüm hayvanlarýn
//sayGreeting metodunu çaðýrýr.
{

	
	System.out.println(a1);
}
public void printAllAnimals(String a2) //printAllAnimals metodu animalList listesindeki tüm hayvanlarýn toString
//metodunu çaðýrarak ekrana yazar.
{
	System.out.println(a2);
	
}
public void  animalMovements() //animalMovements metodu, instanceof ve casting ile animalList listesindeki tüm
//hayvanlarý kontrol ederek Bird sýnýfýnda ise fly metodunu Mammal sýnýfýnda ise walk
//metodunu çaðýrýr.
{
//	if( instanceof Bird) {}

}







}
