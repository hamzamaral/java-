package sed.metod;
enum Maa�lar 
{
ensar(3000),hamza(6000),halil(6000);
	private int a;
	Maa�lar( int b)
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
public class Metot {

	public static void main(String[] args) {
		System.out.println(Maa�lar.ensar.maasg�ster());
		System.out.println(Maa�lar.hamza.maasg�ster());
		System.out.println(Maa�lar.halil.maasg�ster());
		Maa�lar.metod2();
	}

}
