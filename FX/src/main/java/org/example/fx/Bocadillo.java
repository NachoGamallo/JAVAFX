package org.example.fx;

import lombok.Getter;

@Getter
public class Bocadillo {

    private String nombre;
    private double precio;

    public Bocadillo(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

}
