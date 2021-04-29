package edu.pingpong.mollap.targets;

public class Vehicle implements Target{

    public Vehicle() {

    }

    @Override
    public void execucio(String nombre) {
        System.out.println("Puerta abierta " + nombre + '!');
    }
}
