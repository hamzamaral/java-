package annotatýon;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Annotatýon {
			@Target({ElementType.METHOD})
			public @interface Annotation1{
				//annotatio oluþturuldu
				}
			
			@Annotation1
			public void metod2() {}
			
			}

@Annotation1
class sýnýf() {}


