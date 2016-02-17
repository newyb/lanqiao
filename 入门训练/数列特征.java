import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		for (int i = 0; i < n; i++)
			number[i] = sc.nextInt();
		int sum = 0, max, min;
		min = max = number[0];
		for (int i = 0; i < n; i++) {
			sum = sum + number[i];
			if (number[i] > max)
				max = number[i];
			if (number[i] < min)
				min = number[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}