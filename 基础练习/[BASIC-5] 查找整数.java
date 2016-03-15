import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		for (int i = 0; i < n; i++)
			number[i] = sc.nextInt();
		int a = sc.nextInt();
		for (int i = 0; i < n; i++)
			if (a == number[i]) {
				System.out.println(i + 1);
				return;
			}
		System.out.println(-1);

	}
}