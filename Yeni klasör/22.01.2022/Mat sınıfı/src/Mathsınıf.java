import java.util.Scanner;

public class Mathsýnýf {

	public static void main(String ascu[]) {
		Scanner sc2=new Scanner(System.in);
		Double db2=sc2.nextDouble();
		Double x=Math.sin(Math.toRadians(db2));
		Double y=Math.pow(db2, x);
		double m=Math.pow(db2, 0.3333);
		double sonuç=Math.pow(db2, 4)+y+m;
		System.out.println("sonuç : "+ sonuç);
		System.out.println( "m deðeri " + m);
		System.out.println(y);
	}
	
}
