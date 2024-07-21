package Personaje.Villano;

import Personaje.Personaje;

public class Duende extends Personaje implements Villano {
    @Override
    public void Desplazarse() {
        System.out.println("Desplazando" + this.getNombre());
    }

    @Override
    public int MostrarVida() {
        System.out.println("Vida del Personaje: " + this.getVida());

        return getVida();
    }

    @Override
    public void MostrarPoder() {
        System.out.println("Poder del Personaje: " + this.getPoder());
    }

    @Override
    public void atacar() {
        System.out.println("Duende.atacar");
    }

    @Override
    public void destruir() {
        System.out.println("Duende.destruir");

    }
}
