package farm;

import java.util.ArrayList;

public class AnimalFarm {
	
	private String animalist[]=new String[50];
	private final int capac�ty=50;
	public String String;
	private static int numberOfAnimals=0;//mevcut hayvan say�s�
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
	public int getCapac�ty() {
		return capac�ty;
	}
public  boolean addAnimal(Animal animal)//addAnimal metodu �iftlikte yer var ise verilen hayvan� animalList listesine ekler. Bu
//metot e�er ekleme ba�ar�l� ise true de�ilse false d�ner.
{
	if(count1<capac�ty) {
		setAnimalist(String);
		System.out.println("animalist " + "[" + count1  + "]" + "ba�ar�yla eklenmi�tir : "+"true");
		return true;
	}
	else
	{
		System.out.println("false");
	return false;
	}

}
public void  printAllAnimalGreetings(String a1) //printAllAnimalGreetings metodu animalList listesindeki t�m hayvanlar�n
//sayGreeting metodunu �a��r�r.
{

	
	System.out.println(a1);
}
public void printAllAnimals(String a2) //printAllAnimals metodu animalList listesindeki t�m hayvanlar�n toString
//metodunu �a��rarak ekrana yazar.
{
	System.out.println(a2);
	
}
public void  animalMovements() //animalMovements metodu, instanceof ve casting ile animalList listesindeki t�m
//hayvanlar� kontrol ederek Bird s�n�f�nda ise fly metodunu Mammal s�n�f�nda ise walk
//metodunu �a��r�r.
{
//	if( instanceof Bird) {}

}







}
