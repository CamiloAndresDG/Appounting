package com.example.appounting.controller.DAO;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.appounting.controller.DAO.CuentaDAO;
import com.example.appounting.controller.DAO.CuentaDAOImp;
import com.example.appounting.controller.DAO.TransaccionDAO;
import com.example.appounting.model.TransaccionDTO;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/*public class TransaccionDAOImp implements TransaccionDAO {

    private final CuentaDAO cuentaDAO;

    public TransaccionDAOImp(){
        this.cuentaDAO = new CuentaDAOImp();
    }

    @Override
    public boolean create(TransaccionDTO transaccionDTO) {
        return false;
    }

    //este como se puede hacer para retornar el objeto
    @Override
    public TransaccionDTO find(String referencia) {
       JsonArrayRequest jsonArrayRequest = new JsonArrayRequest("USLCambiar", new Response.Listener<JSONArray>() {
           @Override
           public void onResponse(JSONArray response) {
               JSONObject jsonObject = null;
               for (int i = 0; i < response.length(); i++) {
                   try {
                       jsonObject = response.getJSONObject(i);
                       TransaccionDTO transaccion = new TransaccionDTO(
                                jsonObject.getString("referencia"),
                                jsonObject.getString("nombre"),
                                jsonObject.getDouble("monto"),
                                jsonObject.getBoolean("ingreso"),
                                jsonObject.getString("fecha"),
                                jsonObject.getString("detalles")
                                //cuentaDAO.find(jsonObject.getString("numeroCuenta").getNumeroCuenta())
                        );
                   } catch (JSONException e) {
                       System.out.println("Error " + e);
                   }
               }
           }
       }, new Response.ErrorListener() {
           @Override
           public void onErrorResponse(VolleyError error) {
               System.out.println("Error " + error);
           }
       });
        return transaccion;
    }
/*
    @Override
    public ArrayList<TransaccionDTO> findAll() {
        ArrayList<TransaccionDTO> transacciones = new ArrayList<>();

        //RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                response = response.replace("][", ",");
                if (response.length() > 0) {
                    try {
                        JSONArray json = new JSONArray(response);
                        Log.i("sizejson", "" + json.length());
                        //CargarListView(json);
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
        return transacciones;
    }

    @Override
    public int count() {
        return 0;
    }
}*/
