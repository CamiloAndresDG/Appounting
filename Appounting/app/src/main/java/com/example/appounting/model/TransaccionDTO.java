package com.example.appounting.model;

public class TransaccionDTO{
    private String referencia;
    private String nombre;
    private double monto;
    private boolean ingreso; //True si es ingreso, false si es un gasto
    private String fecha;
    private String informacion;
    //private CuentaDTO cuentaDTO;

    public TransaccionDTO(String referencia, String nombre, double monto, boolean ingreso, String fecha, String informacion){
        this.referencia = referencia;
        this.nombre = nombre;
        this.monto = monto;
        this.ingreso = ingreso;
        this.fecha = fecha; 
        this.informacion = informacion; //null

    }

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


}