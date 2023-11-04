
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab03 {
	

	public static void main(String[] args) {
		
//PART 1:
		int size =getSize("please enter the size");
		double[] arr = new double[size];
		fillarraybyRandom(arr);
		checkArray(arr);
		SumOfElementsWithOddIndices(arr);//sum of elements with odd indices
		Numbermidwaybetween(arr);
		
		
//PART 2:
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the count of columns: ");
		int columns = in.nextInt();
		System.out.println("Enter the count of rows: ");
		int rows = in.nextInt();
		int[][] matrix = new int[rows][columns];
		Random random = new Random();
//fill the matrix by random
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
			matrix[i][j] = random.nextInt(10) - random.nextInt(4);
			}
		}
		int sum=0;
		int summary=0;
		boolean hasNoNegativeElements = true;
		
		
//Sum of elements for rows having no negative elements
		for(int i =0;i<rows;i++) {
			for(int j =0;j<columns;j++) {
				if(matrix[i][j]<0) {
					hasNoNegativeElements=false;
				}
				if(hasNoNegativeElements) {
					sum+=matrix[i][j];
				}
			}	
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
			System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of elements for rows having no negative elements is "+sum);
		
//Minimum sum of elements in diagonals (total count of diagonals）
		for(int i= 0;i<rows;i++) {
			for(int j = 0;j<4;j++){
				if(i==j||i+j==(rows-1)){
					summary+=matrix[i][j];
				}
			}
		}
//sorry,i don't know how to explain it...........i have try a lot of ways
				
		
		System.out.println("Minimum sum of elements in diagonals is "+summary);
	}
	
//PART1:get the size
	public static int getSize(String message) {
		System.out.println(message);
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		return size;
	}
	
	
	
//fill the array by random
	public static void fillarraybyRandom(double[] array) {
		Random random = new Random();
		double [] transfromarray= new double[array.length];		
		for (int i = 0; i < array.length; i++) {
			Boolean Symbol= random.nextBoolean();
			array[i] = random.nextDouble()*100-random.nextDouble()*100;//question1：how to random a zero?
			if(Symbol) {
				array[i]=-1*array[i];	
			}
		}
		
		
//transform the array
		for(int c=0;c<array.length;c++) {
			for(int u=c;u<array.length;u++) {
				if(array[c]<=1) {
					transfromarray[u]=array[c];
				}else {
					transfromarray[u]=0;
				}
			}
		}
		System.out.println("transform array is：");//how to sort the transform array?
		Arrays.sort(transfromarray);
		for(int m=0;m<transfromarray.length;m++) {
			System.out.print(" "+transfromarray[m]);
		}
	}
		
	
	
	
//get sum of odd indices numbers
	public static void SumOfElementsWithOddIndices(double[] arr) {
		double sum =0;
		for(int i =0 ; i<arr.length ; i++) {
			if((i%2)==1) {
				sum+=arr[i];
			}
		}
		System.out.println("");
		System.out.println("Sum of the odd numbers is"+sum);
	}
	
	
	
	
//this is to get number midway between the first negative number and the last negative number
	public static void Numbermidwaybetween(double[] arr) {
		double Summary = 0;
		int f;
		int l;
		
		for(f=0;f<arr.length;f++) {//find the negative number,f stands first
			if(arr[f]<0) {
				break;
			}
		}
		
		for(l=arr.length-1;l>0;l--) {//find the last negative number,l stands last
			if(arr[l]<0) {
				break;
				
			}
		}
		
		for(int n =f;n<l-1;n++) {
			Summary+=arr[n+1];
			
		}
		System.out.println("Sum of elements resided between the first and the last negative elements is"+Summary);
		
	}
	
	
	
	
//this is printing the array	
	public static  void checkArray(double[] arr) {
		System.out.println("");
		System.out.println("the original array is:");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(" "+arr[i]+" ");
		}
	}
		
	
	
	
	

}
