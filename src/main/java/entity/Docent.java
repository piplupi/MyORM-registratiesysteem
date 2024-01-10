package entity;

import jakarta.persistence.*;

@Entity
public class Docent {

    @Id
    @GeneratedValue
    private int docent_id;

    @Column
    private String dvoornaam;

    @Column
    private String dachternaam;


    @Column
    private String docentEmail;

    @Column
    private String datumIndienst;

    @Column
    private String onderdeel;


// Getters and setters

    public int getDocent_id() {
        return docent_id;
    }

    public void setDocent_id(int id) {
        this.docent_id = id;
    }

    public String getvoornaam() {
        return dvoornaam;
    }

    public void setvoornaam(String voornaam) {
        this.dvoornaam = voornaam;
    }

    public String getachternaam() {
        return dachternaam;
    }

    public void setachternaam(String achternaam) {
        this.dachternaam = achternaam;
    }

    public String getDocentEmail() {
        return docentEmail;
    }

    public void setDocentEmail(String docentEmail) {
        this.docentEmail = docentEmail;
    }

    public String getDatumIndienst() {
        return datumIndienst;
    }

    public void setDatumIndienst(String datumIndienst) {
        this.datumIndienst = datumIndienst;
    }

    public String getOnderdeel() {
        return onderdeel;
    }

    public void setOnderdeel(String onderdeel) {
        this.onderdeel = onderdeel;
    }




    @Override
    public String toString() {
        return "Docent{" +
                "ID=" + docent_id +
                ", Voornaam='" + dvoornaam + '\'' +
                ", Achternaam='" + dachternaam + '\'' +
                ", In dienst datum='" + datumIndienst + '\'' +
                ", Email='" + docentEmail + '\'' +
                ", Onderdeel='" + onderdeel + '\'' +
                '}';
    }


}

