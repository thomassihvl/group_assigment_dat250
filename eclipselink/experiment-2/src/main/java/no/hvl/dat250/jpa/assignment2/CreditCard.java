package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public int getNumber() {
        // TODO: implement method!
        return 0;
    }

    public String getBalance() {
        // TODO: implement method!
        return null;
    }

    public String getLimit() {
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
