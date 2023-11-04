package 判断;

import java.util.Scanner;

public class 数位数 {

	public static void main(String[] args) {
		int amount=0;
		int w=1;
		Scanner in = new Scanner(System.in);
		amount=in.nextInt();
		while(amount>10) {
				amount/=10;w+=1;
		}
		System.out.println("这是"+w+"位数");
	}

}
