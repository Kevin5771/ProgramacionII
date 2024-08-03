package Cafeteria.Ingredientes;

public class Granos implements Ingredientes {

    private int cantidad;
    private String tipo;

    public Granos(int cantidad, String tipo) {

        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    @Override
    public String ObtenerNombre() {
        return tipo;
    }

    @Override
    public int ObtenerCantidad() {
        return 1;
    }
}

