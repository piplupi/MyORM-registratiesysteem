package designPatterns.Builder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Onderdeel {

    @Id
    @GeneratedValue
    private int onderdeel_id;

    @Column
    private String naam;

    @Column
    private String onderdeel_prijs;


// Getters and setters
    public int getId() {return onderdeel_id;}
    public void setId(int id) {this.onderdeel_id = id;}

    public String getNaam() {return naam;}

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOnderdeel_prijs() {
        return onderdeel_prijs;
    }

    public void setOnderdeel_prijs(String onderdeel_prijs) {
        this.onderdeel_prijs = onderdeel_prijs;
    }


    @Override
    public String toString() {
        return "Onderdeel{" +
                "ID=" + onderdeel_id +
                ", OnderdeelTitel='" + naam + '\'' +
                ", Prijs=" + onderdeel_prijs + '\'' +
                '}';
    }
}
