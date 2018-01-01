package com.company.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class InterfaceInitializer {

    private InterfaceInitializer(String path) {
        try {
            Stage appWindow = new Stage();
            Pane appWindowRoot = FXMLLoader.load(getClass().getResource(path));

            Scene scene = new Scene(appWindowRoot);
            appWindow.setScene(scene);
            appWindow.setResizable(false);
            appWindow.setTitle("Starfox");
            appWindow.show();

        } catch (IOException error) {
            System.exit(1);
        }
    }

    public static void closeCurrentWindow(Button button) {
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }

    public static void signUpWindow() {
        new InterfaceInitializer("/resources/fxml/signup.fxml");
    }

    public static void appWindow() {
        new InterfaceInitializer("/resources/fxml/mainscreen.fxml");
    }

    public static void loginWindow() {
        new InterfaceInitializer("/resources/fxml/login.fxml");
    }

    public static void successWindow() {
        new InterfaceInitializer("/resources/fxml/success.fxml");
    }
}
