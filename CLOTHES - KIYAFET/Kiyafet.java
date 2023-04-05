package X_HAFTA_KIYAFET;
public abstract class Kiyafet {
	public enum Renk {
		SIYAH(1),
		MAVI(2),
		SARI(3),
		BEYAZ(4),
		KIRMIZI(5);

		public int id;

		Renk(int id) {
			this.id = id;
		}
		public int getId() {
			return id;
		}
	}
	public enum Kumas{
		PAMUK("PA"),
		POLYESTER("PO"),
		KADIFE("K");
		
		public String tip;
		
		Kumas(String tip){
			this.tip=tip;
		}
		public String getTip() {
			return tip;
		}
	}

	protected Renk renk;
	protected Kumas kumas;
	protected int fiyat;
	
	public Kiyafet(Renk renk , Kumas kumas , int fiyat) {
		this.renk=renk;
		this.kumas=kumas;
		this.fiyat=fiyat;
	}

	public Renk getRenk() {
		return renk;
	}

	public void setRenk(Renk renk) {
		this.renk = renk;
	}

	public Kumas getKumas() {
		return kumas;
	}

	public void setKumas(Kumas kumas) {
		this.kumas = kumas;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

}
