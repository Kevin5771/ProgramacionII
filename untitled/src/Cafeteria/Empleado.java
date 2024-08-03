package Cafeteria;

public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void Trabajar(){
        System.out.println("El empleado "+ nombre + " Esta Trabajando");
    }

    public void TomarOrden(){
        System.out.println("Tomando Orden");
    }
}
