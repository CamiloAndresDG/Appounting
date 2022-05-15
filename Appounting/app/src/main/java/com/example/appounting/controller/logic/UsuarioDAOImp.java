package com.example.appounting.controller.logic;

import android.content.Intent;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.appounting.LogIn;
import com.example.appounting.controller.dao.UsuarioDAO;
import com.example.appounting.model.UsuarioDTO;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class UsuarioDAOImp implements UsuarioDAO{

    private final UsuarioDAO usuarioDAO;
    private URL url;
    RequestQueue requestQueue;

    public UsuarioDAOImp(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public boolean createUser(UsuarioDTO usuarioDTO) {

        return false;
    }
//si
    @Override
    public boolean editUser(UsuarioDTO usuarioDTO) {
        return false;
    }

    @Override
    public boolean deleteUser(String usuario) {
        return false;
    }

    @Override
    public boolean findUser_User(String usuario) {
        return false;
    }

    @Override
    public boolean findUser_Email(String email) {
        return false;
    }

    @Override
    public List<UsuarioDTO> findAll() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
