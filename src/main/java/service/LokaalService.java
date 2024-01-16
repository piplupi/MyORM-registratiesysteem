package service;

import configuration.JPAConfiguration;
import entity.Lokaal;
import repository.LokaalRepository;

import java.util.List;

public class LokaalService {

    private final LokaalRepository repository;

    public LokaalService() {this.repository = new LokaalRepository(JPAConfiguration.getEntityManager());}


    static JPAConfiguration jpaConfiguration = new JPAConfiguration();
    private static LokaalRepository lokaalRepository = new LokaalRepository(jpaConfiguration.getEntityManager());

    public static List<Lokaal> findAllClasses() {return lokaalRepository.getLokalen();}


    public Lokaal insertLokaal(Lokaal lokaal) {return repository.insertLokaal(lokaal);}





}
