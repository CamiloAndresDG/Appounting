package com.example.appounting.model;

public class CuentaDTO{
    private int numero_cuenta;
    private double monto;
    private UsuarioDTO usuarioDTO;
    
    public CuentaDTO(int numero_cuenta, double monto, UsuarioDTO usuario){
        this.numero_cuenta = numero_cuenta;
        this.monto = monto;
        this.usuarioDTO = usuario;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
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
                "numero_cuenta=" + numero_cuenta +
                ", monto=" + monto +
                ", usuarioDTO=" + usuarioDTO +
                '}';
    }
}