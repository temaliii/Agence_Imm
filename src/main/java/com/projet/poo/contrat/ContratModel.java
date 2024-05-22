package com.projet.poo.contrat;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Contrat")
public class ContratModel {
    @MongoId
    private String id;
    private String type;
    private String idAgent;
    private String idClient;
    private String idPropriete;
    private float fraisAgence;
    private String description;
    private long prixFinal;

    public ContratModel(String id, String type, long prixFinal, String description, float fraisAgence, String idPropriete, String idClient, String idAgent) {
        this.id = id;
        this.type = type;
        this.prixFinal = prixFinal;
        this.description = description;
        this.fraisAgence = fraisAgence;
        this.idPropriete = idPropriete;
        this.idClient = idClient;
        this.idAgent = idAgent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(String idAgent) {
        this.idAgent = idAgent;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdPropriete() {
        return idPropriete;
    }

    public void setIdPropriete(String idPropriete) {
        this.idPropriete = idPropriete;
    }

    public float getFraisAgence() {
        return fraisAgence;
    }

    public void setFraisAgence(float fraisAgence) {
        this.fraisAgence = fraisAgence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrixFinal() {
        return prixFinal;
    }

    public void setPrixFinal(long prixFinal) {
        this.prixFinal = prixFinal;
    }
}
