import java.util.Scanner;  
  
public class Main {  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        while (scanner.hasNext()) {  
            int m = scanner.nextInt();  
            int n = scanner.nextInt();  
  
            int[][] flag = new int[m][n];// 标记路径  
            int[][] nums = new int[m][n];// 记录数据  
              
            for (int i = 0; i < m; i++) {  
                for (int j = 0; j < n; j++) {  
                    nums[i][j] = scanner.nextInt();  
                }  
            }  
  
            int count = m * n;  
            int i = 0, j = 0;  
  
            while (count > 0) {  
                while (i < m && flag[i][j] == 0) {  
                    System.out.print(nums[i][j]);  
                    System.out.print(--count == 0 ? "\r\n" : " ");  
                    flag[i][j] = 1;  
                    i++;  
                }  
                i--;  
                j++;  
  
                while (j < n && flag[i][j] == 0) {  
                    System.out.print(nums[i][j] + " ");  
                    System.out.print(--count == 0 ? "\r\n" : " ");  
                    flag[i][j] = 1;  
                    j++;  
                }  
                j--;  
                i--;  
  
                while (i > -1 && flag[i][j] == 0) {  
                    System.out.print(nums[i][j] + " ");  
                    System.out.print(--count == 0 ? "\r\n" : " ");  
                    flag[i][j] = 1;  
                    i--;  
                }  
                i++;  
                j--;  
  
                while (j > -1 && flag[i][j] == 0) {  
                    System.out.print(nums[i][j] + " ");  
                    System.out.print(--count == 0 ? "\r\n" : " ");  
                    flag[i][j] = 1;  
                    j--;  
                }  
                j++;  
                i++;  
            }  
        }  
    }  
}  