package org.acme.services;

import java.util.ArrayList;
import java.util.List;

import org.acme.models.AnnonceModel;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AnnonceService {

    private List<AnnonceModel> annonces = new ArrayList<>();

    public List<AnnonceModel> getAllAnnonces() {
        return annonces;
    }

    public void addAnnonce(AnnonceModel annonce) {
        annonces.add(annonce);
    }
}