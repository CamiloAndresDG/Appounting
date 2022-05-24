package com.example.appounting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.appounting.model.TransaccionDTO;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class Movimientos_Panel extends AppCompatActivity {
    Intent intent;
    //Movimiento movimiento;
    TextView textViewSaldoDisponible;
    //ListView listViewMovimientos;
    RecyclerView recyclerViewMovimientos;
    TransaccionAdapter transaccionAdapter;
    //Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String URL = "http://192.168.56.1/Appounting/listar_Movimientos.php";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimientos);
        inicializarElementos();
        /*button = (Button) findViewById(R.id.btnListarDepa);
        ListView
        listViewMovimientos = (ListView) findViewById(R.id.movimientos_ListView);
        getMovimientos(URL);
        listViewMovimientos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Selecteditem = position+"";
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Ha seleccionado " +
                        Selecteditem, Toast.LENGTH_SHORT).show();
                intent = new Intent(Movimientos_Panel.this, Detalle_Movimiento.class);
                intent.putExtra("nombre",(position+1)+"");
                startActivity(intent);
            }
        });
*/

    }

    private void inicializarElementos() {
        recyclerViewMovimientos = findViewById(R.id.recyclerViewMovimientos);
        recyclerViewMovimientos.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<TransaccionDTO> transaccionDTOArrayList = new ArrayList<>();

        TransaccionDTO transaccionDTO = new TransaccionDTO("12fwe", "Pago agua", 37000, false,"28/04/2022","Informacion del movimiento");
        TransaccionDTO transaccionDTO2 = new TransaccionDTO("13fwe", "Hamburguesas", 50000, false,"29/04/2022","Informacion del movimiento");
        TransaccionDTO transaccionDTO3 = new TransaccionDTO("15fwe", "Ingreso de trabajo", 100000, true,"30/04/2022","Informacion del movimiento");

        transaccionDTOArrayList.add(transaccionDTO);
        transaccionDTOArrayList.add(transaccionDTO2);
        transaccionDTOArrayList.add(transaccionDTO3);
        System.out.println(transaccionDTOArrayList.toString());

        transaccionAdapter = new TransaccionAdapter(transaccionDTOArrayList, this);

        recyclerViewMovimientos.setAdapter(transaccionAdapter);

    }
    /*

    public void getMovimientos(String URL) {
        RequestQueue queue = Volley.newRequestQueue(this);
        System.out.println(URL);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                response = response.replace("][", ",");
                if (response.length() > 0) {
                    try {
                        JSONArray json = new JSONArray(response);
                        Log.i("sizejson", "" + json.length());
                        cargarListView(json);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        System.out.println(e);
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error);
            }
        });
        queue.add(stringRequest);
    }

    public void cargarListView(JSONArray json) {

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < json.length(); i += 1) {
            try {
                lista.add(json.getString(i));
            } catch (JSONException e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listViewMovimientos.setAdapter(adaptador); 
    }*/


}