package service;

import configuration.JPAConfiguration;
import entity.Docent;
import repository.DocentRepository;

import java.util.List;

public class DocentService {

    private final DocentRepository repository;

    public DocentService() {
        this.repository = new DocentRepository(JPAConfiguration.getEntityManager());
    }

    public Docent insertDocent(Docent docent) {
        return repository.createDocent(docent);
    }

    public List<Docent> getAllDocenten() {
        return repository.getDocenten();
    }



}
