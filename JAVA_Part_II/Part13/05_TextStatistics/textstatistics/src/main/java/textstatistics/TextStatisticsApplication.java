package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        
        HBox bottom = new HBox();
        bottom.setSpacing(10);
        bottom.getChildren().add(new Label("Letters: 0"));
        bottom.getChildren().add(new Label("Words: 0"));
        bottom.getChildren().add(new Label("The longest word is:"));

        layout.setCenter(new TextArea());
        layout.setBottom(bottom);


        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}