package RubenElvira;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TreeNode {
	char val;
	TreeNode left, right;

	TreeNode(char x) {
		val = x;
	}

	public String toString() {
		return val + "";
	}
}

public class Main201 {

	static int pos;
	static String input;
	static boolean one, two;
	final static BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		while (true) {
			input = s.readLine();
			pos = 0;
			TreeNode punto = new TreeNode(input.charAt(pos++));
			if (punto.val == '.')
				break;
			read(punto);
			one = two = true;
			detectOneSon(punto);
			detectTwoSons(punto);
			if (one)
				System.out.print("1");
			if (two)
				System.out.print("2");
			if (!one && !two)
				System.out.print("N");
			System.out.println();
		}
	}

	static void detectTwoSons(TreeNode p) {
		if (p == null || !two)
			return;
		if ((p.left != null && p.right == null) || (p.left == null && p.right != null))
			two = false;
		detectTwoSons(p.left);
		detectTwoSons(p.right);
	}

	static void detectOneSon(TreeNode p) {
		if (p == null || !one)
			return;
		if (p.left != null && p.right != null) {
			one = false;
			return;
		}
		detectOneSon(p.left);
		detectOneSon(p.right);
	}

	static void read(TreeNode p) {
		if (input.charAt(pos) != '.') {
			p.left = new TreeNode(input.charAt(pos++));
			read(p.left);
		}
		pos++;
		if (input.charAt(pos) != '.') {
			p.right = new TreeNode(input.charAt(pos++));
			read(p.right);
		}
	}

}