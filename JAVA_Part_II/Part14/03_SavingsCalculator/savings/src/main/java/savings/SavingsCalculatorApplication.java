package savings;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
    XYChart.Series<Number, Number> savingsData;

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        // Layout
        BorderPane layout = new BorderPane();

        // Layout children
        VBox sliders = new VBox();
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        layout.setTop(sliders);
        layout.setCenter(lineChart);

        // Savings elements
        BorderPane savingsPane = new BorderPane();
        Label savingsLabel = new Label("Monthly savings");
        Slider savingsSlider = new Slider(25, 250, 25);
        Label savingsSliderLabel = new Label();

        // Savings styling
        savingsPane.setPadding(new Insets(10, 10, 10, 10));
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setMajorTickUnit(25);
        savingsSlider.setBlockIncrement(5);
        savingsSliderLabel.textProperty().bind(savingsSlider.valueProperty().asString("%.1f"));

        savingsPane.setLeft(savingsLabel);
        savingsPane.setCenter(savingsSlider);
        savingsPane.setRight(savingsSliderLabel);

        // Interest elements
        BorderPane interestPane = new BorderPane();
        Label interestLabel = new Label("Yearly interest rate");
        Slider interestSlider = new Slider(0, 10, 0);
        Label interestSliderLabel = new Label();

        // Interest styling
        interestPane.setPadding(new Insets(10, 10, 10, 10));
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setMajorTickUnit(10);
        interestSlider.setBlockIncrement(1);
        interestSliderLabel.textProperty().bind(interestSlider.valueProperty().asString("%.1f"));

        interestPane.setLeft(interestLabel);
        interestPane.setCenter(interestSlider);
        interestPane.setRight(interestSliderLabel);

        sliders.getChildren().addAll(savingsPane, interestPane);

        lineChart.getData().add(0, getSavingsData(savingsSlider.getValue()));
        lineChart.getData().add(0, getInterestData(savingsSlider.getValue(), interestSlider.getValue()));

        // Setting listeners on sliders and changing the saving series data
        savingsSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            lineChart.getData().remove(0);
            lineChart.getData().add(0, getSavingsData(savingsSlider.getValue()));
            lineChart.getData().remove(1);
            lineChart.getData().add(1, getInterestData(savingsSlider.getValue(), interestSlider.getValue()));
        });
        interestSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            lineChart.getData().remove(0);
            lineChart.getData().add(0, getSavingsData(savingsSlider.getValue()));

            lineChart.getData().remove(1);
            lineChart.getData().add(1, getInterestData(savingsSlider.getValue(), interestSlider.getValue()));
        });

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    private XYChart.Series<Number, Number> getSavingsData(Double savings) {
        XYChart.Series<Number, Number> data = new XYChart.Series<Number, Number>();

        for (int i = 0; i <= 30; i++) {
            data.getData().add(new XYChart.Data<Number, Number>(i, (savings * i * 12)));
        }
        return data;
    }

    private XYChart.Series<Number, Number> getInterestData(Double savings, Double interest) {
        XYChart.Series<Number, Number> data = new XYChart.Series<Number, Number>();

        double yearDeposits = savings * 12;
        double interestCalculated = 0.0;
        double test = 0.0;

        for (int i = 0; i <= 30; i++) {
            if (i == 0) {
                data.getData().add(new XYChart.Data<Number, Number>(i, 0));
                continue;
            }
            if (interestCalculated == 0.0) {
                interestCalculated = (yearDeposits) + ((yearDeposits) * (interest / 100));
                System.out.println(interestCalculated);
                test = interestCalculated;
            } else {
                interestCalculated = ((yearDeposits + test) + ((yearDeposits + test) * (interest / 100)));
            }
            data.getData().add(new XYChart.Data<Number, Number>(i, interestCalculated));
            test = interestCalculated;
            System.out.println(interestCalculated);
        }
        return data;
    }
}