package group_project;

import org.apache.derby.catalog.UUID;

import javax.persistence.*;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User implements IAgent{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private boolean isAuthenticated;
    @OneToMany
    private List<Poll> ownedPolls;

    public void setUsername(String username){
        this.username = username;
    }

    /*
    //public Poll createPoll(.....){}
    public void vote(Poll poll, Vote vote){
        poll.
    }
    */

    @Override
    public List<Poll> getAllPolls() {
        return null;
    }


    @Override
    public Poll getPoll(UUID pollid) {
        return null;
    }

    @Override
    public int getTotalVoteCount(UUID user) {
        return 0;
    }
}
