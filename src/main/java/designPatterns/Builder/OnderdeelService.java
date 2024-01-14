package designPatterns.Builder;

import configuration.JPAConfiguration;

import java.util.List;

public class OnderdeelService {

    private final OnderdeelRepository repository;

    public OnderdeelService() {this.repository = new OnderdeelRepository(JPAConfiguration.getEntityManager());}


    static JPAConfiguration jpaConfiguration = new JPAConfiguration();
    private static OnderdeelRepository onderdeelRepository = new OnderdeelRepository(jpaConfiguration.getEntityManager());

    public static List<Onderdeel> findAllSubjects() {return onderdeelRepository.getSubjects();}

//    public Onderdeel createOnderdeel(Onderdeel onderdeel) {return onderdeelRepository.createOnderdeel(onderdeel);}


    public Onderdeel getOnderdeelByName(String naam){ return repository.getOnderdeelByName(naam);}

    public Onderdeel insertOnderdeel(Onderdeel onderdeel) {return repository.insertOnderdeel(onderdeel);}

    public int deleteOnderdeelByNaam(String naam){ return repository.deleteOnderdeelByName(naam);}

    public Onderdeel selectSpecificOnderdeel(String naam){return repository.getOnderdeelByName(naam);}


}
