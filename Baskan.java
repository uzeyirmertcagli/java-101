package VIIII_FUTBOL;

import java.util.ArrayList;

public class Baskan extends Insan{
	
	private String sektor;
	
	public Baskan(String ad, String soyad ,  int yas,String sektor) {
		super(ad,soyad,yas);
		this.sektor=sektor;
	}

	public void tDirektorDegistir(FutbolTakimi takim , TeknikDirektor tDirektor) {
		takim.setTeknikDirektor(tDirektor);
	}
	
	public String getSektor() {
		return sektor;
	}

	public void setSektor(String sektor) {
		this.sektor = sektor;
	}

	public void futbolculariEkle(FutbolTakimi galataSaray) {
		
		Futbolcu newFutbolcu = new Futbolcu("Mauro", "Icardi", 28, false, false);
		newFutbolcu.mevkiEkle("SF");
		galataSaray.getFutbolcuList().add(newFutbolcu);
		
		Futbolcu newFutbolcu1 = new Futbolcu("Fernando", "Muslera", 28, true, false);
		newFutbolcu1.mevkiEkle("GK");
		galataSaray.getFutbolcuList().add(newFutbolcu1);
		
		Futbolcu newFutbolcu2 = new Futbolcu("Abd�lkerim", "Bardak��", 26, false, false);
		newFutbolcu2.mevkiEkle("STP");
		galataSaray.getFutbolcuList().add(newFutbolcu2);
		
		Futbolcu newFutbolcu3 = new Futbolcu("Victor", "Nelsson", 23, false, false);
		newFutbolcu3.mevkiEkle("STP");
		galataSaray.getFutbolcuList().add(newFutbolcu3);
		
		Futbolcu newFutbolcu4 = new Futbolcu("Bafetimbi", "Gomis", 33, false, false);
		newFutbolcu4.mevkiEkle("ST");
		galataSaray.getFutbolcuList().add(newFutbolcu4);
		
		Futbolcu newFutbolcu5 = new Futbolcu("Kerem", "Akt�rko�lu", 24, false, false);
		newFutbolcu5.mevkiEkle("SLA");
		galataSaray.getFutbolcuList().add(newFutbolcu5);
		
		Futbolcu newFutbolcu6 = new Futbolcu("Leo", "Dubois", 26, false, false);
		newFutbolcu6.mevkiEkle("SLB");
		galataSaray.getFutbolcuList().add(newFutbolcu6);
		
		Futbolcu newFutbolcu7 = new Futbolcu("Sacha", "Boey", 23, false, false);
		newFutbolcu7.mevkiEkle("S�B");
		galataSaray.getFutbolcuList().add(newFutbolcu7);

		Futbolcu newFutbolcu8 = new Futbolcu("Yunus", "Akg�n", 22, false, false);
		newFutbolcu8.mevkiEkle("S�A");
		galataSaray.getFutbolcuList().add(newFutbolcu8);
		
		Futbolcu newFutbolcu9 = new Futbolcu("Sergio", "Oliveira", 28, false, false);
		newFutbolcu9.mevkiEkle("G�");
		galataSaray.getFutbolcuList().add(newFutbolcu9);
		
		Futbolcu newFutbolcu10 = new Futbolcu("Dries", "Mertens", 30, false, false);
		newFutbolcu10.mevkiEkle("GF");
		galataSaray.getFutbolcuList().add(newFutbolcu10);
		
		Futbolcu newFutbolcu11 = new Futbolcu("Okan", "Ko�uk", 23, false, false);
		newFutbolcu11.mevkiEkle("GK");
		galataSaray.getFutbolcuList().add(newFutbolcu11);
		
		Futbolcu newFutbolcu12 = new Futbolcu("Lucas", "Torreira", 27, false, false);
		newFutbolcu12.mevkiEkle("DOS");
		galataSaray.getFutbolcuList().add(newFutbolcu12);

		Futbolcu newFutbolcu13 = new Futbolcu("Kaan", "Ayhan", 25, false, false);
		newFutbolcu13.mevkiEkle("STP");
		galataSaray.getFutbolcuList().add(newFutbolcu13);
		
		Futbolcu newFutbolcu14 = new Futbolcu("Milot", "Rashitsa", 28, false, false);
		newFutbolcu14.mevkiEkle("S�A");
		galataSaray.getFutbolcuList().add(newFutbolcu14);
		
		Futbolcu newFutbolcu15 = new Futbolcu("Juan", "Mata", 33, false, false);
		newFutbolcu15.mevkiEkle("OOS");
		galataSaray.getFutbolcuList().add(newFutbolcu15);
		
	}

}
