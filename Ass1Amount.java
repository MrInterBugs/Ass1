import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class Ass1Amount {
	public static void main(String[] args) throws FileNotFoundException {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //Creating an array with the alphabet inside.
		int[] amount = new int[27]; //Creating an array full of 27 blank spaces for counting the alphabet and puntuation marks.
		int len = 0; //The total length of the file which has been imported.
		int i = 0;
		int j = 0;
		File txt = new File("jc.txt"); //Importing the text file that we are working with.
		String full = ""; //Blank string to import the .txt file into.
		int count = 0;
		Scanner scan = new Scanner(txt);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			full = full + line;
		}
		full = full.replaceAll("\\s+",""); //Removing spaces from the imported text file.
		full = full.toLowerCase(); //Making the whole import one case so it is easier to work with.
		len=full.length();
		for(j=0; j<26; j++) {
			for(i=0; i<len; i++) {
				if(full.charAt(i) == (char)Array.get(alphabet,j)) {
					count++;
				}
			}
			amount[j] = count;
			count = 0;
		}
		int sum = Arrays.stream(amount).sum();
		amount[26] = len - sum;
		for(j=0; j<26; j++) {
			System.out.println("The amount of " + (char)Array.get(alphabet,j) + "'s are: " + Array.get(amount, j));
		}
		System.out.println("The amount of puntuation marks are: " + Array.get(amount, 26));
	}
}
