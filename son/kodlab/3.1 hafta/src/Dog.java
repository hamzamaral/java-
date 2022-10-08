

public class Dog extends Animal {
	public Dog() {
	      noise = "Woof";
	   } // of constructor
	
	   public void doYourThing ( )  {
	      identifySelf();
	      System.out.println("I am a dog"); 
	      System.out.println(noise);
	   }  // of doYourThing

	   public void makeNoise ( )
	   {
	      System.out.println("Woof woof");
	   }  // of makeNoise

	   public void bark ( )
	   {
	      System.out.println("Arf Arf");
	   }  // of bark

	   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dog toString()";
	}
}
