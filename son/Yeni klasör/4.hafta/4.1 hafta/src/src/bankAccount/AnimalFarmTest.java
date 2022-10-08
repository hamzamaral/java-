package src.bankAccount;

public class AnimalFarmTest {
	
	public static void main(String[] args) {
		
		AnimalFarm aFarm = new AnimalFarm();
		
		System.out.println("\n---------------------------------");
		System.out.println("Toplam Hayvan Sayýsý: " + AnimalFarm.getNumberOfAnimals());
		System.out.println("Toplam Tavuk Sayýsý: " + Chicken.getCount());
		System.out.println("Toplam At Sayýsý: " + Horse.getCount());
		System.out.println("Toplam Koyun Sayýsý: " + Sheep.getCount());
		System.out.println("---------------------------------\n");
		
		Animal a = new Chicken("Tavuk1", 0);
		aFarm.addAnimal(a);
		a = new Horse("At1", 3);
		aFarm.addAnimal(a);
		a = new Sheep("Koyun1", 1);
		aFarm.addAnimal(a);
		a = new Chicken("Tavuk2", 5);
		aFarm.addAnimal(a);
		a = new Horse("At2", 7);
		aFarm.addAnimal(a);
		a = new Chicken("Tavuk3", 2);
		aFarm.addAnimal(a);
		
		System.out.println("\n---------------------------------");
		System.out.println("Toplam Hayvan Sayýsý: " + AnimalFarm.getNumberOfAnimals());
		System.out.println("Toplam Tavuk Sayýsý: " + Chicken.getCount());
		System.out.println("Toplam At Sayýsý: " + Horse.getCount());
		System.out.println("Toplam Koyun Sayýsý: " + Sheep.getCount());
		System.out.println("---------------------------------\n");
		
		aFarm.printAllAnimalGreetings();
		
		System.out.println("\n---------------------------------\n");
		
		aFarm.printAllAnimals();
		aFarm.animalMovements();
		
	}
	
}
