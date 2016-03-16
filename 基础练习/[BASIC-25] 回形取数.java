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


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	/** * @param args */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nm = new int[2];
		String[] s = br.readLine().split(" ");
		for (int i = 0; i < 2; i++) {
			nm[i] = Integer.parseInt(s[i]);
		}
		int m = nm[0], n = nm[1];
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			String s1 = br.readLine();
			String[] str = s1.split(" ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		int num = n * m, brr = 0;
		int i = 0, j = 0, x = 0, y = 0, z = 0;
		for (int ii = 0; ii < num; ii++) {
			if (j < n && x < m) {
				brr = arr[i][j];
				if (i < m - 1) {
					i++;
				}
				x++;
			} else if (j < n - 1 && i == m - 1) {
				j++;
				y++;
				brr = arr[i][j];
			} else if (j == y && i > z) {
				i--;
				brr = arr[i][j];
			} else if (i == z && j > z) {
				j--;
				brr = arr[i][j];
				if (i == z && j == z + 1) {
					z++;
					i++;
					m = m - 1;
					n = n - 1;
					x = z;
					y = z;
				}
			}
			System.out.print(brr + " ");
		}
	}
}