import java.util.Scanner;

public class Main {
	public static char[] c = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
			'W', 'X', 'Y', 'Z' };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		print(n);
	}

	private static void print(int n) {
		if (n == 1) {
			System.out.print("A");
		} else {
			print(n - 1);
			System.out.print(c[n - 1]);
			print(n - 1);
		}
	}
}