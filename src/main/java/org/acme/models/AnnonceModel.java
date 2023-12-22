package org.acme.models;

import java.util.ArrayList;
import java.util.List;

public class AnnonceModel {
    private String titre;
	private String description;
	private String contact;
    private int prix;
	private List<EtatModel> etats;
	private Etat etat;

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

	public AnnonceModel(){

	}

    public AnnonceModel(String titre, String description, String contact, int prix) {
		this.titre = titre;
		this.description = description;
		this.contact = contact;
		this.prix = prix;
		this.etats = new ArrayList<>();
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public List<EtatModel> getEtats() {
        return etats;
    }

    public void setEtats(List<EtatModel> etats) {
        this.etats = etats;
    }

    @Override
	public String toString() {
		return "AnnonceModel [titre=" + titre + ", description=" + description + ", contact=" + contact + ", prix=" + prix
				+ ", etats=" + etats + "]";
	}
}
