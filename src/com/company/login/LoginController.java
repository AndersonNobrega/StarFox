package com.company.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;

public class LoginController {

    private LoginModel loginModel = new LoginModel();

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginButton;
    @FXML
    private Button signUpButton;
    @FXML
    private Label loginStatus;

    @FXML
    public void login(ActionEvent event) {

        try {
            if (this.loginModel.isLogin(this.username.getText(), this.password.getText())) {
                Stage stage = (Stage) this.loginButton.getScene().getWindow();
                stage.close();
            } else {
                this.loginStatus.setText("Wrong Login");
            }

        } catch (SQLException error) {
            System.exit(1);
        }
    }
}
