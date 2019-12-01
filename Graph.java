/*
As this was new to me I first started by looking at a few examples online.
I ended up using https://docs.oracle.com/javafx/2/charts/bar-chart.htm which has mutiple examples and made my code based around this.
*/

//imports to manage reading from the file.
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//imports for javafx to create the bar chart.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Graph extends Application {

	static int[] amount = new int[28]; //Create the array to read the text file into.

	public static void main(String[] args) throws FileNotFoundException {

		int i = 0; //Used to place read ints into the correct place in array.
		File txt = new File("Amount.txt"); //Importing the text file that we are working with.
		Scanner scan = new Scanner(txt); //Add the imported text file to Scanner utility.

		//Add all the infomation from the text file into the array.
		while(scan.hasNextLine()) {
			int line = scan.nextInt();
			amount[i] = line;
			i++;
		}

		launch(args); //Start javafx by "ignoring" main.
	}

	@Override //Tells the compiler where the starting point for javafx is.

    public void start(Stage Stage) {

			final CategoryAxis X = new CategoryAxis(); //Setting the varible for the x axis.
      final NumberAxis Y = new NumberAxis(); //Setting the varible for the y axis.
      final BarChart<String,Number> chart = new BarChart<>(X,Y); //Creating a list to store the data in.

			Stage.setTitle("Java Assessment One"); //Giving the window a name.

			//Naming the axises.
			X.setLabel("Alphabet");
      Y.setLabel("Letter Frequency");

			//Allowing small gaps to stop bars from touching.
			chart.setCategoryGap(1);
      chart.setBarGap(1);

      XYChart.Series graph = new XYChart.Series(); //Creating the series for the data to be stored in.

			graph.setName("Counting letter frequencies"); //Giving the data in this series a name.

			//Adding infomation points to the series.
			graph.getData().add(new XYChart.Data("A", amount[0]));
      graph.getData().add(new XYChart.Data("B", amount[1]));
      graph.getData().add(new XYChart.Data("C", amount[2]));
      graph.getData().add(new XYChart.Data("D", amount[3]));
      graph.getData().add(new XYChart.Data("E", amount[4]));
      graph.getData().add(new XYChart.Data("F", amount[5]));
      graph.getData().add(new XYChart.Data("G", amount[6]));
      graph.getData().add(new XYChart.Data("H", amount[7]));
      graph.getData().add(new XYChart.Data("I", amount[8]));
      graph.getData().add(new XYChart.Data("J", amount[9]));
			graph.getData().add(new XYChart.Data("K", amount[10]));
      graph.getData().add(new XYChart.Data("L", amount[11]));
      graph.getData().add(new XYChart.Data("M", amount[12]));
      graph.getData().add(new XYChart.Data("N", amount[13]));
      graph.getData().add(new XYChart.Data("O", amount[14]));
      graph.getData().add(new XYChart.Data("P", amount[15]));
      graph.getData().add(new XYChart.Data("Q", amount[16]));
      graph.getData().add(new XYChart.Data("R", amount[17]));
      graph.getData().add(new XYChart.Data("S", amount[18]));
      graph.getData().add(new XYChart.Data("T", amount[19]));
			graph.getData().add(new XYChart.Data("U", amount[20]));
      graph.getData().add(new XYChart.Data("V", amount[21]));
      graph.getData().add(new XYChart.Data("W", amount[22]));
      graph.getData().add(new XYChart.Data("X", amount[23]));
      graph.getData().add(new XYChart.Data("Y", amount[24]));
      graph.getData().add(new XYChart.Data("Z", amount[25]));
      graph.getData().add(new XYChart.Data("Punctuation", amount[26]));

			chart.getData().addAll(graph); //Adding the series to the list so that it can be used by javafx.

      Scene scene = new Scene(chart, 1200, 350); //settting the pixel dimensions of the scene.

      Stage.setScene(scene);
      Stage.show();
		}
}
