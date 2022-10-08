

class Catsa {
	   public Cat() {
	      noise = "Miaow";
	   } // of constructor
	   
	   public void doYourThing ( )  {
	      identifySelf();
	      System.out.println("I am a cat"); 
	      System.out.println(noise);
	   }  // of doYourThing
	   
	   @Override
	public void makeNoise() {
		System.out.println("Miaow Miaow");
	}
} // of Cat
