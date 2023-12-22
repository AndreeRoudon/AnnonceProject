package org.acme.models;

public class EtatModel {
    private Etat etat;

    public EtatModel(Etat etat) {
        this.etat = etat;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
