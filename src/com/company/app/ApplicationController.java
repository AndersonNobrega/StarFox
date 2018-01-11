package com.company.app;

import com.company.AppRunner;
import com.company.utils.SecondaryWindowsInit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class ApplicationController {

    private AppRunner appRunner = new AppRunner();

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
            appRunner.getHostServices().showDocument("https://github.com/xReb0rn/StarFox");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void addItem(ActionEvent event) {
        SecondaryWindowsInit.addWindow();
    }
}


