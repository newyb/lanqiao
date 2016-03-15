import java.util.Scanner;  
  
public class Main {  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        while (scanner.hasNext()) {  
            double[] temp1 = new double[4];  
            double[] temp2 = new double[4];  
            double[] rect1 = new double[4];  
            double[] rect2 = new double[4];  
  
            for (int i = 0; i < 4; i++) {  
                temp1[i] = scanner.nextDouble();  
            }  
  
            for (int i = 0; i < 4; i++) {  
                temp2[i] = scanner.nextDouble();  
            }  
  
            // 得到第一个矩形的副对角线坐标  
            rect1[0] = Math.min(temp1[0], temp1[2]);  
            rect1[1] = Math.min(temp1[1], temp1[3]);  
            rect1[2] = Math.max(temp1[0], temp1[2]);  
            rect1[3] = Math.max(temp1[1], temp1[3]);  
  
            // 得到第二个矩形的副对角线坐标  
            rect2[0] = Math.min(temp2[0], temp2[2]);  
            rect2[1] = Math.min(temp2[1], temp2[3]);  
            rect2[2] = Math.max(temp2[0], temp2[2]);  
            rect2[3] = Math.max(temp2[1], temp2[3]);  
  
            // 得到矩形相交部分的坐标(副对角线)  
            double[] rect = new double[4];  
            rect[0] = Math.max(rect1[0], rect2[0]);  
            rect[1] = Math.max(rect1[1], rect2[1]);  
            rect[2] = Math.min(rect1[2], rect2[2]);  
            rect[3] = Math.min(rect1[3], rect2[3]);  
  
            double area = 0;  
            if (rect[0] >= rect[2]) {  
                System.out.printf("%.2f\r\n", area);  
            } else {  
                area = (rect[2] - rect[0]) * (rect[3] - rect[1]);  
                System.out.printf("%.2f\r\n", area);  
            }  
        }  
    }  
}  