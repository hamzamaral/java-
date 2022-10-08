package ödev;

public class Daire {

	
	private  float yarýcap;
	
	public  static final float pi=  (float) 3.14 ;
	

	public     Daire(float yarýcap) {
		
		this.yarýcap=(float) yarýcap;
		float pi;		
	}
	
	protected float cevrehesapla(double yarýcap) {
		// TODO Auto-generated method stub
		return (float) (2*pi*yarýcap);
	}
	
	 float alanhesapla(double yarýcap) {
		// TODO Auto-generated method stub
		return (float) (pi*yarýcap*yarýcap);
	}
	
	

	public float getYarýcap() {
		return yarýcap;
	}

	public void setYarýcap(float yarýcap) {
		this.yarýcap = yarýcap;
	}

	public float getPi() {
		return pi;
	}
	
}
	
	
	
