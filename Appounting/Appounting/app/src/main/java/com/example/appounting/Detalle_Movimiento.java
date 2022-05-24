package com.example.appounting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Detalle_Movimiento extends AppCompatActivity {
    TextView referenciaEditText, tituloEditText, valorEditText, fechaEditText, informacionEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_movimiento);
        //TextView
        referenciaEditText = (TextView) findViewById(R.id.referencia_TextView);
        tituloEditText = (TextView) findViewById(R.id.titulo_TextView);
        valorEditText = (TextView) findViewById(R.id.valor_TextView);
        fechaEditText = (TextView) findViewById(R.id.fecha_TextView);
        informacionEditText = (TextView) findViewById(R.id.informacion_TextView);
    }

    //Metodo que trae toda la informacion de la base de datos sobre un movimiento y lo carga en cada TextView
    public void cargarDatos(){

    }


}