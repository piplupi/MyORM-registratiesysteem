package entity;

import jakarta.persistence.*;

@Entity
public class StudentDetail {

    @Id
    @GeneratedValue
    private int details_id;
    @Column
    private String inschrijfDatum;
    @Column
    private String adress;
    @Column
    private String telefoonnummer;
    @Column
    private String studentEmail;
    @Column
    private String geboorteDatum;
    @Column
    private double kosten;

    // Getters and setters
    public int getDetails_id() {
        return details_id;
    }

    public void setDetails_id(int id) {
        this.details_id = id;
    }

    public String getInschrijfDatum() {
        return inschrijfDatum;
    }

    public void setInschrijfDatum(String enrolledDate) {
        this.inschrijfDatum = enrolledDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(String geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }



    @Override
    public String toString() {
        return "StudentDetails{" +
                "ID=" + details_id +
                ", InschrijfDatum='" + inschrijfDatum + '\'' +
                ", Adress='" + adress + '\'' +
                ", Telefoonnummer='" + telefoonnummer + '\'' +
                ", StudentEmail='" + studentEmail + '\'' +
                ", GeboorteDatum='" + geboorteDatum + '\'' +
                '}';
    }

}
