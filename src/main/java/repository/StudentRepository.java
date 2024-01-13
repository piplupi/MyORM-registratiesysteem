package repository;

import designPatterns.builder.Onderdeel;
import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class StudentRepository {

    private EntityManager entityManager;

    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // CREATE
    public Student createStudent(Student addStudent) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(addStudent);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addStudent;
    }

    //GET STUDENT
    public Student getStudentByName(String studentVoornaam, String studentAchternaam) {
        Query query = entityManager.createQuery("select s from Student s where s.voornaam = :voornaam " +
                "and s.achternaam = :achternaam");
        query.setParameter("voornaam", studentVoornaam);
        query.setParameter("achternaam", studentAchternaam);
        Student result = (Student) query.getSingleResult();

        return result;
    }


    // READ-ALL
    public List<Student> getStudenten() {
        String query = "select s from Student s";
        TypedQuery<Student> typedQuery = entityManager.createQuery(query, Student.class);
        List<Student> studentList = typedQuery.getResultList();
        return studentList;
    }


    // DELETE ALL
    public int deleteAllStudents() {
        int rowsDeleted;
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("DELETE from Student s");
        rowsDeleted = query.executeUpdate();
        System.out.println("Records deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }

    // DELETE Student
    public void deleteStudent(Student student) {
        try {
            entityManager.getTransaction().begin();
            System.out.println("Student record: " + student.getVoornaam() + " " +
                    student.getAchternaam() + " " + "has been deleted.");
            entityManager.remove(student);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public int deleteStudentByName(String studentVoornaam, String studentAchternaam){
        int rowsDeleted;
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Student s where s.voornaam = :voornaam " +
                "and s.achternaam = :achternaam");
        query.setParameter("voornaam", studentVoornaam);
        query.setParameter("achternaam", studentAchternaam);
        rowsDeleted = query.executeUpdate();
        System.out.println("Records deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;

    }


    public List<Onderdeel> getStudentOnderdeel(String voornaam, String achternaam){
        Query query = entityManager.createQuery("select s.onderdeelInfo from Student s where s.voornaam = :voornaam " +
                "and s.achternaam = :achternaam");
        query.setParameter("voornaam", voornaam);
        query.setParameter("achternaam", achternaam);
        List<Onderdeel> result = (List<Onderdeel>) query.getResultList();

        return result;
    }

}
