package ilködev;

import java.security.KeyStore.ProtectionParameter;

public class Daire1 {

	
	public int odasayısı ;
	private int banyosayısı;
	protected float alan;
	public boolean  a;
	 public String adres;
	

	public Daire1(int odasayısı, int banyosayısı, double alan, boolean a, String bahcelievler ) {
		 this.odasayısı=odasayısı;
		 this.banyosayısı=banyosayısı;
		 this.alan=(float) alan;
		 this.a=a;
		 adres=bahcelievler;
	}

	public int getBanyosayısı() {
		return banyosayısı;
	}
	public void setBanyosayısı(int banyosayısı) {
		this.banyosayısı = banyosayısı;
	}
	public char[] odasayısı() {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 
	
	 
}
