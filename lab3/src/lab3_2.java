import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class lab3_2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the count of columns");
            int columns = input.nextInt();
            System.out.println("enter the count of rows");
            int rows = input.nextInt();
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    Random random = new Random();
                    matrix[i][j] = random.nextInt(10) - 2;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }

            int matrix1[] = new int[rows];
            int counts = 0;
            for (int i = 0; i < matrix.length; i++) {
                boolean hasNegativeElement = true;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] < 0) {
                        hasNegativeElement = false;
                    }
                }
                if (hasNegativeElement) {
                    matrix1[counts] = i;
                    counts++;
                }
            }
            int sum = 0;
            for (int i = 0; i < counts; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[matrix1[i]][j];
                }
            }
            System.out.println(sum);
            int[] diagonals = new int[2 * (rows + (columns - 1))];
            int counts1 = 0;
            for (int i = 0, j = 0; j < matrix[i].length; j++) {
                for (int q = i , s = j;(q < rows && s < columns); q++, s++){
                    diagonals[counts1] += matrix[q][s];
                }
                counts1 ++;
            }
            for (int i = 1, j = 0; i < matrix.length; i++) {
                for (int q = i , s = j;q < rows && s < columns; q++, s++){
                    diagonals[counts1] += matrix[q][s];
                }
                counts1 ++;
            }
            for(int i=0;i<rows;i++){
                for(int j =0;j<columns;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][columns-j-1];
                    matrix[i][columns-j-1]=temp;
                }
            }
            for (int i = 0, j = 0; j < matrix[i].length; j++) {
                for (int q = i , s = j;(q < rows && s < columns); q++, s++){
                    diagonals[counts1] += matrix[q][s];
                }
                counts1 ++;
            }
            for (int i = 1, j = 0; i < matrix.length; i++) {
                for (int q = i , s = j;q < rows && s < columns; q++, s++){
                    diagonals[counts1] += matrix[q][s];
                }
                counts1 ++;
            }
            System.out.println(Arrays.toString(diagonals));
            int minSumOfElement=diagonals[0];
            for(int i =0;i<diagonals.length;i++){
                if(minSumOfElement >diagonals[i]){
                    minSumOfElement=diagonals[i];
                }
            }
            System.out.println("The min sum of element is:"+minSumOfElement);
        }

    }

