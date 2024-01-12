package designPatterns.builder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class NewOnderdeelBuilder {

    private EntityManager entityManager;

    public NewOnderdeelBuilder(EntityManager entityManager) {
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
    public List<Onderdeel> getSubjects() {
        startTransaction();
        String jpql = "SELECT o from Onderdeel o";
        TypedQuery<Onderdeel> query = entityManager.createQuery(jpql, Onderdeel.class);
        List<Onderdeel> onderdeelList = query.getResultList();
        return onderdeelList;
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


    // DELETE
    public void deleteOnderdeel(Onderdeel onderdeelId) {
        startTransaction();
        Onderdeel subject = entityManager.find(Onderdeel.class, onderdeelId.getOnderdeel());
        entityManager.remove(subject);
        entityManager.getTransaction().commit();
    }


}
