package X_HAFTA_KIYAFET;

import X_HAFTA_KIYAFET.Gomlek.GomlekTipi;
import X_HAFTA_KIYAFET.Kiyafet.Kumas;

public class Pantolon extends Kiyafet{

	public enum PantolonTip{
		TASLI(1),
		DUZ(2),
		YIRTIK(3);
		public int id;
		PantolonTip (int id){
			this.id=id;
		}
		public int getId() {
			return id;
		}
	}
	private PantolonTip PantolonTip;
	
	public Pantolon(Renk renk, Kumas kumas , PantolonTip PantolonTip) {
		super(renk, kumas, fiyatBelirle(kumas , PantolonTip));
		this.PantolonTip=PantolonTip;
	}
	private static int fiyatBelirle(Kumas kumas,PantolonTip PantolonTip) {
		int fiyat;
		if(kumas.equals(Kumas.KADIFE)&& PantolonTip.equals(PantolonTip.TASLI))
			fiyat=600;
		else if(kumas.equals(Kumas.KADIFE)&& PantolonTip.equals(PantolonTip.DUZ))
			fiyat=800;
		else if(kumas.equals(Kumas.KADIFE)&& PantolonTip.equals(PantolonTip.YIRTIK))
			fiyat=800;
		else if(kumas.equals(Kumas.PAMUK)&& PantolonTip.equals(PantolonTip.TASLI))
			fiyat=500;
		else if(kumas.equals(Kumas.PAMUK)&& PantolonTip.equals(PantolonTip.DUZ))
			fiyat=700;
		else if(kumas.equals(Kumas.PAMUK)&& PantolonTip.equals(PantolonTip.YIRTIK))
			fiyat=700;
		else if(kumas.equals(Kumas.POLYESTER)&& PantolonTip.equals(PantolonTip.TASLI))
			fiyat=600;
		else if(kumas.equals(Kumas.POLYESTER)&& PantolonTip.equals(PantolonTip.DUZ))
			fiyat=1000;
		else if(kumas.equals(Kumas.POLYESTER)&& PantolonTip.equals(PantolonTip.YIRTIK))
			fiyat=1000;
		else 
		
		return 500;
		return fiyat;
		}

		
	}

