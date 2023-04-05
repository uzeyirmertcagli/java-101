package X_HAFTA_KIYAFET;

import java.util.ArrayList;
import java.util.Scanner;

import X_HAFTA_KIYAFET.Gomlek.GomlekTipi;
import X_HAFTA_KIYAFET.Kiyafet.Kumas;
import X_HAFTA_KIYAFET.Kiyafet.Renk;
import X_HAFTA_KIYAFET.Tshirt.YakaTipi;

public class main {

	public enum Islemler{
		TSHIRT(1),
		GOMLEK(2),
		PANTOLON(3),
		CIKIS(4);
		private int id;
		Islemler(int id){
			this.id=id;
		}
		public int getId() {
			return id;
		}
	}
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Kiyafet> kiyafetList = new ArrayList<Kiyafet>();
		while(true) {
			System.out.println("Lütfen Ýþlem Seçiniz :");
			for( Islemler islem : Islemler.values()) {
				System.out.println(islem + " " + islem.getId());
			}
			int secim=scanner.nextInt();
			if(secim==Islemler.CIKIS.getId())
				break;
			else if(secim==Islemler.TSHIRT.getId()) {
				System.out.println("Kumaþý Seçiniz : ");
				for(Kumas k : Kumas.values()) {
					System.out.println(k+ " " + k.getTip());
				}
				String secimKumas = scanner.next();
				Kumas secilenKumas = null;
				for(Kumas k : Kumas.values()) {
				if(secimKumas.equals(k.getTip())) {
					secilenKumas=k;
				}
			}
				
				System.out.println("Renk Seçiniz : ");
				for(Renk r : Renk.values()) {
					System.out.println(r+ " " + r.getId());
				}
				int secimRenkId = scanner.nextInt();
				Renk secilenRenk = null;
				for(Renk r : Renk.values()) {
					if(secimRenkId==r.getId()) {
						secilenRenk=r;
				}
			}
				System.out.println("Yaka Tipi Seç :");
				for(YakaTipi y: YakaTipi.values()) {
					System.out.println(y+ " " + y.getId());
				}
				int secilenYakaTipiId=scanner.nextInt();
				YakaTipi secilenYakaTip=null;
				for(YakaTipi y:YakaTipi.values()) {
					if(y.getId()==secilenYakaTipiId) {
						secilenYakaTip=y;
					}
				}
				
				Tshirt tshirt = new Tshirt(secilenRenk, secilenKumas, secilenYakaTip);
				kiyafetList.add(tshirt);
		} else if(secim==Islemler.GOMLEK.getId()) {
			
			System.out.println("Gömlek Rengi Seçiniz :");
			for(Renk r: Renk.values())
				System.out.println(r +" " + r.getId());
			int secimRenk = scanner.nextInt();
			Renk secilenRenk = null;
			for(Renk r : Renk.values()) {
				if(secimRenk==r.getId())
					secilenRenk=r;
			}
			
			System.out.println("Gömlek Rengi Seçiniz :");
			for(Kumas k: Kumas.values())
				System.out.println(k +" " + k.getTip());
			String secimKumas = scanner.next();
			Kumas secilenKumas = null;
			for(Kumas k : Kumas.values()) {
				if(k.getTip().equals(secimKumas))
					secilenKumas=k;
			}
				
			System.out.println("Gömlek Tipi Seçiniz :");
			for(GomlekTipi gt: GomlekTipi.values())
				System.out.println(gt +" " + gt.getId());
			int secimTip = scanner.nextInt();
			GomlekTipi secilenTip = null;
			for(GomlekTipi gt : GomlekTipi.values()) {
				if(secimTip==gt.getId())
					secilenTip=gt;
			}
			
			System.out.println("Gömlek Cepli Mi? (1-EVET , 2-HAYIR)");
			int cepliMi=scanner.nextInt();
			boolean cepli;
			if(cepliMi==1)
				cepli=true;
			else
				cepli=false;
			
			
			Gomlek gomlek = new Gomlek(secilenRenk, secilenKumas, secilenTip, cepli);
			kiyafetList.add(gomlek);
				
	} else if(secim==Islemler.PANTOLON.getId()) {
				
			}


		}
		int toplam=0;
		for(Kiyafet k : kiyafetList) {
			System.out.println(k.renk +" " + k.getKumas()+ " " );
			toplam+=k.getFiyat();
		}
		System.out.println("Toplam Fiyat : " + toplam);
		
	}

}
