package �dev;

public class Daire {

	
	private  float yar�cap;
	
	public  static final float pi=  (float) 3.14 ;
	

	public     Daire(float yar�cap) {
		
		this.yar�cap=(float) yar�cap;
		float pi;		
	}
	
	protected float cevrehesapla(double yar�cap) {
		// TODO Auto-generated method stub
		return (float) (2*pi*yar�cap);
	}
	
	 float alanhesapla(double yar�cap) {
		// TODO Auto-generated method stub
		return (float) (pi*yar�cap*yar�cap);
	}
	
	

	public float getYar�cap() {
		return yar�cap;
	}

	public void setYar�cap(float yar�cap) {
		this.yar�cap = yar�cap;
	}

	public float getPi() {
		return pi;
	}
	
}
	
	
	
