package 高级面向对象;

interface inf{
	public static final String MSG=""+1;
	abstract boolean methodB(String MSG);
}


abstract class ABS{
	public abstract void methodA();
}

public class Testdemo extends ABS implements inf{
	
	public boolean methodB(String MSG) {
		if(MSG.length()>1) {
			MSG=MSG+1;
			return true;
		}else {
			return false;
		}
		
	}
	
	public void methodA() {
		System.out.println("it overrides the methodA");
	}

	public static void main(String[] args) {
			ABS abs = new Testdemo();
			inf inf = new Testdemo() ;
			if(inf.methodB("i love you")) {
				System.out.println("me too");
			}
			abs.methodA();
	}

}
