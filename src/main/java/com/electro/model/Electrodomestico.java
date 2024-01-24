package com.electro.model;

import java.time.LocalDate;

public class Electrodomestico {

    // Desarrollado por Angel Paul Patiño Diaz

    /*
    * De los electrodomésticos se desea almacenar un
    * código que lo dará el mismo almacen (no es el id, pero es único), el nombre, la marca, el modelo,
    * su fecha de elaboración y la cantidad de unidades,
    *  cada uno con su tipo de dato respectivo.*/
    private String codigo;
    private String nombre;
    private String Marca;
    private String modelo;
    private LocalDate fecha;
    private int cantidad;

    public Electrodomestico() {
    }

    public Electrodomestico(String codigo, String nombre, String marca, String modelo, LocalDate fecha, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        Marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }
    // desarrollado por Angel Patiño Diaz

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    // desarrollado por Angel Patiño Diaz

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }
    // desarrollado por Angel Patiño Diaz

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    // desarrollado por Angel Patiño Diaz

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Marca='" + Marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                '}';
    }
}
