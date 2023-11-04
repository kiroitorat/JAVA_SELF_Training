import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a number to start");
		Scanner in = new Scanner(System.in);
		double a = in.nextInt();
		double numerator = Math.sin(2*a)+Math.sin(a*5)-Math.sin(3*a);
		double denominator = Math.cos(a)-Math.cos(3*a)+Math.cos(5*a);
		double z1 = numerator/denominator;
		double z2 = Math.tan(3*a);
		System.out.println("z1="+z1);
		System.out.println("z2="+z2);
		System.out.println("Thank you for your using!");

	}

}
