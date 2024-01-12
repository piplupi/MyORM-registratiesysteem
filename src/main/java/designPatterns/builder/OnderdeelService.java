package designPatterns.builder;

import configuration.JPAConfiguration;

import java.util.List;

public class OnderdeelService {

    private final NewOnderdeelBuilder repository;

    public OnderdeelService() {
        this.repository = new NewOnderdeelBuilder(JPAConfiguration.getEntityManager());
    }

    public Onderdeel insertOnderdeel(Onderdeel onderdeel) {return repository.createOnderdeel(onderdeel);}


    JPAConfiguration jpaConfiguration = new JPAConfiguration();
    private NewOnderdeelBuilder newOnderdeelBuilder = new NewOnderdeelBuilder(jpaConfiguration.getEntityManager());

    public List<Onderdeel> findAllSubjects() {
        return newOnderdeelBuilder.getSubjects();
    }

    public Onderdeel createOnderdeel(Onderdeel onderdeel) {return newOnderdeelBuilder.createOnderdeel(onderdeel);
    }

    public void deleteOnderdeel(Onderdeel onderdeeId) {
        if (onderdeeId != null) {
            newOnderdeelBuilder.deleteOnderdeel(onderdeeId);
        }
    }


}
