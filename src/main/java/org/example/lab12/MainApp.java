package org.example.lab12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/lab12/MainApp.fxml"));
            BorderPane root = loader.load();

            // Scene setup
            Scene scene = new Scene(root, 1000, 600);
            String css = getClass().getResource("/org/example/lab12/styles.css").toExternalForm();
            if (css == null) {
                System.err.println("CSS file not found");
            } else {
                scene.getStylesheets().add(css);
            }

            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/org/example/lab12/f1_logo.png")));

            primaryStage.setTitle("JavaFX Driver Viewer");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
