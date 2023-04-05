package VIIII_BASKETBOL;

import java.util.ArrayList;

import VIIII_FUTBOL.Baskan;
import VIIII_FUTBOL.Futbolcu;
import VIIII_FUTBOL.TeknikDirektor;

public class BasketTakimi {

	private String takimIsmi;
	private String stad;
	private BaskanBasketbol baskan;
	private BasketKocu basketKocu;
	private ArrayList<Basketbolcu> basketbolcuList = new ArrayList<Basketbolcu>();
	
	public  BasketTakimi(String takimIsmi ,String stad ) {
		this.takimIsmi=takimIsmi;
		this.stad=stad;
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

	public BaskanBasketbol getBaskan() {
		return baskan;
	}

	public void setBaskan(BaskanBasketbol baskan) {
		this.baskan = baskan;
	}

	public BasketKocu getBasketKocu() {
		return basketKocu;
	}

	public void setBasketKocu(BasketKocu basketKocu) {
		this.basketKocu = basketKocu;
	}

	public ArrayList<Basketbolcu> getBasketbolcuList() {
		return basketbolcuList;
	}

	public void setBasketbolcuList(ArrayList<Basketbolcu> basketbolcuList) {
		this.basketbolcuList = basketbolcuList;
	}

	public void secimleBaskanGuncelle(BaskanBasketbol yeniBaskan) {
		baskan=yeniBaskan;
	}
}
