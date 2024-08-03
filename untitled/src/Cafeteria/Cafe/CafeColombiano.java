package Cafeteria.Cafe;

public class CafeColombiano extends Cafe{
    private String TipoGrano;


    public CafeColombiano(String nombre, int tamaño, double precio) {
        super(nombre, tamaño, precio);
        this.TipoGrano = "Colombiano";

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
