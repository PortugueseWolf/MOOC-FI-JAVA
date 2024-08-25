package collage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        // Image originalImg = new Image("file:test.png"); // To test the loop with a smaller img
        Image originalImg = new Image("file:monalisa.png");

        PixelReader imgReader = originalImg.getPixelReader();

        int width = (int) originalImg.getWidth();
        int height = (int) originalImg.getHeight();

        WritableImage printedImg = new WritableImage(width, height);
        PixelWriter imgWriter = printedImg.getPixelWriter();

        int coordX = 0;
        int coordY = 0;

        for (int y = 0; y < height; y = y + 2) {
            for (int x = 0; x < width; x = x + 2) {
                Color color = imgReader.getColor(x, y);
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();
                Color newColor = new Color(red, green, blue, opacity);
                imgWriter.setColor(coordX, coordY, newColor);
                imgWriter.setColor(coordX + width / 2, coordY, newColor);
                imgWriter.setColor(coordX, coordY + height / 2, newColor);
                imgWriter.setColor(coordX + width / 2, coordY + height / 2, newColor);
                coordX++;
            }
            coordX = 0;
            coordY++;
        }

        ImageView finalView = new ImageView(printedImg);

        Pane layout = new Pane();
        layout.getChildren().addAll(finalView);
        Scene scene = new Scene(layout, width, height);

        stage.setScene(scene);
        stage.setTitle("Collage");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}