package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class TrainingZaal {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String onderdeel;


    // Getters and setters

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}
    public String getOnderdeel() {
        return onderdeel;
    }

    public void setOnderdeel(String onderdeel) {
        this.onderdeel = onderdeel;
    }
}
