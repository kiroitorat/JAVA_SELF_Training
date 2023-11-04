package 包;
//什么是全名？
import 时钟.Work;//这个就是全名





public class 介绍包 {
	/**什么是包？
	 * 包是一种管理机制，相当于一个文件夹
	 * 我们用类似于scanner的import来做一个类比
	 * import Java.util.Scanner是我们做读入输入的时候放在package下面的东西
	 * 这个意思是需要导入一个包Java，里面的util包，再里面的Scanner文件（其实是个程序，后缀是.java，不信你可以翻翻ecilpse的根目录）
	 * 
	 */
	
	
	static void a() {
		System.out.println(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();//这不是全名
		包.介绍包.a();//这个是全名
	}

}
