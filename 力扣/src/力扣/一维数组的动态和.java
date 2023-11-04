package 力扣;

import java.util.Scanner;

public class 一维数组的动态和 {
	public int[] runningsum(int[]nums) {
		int len =nums.length;
		int sum=0;
		for(int i=0;i<len;i++) {
			sum+=nums[i];
			nums[i]=sum;
		}
		return nums;
		
		
		
	}
	public static void main(String[] args) {
		一维数组的动态和 sm = new 一维数组的动态和();
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int arr[]= {a,b,c};
		sm.runningsum(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
