package edu.pingpong.mollap.administrador;

import edu.pingpong.mollap.filtres.Filtre;
import edu.pingpong.mollap.targets.Target;

public class ProgramadorTasques {

    private Tasques tasques = null;

    public ProgramadorTasques(Target target) {
        tasques = new Tasques();
        tasques.setTarget(target);
    }

    public Tasques getTasques() {
        return this.tasques;
    }

    public void setTasca(Filtre filtre) {
        this.getTasques().afegirTasca(filtre);
    }

    public void executarTasques(String nombre) {
        this.getTasques().execucio(nombre);
    }


}
