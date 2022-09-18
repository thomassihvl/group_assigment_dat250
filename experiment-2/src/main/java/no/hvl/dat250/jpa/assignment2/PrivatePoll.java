package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@DiscriminatorValue("PRIVATE")
public class PrivatePoll extends Poll {
    // Votes is a map with allowed agents as key and whether they have voted as value
    @ElementCollection(fetch=FetchType.LAZY)
    @CollectionTable(name="Vote")
    @MapKeyColumn(name="agent_id")
    @Column(name="hasVoted")
    private Map<String, Boolean> votes;

    public Map<String, Boolean> getVotes() {
        return votes;
    }

    public void setVotes(Map<String, Boolean> votes) {
        this.votes = votes;
    }

}
