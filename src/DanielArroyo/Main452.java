package DanielArroyo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main452 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int bolas = scanner.nextInt();
			int cont = 0;
			int[] nums = new int[bolas];
			HashSet<Integer> resultado = new HashSet<Integer>();
			while (bolas != 0) {
				for (int i = 0; i < bolas; i++) {
					nums[i] = scanner.nextInt();
				}
				for (int i = 0; i < bolas - 1; i++) {
					for (int j = i + 1; j < bolas; j++)
						resultado.add(Math.abs(nums[i] - nums[j]));
				}
				for (Integer elto : resultado) {
					System.out.print(elto);

					if (cont < resultado.size() - 1) {
						System.out.print(" ");
						cont++;
					}
				}
				System.out.println();
				resultado.removeAll(resultado);
				bolas = scanner.nextInt();
				cont = 0;
			}
		}
	}
}