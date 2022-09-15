package no.hvl.dat250.jpa.assignment2.driver;

import no.hvl.dat250.jpa.assignment2.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        Person person = new Person();
        person.setName("Max Mustermann");

        Address address = new Address();
        address.setStreet("Inndalsveien");
        address.setNumber(28);

        Pincode pincode = new Pincode();
        pincode.setPincode("123");
        pincode.setCount(1);

        CreditCard firstCard = new CreditCard();
        firstCard.setNumber(12345);
        firstCard.setBalance(-5000);
        firstCard.setLimit(-10000);

        firstCard.setPincode(pincode);

        CreditCard secondCard = new CreditCard();
        secondCard.setNumber(123);
        secondCard.setBalance(1);
        secondCard.setLimit(2000);

        secondCard.setPincode(pincode);

        Bank bank = new Bank();
        bank.setName("Pengebank");

        Set<Person> owners = new HashSet<>();
        owners.add(person);

        address.setOwners(owners);

        Set<Address> addresses = new HashSet<>();
        addresses.add(address);
        person.setAddresses(addresses);

        Set<CreditCard> creditCards = new HashSet<>();
        creditCards.add(firstCard);
        creditCards.add(secondCard);
        person.setCreditCards(creditCards);

        firstCard.setPincode(pincode);
        secondCard.setPincode(pincode);

        firstCard.setOwningBank(bank);
        secondCard.setOwningBank(bank);

        bank.setOwnedCards(creditCards);

        em.getTransaction().begin();

        em.persist(person);
        em.persist(address);
        em.persist(firstCard);
        em.persist(secondCard);
        em.persist(pincode);
        em.persist(bank);

        em.getTransaction().commit();

        em.close();
    }
}
