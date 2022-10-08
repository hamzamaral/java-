package annotatýon;
//sayfa 270

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface GeoBilgi{
	public String sekilIsmi();
	public int kenarSayisi();

}

@GeoBilgi (sekilIsmi = "düzgün sekizgen",kenarSayisi=8)
class GeometrikSekil
{
public int icAci(int kenar) 
{
return(180 * (kenar-2))/kenar;	
}	

public int kosegenSayisi(int kenar) 
{
	return (kenar * (kenar - 3))/2;
	

}
}

public class SINIF {

	public static void main(String args[]) 
	{
		
		GeometrikSekil g =new GeometrikSekil();
		GeoBilgi annotation = g.getClass().getAnnotation(GeoBilgi.class);d
				//annotation bilgilerimizi olturduumuz nesne içeerisinde aldýk.
		
	}
}
