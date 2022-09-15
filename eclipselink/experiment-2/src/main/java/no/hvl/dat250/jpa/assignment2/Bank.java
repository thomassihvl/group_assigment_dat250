package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public String getName() {
        // TODO: implement method!
        return null;
    }

    public Set<CreditCard> getOwnedCards() {
        // TODO: implement method!
        return null;
    }
}
