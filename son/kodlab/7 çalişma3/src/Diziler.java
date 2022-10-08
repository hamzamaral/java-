
public class Diziler {

	public static void main(String[] args) {
		
		int dizi[]=new int[4];
		int dizi1[]=new int[4];
		int a=0,b=0;

		for(int i=0;i<4;i++) {
			dizi[i]=2*i+1;
		}
		for(int j=0;j<4;j++) {
			System.out.println(dizi[j]);
		}
		 dizi1[0]=dizi[0]+dizi[1]+dizi[2]+dizi[3];
		 dizi1[1]=dizi[0]*dizi[1]*dizi[2]*dizi[3];
		 for(int p=0;p<4;p++) {
			 if(dizi1[p]%2==0) {
				 a=a+dizi1[p];
			 }
			 else {
				 b=b+dizi1[p];
			 }
		 }
		 
		 dizi1[2]=a;
		 dizi1[3]=b;
		 for(int j=0;j<4;j++) {
				System.out.print(dizi1[j] + " ");
			}

		}
	}


