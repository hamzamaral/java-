
public class oop {
int x;


	public static void main(String[] args) {

		oop nesne=new oop();
		nesne.x=5;
		System.out.println(nesne.x);
		nesne.metod(nesne);
		System.out.println(nesne.x);

	}

	void metod(oop nesne) {
	nesne.x=nesne.x+10;
	}
}
