package VIIII_FUTBOL;

import java.util.ArrayList;

public class TeknikDirektor extends Insan{

	private int tecrube;
	


	public TeknikDirektor(String ad, String soyad ,  int yas,int tecrube) {
		super(ad,soyad,yas);
		this.tecrube=tecrube;
	}
	
	public ArrayList<Futbolcu> ilk11Kur(ArrayList<Futbolcu> tumFutbolTakimi){
		//kart ve ceza kontrol
		ArrayList<Futbolcu> ilk11 = new ArrayList<Futbolcu>();
		int secilenOyuncuSayisi=0;
		int kaleci=0 , sgb=0 , slb=0 , stp=0 , dos=0 , go=0 , oos=0 , sga=0 , sla=0 , gf=0 , sf=0;
		
		for(Futbolcu futbolcu:tumFutbolTakimi) {
		
			if(futbolcu.isCezaliMi()||futbolcu.isSakatMi())
				continue;
			
			for(String mevki : futbolcu.getMevkiler()) {
				if(mevki.equals("GK")&& kaleci<1) {
					ilk11.add(futbolcu);
					kaleci++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("STP")&& stp<2) {
					ilk11.add(futbolcu);
					stp++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("SÐB")&& sgb<1) {
					ilk11.add(futbolcu);
					sgb++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("SLB")&& slb<1) {
					ilk11.add(futbolcu);
					slb++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("GÖ")&& go<1) {
					ilk11.add(futbolcu);
					go++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("DOS")&& dos<1) {
					ilk11.add(futbolcu);
					dos++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("GF")&& gf<1) {
					ilk11.add(futbolcu);
					gf++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("SÐA")&& sga<1) {
					ilk11.add(futbolcu);
					sga++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("SLA")&& sla<1) {
					ilk11.add(futbolcu);
					sla++;
					secilenOyuncuSayisi++;
					break;
				} else 	if(mevki.equals("SF")&& sf<1) {
					ilk11.add(futbolcu);
					sf++;
					secilenOyuncuSayisi++;
					break;
				}
			}
			
			if (secilenOyuncuSayisi==11) 
				break;
			
		}
		if(secilenOyuncuSayisi<11) {
			System.out.println("11 Ýçin Yeterli Oyuncu Yok !");
		}
		return ilk11;
	}
	
	public int getTecrube() {
		return tecrube;
	}

	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}

}
