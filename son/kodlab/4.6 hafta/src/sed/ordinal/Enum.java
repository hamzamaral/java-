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
System.out.println("ocak ay�ndas�n�z ");
break;
case 1:
System.out.println("subat ay�ndas��z ");
break;
case 2:
System.out.println("mart ay�ndas��z ");

}
aylar.subat.a=17;
System.out.println(aylar.subat.a);

	}
}
