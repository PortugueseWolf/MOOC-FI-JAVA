package title;

import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        Parameters param = getParameters();
        String title = param.getNamed().get("title");
        stage.setTitle(title);
        stage.show();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give title");
        String title = scanner.nextLine();
        scanner.close();
        Application.launch(Main.class,
            "--title="+title
        );
        launch();
    }

}