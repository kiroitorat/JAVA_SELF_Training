package 基础练习题;

import java.util.Scanner;

public class 键盘录入求星期 {

	public static void main(String[] args) {
		System.out.println("请输入1-7的一个数字");
		Scanner in = new Scanner(System.in);
		int number =in.nextInt();
		switch (number) {
			case 1: {
				System.out.println("星期一");
				break;
				}
			case 2:{
				System.out.println("星期二");break;
			}
			case 3:{
				System.out.println("星期三");break;
				}
			case 4:{
				System.out.println("星期四");break;	
				}
			case 5:{
				System.out.println("星期五");break;
				}
			case 6:{
				System.out.println("星期六");break;	
				}
			case 7:
				System.out.println("星期天");break;
		}
			

	}

}
