import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args){
        String winner = null;
        int num_word = 0;
        do{
            String word = StdIn.readString();
            num_word = num_word + 1;
            if(StdRandom.bernoulli(1/num_word)){
              winner = word;  
            }
        } while(StdIn.isEmpty()== false);
    }
}
