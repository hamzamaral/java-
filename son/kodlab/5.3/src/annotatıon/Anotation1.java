package annotat�on;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

 import annotat�on.Anotation1.Annotation2;
public class Anotation1 {
	@Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
	public @interface Annotation2{
		// annotati�on olu�turuldu.
		//annotation 2  sadece s�n�flarda ve yap�c�lar�n  ba�lar�nda  kullanabilece�iz

	}

	
	@Annotation2
	public void metod() {
		//metodlarda kullan�lamaz.
	}
	
	@Annotation2
	public Anotation1() {
		// yap�c�da kullan�l�d�.
	}
}

@Annotation2
class Sinif1 
{
//s�n�f tan�m�nda kulla�ld�.	
}