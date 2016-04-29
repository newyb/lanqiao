import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s=1;
		for(int i=1;i<n+1;i++)
			{
			s=s*i;
			while(s%10==0)s=s/10;
			if(s/1000>0)  
	            s=s%1000; 
			if(s/100>0)  
		            s=s%100; 
			
			}
		System.out.println(s%10);
	}
}