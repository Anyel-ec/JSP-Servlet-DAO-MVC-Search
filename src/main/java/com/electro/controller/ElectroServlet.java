package com.electro.controller;

import java.io.*;
import java.time.LocalDate;

import com.electro.dao.ElectroDAOImplement;
import com.electro.idao.IElectro;
import com.electro.model.Electrodomestico;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "servletController", value = "/servletController")
public class ElectroServlet extends HttpServlet {
    // desarrollado por Angel Patiño Diaz
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");



        Electrodomestico electrodomestico1 = new Electrodomestico();
        electrodomestico1.setCodigo("111");
        electrodomestico1.setNombre("Licuadora");
        electrodomestico1.setMarca("Licuadora");
        electrodomestico1.setFecha(LocalDate.of(2023, 11, 05));
        electrodomestico1.setCantidad(20);

        Electrodomestico electrodomestico2 = new Electrodomestico();
        electrodomestico2.setCodigo("222");
        electrodomestico2.setNombre("Lavadora");
        electrodomestico2.setMarca("Indurama");
        electrodomestico2.setFecha(LocalDate.of(2020, 11, 11));
        electrodomestico2.setCantidad(5);

        Electrodomestico electrodomestico3 = new Electrodomestico();
        electrodomestico3.setCodigo("333");
        electrodomestico3.setNombre("Refrigerado");
        electrodomestico3.setMarca("Global");
        electrodomestico3.setFecha(LocalDate.of(2020, 11, 11));
        electrodomestico3.setCantidad(0);

        // desarrollado por Angel Patiño Diaz

        // interfaz  para acceder a los metodos
        IElectro oElectroDAO = new ElectroDAOImplement();
        // agregar electrodomenticos
        oElectroDAO.add(electrodomestico1);
        oElectroDAO.add(electrodomestico2);
        oElectroDAO.add(electrodomestico3);
        // listar electrodomesticos
        for (Electrodomestico electrodomestico: oElectroDAO.get()){
            System.out.println(electrodomestico);
        }

        String opcion = request.getParameter("opcion");

        if (opcion.equals("buscar")) {
            buscarElectro(request, response);
        }
    }
    private void buscarElectro(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigo = request.getParameter("codigo");

        IElectro electroDao = new ElectroDAOImplement();
        Electrodomestico electrodomestico = electroDao.getElectroByCodigo(codigo);
        // desarrollado por Angel Patiño Diaz

        if (electrodomestico != null) {
            int numeroUnidades = electrodomestico.getCantidad();

            if (numeroUnidades > 10) {
               // mayor a 10
                request.setAttribute("electrodomestico", electrodomestico);
                RequestDispatcher dispatcher = request.getRequestDispatcher("mayordiez.jsp");
                dispatcher.forward(request, response);
            } else if (numeroUnidades > 0) {
                // menor a 10
                request.setAttribute("electrodomestico", electrodomestico);
                RequestDispatcher dispatcher = request.getRequestDispatcher("menosdiez.jsp");
                dispatcher.forward(request, response);
            } else if (numeroUnidades == 0){
                // caso contrario
                request.setAttribute("electrodomestico", electrodomestico);
                RequestDispatcher dispatcher = request.getRequestDispatcher("noexiste.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            // electro no encontrado
            RequestDispatcher dispatcher = request.getRequestDispatcher("noexiste.jsp");
            dispatcher.forward(request, response);
        }
    }
    // desarrollado por Angel Patiño Diaz

    public void destroy() {
    }
}