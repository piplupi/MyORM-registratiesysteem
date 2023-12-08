package service;

import entity.*;
import configuration.JPAConfiguration;
import jakarta.persistence.EntityManager;
import repository.OnderdeelRepository;

public class OnderdeelService {

    private final OnderdeelRepository repository;

    public OnderdeelService() {
        this.repository = new OnderdeelRepository(JPAConfiguration.getEntityManager());
    }

    public Onderdeel insertOnderdeel(Onderdeel onderdeel) {return repository.createOnderdeel(onderdeel);}


}
