package com.example.appounting.controller.DAO;

import com.example.appounting.controller.DAO.CuentaDAO;
import com.example.appounting.model.CuentaDTO;

import java.util.ArrayList;

public class CuentaDAOImp implements CuentaDAO {

    @Override
    public boolean create(CuentaDTO cuentaDTO) {
        return false;
    }

    @Override
    public CuentaDTO find(String numeroCuenta) {
        return null;
    }

    @Override
    public ArrayList<CuentaDTO> findAll() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
