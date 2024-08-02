module textstatistics {
    requires javafx.controls;
    requires javafx.fxml;

    opens textstatistics to javafx.fxml;
    exports textstatistics;
}
