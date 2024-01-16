package repository;

import entity.Lokaal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class LokaalRepository {

    private EntityManager entityManager;

    public LokaalRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private void startTransaction() {
        if (entityManager.getTransaction() != null) {
            if (!entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().begin();
            } else {
                System.out.println("Entity manager is already active");
            }
        } else {
            System.out.println("Error something went wrong!");
        }
    }

    //Get ALL
    public List<Lokaal> getLokalen() {
        startTransaction();
        String jpql = "SELECT l from Lokaal l";
        TypedQuery<Lokaal> query = entityManager.createQuery(jpql, Lokaal.class);
        List<Lokaal> lokaalList = query.getResultList();
        return lokaalList;
    }

    // CREATE
    public Lokaal insertLokaal(Lokaal insertLokaal) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(insertLokaal);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return insertLokaal;
    }




}
