package VIIII_Mobilya;

public class Sandalye extends Mobilya{
	private String donme;//tekli-uclu
	private String modeli;

	
	public Sandalye(String renk , String donme , String modeli , int fiyat ) {
		this.renk=renk;
		this.donme=donme;
		this.modeli=modeli;
		this.fiyat=fiyatGuncelle(renk,donme,modeli,fiyat);
	}
	
	public static int fiyatGuncelle(String renk , String donme , String modeli , int fiyat ) {
		if(donme.equals("Dönmeli")) {
			return 1600;
		}else {
			return fiyat;
		}
	}
	
	@Override
	public void bilgiler() {
		System.out.println("SANDALYE");
		System.out.println("Sandalye Dönme Tipi : " + donme);
		System.out.println("Sandalye Rengi : " + renk);
		System.out.println("Sandalye Modeli : " + modeli);
		System.out.println("Fiyat : " + fiyat);
		System.out.println("------------------");
		
		
	}
	
	
	
	
	public String getDonme() {
		return donme;
	}
	public void setDonme(String donme) {
		this.donme = donme;
	}
	public String getModeli() {
		return modeli;
	}
	public void setModeli(String modeli) {
		this.modeli = modeli;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}


}
