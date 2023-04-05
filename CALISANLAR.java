package VIIII_CALISANLAR;

public abstract class CALISANLAR {

	protected String ad;
	protected String soyad;
	protected int yas;
	protected int maas;
	protected int zamOrani;
	
	public CALISANLAR(String ad, String soyad, int yas , int maas) {
		this.ad=ad;
		this.soyad=soyad;
		this.yas=yas;
		this.maas=maas;
		
	}
	
	
	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public int getMaas() {
		return maas;
	}


	public void setMaas(int maas) {
		this.maas = maas;
	}

	

	public abstract void bilgiler();
	public abstract void zamHesapla();
	
}
