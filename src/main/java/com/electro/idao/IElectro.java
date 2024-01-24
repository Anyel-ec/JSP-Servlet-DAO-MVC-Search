package com.electro.idao;

import com.electro.model.Electrodomestico;
import java.util.List;

public interface IElectro {

    // desarrollado por Angel Patiño Diaz


    void add(Electrodomestico electrodomestico);

    List<Electrodomestico> get();

    Electrodomestico getElectroByCodigo(String codigo);
}
