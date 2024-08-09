package tictactoe;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class Board {

    private String player;
    private Label label;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private boolean end;

    public Board() {
        this.player = "X";

        this.btn1 = new Button(" ");
        this.btn2 = new Button(" ");
        this.btn3 = new Button(" ");
        this.btn4 = new Button(" ");
        this.btn5 = new Button(" ");
        this.btn6 = new Button(" ");
        this.btn7 = new Button(" ");
        this.btn8 = new Button(" ");
        this.btn9 = new Button(" ");
        this.label = new Label("Turn: " + player);

        this.end = false;
    }
    
    @SuppressWarnings("exports")
    public Parent getView() {
        GridPane layout = new GridPane();
        
        label.setFont(Font.font("Monospaced", 40));
        btn1.setFont(Font.font("Monospaced", 40));
        btn2.setFont(Font.font("Monospaced", 40));
        btn3.setFont(Font.font("Monospaced", 40));
        btn4.setFont(Font.font("Monospaced", 40));
        btn5.setFont(Font.font("Monospaced", 40));
        btn6.setFont(Font.font("Monospaced", 40));
        btn7.setFont(Font.font("Monospaced", 40));
        btn8.setFont(Font.font("Monospaced", 40));
        btn9.setFont(Font.font("Monospaced", 40));

        layout.add(btn1, 0, 0);
        layout.add(btn2, 0, 1);
        layout.add(btn3, 0, 2);
        layout.add(btn4, 1, 0);
        layout.add(btn5, 1, 1);
        layout.add(btn6, 1, 2);
        layout.add(btn7, 2, 0);
        layout.add(btn8, 2, 1);
        layout.add(btn9, 2, 2);

        layout.setVgap(5);
        layout.setHgap(5);
        layout.setPadding(new Insets(10,10,10,10));
        btn1.setOnAction((event) -> {
            buttonClick(btn1);
        });
        btn2.setOnAction((event) -> {
            buttonClick(btn2);
        });
        btn3.setOnAction((event) -> {
            buttonClick(btn3);
        });
        btn4.setOnAction((event) -> {
            buttonClick(btn4);
        });
        btn5.setOnAction((event) -> {
            buttonClick(btn5);
        });
        btn6.setOnAction((event) -> {
            buttonClick(btn6);
        });
        btn7.setOnAction((event) -> {
            buttonClick(btn7);
        });
        btn8.setOnAction((event) -> {
            buttonClick(btn8);
        });
        btn9.setOnAction((event) -> {
            buttonClick(btn9);
        });
        return layout;
    }

    public String getPlayer() {
        return player;
    }

    private void updateLabel() {
        label.setText("Turn: " + player);
    }

    private void buttonClick(Button btn) {
        if (btn.getText().equals(" ") && !(end)) {
            btn.setText(player);
            changePlayer();
            updateLabel();
            endGame();
        }
    }

    private void changePlayer() {
        if (player.equals("X")) {
            player = "O";
        } else {
            player = "X";
        }
    }

    @SuppressWarnings("exports")
    public Parent getLabel() {
        return label;
    }

    private void endGame() {
        if (btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) && areFilled(btn1, btn2, btn3)) {
            label.setText("The end!");
            end = true;
        }
        if (btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && areFilled(btn4, btn5, btn6)) {
            label.setText("The end!");
            end = true;
        }
        if (btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) && areFilled(btn7, btn8, btn9)) {
            label.setText("The end!");
            end = true;
        }
        if (btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) && areFilled(btn1, btn5, btn9)) {
            label.setText("The end!");
            end = true;
        }
        if (btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText()) && areFilled(btn3, btn5, btn7)) {
            label.setText("The end!");
            end = true;
        }
    }

    private boolean areFilled(Button btn1, Button btn2, Button btn3) {
        if (btn1.getText().equals(" ") || btn2.getText().equals(" ") || btn3.getText().equals(" ")) {
            return false;
        }
        return true;
    }
}
