package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Integer getNumber() {
        // TODO: implement method!
        return null;
    }

    public Integer getBalance() {
        // TODO: implement method!
        return null;
    }

    public Integer getLimit() {
        // TODO: implement method!
        return null;
    }

    public Pincode getPincode() {
        // TODO: implement method!
        return null;
    }

    public Bank getOwningBank() {
        // TODO: implement method!
        return null;
    }
}
