package repository;

import entity.Docent;
import entity.Student;
import entity.StudentDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

import static configuration.JPAConfiguration.entityManager;

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

    // DELETE Student + referenced object
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

}
