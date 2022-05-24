package com.example.appounting.model;

public class DeudaDTO {
    private String referencia;
    private String nombre;
    private double montoTotal;
    private double montoRestante;
    private int cantidadCuotas;
    private int cantidadCuotasRestantes;
    private String fechaLimitePago;
    private boolean estado;
    private String descripcion;
    private CuentaDTO cuentaDTO;

    public DeudaDTO(String referencia, String nombre, double montoTotal, double montoRestante, int cantidadCuotas, int cantidadCuotasRestantes, String fechaLimitePago, boolean estado, String descripcion, CuentaDTO cuentaDTO) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.montoTotal = montoTotal;
        this.montoRestante = montoRestante;
        this.cantidadCuotas = cantidadCuotas;
        this.cantidadCuotasRestantes = cantidadCuotasRestantes;
        this.fechaLimitePago = fechaLimitePago;
        this.estado = estado;
        this.descripcion = descripcion;
        this.cuentaDTO = cuentaDTO;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoRestante() {
        return montoRestante;
    }

    public void setMontoRestante(double montoRestante) {
        this.montoRestante = montoRestante;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getCantidadCuotasRestantes() {
        return cantidadCuotasRestantes;
    }

    public void setGetCantidadCuotasRestantes(int cantidadCuotasRestantes) {
        this.cantidadCuotasRestantes = cantidadCuotasRestantes;
    }

    public String getFechaLimitePago() {
        return fechaLimitePago;
    }

    public void setFechaLimitePago(String fechaLimitePago) {
        this.fechaLimitePago = fechaLimitePago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CuentaDTO getCuentaDTO() {
        return cuentaDTO;
    }

    public void setCuentaDTO(CuentaDTO cuentaDTO) {
        this.cuentaDTO = cuentaDTO;
    }

    @Override
    public String toString() {
        return "DeudaDTO{" +
                "referencia='" + referencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", montoTotal=" + montoTotal +
                ", montoRestante=" + montoRestante +
                ", cantidadCuotas=" + cantidadCuotas +
                ", getCantidadCuotasRestantes=" + cantidadCuotasRestantes +
                ", fechaLimitePago='" + fechaLimitePago + '\'' +
                ", estado=" + estado +
                ", descripcion='" + descripcion + '\'' +
                ", cuentaDTO=" + cuentaDTO.toString() +
                '}';
    }
}
