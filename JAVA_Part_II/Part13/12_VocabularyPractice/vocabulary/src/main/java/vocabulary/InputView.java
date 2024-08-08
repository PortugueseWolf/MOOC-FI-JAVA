package vocabulary;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {
    private Dictionary dictionary;

    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @SuppressWarnings("exports")
    public Parent getView() {

        GridPane vNewWord = new GridPane();

        Label firstLabel = new Label("Word");
        TextField firstField = new TextField();
        Label secondLabel = new Label("Translation");
        TextField secondField = new TextField();
        Button button = new Button("Add the word pair");

        vNewWord.add(firstLabel, 0, 0);
        vNewWord.add(firstField, 0, 1);
        vNewWord.add(secondLabel, 0, 2);
        vNewWord.add(secondField, 0, 3);
        vNewWord.add(button, 0, 4);

        firstLabel.setAlignment(Pos.CENTER);
        vNewWord.setAlignment(Pos.CENTER);
        vNewWord.setVgap(10);
        vNewWord.setHgap(10);

        button.setOnAction((event) -> {
            dictionary.add(firstField.getText(), secondField.getText());
            firstField.clear();
            secondField.clear();
        });

        return vNewWord;
    }
}
