package com.example.appounting.model;

public class UsuarioDTO{
    private int cedula;
    private String nombres;
    private String apellidos;
    private String email;
    private String usuario;
    private int pin;

    public UsuarioDTO(int cedula, String nombres, String apellidos, String email, String usuario, int pin){
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.usuario = usuario;
        this.pin = pin;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPassword() {
        return pin;
    }

    public void setPassword(int password) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Usuario {" +
                "cedula=" + cedula +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}