package com.example.appounting.controller.DAO;

import com.example.appounting.model.TransaccionDTO;

import java.util.ArrayList;

public interface TransaccionDAO {
    public boolean create(TransaccionDTO transaccionDTO);
    public TransaccionDTO find(String referencia);
    public ArrayList<TransaccionDTO> findAll();
    public int count();
}
