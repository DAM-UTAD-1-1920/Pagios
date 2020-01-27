package SebastinaYuver;

import java.util.Scanner;

public class Main140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String total;
		int suma;
		int digito;
		do {
			total = sc.nextLine();
			suma = 0;
			if (("" + total.charAt(0)).equals("-")) {
				break;
			}
			for (int i = 0; i < total.length(); i++) {
				digito = Integer.parseInt("" + total.charAt(i));
				suma += digito;

				if (i == total.length() - 1) {
					System.out.print(digito + " = " + suma);
				} else {
					System.out.print(digito + " + ");
				}
			}
			System.out.println();
		} while (0 <= Integer.parseInt(total));
	}

}