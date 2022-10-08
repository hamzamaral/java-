package farm;

import java.util.Stack;

public class Test {



	public static void main(String[] args) {

	Chicken tvk =new Chicken("tvk1", 1);
	tvk.setAnimalist(" tvk1");
	System.out.println("\nyaþ: " + tvk.getAge());
	System.out.println( " isim :"  + tvk.getAnimalist());
	tvk.addAnimal(tvk);
	tvk.sayGreeting();
	tvk.printAllAnimalGreetings("printAllAnimalGreetings metodu saGreetingi çaðýrdý : "+tvk.a1);
	tvk.toString();
	tvk.printAllAnimals("toString metodu çaðrýldý : "+tvk.a2);
	tvk.setLegNumber(2);
	System.out.println("ayak sayýsý : " + tvk.getLegNumber());
	System.out.println("-------------------------------------------------------------------------------------");
	
	Chicken tvk2 =new Chicken("\n" +"tvk2", 2);
	tvk2.setAnimalist("tvk2");
	System.out.println("\nyaþ: " + tvk2.getAge());
	System.out.println( tvk2.getAnimalist());
	tvk2.addAnimal(tvk2);
	tvk2.sayGreeting();
	tvk2.printAllAnimalGreetings("printAllAnimalGreetings metodu saGreetingi çaðýrdý : "+tvk2.a1);
	tvk2.toString();
	tvk2.printAllAnimals("toString metodu çaðrýldý : "+tvk2.a2);
	tvk2.setLegNumber(2);
	System.out.println("ayak sayýsý : " + tvk2.getLegNumber());
	System.out.println("-------------------------------------------------------------------------------------");

	
	
	Horse at=new Horse("at", 1);
	at.setAnimalist("at");
	at.getAge();
	System.out.println("\nyaþ: " + at.getAge());
    System.out.println( at.getAnimalist());
	at.addAnimal(at);
	at.sayGreeting();
	at.printAllAnimalGreetings("printAllAnimalGreetings metodu saGreetingi çaðýrdý :  "+at.a1);
	at.toString();
	at.printAllAnimals("toString metodu çaðrýldý : "+at.a2);
	at.setLegNumber(4);
	System.out.println("ayak sayýsý : " + at.getLegNumber());
	System.out.println("-------------------------------------------------------------------------------------");
	
	
	Horse at2=new Horse("at2", 3);
	at2.setAnimalist("at2");
	System.out.println("\n yaþ: " + at2.getAge());
	System.out.println( at2.getAnimalist());
	at2.addAnimal(at2);
	at2.sayGreeting();
	at2.printAllAnimalGreetings("printAllAnimalGreetings metodu saGreetingi çaðýrdý : "+at2.a1);
	at2.toString();
	at2.printAllAnimals("toString metodu çaðrýldý : "+at2.a2);
	at2.setLegNumber(4);
	System.out.println("ayak sayýsý : " + at2.getLegNumber());
	System.out.println("-------------------------------------------------------------------------------------");
	
	Sheep shp=new Sheep("koyun", 4);
	shp.setAnimalist("koyun");
	System.out.println("\n yaþ: " + shp.getAge());
	System.out.println(shp.getAnimalist());
	shp.addAnimal(shp);
	shp.sayGreeting();
	shp.printAllAnimalGreetings("printAllAnimalGreetings metodu saGreetingi çaðýrdý "+shp.a3);
	shp.toString();
	shp.printAllAnimals("toString metodu çaðrýldý : "+shp.a2);
	shp.setLegNumber(4);
	System.out.println("ayak sayýsý : " + shp.getLegNumber());
	System.out.println("-------------------------------------------------------------------------------------");
	
	
	
	
	
	
	}

}
