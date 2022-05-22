package com.example.appounting.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appounting.DeudasActivity;
import com.example.appounting.MovimientosActivity;
import com.example.appounting.R;

public class MenuActivity extends AppCompatActivity {
    String mensaje;

    TextView userTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        String nombreUsuario=getIntent().getStringExtra("nombreUsuario");
        Toast.makeText(getApplicationContext(),nombreUsuario, Toast.LENGTH_SHORT).show();
        mensaje= "Hola, "+ nombreUsuario.toString();
        System.out.println(mensaje);
        userTV=(TextView) findViewById(R.id.textView11);
        userTV.setText(mensaje);
    }

    public void onClick(View view) {
        Intent myIntent = null;
        switch (view.getId()) {
            case R.id.imageButton:
                myIntent = new Intent(com.example.appounting.view.MenuActivity.this, MovimientosActivity.class);
                Toast.makeText(getApplicationContext(),"Movimientos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton2:
                myIntent = new Intent(com.example.appounting.view.MenuActivity.this, DeudasActivity.class);
                Toast.makeText(getApplicationContext(),"Deudas", Toast.LENGTH_SHORT).show();

                break;
            case R.id.imageButton5:
                //myIntent = new Intent(Menu.this, Gastos.class);
                Toast.makeText(getApplicationContext(),"Gastos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton4:
               // myIntent = new Intent(Menu.this, Prestamos.class);
                Toast.makeText(getApplicationContext(),"Prestamos", Toast.LENGTH_SHORT).show();
                break;
            //case R.id.imageButton3:
                //myIntent = new Intent(Menu.this, Prestamos_Solicitados.class);
               // Toast.makeText(getApplicationContext(),"Prestamos Solicitados", Toast.LENGTH_SHORT).show();
               // break;
            case R.id.imageButton11:
                //myIntent = new Intent(Menu.this, Metas_Y_Ahorros.class);
                Toast.makeText(getApplicationContext(),"Metas y Ahorros", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton8:
                //myIntent = new Intent(Menu.this, Menu.class);
                Toast.makeText(getApplicationContext(),"Menu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton6:
                //myIntent = new Intent(Menu.this, Ajustes.class);
                Toast.makeText(getApplicationContext(),"Ajustes", Toast.LENGTH_SHORT).show();
                break;
        }
        startActivity(myIntent);
    }
}