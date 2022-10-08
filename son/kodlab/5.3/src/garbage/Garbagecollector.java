package garbage;

public class Garbagecollector {

	public static void main(String[] args) {

		Garbagecollector kpt=new Garbagecollector();
		Garbagecollector akl=new Garbagecollector();
		
		new Garbagecollector();////gc için uygun

		kpt=akl; //gc için uygun
		
		kpt=null;//gc için uygun
		System.gc();
		
		akl=null;//gc için uygun
		
		Runtime.getRuntime().gc();//JVM,Garbage collectoru caapýdý
		
		
	}

}
