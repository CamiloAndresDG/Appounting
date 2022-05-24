package com.example.appounting.controller.DAO;

import com.example.appounting.model.CuentaDTO;
import com.example.appounting.model.TransaccionDTO;

import java.util.ArrayList;

public interface CuentaDAO {
    public boolean create(CuentaDTO cuentaDTO);
    public CuentaDTO find(String numeroCuenta);
    public ArrayList<CuentaDTO> findAll();
    public int count();
}
