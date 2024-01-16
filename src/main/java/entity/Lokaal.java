package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Lokaal {

    @Id
    @GeneratedValue
    private int lokaal_id;

    @Column
    private String lokaalNaam;


    // Getters and setters
    public int getLokaal_id() {return lokaal_id;}
    public void setLokaal_id(int id) {this.lokaal_id = id;}

    public String getLokaalNaam() {return lokaalNaam;}

    public void setLokaalNaam(String naam) {
        this.lokaalNaam = lokaalNaam;
    }



    @Override
    public String toString() {
        return "Lokaal{" +
                "ID=" + lokaal_id +
                ", Lokaal Naam='" + lokaalNaam + '\'' +
                '}';
    }

}
