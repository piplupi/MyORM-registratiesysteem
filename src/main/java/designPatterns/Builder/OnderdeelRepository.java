package designPatterns.Builder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class OnderdeelRepository {

    private EntityManager entityManager;

    public OnderdeelRepository(EntityManager entityManager) {
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
    public Onderdeel insertOnderdeel(Onderdeel insertOnderdeel) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(insertOnderdeel);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return insertOnderdeel;
    }


    public Onderdeel getOnderdeelByName(String naam) {
        Query query = entityManager.createQuery("select o from Onderdeel o where o.naam = :naam ");
        query.setParameter("naam", naam);
        Onderdeel result = (Onderdeel) query.getSingleResult();

        return result;
    }

    public int deleteOnderdeelByName(String naam){
        int rowsDeleted;
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("DELETE from Onderdeel o WHERE o.onderdeel_id = :onderdeel");
        query.setParameter("naam", naam);
        rowsDeleted = query.executeUpdate();
        System.out.println("Records deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;

    }

}
