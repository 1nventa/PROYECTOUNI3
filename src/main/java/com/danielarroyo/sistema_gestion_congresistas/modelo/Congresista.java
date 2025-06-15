package com.danielarroyo.sistema_gestion_congresistas.modelo;

public class Congresista {
    private int congresista_id;
    private String nombre;
    private String primer_apellido;
    private String institucion_afiliada;
    private String email;
    private String telefono_movil;
    private String fecha_registro;
    private boolean es_miembro_comite;
    private boolean es_organizador;
    
    
    //construtor 

       public Congresista(int congresista_id, String nombre, String primer_apellido, 
                      String institucion_afiliada, String email, String telefono_movil, 
                      String fecha_registro, boolean es_miembro_comite, boolean es_organizador) {
        this.congresista_id = congresista_id;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.institucion_afiliada = institucion_afiliada;
        this.email = email;
        this.telefono_movil = telefono_movil;
        this.fecha_registro = fecha_registro;
        this.es_miembro_comite = es_miembro_comite;
        this.es_organizador = es_organizador;
    }

    // Getters
    public int getCongresista_id() {
        return congresista_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getInstitucion_afiliada() {
        return institucion_afiliada;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono_movil() {
        return telefono_movil;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public boolean isEs_miembro_comite() {
        return es_miembro_comite;
    }

    public boolean isEs_organizador() {
        return es_organizador;
    }

    // Setters
    public void setCongresista_id(int congresista_id) {
        this.congresista_id = congresista_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public void setInstitucion_afiliada(String institucion_afiliada) {
        this.institucion_afiliada = institucion_afiliada;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono_movil(String telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public void setEs_miembro_comite(boolean es_miembro_comite) {
        this.es_miembro_comite = es_miembro_comite;
    }

    public void setEs_organizador(boolean es_organizador) {
        this.es_organizador = es_organizador;
    }
}

