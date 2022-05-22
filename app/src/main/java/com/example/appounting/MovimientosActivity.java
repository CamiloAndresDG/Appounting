package com.example.appounting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.appounting.Adapters.TransaccionAdapter;
import com.example.appounting.model.TransaccionDTO;

import java.util.ArrayList;

public class MovimientosActivity extends AppCompatActivity {

    ArrayList<TransaccionDTO> transaccionDTOArrayList;


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
        transaccionDTOArrayList = new ArrayList<>();


        transaccionDTOArrayList.add(new TransaccionDTO("12fwe", "Pago agua", 37000, false,"28/04/2022","Informacion del movimiento"));
        transaccionDTOArrayList.add(new TransaccionDTO("13fwe", "Hamburguesas", 50000, false,"29/04/2022","Informacion del movimiento"));
        transaccionDTOArrayList.add(new TransaccionDTO("15fwe", "Ingreso de trabajo", 100000, true,"30/04/2022","Informacion del movimiento"));


        recyclerViewMovimientos = findViewById(R.id.recyclerViewMovimientos);
        recyclerViewMovimientos.setLayoutManager(new LinearLayoutManager(this));

        TransaccionAdapter transaccionAdapter = new TransaccionAdapter(transaccionDTOArrayList, this, new TransaccionAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(TransaccionDTO transaccionDTO) {
                moveToDescription(transaccionDTO);
            }
        });

        recyclerViewMovimientos.setAdapter(transaccionAdapter);

    }

    private void moveToDescription(TransaccionDTO transaccionDTO) {
        //Bien
        System.out.println("Este es el nombre "+ transaccionDTO.getNombre());
        Intent intent = new Intent(this, DetallesMovimientoActivity.class);
        intent.putExtra("TransaccionDTO", transaccionDTO);
        startActivity(intent);
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