import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class Ass1Amount {
	public static void main(String[] args) throws FileNotFoundException {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int[] amount = new int[27];
		int len = 0;
		int i = 0;
		int j = 0;
		File txt = new File("jc.txt");
		String full = "";
		int count = 0;
		Scanner scan = new Scanner(txt);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			full = full + line;
		}
		full = full.replaceAll("\\s+","");
		full = full.toLowerCase();
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
