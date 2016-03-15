import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		for (int i = 0; i < 5; i++)
			num[i] = sc.nextInt();
		int sum1 = 0, sum2 = 0, time = 1;
		for (int t = 1; t <= num[4] / num[0]; time++) {
			sum1 += num[0] * t;
			sum2 += num[1] * t;
			if (sum1 == num[4] || sum2 == num[4])
				break;
			if (sum1 - sum2 >= num[2]) {
				sum2 += num[1] * num[3];
				time += num[3];
			}
		}
		if (sum2 > sum1) {
			System.out.println("T");
			System.out.println(num[4] / num[1]);
		} else if (sum2 < sum1) {
			System.out.println("R");
			System.out.println(time);
		} else {
			System.out.println("D");
			System.out.println(num[4] / num[1]);
		}
	}
}