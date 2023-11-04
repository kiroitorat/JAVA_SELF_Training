package 多重循环;

import java.util.Scanner;

public class 判断是否是质数 {

	public static void main(String[] args) {
		System.out.println("请输入一个数，kiroitorat将为你判断是否为质数");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		for(int i = 2;i<number;i++) {
				if(number%i==0) {
				System.out.println("这不是质数");
				break;
				}
		}
		for(int i = 2;i<number;i++) {
			if(number%i!=0) {
			System.out.println("这是质数");
			break;
			}
	}
	}

}
