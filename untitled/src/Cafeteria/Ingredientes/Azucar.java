package Cafeteria.Ingredientes;

public class Azucar implements Ingredientes{
    private int cantidad;

    public Azucar(int cantidad){
        this.cantidad = cantidad;
    }
    @Override
    public String ObtenerNombre() {
        return "Azucar";
    }

    @Override
    public int ObtenerCantidad() {
        return cantidad;
    }
}
