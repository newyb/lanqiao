import java.util.Scanner;
 
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        System.out.printf("%d:%d:%d",t/3600,t%3600/60,t%60);
    }
}