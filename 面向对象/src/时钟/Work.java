package 时钟;

public class Work {
	private int value = 0;//private规定的是对象，但是管理的是类，它限制了这个对象的访问只能是在该类里面
	private int limit = 0;
	
	Work(int limit){
		this.limit=limit;
	}
	
	void increase() {
		value++;
		if(value==limit)
			value=0;
	}
	
	//public是开放访问，如果没有写，那就默认为friendly，意思是这个package里可以访问
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {//这里的main函数只是个演示，当在其他类被调用时，main函数是不存在的，因为是static的
		Work value = new Work(60);
		while(true) {
			value.increase();
			System.out.println(value.getValue());
		}
	}

}
