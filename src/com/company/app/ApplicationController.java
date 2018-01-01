package com.company.app;

import com.company.AppRunner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationController {

    private AppRunner applicationSupport = new AppRunner();

    @FXML
    private MenuItem addButton;

    @FXML
    private MenuItem exitButton;

    @FXML
    private MenuItem gitHubButton;

    @FXML
    public void quit(ActionEvent event) {

        System.exit(0);
    }

    @FXML
    public void openGitHub(ActionEvent event) {

        try {
            applicationSupport.getHostServices().showDocument("https://github.com/xReb0rn/StarFox");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void addWindow(ActionEvent event) {

        try {
            Stage appWindow = new Stage();
            Pane appWindowRoot = FXMLLoader.load(getClass().getResource(""));

            Scene scene = new Scene(appWindowRoot);
            appWindow.setScene(scene);
            appWindow.setResizable(false);
            appWindow.setTitle("Starfox");
            appWindow.show();

        } catch (IOException error) {
            System.exit(1);
        }
    }
}


