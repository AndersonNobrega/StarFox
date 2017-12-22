package com.company.bdUtils;

import java.sql.*;

public class ConexaoBD {

    private static final String SQCONN = "jdbc:sqlite:users.db";

    public static Connection verificaConexao() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN);
        } catch (ClassNotFoundException error) {
            error.printStackTrace();
            return null;
        }
    }
}
