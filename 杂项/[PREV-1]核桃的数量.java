import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(gbc(gbc(a, b), c));
	}

	static int gbc(int a, int b) {
		int temp;
		int t = a * b;
		if (a < b)// 交换两个数，使大数放在a上
		{
			temp = a;
			a = b;
			b = temp;
		}
		while (b != 0)// 利用辗除法，直到b为0为止
		{
			temp = a % b;
			a = b;
			b = temp;
		}
		return t / a;
	}
}