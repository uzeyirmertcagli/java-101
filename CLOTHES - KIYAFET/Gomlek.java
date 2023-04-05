package X_HAFTA_KIYAFET;

public class Gomlek extends Kiyafet{

	public enum GomlekTipi{
		UZUNKOL(1),
		KISAKOL(2);
		public int id;
		GomlekTipi (int id){
			this.id=id;
		}
		public int getId() {
			return id;
		}
	}
	private GomlekTipi tip;
	private boolean cepliMi;
	
	public Gomlek(Renk renk, Kumas kumas, GomlekTipi tip , boolean cepliMi) {
		super(renk, kumas, fiyatBelirle(kumas,tip,cepliMi));
		this.tip=tip;
		this.cepliMi=cepliMi;
	}

	private static int fiyatBelirle(Kumas kumas, GomlekTipi tip, boolean cepliMi) {
	int fiyat;
	if(kumas.equals(Kumas.KADIFE)&& tip.equals(GomlekTipi.UZUNKOL))
		fiyat=600;
	else if(kumas.equals(Kumas.KADIFE)&& tip.equals(GomlekTipi.KISAKOL))
		fiyat=800;
	else if(kumas.equals(Kumas.PAMUK)&& tip.equals(GomlekTipi.UZUNKOL))
		fiyat=500;
	else if(kumas.equals(Kumas.PAMUK)&& tip.equals(GomlekTipi.KISAKOL))
		fiyat=700;
	else if(kumas.equals(Kumas.POLYESTER)&& tip.equals(GomlekTipi.UZUNKOL))
		fiyat=600;
	else if(kumas.equals(Kumas.POLYESTER)&& tip.equals(GomlekTipi.KISAKOL))
		fiyat=1000;
	else {
		fiyat=400;
		if(cepliMi)
			fiyat*=0.8;
	}
	
	return fiyat;
	}

	
}
