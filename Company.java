package VIIII_CALISANLAR;

import java.util.ArrayList;

public class Company {

	private String sirketAdi ;
	private String sirketAdres;
	private ArrayList<CALISANLAR>calisanlar = new ArrayList<CALISANLAR>();
	
	public void calisanEkle(CALISANLAR yeniCalisanlar) {
		calisanlar.add(yeniCalisanlar);
	}
	
	public void tumCalisanBilgileri() {
		for(CALISANLAR c : calisanlar)
		c.bilgiler();
	}
	
	public void sirketeZamYap() {
		for(CALISANLAR zamYap : calisanlar)
			zamYap.zamHesapla();
	}
	
	public String getSirketAdi() {
		return sirketAdi;
	}

	public void setSirketAdi(String sirketAdi) {
		this.sirketAdi = sirketAdi;
	}

	public String getSirketAdres() {
		return sirketAdres;
	}

	public void setSirketAdres(String sirketAdres) {
		this.sirketAdres = sirketAdres;
	}

	public ArrayList<CALISANLAR> getCalisanlar() {
		return calisanlar;
	}

	public void setCalisanlar(ArrayList<CALISANLAR> calisanlar) {
		this.calisanlar = calisanlar;
	}

	public Company (String sirketAdi , String sirketAdres ) {
		this.sirketAdi=sirketAdi;
		this.sirketAdres=sirketAdres;
	}
}
	
	

	
	