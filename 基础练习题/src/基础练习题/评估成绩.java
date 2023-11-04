package 基础练习题;

import java.util.Scanner;

public class 评估成绩 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		if(score>=90&&score<=100) 
			System.out.println("优秀");
		else if(score>=80&&score<90)
			System.out.println("良好");
		else if(score>=70&&score<80)
			System.out.println("中等");
		else if(score>=60&&score<70)
			System.out.println("及格");
		else if(score<60)
			System.out.println("不及格");
		else if(score>100)
			System.out.println("你在逗我吧");
	}

}
