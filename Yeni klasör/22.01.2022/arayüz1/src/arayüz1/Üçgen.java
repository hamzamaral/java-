package arayüz1;

public class Üçgen implements Arayüz {
double ykl;
double tbn;

	@Override
	public double alan(double ykl,double tbn) {
		double a=(ykl*tbn)*1/2;
		

		return a;
	}

	@Override
	public double çevre(double ykl,double tbn) {
		double b=3*tbn;

		return b;
	}
	
	

}
