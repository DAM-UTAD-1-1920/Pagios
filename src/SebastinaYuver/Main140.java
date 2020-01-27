package SebastinaYuver;

import java.util.Scanner;

public class Main140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		int suma;
		int unidad;
		num = sc.nextLine();
		if (!("" + num.charAt(0)).equals("-")) {
			do {
				suma = 0;
				for (int i = 0; i < num.length(); i++) {
					unidad = Integer.parseInt("" + num.charAt(i));
					suma = suma + unidad;

					if (i == num.length() - 1) {
						System.out.print(unidad + " = " + suma);
					} else {
						System.out.print(unidad + " + ");
					}
				}
				System.out.println();
				num = sc.nextLine();
			} while ((0 <= Integer.parseInt(num)) && !("" + num.charAt(0)).equals("-"));
		}
		sc.close();
	}
}