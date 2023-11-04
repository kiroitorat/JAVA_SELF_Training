package 时钟;

public class Clock {
	Work hour = new Work(24);
	Work minute = new Work(60);
	
	
	void start() {
		while(true) {
			minute.increase();
			if(minute.getValue()==0) {
				hour.increase();
			}
			System.out.println(hour.getValue()+"  "+minute.getValue());
		}
	}
	
	
	
	void express() {
		
	}
	
	public static void main(String[] args) {
		Clock clock = new Clock();
		clock.start();
		clock.express();

			
		}
	

}
