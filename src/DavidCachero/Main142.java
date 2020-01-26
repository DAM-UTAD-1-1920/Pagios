package DavidCachero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main142 {
	public static void main(String[] args) {
		int jugadores;
		int saltos;
		int eliminar;
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> juego;
		while (true) {
			jugadores = s.nextInt();
			saltos = s.nextInt();
			if (jugadores == 0 && saltos == 0)
				break;
			juego = new ArrayList<>();
			for (int i = 1; i <= jugadores; i++)
				juego.add(i);
			eliminar = 0;
			while (juego.size() > 1) {
				eliminar += saltos;
				eliminar %= juego.size();
				juego.remove(eliminar);
			}
			System.out.println(juego.get(0));
		}
	}
}