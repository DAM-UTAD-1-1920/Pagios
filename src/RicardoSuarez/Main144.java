package RicardoSuarez;

import java.util.ArrayList;
import java.util.Scanner;

public class Main144 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> letras;
		String pulsadas;
		int posición;
		while (scan.hasNext()) {
			pulsadas = scan.nextLine();
			posición = 0;
			letras = new ArrayList<>();
			for (int i = 0; i < pulsadas.length(); i++) {
				switch (pulsadas.charAt(i)) {
				case '-':
					posición = 0;
					break;
				case '*':
					posición++;
					break;
				case '3':
					if (!letras.isEmpty() && posición <= letras.size() - 1)
						letras.remove(posición);
					break;
				case '+':
					if (letras.isEmpty())
						posición = 0;
					else
						posición = letras.size();
					break;
				default:
					if (posición > letras.size())
						if (!letras.isEmpty())
							posición = letras.size();
						else
							posición = 0;
					letras.add(posición++, pulsadas.charAt(i));
				}
			}
			for (Character c : letras)
				System.out.print(c + "");
			System.out.println();
		}
	}
}
