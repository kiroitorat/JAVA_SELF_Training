package 判断;

import java.util.Scanner;

public class 判断大小 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		int m=0;
		if(y<x&&x>z) {
			m=z;
			
		}  if(y<z&&x>z) {
			m=x;
		}
			
		     if(x<y&&y>z) {
			 m=y;
		 }
			 
		 System.out.println("最大的是"+m);

	}
}
