package com.company.signup;

import com.company.utils.ConexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class SignUpModel {

    private Connection connection;
    private PreparedStatement stmt;
    private ResultSet rs;

    boolean accountNameExist(String user) throws SQLException {

        boolean usernameTaken;
        this.connection = ConexaoBD.bdConnection();

        String sqlRead = "SELECT username, password FROM users WHERE username = ?";

        this.stmt = this.connection.prepareStatement(sqlRead);
        this.stmt.setString(1, user);

        this.rs = this.stmt.executeQuery();

        usernameTaken = this.rs.next();

        this.rs.close();
        this.stmt.close();
        this.connection.close();

        return usernameTaken;
    }

    boolean passwordsMatch(String firstPassword, String secondPassword) {

        return firstPassword.equals(secondPassword);
    }

    void registerAccount(String user, String password) throws SQLException {

        this.connection = ConexaoBD.bdConnection();

        String sqlAdd = "INSERT INTO users(username, password) VALUES(?, ?)";
        this.stmt = this.connection.prepareStatement(sqlAdd);

        this.stmt.setString(1, user);
        this.stmt.setString(2, password);

        this.stmt.executeUpdate();

        this.stmt.close();
        this.connection.close();
    }
}
