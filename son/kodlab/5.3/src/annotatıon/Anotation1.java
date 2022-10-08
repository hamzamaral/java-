package annotatýon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

 import annotatýon.Anotation1.Annotation2;
public class Anotation1 {
	@Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
	public @interface Annotation2{
		// annotatiýon oluþturuldu.
		//annotation 2  sadece sýnýflarda ve yapýcýlarýn  baþlarýnda  kullanabileceðiz

	}

	
	@Annotation2
	public void metod() {
		//metodlarda kullanýlamaz.
	}
	
	@Annotation2
	public Anotation1() {
		// yapýcýda kullanýlýdý.
	}
}

@Annotation2
class Sinif1 
{
//sýnýf tanýmýnda kullaýldý.	
}