package VIIII_CALISANLAR;

public class MuhendisLead extends CALISANLAR{

	public MuhendisLead(String ad, String soyad, int yas , int maas) {
		super(ad,soyad,yas,maas);
		zamOrani=45;
	}
	
	
	
	
	@Override
	public void bilgiler() {
		System.out.println("Ad :" + ad +" Soyad : " + soyad + " Ya�� : " + yas );
		System.out.println("Maa� : " + maas);
		System.out.println("Zam Oran� : " + zamOrani);
		
	}


	@Override
	public void zamHesapla() {
		if(maas<20000)
		maas=((maas*zamOrani)/100)+ maas+5000;
		else
			maas=((maas*zamOrani)/100)+ maas+5;
		
	}

	
	}


