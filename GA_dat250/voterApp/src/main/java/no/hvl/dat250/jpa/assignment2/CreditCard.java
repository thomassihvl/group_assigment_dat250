package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int number;
    private int balance;
    @OneToOne(targetEntity = Pincode.class)
    private Pincode pincode;

    @ManyToOne(targetEntity = Bank.class)
    private Bank bank;

    private int limit;


    public int getNumber() {
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit){
        this.limit = limit;
    }
    public Pincode getPincode() {
        return pincode;
    }
    public void setPincode(Pincode pincode){
        this.pincode = pincode;
    }
    public Bank getOwningBank() {
        return bank;
    }
    public void setOwningBank(Bank bank){
        this.bank = bank;
    }
}
