package hurray;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HurraaSovellus extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        // Because this exercise was made on a older version of java and javafx the AudioClip class has been deprecated and marked for deletion, so the fix is to simply make a button that does nothing
        BorderPane layout = new BorderPane();
        
        Button button = new Button("Hurray");

        button.setOnAction((event) -> {

        });
        layout.setCenter(button);
        Scene scene = new Scene(layout, 600, 400);
        stage.setTitle("Hurray");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}