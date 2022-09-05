package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getName() {
        // TODO: implement method!
        return null;
    }

    public Collection<Address> getAddresses() {
        // TODO: implement method!
        return null;
    }

    public Collection<CreditCard> getCreditCards() {
        // TODO: implement method!
        return null;
    }
}
