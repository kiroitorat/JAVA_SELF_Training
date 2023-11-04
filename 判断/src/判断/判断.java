package 判断;

import java.util.Scanner;

public class 判断 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);int balance=0;
		while(true) {
			System.out.println("请投币");
			int amount = in.nextInt();
			balance=balance+amount;
			//放钱
			System.out.println(amount);
			if(balance>=10) {
				System.out.println("票价为10元");
				System.out.println("找零" + (balance-10)+"元");
				balance=0;
				
			}else {
				System.out.println("金额不足十元");
			}
				
		}
		

	}

}
