package VIIII_FUTBOL;

public class YardAntrenor extends Insan {

	private int tecrube;
	private String alan;

	public YardAntrenor(String ad, String soyad ,  int yas,int tecrube) {
		super(ad,soyad,yas);
		this.tecrube=tecrube;
		this.alan=alan;
	}

	public int getTecrube() {
		return tecrube;
	}

	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}

	public String getAlan() {
		return alan;
	}

	public void setAlan(String alan) {
		this.alan = alan;
	}
}
