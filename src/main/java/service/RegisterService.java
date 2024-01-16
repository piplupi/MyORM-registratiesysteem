package service;


import designPatterns.Builder.Onderdeel;
import designPatterns.Builder.OnderdeelService;
import entity.Docent;
import entity.Lokaal;
import entity.Student;
import entity.StudentDetail;


public class RegisterService {
    private static StudentService studentService = new StudentService();
    private static StudentDetailService studentDetailService = new StudentDetailService();
    private static OnderdeelService onderdeelService = new OnderdeelService();
    private static DocentService docentService = new DocentService();
private static LokaalService lokaalService = new LokaalService();

    public void regStudentenAndDetails() {
        Student student1 = new Student();
        student1.setVoornaam("Megumi");
        student1.setAchternaam("Fushiguro");
        student1.setStudentDetail("2");
        student1.setOnderdeelInfo("1");

        StudentDetail detailSt1 = new StudentDetail();
        detailSt1.setInschrijfDatum("07-10-2019");
        detailSt1.setAdress("eenstraat #3");
        detailSt1.setTelefoonnummer("12345");
        detailSt1.setStudentEmail("M.Fushiguro@gmail.com");
        detailSt1.setGeboorteDatum("16-07-2009");

        studentDetailService.createStudentDetail(detailSt1);
        student1.setStudentDetail(detailSt1);
        studentService.insertStudent(student1);
        //--------------------------------------------------
        Student student2 = new Student();
        student2.setVoornaam("Itadori");
        student2.setAchternaam("Yuji");
        student2.setStudentDetail("2");
        student2.setOnderdeelInfo("2");

        StudentDetail detailSt2 = new StudentDetail();
        detailSt2.setInschrijfDatum("07-10-2019");
        detailSt2.setAdress("Zwaanstraat #3");
        detailSt2.setTelefoonnummer("678910");
        detailSt2.setStudentEmail("I.Yuji@gmail.com");
        detailSt2.setGeboorteDatum("16-07-2009");

        studentDetailService.createStudentDetail(detailSt2);
        student2.setStudentDetail(detailSt2);
        studentService.insertStudent(student2);
        //--------------------------------------------------
        Student student3 = new Student();
        student3.setVoornaam("Nobara");
        student3.setAchternaam("kugisaki");
        student3.setStudentDetail("3");
        student3.setOnderdeelInfo("3");

        StudentDetail detailSt3 = new StudentDetail();
        detailSt3.setInschrijfDatum("07-10-2019");
        detailSt3.setAdress("Flustraat #3");
        detailSt3.setTelefoonnummer("895683");
        detailSt3.setStudentEmail("N.Kugisaki@gmail.com");
        detailSt3.setGeboorteDatum("16-07-2001");

        studentDetailService.createStudentDetail(detailSt3);
        student3.setStudentDetail(detailSt3);
        studentService.insertStudent(student3);
    }

    public void regDocenten() {
        Docent docent1 = new Docent();
        docent1.setvoornaam("Suguru");
        docent1.setachternaam("Geto");
        docent1.setDocentEmail("S.Geto@gmail.com");
        docent1.setDatumIndienst("04-23-2018");
        docent1.setOnderdeel("1");
        docentService.insertDocent(docent1);
        //--------------------------------------------------
        Docent docent2 = new Docent();
        docent2.setvoornaam("Satoru");
        docent2.setachternaam("Gojo");
        docent2.setDocentEmail("S.Gojo@gmail.com");
        docent2.setDatumIndienst("04-23-2018");
        docent2.setOnderdeel("2");
        docentService.insertDocent(docent2);
        //--------------------------------------------------
        Docent docent3 = new Docent();
        docent3.setvoornaam("Kento");
        docent3.setachternaam("Nanami");
        docent3.setDocentEmail("K.Nanami@gmail.com");
        docent3.setDatumIndienst("03-22-2017");
        docent3.setOnderdeel("3");
        docentService.insertDocent(docent3);
        //--------------------------------------------------
        Docent docent4 = new Docent();
        docent4.setvoornaam("Koro");
        docent4.setachternaam("Sensei");
        docent4.setDocentEmail("K.Sensei@gmail.com");
        docent4.setDatumIndienst("11-18-2015");
        docent4.setOnderdeel("4");
        docentService.insertDocent(docent4);
    }

    public void regOnderdelen() {
        Onderdeel onderdeel1 = new Onderdeel();
        onderdeel1.setNaam("Kickbox");
        onderdeel1.setOnderdeel_prijs("SRD100");
        onderdeelService.insertOnderdeel(onderdeel1);
        //--------------------------------------------------
        Onderdeel onderdeel2 = new Onderdeel();
        onderdeel2.setNaam("Yoga");
        onderdeel2.setOnderdeel_prijs("SRD150");
        onderdeelService.insertOnderdeel(onderdeel2);
        //--------------------------------------------------
        Onderdeel onderdeel3 = new Onderdeel();
        onderdeel3.setNaam("Thaibox");
        onderdeel3.setOnderdeel_prijs("SRD100");
        onderdeelService.insertOnderdeel(onderdeel3);
        //--------------------------------------------------
        Onderdeel onderdeel4 = new Onderdeel();
        onderdeel4.setNaam("JiuJitsu");
        onderdeel4.setOnderdeel_prijs("SRD150");
        onderdeelService.insertOnderdeel(onderdeel4);
    }

    public void regLokalen() {
        Lokaal lokaal1 = new Lokaal();
        lokaal1.setLokaalNaam("1A");
        lokaalService.insertLokaal(lokaal1);
        //--------------------------------------------------
        Lokaal lokaal2 = new Lokaal();
        lokaal2.setLokaalNaam("1B");
        lokaalService.insertLokaal(lokaal2);
        //--------------------------------------------------
        Lokaal lokaal3 = new Lokaal();
        lokaal3.setLokaalNaam("1C");
        lokaalService.insertLokaal(lokaal3);
        //--------------------------------------------------
        Lokaal lokaal4 = new Lokaal();
        lokaal4.setLokaalNaam("1D");
        lokaalService.insertLokaal(lokaal4);
    }

}
