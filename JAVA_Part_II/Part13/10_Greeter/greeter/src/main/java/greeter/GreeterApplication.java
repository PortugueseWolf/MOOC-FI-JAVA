package greeter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        Label instruction = new Label("Enter your name and start");
        TextField name = new TextField();
        name.setMaxHeight(15);
        Button button = new Button("Start");
        GridPane layout = new GridPane();

        layout.add(instruction, 0, 0);
        layout.add(name, 0, 1);
        layout.add(button, 0, 3);

        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Scene firstView = new Scene(layout);

        Label welcome = new Label();

        StackPane finalLayout = new StackPane();
        finalLayout.setPrefSize(300, 180);
        finalLayout.getChildren().add(welcome);
        finalLayout.setAlignment(Pos.CENTER);

        Scene finalView = new Scene(finalLayout);

        button.setOnAction(event -> {
            
            welcome.setText("Welcome " + name.getText() + "!");
            stage.setScene(finalView);
        });

        stage.setScene(firstView);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}