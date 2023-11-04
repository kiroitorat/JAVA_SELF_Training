package 函数;

import java.util.Scanner;

public class 函数初学 {
	public static int max(int a,int b) {//定义类里面的函数max
		int m;
		m=a;
		return m;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		max(12,56);
		method.sum(1,10);
		method.sum(10, 20);
		method.sum(35, 45);
	}
}
//下面是类方法，其实就相当于重开了个class文件，你看右边嘛
class method{
	static void sum(int a,int b){
		int i; int sum=0;
		for(i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
