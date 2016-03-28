import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] init = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				init[i][j] = scanner.nextInt();
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++)
			result[i][i] = 1;
		powerOperation(result, init, m);
		printMatrix(result);
	}

	private static void printMatrix(int[][] result) {
		int len = result.length;
		for (int i = 0; i < len; i++)
			for (int j = 0; j < len; j++) {
				System.out.print(result[i][j]);
				System.out.print(j == len - 1 ? "\r\n" : " ");
			}
	}

	private static void powerOperation(int[][] result, int[][] init, int m) {
		int len = init.length;
		for (int i = 0; i < m; i++) {
			int[][] temp = new int[len][len];
			for (int j = 0; j < len; j++)
				for (int j2 = 0; j2 < len; j2++)
					for (int k = 0; k < len; k++)
						temp[j][j2] += result[j][k] * init[k][j2];
			for (int j = 0; j < len; j++)
				for (int j2 = 0; j2 < len; j2++)
					result[j][j2] = temp[j][j2];
		}
	}
}