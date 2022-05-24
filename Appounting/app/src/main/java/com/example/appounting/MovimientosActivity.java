package com.example.appounting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.appounting.Adapters.TransaccionesAdapter;
import com.example.appounting.model.TransaccionDTO;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MovimientosActivity extends AppCompatActivity {

    ArrayList<TransaccionDTO> transaccionDTOArrayList;


    Intent intent;
    //Movimiento movimiento;
    TextView textViewSaldoDisponible;
    //ListView listViewMovimientos;
    RecyclerView recyclerViewMovimientos;
    TransaccionesAdapter transaccionesAdapter;
    //Button button;
    String URL = "http://192.168.56.1/Appounting/listarTransacciones.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        transaccionDTOArrayList = new ArrayList<>();
        listarTransacciones();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimientos);
        inicializarElementos();
    }

    private void inicializarElementos() {
        recyclerViewMovimientos = findViewById(R.id.recyclerViewMovimientos);
        recyclerViewMovimientos.setLayoutManager(new LinearLayoutManager(this));
        TransaccionesAdapter transaccionesAdapter = new TransaccionesAdapter(transaccionDTOArrayList, this, new TransaccionesAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(TransaccionDTO transaccionDTO) {
                moveToDescription(transaccionDTO);
            }
        });
        recyclerViewMovimientos.setAdapter(transaccionesAdapter);
    }

    private void moveToDescription(TransaccionDTO transaccionDTO) {
        //Bien
        System.out.println("Este es el nombre "+ transaccionDTO.getNombre());
        Intent intent = new Intent(this, DetallesMovimientoActivity.class);
        intent.putExtra("TransaccionDTO", transaccionDTO);
        startActivity(intent);
    }

    private void listarTransacciones(){
        StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String exito = jsonObject.getString("exito");
                    JSONArray jsonArray = jsonObject.getJSONArray("datos");
                    if (exito.equals("1")){
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject object = jsonArray.getJSONObject(i);
                            String referencia = object.getString("referencia");
                            String nombre = object.getString("nombre");
                            double monto = object.getDouble("monto");
                            boolean tipo = Boolean.valueOf(object.getString("tipo"));
                            String fecha = object.getString("fecha");
                            String informacion = object.getString("detalles");
                            String cuenta = object.getString("cuenta_numero_cuenta");
                            TransaccionDTO transaccionDTO = new TransaccionDTO(referencia, nombre, monto, tipo, fecha, informacion);
                            agregarALista(transaccionDTO);
                        }
                    }
                } catch (JSONException e) {
                    System.out.println("1");
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MovimientosActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    private void agregarALista(TransaccionDTO transaccionDTO) {
        this.transaccionDTOArrayList.add(transaccionDTO);
    }


}