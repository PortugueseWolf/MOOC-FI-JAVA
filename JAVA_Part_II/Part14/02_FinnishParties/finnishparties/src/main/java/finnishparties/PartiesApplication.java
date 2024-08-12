package finnishparties;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        HashMap<String, Map<Integer, Double>> values = getMap();

        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        values.keySet().stream()
                .forEach(party -> {
                    XYChart.Series<Number, Number> data = new XYChart.Series<>();
                    data.setName(party);

                    values.get(party).entrySet().stream().forEach(pair -> {
                        data.getData().add(new XYChart.Data<Number, Number>(pair.getKey(), pair.getValue()));
                    });

                    lineChart.getData().add(data);
                });
        Scene scene = new Scene(lineChart, 640, 480);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private HashMap<String, Map<Integer, Double>> getMap() {
        HashMap<String, Map<Integer, Double>> data = new HashMap<>();
        ArrayList<Integer> years = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get("partiesdata.tsv"))) {
            while (reader.hasNextLine()) {
                String[] line = reader.nextLine().split("\t");

                if (line[0].equals("Party")) {
                    for (int i = 1; i < line.length; i++) {
                        years.add(Integer.parseInt(line[i]));
                    }
                } else {
                    String name = line[0];
                    HashMap<Integer, Double> lineData = new HashMap<>();
                    for (int i = 1; i < line.length; i++) {
                        if (line[i].equals("-")) {
                            continue;
                        }
                        lineData.put(years.get(i - 1), Double.parseDouble(line[i]));
                    }
                    data.put(name, lineData);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Integer print : years) {
            System.out.println(print);
        }
        for (String print : data.keySet()) {
            System.out.println(print);
        }
        return data;
    }

}