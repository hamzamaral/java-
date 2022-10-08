package sed.ordinal;
enum aylar{
	ocak,subat,mart;
	public int a;
	
	
	
}
public class Enum {

	public static void main(String[] args) {
int x = aylar.mart.ordinal();
switch(x) {
case 0:
System.out.println("ocak ayındasınız ");
break;
case 1:
System.out.println("subat ayındasıız ");
break;
case 2:
System.out.println("mart ayındasıız ");

}
aylar.subat.a=17;
System.out.println(aylar.subat.a);

	}
}
