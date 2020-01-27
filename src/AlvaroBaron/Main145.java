package AlvaroBaron;

import java.util.Scanner;
import java.util.Stack;

public class Main145 {
	public static void main(String[] args) {
		int res;
		char[] tren;
		Stack<Character> parejas;
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			res = 0;
			parejas = new Stack<>();
			tren = s.next().toCharArray();
			for (int i = 0; i < tren.length; i++) {
				switch (tren[i]) {
				case '@':
					parejas.clear();
					break;
				case 'H':
				case 'h':
					parejas.push(tren[i]);
					break;
				case 'M':
					if (!parejas.isEmpty() && parejas.pop() == 'H')
						res++;
					else
						parejas.push(tren[i]);
					break;
				case 'm':
					if (!parejas.isEmpty() && parejas.pop() == 'h')
						res++;
					else
						parejas.push(tren[i]);
					break;
				}
			}
			System.out.println(res);
		}
	}
}