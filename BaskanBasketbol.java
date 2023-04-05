package VIIII_BASKETBOL;

import VIIII_FUTBOL.FutbolTakimi;

public class BaskanBasketbol extends InsanBasketbol {

	public BaskanBasketbol(String ad , String soyad , int yas) {
		super(ad, soyad, yas);
		
	}

	public void kocDegistir(BasketTakimi basketTakim, BasketKocu basketKoc) {
		basketTakim.setBasketKocu(basketKoc);
		
		
	}
	
	public void basketbolcuEkle(BasketTakimi GoldenStateWarriors) {
		
		Basketbolcu newBasketbolcu = new Basketbolcu("Stephen","Curry", 26, false, false);
		newBasketbolcu.mevkiEkle("PG");
		GoldenStateWarriors.getBasketbolcuList().add(newBasketbolcu);
		
		Basketbolcu newBasketbolcu1 = new Basketbolcu("Klay","Thampson", 23, false, false);
		newBasketbolcu1.mevkiEkle("SF");
		GoldenStateWarriors.getBasketbolcuList().add(newBasketbolcu1);
		
		Basketbolcu newBasketbolcu2 = new Basketbolcu("Jorden","Pool", 26, false, false);
		newBasketbolcu2.mevkiEkle("PG");
		GoldenStateWarriors.getBasketbolcuList().add(newBasketbolcu2);
		
		Basketbolcu newBasketbolcu3 = new Basketbolcu("Draymond","Green", 21, false, false);
		newBasketbolcu3.mevkiEkle("PF");
		GoldenStateWarriors.getBasketbolcuList().add(newBasketbolcu3);
		
		Basketbolcu newBasketbolcu4 = new Basketbolcu("Andrew","Wiggins", 26, false, false);
		newBasketbolcu4.mevkiEkle("PF");
		GoldenStateWarriors.getBasketbolcuList().add(newBasketbolcu4);
		
		Basketbolcu newBasketbolcu5 = new Basketbolcu("Jonathan","Kuminga", 26, false, false);
		newBasketbolcu5.mevkiEkle("PF");
		GoldenStateWarriors.getBasketbolcuList().add(newBasketbolcu5);
		
		Basketbolcu newBasketbolcu6 = new Basketbolcu("Kevin","Looney", 26, false, false);
		newBasketbolcu6.mevkiEkle("C");
		GoldenStateWarriors.getBasketbolcuList().add(newBasketbolcu6);
		
		Basketbolcu newBasketbolcu7= new Basketbolcu("Ty","Jerome", 36, false, false);
		newBasketbolcu7.mevkiEkle("PG");
		GoldenStateWarriors.getBasketbolcuList().add(newBasketbolcu7);
		
		
	}
}
