package IV_HAFTA;

import java.util.Scanner;

public class FÝBONACCÝ_5 {

	public static void main(String[] args) {
		int fibonacci = veriOkuInt("terim giriniz : ");


		int toplam = fibonacciDon(fibonacci);
		System.out.println("Sonuç : " + toplam);
	}
	private static int fibonacciDon(int fibonacci) {
		if(fibonacci==1) {
			return 0;
		} else if (fibonacci==2) {
			return 1;
		} else {
			return fibonacciDon(fibonacci-1)+fibonacciDon(fibonacci-2);
		}

	}
	
	private static int veriOkuInt(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.print(message);
		int kenar = scan.nextInt();
		return kenar;
	}
}
