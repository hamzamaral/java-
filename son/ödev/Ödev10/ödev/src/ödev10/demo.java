package ödev10;

public class demo {

	public static void main(String[] args) {
	
		öğrenci1 ogr1=new öğrenci1();
		ogr1.isim="muhammed hamza ";
		ogr1.Soyisim="maral";
		ogr1.tel=(double) 123456789;
		ogr1.yaş=21;
		String a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr1.setOrtalama(2.5);
		 double b= ogr1.getOrtalama();
		ogr1.setDönem("1 güz dönemi");
		ogr1.setAlabileceğiToplaKredi(40);
		ogr1.setDanışmaHocaİsim("ali koçak");
		ogr1.setHaftalıkÇalışmaProgramı(a);

		
		
	/*	System.out.println("isim    :" + ogr1.isim);
		System.out.println("soyisim :" + ogr1.Soyisim);
		System.out.println("tel     :" + ogr1.tel);
		System.out.println("yaş     :" + ogr1.yaş);
		System.out.println("ortalama:" + ogr1.getOrtalama());
		System.out.println("dönem   :" + ogr1.getDönem());
		System.out.println("danişma hoca  :" + ogr1.getDanışmaHocaİsim());
		System.out.println("alabileceği kredi  :" + ogr1.getAlabileceğiToplaKredi());
		System.out.println("fazladan kredii aabilirmi :" + ogr1.KrediAlabilirmi(b));
		System.out.println("--------------------------------------------------");
		System.out.println(ogr1.getHaftalıkÇalışmaProgramı());
		System.out.println("--------------------------------------------------");
		System.out.println("***********************************************************************************");*/
		
		
		öğrenci2 ogr2=new öğrenci2();
		ogr2.isim="muhammed ensar ";
		ogr2.Soyisim="maral";
		ogr2.tel=(double) 126485389;
		ogr2.yaş=19;
		 a="pazartesi :" + "\t fizik" +"\t beden" + "\t matamatik" + "\nsalı      :" +  "\t tarih" +"\t beden" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr2.setOrtalama(3.6);
	    b= ogr2.getOrtalama();
		ogr2.setDönem("1 güz dönemi");
		ogr2.setAlabileceğiToplaKredi(40);
		ogr2.setDanışmaHocaİsim("ali koçak");
		ogr2.setHaftalıkÇalışmaProgramı(a);
		
	

		öğrenci3 ogr3=new öğrenci3();
		ogr3.isim="muhammed cihat ";
		ogr3.Soyisim="maral";
		ogr3.tel=(double) 122814989;
		ogr3.yaş=20;
		 a="pazartesi :" + "\t fizik" +"\t beden" + "\t matamatik" + "\nsalı      :" +  "\t tarih" +"\t beden" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr3.setOrtalama(1.5);
	    b= ogr3.getOrtalama();
		ogr3.setDönem("1 güz dönemi");
		ogr3.setAlabileceğiToplaKredi(40);
		ogr3.setDanışmaHocaİsim("ali koçak");
		ogr3.setHaftalıkÇalışmaProgramı(a);
		
		
		öğrenci4 ogr4=new öğrenci4();
		ogr4.isim="ammar ";
		ogr4.Soyisim="maral";
		ogr4.tel=(double) 1224658759;
		ogr4.yaş=21;
		 a="pazartesi :" + "\t kimya" +"\t beden" + "\t matamatik" + "\nsalı      :" +  "\t tarih" +"\t fizik" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perşembe :" +  "\t beden" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t tarih" +"\t kimya" + "\t matamatik";
		ogr4.setOrtalama(3.7);
	    b= ogr4.getOrtalama();
		ogr4.setDönem("1 güz dönemi");
		ogr4.setAlabileceğiToplaKredi(40);
		ogr4.setDanışmaHocaİsim("ali koçak");
		ogr4.setHaftalıkÇalışmaProgramı(a);
		
		
		
		öğrenci5 ogr5=new öğrenci5();
		ogr5.isim="hasan ";
		ogr5.Soyisim="maral";
		ogr5.tel=(double) 116253489;
		ogr5.yaş=22;
		 a="pazartesi :" + "\t fizik" +"\t beden" + "\t matamatik" + "\nsalı      :" +  "\t tarih" +"\t beden" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr5.setOrtalama(3.2);
	    b= ogr5.getOrtalama();
		ogr5.setDönem("1 güz dönemi");
		ogr5.setAlabileceğiToplaKredi(40);
		ogr5.setDanışmaHocaİsim("ali koçak");
		ogr5.setHaftalıkÇalışmaProgramı(a);
		/**
		 *Danışman hoca tüm öğrencilerine ulaşabiliyor.
		 *
		 *danışman hoca öğrenciBilgileriGöster metodu kullanılarak  öğrencinin bilgilerini gösterir.
		 *
		 */
		
		DanışmanHoca1 hoca=new DanışmanHoca1();
		hoca.isim= "ali ";
		hoca.Soyisim="koçak";
		hoca.tel=(double) 164582379;
		hoca.yaş=45;
		hoca.öğrenciSayısı=3;
		hoca.branş="fizik hocaları:";
		System.out.println("danişman hoca isim    :" + hoca.isim);
		System.out.println("danişman hoca soyisim :" + hoca.Soyisim);
		System.out.println("danişman hoca tel     :" + hoca.tel);
		System.out.println("danişman hoca yaş     :" + hoca.yaş);
		System.out.println("danişman hoca öğrencisayısı :" + hoca.öğrenciSayısı);
		System.out.println("danişman hoca branş :" + hoca.branş);
		System.out.println("***********************************************************************************");



		
	String c=	"\nisim    :" + ogr1.isim
		+"\nsoyisim :" + ogr1.Soyisim
	    +"\ntel     :" + ogr1.tel
		+"\nyaş     :" + ogr1.yaş
		+"\nortalama:" + ogr1.getOrtalama()
		+"\ndönem   :" + ogr1.getDönem()
		+"\ndanişma hoca  :" + ogr1.getDanışmaHocaİsim()
		+"\nalabileceği kredi  :" + ogr1.getAlabileceğiToplaKredi()
		+"\nfazladan kredii aabilirmi :" + ogr1.KrediAlabilirmi(b)
		+"\n--------------------------------------------------\n"
		+ogr1.getHaftalıkÇalışmaProgramı()
		+"\n--------------------------------------------------"
		+"\n***********************************************************************************";
	System.out.println(hoca.öğrenciBilgileriGöster(c));
	
	
	 c=	"\n isim    :" + ogr2.isim
			+"\nsoyisim :" + ogr2.Soyisim
		    +"\ntel     :" + ogr2.tel
			+"\nyaş     :" + ogr2.yaş
			+"\nortalama:" + ogr2.getOrtalama()
			+"\ndönem   :" + ogr2.getDönem()
			+"\ndanişma hoca  :" + ogr2.getDanışmaHocaİsim()
			+"\nalabileceği kredi  :" + ogr2.getAlabileceğiToplaKredi()
			+"\nfazladan kredii aabilirmi :" + ogr2.KrediAlabilirmi(b)
			+"\n--------------------------------------------------\n"
			+ogr2.getHaftalıkÇalışmaProgramı()
			+"\n--------------------------------------------------"
			+"\n***********************************************************************************";
		System.out.println(hoca.öğrenciBilgileriGöster(c));
		
		 c=	"\nisim    :" + ogr3.isim
				+"\nsoyisim :" + ogr3.Soyisim
			    +"\ntel     :" + ogr3.tel
				+"\nyaş     :" + ogr3.yaş
				+"\nortalama:" + ogr3.getOrtalama()
				+"\ndönem   :" + ogr3.getDönem()
				+"\ndanişma hoca  :" + ogr3.getDanışmaHocaİsim()
				+"\nalabileceği kredi  :" + ogr3.getAlabileceğiToplaKredi()
				+"\nfazladan kredii aabilirmi :" + ogr3.KrediAlabilirmi(b)
				+"\n--------------------------------------------------\n"
				+ogr3.getHaftalıkÇalışmaProgramı()
				+"\n--------------------------------------------------"
				+"\n***********************************************************************************";
			System.out.println(hoca.öğrenciBilgileriGöster(c));
			
			c=	"\nisim    :" + ogr4.isim
					+"\nsoyisim :" + ogr4.Soyisim
				    +"\ntel     :" + ogr4.tel
					+"\nyaş     :" + ogr4.yaş
					+"\nortalama:" + ogr4.getOrtalama()
					+"\ndönem   :" + ogr4.getDönem()
					+"\ndanişma hoca  :" + ogr4.getDanışmaHocaİsim()
					+"\nalabileceği kredi  :" + ogr4.getAlabileceğiToplaKredi()
					+"\nfazladan kredii aabilirmi :" + ogr4.KrediAlabilirmi(b)
					+"\n--------------------------------------------------\n"
					+ogr4.getHaftalıkÇalışmaProgramı()
					+"\n--------------------------------------------------"
					+"\n***********************************************************************************";
				System.out.println(hoca.öğrenciBilgileriGöster(c));
				
				c=	    "\nisim    :" + ogr5.isim
						+"\nsoyisim :" + ogr5.Soyisim
					    +"\ntel     :" + ogr5.tel
						+"\nyaş     :" + ogr5.yaş
						+"\nortalama:" + ogr5.getOrtalama()
						+"\ndönem   :" + ogr5.getDönem()
						+"\ndanişma hoca  :" + ogr5.getDanışmaHocaİsim()
						+"\nalabileceği kredi  :" + ogr5.getAlabileceğiToplaKredi()
						+"\nfazladan kredii aabilirmi :" + ogr5.KrediAlabilirmi(b)
						+"\n--------------------------------------------------\n"
						+ogr5.getHaftalıkÇalışmaProgramı()
						+"\n--------------------------------------------------"
						+"\n***********************************************************************************";
					System.out.println(hoca.öğrenciBilgileriGöster(c));
	
	/**
	 * 
	 * danişman hoca öğrenciBilgilerinideğiştir() metodu sayesinde istediği öğrencinin  bilgilerini deiştirir.
	 * 
	 */
		double d;
		ogr1.setOrtalama(3.1);
		d=ogr1.getOrtalama();
		System.out.println("muhammed hamzanın yeni notu         :" + hoca.öğrenciBilgilerinideğiştir(d));
		ogr1.setAlabileceğiToplaKredi(30);
		d=ogr1.getAlabileceğiToplaKredi();
		System.out.println("öğrencinin alabileceği kredi sayısı :"+hoca.öğrenciBilgilerinideğiştir(d));
		System.out.println("öğrenciBilgilerinideğiştir metdu kullanılarak danışman hoca istediğini öğrencinin bilgilerini  değiştirebilir.");
System.out.println("***************************************************************************");
	

öğrenci2 ogr6=new öğrenci2();
ogr6.isim="amhet ";
ogr6.Soyisim="sarısungur";
ogr6.tel=(double) 123456789;
ogr6.yaş=21;
 a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr6.setOrtalama(2.5);
 b= ogr6.getOrtalama();
ogr6.setDönem("3 güz dönemi");
ogr6.setAlabileceğiToplaKredi(50);
ogr6.setDanışmaHocaİsim("mahmut gül");
ogr6.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");
    

öğrenci2 ogr7=new öğrenci2();
ogr7.isim="mehmet ";
ogr7.Soyisim="nebi";
ogr7.tel=(double) 12695849;
ogr7.yaş=24;
 a="pazartesi :" + "\t beden" +"\t kimya" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t fizik" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t fizik" + "\t matamatik";
ogr7.setOrtalama(4);
 b= ogr7.getOrtalama();
ogr7.setDönem("3 güz dönemi");
ogr7.setAlabileceğiToplaKredi(50);
ogr7.setDanışmaHocaİsim("mahmut gül");
ogr7.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");


öğrenci2 ogr8=new öğrenci2();
ogr8.isim="halil ibrahim ";
ogr8.Soyisim="sarısungur";
ogr8.tel=(double) 1695841789;
ogr8.yaş=21;
 a="pazartesi :" + "\t kültür" +"\t türkçe" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t türkçe " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t türkçe" +"\t kimya" + "\t matamatik";
ogr8.setOrtalama(3);
 b= ogr8.getOrtalama();
ogr8.setDönem("3 güz dönemi");
ogr8.setAlabileceğiToplaKredi(50);
ogr8.setDanışmaHocaİsim("mahmut gül");
ogr8.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");


öğrenci2 ogr9=new öğrenci2();
ogr9.isim="amhet ";
ogr9.Soyisim="sarısungur";
ogr9.tel=(double) 126485989;
ogr9.yaş=21;
 a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr9.setOrtalama(2.5);
 b= ogr9.getOrtalama();
ogr9.setDönem("3 güz dönemi");
ogr9.setAlabileceğiToplaKredi(50);
ogr9.setDanışmaHocaİsim("mahmut gül");
ogr9.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");


öğrenci2 ogr10=new öğrenci2();
ogr10.isim="amhet ";
ogr10.Soyisim="sarısungur";
ogr10.tel=(double) 123164889;
ogr10.yaş=21;
 a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr10.setOrtalama(3.9);
 b= ogr10.getOrtalama();
ogr10.setDönem("3 güz dönemi");
ogr10.setAlabileceğiToplaKredi(50);
ogr10.setDanışmaHocaİsim("mahmut gül");
ogr10.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");


DanişmanHoca2 hoca2=new DanişmanHoca2();
hoca2.isim= "mahmut ";
hoca2.Soyisim="gül";
hoca2.tel=(double) 164856679;
hoca2.yaş=55;
hoca2.öğrenciSayısı=5;
hoca2.branş="kimya :";
System.out.println("danişman hoca isim    :" + hoca2.isim);
System.out.println("danişman hoca soyisim :" + hoca2.Soyisim);
System.out.println("danişman hoca tel     :" + hoca2.tel);
System.out.println("danişman hoca yaş     :" + hoca2.yaş);
System.out.println("danişman hoca öğrencisayısı :" + hoca2.öğrenciSayısı);
System.out.println("danişman hoca branş :" + hoca2.branş);
System.out.println("***********************************************************************************");

c=	"\nisim    :" + ogr6.isim
+"\nsoyisim :" + ogr6.Soyisim
+"\ntel     :" + ogr6.tel
+"\nyaş     :" + ogr6.yaş
+"\nortalama:" + ogr6.getOrtalama()
+"\ndönem   :" + ogr6.getDönem()
+"\ndanişma hoca  :" + ogr6.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr6.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr6.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr6.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öğrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr7.isim
+"\nsoyisim :" + ogr7.Soyisim
+"\ntel     :" + ogr7.tel
+"\nyaş     :" + ogr7.yaş
+"\nortalama:" + ogr7.getOrtalama()
+"\ndönem   :" + ogr7.getDönem()
+"\ndanişma hoca  :" + ogr7.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr7.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr7.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr7.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öğrenciBilgileriGöster(c));


c=	"\nisim    :" + ogr8.isim
+"\nsoyisim :" + ogr8.Soyisim
+"\ntel     :" + ogr8.tel
+"\nyaş     :" + ogr8.yaş
+"\nortalama:" + ogr8.getOrtalama()
+"\ndönem   :" + ogr8.getDönem()
+"\ndanişma hoca  :" + ogr8.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr8.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr8.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr8.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öğrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr9.isim
+"\nsoyisim :" + ogr9.Soyisim
+"\ntel     :" + ogr9.tel
+"\nyaş     :" + ogr9.yaş
+"\nortalama:" + ogr9.getOrtalama()
+"\ndönem   :" + ogr9.getDönem()
+"\ndanişma hoca  :" + ogr9.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr9.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr9.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr9.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öğrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr10.isim
+"\nsoyisim :" + ogr10.Soyisim
+"\ntel     :" + ogr10.tel
+"\nyaş     :" + ogr10.yaş
+"\nortalama:" + ogr10.getOrtalama()
+"\ndönem   :" + ogr10.getDönem()
+"\ndanişma hoca  :" + ogr10.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr10.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr10.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr10.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öğrenciBilgileriGöster(c));


	

/**
 * 
 * danişman hoca öğrenciBilgilerinideğiştir() metodu sayesinde istediği öğrencinin  bilgilerini deiştirir.
 * 
 */
	


öğrenci3 ogr11=new öğrenci3();
ogr11.isim="ali ";
ogr11.Soyisim="koçat";
ogr11.tel=(double) 16245879;
ogr11.yaş=18;
a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr11.setOrtalama(3.1);
b= ogr11.getOrtalama();
ogr11.setDönem("5 güz dönemi");
ogr11.setAlabileceğiToplaKredi(45);
ogr11.setDanışmaHocaİsim("esra tok");
ogr11.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");


öğrenci3 ogr12=new öğrenci3();
ogr12.isim="veysel ";
ogr12.Soyisim="kaya";
ogr12.tel=(double) 113465879;
ogr12.yaş=23;
a="pazartesi :" + "\t beden" +"\t kimya" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t fizik" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t fizik" + "\t matamatik";
ogr12.setOrtalama(3.4);
b= ogr12.getOrtalama();
ogr12.setDönem("5 güz dönemi");
ogr12.setAlabileceğiToplaKredi(45);
ogr12.setDanışmaHocaİsim("esra yok");
ogr12.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");


öğrenci3 ogr13=new öğrenci3();
ogr13.isim="halil ibrahim ";
ogr13.Soyisim="maral";
ogr13.tel=(double) 685947213;
ogr13.yaş=19;
a="pazartesi :" + "\t kültür" +"\t türkçe" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t türkçe " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t türkçe" +"\t kimya" + "\t matamatik";
ogr13.setOrtalama(3.6);
b= ogr13.getOrtalama();
ogr13.setDönem("5 güz dönemi");
ogr13.setAlabileceğiToplaKredi(45);
ogr13.setDanışmaHocaİsim("esra tok ");
ogr13.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");


öğrenci3 ogr14=new öğrenci3();
ogr14.isim="mustafa ";
ogr14.Soyisim="kaya";
ogr14.tel=(double) 678459231;
ogr14.yaş=21;
a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr14.setOrtalama(1.8);
b= ogr14.getOrtalama();
ogr14.setDönem("5 güz dönemi");
ogr14.setAlabileceğiToplaKredi(45);
ogr14.setDanışmaHocaİsim("esar tok");
ogr14.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");


öğrenci3 ogr15=new öğrenci3();
ogr15.isim="muhammed avzem ";
ogr15.Soyisim="sarısungur";
ogr15.tel=(double) 475826391;
ogr15.yaş=21;
a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalı      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarşamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perşembe :" +  "\t kimya" +"\t tarih" + "\t coğrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr15.setOrtalama(2.9);
b= ogr15.getOrtalama();
ogr15.setDönem("5 güz dönemi");
ogr15.setAlabileceğiToplaKredi(45);
ogr15.setDanışmaHocaİsim("esra  tok");
ogr15.setHaftalıkÇalışmaProgramı(a);
System.out.println("***********************************************************************************");


DanışmanHoca3 hoca3=new DanışmanHoca3();
hoca3.isim= "esra ";
hoca3.Soyisim="tok";
hoca3.tel=(double) 432516978;
hoca3.yaş=35;
hoca3.öğrenciSayısı=5;
hoca3.branş="biyoloji :";
System.out.println("danişman hoca isim    :" + hoca3.isim);
System.out.println("danişman hoca soyisim :" + hoca3.Soyisim);
System.out.println("danişman hoca tel     :" + hoca3.tel);
System.out.println("danişman hoca yaş     :" + hoca3.yaş);
System.out.println("danişman hoca öğrencisayısı :" + hoca3.öğrenciSayısı);
System.out.println("danişman hoca branş :" + hoca3.branş);
System.out.println("***********************************************************************************");

c=	"\nisim    :" + ogr11.isim
+"\nsoyisim :" + ogr11.Soyisim
+"\ntel     :" + ogr11.tel
+"\nyaş     :" + ogr11.yaş
+"\nortalama:" + ogr11.getOrtalama()
+"\ndönem   :" + ogr11.getDönem()
+"\ndanişma hoca  :" + ogr11.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr11.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr11.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr11.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öğrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr12.isim
+"\nsoyisim :" + ogr12.Soyisim
+"\ntel     :" + ogr12.tel
+"\nyaş     :" + ogr12.yaş
+"\nortalama:" + ogr12.getOrtalama()
+"\ndönem   :" + ogr12.getDönem()
+"\ndanişma hoca  :" + ogr12.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr12.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr12.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr12.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öğrenciBilgileriGöster(c));


c=	"\nisim    :" + ogr13.isim
+"\nsoyisim :" + ogr13.Soyisim
+"\ntel     :" + ogr13.tel
+"\nyaş     :" + ogr13.yaş
+"\nortalama:" + ogr13.getOrtalama()
+"\ndönem   :" + ogr13.getDönem()
+"\ndanişma hoca  :" + ogr13.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr13.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr13.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr13.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öğrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr14.isim
+"\nsoyisim :" + ogr14.Soyisim
+"\ntel     :" + ogr14.tel
+"\nyaş     :" + ogr14.yaş
+"\nortalama:" + ogr14.getOrtalama()
+"\ndönem   :" + ogr14.getDönem()
+"\ndanişma hoca  :" + ogr14.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr14.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr14.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr14.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öğrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr15.isim
+"\nsoyisim :" + ogr15.Soyisim
+"\ntel     :" + ogr15.tel
+"\nyaş     :" + ogr15.yaş
+"\nortalama:" + ogr15.getOrtalama()
+"\ndönem   :" + ogr15.getDönem()
+"\ndanişma hoca  :" + ogr15.getDanışmaHocaİsim()
+"\nalabileceği kredi  :" + ogr15.getAlabileceğiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr15.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr15.getHaftalıkÇalışmaProgramı()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öğrenciBilgileriGöster(c));


}



}







