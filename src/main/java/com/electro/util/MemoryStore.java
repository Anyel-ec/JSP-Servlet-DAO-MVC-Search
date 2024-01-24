package com.electro.util;

import com.electro.model.Electrodomestico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// desarrollado por Angel Patiño Diaz

public class MemoryStore {
 /// desarrollado por Angel Patiño

    private static HashMap<String, Electrodomestico> electrodomesticos= new HashMap<>();

    //añadir
    public static void addElectrodomestico(Electrodomestico electrodomestico){
        String codigo = electrodomestico.getCodigo();
        if (electrodomesticos.containsKey(codigo)) {
            electrodomesticos.remove(codigo, electrodomestico);
        }
        electrodomesticos.put(codigo, electrodomestico);
    }

    //listar todos
    public static List<Electrodomestico> getElectrodomestico(){
        return new ArrayList<>(electrodomesticos.values());
    }

    //obtener un electrodomestico por codigo
    public static Electrodomestico getElectrodomestico(String codigo){
        return electrodomesticos.get(codigo);
    }

    // desarrollado por Angel Patiño Diaz


}
