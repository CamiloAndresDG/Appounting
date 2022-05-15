package com.example.appounting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.appounting.controller.logic.URL;

import java.util.HashMap;
import java.util.Map;

public class Deuda_Panel extends AppCompatActivity {

    EditText editTextText_Titulo, editText_Valor, editText_Fecha_Pago_Esperado, editText_Detalles;
    TextView textView_Estado, textView_Id, textView_Cantidad_Cuotas, textView_Valor_Cuota;
    RequestQueue requestQueue;
    private URL url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deuda_panel);
        requestQueue = Volley.newRequestQueue(this);

        textView_Cantidad_Cuotas = (TextView) findViewById(R.id.textView_Cantidad_Cuotas);
    }

    public void updatePersona(View view){
        StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                "http://"+url.IP+"/"+url.sitio+"/update.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(getApplicationContext(), "Usuario actualizado", Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                //parametros.put("identificacion", identificacion.getText().toString());
                //parametros.put("nombres", names.getText().toString());
                //parametros.put("apellidos", lastNames.getText().toString());
                return parametros;
            }
        };
        requestQueue.add(stringRequest);
    }

    public void pagarCuota(View view){
        int valorCuotaActual = Integer.parseInt(textView_Cantidad_Cuotas.getText().toString());
        int valorCuotaNuevo = valorCuotaActual - 1;
        textView_Cantidad_Cuotas.setText(valorCuotaNuevo);
        StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                "http://"+url.IP+"/"+url.sitio+"/update.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(getApplicationContext(), "Usuario actualizado", Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("cantidadCuotas", textView_Cantidad_Cuotas.getText().toString());
                return parametros;
            }
        };
        requestQueue.add(stringRequest);
    }


}