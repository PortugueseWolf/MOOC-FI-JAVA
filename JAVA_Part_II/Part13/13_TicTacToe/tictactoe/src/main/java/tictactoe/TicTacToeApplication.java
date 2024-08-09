package tictactoe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    
    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        Board board = new Board();
        BorderPane layout = new BorderPane();

        layout.setTop(board.getLabel());
        layout.setCenter(board.getView());

        layout.setPadding(new Insets(10, 10, 10, 10));

        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}