package VIIII_CALISANLAR;

public class MuhendisLead extends CALISANLAR{

	public MuhendisLead(String ad, String soyad, int yas , int maas) {
		super(ad,soyad,yas,maas);
		zamOrani=45;
	}
	
	
	
	
	@Override
	public void bilgiler() {
		System.out.println("Ad :" + ad +" Soyad : " + soyad + " Yaþý : " + yas );
		System.out.println("Maaþ : " + maas);
		System.out.println("Zam Oraný : " + zamOrani);
		
	}


	@Override
	public void zamHesapla() {
		if(maas<20000)
		maas=((maas*zamOrani)/100)+ maas+5000;
		else
			maas=((maas*zamOrani)/100)+ maas+5;
		
	}

	
	}


