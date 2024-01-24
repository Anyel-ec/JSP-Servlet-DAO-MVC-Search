package com.electro.dao;

import com.electro.idao.IElectro;
import com.electro.model.Electrodomestico;
import com.electro.util.MemoryStore;

import java.util.List;

public class ElectroDAOImplement implements IElectro {

    // desarrollado por Angel Patiño Diaz
    @Override
    public void add(Electrodomestico electrodomestico) {
        MemoryStore.addElectrodomestico(electrodomestico);
    }

    @Override
    public List<Electrodomestico> get() {
        return MemoryStore.getElectrodomestico();
    }
    // desarrollado por Angel Patiño Diaz

    @Override
    public Electrodomestico getElectroByCodigo(String codigo) {
        return MemoryStore.getElectrodomestico(codigo);
    }
}
