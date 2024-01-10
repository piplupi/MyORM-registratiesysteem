package entity;

import jakarta.persistence.*;

@Entity
public class Onderdeel {

    @Id
    @GeneratedValue
    private int onderdeel_id;

    @Column
    private String onderdeel;

    @Column
    private String onderdeel_prijs;


// Getters and setters
    public int getId() {return onderdeel_id;}
    public void setId(int id) {this.onderdeel_id = id;}
    public String getOnderdeel() {
        return onderdeel;
    }
    public void setOnderdeel(String onderdeel) {
        this.onderdeel = onderdeel;
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
                ", OnderdeelTitel='" + onderdeel + '\'' +
                ", Prijs=" + onderdeel_prijs + '\'' +
                '}';
    }
}
