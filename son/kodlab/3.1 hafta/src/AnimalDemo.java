


public class AnimalDemo {

	public static void main(String[] args) {
		
		Animal animalArray[] = new Animal[4];
		
		animalArray[0] = new Bird( );
	    animalArray[1] = new Dog( );
	    animalArray[2] = new Fish( );
	    animalArray[3] = new Cat( );
	    
	    for(int i = 0; i < animalArray.length; i++) {
	    	animalArray[i].makeNoise( );
	    	if(animalArray[i] instanceof Dog) {
	    		Dog d = (Dog) animalArray[i];
	    		d.bark();
	    	}
	    	
	    }
	    
	    Animal a = new Dog();
	    Object o = a;

	    System.out.println(o);
	    a.doYourThing();
	    
	}

}
