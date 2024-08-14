package unfair;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class UnfairAdvertisementApplication extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis(0, 80, 1);
        yAxis.setLabel("Faster and Better!");

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        barChart.setTitle("Internet speed");
        barChart.setLegendVisible(false);

        XYChart.Series<String,Number> speeds = new XYChart.Series<String,Number>();
        speeds.getData().add(new XYChart.Data<String,Number>("NDA", 77.4));
        speeds.getData().add(new XYChart.Data<String,Number>("Fastie", 77.2));
        speeds.getData().add(new XYChart.Data<String,Number>("SuperNet", 77.1));
        speeds.getData().add(new XYChart.Data<String,Number>("Meganet", 77.1));

        barChart.getData().add(speeds);
        Scene view = new Scene(barChart, 400, 300);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}