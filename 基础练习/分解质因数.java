import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		ArrayList<Integer> rs = new ArrayList<Integer>();
		ArrayList<Integer> rs1 = new ArrayList<Integer>();
		for (int i = a, j; i <= b; i++) {
			int k = (int) Math.sqrt(i);
			for (j = 2; j <= k; j++)
				if (i % j == 0)
					break;
			if (j > k)
				rs.add(i);
		}
		while (a <= b) {
			String s = a + "=";
			int smun = a;
			for (int i = 2; i <= a; i++) {
				if (smun % i == 0) {
					smun = smun / i;
					if (smun == 1) {
						if (a / i == 1) {
							s += i;
							break;
						}
						s += i;
						break;
					}
					s += i + "*";
					i--;
				}
			}
			a++;
			System.out.println(s);
		}
	}
}