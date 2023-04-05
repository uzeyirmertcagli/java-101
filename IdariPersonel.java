package VIIII_CALISANLAR;

public class IdariPersonel extends CALISANLAR{
	public IdariPersonel(String ad, String soyad, int yas , int maas) {
		super(ad,soyad,yas,maas);
		zamOrani=15;
	}
	
	
	
	
	@Override
	public void bilgiler() {
		System.out.println("Ad :" + ad +" Soyad : " + soyad + " Yaþý : " + yas );
		System.out.println("Maaþ : " + maas);
		System.out.println("Zam Oraný : " + zamOrani);
		
	}


	@Override
	public void zamHesapla() {
		if(yas>40)
		maas=((maas*zamOrani)/100)+ maas+500;
		else
			maas=((maas*zamOrani)/100)+ maas+5;
		
	}

	
	}


