package AlvaroBaron;

import java.util.Scanner;
import java.util.Stack;

public class Main145 {
	public static void main(String[] args) {
		int SOL;
		char[] TREN;
		Stack<Character> AMOR;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			SOL = 0;
			AMOR = new Stack<>();
			TREN = sc.next().toCharArray();
			for (int i = 0; i < TREN.length; i++) {
				switch (TREN[i]) {
				case '@':
					AMOR.clear();
					break;
				case 'H':
				case 'h':
					AMOR.push(TREN[i]);
					break;
				case 'M':
					if (!AMOR.isEmpty() && AMOR.pop() == 'H')
						SOL++;
					else
						AMOR.push(TREN[i]);
					break;
				case 'm':
					if (!AMOR.isEmpty() && AMOR.pop() == 'h')
						SOL++;
					else
						AMOR.push(TREN[i]);
					break;
				}
			}

			System.out.println(SOL);
		}
	}
}