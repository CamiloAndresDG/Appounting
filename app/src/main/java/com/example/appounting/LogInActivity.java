package com.example.appounting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.appounting.controller.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class LogInActivity extends AppCompatActivity {
    private EditText pin;
    private URL url;
    private EditText usuarioTxt,contrasenaTxt;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        usuarioTxt=findViewById(R.id.editTextUser);
        contrasenaTxt = findViewById(R.id.editTextNumberPassword);
    }

    public void onClick(View view) {
        if(usuarioTxt.toString().equals("")){
            usuarioTxt.setError("Campo vacio");
        }else if (contrasenaTxt.toString().equals("")){
            contrasenaTxt.setError("Campo vacio");
        }else{
            if(usuarioTxt.toString().contains("@")){
                if(usuarioTxt.toString().contains(".") && usuarioTxt.toString().contains(".com")){
                    String consulta = "http://"+url.IP+"/"+url.sitio+"/buscarUsuario_Correo.php?email=" + usuarioTxt.getText().toString() + "&password=" + contrasenaTxt.getText().toString()+ "&pin=" + contrasenaTxt.getText().toString()+"";
                    System.out.println(consulta);
                    buscarUsuario(consulta);
                }else{
                    Toast.makeText(getApplicationContext(), "Su correo electronico no esta completo.", Toast.LENGTH_SHORT).show();
                }
            }else{
                String consulta = "http://"+url.IP+"/"+url.sitio+"/buscarUsuario_Usuario.php?usuario=" + usuarioTxt.getText().toString() + "&password=" + contrasenaTxt.getText().toString()+ "&pin=" + contrasenaTxt.getText().toString()+"";
                System.out.println(consulta);

                System.out.println(consulta);
                buscarUsuario(consulta);
            }
        }
    }

    private void buscarUsuario(String URL) {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, response -> {
            JSONObject jsonObject;
            for (int i = 0; i < response.length(); i++) {
                try {
                    jsonObject = (JSONObject) response.getJSONObject(i);
                    if (usuarioTxt.getText().toString().equals(jsonObject.getString("usuario")) &&
                            contrasenaTxt.getText().toString().equals(jsonObject.getString("password"))) {
                        Intent irAMenu =new Intent(LogInActivity.this, com.example.appounting.view.MenuActivity.class);
                        irAMenu.putExtra("nombreUsuario",jsonObject.getString("nombres"));
                        startActivity(irAMenu);
                        Toast.makeText(getApplicationContext(), "Bienvenido usuario", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "NO SE PUDO", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    Toast.makeText(getApplicationContext(), e.getMessage() + e, Toast.LENGTH_SHORT).show();
                }
            }
        }, error -> Toast.makeText(getApplicationContext(), "El usuario o la contraseña son incorrectos o no extisten. " + error,
                Toast.LENGTH_SHORT).show()
        );
        requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }
}