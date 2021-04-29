package edu.pingpong.mollap.filtres;

public class Autoritzacio implements Filtre {

    public Autoritzacio() {

    }

    @Override
    public void execucio(String nombre) {
        System.out.println("Autorización OK para " + nombre);
    }
}
