package org.acme.json;

public class shopObject {
    private String titre;
    private String description;
    private String contact;
    private int prix;
    private String etat;

    public shopObject(){
    }

    public shopObject(String titre, String description, String contact, int prix, String etat) {
		super();
		this.titre = titre;
		this.description = description;
		this.contact = contact;
		this.prix = prix;
		this.etat = etat;
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

	public String isEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

    @Override
	public String toString() {
		return "shopObject [titre=" + titre + ", description=" + description + ", contact=" + contact + ", prix=" + prix
				+ ", etat=" + etat + "]";
	}
}
