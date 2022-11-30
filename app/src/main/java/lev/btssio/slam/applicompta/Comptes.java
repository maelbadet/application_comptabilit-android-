package lev.btssio.slam.applicompta;

import android.database.Cursor;

import java.util.ArrayList;

public class Comptes {

    String nom;
    String description;

    public Comptes(String nom, String desc) {
        this.nom = nom;
        this.description = desc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


