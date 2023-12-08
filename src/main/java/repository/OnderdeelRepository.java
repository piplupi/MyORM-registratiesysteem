package repository;

import entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

import static configuration.JPAConfiguration.entityManager;

public class OnderdeelRepository {

    private EntityManager entityManager;

    public OnderdeelRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // CREATE
    public Onderdeel createOnderdeel(Onderdeel addOnderdeel) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(addOnderdeel);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addOnderdeel;
    }

}
