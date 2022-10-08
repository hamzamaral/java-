package supperclass;

class sinif3
{
	int a,b;
	void metod1(int x, int y) 
	{
	
		a=x;
		b=y;
		
	}
	
	
}

class sinif4 extends sinif3
{

	
	int  carp()
	{

		return a*b;
	}
	
}
public class Kalýtým2 {

	public static void main(String[] args) {

		
		sinif4 ns1=new sinif4();
		ns1.metod1(5, 7);
		System.out.println(ns1.carp());
	}

}

