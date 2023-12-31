package 面向对象;


import java.util.Scanner;


public class 类与对象与变量 {//这是定义了一个类,类规范了对象的属性，在类里定义的变量存在于每一个对象中并且都不一样（只是值相同，但是id不同）
	double 余额;//现在这里定义的变量叫做成员变量
	double 价格=80;
	double 得到物品;
	double 总利润;
	double 放进去的钱;
	double 出钱;
	private static int x=1;
	//这是一个static变量，叫做类变量，存在于整个类中而不是存在于类的函数中或者类的对象中，每一个对象都拥有这个类变量
	//并且这个类变量是唯一的，任何对象里的这个类变量值改变了，其他对象里的也会同样改变
	//这是在定义变量，变量不在类里，变量在每一个对象里
	
	
	
	
	
	
	
	
	//现在来了解什么叫构造函数
	类与对象与变量(){
		//这里就是一个构造函数，是当你创建一个类时，系统自动为你创建的东西
		//如果你不写，那么这个构造函数里什么也没有
		//当创建具有某个类属性的对象时：
		/**
		 * 如：
		 * 		类与对象与变量 对象 = new 类与对象与变量（）；
		 * 我们后面的“类与对象与变量（）”就是构造函数的意思
		 * 创建这个对象名为“对象”的对象时，会进入到构造函数里，但是之后又会执行类的操作，最后才会执行构造函数里的操作
		 * 这样就创建了一个有类属性的对象！！！！
		 */
	}
	
	
	
	
	//现在来看看什么是函数的参数
	类与对象与变量(int 价格){
		/**
		 * 这个函数与上面的函数重名了，为什么java运行这件事呢？
		 * 因为参数不同
		 * 这个函数的参数是（int 价格）
		 * 当我调用函数时，如：
		 * 		.类与对象与变量（）
		 * 		.类与对象与变量（100）
		 * 上面调用的是无参数的函数“类与对象与变量”
		 * 下面调用的是参数为int类型的函数“类与对象与变量”
		 */
		
	}
	
	

	 //什么是重载关系？
	/**
	 * 函数名相同但是参数不同，这些函数构成重载关系（overload）
	 */

	
	
	//现在下面是定义函数（对象就是有作用和数据的东西，很抽象，反正大多数东西都是个对象，嘻嘻）
	 void 提示() {
		System.out.println("hello");
	}
	 
	 
	 
	 
	 
	 
	 
	//说明this是什么意思：
	 void 交易(double 余额,double 放进去的钱) {
		 //这是一个实例方法
		余额+=放进去的钱;
		if(余额>=价格) {
		出钱=余额-价格;
		System.out.println("找零"+this.出钱);
		总利润+=价格;
		}
		//我们之前常用的什么int a，然后直接调用了a进行一个动作，实际上是省略了this.前缀
		//在一个成员函数里，this可以省略（可以用this.快速找到你要的变量，做一条懒狗bushi）
		//不能用this的情况：
		//1.出了这个类，就不能调用另一个类的变量了，因为这是你输入的this.只会帮你搜索该类的变量
		//2.static的函数不能调用this.
	}
	 
	 
	 
	 
	 
	 //展示this：
	 void getPrice(int 价格) {
		 this.价格=价格;//这个的意思是把这个成员的价格替换为了上面的价格，前面的this.价格表示上面的价格，你可以把鼠标悬在上面看看归属
		 System.out.print(价格);
	 }
	 
	 
	 
	 
	 //本地变量的含义：
	  void getfood() {
		 System.out.println("here you are"); 
		 int 本地变量;
		 //这个本地变量的定义只存在于函数getfood中，出去了就寄
	 }
	 
	  static void staticgetfood() {
		  
	  }
	  
	
	//调用函数的例子：
	public  static void main(String[] args) {//这是一个static函数，类函数，它只能调用static函数
		类与对象与变量 自动收款机 = new 类与对象与变量();//这是在类“类与对象与变量”里创建了一个名为“自动收款机”的对象
		自动收款机.提示();//这是在对对象“自动收款机” 调用函数“提示”
		double a;double b;
		
		//下面是static变量，类变量
		类与对象与变量.x = 5;
		类与对象与变量.x=0;
		System.out.println(x);
		
		
		
		//下面是static的演示
		getfood();//这个报错了，说明不是static函数就不能在static函数中直接调用
		//但是可以通过创建对象调用
		类与对象与变量 gf = new 类与对象与变量();
		gf.getfood();
		
		staticgetfood();
		
		
		
		
		
	//创建对象的说明：
		Scanner in = new Scanner(System.in);//这一步里其实，scanner就是一个类
		//我们创建了一个具有scanner类属性的对象叫做in
		类与对象与变量 vm = new 类与对象与变量();
		//这一步就是类似与创建输出的步骤，同样是创建了一个具有类与对象与变量这个类的属性的对象，为vm！！！！
		
		
		
		
		自动收款机.交易(a=in.nextDouble(),b=in.nextDouble());
		自动收款机.getfood();
		
	}

}
