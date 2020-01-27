package RicardoSuarez;

import java.util.ArrayList;
import java.util.Scanner;

public class Main144 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> letras;
		String pulsadas;
		int posici�n;
		while (scan.hasNext()) {
			pulsadas = scan.nextLine();
			posici�n = 0;
			letras = new ArrayList<>();
			for (int i = 0; i < pulsadas.length(); i++) {
				switch (pulsadas.charAt(i)) {
				case '-':
					posici�n = 0;
					break;
				case '*':
					posici�n++;
					break;
				case '3':
					if (!letras.isEmpty() && posici�n <= letras.size() - 1)
						letras.remove(posici�n);
					break;
				case '+':
					if (letras.isEmpty())
						posici�n = 0;
					else
						posici�n = letras.size();
					break;
				default:
					if (posici�n > letras.size())
						if (!letras.isEmpty())
							posici�n = letras.size();
						else
							posici�n = 0;
					letras.add(posici�n++, pulsadas.charAt(i));
				}
			}
			for (Character c : letras)
				System.out.print(c + "");
			System.out.println();
		}
	}
}
