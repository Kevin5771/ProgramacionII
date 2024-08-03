package Cafeteria.Cafe;

import Cafeteria.Ingredientes.Ingredientes;

import java.util.ArrayList;
import java.util.List;

public class Cafe implements Ingredientes {
    private String nombre;
    private int tamaño;
    private  double precio;
    protected List<Ingredientes> ingredientes = new ArrayList();

    public Cafe(String nombre, int tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;

    }
    public void Preparar(){
        System.out.println("Preparando " + nombre);
    }

    public void Servir(){
        System.out.println("Servir " + nombre);
    }

    @Override
    public String ObtenerNombre() {
        return "";
    }

    @Override
    public int ObtenerCantidad() {
        return 0;
    }
}
