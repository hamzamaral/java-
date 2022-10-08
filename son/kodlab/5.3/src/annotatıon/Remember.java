//SAYFA 266-267 ANLAÞILMADI

package annotatýon;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Annotation3()
{
	String ad();
	String soyad();
	
}
public class Remember {

	public static void main(String[] args) {
       Remember annotation = new  Remember();
       annotation.myMetod();
	}

	@Annotation3(ad="mehmet",soyad="kirazlý")
	public void myMethod() {
		try {
			Class<? extends Remember> reflClass=this.getClass();
			Method mth= reflClass.getMethod("myMethod");
			Annotation3 Annotation = mth.getAnnotation(Annotation3.class);
			System.out.println("ad: " + annotation.ad());
		}
	}
}
