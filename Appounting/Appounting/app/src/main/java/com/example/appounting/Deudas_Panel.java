package com.example.appounting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class Deudas_Panel extends AppCompatActivity {
    Intent intent;
    Button agregarDeudaBoton;
    ListView movimientos_ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deudas);
        //Button
        agregarDeudaBoton = (Button) findViewById(R.id.agregar_deuda_button);
        //ListView
        movimientos_ListView = (ListView) findViewById(R.id.movimientos_ListView);
        String URL = "http://192.168.56.1/Appounting/listar_Deudas.php";
        getDeudas(URL);
        movimientos_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String SelectedItem = position + "";
                Toast.makeText(getApplicationContext(), SelectedItem, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Ha seleccionado " +
                        SelectedItem, Toast.LENGTH_SHORT).show();
                intent = new Intent(Deudas_Panel.this, Deuda_Panel.class);
                intent.putExtra("titulo",(position+1)+"");
                startActivity(intent);
            }
        });

    }

    public void getDeudas(String URL) {
        Toast.makeText(getApplicationContext(), "" + URL, Toast.LENGTH_SHORT).show();
        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                response = response.replace("][", ",");
                if (response.length() > 0) {
                    try {
                        JSONArray ja = new JSONArray(response);
                        Log.i("sizejson", "" + ja.length());
                        CargarListView(ja);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        queue.add(stringRequest);
    }


    public void CargarListView(JSONArray ja) {
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < ja.length(); i += 1) {
            try {
                lista.add(ja.getString(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        movimientos_ListView.setAdapter(adaptador);
    }

}