import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = readSize("count of elements");
        int[] array = new int[size];
        fillArrayByRandom(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0)
                sum += array[i];

        }
        System.out.println(sum);
        int theFirstNegative = 0;
        int theLastNegative = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                theFirstNegative = i;
                break;
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < 0) {
                theLastNegative = i;
                break;
            }
        }
        int product = 1;
        for(int i =theFirstNegative+1;i<theLastNegative;i++){
            product *= array[i];
        }
        System.out.println(product);
        int count =0;
        for(int i =0;i<array.length;i++){
            if(array[i]<1 || array[i]==1){
                array[count]=array[i];
                count ++;
            }
        }
        for(int i = count;i<array.length;i++){
            array[i]=0;
        }
        System.out.println(Arrays.toString(array));

    }
    public static int readSize(String message){
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        int size =input.nextInt();
        return size;
    }
    public static void fillArrayByRandom(int[]array){
        Random random = new Random();
        for(int i =0;i<array.length;i++){
            array[i]=random.nextInt(20)-random.nextInt(25);
        }
    }
}
