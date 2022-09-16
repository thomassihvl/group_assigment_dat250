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

        // Create new User with role Admin
        User admin = new User();
        admin.setRole(Role.ADMIN);
        admin.setUsername("BingBongFYL");
        admin.setOwnedPublicPolls(new HashSet<PublicPoll>());
        admin.setOwnedPrivatePolls(new HashSet<PrivatePoll>());

        // Create new User with role User which owns both polls
        User user = new User();
        user.setRole(Role.USER);
        user.setUsername("BingBongFML");
        user.setOwnedPrivatePolls(new HashSet<PrivatePoll>(
                Arrays.asList(privatePoll)
        ));
        user.setOwnedPublicPolls(new HashSet<PublicPoll>(
                Arrays.asList(publicPoll)
        ));


        // Public Poll setup
        publicPoll.setPollQuestion("Is this really a Public Poll?");
        publicPoll.setYesCounter(2);
        publicPoll.setNoCounter(2);
        publicPoll.setStatus(Status.ACTIVE);
        publicPoll.setStartTime(LocalDateTime.now());
        publicPoll.setEndTime(LocalDateTime.now());
        publicPoll.setUser(user);
        publicPoll.setTotalCount(publicPoll.getNoCounter()+ publicPoll.getYesCounter());

        // Private Poll setup
        privatePoll.setPollQuestion("Is this really a Private Poll?");
        privatePoll.setYesCounter(2);
        privatePoll.setNoCounter(2);
        privatePoll.setStatus(Status.ACTIVE);
        privatePoll.setStartTime(LocalDateTime.now());
        privatePoll.setEndTime(LocalDateTime.now());
        privatePoll.setUser(user);
        privatePoll.setTotalCount(publicPoll.getNoCounter()+ publicPoll.getYesCounter());
        Map<Long, Boolean> voters = new HashMap<Long, Boolean>();
        voters.put(user.getID(), false);
        voters.put(admin.getID(), true);
        privatePoll.setVotes(voters);



        // Begin transaction
        em.getTransaction().begin();
        
        // Persist objects
        em.persist(user);
        em.persist(admin);
        em.persist(privatePoll);
        em.persist(publicPoll);


        em.getTransaction().commit();
        
        // Retrieve persisted objects from db and print
        pObjectRetriever or = new pObjectRetriever();
        
        List<String> classNames = new ArrayList<String>(
                List.of(
                        "User",
                        "PrivatePoll",
                        "PublicPoll"
                    )
                );
        
        for (String className : classNames) {
        	or.printFromDB(em, className);
        }

        em.close();
    }
}
