package Cafeteria;

import Cafeteria.Cafe.Cafe;
import Cafeteria.Ingredientes.Ingredientes;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Equipo> equipo = new ArrayList<>();
    private List<Ingredientes> ingredientes = new ArrayList<>();
    private List<Cafe> cafe = new ArrayList<>();


    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +

                '}';
    }

    public void  AgregarEmpelado(Empleado empleado){
        System.out.println("Agregando empelado....");
        empleados.add(empleado);
    }

    public void  AgregarEquipo(Equipo equipo1){
        System.out.println("Agregando Equipo....");
        equipo.add(equipo1);
    }

    public void AgregarIngrediente(Ingredientes ingrediente){
        System.out.println("Agregando Ingrediente....");
        ingredientes.add(ingrediente);
    }

    public void AgregarEspecialidad(Cafe especialidad){
        System.out.println("Agregando Especialidad Deseada.....");
    }
}
