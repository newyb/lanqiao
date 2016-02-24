import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if(((y%100==0)&&(y%400==0))||(y%4==0))
		System.out.println("yes");
		else System.out.println("no");
	}
}