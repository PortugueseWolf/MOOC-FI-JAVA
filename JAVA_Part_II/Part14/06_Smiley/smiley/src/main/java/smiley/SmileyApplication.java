package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        BorderPane layout = new BorderPane();
        Canvas canvas = new Canvas(640, 480);
        GraphicsContext context = canvas.getGraphicsContext2D();

        context.setFill(Color.BLACK);
        layout.setCenter(canvas);

        // Making the smiley
        context.fillRect(200, 50, 50, 50);
        context.fillRect(400, 50, 50, 50);
        context.fillRect(150, 250, 50, 50);
        context.fillRect(450, 250, 50, 50);
        context.fillRect(200, 300, 250, 50);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.setTitle("Smiley");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}