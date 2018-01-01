package com.company;

import com.company.utils.InterfaceInitializer;
import javafx.application.Application;
import javafx.stage.Stage;

public class AppRunner extends Application {

    public void start(Stage stage) {

        InterfaceInitializer.loginWindow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
