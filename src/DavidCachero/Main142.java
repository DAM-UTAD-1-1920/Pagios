package DavidCachero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main142 {
	public static void main(String[] args) {
		int chico;
		int salvado;
		int eliminando;
		boolean bucle = true;
		Scanner in = new Scanner(System.in);
		while (bucle) {
			chico = in.nextInt();
			salvado = in.nextInt();
			if (chico == 0 && salvado == 0)
				bucle = false;
			else {
				ArrayList<Integer> partida = new ArrayList<Integer>();
				for (int i = 1; i <= chico; i++)
					partida.add(i);
				eliminando = 0;
				while (partida.size() > 1) {
					eliminando = (eliminando + salvado);
					eliminando = (eliminando % partida.size());
					partida.remove(eliminando);
				}
				System.out.println(partida.get(0));
			}
		}
	}
}