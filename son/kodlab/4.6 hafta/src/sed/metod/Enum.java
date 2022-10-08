package sed.metod;
enum Maaþ 
{
ensar(4000),hamza(5000),halil(6000);
	private int a;
	Maaþ( int b)
	{
		a=b;
	}
    

int maasgöster() {
	return a;
}

static void metod2() {
	System.out.println("burasý metod2'dir");
}

}
public class Enum {

	public static void main(String[] args) {
System.out.println(Maaþ.ensar.maasgöster());
System.out.println(Maaþ.hamza.maasgöster());
System.out.println(Maaþ.halil.maasgöster());
Maaþ.metod2();

	}

}
