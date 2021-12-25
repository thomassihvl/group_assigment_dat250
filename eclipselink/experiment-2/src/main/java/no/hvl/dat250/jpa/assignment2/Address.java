package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getStreet() {
        // TODO: implement method!
        return null;
    }

    public String getNumber() {
        // TODO: implement method!
        return null;
    }

    public String getOwners() {
        // TODO: implement method!
        return null;
    }
}
