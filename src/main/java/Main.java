import repository.*;
import service.*;
import entity.*;

import javax.print.Doc;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        OnderdeelService onderdeelService = new OnderdeelService();
//        Onderdeel onderdeel1 = new Onderdeel();
//        onderdeel1.setOnderdeel("Kickbox");
//        onderdeelService.insertOnderdeel(onderdeel1);

//
        DocentService docentService = new DocentService();
        Docent docent1 = new Docent();
        docent1.setvoornaam("Suguru");
        docent1.setachternaam("Geto");
        docent1.setDatumIndienst("23-04-2018");
        docent1.setOnderdeel("1");
        docentService.insertDocent(docent1);
        //--------------------------------------------------
        Docent docent2 = new Docent();
        docent2.setvoornaam("Satoru");
        docent2.setachternaam("Gojo");
        docent2.setDatumIndienst("23-04-2018");
        docent2.setOnderdeel("2");
        docentService.insertDocent(docent2);
        //--------------------------------------------------
        Docent docent3 = new Docent();
        docent3.setvoornaam("Kento");
        docent3.setachternaam("Nanami");
        docent3.setDatumIndienst("22-03-2017");
        docent3.setOnderdeel("3");
        docentService.insertDocent(docent3);
        //--------------------------------------------------
        Docent docent4 = new Docent();
        docent4.setvoornaam("Koro");
        docent4.setachternaam("-Sensei");
        docent4.setDatumIndienst("18-11-2015");
        docent4.setOnderdeel("4");
        docentService.insertDocent(docent4);

        List<Docent> docenten = docentService.getAllDocenten();
        docenten.forEach(docent -> {
            System.out.println(" Voornaam = " + docent.getvoornaam() + " Achternaam = " +
                    docent.getachternaam() + " In dienst datum = " + docent.getDatumIndienst() +
                    " onderdeel = " + docent.getOnderdeel());
        });

        StudentService studentService = new StudentService();
        StudentDetailService studentDetailService = new StudentDetailService();
//
//        Student student1 = new Student();
//        student1.setVoornaam("Megumi");
//        student1.setAchternaam("Fushiguro");
//        student1.setStudentID("ET23");
//
//        StudentDetail detailSt1 = new StudentDetail();
//        detailSt1.setEnrolledDate("07-10-2019");
//        detailSt1.setAdress("eenstraat #3");
//        detailSt1.setTelefoonnummer("12345");
//        detailSt1.setGeboorteDatum("16-07-2009");
//
//        studentDetailService.createStudentDetail(detailSt1);
//        student1.setStudentDetail(detailSt1);
//        studentService.insertStudent(student1);
//        //--------------------------------------------------
//        Student student2 = new Student();
//        student2.setVoornaam("Itadori");
//        student2.setAchternaam("Yuji");
//        student2.setStudentID("BT24");
//
//        StudentDetail detailSt2 = new StudentDetail();
//        detailSt2.setEnrolledDate("07-10-2019");
//        detailSt2.setAdress("Zwaanstraat #3");
//        detailSt2.setTelefoonnummer("678910");
//        detailSt2.setGeboorteDatum("16-07-2002");
//
//        studentDetailService.createStudentDetail(detailSt2);
//        student2.setStudentDetail(detailSt2);
//        studentService.insertStudent(student2);
//        //--------------------------------------------------
//        Student student3 = new Student();
//        student3.setVoornaam("Nobara");
//        student3.setAchternaam("kugisaki");
//        student3.setStudentID("UY67");
//
//        StudentDetail detailSt3 = new StudentDetail();
//        detailSt3.setEnrolledDate("07-10-2019");
//        detailSt3.setAdress("Flustraat #3");
//        detailSt3.setTelefoonnummer("895683");
//        detailSt3.setGeboorteDatum("16-07-2001");
//
//        studentDetailService.createStudentDetail(detailSt3);
//        student3.setStudentDetail(detailSt3);
//        studentService.insertStudent(student3);
//        //--------------------------------------------------
//
//        List<Student> studenten = studentService.getAllStudents();
//        studenten.forEach(student -> {
//            System.out.println(" ID = " + student.getId() + " Voornaam = " +
//                    student.getVoornaam() + " Achternaam = " + student.getAchternaam() +
//                    " Student ID = " + student.getStudentID());
//        });
//
//        List<StudentDetail> studentDetailsList = studentDetailService.getAllStudentDetails();
//        studentDetailsList.forEach(studentDetails -> {
//            System.out.println(" ID = " + studentDetails.getId() + " EnrolledDate = " +
//                    studentDetails.getEnrolledDate() + " Adress = " + studentDetails.getAdress() +
//                    " Telefoonnummer = " + studentDetails.getTelefoonnummer() +
//                   " Geboorte Datum = " + studentDetails.getGeboorteDatum());
//        });




    }
}