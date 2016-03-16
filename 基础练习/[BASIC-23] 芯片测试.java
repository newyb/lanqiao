import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] count = new int[n];// 记录第i块芯片测试结果中1出现的个数
		int[][] result = new int[n][n];// 测试结果数据
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = scanner.nextInt();
				if (result[i][j] == 1)
					count[j]++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (count[i] > n / 2) {
				System.out.print(i + 1);
				System.out.print(i == n - 1 ? "\r\n" : " ");
			}
		}
	}
}