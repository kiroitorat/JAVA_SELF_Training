package 判断;

import java.util.Scanner;

public class 开关情况 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int type=in.nextInt();
		switch (type)
		{
		case 1:System.out.println("啊巴阿巴");
		case 2:
			System.out.println("你好");
		break;
		case 3:
			System.out.println("晚上好");
			break;
		case 4:
			System.out.println("再见");
			break;
			default:
				System.out.println("嗨嗨嗨,来了啊");
		}
		

	}

}
