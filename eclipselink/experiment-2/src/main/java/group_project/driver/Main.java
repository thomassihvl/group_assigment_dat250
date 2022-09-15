package group_project.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import group_project.*;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        Poll poll = new Poll();
        poll.setPollQuestion("Are we stupid?");

        User user = new User();
        user.setUsername("Bob_Leif69");
        //user.vote(poll, Vote.YES);

        em.getTransaction().begin();

        em.persist(poll);
        em.persist(user);

        em.getTransaction().commit();
        em.close();

    }
}
