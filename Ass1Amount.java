import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class Ass1Amount {
	public static void main(String[] args) throws FileNotFoundException { //run providing the text file is present.

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //Creating an array with the alphabet inside.

		int[] amount = new int[27]; //Creating an array full of 27 blank spaces for counting the alphabet and puntuation marks.
		int len = 0; //The total length of the file which has been imported.
		int i = 0; //Used to keep track of point in the text file.
		int j = 0; //Used to keep track of point in alphabet.

		File txt = new File("jc.txt"); //Importing the text file that we are working with.
		Scanner scan = new Scanner(txt); //Add the imported text file to Scanner utility.

		String full = ""; //Blank string to import the .txt file into.

		//Loop through the text file adding each line to the varible full untill the end of the file is reached.
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			full = full + line;
		}

		full = full.replaceAll("\\s+",""); //Removing spaces from the imported text file.
		full = full.toLowerCase(); //Making the whole import one case so it is easier to work with.
		len = full.length(); //Calculate the total length of the string.

		//Loop through the full varible counting the amount a charicture appears for the whole alphabet.
		for(j=0; j<26; j++) {
			for(i=0; i<len; i++) {
				if(full.charAt(i) == (char)Array.get(alphabet,j)) {
					amount[j] = amount[j] + 1;
				}
			}
		}

		int sum = Arrays.stream(amount).sum(); //Total the size of the array.
		amount[26] = len - sum; //Calculate the puntuation marks by taking the full length minus the total array size.

		//Output the total ammount of charictures in the text file.
		for(j=0; j<26; j++) {
			System.out.println("The amount of " + (char)Array.get(alphabet,j) + "'s are: " + Array.get(amount, j));
		}
		System.out.println("The amount of puntuation marks are: " + Array.get(amount, 26)); //Output the amount of puntuation.
	}
}
