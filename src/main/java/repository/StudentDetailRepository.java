package repository;

import entity.StudentDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

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

    // DELETE Docent
    public void deletestudentDetail(StudentDetail studentDetail) {
        try {
            entityManager.getTransaction().begin();
            System.out.println("Student record: " + studentDetail.getDetails_id() + " " + "has been deleted.");
            entityManager.remove(studentDetail);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }


    }

    public int updateStudentDetailAdres(String adres, int studentId){
        int rowsUpdated;
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE StudentDetail sd SET sd.adress = :adres " +
                "where sd.id = :id ");
        query.setParameter("adres", adres);
        query.setParameter("id", studentId);
        rowsUpdated = query.executeUpdate();
        entityManager.getTransaction().commit();

        return rowsUpdated;
    }

    public int updateStudentDetailTelno(String tel, int studentId){
        int rowsUpdated;
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE StudentDetail sd SET sd.telefoonnummer = :telno " +
                "where sd.id = :id ");
        query.setParameter("telno", tel);
        query.setParameter("id", studentId);
        rowsUpdated = query.executeUpdate();
        entityManager.getTransaction().commit();

        return rowsUpdated;
    }

}
