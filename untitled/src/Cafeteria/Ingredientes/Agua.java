package Cafeteria.Ingredientes;

public class Agua implements Ingredientes {

    private int cantidad;

    public Agua(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String ObtenerNombre() {
        return "Agua";
    }

    @Override
    public int ObtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Agua{" +
                "cantidad=" + cantidad +
                '}';
    }
}
