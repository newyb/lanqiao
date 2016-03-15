import java.util.Scanner;  
  
public class Main {  
  
    static int n;// 有多少组皇后(一白一黑为一组)  
    static int[] w_place;// w_place[i]: 表示第i个白皇后在第i行第w_place[i]列  
    static int[] b_place;// b_place[i]: 表示第i个黑皇后在第i行第b_place[i]列  
    static int[][] arr;  
  
    static int result = 0;  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        while (scanner.hasNext()) {  
            n = scanner.nextInt();  
  
            w_place = new int[n];  
            b_place = new int[n];  
            arr = new int[n][n];  
  
            for (int i = 0; i < n; i++) {  
                for (int j = 0; j < n; j++) {  
                    arr[i][j] = scanner.nextInt();  
                }  
            }  
  
            backdate(0);// 递归回溯  
  
            System.out.println(result);  
  
            result = 0;  
        }  
    }  
  
    private static void backdate(int i) {  
        if (i > n - 1) {  
            result++;  
            return;  
        }  
  
        int w;// 处理第i个白皇后  
        for (w = 0; w < n; w++) {  
            if (checkWhite(i, w)) {  
                w_place[i] = w;  
                arr[i][w] = 0;  
  
                int b;// 处理第i个黑皇后(第i个白皇后有位置放时，才考虑第i个黑皇后)  
                for (b = 0; b < n; b++) {  
                    if (checkBlack(i, b)) {  
                        b_place[i] = b;  
                        arr[i][b] = 0;  
  
                        backdate(i + 1);// 递归  
  
                        arr[i][b] = 1;// 回溯的关键  
                    }  
                }  
  
                arr[i][w] = 1;// 回溯的关键  
            }  
        }  
    }  
  
    private static boolean checkWhite(int i, int j) {  
        if (arr[i][j] == 0) {  
            return false;  
        }  
  
        for (int k = 0; k < i; k++) {  
            if (j == w_place[k] || Math.abs(i - k) == Math.abs(j - w_place[k])) {  
                return false;  
            }  
        }  
        return true;  
    }  
  
    private static boolean checkBlack(int i, int j) {  
        if (arr[i][j] == 0) {  
            return false;  
        }  
  
        for (int k = 0; k < i; k++) {  
            if (j == b_place[k] || Math.abs(i - k) == Math.abs(j - b_place[k])) {  
                return false;  
            }  
        }  
        return true;  
    }  
}  