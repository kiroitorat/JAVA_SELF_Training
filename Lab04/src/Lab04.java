import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Lab04 {
	public static boolean isCharVowel(char ch) {
			return ch == 'a' || ch == 'e' || ch == 'u'
					|| ch == 'i' || ch == 'o' || ch == 'y';
	}
	public static void getCount() {
		
	}
	public static void main(String[] args) {
		String path = args[0];//upload the file
		File file = new File(path);
		
		
		FileReader fr = null;
		
		//print the file
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		
		
		BufferedReader br = new BufferedReader(fr);
		String line;
		int count = 0;
		try {
			while((line = br.readLine()) != null){//read the text until it is over
				for (String str : line.split(" ")) {
					if(str.length()<5) {// get the words that it's length are lower than 5 
						count++;
					}
					char c = str.charAt(0);
					String toPrint = str;// get the first word
					if (isCharVowel(c)) {
						toPrint = String.valueOf(c).toUpperCase() + str.substring(1);
					}
					System.out.print(toPrint + " ");
				}
			}
		} catch (IOException e) {
		e.printStackTrace();
		}
		System.out.println();
		System.out.println("there are "+count+" words that their length are lower than 5 have ");
	}
}