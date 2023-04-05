package VII_HAFTA;

import java.util.Iterator;
import java.util.Scanner;

public class CUMARTESÝ_DAMA_2 {

	static String dama[][] = new String[8][8];
	static String siradakiOyuncu = "B";
	static String kazananOyuncu = "";

	public static void main(String[] args) {
		ilkDegerAtama();
		ekranaYazdir();
		Scanner scan = new Scanner(System.in);
		while (true) {
			if (siradakiOyuncu.equals("B"))
				System.out.println("Beyaz oyuncu hamlenizi giriniz:");
			else
				System.out.println("Siyah oyuncu hamlenizi giriniz:");

			System.out.print("ilk konumu giriniz:");
			String ilkKonum = scan.nextLine();
			if (ilkKonum.equals("99"))
				break;
			else {
				boolean ilkKonumDogruMu = konumDogruMu(ilkKonum);
				if (!ilkKonumDogruMu) {
					System.out.println("ilk konum yanlis!!");
					continue;
				}

			}

			System.out.print("son konumu giriniz:");
			String sonKonum = scan.nextLine();
			boolean sonKonumDogruMu = sonKonumDogruMu(sonKonum);
			if (!sonKonumDogruMu) {
				System.out.println("Son konum yanlis!!");
				continue;
			}
			
			ekranaYazdir();
			
			hamleYap(ilkKonum, sonKonum);
			boolean oyunBitti = oyunBittiMi();
			if(oyunBitti) {
				System.out.println("Kazanan Oyuncu : " + kazananOyuncu);
				break;
			}
		}

	}

	private static boolean oyunBittiMi() {
		if(siradakiOyuncu=="S") {
			for (int i = 0; i < dama.length; i++) {
				for (int j = 0; j <dama[i].length; j++) {
					if(dama[i][j]=="s"||dama[i][j]=="S") {
						
						return false;
					}
				}
			}
		} else {
			
			for (int i = 0; i < dama.length; i++) {
				for (int j = 0; j <dama[i].length; j++) {
					if(dama[i][j]=="b"||dama[i][j]=="B") {
						
						return false;
					}
				}
			}
			
		}
		if(siradakiOyuncu=="S")
			kazananOyuncu="Beyaz";
		else
			kazananOyuncu="Siyah";
		return true;
	}

	private static boolean sonKonumDogruMu(String sonKonum) {
		char sonKonumHarf = sonKonum.charAt(0);
		int sonKonumX = cevirici(sonKonumHarf);

		char sonKonumYChar = sonKonum.charAt(1);
		int sonKonumY = Character.getNumericValue(sonKonumYChar);
		if (siradakiOyuncu == "B")
			if (dama[sonKonumY][sonKonumX].equals("s") || dama[sonKonumY][sonKonumX].equals("S")
					|| dama[sonKonumY][sonKonumX].equals(" "))
				return true;
		if (siradakiOyuncu == "S")
			if (dama[sonKonumY][sonKonumX].equals("b") || dama[sonKonumY][sonKonumX].equals("B")
					|| dama[sonKonumY][sonKonumX].equals(" "))
				return true;
		return false;
	}

	private static boolean konumDogruMu(String ilkKonum) {
		char ilkKonumHarf = ilkKonum.charAt(0);
		int ilkKonumX = cevirici(ilkKonumHarf);

		char ilkKonumYChar = ilkKonum.charAt(1);
		int ilkKonumY = Character.getNumericValue(ilkKonumYChar);
		if (siradakiOyuncu == "B")
			if (dama[ilkKonumY][ilkKonumX].equals("b") || dama[ilkKonumY][ilkKonumX].equals("B"))
				return true;
		if (siradakiOyuncu == "S")
			if (dama[ilkKonumY][ilkKonumX].equals("s") || dama[ilkKonumY][ilkKonumX].equals("S"))
				return true;

		return false;
	}

	private static void hamleYap(String ilkKonum, String sonKonum) {
		char ilkKonumHarf = ilkKonum.charAt(0);
		int ilkKonumX = cevirici(ilkKonumHarf);

		char ilkKonumYChar = ilkKonum.charAt(1);
		int ilkKonumY = Character.getNumericValue(ilkKonumYChar);

		char sonKonumHarf = sonKonum.charAt(0);
		int sonKonumX = cevirici(sonKonumHarf);

		char sonKonumYChar = sonKonum.charAt(1);
		int sonKonumY = Character.getNumericValue(sonKonumYChar);
		if ((siradakiOyuncu == "B"
				&& ((ilkKonumY - sonKonumY == 1 || ilkKonumY == sonKonumY) || dama[ilkKonumY][ilkKonumX] == "B"))
				|| (siradakiOyuncu == "S" && ((sonKonumY - ilkKonumY == 1 || ilkKonumY == sonKonumY)
						|| dama[ilkKonumY][ilkKonumX] == "S"))) {
			if (Math.abs(ilkKonumX - sonKonumX) == 1 || ilkKonumX == sonKonumX || dama[ilkKonumY][ilkKonumX] == "B"
					|| dama[ilkKonumY][ilkKonumX] == "S") {

				if ((siradakiOyuncu == "B" && sonKonumY == 0) || (siradakiOyuncu == "S" && sonKonumY == 7))
					dama[sonKonumY][sonKonumX] = siradakiOyuncu == "B" ? "B" : "S";
				else {
					if (dama[ilkKonumY][ilkKonumX] == "B" || dama[ilkKonumY][ilkKonumX] == "S")
						dama[sonKonumY][sonKonumX] = siradakiOyuncu == "B" ? "B" : "S";
					else
						dama[sonKonumY][sonKonumX] = siradakiOyuncu == "B" ? "b" : "s";
				}

				dama[ilkKonumY][ilkKonumX] = " ";
				if (siradakiOyuncu == "B")
					siradakiOyuncu = "S";
				else
					siradakiOyuncu = "B";
			} else {
				System.out.println("Gecersiz hamle!!");
			}
		} else {
			System.out.println("Gecersiz hamle!!");
		}

	}

	private static int cevirici(char konumHarf) {
		switch (konumHarf) {
		case 'a':
			return 0;
		case 'b':
			return 1;
		case 'c':
			return 2;
		case 'd':
			return 3;
		case 'e':
			return 4;
		case 'f':
			return 5;
		case 'g':
			return 6;
		case 'h':
			return 7;

		}
		return 0;
	}

	private static void ekranaYazdir() {
		System.out.println();
		System.out.println("  a b c d e f g h");
		for (int i = 0; i < 8; i++) {
			System.out.print((i) + " ");
			for (int j = 0; j < dama[i].length; j++) {
				System.out.print(dama[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void ilkDegerAtama() {
		for (int i = 0; i < 8; i++) {
			dama[0][i] = " ";
			dama[1][i] = "s";
			dama[2][i] = "s";
			dama[3][i] = " ";
			dama[4][i] = " ";
			dama[5][i] = "b";
			dama[6][i] = "b";
			dama[7][i] = " ";

		}

	}

}
