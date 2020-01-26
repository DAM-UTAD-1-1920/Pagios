package DavidCachero;

import java.util.Scanner;
import java.util.TreeSet;

public class Main452 {
	public static void main(String[] args) {
		int[] numero = new int[2];
		int bolas;
		int contador = 0;
		TreeSet<Integer> ganado = new TreeSet<>();
		try (Scanner in = new Scanner(System.in)) {
			while (contador == 0) {
				bolas = in.nextInt();
				numero = new int[bolas];
				if (bolas == 0) {
					return;
				}
				for (int i = 0; i < numero.length; i++) {
					numero[i] = in.nextInt();
				}
				for (int i = 0; i < numero.length - 1; i++) {
					for (int j = i + 1; j < numero.length; j++)
						ganado.add(Math.abs(numero[j] - numero[i]));
				}
				for (int elemto : ganado) {
					System.out.print(elemto);
					if (contador < ganado.size() - 1) {
						System.out.print(" ");
						contador++;
					}
				}
				System.out.println();
				ganado.removeAll(ganado);
				contador = 0;
			}
		}
	}
}