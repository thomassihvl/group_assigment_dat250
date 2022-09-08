package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public String getPincode() {
        // TODO: implement method!
        return null;
    }

    public Integer getCount() {
        // TODO: implement method!
        return null;
    }
}
