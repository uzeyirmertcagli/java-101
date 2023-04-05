package VIIII_Mobilya;

public abstract class Mobilya {
	
	protected String renk;
	protected int fiyat;

	
	
	public abstract void bilgiler();
	
	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
