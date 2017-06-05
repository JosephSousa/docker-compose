/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.dac.aula.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author natan
 */
public class ConnFactory {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://banco-loja:5432/postgres";
        String user = "postgres";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }
}
