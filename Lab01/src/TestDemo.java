import java.util.Scanner;

public class TestDemo {
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double y;
	double t=in.nextDouble();
	y=2*Math.pow(t, 3)/(0.12*Math.pow(10, -3)*Math.sin(Math.sqrt(2)));
	System.out.print(y);

	}

}
