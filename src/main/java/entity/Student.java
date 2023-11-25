package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String voornaam;

    @Column(nullable = false)
    private String achternaam;

    @Column(nullable = false, unique = true)
    private String studentID;

// Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getStudentID() { return studentID;}

    public void setStudentID(String studentID) { this.studentID = studentID;}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }

}
