package edu.pingpong.mollap.clients;

import edu.pingpong.mollap.administrador.ProgramadorTasques;

public interface Client {

    public void setProgramadorTasques(ProgramadorTasques programadorTasques);

    public void enviarPeticio(String nombre);
}
