package ödev10;

public class demo {

	public static void main(String[] args) {
	
		öðrenci1 ogr1=new öðrenci1();
		ogr1.isim="muhammed hamza ";
		ogr1.Soyisim="maral";
		ogr1.tel=(double) 123456789;
		ogr1.yaþ=21;
		String a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr1.setOrtalama(2.5);
		 double b= ogr1.getOrtalama();
		ogr1.setDönem("1 güz dönemi");
		ogr1.setAlabileceðiToplaKredi(40);
		ogr1.setDanýþmaHocaÝsim("ali koçak");
		ogr1.setHaftalýkÇalýþmaProgramý(a);

		
		
	/*	System.out.println("isim    :" + ogr1.isim);
		System.out.println("soyisim :" + ogr1.Soyisim);
		System.out.println("tel     :" + ogr1.tel);
		System.out.println("yaþ     :" + ogr1.yaþ);
		System.out.println("ortalama:" + ogr1.getOrtalama());
		System.out.println("dönem   :" + ogr1.getDönem());
		System.out.println("daniþma hoca  :" + ogr1.getDanýþmaHocaÝsim());
		System.out.println("alabileceði kredi  :" + ogr1.getAlabileceðiToplaKredi());
		System.out.println("fazladan kredii aabilirmi :" + ogr1.KrediAlabilirmi(b));
		System.out.println("--------------------------------------------------");
		System.out.println(ogr1.getHaftalýkÇalýþmaProgramý());
		System.out.println("--------------------------------------------------");
		System.out.println("***********************************************************************************");*/
		
		
		öðrenci2 ogr2=new öðrenci2();
		ogr2.isim="muhammed ensar ";
		ogr2.Soyisim="maral";
		ogr2.tel=(double) 126485389;
		ogr2.yaþ=19;
		 a="pazartesi :" + "\t fizik" +"\t beden" + "\t matamatik" + "\nsalý      :" +  "\t tarih" +"\t beden" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr2.setOrtalama(3.6);
	    b= ogr2.getOrtalama();
		ogr2.setDönem("1 güz dönemi");
		ogr2.setAlabileceðiToplaKredi(40);
		ogr2.setDanýþmaHocaÝsim("ali koçak");
		ogr2.setHaftalýkÇalýþmaProgramý(a);
		
	

		öðrenci3 ogr3=new öðrenci3();
		ogr3.isim="muhammed cihat ";
		ogr3.Soyisim="maral";
		ogr3.tel=(double) 122814989;
		ogr3.yaþ=20;
		 a="pazartesi :" + "\t fizik" +"\t beden" + "\t matamatik" + "\nsalý      :" +  "\t tarih" +"\t beden" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr3.setOrtalama(1.5);
	    b= ogr3.getOrtalama();
		ogr3.setDönem("1 güz dönemi");
		ogr3.setAlabileceðiToplaKredi(40);
		ogr3.setDanýþmaHocaÝsim("ali koçak");
		ogr3.setHaftalýkÇalýþmaProgramý(a);
		
		
		öðrenci4 ogr4=new öðrenci4();
		ogr4.isim="ammar ";
		ogr4.Soyisim="maral";
		ogr4.tel=(double) 1224658759;
		ogr4.yaþ=21;
		 a="pazartesi :" + "\t kimya" +"\t beden" + "\t matamatik" + "\nsalý      :" +  "\t tarih" +"\t fizik" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perþembe :" +  "\t beden" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t tarih" +"\t kimya" + "\t matamatik";
		ogr4.setOrtalama(3.7);
	    b= ogr4.getOrtalama();
		ogr4.setDönem("1 güz dönemi");
		ogr4.setAlabileceðiToplaKredi(40);
		ogr4.setDanýþmaHocaÝsim("ali koçak");
		ogr4.setHaftalýkÇalýþmaProgramý(a);
		
		
		
		öðrenci5 ogr5=new öðrenci5();
		ogr5.isim="hasan ";
		ogr5.Soyisim="maral";
		ogr5.tel=(double) 116253489;
		ogr5.yaþ=22;
		 a="pazartesi :" + "\t fizik" +"\t beden" + "\t matamatik" + "\nsalý      :" +  "\t tarih" +"\t beden" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr5.setOrtalama(3.2);
	    b= ogr5.getOrtalama();
		ogr5.setDönem("1 güz dönemi");
		ogr5.setAlabileceðiToplaKredi(40);
		ogr5.setDanýþmaHocaÝsim("ali koçak");
		ogr5.setHaftalýkÇalýþmaProgramý(a);
		/**
		 *Danýþman hoca tüm öðrencilerine ulaþabiliyor.
		 *
		 *danýþman hoca öðrenciBilgileriGöster metodu kullanýlarak  öðrencinin bilgilerini gösterir.
		 *
		 */
		
		DanýþmanHoca1 hoca=new DanýþmanHoca1();
		hoca.isim= "ali ";
		hoca.Soyisim="koçak";
		hoca.tel=(double) 164582379;
		hoca.yaþ=45;
		hoca.öðrenciSayýsý=3;
		hoca.branþ="fizik hocalarý:";
		System.out.println("daniþman hoca isim    :" + hoca.isim);
		System.out.println("daniþman hoca soyisim :" + hoca.Soyisim);
		System.out.println("daniþman hoca tel     :" + hoca.tel);
		System.out.println("daniþman hoca yaþ     :" + hoca.yaþ);
		System.out.println("daniþman hoca öðrencisayýsý :" + hoca.öðrenciSayýsý);
		System.out.println("daniþman hoca branþ :" + hoca.branþ);
		System.out.println("***********************************************************************************");



		
	String c=	"\nisim    :" + ogr1.isim
		+"\nsoyisim :" + ogr1.Soyisim
	    +"\ntel     :" + ogr1.tel
		+"\nyaþ     :" + ogr1.yaþ
		+"\nortalama:" + ogr1.getOrtalama()
		+"\ndönem   :" + ogr1.getDönem()
		+"\ndaniþma hoca  :" + ogr1.getDanýþmaHocaÝsim()
		+"\nalabileceði kredi  :" + ogr1.getAlabileceðiToplaKredi()
		+"\nfazladan kredii aabilirmi :" + ogr1.KrediAlabilirmi(b)
		+"\n--------------------------------------------------\n"
		+ogr1.getHaftalýkÇalýþmaProgramý()
		+"\n--------------------------------------------------"
		+"\n***********************************************************************************";
	System.out.println(hoca.öðrenciBilgileriGöster(c));
	
	
	 c=	"\n isim    :" + ogr2.isim
			+"\nsoyisim :" + ogr2.Soyisim
		    +"\ntel     :" + ogr2.tel
			+"\nyaþ     :" + ogr2.yaþ
			+"\nortalama:" + ogr2.getOrtalama()
			+"\ndönem   :" + ogr2.getDönem()
			+"\ndaniþma hoca  :" + ogr2.getDanýþmaHocaÝsim()
			+"\nalabileceði kredi  :" + ogr2.getAlabileceðiToplaKredi()
			+"\nfazladan kredii aabilirmi :" + ogr2.KrediAlabilirmi(b)
			+"\n--------------------------------------------------\n"
			+ogr2.getHaftalýkÇalýþmaProgramý()
			+"\n--------------------------------------------------"
			+"\n***********************************************************************************";
		System.out.println(hoca.öðrenciBilgileriGöster(c));
		
		 c=	"\nisim    :" + ogr3.isim
				+"\nsoyisim :" + ogr3.Soyisim
			    +"\ntel     :" + ogr3.tel
				+"\nyaþ     :" + ogr3.yaþ
				+"\nortalama:" + ogr3.getOrtalama()
				+"\ndönem   :" + ogr3.getDönem()
				+"\ndaniþma hoca  :" + ogr3.getDanýþmaHocaÝsim()
				+"\nalabileceði kredi  :" + ogr3.getAlabileceðiToplaKredi()
				+"\nfazladan kredii aabilirmi :" + ogr3.KrediAlabilirmi(b)
				+"\n--------------------------------------------------\n"
				+ogr3.getHaftalýkÇalýþmaProgramý()
				+"\n--------------------------------------------------"
				+"\n***********************************************************************************";
			System.out.println(hoca.öðrenciBilgileriGöster(c));
			
			c=	"\nisim    :" + ogr4.isim
					+"\nsoyisim :" + ogr4.Soyisim
				    +"\ntel     :" + ogr4.tel
					+"\nyaþ     :" + ogr4.yaþ
					+"\nortalama:" + ogr4.getOrtalama()
					+"\ndönem   :" + ogr4.getDönem()
					+"\ndaniþma hoca  :" + ogr4.getDanýþmaHocaÝsim()
					+"\nalabileceði kredi  :" + ogr4.getAlabileceðiToplaKredi()
					+"\nfazladan kredii aabilirmi :" + ogr4.KrediAlabilirmi(b)
					+"\n--------------------------------------------------\n"
					+ogr4.getHaftalýkÇalýþmaProgramý()
					+"\n--------------------------------------------------"
					+"\n***********************************************************************************";
				System.out.println(hoca.öðrenciBilgileriGöster(c));
				
				c=	    "\nisim    :" + ogr5.isim
						+"\nsoyisim :" + ogr5.Soyisim
					    +"\ntel     :" + ogr5.tel
						+"\nyaþ     :" + ogr5.yaþ
						+"\nortalama:" + ogr5.getOrtalama()
						+"\ndönem   :" + ogr5.getDönem()
						+"\ndaniþma hoca  :" + ogr5.getDanýþmaHocaÝsim()
						+"\nalabileceði kredi  :" + ogr5.getAlabileceðiToplaKredi()
						+"\nfazladan kredii aabilirmi :" + ogr5.KrediAlabilirmi(b)
						+"\n--------------------------------------------------\n"
						+ogr5.getHaftalýkÇalýþmaProgramý()
						+"\n--------------------------------------------------"
						+"\n***********************************************************************************";
					System.out.println(hoca.öðrenciBilgileriGöster(c));
	
	/**
	 * 
	 * daniþman hoca öðrenciBilgilerinideðiþtir() metodu sayesinde istediði öðrencinin  bilgilerini deiþtirir.
	 * 
	 */
		double d;
		ogr1.setOrtalama(3.1);
		d=ogr1.getOrtalama();
		System.out.println("muhammed hamzanýn yeni notu         :" + hoca.öðrenciBilgilerinideðiþtir(d));
		ogr1.setAlabileceðiToplaKredi(30);
		d=ogr1.getAlabileceðiToplaKredi();
		System.out.println("öðrencinin alabileceði kredi sayýsý :"+hoca.öðrenciBilgilerinideðiþtir(d));
		System.out.println("öðrenciBilgilerinideðiþtir metdu kullanýlarak danýþman hoca istediðini öðrencinin bilgilerini  deðiþtirebilir.");
System.out.println("***************************************************************************");
	

öðrenci2 ogr6=new öðrenci2();
ogr6.isim="amhet ";
ogr6.Soyisim="sarýsungur";
ogr6.tel=(double) 123456789;
ogr6.yaþ=21;
 a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr6.setOrtalama(2.5);
 b= ogr6.getOrtalama();
ogr6.setDönem("3 güz dönemi");
ogr6.setAlabileceðiToplaKredi(50);
ogr6.setDanýþmaHocaÝsim("mahmut gül");
ogr6.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");
    

öðrenci2 ogr7=new öðrenci2();
ogr7.isim="mehmet ";
ogr7.Soyisim="nebi";
ogr7.tel=(double) 12695849;
ogr7.yaþ=24;
 a="pazartesi :" + "\t beden" +"\t kimya" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t fizik" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t fizik" + "\t matamatik";
ogr7.setOrtalama(4);
 b= ogr7.getOrtalama();
ogr7.setDönem("3 güz dönemi");
ogr7.setAlabileceðiToplaKredi(50);
ogr7.setDanýþmaHocaÝsim("mahmut gül");
ogr7.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");


öðrenci2 ogr8=new öðrenci2();
ogr8.isim="halil ibrahim ";
ogr8.Soyisim="sarýsungur";
ogr8.tel=(double) 1695841789;
ogr8.yaþ=21;
 a="pazartesi :" + "\t kültür" +"\t türkçe" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t türkçe " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t türkçe" +"\t kimya" + "\t matamatik";
ogr8.setOrtalama(3);
 b= ogr8.getOrtalama();
ogr8.setDönem("3 güz dönemi");
ogr8.setAlabileceðiToplaKredi(50);
ogr8.setDanýþmaHocaÝsim("mahmut gül");
ogr8.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");


öðrenci2 ogr9=new öðrenci2();
ogr9.isim="amhet ";
ogr9.Soyisim="sarýsungur";
ogr9.tel=(double) 126485989;
ogr9.yaþ=21;
 a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr9.setOrtalama(2.5);
 b= ogr9.getOrtalama();
ogr9.setDönem("3 güz dönemi");
ogr9.setAlabileceðiToplaKredi(50);
ogr9.setDanýþmaHocaÝsim("mahmut gül");
ogr9.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");


öðrenci2 ogr10=new öðrenci2();
ogr10.isim="amhet ";
ogr10.Soyisim="sarýsungur";
ogr10.tel=(double) 123164889;
ogr10.yaþ=21;
 a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr10.setOrtalama(3.9);
 b= ogr10.getOrtalama();
ogr10.setDönem("3 güz dönemi");
ogr10.setAlabileceðiToplaKredi(50);
ogr10.setDanýþmaHocaÝsim("mahmut gül");
ogr10.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");


DaniþmanHoca2 hoca2=new DaniþmanHoca2();
hoca2.isim= "mahmut ";
hoca2.Soyisim="gül";
hoca2.tel=(double) 164856679;
hoca2.yaþ=55;
hoca2.öðrenciSayýsý=5;
hoca2.branþ="kimya :";
System.out.println("daniþman hoca isim    :" + hoca2.isim);
System.out.println("daniþman hoca soyisim :" + hoca2.Soyisim);
System.out.println("daniþman hoca tel     :" + hoca2.tel);
System.out.println("daniþman hoca yaþ     :" + hoca2.yaþ);
System.out.println("daniþman hoca öðrencisayýsý :" + hoca2.öðrenciSayýsý);
System.out.println("daniþman hoca branþ :" + hoca2.branþ);
System.out.println("***********************************************************************************");

c=	"\nisim    :" + ogr6.isim
+"\nsoyisim :" + ogr6.Soyisim
+"\ntel     :" + ogr6.tel
+"\nyaþ     :" + ogr6.yaþ
+"\nortalama:" + ogr6.getOrtalama()
+"\ndönem   :" + ogr6.getDönem()
+"\ndaniþma hoca  :" + ogr6.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr6.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr6.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr6.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öðrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr7.isim
+"\nsoyisim :" + ogr7.Soyisim
+"\ntel     :" + ogr7.tel
+"\nyaþ     :" + ogr7.yaþ
+"\nortalama:" + ogr7.getOrtalama()
+"\ndönem   :" + ogr7.getDönem()
+"\ndaniþma hoca  :" + ogr7.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr7.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr7.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr7.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öðrenciBilgileriGöster(c));


c=	"\nisim    :" + ogr8.isim
+"\nsoyisim :" + ogr8.Soyisim
+"\ntel     :" + ogr8.tel
+"\nyaþ     :" + ogr8.yaþ
+"\nortalama:" + ogr8.getOrtalama()
+"\ndönem   :" + ogr8.getDönem()
+"\ndaniþma hoca  :" + ogr8.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr8.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr8.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr8.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öðrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr9.isim
+"\nsoyisim :" + ogr9.Soyisim
+"\ntel     :" + ogr9.tel
+"\nyaþ     :" + ogr9.yaþ
+"\nortalama:" + ogr9.getOrtalama()
+"\ndönem   :" + ogr9.getDönem()
+"\ndaniþma hoca  :" + ogr9.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr9.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr9.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr9.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öðrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr10.isim
+"\nsoyisim :" + ogr10.Soyisim
+"\ntel     :" + ogr10.tel
+"\nyaþ     :" + ogr10.yaþ
+"\nortalama:" + ogr10.getOrtalama()
+"\ndönem   :" + ogr10.getDönem()
+"\ndaniþma hoca  :" + ogr10.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr10.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr10.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr10.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.öðrenciBilgileriGöster(c));


	

/**
 * 
 * daniþman hoca öðrenciBilgilerinideðiþtir() metodu sayesinde istediði öðrencinin  bilgilerini deiþtirir.
 * 
 */
	


öðrenci3 ogr11=new öðrenci3();
ogr11.isim="ali ";
ogr11.Soyisim="koçat";
ogr11.tel=(double) 16245879;
ogr11.yaþ=18;
a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr11.setOrtalama(3.1);
b= ogr11.getOrtalama();
ogr11.setDönem("5 güz dönemi");
ogr11.setAlabileceðiToplaKredi(45);
ogr11.setDanýþmaHocaÝsim("esra tok");
ogr11.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");


öðrenci3 ogr12=new öðrenci3();
ogr12.isim="veysel ";
ogr12.Soyisim="kaya";
ogr12.tel=(double) 113465879;
ogr12.yaþ=23;
a="pazartesi :" + "\t beden" +"\t kimya" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t fizik" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t fizik" + "\t matamatik";
ogr12.setOrtalama(3.4);
b= ogr12.getOrtalama();
ogr12.setDönem("5 güz dönemi");
ogr12.setAlabileceðiToplaKredi(45);
ogr12.setDanýþmaHocaÝsim("esra yok");
ogr12.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");


öðrenci3 ogr13=new öðrenci3();
ogr13.isim="halil ibrahim ";
ogr13.Soyisim="maral";
ogr13.tel=(double) 685947213;
ogr13.yaþ=19;
a="pazartesi :" + "\t kültür" +"\t türkçe" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t türkçe " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t türkçe" +"\t kimya" + "\t matamatik";
ogr13.setOrtalama(3.6);
b= ogr13.getOrtalama();
ogr13.setDönem("5 güz dönemi");
ogr13.setAlabileceðiToplaKredi(45);
ogr13.setDanýþmaHocaÝsim("esra tok ");
ogr13.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");


öðrenci3 ogr14=new öðrenci3();
ogr14.isim="mustafa ";
ogr14.Soyisim="kaya";
ogr14.tel=(double) 678459231;
ogr14.yaþ=21;
a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr14.setOrtalama(1.8);
b= ogr14.getOrtalama();
ogr14.setDönem("5 güz dönemi");
ogr14.setAlabileceðiToplaKredi(45);
ogr14.setDanýþmaHocaÝsim("esar tok");
ogr14.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");


öðrenci3 ogr15=new öðrenci3();
ogr15.isim="muhammed avzem ";
ogr15.Soyisim="sarýsungur";
ogr15.tel=(double) 475826391;
ogr15.yaþ=21;
a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsalý      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n çarþamba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n perþembe :" +  "\t kimya" +"\t tarih" + "\t coðrafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr15.setOrtalama(2.9);
b= ogr15.getOrtalama();
ogr15.setDönem("5 güz dönemi");
ogr15.setAlabileceðiToplaKredi(45);
ogr15.setDanýþmaHocaÝsim("esra  tok");
ogr15.setHaftalýkÇalýþmaProgramý(a);
System.out.println("***********************************************************************************");


DanýþmanHoca3 hoca3=new DanýþmanHoca3();
hoca3.isim= "esra ";
hoca3.Soyisim="tok";
hoca3.tel=(double) 432516978;
hoca3.yaþ=35;
hoca3.öðrenciSayýsý=5;
hoca3.branþ="biyoloji :";
System.out.println("daniþman hoca isim    :" + hoca3.isim);
System.out.println("daniþman hoca soyisim :" + hoca3.Soyisim);
System.out.println("daniþman hoca tel     :" + hoca3.tel);
System.out.println("daniþman hoca yaþ     :" + hoca3.yaþ);
System.out.println("daniþman hoca öðrencisayýsý :" + hoca3.öðrenciSayýsý);
System.out.println("daniþman hoca branþ :" + hoca3.branþ);
System.out.println("***********************************************************************************");

c=	"\nisim    :" + ogr11.isim
+"\nsoyisim :" + ogr11.Soyisim
+"\ntel     :" + ogr11.tel
+"\nyaþ     :" + ogr11.yaþ
+"\nortalama:" + ogr11.getOrtalama()
+"\ndönem   :" + ogr11.getDönem()
+"\ndaniþma hoca  :" + ogr11.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr11.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr11.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr11.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öðrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr12.isim
+"\nsoyisim :" + ogr12.Soyisim
+"\ntel     :" + ogr12.tel
+"\nyaþ     :" + ogr12.yaþ
+"\nortalama:" + ogr12.getOrtalama()
+"\ndönem   :" + ogr12.getDönem()
+"\ndaniþma hoca  :" + ogr12.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr12.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr12.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr12.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öðrenciBilgileriGöster(c));


c=	"\nisim    :" + ogr13.isim
+"\nsoyisim :" + ogr13.Soyisim
+"\ntel     :" + ogr13.tel
+"\nyaþ     :" + ogr13.yaþ
+"\nortalama:" + ogr13.getOrtalama()
+"\ndönem   :" + ogr13.getDönem()
+"\ndaniþma hoca  :" + ogr13.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr13.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr13.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr13.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öðrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr14.isim
+"\nsoyisim :" + ogr14.Soyisim
+"\ntel     :" + ogr14.tel
+"\nyaþ     :" + ogr14.yaþ
+"\nortalama:" + ogr14.getOrtalama()
+"\ndönem   :" + ogr14.getDönem()
+"\ndaniþma hoca  :" + ogr14.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr14.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr14.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr14.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öðrenciBilgileriGöster(c));

c=	"\nisim    :" + ogr15.isim
+"\nsoyisim :" + ogr15.Soyisim
+"\ntel     :" + ogr15.tel
+"\nyaþ     :" + ogr15.yaþ
+"\nortalama:" + ogr15.getOrtalama()
+"\ndönem   :" + ogr15.getDönem()
+"\ndaniþma hoca  :" + ogr15.getDanýþmaHocaÝsim()
+"\nalabileceði kredi  :" + ogr15.getAlabileceðiToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr15.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr15.getHaftalýkÇalýþmaProgramý()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.öðrenciBilgileriGöster(c));


}



}







