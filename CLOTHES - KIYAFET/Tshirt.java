package X_HAFTA_KIYAFET;

public class Tshirt extends Kiyafet{

	public enum YakaTipi{
		VYAKA(1),
		BISIKLET(2),
		POLO(3);
		
		public int id;
		YakaTipi (int id){
			this.id=id;
		}
		public int getId() {
			return id;
		}
	}
	
	private YakaTipi yakaTipi;
	
	public Tshirt(Renk renk, Kumas kumas,YakaTipi yakaTipi) {
		super(renk, kumas, fiyatBelirle(kumas,yakaTipi));
		this.yakaTipi=yakaTipi;
	}

	private static int fiyatBelirle(Kumas secilenkumas, YakaTipi secilenyakaTipi) {
		if(secilenkumas.equals(Kumas.PAMUK)&& secilenyakaTipi.equals(YakaTipi.VYAKA))
		return 400;
		else if(secilenkumas.equals(Kumas.PAMUK)&& secilenyakaTipi.equals(YakaTipi.BISIKLET))
			return 300;
		else if(secilenkumas.equals(Kumas.PAMUK)&& secilenyakaTipi.equals(YakaTipi.POLO))
			return 450;
		else if(secilenkumas.equals(Kumas.POLYESTER)&& secilenyakaTipi.equals(YakaTipi.VYAKA))
			return 350;
		else if(secilenkumas.equals(Kumas.POLYESTER)&& secilenyakaTipi.equals(YakaTipi.BISIKLET))
			return 250;
		else
		return 200;
	}

	public YakaTipi getYakaTipi() {
		return yakaTipi;
	}

	public void setYakaTipi(YakaTipi yakaTipi) {
		this.yakaTipi = yakaTipi;
	}

}
