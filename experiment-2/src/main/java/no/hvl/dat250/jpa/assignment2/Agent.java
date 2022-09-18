package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="AGENT_TYPE")
public class Agent {
    /*
    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

     */

    // Classes Agent and Admin aggregated through the Single Table Strategy
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    // isAuthenticated shouldn't be persisted

    public Long getID() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}

