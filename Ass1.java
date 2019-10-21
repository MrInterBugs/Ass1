import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Ass1 {
	public static void main(String[] args) throws FileNotFoundException {
		int i = 0;
		File txt = new File("jc.txt");
		Scanner scan = new Scanner(txt);
		while(scan.hasNextLine()) {
			scan.nextLine();
			i++;
		}
		System.out.println("jc.txt contains " + i + " lines.");
	}
}
