import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int a = 1; a <= 9; a++)
			for (int b = 0; b <= 9; b++)
				for (int c = 0; c <= 9; c++)
					if (n == 2 * a + 2 * b + c)
						System.out.printf("%d%d%d%d%d\n", a, b, c, b, a);
		for (int a = 1; a <= 9; a++)
			for (int b = 0; b <= 9; b++)
				for (int c = 0; c <= 9; c++)
					if (n == 2 * a + 2 * b + 2 * c)
						System.out.printf("%d%d%d%d%d%d\n", a, b, c, c, b, a);
	}
}