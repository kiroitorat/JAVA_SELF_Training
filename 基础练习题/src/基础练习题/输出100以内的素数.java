package 基础练习题;

public class 输出100以内的素数 {

	public static void main(String[] args) 
	{
		for(int n=101;n<=199;n++)
		{
			if((n%2)-1==0&&(n%3)!=0)
			{
				System.out.println(n);
			}
		}
	}

}
