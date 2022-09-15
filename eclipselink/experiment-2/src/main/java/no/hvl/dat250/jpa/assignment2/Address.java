package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getStreet() {
        // TODO: implement method!
        return null;
    }

    public Integer getNumber() {
        // TODO: implement method!
        return null;
    }

    public Set<Person> getOwners() {
        // TODO: implement method!
        return null;
    }
}
