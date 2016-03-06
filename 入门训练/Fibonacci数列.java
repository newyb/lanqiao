/*
问题描述
Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。

当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。

输入格式
输入包含一个整数n。
输出格式
输出一行，包含一个整数，表示Fn除以10007的余数。
样例输入
10
样例输出
55
样例输入
22
样例输出
7704
数据规模与约定
1 <= n <= 1,000,000。
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fn(n));
	}

	static int fn(int n) {
		if (n == 1 || n == 2)//如果n为1 2时 直接返回1
			return 1;
		int a = 1, b = 1, c = 0;//c Fn a Fn-1 b Fn-2
		for (int i = 3; i <= n; i++) {
			c = (a + b) % 10007;//取余 最后取余的话 会超时
			a = b;
			b = c;
		}
		return c;
	}
}