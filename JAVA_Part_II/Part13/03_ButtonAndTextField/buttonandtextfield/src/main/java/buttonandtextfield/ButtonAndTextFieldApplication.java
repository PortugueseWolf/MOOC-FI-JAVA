package buttonandtextfield;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {

        Button button = new Button("New button");
        TextField text = new TextField("Lorem ipsum");

        FlowPane pane = new FlowPane(Orientation.VERTICAL);

        pane.getChildren().add(button);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}