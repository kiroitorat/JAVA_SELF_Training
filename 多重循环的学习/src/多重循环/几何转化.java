package 多重循环;

public class 几何转化 {

	public static void main(String[] args) {
//		长8宽3的长方形
		for(int i = 1; i<= 3; i++) {
			for(int m = 1; m<= 8; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
//345的直角三角形
		for(int x= 1;x<=4;x++) {
			for(int y = 1;y<=x;y++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
