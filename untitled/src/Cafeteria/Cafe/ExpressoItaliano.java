package Cafeteria.Cafe;

import Cafeteria.Ingredientes.*;

public class ExpressoItaliano extends Cafe{

    private String intensidad;

    public ExpressoItaliano(String nombre, int tamaño, double precio, String intensidad) {
        super("Expresso", tamaño, precio);
        this.intensidad = intensidad;
        ingredientes.add(new Granos(1,"tostado"));
        ingredientes.add(new Agua(100));
        ingredientes.add(new Leche("Deslactosada", 10));
        ingredientes.add(new Azucar(2));
    }

    public String getIntensidad() {
        return intensidad;

    }

    @Override
    public void Preparar() {
        super.Preparar();
    }

    @Override
    public void Servir() {
        super.Servir();
    }

}
