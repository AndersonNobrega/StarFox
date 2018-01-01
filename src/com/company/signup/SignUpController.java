package com.company.signup;

import com.company.utils.InterfaceInitializer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class SignUpController {

    private SignUpModel signUpModel = new SignUpModel();

    @FXML
    private TextField username;

    @FXML
    private PasswordField firstPassword;

    @FXML
    private PasswordField secondPassword;

    @FXML
    private Button createAccount;

    @FXML
    private Button back;

    @FXML
    private Label accountStatus;

    @FXML
    private Button confirmButton;

    @FXML
    public void creatingAccount(ActionEvent event) {

        try {
            if (this.signUpModel.accountNameExist(username.getText())) {
                this.accountStatus.setText("Username already exists");
            } else if (!(this.signUpModel.passwordsMatch(firstPassword.getText(), secondPassword.getText()))){
                this.accountStatus.setText("Passwords don't match");
            } else {
                signUpModel.registerAccount(username.getText(), firstPassword.getText());
                InterfaceInitializer.closeCurrentWindow(createAccount);
                InterfaceInitializer.successWindow();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void backButton(ActionEvent event) {
        InterfaceInitializer.closeCurrentWindow(back);
        InterfaceInitializer.loginWindow();
    }

    @FXML
    public void confirmCreation(ActionEvent event) {
        InterfaceInitializer.closeCurrentWindow(confirmButton);
        InterfaceInitializer.loginWindow();
    }
}
