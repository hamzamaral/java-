package bahardönemi;

public class Müzik extends Medya {

	

	@Override
	public void isim(String k) {
		medyabaşlığı=k;
		System.out.println("isim"+medyabaşlığı);

			
		}

		@Override
		public void yıl(int y) {
			çıkışyılı=y;
			System.out.println("yıl"+çıkışyılı);
		}
		
		@Override
		public void adet(int l) {
			satışadedi=l;
			System.out.println("adet"+satışadedi);

			
		}

}
