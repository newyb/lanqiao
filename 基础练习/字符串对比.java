import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str1 = reader.next();
		String str2 = reader.next();
		if (str1.length() != str2.length()) {
			System.out.println(1);
		} else if (str1.equals(str2)) {
			System.out.println(2);
		} else if (str1.regionMatches(true, 0, str2, 0, str1.length())) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}
}