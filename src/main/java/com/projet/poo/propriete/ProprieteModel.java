package com.projet.poo.propriete;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Propriete")
public class ProprieteModel {
    @MongoId
    private String id;
    private long prix;
    private String adresse;
    private float superficie;
    private int nbChambres;
    private String nomProprietaire;
    private String prenomProprietaire;
    private String telephone;
    private String email;
    private String description;

    public ProprieteModel(String id, long prix, String adresse, float superficie, int nbChambres, String prenomPropriete, String email, String description, String nomProprietaire, String telephone) {
        this.id = id;
        this.prix = prix;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbChambres = nbChambres;
        this.prenomProprietaire = prenomPropriete;
        this.email = email;
        this.description = description;
        this.nomProprietaire = nomProprietaire;
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPrenomProprietaire() {
        return prenomProprietaire;
    }

    public void setPrenomProprietaire(String prenomProprietaire) {
        this.prenomProprietaire = prenomProprietaire;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }
}
