package no.hvl.dat250.jpa.assignment2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@DiscriminatorValue("ADMIN")
public class Admin {// extends Agent{
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
