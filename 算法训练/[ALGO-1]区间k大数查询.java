import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++)
			x[i] = sc.nextInt();
		int m = sc.nextInt();
		int l[] = new int[m];
		int r[] = new int[m];
		int k[] = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			k[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int t = l[i] - 1; t <= r[i] - 1; t++)
				list.add(x[t]);
			Collections.sort(list);// 使用工具类排序
			System.out.println(list.get(r[i]-k[i]-l[i]+1));
		}
	}
}