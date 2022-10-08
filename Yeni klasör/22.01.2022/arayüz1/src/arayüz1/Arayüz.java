package arayüz1;

public interface Arayüz {
	double ky=5.15;
	default void tina() {
		System.out.println("tina türkçe biliyor.");
	}
	public double alan(double x,double y);
	public double çevre(double x1,double y1);

	
	
}
