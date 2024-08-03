
import Cafeteria.Empleado;
import Cafeteria.Cafe.ExpressoItaliano;
import Cafeteria.Sucursal;
import Cafeteria.Equipo;
import Cafeteria.Ingredientes.*;


public class Main {
    public static void main(String[] args) {
        //Datos Sucursal
        Sucursal sucursal = new Sucursal("Valentina´s","Calle Principal");
        Equipo equipo = new Equipo("Apagado","Cocina");

        // Crear empleado
        Empleado empleado1 = new Empleado("Juan", "Barista", 1200);

        Empleado empleado2 = new Empleado("Maria", "Cajera", 1000);


        //Ingredientes
        Ingredientes agua = new Agua(200);
        Ingredientes leche = new Leche("Entera", 50);

        ExpressoItaliano express = new ExpressoItaliano("Expresso Italiano", 8, 3.00, "Fuerte");

        //Datos Generales
        System.out.println("Datos Sucursal:");
        System.out.println(sucursal);
        sucursal.AgregarEmpelado(empleado1);
        sucursal.AgregarEquipo(equipo);
        sucursal.AgregarIngrediente(agua);
        sucursal.AgregarIngrediente(leche);
        sucursal.AgregarEspecialidad(express);

        // Preparar y servir café
        express.Preparar();
        express.Servir();
    }
}
