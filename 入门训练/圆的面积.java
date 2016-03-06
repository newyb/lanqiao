/*
问题描述
给定圆的半径r，求圆的面积。
输入格式
输入包含一个整数r，表示圆的半径。
输出格式
输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
样例输入
4
样例输出
50.2654825
数据规模与约定
1 <= r <= 10000。
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main 
{ 
    final static double pi=3.14159265358979323;	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		double s=pi*r*r;
		DecimalFormat df=new DecimalFormat("#.0000000");//格式化
		System.out.println(df.format(s));
	}

}