package com.danielarroyo.sistema_gestion_congresistas;

import com.danielarroyo.sistema_gestion_congresistas.Ui.Menu;
import com.danielarroyo.sistema_gestion_congresistas.util.Conexion;
import java.sql.Connection;

public class Principal {
    public static void main(String[] args) {
        Connection conn = Conexion.getConexion();
        if (conn != null) {
            System.out.println("✅ Conectado correctamente a gestion_congreso.");
        } else {
            System.out.println("❌ No se pudo conectar.");
        }
    }
}