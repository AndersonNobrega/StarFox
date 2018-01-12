package com.company.app.add;

import com.company.utils.PrimaryWindowsInit;
import com.company.utils.WindowsInit;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddController implements Initializable {

    @FXML
    private ComboBox<typeOption> type;

    @FXML
    private TextField name;

    @FXML
    private ComboBox<progressOption> progress;

    @FXML
    private Button confirmButton;

    @FXML
    public void backButton(ActionEvent event) {
        WindowsInit.closeCurrentWindow(confirmButton);
        PrimaryWindowsInit.loginWindow();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.type.setItems(FXCollections.observableArrayList(typeOption.values()));
        this.progress.setItems(FXCollections.observableArrayList(progressOption.values()));
    }
}
