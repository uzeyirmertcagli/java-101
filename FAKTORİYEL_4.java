package IV_HAFTA;

import java.util.Scanner;

public class FAKTORÝYEL_4 {

	public static void main(String[] args) {

		int faktoriyel = veriOkuInt("Deðer Giriniz : ");
		
		int toplam = faktoriyelDon(faktoriyel);
		System.out.println("Sonuç : " + toplam);
	}
	private static int faktoriyelDon(int faktoriyel) {
	if(faktoriyel==1) {
		return 1;
	}else {
		return faktoriyel*faktoriyelDon(faktoriyel-1);
	}
		
	}
	private static int veriOkuInt(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.print(message);
		int kenar = scan.nextInt();
		return kenar;
	}
}
