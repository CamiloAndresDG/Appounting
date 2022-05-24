package com.example.appounting.model;

import java.util.Objects;

public class UsuarioDTO{

    private String usuario;
    private Integer cedula;
    private String password;
    private Short pin;
    private String nombres;
    private String apellidos;
    private String email;

    public UsuarioDTO() {
        this.usuario = "";
        this.cedula = 0;
        this.password = "";
        this.pin = 0;
        this.nombres = "";
        this.apellidos = "";
        this.email = "";
    }

    public UsuarioDTO(String usuario, Integer cedula, String password, Short pin, String nombres, String apellidos, String email) {
        this.usuario = usuario;
        this.cedula = cedula;
        this.password = password;
        this.pin = pin;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getPin() {
        return pin;
    }

    public void setPin(Short pin) {
        this.pin = pin;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioDTO)) return false;
        UsuarioDTO that = (UsuarioDTO) o;
        return getUsuario().equals(that.getUsuario()) && getCedula().equals(that.getCedula()) && getPassword().equals(that.getPassword()) && getPin().equals(that.getPin()) && getNombres().equals(that.getNombres()) && getApellidos().equals(that.getApellidos()) && getEmail().equals(that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsuario(), getCedula(), getPassword(), getPin(), getNombres(), getApellidos(), getEmail());
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "usuario='" + usuario + '\'' +
                ", cedula=" + cedula +
                ", password='" + password + '\'' +
                ", pin=" + pin +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}