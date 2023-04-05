package VIIII_CALISANLAR;

public class MuhendisJunior extends CALISANLAR {

	public MuhendisJunior(String ad, String soyad, int yas , int maas) {
		super(ad, soyad, yas, maas);
		zamOrani=20;
	}
	
	@Override
	public void bilgiler() {
		System.out.println("Ad :" + " Soyad : " + " Yaþý : " + yas );
		System.out.println("Maaþ : " + maas);
		System.out.println("Zam Oraný : " + zamOrani);
		
	}

	@Override
	public void zamHesapla() {
		maas=((maas*zamOrani)/100)+ maas;
		
	}

	

}
