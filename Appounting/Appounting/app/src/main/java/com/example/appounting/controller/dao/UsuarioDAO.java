package com.example.appounting.controller.dao;

import com.example.appounting.model.UsuarioDTO;

import java.util.List;

public interface UsuarioDAO {
    public boolean createUser(UsuarioDTO usuarioDTO);

    public boolean editUser(UsuarioDTO usuarioDTO);

    public boolean deleteUser(String usuario);

    public boolean findUser_User(String usuario);

    public boolean findUser_Email(String email);

    public List<UsuarioDTO> findAll();

    public int count();
}
