package sed.metod;
enum Maa� 
{
ensar(4000),hamza(5000),halil(6000);
	private int a;
	Maa�( int b)
	{
		a=b;
	}
    

int maasg�ster() {
	return a;
}

static void metod2() {
	System.out.println("buras� metod2'dir");
}

}
public class Enum {

	public static void main(String[] args) {
System.out.println(Maa�.ensar.maasg�ster());
System.out.println(Maa�.hamza.maasg�ster());
System.out.println(Maa�.halil.maasg�ster());
Maa�.metod2();

	}

}
