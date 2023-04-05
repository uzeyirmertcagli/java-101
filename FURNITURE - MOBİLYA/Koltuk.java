package VIIII_Mobilya;

public class Koltuk  extends Mobilya{

	private String koltukTipi;//tekli-uclu
	private String modeli;
	private String kumas;
	private int fiyat;
	
	public Koltuk(String renk , String koltukTipi , String modeli , String kumas , int fiyat ) {
		this.renk=renk;
		this.koltukTipi=koltukTipi;
		this.modeli=modeli;
		this.kumas=kumas;
		this.fiyat=fiyatHesapla( renk ,koltukTipi , modeli ,kumas ,fiyat );
		
	}
	
	public static int fiyatHesapla(String renk , String koltukTipi , String modeli , String kumas , int fiyat ) {
		if (koltukTipi.equals("Üçlü")) {
			return fiyat*2;
		}else {
				return fiyat;
		}
		}
	
	
	@Override
	public void bilgiler() {
		
		System.out.println("Koltuk Tipi : " + koltukTipi);
		System.out.println("Koltuk Rengi : " + renk);
		System.out.println("Koltuk Modeli : " + modeli);
		System.out.println("Koltuk Kumaþý : " + kumas);
		System.out.println("Fiyat : " + fiyat);
		System.out.println("------------------");
		
		
	}

	public String getKoltukTipi() {
		return koltukTipi;
	}

	public void setKoltukTipi(String koltukTipi) {
		this.koltukTipi = koltukTipi;
	}

	public String getModeli() {
		return modeli;
	}

	public void setModeli(String modeli) {
		this.modeli = modeli;
	}

	public String getKumas() {
		return kumas;
	}

	public void setKumas(String kumas) {
		this.kumas = kumas;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

}
