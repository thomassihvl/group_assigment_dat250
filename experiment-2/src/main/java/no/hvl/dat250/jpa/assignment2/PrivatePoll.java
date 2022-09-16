package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@DiscriminatorValue("PRIVATE")
public class PrivatePoll extends Poll {
    // Votes is a map with allowed users as key and whether they have voted as value
    @ElementCollection(fetch=FetchType.LAZY)
    @CollectionTable(name="Vote")
    @MapKeyColumn(name="user_id")
    @Column(name="hasVoted")
    private Map<Long, Boolean> votes;

    public Map<Long, Boolean> getVotes() {
        return votes;
    }

    public void setVotes(Map<Long, Boolean> votes) {
        this.votes = votes;
    }

}
