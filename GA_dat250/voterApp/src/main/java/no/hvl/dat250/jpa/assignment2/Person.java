package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY) // , targetEntity = Address.class-??
    private Set<Address> addresses;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = CreditCard.class)
    private Set<CreditCard> creditCards;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Set<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(Set<Address> addresses){
        this.addresses = addresses;
    }
    public Set<CreditCard> getCreditCards() {
        return creditCards;
    }
    public void setCreditCards(Set<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
