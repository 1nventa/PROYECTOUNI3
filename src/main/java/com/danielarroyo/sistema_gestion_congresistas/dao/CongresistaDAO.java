package com.danielarroyo.sistema_gestion_congresistas.dao;

import com.danielarroyo.sistema_gestion_congresistas.modelo.Congresista;
import com.danielarroyo.sistema_gestion_congresistas.util.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<Congresista> listar() {
        List<Congresista> lista = new ArrayList<>();
        String sql = "SELECT * FROM congresista";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Congresista c = new Congresista(
                    rs.getInt("congresista_id"),
                    rs.getString("nombre"),
                    rs.getString("primer_apellido"),
                    rs.getString("institucion_afiliada"),
                    rs.getString("email"),
                    rs.getString("telefono_movil"),
                    rs.getString("fecha_registro"),
                    rs.getBoolean("es_miembro_comite"),
                    rs.getBoolean("es_organizador")
                );
                lista.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public boolean editar(Congresista c) {
        String sql = "UPDATE congresista SET nombre=?, primer_apellido=?, institucion_afiliada=?, email=?, telefono_movil=?, es_miembro_comite=?, es_organizador=? WHERE congresista_id=?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getPrimer_apellido());
            ps.setString(3, c.getInstitucion_afiliada());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getTelefono_movil());
            ps.setBoolean(6, c.isEs_miembro_comite());
            ps.setBoolean(7, c.isEs_organizador());
            ps.setInt(8, c.getCongresista_id());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM congresista WHERE congresista_id=?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
