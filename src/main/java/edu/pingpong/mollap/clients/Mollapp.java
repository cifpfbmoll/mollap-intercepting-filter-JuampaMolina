package edu.pingpong.mollap.clients;

import edu.pingpong.mollap.administrador.ProgramadorTasques;

public class Mollapp implements Client{

    private ProgramadorTasques programadorTasques;

    public Mollapp () {

    }

    @Override
    public void setProgramadorTasques(ProgramadorTasques programadorTasques) {
        this.programadorTasques = programadorTasques;
    }

    @Override
    public void enviarPeticio(String nombre) {
        this.programadorTasques.executarTasques(nombre);
    }
}
