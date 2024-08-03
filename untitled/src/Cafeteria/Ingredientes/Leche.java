package Cafeteria.Ingredientes;

public class Leche implements Ingredientes {
    private String nombre;
    private int cantidad;


    public Leche(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    @Override
    public String ObtenerNombre() {
        return "Leche: "+ nombre;
    }

    @Override
    public int ObtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Leche{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
