package src.bankAccount;

public class AnimalFarm {
	private Animal animalList[];
	private final int CAPACITY;
	private static int numberOfAnimals = 0;
	
	public AnimalFarm() {
		animalList = new Animal[50];
		CAPACITY = 50;
	}
	
	public static int getNumberOfAnimals() {
		return numberOfAnimals;
	}
	
	public boolean addAnimal(Animal aimal) {
		if(numberOfAnimals < CAPACITY) {
			animalList[numberOfAnimals] = aimal;
			numberOfAnimals++;
			System.out.println("cifliðe yeni bir hayvan eklenmiþtir.");
			return true;
		} else {
			System.err.println("Kapasite doldu. Yeni hayvan ekleyemezsin");
			return false;
		}
	}
	
	public void printAllAnimalGreetings() {
		for(int i = 0; i < numberOfAnimals; i++) {
			animalList[i].sayGreeting();
		}
	}
	
	public void printAllAnimals() {
		for(int i = 0; i < numberOfAnimals; i++) {
			System.out.println(animalList[i]);
		}
	}
	
	public void animalMovements() {
		for(int i = 0; i < numberOfAnimals; i++) {
			if(animalList[i] instanceof Bird) {
				Bird bird = (Bird) animalList[i];
				bird.fly();
			} else if(animalList[i] instanceof Mammal) {
				Mammal mammal = (Mammal) animalList[i];
				mammal.walk();
			}w
		}
	}
	
}
