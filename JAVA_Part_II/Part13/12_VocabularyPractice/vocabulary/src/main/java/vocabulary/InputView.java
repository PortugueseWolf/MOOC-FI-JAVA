package vocabulary;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;

public class InputView {
    private Dictionary dictionary;

    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @SuppressWarnings("exports")
    public Parent getView() {

        VBox vNewWord = new VBox();

        Label firstLabel = new Label("Word");
        TextField firstField = new TextField();
        Label secondLabel = new Label("Translation");
        TextField secondField = new TextField();
        Button button = new Button("Add the word pair");

        vNewWord.getChildren().addAll(firstLabel, firstField, secondLabel, secondField, button);
        vNewWord.setAlignment(Pos.CENTER);

        button.setOnAction((event) -> {
            dictionary.add(firstField.getText(), secondField.getText());
            firstField.clear();
            secondField.clear();
        });

        return vNewWord;
    }
}
