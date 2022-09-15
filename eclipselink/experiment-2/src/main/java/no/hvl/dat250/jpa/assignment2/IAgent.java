package no.hvl.dat250.jpa.assignment2;

import org.apache.derby.catalog.UUID;

public interface IAgent {

    public void getAllPolls();

    public void getPoll(UUID pollid);

    public int getTotalVoteCount(UUID user);


}
