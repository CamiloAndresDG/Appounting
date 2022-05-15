package com.example.appounting.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appounting.Deudas_Panel;
import com.example.appounting.Movimientos_Panel;
import com.example.appounting.R;

public class Menu extends AppCompatActivity {
    String mensaje,monto;

    TextView userTV,montoTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        String nombreUsuario=getIntent().getStringExtra("nombreUsuario");
        String montoUsuario=getIntent().getStringExtra("montoUsuario");

        Toast.makeText(getApplicationContext(),nombreUsuario, Toast.LENGTH_SHORT).show();
        mensaje= "Hola, "+ nombreUsuario.toString();

        monto="$"+montoUsuario.toString();

        userTV=(TextView) findViewById(R.id.textViewNombre);
        montoTV=(TextView) findViewById(R.id.textViewMonto);

        userTV.setText(mensaje);
        montoTV.setText(monto);

    }

    public void onClick(View view) {
        Intent myIntent = null;
        switch (view.getId()) {
            case R.id.imageButton:
                myIntent = new Intent(Menu.this, Movimientos_Panel.class);
                Toast.makeText(getApplicationContext(),"Movimientos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton2:
                myIntent = new Intent(Menu.this, Deudas_Panel.class);
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