package application;
 
import javafx.application.Application;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main extends Application {
 
   @Override
   public void start(Stage primaryStage) throws Exception {
 
       PieChart pieChart = new PieChart();
 
       PieChart.Data slice1 = new PieChart.Data("China", 1275);
       PieChart.Data slice2 = new PieChart.Data("India", 1017);
       PieChart.Data slice3 = new PieChart.Data("Brazil", 172);
       PieChart.Data slice4 = new PieChart.Data("UK", 59);
       PieChart.Data slice5 = new PieChart.Data("USA", 285);
 
       pieChart.getData().add(slice1);
       pieChart.getData().add(slice2);
       pieChart.getData().add(slice3);
       pieChart.getData().add(slice4);
       pieChart.getData().add(slice5);
      
       pieChart.setLegendSide(Side.LEFT);
 
       primaryStage.setTitle("JavaFX PieChart (PieChart)");
       StackPane root = new StackPane(pieChart);
 
       Scene scene = new Scene(root, 400, 200);
 
       primaryStage.setScene(scene);
 
       primaryStage.show();
   }
 
   public static void main(String[] args) {
       Application.launch(args);
   }
}
