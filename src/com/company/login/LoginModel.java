package com.company.login;

import com.company.utils.ConexaoBD;

import java.sql.*;

class LoginModel {

    private Connection connection;
    private PreparedStatement stmt;
    private ResultSet rs;

    boolean isLogin(String user, String password) throws SQLException {

        boolean accountExists;
        this.connection = ConexaoBD.bdConnection();

        String sqlRead = "SELECT username, password FROM users WHERE username = ? and password = ?";

        this.stmt = this.connection.prepareStatement(sqlRead);
        this.stmt.setString(1, user);
        this.stmt.setString(2, password);
        this.rs = this.stmt.executeQuery();

        accountExists = this.rs.next();

        this.rs.close();
        this.stmt.close();
        this.connection.close();

        return accountExists;
    }
}
