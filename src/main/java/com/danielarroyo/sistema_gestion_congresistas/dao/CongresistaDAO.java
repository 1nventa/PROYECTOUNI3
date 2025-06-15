package com.danielarroyo.sistema_gestion_congresistas.dao;


import com.danielarroyo.sistema_gestion_congresistas.modelo.Congresista;
import com.danielarroyo.sistema_gestion_congresistas.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CongresistaDAO {

    public boolean registrar(Congresista c) {
        String sql = "INSERT INTO congresista (nombre, primer_apellido, institucion_afiliada, email, telefono_movil, fecha_registro, es_miembro_comite, es_organizador) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getPrimer_apellido());
            ps.setString(3, c.getInstitucion_afiliada());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getTelefono_movil());
            ps.setString(6, c.getFecha_registro());
            ps.setBoolean(7, c.isEs_miembro_comite());
            ps.setBoolean(8, c.isEs_organizador());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
