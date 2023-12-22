package org.acme.beans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.acme.models.AnnonceModel;
import org.acme.models.Etat;
import org.acme.services.AnnonceService;

import jakarta.annotation.PostConstruct;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("filterBean")
@ViewScoped
public class FilterBean implements Serializable{
    @Inject
    AnnonceService annonceService;

    String etatFilter = Etat.Tres_Bon_Etat.toString();
    List<AnnonceModel> annonces;

    @PostConstruct
    public void init() {
        this.annonces = annonceService.getAllAnnonces();
    }

    public String getEtatFilter() {
        return etatFilter;
    }

    public void setEtatFilter(String etat) {
        this.etatFilter = etat;
    }

    public List<AnnonceModel> getFilteredAnnonces() {
        return this.annonces.stream()
                .filter(a -> a.getEtat().toString().equals(this.etatFilter))
                .collect(Collectors.toList());
    }

    public List<String> getEtatTypes() {
        return Arrays.asList(Etat.Mauvais_Etat.toString(), Etat.Satisfaisant.toString(),
                Etat.Bon_Etat.toString(), Etat.Tres_Bon_Etat.toString());
    }

    public void changeEtatFilter(ValueChangeEvent event) {
        String newValue = (String) event.getNewValue();
        this.setEtatFilter(newValue);
    }
}
