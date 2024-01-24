package com.electro.controller;

import com.electro.dao.ElectroDAOImplement;
import com.electro.idao.IElectro;
import com.electro.model.Electrodomestico;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico("111", "Nevera", "Global", "Titanio", LocalDate.of(2023, 05, 01), 2);
        Electrodomestico electrodomestico2 = new Electrodomestico("222", "Cocina", "Indurama", "Rular", LocalDate.of(2020, 11, 11), 2);
        // desarrollado por Angel Patiño Diaz


        // interfaz IAutoDAO para acceder a los metodos
        IElectro oElectroDAO = new ElectroDAOImplement();
        // agregar autos
        oElectroDAO.add(electrodomestico1);
        oElectroDAO.add(electrodomestico2);


        // listar electrodomesticos
        for (Electrodomestico electrodomestico : oElectroDAO.get()) {
            System.out.println(electrodomestico);
        }
    }
}
