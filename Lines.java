import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Lines {
	public static void main(String[] args) throws FileNotFoundException { //run providing the text file is present. https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileNotFoundException.html

		int i = 0; //Varible to count the amount of lines.
		File txt = new File("jc.txt"); //Importing the text file that we are working with.
		Scanner scan = new Scanner(txt); //Add the imported text file to Scanner utility.

		//Loop through the file counting each line untill it reaches the end.
		while(scan.hasNextLine()) {
			scan.nextLine();
			i++;
		}

		System.out.println("jc.txt contains " + i + " lines."); //output the number of lines.
	}
}
