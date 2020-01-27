package DanielArroyo;

import java.util.LinkedList;
import java.util.Scanner;

public class Main142 {
	public static void main(String[] args) {
		int ninios = 0;
		int cadacuanto;
		int cont = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			while (cont == 0) {
				ninios = scanner.nextInt();
				cadacuanto = scanner.nextInt();
				if (ninios == 0 && cadacuanto == 0) {
					cont = 1;
				} else {
					LinkedList<Integer> juego = new LinkedList<>();
					for (int i = 1; i <= ninios; i++) {
						juego.add(i);
					}
					int i = -1;
					while (juego.size() > 1) {

						i = (i + cadacuanto + 1) % juego.size();
						juego.remove(i);
						i--;
					}
					System.out.println(juego.get(0));
				}
			}
		}
	}
}