package VIIII_FUTBOL;

import java.util.ArrayList;

public class FutbolTakimi {

	private String takimIsmi;
	private String stad;
	private Baskan baskan;
	private TeknikDirektor teknikDirektor;
	private ArrayList<YardAntrenor> yardAntrenorList = new ArrayList<YardAntrenor>();
	private ArrayList<Futbolcu> futbolcuList = new ArrayList<Futbolcu>();
	
	public FutbolTakimi(String takimIsmi ,String stad ) {
		this.takimIsmi=takimIsmi;
		this.stad=stad;
	}
	
	
	public void secimleBaskanGuncelle(Baskan yeniBaskan) {
		baskan=yeniBaskan;
	}
	
	public String getTakimIsmi() {
		return takimIsmi;
	}

	public void setTakimIsmi(String takimIsmi) {
		this.takimIsmi = takimIsmi;
	}

	public String getStad() {
		return stad;
	}

	public void setStad(String stad) {
		this.stad = stad;
	}

	public Baskan getBaskan() {
		return baskan;
	}

	public void setBaskan(Baskan baskan) {
		this.baskan = baskan;
	}

	public TeknikDirektor getTeknikDirektor() {
		return teknikDirektor;
	}

	public void setTeknikDirektor(TeknikDirektor teknikDirektor) {
		this.teknikDirektor = teknikDirektor;
	}

	public ArrayList<YardAntrenor> getYardAntrenorList() {
		return yardAntrenorList;
	}

	public void setYardAntrenorList(ArrayList<YardAntrenor> yardAntrenorList) {
		this.yardAntrenorList = yardAntrenorList;
	}

	public ArrayList<Futbolcu> getFutbolcuList() {
		return futbolcuList;
	}

	public void setFutbolcuList(ArrayList<Futbolcu> futbolcuList) {
		this.futbolcuList = futbolcuList;
	}

	
}
