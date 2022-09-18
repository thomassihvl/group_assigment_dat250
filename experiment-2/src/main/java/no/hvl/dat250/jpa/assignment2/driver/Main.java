package no.hvl.dat250.jpa.assignment2.driver;

import java.time.LocalDateTime;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import no.hvl.dat250.jpa.assignment2.*;
import org.eclipse.persistence.jpa.jpql.parser.NewValueBNF;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";
    
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        // Create new Poll type Public
        PublicPoll publicPoll = new PublicPoll();

        // Create new Poll typ Private
        PrivatePoll privatePoll = new PrivatePoll();

        // Create new Agent with role Admin
        Admin admin = new Admin();
        admin.setUsername("BingBongFYL");

        // Create new Agent with role Agent which owns both polls
        Consumer consumer = new Consumer();
        consumer.setUsername("BingBongFML");
        consumer.setOwnedPrivatePolls(new HashSet<PrivatePoll>(
                Arrays.asList(privatePoll)
        ));
        consumer.setOwnedPublicPolls(new HashSet<PublicPoll>(
                Arrays.asList(publicPoll)
        ));


        // Public Poll setup
        publicPoll.setPollQuestion("Is this really a Public Poll?");
        publicPoll.setYesCounter(2);
        publicPoll.setNoCounter(2);
        publicPoll.setStatus(Status.ACTIVE);
        publicPoll.setStartTime(LocalDateTime.now());
        publicPoll.setEndTime(LocalDateTime.now());
        publicPoll.setConsumer(consumer);
        publicPoll.setTotalCount(publicPoll.getNoCounter()+ publicPoll.getYesCounter());

        // Private Poll setup
        privatePoll.setPollQuestion("Is this really a Private Poll?");
        privatePoll.setYesCounter(2);
        privatePoll.setNoCounter(2);
        privatePoll.setStatus(Status.ACTIVE);
        privatePoll.setStartTime(LocalDateTime.now());
        privatePoll.setEndTime(LocalDateTime.now());
        privatePoll.setConsumer(consumer);
        privatePoll.setTotalCount(publicPoll.getNoCounter()+ publicPoll.getYesCounter());
        Map<String, Boolean> voters = new HashMap<String, Boolean>();
        voters.put(consumer.getUsername(), false);
        //voters.put(admin.getUsername(), true);
        privatePoll.setVotes(voters);



        // Begin transaction
        em.getTransaction().begin();
        
        // Persist objects
        em.persist(consumer);
        em.persist(privatePoll);
        em.persist(publicPoll);

        em.persist(admin);

        //em.getTransaction();
        em.getTransaction().commit();


        /*
        // Retrieve persisted objects from db and print
        pObjectRetriever or = new pObjectRetriever();
        
        List<String> classNames = new ArrayList<String>(
                List.of(
                        "Agent",
                        "PrivatePoll",
                        "PublicPoll"
                    )
                );
        
        for (String className : classNames) {
        	or.printFromDB(em, className);
        }

        em.close();

         */
    }
}
