package repository;

import entity.Student;
import entity.StudentDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.List;
import static configuration.JPAConfiguration.entityManager;
public class StudentDetailRepository {

    private EntityManager entityManager;

    public StudentDetailRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    // CREATE
    public StudentDetail createStudentDetail(StudentDetail addStudentDetail) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(addStudentDetail);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addStudentDetail;
    }

    // READ-ALL
    public List<StudentDetail> getstudentendetails() {
        String query = "select d from StudentDetail d";
        TypedQuery<StudentDetail> typedQuery = entityManager.createQuery(query, StudentDetail.class);
        List<StudentDetail> studentDetailList = typedQuery.getResultList();
        return studentDetailList;
    }



}
