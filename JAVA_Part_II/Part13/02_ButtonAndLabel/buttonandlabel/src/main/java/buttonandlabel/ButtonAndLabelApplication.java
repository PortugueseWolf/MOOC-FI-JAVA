package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    @Override
    public void start(Stage stage) {

        Button button = new Button("This is my first button!");
        Label label = new Label("Just a label lol");

        FlowPane group = new FlowPane();
        group.getChildren().add(button);
        group.getChildren().add(label);

        Scene view = new Scene(group);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}