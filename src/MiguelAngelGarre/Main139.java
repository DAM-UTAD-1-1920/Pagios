package MiguelAngelGarre;

import java.util.ArrayList;
import java.util.Scanner;

public class Main139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			ArrayList<Integer> set = new ArrayList<Integer>(1);
			if (num == 0)
				break;
			set.add(num);
			if (num == 1)
				System.out.println(num + " -> cubifinito.");
			else {
				System.out.print(num + " - ");
				while (true) {
					int digitos;
					int total = 0;
					String aux = String.valueOf(num);
					for (int i = aux.length() - 1; i >= 0; i--) {
						digitos = Integer.parseInt("" + aux.charAt(i));
						total += digitos * digitos * digitos;
					}
					if (total == 1) {
						System.out.println(total + " -> cubifinito.");
						break;
					} else if (set.contains(total)) {
						System.out.println(total + " -> no cubifinito.");
						break;
					} else {
						set.add(total);
						num = total;
						System.out.print(total + " - ");
					}
				}
			}
		}
		sc.close();
	}
}