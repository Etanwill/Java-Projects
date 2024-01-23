module com.example.mp3app {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires com.dlsc.formsfx;

    opens com.example.mp3app to javafx.fxml;
    exports com.example.mp3app;
}
