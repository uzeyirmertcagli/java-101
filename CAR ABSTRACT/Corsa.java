package VIIII_Araba;

public class Corsa extends Araba{
	
	private String renk;
	private int vitesSayisi;
	private boolean otomatikMi;
	private int anlikHiz;
	
	public Corsa(String renk , int vitesSayisi , boolean otomatikMi) {
		model="OPEL";
		anlikHiz=0;
		this.renk=renk;
		this.vitesSayisi=vitesSayisi;
		this.otomatikMi=otomatikMi;
	}

	@Override
	public void hizlan(int hizArtisMiktari) {
		if(hizArtisMiktari>0)
			anlikHiz+=hizArtisMiktari;
		
	}

	@Override
	public void bilgiler() {
		System.out.println("Araç Rengi : " + renk);
		System.out.println("Vites Sayýsý : " + vitesSayisi);
		System.out.println("Araç Vitesi : "  + (otomatikMi==true? "Otomatik":"Manuel"));
		
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getVitesSayisi() {
		return vitesSayisi;
	}

	public void setVitesSayisi(int vitesSayisi) {
		this.vitesSayisi = vitesSayisi;
	}

	public boolean isOtomatikMi() {
		return otomatikMi;
	}

	public void setOtomatikMi(boolean otomatikMi) {
		this.otomatikMi = otomatikMi;
	}

	public int getAnlikHiz() {
		return anlikHiz;
	}

	public void setAnlikHiz(int anlikHiz) {
		this.anlikHiz = anlikHiz;
	}

	@Override
	public void guzergahListele() {
	for(String g:guzergah) {
		System.out.println(g);
	}
		
	}

	@Override
	public void guzergahEkle(String lokasyon) {

		guzergah.add(lokasyon);
	}

}
