package VIIII_Mobilya;

public class Masa extends Mobilya {
	private int kisi;//tekli-uclu
	private boolean acilirMi;
	
	public Masa(String renk , int fiyat , int kisi , boolean acilirMi ) {
		this.renk=renk;
		this.kisi=kisi;
		this.acilirMi=acilirMi;
		this.fiyat=fiyatiGuncelle(renk,fiyat,kisi,acilirMi);
	}
	
	public int getKisi() {
		return kisi;
	}

	public void setKisi(int kisi) {
		this.kisi = kisi;
	}

	public boolean isAcilirMi() {
		return acilirMi;
	}

	public void setAcilirMi(boolean acilirMi) {
		this.acilirMi = acilirMi;
	}

	public static int fiyatiGuncelle(String renk , int fiyat , int kisi , boolean acilirMi ) {
		if (acilirMi==true) {
			return 1500;
		}
		return fiyat;
	}
	
	@Override
	public void bilgiler() {
		System.out.println("Masa Kiþi Sayýsý :  " + kisi);
		System.out.println("Masa Rengi : " + renk);
		System.out.println("Masa Açýlýyor Mu? : " + (acilirMi==true?"EVET":"HAYIR"));
		System.out.println("Fiyat : " + fiyat);
		System.out.println("------------------");
	}
}
