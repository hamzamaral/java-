package garbage;

public class Garbagecollector {

	public static void main(String[] args) {

		Garbagecollector kpt=new Garbagecollector();
		Garbagecollector akl=new Garbagecollector();
		
		new Garbagecollector();////gc i�in uygun

		kpt=akl; //gc i�in uygun
		
		kpt=null;//gc i�in uygun
		System.gc();
		
		akl=null;//gc i�in uygun
		
		Runtime.getRuntime().gc();//JVM,Garbage collectoru caap�d�
		
		
	}

}
