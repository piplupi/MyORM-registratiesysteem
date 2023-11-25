package repository;

import entity.Docent;
import entity.Student;
import entity.StudentDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DocentRepository {

    private EntityManager entityManager;

    public DocentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // CREATE
    public Docent createDocent(Docent addDocent) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(addDocent);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addDocent;
    }

    // READ-ALL
    public List<Docent> getDocenten() {
        String query = "select d from Docent d";
        TypedQuery<Docent> typedQuery = entityManager.createQuery(query, Docent.class);
        List<Docent> docentList = typedQuery.getResultList();
        return docentList;
    }

    // READ or GET 1 RECORD BY ID
    public Docent getDocentById(int docentId) {
        Query query = entityManager.createQuery("select d from Docent d where d.id = :id");
        query.setParameter("ID", docentId);
        Docent result = (Docent) query.getSingleResult();

        return result;
    }

}
