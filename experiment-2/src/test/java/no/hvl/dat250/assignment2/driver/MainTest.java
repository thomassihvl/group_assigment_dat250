package no.hvl.dat250.assignment2.driver;

import no.hvl.dat250.jpa.assignment2.*;
import no.hvl.dat250.jpa.assignment2.driver.Main;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.Optional;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    private EntityManagerFactory factory;

    @Before
    public void setUp() {
        factory = Persistence.createEntityManagerFactory(Main.PERSISTENCE_UNIT_NAME);
    }

    /**
     * Try to delete the db directory if you get SQL-Errors.
     */
    @Test
    public void testDomainModelPersistence() {
        // Run the main class to persist the objects.
        Main.main(new String[]{});

        EntityManager em = factory.createEntityManager();

        // Load consumer
        Consumer consumer = em.find(Consumer.class, 1L);

        // Test consumer data
        assertThat(consumer.getUsername(), is("BingBongFML"));

        // Test polls
        assertThat(consumer.getOwnedPrivatePolls().size(), is(1));
        assertThat(consumer.getOwnedPublicPolls().size(), is(1));


        // Test public polls
        PublicPoll publicPoll = em.find(PublicPoll.class, 3L);
        PrivatePoll privatePoll = em.find(PrivatePoll.class, 2L);

        assertThat(publicPoll.getTotalCount(), is(4));
        assertThat(publicPoll.getStatus(), is(Status.ACTIVE));
        assertThat(publicPoll.getConsumer(), is(consumer));

        assertThat(privatePoll.getPollQuestion(), is("Is this really a Private Poll?"));
        assertThat(privatePoll.getTotalCount(), is(4));
        assertThat(privatePoll.getStatus(), is(Status.ACTIVE));
        assertThat(privatePoll.getConsumer(), is(consumer));

    }
}