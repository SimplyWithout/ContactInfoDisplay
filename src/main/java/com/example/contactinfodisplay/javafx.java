package com.example.contactinfodisplay;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javafx extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creating labels
        Label nameLabel = new Label("Full Name: Josh Custode");
        Label emailLabel = new Label("Montclair Email: custodej1@montclair.edu");
        Label majorLabel = new Label("Major: Computer Science");

        // Adding labels
        VBox root = new VBox(10);
        root.getChildren().addAll(nameLabel, emailLabel, majorLabel);

        // Creating a scene
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Contact Information");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch app
    }
}
