package �dev10;

public class demo {

	public static void main(String[] args) {
	
		��renci1 ogr1=new ��renci1();
		ogr1.isim="muhammed hamza ";
		ogr1.Soyisim="maral";
		ogr1.tel=(double) 123456789;
		ogr1.ya�=21;
		String a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr1.setOrtalama(2.5);
		 double b= ogr1.getOrtalama();
		ogr1.setD�nem("1 g�z d�nemi");
		ogr1.setAlabilece�iToplaKredi(40);
		ogr1.setDan��maHoca�sim("ali ko�ak");
		ogr1.setHaftal�k�al��maProgram�(a);

		
		
	/*	System.out.println("isim    :" + ogr1.isim);
		System.out.println("soyisim :" + ogr1.Soyisim);
		System.out.println("tel     :" + ogr1.tel);
		System.out.println("ya�     :" + ogr1.ya�);
		System.out.println("ortalama:" + ogr1.getOrtalama());
		System.out.println("d�nem   :" + ogr1.getD�nem());
		System.out.println("dani�ma hoca  :" + ogr1.getDan��maHoca�sim());
		System.out.println("alabilece�i kredi  :" + ogr1.getAlabilece�iToplaKredi());
		System.out.println("fazladan kredii aabilirmi :" + ogr1.KrediAlabilirmi(b));
		System.out.println("--------------------------------------------------");
		System.out.println(ogr1.getHaftal�k�al��maProgram�());
		System.out.println("--------------------------------------------------");
		System.out.println("***********************************************************************************");*/
		
		
		��renci2 ogr2=new ��renci2();
		ogr2.isim="muhammed ensar ";
		ogr2.Soyisim="maral";
		ogr2.tel=(double) 126485389;
		ogr2.ya�=19;
		 a="pazartesi :" + "\t fizik" +"\t beden" + "\t matamatik" + "\nsal�      :" +  "\t tarih" +"\t beden" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr2.setOrtalama(3.6);
	    b= ogr2.getOrtalama();
		ogr2.setD�nem("1 g�z d�nemi");
		ogr2.setAlabilece�iToplaKredi(40);
		ogr2.setDan��maHoca�sim("ali ko�ak");
		ogr2.setHaftal�k�al��maProgram�(a);
		
	

		��renci3 ogr3=new ��renci3();
		ogr3.isim="muhammed cihat ";
		ogr3.Soyisim="maral";
		ogr3.tel=(double) 122814989;
		ogr3.ya�=20;
		 a="pazartesi :" + "\t fizik" +"\t beden" + "\t matamatik" + "\nsal�      :" +  "\t tarih" +"\t beden" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr3.setOrtalama(1.5);
	    b= ogr3.getOrtalama();
		ogr3.setD�nem("1 g�z d�nemi");
		ogr3.setAlabilece�iToplaKredi(40);
		ogr3.setDan��maHoca�sim("ali ko�ak");
		ogr3.setHaftal�k�al��maProgram�(a);
		
		
		��renci4 ogr4=new ��renci4();
		ogr4.isim="ammar ";
		ogr4.Soyisim="maral";
		ogr4.tel=(double) 1224658759;
		ogr4.ya�=21;
		 a="pazartesi :" + "\t kimya" +"\t beden" + "\t matamatik" + "\nsal�      :" +  "\t tarih" +"\t fizik" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n per�embe :" +  "\t beden" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t tarih" +"\t kimya" + "\t matamatik";
		ogr4.setOrtalama(3.7);
	    b= ogr4.getOrtalama();
		ogr4.setD�nem("1 g�z d�nemi");
		ogr4.setAlabilece�iToplaKredi(40);
		ogr4.setDan��maHoca�sim("ali ko�ak");
		ogr4.setHaftal�k�al��maProgram�(a);
		
		
		
		��renci5 ogr5=new ��renci5();
		ogr5.isim="hasan ";
		ogr5.Soyisim="maral";
		ogr5.tel=(double) 116253489;
		ogr5.ya�=22;
		 a="pazartesi :" + "\t fizik" +"\t beden" + "\t matamatik" + "\nsal�      :" +  "\t tarih" +"\t beden" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
		+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
		ogr5.setOrtalama(3.2);
	    b= ogr5.getOrtalama();
		ogr5.setD�nem("1 g�z d�nemi");
		ogr5.setAlabilece�iToplaKredi(40);
		ogr5.setDan��maHoca�sim("ali ko�ak");
		ogr5.setHaftal�k�al��maProgram�(a);
		/**
		 *Dan��man hoca t�m ��rencilerine ula�abiliyor.
		 *
		 *dan��man hoca ��renciBilgileriG�ster metodu kullan�larak  ��rencinin bilgilerini g�sterir.
		 *
		 */
		
		Dan��manHoca1 hoca=new Dan��manHoca1();
		hoca.isim= "ali ";
		hoca.Soyisim="ko�ak";
		hoca.tel=(double) 164582379;
		hoca.ya�=45;
		hoca.��renciSay�s�=3;
		hoca.bran�="fizik hocalar�:";
		System.out.println("dani�man hoca isim    :" + hoca.isim);
		System.out.println("dani�man hoca soyisim :" + hoca.Soyisim);
		System.out.println("dani�man hoca tel     :" + hoca.tel);
		System.out.println("dani�man hoca ya�     :" + hoca.ya�);
		System.out.println("dani�man hoca ��rencisay�s� :" + hoca.��renciSay�s�);
		System.out.println("dani�man hoca bran� :" + hoca.bran�);
		System.out.println("***********************************************************************************");



		
	String c=	"\nisim    :" + ogr1.isim
		+"\nsoyisim :" + ogr1.Soyisim
	    +"\ntel     :" + ogr1.tel
		+"\nya�     :" + ogr1.ya�
		+"\nortalama:" + ogr1.getOrtalama()
		+"\nd�nem   :" + ogr1.getD�nem()
		+"\ndani�ma hoca  :" + ogr1.getDan��maHoca�sim()
		+"\nalabilece�i kredi  :" + ogr1.getAlabilece�iToplaKredi()
		+"\nfazladan kredii aabilirmi :" + ogr1.KrediAlabilirmi(b)
		+"\n--------------------------------------------------\n"
		+ogr1.getHaftal�k�al��maProgram�()
		+"\n--------------------------------------------------"
		+"\n***********************************************************************************";
	System.out.println(hoca.��renciBilgileriG�ster(c));
	
	
	 c=	"\n isim    :" + ogr2.isim
			+"\nsoyisim :" + ogr2.Soyisim
		    +"\ntel     :" + ogr2.tel
			+"\nya�     :" + ogr2.ya�
			+"\nortalama:" + ogr2.getOrtalama()
			+"\nd�nem   :" + ogr2.getD�nem()
			+"\ndani�ma hoca  :" + ogr2.getDan��maHoca�sim()
			+"\nalabilece�i kredi  :" + ogr2.getAlabilece�iToplaKredi()
			+"\nfazladan kredii aabilirmi :" + ogr2.KrediAlabilirmi(b)
			+"\n--------------------------------------------------\n"
			+ogr2.getHaftal�k�al��maProgram�()
			+"\n--------------------------------------------------"
			+"\n***********************************************************************************";
		System.out.println(hoca.��renciBilgileriG�ster(c));
		
		 c=	"\nisim    :" + ogr3.isim
				+"\nsoyisim :" + ogr3.Soyisim
			    +"\ntel     :" + ogr3.tel
				+"\nya�     :" + ogr3.ya�
				+"\nortalama:" + ogr3.getOrtalama()
				+"\nd�nem   :" + ogr3.getD�nem()
				+"\ndani�ma hoca  :" + ogr3.getDan��maHoca�sim()
				+"\nalabilece�i kredi  :" + ogr3.getAlabilece�iToplaKredi()
				+"\nfazladan kredii aabilirmi :" + ogr3.KrediAlabilirmi(b)
				+"\n--------------------------------------------------\n"
				+ogr3.getHaftal�k�al��maProgram�()
				+"\n--------------------------------------------------"
				+"\n***********************************************************************************";
			System.out.println(hoca.��renciBilgileriG�ster(c));
			
			c=	"\nisim    :" + ogr4.isim
					+"\nsoyisim :" + ogr4.Soyisim
				    +"\ntel     :" + ogr4.tel
					+"\nya�     :" + ogr4.ya�
					+"\nortalama:" + ogr4.getOrtalama()
					+"\nd�nem   :" + ogr4.getD�nem()
					+"\ndani�ma hoca  :" + ogr4.getDan��maHoca�sim()
					+"\nalabilece�i kredi  :" + ogr4.getAlabilece�iToplaKredi()
					+"\nfazladan kredii aabilirmi :" + ogr4.KrediAlabilirmi(b)
					+"\n--------------------------------------------------\n"
					+ogr4.getHaftal�k�al��maProgram�()
					+"\n--------------------------------------------------"
					+"\n***********************************************************************************";
				System.out.println(hoca.��renciBilgileriG�ster(c));
				
				c=	    "\nisim    :" + ogr5.isim
						+"\nsoyisim :" + ogr5.Soyisim
					    +"\ntel     :" + ogr5.tel
						+"\nya�     :" + ogr5.ya�
						+"\nortalama:" + ogr5.getOrtalama()
						+"\nd�nem   :" + ogr5.getD�nem()
						+"\ndani�ma hoca  :" + ogr5.getDan��maHoca�sim()
						+"\nalabilece�i kredi  :" + ogr5.getAlabilece�iToplaKredi()
						+"\nfazladan kredii aabilirmi :" + ogr5.KrediAlabilirmi(b)
						+"\n--------------------------------------------------\n"
						+ogr5.getHaftal�k�al��maProgram�()
						+"\n--------------------------------------------------"
						+"\n***********************************************************************************";
					System.out.println(hoca.��renciBilgileriG�ster(c));
	
	/**
	 * 
	 * dani�man hoca ��renciBilgilerinide�i�tir() metodu sayesinde istedi�i ��rencinin  bilgilerini dei�tirir.
	 * 
	 */
		double d;
		ogr1.setOrtalama(3.1);
		d=ogr1.getOrtalama();
		System.out.println("muhammed hamzan�n yeni notu         :" + hoca.��renciBilgilerinide�i�tir(d));
		ogr1.setAlabilece�iToplaKredi(30);
		d=ogr1.getAlabilece�iToplaKredi();
		System.out.println("��rencinin alabilece�i kredi say�s� :"+hoca.��renciBilgilerinide�i�tir(d));
		System.out.println("��renciBilgilerinide�i�tir metdu kullan�larak dan��man hoca istedi�ini ��rencinin bilgilerini  de�i�tirebilir.");
System.out.println("***************************************************************************");
	

��renci2 ogr6=new ��renci2();
ogr6.isim="amhet ";
ogr6.Soyisim="sar�sungur";
ogr6.tel=(double) 123456789;
ogr6.ya�=21;
 a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr6.setOrtalama(2.5);
 b= ogr6.getOrtalama();
ogr6.setD�nem("3 g�z d�nemi");
ogr6.setAlabilece�iToplaKredi(50);
ogr6.setDan��maHoca�sim("mahmut g�l");
ogr6.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");
    

��renci2 ogr7=new ��renci2();
ogr7.isim="mehmet ";
ogr7.Soyisim="nebi";
ogr7.tel=(double) 12695849;
ogr7.ya�=24;
 a="pazartesi :" + "\t beden" +"\t kimya" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t fizik" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t fizik" + "\t matamatik";
ogr7.setOrtalama(4);
 b= ogr7.getOrtalama();
ogr7.setD�nem("3 g�z d�nemi");
ogr7.setAlabilece�iToplaKredi(50);
ogr7.setDan��maHoca�sim("mahmut g�l");
ogr7.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");


��renci2 ogr8=new ��renci2();
ogr8.isim="halil ibrahim ";
ogr8.Soyisim="sar�sungur";
ogr8.tel=(double) 1695841789;
ogr8.ya�=21;
 a="pazartesi :" + "\t k�lt�r" +"\t t�rk�e" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t t�rk�e " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t t�rk�e" +"\t kimya" + "\t matamatik";
ogr8.setOrtalama(3);
 b= ogr8.getOrtalama();
ogr8.setD�nem("3 g�z d�nemi");
ogr8.setAlabilece�iToplaKredi(50);
ogr8.setDan��maHoca�sim("mahmut g�l");
ogr8.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");


��renci2 ogr9=new ��renci2();
ogr9.isim="amhet ";
ogr9.Soyisim="sar�sungur";
ogr9.tel=(double) 126485989;
ogr9.ya�=21;
 a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr9.setOrtalama(2.5);
 b= ogr9.getOrtalama();
ogr9.setD�nem("3 g�z d�nemi");
ogr9.setAlabilece�iToplaKredi(50);
ogr9.setDan��maHoca�sim("mahmut g�l");
ogr9.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");


��renci2 ogr10=new ��renci2();
ogr10.isim="amhet ";
ogr10.Soyisim="sar�sungur";
ogr10.tel=(double) 123164889;
ogr10.ya�=21;
 a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr10.setOrtalama(3.9);
 b= ogr10.getOrtalama();
ogr10.setD�nem("3 g�z d�nemi");
ogr10.setAlabilece�iToplaKredi(50);
ogr10.setDan��maHoca�sim("mahmut g�l");
ogr10.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");


Dani�manHoca2 hoca2=new Dani�manHoca2();
hoca2.isim= "mahmut ";
hoca2.Soyisim="g�l";
hoca2.tel=(double) 164856679;
hoca2.ya�=55;
hoca2.��renciSay�s�=5;
hoca2.bran�="kimya :";
System.out.println("dani�man hoca isim    :" + hoca2.isim);
System.out.println("dani�man hoca soyisim :" + hoca2.Soyisim);
System.out.println("dani�man hoca tel     :" + hoca2.tel);
System.out.println("dani�man hoca ya�     :" + hoca2.ya�);
System.out.println("dani�man hoca ��rencisay�s� :" + hoca2.��renciSay�s�);
System.out.println("dani�man hoca bran� :" + hoca2.bran�);
System.out.println("***********************************************************************************");

c=	"\nisim    :" + ogr6.isim
+"\nsoyisim :" + ogr6.Soyisim
+"\ntel     :" + ogr6.tel
+"\nya�     :" + ogr6.ya�
+"\nortalama:" + ogr6.getOrtalama()
+"\nd�nem   :" + ogr6.getD�nem()
+"\ndani�ma hoca  :" + ogr6.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr6.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr6.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr6.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.��renciBilgileriG�ster(c));

c=	"\nisim    :" + ogr7.isim
+"\nsoyisim :" + ogr7.Soyisim
+"\ntel     :" + ogr7.tel
+"\nya�     :" + ogr7.ya�
+"\nortalama:" + ogr7.getOrtalama()
+"\nd�nem   :" + ogr7.getD�nem()
+"\ndani�ma hoca  :" + ogr7.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr7.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr7.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr7.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.��renciBilgileriG�ster(c));


c=	"\nisim    :" + ogr8.isim
+"\nsoyisim :" + ogr8.Soyisim
+"\ntel     :" + ogr8.tel
+"\nya�     :" + ogr8.ya�
+"\nortalama:" + ogr8.getOrtalama()
+"\nd�nem   :" + ogr8.getD�nem()
+"\ndani�ma hoca  :" + ogr8.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr8.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr8.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr8.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.��renciBilgileriG�ster(c));

c=	"\nisim    :" + ogr9.isim
+"\nsoyisim :" + ogr9.Soyisim
+"\ntel     :" + ogr9.tel
+"\nya�     :" + ogr9.ya�
+"\nortalama:" + ogr9.getOrtalama()
+"\nd�nem   :" + ogr9.getD�nem()
+"\ndani�ma hoca  :" + ogr9.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr9.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr9.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr9.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.��renciBilgileriG�ster(c));

c=	"\nisim    :" + ogr10.isim
+"\nsoyisim :" + ogr10.Soyisim
+"\ntel     :" + ogr10.tel
+"\nya�     :" + ogr10.ya�
+"\nortalama:" + ogr10.getOrtalama()
+"\nd�nem   :" + ogr10.getD�nem()
+"\ndani�ma hoca  :" + ogr10.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr10.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr10.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr10.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca2.��renciBilgileriG�ster(c));


	

/**
 * 
 * dani�man hoca ��renciBilgilerinide�i�tir() metodu sayesinde istedi�i ��rencinin  bilgilerini dei�tirir.
 * 
 */
	


��renci3 ogr11=new ��renci3();
ogr11.isim="ali ";
ogr11.Soyisim="ko�at";
ogr11.tel=(double) 16245879;
ogr11.ya�=18;
a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr11.setOrtalama(3.1);
b= ogr11.getOrtalama();
ogr11.setD�nem("5 g�z d�nemi");
ogr11.setAlabilece�iToplaKredi(45);
ogr11.setDan��maHoca�sim("esra tok");
ogr11.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");


��renci3 ogr12=new ��renci3();
ogr12.isim="veysel ";
ogr12.Soyisim="kaya";
ogr12.tel=(double) 113465879;
ogr12.ya�=23;
a="pazartesi :" + "\t beden" +"\t kimya" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t fizik" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t fizik" + "\t matamatik";
ogr12.setOrtalama(3.4);
b= ogr12.getOrtalama();
ogr12.setD�nem("5 g�z d�nemi");
ogr12.setAlabilece�iToplaKredi(45);
ogr12.setDan��maHoca�sim("esra yok");
ogr12.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");


��renci3 ogr13=new ��renci3();
ogr13.isim="halil ibrahim ";
ogr13.Soyisim="maral";
ogr13.tel=(double) 685947213;
ogr13.ya�=19;
a="pazartesi :" + "\t k�lt�r" +"\t t�rk�e" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t t�rk�e " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t t�rk�e" +"\t kimya" + "\t matamatik";
ogr13.setOrtalama(3.6);
b= ogr13.getOrtalama();
ogr13.setD�nem("5 g�z d�nemi");
ogr13.setAlabilece�iToplaKredi(45);
ogr13.setDan��maHoca�sim("esra tok ");
ogr13.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");


��renci3 ogr14=new ��renci3();
ogr14.isim="mustafa ";
ogr14.Soyisim="kaya";
ogr14.tel=(double) 678459231;
ogr14.ya�=21;
a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr14.setOrtalama(1.8);
b= ogr14.getOrtalama();
ogr14.setD�nem("5 g�z d�nemi");
ogr14.setAlabilece�iToplaKredi(45);
ogr14.setDan��maHoca�sim("esar tok");
ogr14.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");


��renci3 ogr15=new ��renci3();
ogr15.isim="muhammed avzem ";
ogr15.Soyisim="sar�sungur";
ogr15.tel=(double) 475826391;
ogr15.ya�=21;
a="pazartesi :" + "\t fizik" +"\t kimya" + "\t biyoloji" + "\nsal�      :" +  "\t tarih" +"\t kimya" + "\t biyoloji"+ "\n �ar�amba :" +  "\t fizik " +"\t kimya" + "\t matamatik"
+ "\n per�embe :" +  "\t kimya" +"\t tarih" + "\t co�rafya"+ "\ncuma      :" +  "\t fizik" +"\t kimya" + "\t matamatik";
ogr15.setOrtalama(2.9);
b= ogr15.getOrtalama();
ogr15.setD�nem("5 g�z d�nemi");
ogr15.setAlabilece�iToplaKredi(45);
ogr15.setDan��maHoca�sim("esra  tok");
ogr15.setHaftal�k�al��maProgram�(a);
System.out.println("***********************************************************************************");


Dan��manHoca3 hoca3=new Dan��manHoca3();
hoca3.isim= "esra ";
hoca3.Soyisim="tok";
hoca3.tel=(double) 432516978;
hoca3.ya�=35;
hoca3.��renciSay�s�=5;
hoca3.bran�="biyoloji :";
System.out.println("dani�man hoca isim    :" + hoca3.isim);
System.out.println("dani�man hoca soyisim :" + hoca3.Soyisim);
System.out.println("dani�man hoca tel     :" + hoca3.tel);
System.out.println("dani�man hoca ya�     :" + hoca3.ya�);
System.out.println("dani�man hoca ��rencisay�s� :" + hoca3.��renciSay�s�);
System.out.println("dani�man hoca bran� :" + hoca3.bran�);
System.out.println("***********************************************************************************");

c=	"\nisim    :" + ogr11.isim
+"\nsoyisim :" + ogr11.Soyisim
+"\ntel     :" + ogr11.tel
+"\nya�     :" + ogr11.ya�
+"\nortalama:" + ogr11.getOrtalama()
+"\nd�nem   :" + ogr11.getD�nem()
+"\ndani�ma hoca  :" + ogr11.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr11.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr11.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr11.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.��renciBilgileriG�ster(c));

c=	"\nisim    :" + ogr12.isim
+"\nsoyisim :" + ogr12.Soyisim
+"\ntel     :" + ogr12.tel
+"\nya�     :" + ogr12.ya�
+"\nortalama:" + ogr12.getOrtalama()
+"\nd�nem   :" + ogr12.getD�nem()
+"\ndani�ma hoca  :" + ogr12.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr12.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr12.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr12.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.��renciBilgileriG�ster(c));


c=	"\nisim    :" + ogr13.isim
+"\nsoyisim :" + ogr13.Soyisim
+"\ntel     :" + ogr13.tel
+"\nya�     :" + ogr13.ya�
+"\nortalama:" + ogr13.getOrtalama()
+"\nd�nem   :" + ogr13.getD�nem()
+"\ndani�ma hoca  :" + ogr13.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr13.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr13.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr13.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.��renciBilgileriG�ster(c));

c=	"\nisim    :" + ogr14.isim
+"\nsoyisim :" + ogr14.Soyisim
+"\ntel     :" + ogr14.tel
+"\nya�     :" + ogr14.ya�
+"\nortalama:" + ogr14.getOrtalama()
+"\nd�nem   :" + ogr14.getD�nem()
+"\ndani�ma hoca  :" + ogr14.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr14.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr14.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr14.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.��renciBilgileriG�ster(c));

c=	"\nisim    :" + ogr15.isim
+"\nsoyisim :" + ogr15.Soyisim
+"\ntel     :" + ogr15.tel
+"\nya�     :" + ogr15.ya�
+"\nortalama:" + ogr15.getOrtalama()
+"\nd�nem   :" + ogr15.getD�nem()
+"\ndani�ma hoca  :" + ogr15.getDan��maHoca�sim()
+"\nalabilece�i kredi  :" + ogr15.getAlabilece�iToplaKredi()
+"\nfazladan kredii aabilirmi :" + ogr15.KrediAlabilirmi(b)
+"\n--------------------------------------------------\n"
+ogr15.getHaftal�k�al��maProgram�()
+"\n--------------------------------------------------"
+"\n***********************************************************************************";
System.out.println(hoca3.��renciBilgileriG�ster(c));


}



}







