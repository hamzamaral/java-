
public class Döngüler {

	public static void main(String[] args) {
	/*	int dizi[]= {1,3,8,4,9};
		for(int i:dizi) {
			System.out.println(i + " ");
		}*/
		
		//int tipindeki bir sayýýn faktöryelini bulmak
		int a =5;
		int b=1;
		for(int i=0;i<5;i++) {
			b*=a;
			a--;
			System.out.println(b);
		}	
	}

}
