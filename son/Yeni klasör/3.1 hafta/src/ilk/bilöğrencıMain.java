package ilk;

public class bilöðrencýMain {

	public static void main(String[] args) {
		
		Bilöðrencý ogr1,ogr2,ogr3;
		
		ogr1=new Bilöðrencý("ahmet",1234);
		ogr2=new Bilöðrencý("mehmet",1235);

		ogr1.labarkadaþýata(ogr2);
		ogr2.labarkadaþýata(ogr1);
		
		ogr3=new Bilöðrencý ("elif",1236);
	}

}
