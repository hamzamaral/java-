import java.util.Scanner;

public class Maths�n�f {

	public static void main(String ascu[]) {
		Scanner sc2=new Scanner(System.in);
		Double db2=sc2.nextDouble();
		Double x=Math.sin(Math.toRadians(db2));
		Double y=Math.pow(db2, x);
		double m=Math.pow(db2, 0.3333);
		double sonu�=Math.pow(db2, 4)+y+m;
		System.out.println("sonu� : "+ sonu�);
		System.out.println( "m de�eri " + m);
		System.out.println(y);
	}
	
}
