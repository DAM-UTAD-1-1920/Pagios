package EduardoBalduque;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main416 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<String> cumpleaños;
		String[] fechas;
		int casos;
		boolean repetidos = false;
		while (true) {
			casos = in.nextInt();
			if (casos == 0)
				break;
			cumpleaños = new TreeSet<>();
			for (int i = 0; i < casos; i++) {
				fechas = in.next().split("/");
				String parte1 = fechas[0];
				String parte2 = fechas[1];
				if (cumpleaños.contains(parte1 + parte2)) {
					repetidos = true;
				} else {
					cumpleaños.add(parte1 + parte2);
				}
			}
			System.out.println((repetidos) ? "SI" : "NO");
		}
	}
}