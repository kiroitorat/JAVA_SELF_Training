package 浮点数初学;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double foot=(int)(30/3.0);
		double inch;
		Scanner in = new Scanner(System.in);
		foot = in.nextDouble();
		inch = in.nextDouble();
		System.out.println((int)((foot+inch/12.0)*0.3048*100)+"厘米");
		

	}

}
