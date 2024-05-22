package com.projet.poo.conseil;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Conseil")
public class ConseilModel {
    @MongoId
    private String id;
    private String idClient;
    private String idPropriete;
    private String conseil;

    public ConseilModel(String id, String idClient, String idPropriete, String conseil) {
        this.id = id;
        this.idClient = idClient;
        this.idPropriete = idPropriete;
        this.conseil = conseil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getConseil() {
        return conseil;
    }

    public void setConseil(String conseil) {
        this.conseil = conseil;
    }
}
