package com.projet.poo.client;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Client")
public class ClientModel {
    @MongoId
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String descriptionRecherche;
    private long budget;

    public ClientModel(String id, String nom, String prenom, String email, String descriptionRecherche, long budget, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.descriptionRecherche = descriptionRecherche;
        this.budget = budget;
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public String getDescriptionRecherche() {
        return descriptionRecherche;
    }

    public void setDescriptionRecherche(String descriptionRecherche) {
        this.descriptionRecherche = descriptionRecherche;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }
}
