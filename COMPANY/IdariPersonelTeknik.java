package VIIII_CALISANLAR;

public class IdariPersonelTeknik extends CALISANLAR{

	public IdariPersonelTeknik(String ad, String soyad, int yas , int maas) {
		super(ad,soyad,yas,maas);
		zamOrani=25;
	}
	
	
	
	
	@Override
	public void bilgiler() {
		System.out.println("Ad :" + ad +" Soyad : " + soyad + " Yaþý : " + yas );
		System.out.println("Maaþ : " + maas);
		System.out.println("Zam Oraný : " + zamOrani);
		
	}


	@Override
	public void zamHesapla() {
		maas=((maas*zamOrani)/100)+ maas+1000;
		
	}

	
	}


