package MiguelAngelGarre;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, digito;
		int suma;
		String temp;
		Set<Integer> set;
		while (true) {
			num = sc.nextInt();
			set = new TreeSet<>();
			if (num == 0)
				break;
			set.add(num);
			if (num == 1)
				System.out.println(num + " -> cubifinito.");
			else {
				System.out.print(num + " - ");
				while (true) {
					suma = 0;
					temp = String.valueOf(num);
					for (int i = temp.length() - 1; i >= 0; i--) {
						digito = Integer.parseInt("" + temp.charAt(i));
						suma += digito * digito * digito;
					}
					if (suma == 1) {
						System.out.println(suma + " -> cubifinito.");
						break;
					} else if (set.contains(suma)) {
						System.out.println(suma + " -> no cubifinito.");
						break;
					} else {
						set.add(suma);
						num = suma;
						System.out.print(suma + " - ");
					}
				}
			}
		}
		sc.close();
	}
}