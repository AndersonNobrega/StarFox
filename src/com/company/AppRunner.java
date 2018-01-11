package com.company;

import com.company.utils.PrimaryWindowsInit;
import javafx.application.Application;
import javafx.stage.Stage;

public class AppRunner extends Application {

    public void start(Stage stage) {

        PrimaryWindowsInit.loginWindow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
