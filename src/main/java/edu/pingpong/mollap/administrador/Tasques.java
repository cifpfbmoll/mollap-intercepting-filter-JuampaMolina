package edu.pingpong.mollap.administrador;

import edu.pingpong.mollap.filtres.Filtre;
import edu.pingpong.mollap.targets.Target;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Tasques {

    private List<Filtre> tasques = new LinkedList<Filtre>();
    private Optional<Target> target;

    public Tasques() {

    }

    public List<Filtre> getTasques() {
        return this.tasques;
    }

    public void afegirTasca(Filtre filtre) {
        this.getTasques().add(filtre);
    }

    public Optional<Target> getTarget() {
        return this.target;
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    public void execucio(String nombre) {
        for (Filtre tasca : getTasques()) {
            tasca.execucio(nombre);
        }
        if (target.isPresent()) {
            getTarget().get().execucio(nombre);
        }
    }
}
