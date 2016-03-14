import java.util.Scanner;

public class Main {
	public static String[] time1 = { "zero", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen", "twenty" };
	public static String[] time2 = { "twenty", "thirty", "forty", "fifty" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			if (h <= 20) {
				System.out.print(time1[h]);
			} else {
				System.out.print("twenty" + " " + time1[h - 20]);
			}
			if (m == 0) {
				System.out.println(" " + "o'clock");
			} else {
				if (m < 20) {
					System.out.print(" " + time1[m]);
				} else {
					int a = m / 10;// 十位
					int b = m % 10;// 个位
					if (b == 0)
						System.out.print(" " + time2[a - 2]);
					else
						System.out.print(" " + time2[a - 2] + " " + time1[b]);
				}
			}
			System.out.println();
		}
	}
}