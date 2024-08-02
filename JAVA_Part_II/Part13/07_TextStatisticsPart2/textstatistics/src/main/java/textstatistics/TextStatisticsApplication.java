package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        BorderPane layout = new BorderPane();
        
        HBox bottom = new HBox();
        bottom.setSpacing(10);

        Label lettersLabel = new Label("Letters: ");
        bottom.getChildren().add(lettersLabel);


        Label wordsLabel = new Label("Words: 0");
        bottom.getChildren().add(wordsLabel);

        Label longestLabel = new Label("The longest word is: ");
        bottom.getChildren().add(longestLabel);

        TextArea area = new TextArea();
        layout.setCenter(area);

        area.textProperty().addListener((change, oldValue, newValue) -> {
            int letters = newValue.length();
            lettersLabel.setText(lettersLabel.getText().substring(0, 9) + letters);
            
            String[] splitter = newValue.split(" ");
            int words = splitter.length;
            wordsLabel.setText(wordsLabel.getText().substring(0, 7) + words);

            String longest = Arrays.stream(splitter)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

            longestLabel.setText(longestLabel.getText().substring(0, 21) + longest);
        });
        
        layout.setBottom(bottom);

        Scene scene = new Scene(layout);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}