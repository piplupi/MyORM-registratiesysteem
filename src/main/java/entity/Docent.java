package entity;

import jakarta.persistence.*;

@Entity
public class Docent {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String voornaam;

    @Column(nullable = false)
    private String achternaam;

    @Column(nullable = false)
    private String onderdeel;

    @Column(nullable = false)
    private String datumIndienst;

// Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getvoornaam() {
        return voornaam;
    }

    public void setvoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getachternaam() {
        return achternaam;
    }

    public void setachternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getOnderdeel() {
        return onderdeel;
    }

    public void setOnderdeel(String onderdeel) {
        this.onderdeel = onderdeel;
    }

    public String getDatumIndienst() {
        return datumIndienst;
    }

    public void setDatumIndienst(String datumIndienst) {
        this.datumIndienst = datumIndienst;
    }

    @Override
    public String toString() {
        return "Docent{" +
                "id=" + id +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", onderdeel='" + onderdeel + '\'' +
                ", in dienst datum='" + datumIndienst + '\'' +
                '}';
    }
}

