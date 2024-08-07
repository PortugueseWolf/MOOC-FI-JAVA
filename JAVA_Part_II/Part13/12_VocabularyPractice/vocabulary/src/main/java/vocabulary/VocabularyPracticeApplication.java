package vocabulary;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VocabularyPracticeApplication extends Application {
    
    private Dictionary dictionary;

    @Override
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws Exception {
        InputView input = new InputView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);
                
        BorderPane layout = new BorderPane();
        HBox top = new HBox();
        Button newWordsButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        top.getChildren().addAll(newWordsButton, practiceButton);
        top.setPadding(new Insets(20, 20, 20, 20));
        top.setSpacing(10);

        layout.setTop(top);

        newWordsButton.setOnAction((event) -> {
            layout.setCenter(input.getView());
        });
        practiceButton.setOnAction((event) -> {
            if (!(dictionary.isEmpty())) {
                layout.setCenter(practiceView.getView());
            }
        });

        layout.setCenter(input.getView());

        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Vocabulary Practice");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}