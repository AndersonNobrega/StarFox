package com.company.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApp extends Application{

    public void start(Stage stage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/resources/fxml/login.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("StarFox");
            stage.setResizable(false);
            stage.show();
        } catch (IOException error) {
            System.err.println("Arquivo FXML não encontrado");
            System.exit(1);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
