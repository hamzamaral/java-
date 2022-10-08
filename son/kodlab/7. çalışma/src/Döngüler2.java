
public class Döngüler2 {

	public static void main(String[] args) {
//20ile 90 arasýnda asal sayýlarý bulmak
		for(int i=21;i<90;i++) {
			int k=0;
			for(int j=2;j<i;j++) {
				
				if(i%j==0) { 
					k++;
					break;
				}
				else if((i-1)==j) {
					System.out.println(i);
					
				}
				
				
			}
		}
		
	}
		

}
