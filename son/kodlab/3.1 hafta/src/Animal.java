

abstract public class Animal {
	   public String name = "";
	   public String noise = ""; 
	   public int numTimesPerformed  = 0;  


	   public void identifySelf( ) {
	      System.out.println("My name is " + name);
	   }  // of identifySelf 
	   
	   public void perform( ) {
	      doYourThing( );
	      numTimesPerformed++;
	   } // of perform
	   
	   abstract public void doYourThing( );
	   
	   abstract public void makeNoise ( );
	   
	   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Animal toString()";
	}

	} // of Animal
