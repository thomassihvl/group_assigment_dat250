package group_project;

import org.apache.derby.catalog.UUID;

import java.util.List;

public interface IAgent {

    public List<Poll> getAllPolls();

    public Poll getPoll(UUID pollId);

    public int getTotalVoteCount(UUID user);


}
