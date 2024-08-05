package joke;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        GridPane layout = new GridPane();
        HBox buttons = new HBox();

        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        Label text = new Label("What do you call a bear with no teeth?");

        buttons.getChildren().addAll(joke, answer, explanation);
        buttons.setAlignment(Pos.CENTER);

        text.setAlignment(Pos.CENTER);

        layout.add(buttons, 0, 0);
        layout.add(text, 0, 1);


        layout.setPrefSize(400, 180);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10,10,10,10));
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        stage.setScene(scene);

        stage.show();

        joke.setOnAction(event -> {
            text.setText("What do you call a bear with no teeth?");
        });

        answer.setOnAction(event -> {
            text.setText("A gummy bear.");
        });

        explanation.setOnAction(event -> {
            text.setText("Beacause gummy bears don't have teeth duh");
        });

    }

    public static void main(String[] args) {
        launch();
    }

}