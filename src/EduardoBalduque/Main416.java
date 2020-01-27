package EduardoBalduque;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main416 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<String> cumplea�os;
		String[] fechas;
		int casos;
		boolean repetidos = false;
		while (true) {
			casos = in.nextInt();
			if (casos == 0)
				break;
			cumplea�os = new TreeSet<>();
			for (int i = 0; i < casos; i++) {
				fechas = in.next().split("/");
				String parte1 = fechas[0];
				String parte2 = fechas[1];
				if (cumplea�os.contains(parte1 + parte2)) {
					repetidos = true;
				} else {
					cumplea�os.add(parte1 + parte2);
				}
			}
			System.out.println((repetidos) ? "SI" : "NO");
		}
	}
}