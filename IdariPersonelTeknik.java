package VIIII_CALISANLAR;

public class IdariPersonelTeknik extends CALISANLAR{

	public IdariPersonelTeknik(String ad, String soyad, int yas , int maas) {
		super(ad,soyad,yas,maas);
		zamOrani=25;
	}
	
	
	
	
	@Override
	public void bilgiler() {
		System.out.println("Ad :" + ad +" Soyad : " + soyad + " Ya�� : " + yas );
		System.out.println("Maa� : " + maas);
		System.out.println("Zam Oran� : " + zamOrani);
		
	}


	@Override
	public void zamHesapla() {
		maas=((maas*zamOrani)/100)+ maas+1000;
		
	}

	
	}


