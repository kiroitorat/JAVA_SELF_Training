package 高级面向对象;

interface Fruit{
	public void eat();
}



class Apple implements Fruit{
	public void eat() {
		System.out.println("恰苹果~");
	}
}


class PineApple implements Fruit{
	public void eat() {
		System.out.println("恰菠萝~");
	}
}



class Factor{//工厂设计模式
	public static Fruit getInstance(String className) {
		if("Apple".equals(className)) {
			return new Apple();
		}else if("PineApple".equals(className)){
			return new PineApple();
		}else {
			return null;
		}
		
	}
}

public class Demoing {

	public static void main(String[] args) {
		Fruit f = new Apple();//向上转型
		Fruit f2 =Factor.getInstance("Apple");
		Fruit f5 =Factor.getInstance("PineApple");
		f.eat();
		f2.eat();
		f5.eat();
	}

}
