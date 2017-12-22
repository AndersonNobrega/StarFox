package com.company.login;

import com.company.bdUtils.ConexaoBD;

import java.sql.*;

class LoginModel {

    private Connection connection;

    LoginModel() {

        try {
            this.connection = ConexaoBD.verificaConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (this.connection == null) {
            System.err.println("Conexão com bando de dados não encontrada");
            System.exit(1);
        }
    }

    boolean isLogin(String user, String password) throws SQLException{
        PreparedStatement stmt;
        ResultSet rs;

        String sqlRead = "SELECT username, password FROM users WHERE username = ? and password = ?";

        stmt = this.connection.prepareStatement(sqlRead);
        stmt.setString(1, user);
        stmt.setString(2, password);
        rs = stmt.executeQuery();

        return rs.next();
    }
}
