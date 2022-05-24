package com.example.appounting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.example.appounting.controller.logic.URL;

public class RegistroUsuario extends AppCompatActivity {

    private EditText pin;
    private URL url;
    private EditText usuarioTxt,cedulaTxt,nombresTxt,apellidosTxt,emailTxt,contrasenaTxt,pinTxt,montoAcutalTxt;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
        usuarioTxt=findViewById(R.id.editTextUser);
        nombresTxt=findViewById(R.id.editTextNombres);
        cedulaTxt=findViewById(R.id.editTextCedula);
        apellidosTxt=findViewById(R.id.editTextApellidos);
        emailTxt=findViewById(R.id.editTextEmail);
        contrasenaTxt=findViewById(R.id.editTextPassword);
        pinTxt=findViewById(R.id.editTextPin);
        montoAcutalTxt=findViewById(R.id.editTextMontoActual);
    }

    public void onClick(View view) {
        registrarPersona(usuarioTxt.getText().toString(),nombresTxt.getText().toString(),cedulaTxt.getText().toString(),
                apellidosTxt.getText().toString(),emailTxt.getText().toString(),
                contrasenaTxt.getText().toString(),pinTxt.getText().toString(),montoAcutalTxt.getText().toString());
    }

    public void registrarPersona(String usuarioTxt,String nombresTxt,String cedulaTxt,String apellidosTxt,String emailTxt,String contrasenaTxt,String pinTxt,String montoAcutalTxt){
        String consulta = "http://"+url.IP+"/"+url.sitio+"/agregarUsuario.php?usuario='" + usuarioTxt+
                "'&cedula=" + cedulaTxt +
                "&password='" + contrasenaTxt +
                "'&pin=" + pinTxt +
                "&nombres='" + nombresTxt +
                "'&apellidos='" + apellidosTxt +
                "'&email='" + emailTxt+"'";
        System.out.println(consulta);
        registrarCuenta();
        //Intent irALogIn =new Intent(RegistroUsuario.this, LogIn.class);
        //startActivity(irALogIn);
        Toast.makeText(getApplicationContext(), "Usuario registrado.", Toast.LENGTH_SHORT).show();
    }

    private void registrarCuenta() {

            String registro = "http://"+url.IP+"/"+url.sitio+"/agregarCuenta.php?monto=" + montoAcutalTxt.getText().toString() +
                    "&persona_usuario='" + usuarioTxt.getText().toString()+"'";
            System.out.println(registro);

    }
}