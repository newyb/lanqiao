import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s1 = sc.next();
			String s2 = sc.next();
			BigInteger n1 = new BigInteger(s1);
			BigInteger n2 = new BigInteger(s2);
			System.out.println(n1.add(n2));
		}
	}
}