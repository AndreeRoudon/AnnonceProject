package org.acme.beans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.acme.models.AnnonceModel;
import org.acme.models.Etat;
import org.acme.models.EtatModel;
import org.acme.services.AnnonceService;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("annonceBean")
@SessionScoped
public class AnnonceBean implements Serializable{
    @Inject
    AnnonceService annonceService;

    private AnnonceModel nouvelleAnnonce;
    private List<EtatModel> etats;
    private Etat selectedEtat;

    @PostConstruct
    public void init() {
        nouvelleAnnonce = new AnnonceModel();

        etats = Arrays.asList(
            new EtatModel(Etat.Mauvais_Etat),
            new EtatModel(Etat.Satisfaisant),
            new EtatModel(Etat.Bon_Etat),
            new EtatModel(Etat.Tres_Bon_Etat)
        );
    }
    
    public Etat getSelectedEtat() {
        return selectedEtat;
    }

    public void setSelectedEtat(Etat selectedEtat) {
        this.selectedEtat = selectedEtat;
    }

    public List<EtatModel> getEtats() {
        return etats;
    }

    public List<AnnonceModel> getAnnonces() {
        return annonceService.getAllAnnonces();
    }

    public AnnonceModel getNouvelleAnnonce() {
        return nouvelleAnnonce;
    }

    public void setNouvelleAnnonce(AnnonceModel nouvelleAnnonce) {
        this.nouvelleAnnonce = nouvelleAnnonce;
    }

    public String valider() {
        annonceService.addAnnonce(nouvelleAnnonce);
        nouvelleAnnonce = new AnnonceModel();

        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Annonce ajoutée avec succès"));

        return "index.xhtml?faces-redirect=true";
    }
}