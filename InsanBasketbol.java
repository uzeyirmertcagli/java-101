package VIIII_BASKETBOL;

public abstract class InsanBasketbol {

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

	protected String ad;
	protected String soyad;
	protected int yas;
	
	public InsanBasketbol(String ad, String soyad , int yas) {
		this.ad=ad;
		this.soyad=soyad;
		this.yas=yas;
	}
}
