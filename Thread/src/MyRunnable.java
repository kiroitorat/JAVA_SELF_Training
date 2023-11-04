
public class MyRunnable implements Runnable{
	private String runnableName;
	
	public MyRunnable(String name) {
		
		this.runnableName=name;
		System.out.println("创建线程:"+runnableName);
	}
	public static void main(String[] args) {
		MyRunnable t1 = new MyRunnable("1");
		Thread 	T1 = new Thread(t1);
		MyRunnable t2 = new MyRunnable("2");
		Thread 	T2 = new Thread(t2);
		T1.run();
		T2.run();

	}

	@Override
	public void run() {
		
		for (int i = 3; i >0; i--) {
			try {
				synchronized (runnableName) {//锁定线程，使得线程在线路上单一行进,但是会减少性能
					System.out.println("正在关闭线程"+runnableName+"的倒数"+i+"秒");
					Thread.sleep(100);
				}
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		System.out.println("线程"+this.runnableName+"关闭了");
		
	}

}
