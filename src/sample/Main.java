package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Graf");

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.TOP_CENTER);

        PieChart chart = new PieChart();
        chart.setTitle("Fruits");

        chart.getData().add(new PieChart.Data("Jablka",126));
        chart.getData().add(new PieChart.Data("Hrusky",10));
        chart.getData().add(new PieChart.Data("Pomarance",36));
        chart.getData().add(new PieChart.Data("Jahody",153));

        vBox.getChildren().addAll(chart);

        primaryStage.setScene(new Scene(vBox, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
