package com.example.recycleview_android;

public class Android_Version {

    private String Nom;
    private Integer id,annee,image;


    public Android_Version(String nom, Integer id, Integer annee, Integer image) {
        this.Nom = nom;
        this.id = id;
        this.annee = annee;
        this.image = image;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
