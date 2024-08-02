package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        VBox vertical = new VBox();
        //vertical.setSpacing(10);

        TextField text = new TextField();
        text.setMaxHeight(10);

        Button button = new Button("Update");

        Label label = new Label();
        label.setMinHeight(30);

        button.setOnAction((event)-> {
            label.setText(text.getText());
        });

        vertical.getChildren().addAll(text, button, label);

        Scene scene = new Scene(vertical);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}