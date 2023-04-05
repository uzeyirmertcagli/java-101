package VIIII_BASKETBOL;

import java.util.ArrayList;

import VIIII_FUTBOL.Futbolcu;

public class BasketKocu extends InsanBasketbol {

	
	public BasketKocu(String ad, String soyad ,  int yas) {
		super(ad,soyad,yas);
	}
	
	public ArrayList<Basketbolcu> Ilk5(ArrayList<Basketbolcu> tumBasketTakimi){
		ArrayList<Basketbolcu> Ilk5 = new ArrayList<Basketbolcu>();
		int secilenOyuncuSayisi=0;
		int c=0 , pf=0 , sf=0 , sg=0 , pg=0; //2guard , 1 pivot , 2 forvet
		
		for(Basketbolcu basketbolcu:tumBasketTakimi) {
			if(basketbolcu.isCezaliMi()||basketbolcu.isSakatMi())
				continue;
			
			for(String mevki : basketbolcu.getMevkiler()) {
				if(mevki.equals("C")&& c<1) {
					Ilk5.add(basketbolcu);
					c++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("PF")&& pf<2) {
					Ilk5.add(basketbolcu);
					pf++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("SF")&& sf<1) {
					Ilk5.add(basketbolcu);
					sf++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("SG")&& sg<1) {
					Ilk5.add(basketbolcu);
					sg++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("PG")&& pg<2) {
					Ilk5.add(basketbolcu);
					pg++;
					secilenOyuncuSayisi++;
					break;
				} 
			}
			if (secilenOyuncuSayisi==5) 
				break;
		}
		if(secilenOyuncuSayisi<5) {
			System.out.println("Ýlk 5 Ýçin Yeterli Oyuncu Yok !");
	
		}
		return Ilk5;
	}
		
	}