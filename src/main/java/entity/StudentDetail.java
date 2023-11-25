package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class StudentDetail {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String enrolledDate;

    @Column(nullable = false)
    private String adress;

    @Column(nullable = false)
    private String telefoonnummer;

    @Column(nullable = false)
    private String geboorteDatum;

// Getters and setters
public int getId() { return id;}

    public void setId(int id) { this.id = id;}

    public String getEnrolledDate() {return enrolledDate;}

    public void setEnrolledDate(String enrolledDate) {this.enrolledDate = enrolledDate;}

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelefoonnummer() { return telefoonnummer;}

    public void setTelefoonnummer(String telefoonnummer) { this.telefoonnummer = telefoonnummer; }

    public String getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(String geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

}
