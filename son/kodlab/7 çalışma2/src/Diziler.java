
public class Diziler {

	/*public static void main(String arg[]) {
	
		int dizi[]= {1,2,3,4,5,6};
		int dizi1[]=new int[6];
		iþlem(dizi, dizi1);
	}
	static void  iþlem(int dizi[], int[] dizi1) {
		for(int i=0;i<6;i++) {
		dizi1[i]=dizi[i];
			System.out.println(dizi1[i]);
		}
	}*/
public static int dizi2[]= new int[6];
	public static void main(String arg[]) {
		
		int dizi[]= {1,2,3,4,5,6};
		int dizi1[]=new int[6];
		iþlem(dizi, dizi1);
	}
	static void  iþlem(int dizi[], int[] dizi1) {
		for(int i=0;i<6;i++) {
		dizi1[i]=dizi[i];
		dizi2[i]=dizi1[i];
			//System.out.println(dizi1[i]);
			System.out.println(dizi2[i]);
		}
	}

}
