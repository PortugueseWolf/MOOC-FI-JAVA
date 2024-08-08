package vocabulary;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {
    private Dictionary dictionary;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @SuppressWarnings("exports")
    public Parent getView() {

        GridPane vPractice = new GridPane();

        Label firstLabel = new Label("Translate the word '" + dictionary.getRandomWord() + "'");
        TextField firstField = new TextField();
        Button checkButton = new Button("Check");
        Label answer = new Label();

        vPractice.add(firstLabel, 0 , 0);
        vPractice.add(firstField, 0 , 1);
        vPractice.add(checkButton, 0 , 2);
        vPractice.add(answer, 0 , 3);



        vPractice.setAlignment(Pos.CENTER);
        vPractice.setHgap(10);
        vPractice.setVgap(10);

        checkButton.setOnAction((event) -> {
            if (firstField.getText().equals(dictionary.getLastRandom())) {
                answer.setText("Correct!");
                firstLabel.setText("Translate the word '" + dictionary.getRandomWord() + "'");
            } else {
                answer.setText("Incorrect! The translation of the word is: '" + dictionary.getLastRandom() + "'");
            }
            
        });
        return vPractice;
    }
}
