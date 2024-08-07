package vocabulary;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class PracticeView {
    private Dictionary dictionary;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @SuppressWarnings("exports")
    public Parent getView() {

        VBox vPractice = new VBox();

        Label firstLabel = new Label("Translate the word '" + dictionary.getRandomWord() + "'");
        TextField firstField = new TextField();
        Button checkButton = new Button("Check");
        Label answer = new Label();

        vPractice.getChildren().addAll(firstLabel, firstField, checkButton, answer);

        checkButton.setOnAction((event) -> {
            if (firstField.getText().equals(dictionary.getTranslation(dictionary.getLastRandom()))) {
                answer.setText("Correct!");
                firstLabel.setText("Translate the word '" + dictionary.getRandomWord() + "'");
            } else {
                answer.setText("Incorrect! The translation of the word is: '" + dictionary.getTranslation(dictionary.getLastRandom()) + "'");
            }
            
        });
        return vPractice;
    }
}
