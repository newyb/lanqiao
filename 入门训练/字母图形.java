import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// n行m列
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < m; b++) {
				char zm = (char) ('A' + Math.abs(a - b));
				System.out.print(zm);
			}
			System.out.println();
		}
	}
}