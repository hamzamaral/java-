package annotat�on;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Annotat�on {
			@Target({ElementType.METHOD})
			public @interface Annotation1{
				//annotatio olu�turuldu
				}
			
			@Annotation1
			public void metod2() {}
			
			}

@Annotation1
class s�n�f() {}


