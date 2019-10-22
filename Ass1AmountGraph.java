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
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ass1AmountGraph extends Application {

	static int[] ammount = new int[27];

	public static void main(String[] args) throws FileNotFoundException {
		int i = 0;
		File txt = new File("Ammount.txt");
		Scanner scan = new Scanner(txt);

		while(scan.hasNextLine()) {
			int line = scan.nextInt();
			ammount[i] = line;
			i++;
		}
		launch(args);
	}

	@Override

    public void start(Stage primaryStage) {

			final CategoryAxis X = new CategoryAxis();
      final NumberAxis Y = new NumberAxis();
      final BarChart<String,Number> barChart = new BarChart<>(X,Y);

      barChart.setCategoryGap(0);
      barChart.setBarGap(1);

			X.setLabel("Alphabet");
      Y.setLabel("Letter Frequency");

      XYChart.Series graph = new XYChart.Series();

			graph.setName("Java Assessment One");
			graph.getData().add(new XYChart.Data("A", ammount[0]));
      graph.getData().add(new XYChart.Data("B", ammount[1]));
      graph.getData().add(new XYChart.Data("C", ammount[2]));
      graph.getData().add(new XYChart.Data("D", ammount[3]));
      graph.getData().add(new XYChart.Data("E", ammount[4]));
      graph.getData().add(new XYChart.Data("F", ammount[5]));
      graph.getData().add(new XYChart.Data("G", ammount[6]));
      graph.getData().add(new XYChart.Data("H", ammount[7]));
      graph.getData().add(new XYChart.Data("I", ammount[8]));
      graph.getData().add(new XYChart.Data("J", ammount[9]));
			graph.getData().add(new XYChart.Data("K", ammount[10]));
      graph.getData().add(new XYChart.Data("L", ammount[11]));
      graph.getData().add(new XYChart.Data("M", ammount[12]));
      graph.getData().add(new XYChart.Data("N", ammount[13]));
      graph.getData().add(new XYChart.Data("O", ammount[14]));
      graph.getData().add(new XYChart.Data("P", ammount[15]));
      graph.getData().add(new XYChart.Data("Q", ammount[16]));
      graph.getData().add(new XYChart.Data("R", ammount[17]));
      graph.getData().add(new XYChart.Data("S", ammount[18]));
      graph.getData().add(new XYChart.Data("T", ammount[19]));
			graph.getData().add(new XYChart.Data("U", ammount[20]));
      graph.getData().add(new XYChart.Data("V", ammount[21]));
      graph.getData().add(new XYChart.Data("W", ammount[22]));
      graph.getData().add(new XYChart.Data("X", ammount[23]));
      graph.getData().add(new XYChart.Data("Y", ammount[24]));
      graph.getData().add(new XYChart.Data("Z", ammount[25]));
      graph.getData().add(new XYChart.Data("Punctuation", ammount[26]));

			barChart.getData().addAll(graph);

      VBox vBox = new VBox();
      vBox.getChildren().addAll(barChart);

      StackPane main = new StackPane();
      main.getChildren().add(vBox);

      Scene scene = new Scene(main, 1200, 350);

      primaryStage.setTitle("Counting letter frequencies");
      primaryStage.setScene(scene);
      primaryStage.show();
		}
}
