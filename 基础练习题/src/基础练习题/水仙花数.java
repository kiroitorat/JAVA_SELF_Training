package 基础练习题;

public class 水仙花数 {

	public static void main(String[] args) {
		for(int n=100;n<=999;n++) {
			int c = n&10;
			int b = (n&10)%10;
			int a = n%100;
			if(n==(c*c*c+b*b*b+a*a*a)) 
				System.out.println(n);	
		}
	}

}
