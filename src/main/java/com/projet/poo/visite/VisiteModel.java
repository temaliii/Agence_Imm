package com.projet.poo.visite;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Document(collection = "Visite")
public class VisiteModel {
    @MongoId
    private String id;
    private String idConseil;
    private Date date;

    public VisiteModel(String id, String idConseil, Date date) {
        this.id = id;
        this.idConseil = idConseil;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIdConseil() {
        return idConseil;
    }

    public void setIdConseil(String idConseil) {
        this.idConseil = idConseil;
    }
}
