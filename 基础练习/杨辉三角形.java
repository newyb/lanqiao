import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,l,r;
		int[] a=new int[n+1];
		a[0]=0;a[1]=1;
		   for(i=1;i<=n;i++)
		   { l=0;
		     for(j=1;j<=i;j++)
		     { r=a[j];
		       a[j]=l+r;  
		       l=r;
		       System.out.printf("%d ",a[j]);  
		     }
		     System.out.printf("\n");
		   }
	}
}