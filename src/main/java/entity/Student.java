package entity;

import designPatterns.Builder.Onderdeel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int student_id;

    @Column
    private String voornaam;

    @Column
    private String achternaam;

    @OneToOne
    private StudentDetail studentDetail;

    @OneToOne
    private Onderdeel onderdeelInfo;

    @ManyToMany
    @JoinTable(name = "student_onderdeel",
            joinColumns = { @JoinColumn(name = "fk_student") },
            inverseJoinColumns = { @JoinColumn(name = "fk_onderdeel")} )
    private List<Onderdeel> onderdelen = new ArrayList<>();


// Getters and setters

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int id) {
        this.student_id = id;
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

    public StudentDetail getStudentDetail() {
        return studentDetail;
    }

    public void setStudentDetail(StudentDetail studentDetail) {
        this.studentDetail = studentDetail;
    }

    public Onderdeel getOnderdeelInfo() {
        return onderdeelInfo;
    }

    public void setOnderdeelInfo(Onderdeel onderdeelInfo) {
        this.onderdeelInfo = onderdeelInfo;
    }


    public void setStudentDetail(String s) {
    }

    public void setOnderdeelInfo(String s) {
    }

    public List<Onderdeel> getOnderdelen() {return onderdelen;}

    public void setOnderdelen(List<Onderdeel> onderdelen) {this.onderdelen = onderdelen;}
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + student_id +
                ", Voornaam='" + voornaam + '\'' +
                ", Achternaam='" + achternaam + '\'' +
                ", StudentDetails='" + studentDetail + '\'' +
                ", Onderdeel='" + onderdeelInfo + '\'' +
                '}';
    }



}
