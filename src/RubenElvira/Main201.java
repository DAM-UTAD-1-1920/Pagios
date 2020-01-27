package RubenElvira;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class arbol {
	char value;
	arbol left, right;

	arbol(char x) {
		value = x;
	}

	public String toString() {
		return value + "";
	}
}

public class Main201 {

	static int pos;
	static String input;
	static boolean uno, dos;
	final static BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		while (true) {
			input = s.readLine();
			pos = 0;
			arbol punto = new arbol(input.charAt(pos++));
			if (punto.value == '.')
				break;
			leer(punto);
			uno = dos = true;
			detec1(punto);
			detec(punto);
			if (uno)
				System.out.print("1");
			if (dos)
				System.out.print("2");
			if (!uno && !dos)
				System.out.print("N");
			System.out.println();
		}
	}

	static void detec(arbol p) {
		if (p == null || !dos)
			return;
		if ((p.left != null && p.right == null) || (p.left == null && p.right != null))
			dos = false;
		detec(p.left);
		detec(p.right);
	}

	static void detec1(arbol p) {
		if (p == null || !uno)
			return;
		if (p.left != null && p.right != null) {
			uno = false;
			return;
		}
		detec1(p.left);
		detec1(p.right);
	}

	static void detec2(arbol p) {
		if (p == null || !uno)
			return;
		if (p.left != null && p.right != null) {
			uno = false;
			return;
		}
		detec2(p.left);
		detec2(p.right);
	}

	static void leer(arbol p) {
		if (input.charAt(pos) != '.') {
			p.left = new arbol(input.charAt(pos++));
			leer(p.left);
		}
		pos++;
		if (input.charAt(pos) != '.') {
			p.right = new arbol(input.charAt(pos++));
			leer(p.right);
		}
	}

}