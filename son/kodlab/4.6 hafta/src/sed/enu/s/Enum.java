package sed.enu.s;
enum Arabalar
{

	AUDI("siyah"),MERCEDES("beyaz");
	public String renk;
	Arabalar(String renk) { 
		this.renk=renk;
		
	}
	
}
public class Enum {

	public static void main(String[] args) {

		for(Arabalar a:Arabalar.values()) {
			System.out.println(a.name() +" - " + a.renk);
			
		}
	}

}
