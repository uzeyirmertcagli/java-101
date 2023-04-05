package VIIII_BASKETBOL;

import java.util.ArrayList;

public class Basketbolcu extends InsanBasketbol{

	private ArrayList<String> mevkiler = new ArrayList<String>();
	private boolean sakatMi;
	private boolean cezaliMi;
	
	public Basketbolcu(String ad, String soyad ,  int yas, boolean sakatMi , boolean cezaliMi) {
		super(ad,soyad,yas);

		this.sakatMi=sakatMi;
		this.cezaliMi=cezaliMi;
		
		
	}
	
	public void mevkiEkle(String mevki) {
		this.mevkiler.add(mevki);
	}


	public ArrayList<String> getMevkiler() {
		return mevkiler;
	}

	public boolean isSakatMi() {
		return sakatMi;
	}

	public void setSakatMi(boolean sakatMi) {
		this.sakatMi = sakatMi;
	}

	public boolean isCezaliMi() {
		return cezaliMi;
	}

	public void setCezaliMi(boolean cezaliMi) {
		this.cezaliMi = cezaliMi;
	}

	public void setMevkiler(ArrayList<String> mevkiler) {
		this.mevkiler = mevkiler;
	}
}
