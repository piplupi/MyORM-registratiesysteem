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
        String query = "select d from StudentDetail d";
        TypedQuery<Docent> typedQuery = entityManager.createQuery(query, Docent.class);
        List<Docent> docentList = typedQuery.getResultList();
        return docentList;
    }

    // DELETE Docent
    public void deleteDocent(Docent docent) {
        try {
            entityManager.getTransaction().begin();
            System.out.println("Docent record: " + docent.getDocent_id() + " " + "has been deleted.");
            entityManager.remove(docent);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }


    }
}

