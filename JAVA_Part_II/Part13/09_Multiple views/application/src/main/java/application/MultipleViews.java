package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MultipleViews extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        BorderPane firstWindow = new BorderPane();
        VBox secondWindow = new VBox();
        GridPane thirdWindow = new GridPane();

        Scene firstScene = new Scene(firstWindow);
        Scene secondScene = new Scene(secondWindow);
        Scene thirdScene = new Scene(thirdWindow);

        Button firstButton = new Button("To the second view");
        firstButton.setOnAction((event) -> {
            stage.setScene(secondScene);
        });

        Button secondButton = new Button("To the third view!");
        secondButton.setOnAction((event) -> {
            stage.setScene(thirdScene);
        });

        Button thirdButton = new Button("To the first view!");
        thirdButton.setOnAction((evente) -> {
            stage.setScene(firstScene);
        });

        secondWindow.getChildren().addAll(secondButton, new Label("Second view!"));
        firstWindow.setCenter(firstButton);
        firstWindow.setTop(new Label("First view!"));

        thirdWindow.add(new Label("Third view!"), 0, 0);
        thirdWindow.add(thirdButton, 1, 1);

        stage.setScene(firstScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}