package GabrielZatarain;

import java.util.*;

public class Main143 {
	static Scanner in = new Scanner(System.in);

	public static boolean caso() {
		Deque<Integer> tortitas = new ArrayDeque<>();
		List<Integer> temp = new ArrayList<>();
		int tamaño;
		do {
			tamaño = in.nextInt();
			if (tamaño >= 0) {
				tortitas.push(tamaño);
			}
		} while (tamaño >= 0);

		if (tortitas.size() == 0) {
			return false;
		}
		int numCambios = in.nextInt();
		for (int i = 1; i <= numCambios; i++) {
			int cambios = in.nextInt();
			for (int j = 1; j <= cambios; j++) {
				temp.add(tortitas.pop());
			}
			for (int j = 0; j < temp.size(); j++) {
				tortitas.push(temp.get(j));
			}
			temp.clear();
		}
		System.out.println(tortitas.peek());
		return true;
	}
	public static void main(String[] args) {
		while (caso())
			;
	}
}