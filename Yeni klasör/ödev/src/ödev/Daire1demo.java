package �dev;

public class Daire1demo {

	

	public static void main(String[] args) {
	      System.out.println("Daire1----------------------------------------------");

       Daire1 kap ;
    	String item = "bahcelievler";
    	kap =new Daire1(7,1,96.14,false,item);
       System.out.println("\nDairenin toplam odasay�s�: " + kap.odasay�s�);
       System.out.println("Dairenin toplam banyosay�s�:" + kap.getBanyosay�s�());
       System.out.println("Dairenin  alan�: " + kap.alan);
       System.out.println("Daire dublex mi?: " + kap.a);
       System.out.println("Daire adresi: " + kap.adres);
       System.out.println("Daire2----------------------------------------------");

       Daire1 kap1 ;
   	String item1 = "ba�c�lar";
   	kap1 =new Daire1(8,2,125.154,true,item1);
      System.out.println("\nDairenin toplam odasay�s�: " + kap1.odasay�s�);
      System.out.println("Dairenin toplam banyosay�s�: " + kap1.getBanyosay�s�());
      System.out.println("Dairenin  alan�: " + kap1.alan);
      System.out.println("Daire dublex mi?: " + kap1.a);
      System.out.println("Daire adresi: " + kap1.adres);
      System.out.println("Daire3----------------------------------------------");
      
      Daire1 kap2 ;
  	String item3 = "avc�lar";
  	kap2 =new Daire1(9,2,138.714,true,item3);
     System.out.println("\nDairenin toplam odasay�s�: " + kap2.odasay�s�);
     System.out.println("Dairenin toplam banyosay�s�: " + kap2.getBanyosay�s�());
     System.out.println("Dairenin  alan�: " + kap2.alan);
     System.out.println("Daire dublex mi?: " + kap2.a);
     System.out.println("Daire adresi: " + kap2.adres);
	}

}