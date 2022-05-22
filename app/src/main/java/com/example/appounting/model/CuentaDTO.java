package com.example.appounting.model;

import java.io.Serializable;

public class CuentaDTO implements Serializable {
    private int numeroCuenta;
    private double monto;
    private UsuarioDTO usuarioDTO;

    public CuentaDTO(){
        this.numeroCuenta = 0;
        this.monto = 0;
        this.usuarioDTO = null;
    }
    
    public CuentaDTO(int numero_cuenta, double monto, UsuarioDTO usuario){
        this.numeroCuenta = numero_cuenta;
        this.monto = monto;
        this.usuarioDTO = usuario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" +
                "numero_cuenta=" + numeroCuenta +
                ", monto=" + monto +
                ", usuarioDTO=" + usuarioDTO +
                '}';
    }
}