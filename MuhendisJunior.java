package VIIII_CALISANLAR;

public class MuhendisJunior extends CALISANLAR {

	public MuhendisJunior(String ad, String soyad, int yas , int maas) {
		super(ad, soyad, yas, maas);
		zamOrani=20;
	}
	
	@Override
	public void bilgiler() {
		System.out.println("Ad :" + " Soyad : " + " Ya�� : " + yas );
		System.out.println("Maa� : " + maas);
		System.out.println("Zam Oran� : " + zamOrani);
		
	}

	@Override
	public void zamHesapla() {
		maas=((maas*zamOrani)/100)+ maas;
		
	}

	

}
