package sed.metod;
enum Maaþlar 
{
ensar(3000),hamza(6000),halil(6000);
	private int a;
	Maaþlar( int b)
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
public class Metot {

	public static void main(String[] args) {
		System.out.println(Maaþlar.ensar.maasgöster());
		System.out.println(Maaþlar.hamza.maasgöster());
		System.out.println(Maaþlar.halil.maasgöster());
		Maaþlar.metod2();
	}

}
