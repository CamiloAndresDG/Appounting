package com.example.appounting;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.appounting.model.TransaccionDTO;

public class DetallesMovimientoActivity extends AppCompatActivity {
    TextView referenciaEditText, tituloEditText, valorEditText, fechaEditText, informacionEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_movimiento);
        //TextView
        referenciaEditText = (TextView) findViewById(R.id.textViewReferencia);
        tituloEditText = (TextView) findViewById(R.id.textViewTitulo);
        valorEditText = (TextView) findViewById(R.id.textViewValor);
        fechaEditText = (TextView) findViewById(R.id.textViewFecha);
        informacionEditText = (TextView) findViewById(R.id.textViewInformacion);


        TransaccionDTO transaccionDTO = (TransaccionDTO) getIntent().getSerializableExtra("TransaccionDTO");
        System.out.println(transaccionDTO);

        referenciaEditText.setText(transaccionDTO.getReferencia());
        tituloEditText.setText(transaccionDTO.getNombre());
        valorEditText.setText(transaccionDTO.montoToString());
        fechaEditText.setText(transaccionDTO.getFecha());
        informacionEditText.setText(transaccionDTO.getInformacion());

        //if(transaccionDTO.getIngreso()){
            //textViewValorMovimiento.setTextColor(Color.rgb(0, 255, 0));
        //}else{
            //textViewValorMovimiento.setTextColor(Color.rgb(255, 0, 0));
        //}


        //Intent intent = getIntent();
        //Bundle b = intent.getExtras();
    }







}