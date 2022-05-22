package com.example.appounting.model;

import java.io.Serializable;

public class TransaccionDTO implements Serializable {
    private String referencia;
    private String nombre;
    private double monto;
    private boolean ingreso; //True si es ingreso, false si es un gasto
    private String fecha;
    private String informacion;
   // private CuentaDTO cuentaDTO;

    public TransaccionDTO(String referencia, String nombre, double monto, boolean ingreso, String fecha, String informacion){
        this.referencia = referencia;
        this.nombre = nombre;
        this.monto = monto;
        this.ingreso = ingreso;
        this.fecha = fecha; 
        this.informacion = informacion; //null

    }

    /*public TransaccionDTO(String referencia, String nombre, double monto, boolean ingreso, String fecha, String informacion, CuentaDTO cuentaDTO){
        this.referencia = referencia;
        this.nombre = nombre;
        this.monto = monto;
        this.ingreso = ingreso;
        this.fecha = fecha;
        this.informacion = informacion; //null
        this.cuentaDTO = cuentaDTO;

    }*/

    public String getReferencia(){
        return this.referencia;
    }

    public void setReferencia(String referencia){
        this.referencia = referencia;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setMonto(double monto){
        this.monto = monto;
    }

    public double getMonto(){
        return this.monto;
    }

    public boolean getIngreso(){
        return this.ingreso;
    }

    public void setIngreso(boolean ingreso){
        this.ingreso = ingreso;
    }

    public String getFecha(){
        return this.fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getInformacion(){
        return this.informacion;
    }

    //public CuentaDTO getCuentaDTO() {
        //return cuentaDTO;
    //}

    //public void setCuentaDTO(CuentaDTO cuentaDTO) {
        //this.cuentaDTO = cuentaDTO;
    //}

    public String montoToString(){
        if(this.ingreso){
            return "$ " + this.monto;
        }
        return "$ -" + this.monto;
    }

    @Override
    public String toString() {
        return "TransaccionDTO{" +
                "referencia='" + referencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", monto=" + monto +
                ", ingreso=" + ingreso +
                ", fecha='" + fecha + '\'' +
                ", informacion='" + informacion + '\'' +
                //", persona='" + cuentaDTO.getNumero_cuenta() + '\'' +
                '}';
    }
}