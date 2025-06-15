package com.danielarroyo.sistema_gestion_congresistas.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/gestion_congreso?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "daniel"; 
    private static final String PASSWORD = "6860179"; 

    public static Connection getConexion() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}
