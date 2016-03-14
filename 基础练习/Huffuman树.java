import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int k = 0;
			int sum = 0;
			while (n > 1) {
				Arrays.sort(a);
				k = a[0] + a[1];
				sum = sum + k;
				a[0] = k;
				a[1] = Integer.MAX_VALUE;
				n--;
			}
			System.out.print(sum);
		}
	}
}